package com.cyanogenmod.eleven.utils;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.IBinder;
import android.support.v7.view.menu.ListMenuPresenter;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPresenter;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.cyanogenmod.eleven.R;


public class MenuDialogHelper implements DialogInterface.OnKeyListener,
        DialogInterface.OnClickListener,
        DialogInterface.OnDismissListener,
        MenuPresenter.Callback {
    ListMenuPresenter mPresenter;
    private MenuBuilder mMenu;
    private AlertDialog mDialog;
    private MenuPresenter.Callback mPresenterCallback;

    public MenuDialogHelper(MenuBuilder menu) {
        mMenu = menu;
    }

    /**
     * Shows menu as a dialog.
     *
     * @param windowToken Optional token to assign to the window.
     */
    public void show(IBinder windowToken) {
        // Many references to mMenu, create local reference
        final MenuBuilder menu = mMenu;

        // Get the builder for the dialog
        final AlertDialog.Builder builder = new AlertDialog.Builder(menu.getContext());
        mPresenter = new ListMenuPresenter(builder.getContext(),
                R.layout.list_menu_item_layout);
        mPresenter.setCallback(this);
        mMenu.addMenuPresenter(mPresenter);
        builder.setAdapter(mPresenter.getAdapter(), this);
        // Set the title
        final View headerView = menu.getHeaderView();
        if (headerView != null) {
            // Menu's client has given a custom header view, use it
            builder.setCustomTitle(headerView);
        } else {
            // Otherwise use the (text) title and icon
            builder.setIcon(menu.getHeaderIcon()).setTitle(menu.getHeaderTitle());
        }

        // Set the key listener
        builder.setOnKeyListener(this);

        // Show the menu
        mDialog = builder.create();
        mDialog.setOnDismissListener(this);

        WindowManager.LayoutParams lp = mDialog.getWindow().getAttributes();
        lp.type = WindowManager.LayoutParams.TYPE_APPLICATION_ATTACHED_DIALOG;
        if (windowToken != null) {
            lp.token = windowToken;
        }
        lp.flags |= WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM;

        mDialog.show();
    }

    public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_MENU || keyCode == KeyEvent.KEYCODE_BACK) {
            if (event.getAction() == KeyEvent.ACTION_DOWN
                    && event.getRepeatCount() == 0) {
                Window win = mDialog.getWindow();
                if (win != null) {
                    View decor = win.getDecorView();
                    if (decor != null) {
                        KeyEvent.DispatcherState ds = decor.getKeyDispatcherState();
                        if (ds != null) {
                            ds.startTracking(event, this);
                            return true;
                        }
                    }
                }
            } else if (event.getAction() == KeyEvent.ACTION_UP && !event.isCanceled()) {
                Window win = mDialog.getWindow();
                if (win != null) {
                    View decor = win.getDecorView();
                    if (decor != null) {
                        KeyEvent.DispatcherState ds = decor.getKeyDispatcherState();
                        if (ds != null && ds.isTracking(event)) {
                            mMenu.close(true);
                            dialog.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        // Menu shortcut matching
        return mMenu.performShortcut(keyCode, event, 0);
    }

    public void setPresenterCallback(MenuPresenter.Callback cb) {
        mPresenterCallback = cb;
    }

    /**
     * Dismisses the menu's dialog.
     *
     * @see Dialog#dismiss()
     */
    public void dismiss() {
        if (mDialog != null) {
            mDialog.dismiss();
        }
    }

    @Override
    public void onDismiss(DialogInterface dialog) {
        mPresenter.onCloseMenu(mMenu, true);
    }

    @Override
    public void onCloseMenu(MenuBuilder menu, boolean allMenusAreClosing) {
        if (allMenusAreClosing || menu == mMenu) {
            dismiss();
        }
        if (mPresenterCallback != null) {
            mPresenterCallback.onCloseMenu(menu, allMenusAreClosing);
        }
    }

    @Override
    public boolean onOpenSubMenu(MenuBuilder subMenu) {
        if (mPresenterCallback != null) {
            return mPresenterCallback.onOpenSubMenu(subMenu);
        }
        return false;
    }

    public void onClick(DialogInterface dialog, int which) {
        mMenu.performItemAction((MenuItemImpl) mPresenter.getAdapter().getItem(which), 0);
    }
}