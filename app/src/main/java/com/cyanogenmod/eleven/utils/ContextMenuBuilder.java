package com.cyanogenmod.eleven.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.support.v7.view.menu.MenuBuilder;
import android.util.EventLog;
import android.view.ContextMenu;
import android.view.View;

public class ContextMenuBuilder extends MenuBuilder implements ContextMenu {

    public ContextMenuBuilder(Context context) {
        super(context);
    }

    public ContextMenu setHeaderIcon(Drawable icon) {
        return (ContextMenu) super.setHeaderIconInt(icon);
    }

    public ContextMenu setHeaderIcon(int iconRes) {
        return (ContextMenu) super.setHeaderIconInt(iconRes);
    }

    public ContextMenu setHeaderTitle(CharSequence title) {
        return (ContextMenu) super.setHeaderTitleInt(title);
    }

    public ContextMenu setHeaderTitle(int titleRes) {
        return (ContextMenu) super.setHeaderTitleInt(titleRes);
    }

    public ContextMenu setHeaderView(View view) {
        return (ContextMenu) super.setHeaderViewInt(view);
    }

    /**
     * Shows this context menu, allowing the optional original view (and its
     * ancestors) to add items.
     *
     * @param originalView Optional, the original view that triggered the
     *                     context menu.
     * @param token        Optional, the window token that should be set on the context
     *                     menu's window.
     * @return If the context menu was shown, the {@link MenuDialogHelper} for
     * dismissing it. Otherwise, null.
     */
    public MenuDialogHelper show(View originalView, IBinder token) {
        if (originalView != null) {
            // Let relevant views and their populate context listeners populate
            // the context menu
            originalView.createContextMenu(this);
        }
        if (getVisibleItems().size() > 0) {
            EventLog.writeEvent(50001, 1);

            MenuDialogHelper helper = new MenuDialogHelper(this);
            helper.show(token);

            return helper;
        }

        return null;
    }

}