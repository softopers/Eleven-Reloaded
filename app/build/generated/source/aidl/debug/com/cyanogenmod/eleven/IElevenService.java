/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Demos\\android_packages_apps_Eleven-stable-cm-13.0-ZNH5Y\\app\\src\\main\\aidl\\com\\cyanogenmod\\eleven\\IElevenService.aidl
 */
package com.cyanogenmod.eleven;
public interface IElevenService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.cyanogenmod.eleven.IElevenService
{
private static final java.lang.String DESCRIPTOR = "com.cyanogenmod.eleven.IElevenService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.cyanogenmod.eleven.IElevenService interface,
 * generating a proxy if needed.
 */
public static com.cyanogenmod.eleven.IElevenService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.cyanogenmod.eleven.IElevenService))) {
return ((com.cyanogenmod.eleven.IElevenService)iin);
}
return new com.cyanogenmod.eleven.IElevenService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_openFile:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.openFile(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_open:
{
data.enforceInterface(DESCRIPTOR);
long[] _arg0;
_arg0 = data.createLongArray();
int _arg1;
_arg1 = data.readInt();
long _arg2;
_arg2 = data.readLong();
int _arg3;
_arg3 = data.readInt();
this.open(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_stop:
{
data.enforceInterface(DESCRIPTOR);
this.stop();
reply.writeNoException();
return true;
}
case TRANSACTION_pause:
{
data.enforceInterface(DESCRIPTOR);
this.pause();
reply.writeNoException();
return true;
}
case TRANSACTION_play:
{
data.enforceInterface(DESCRIPTOR);
this.play();
reply.writeNoException();
return true;
}
case TRANSACTION_prev:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.prev(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_next:
{
data.enforceInterface(DESCRIPTOR);
this.next();
reply.writeNoException();
return true;
}
case TRANSACTION_enqueue:
{
data.enforceInterface(DESCRIPTOR);
long[] _arg0;
_arg0 = data.createLongArray();
int _arg1;
_arg1 = data.readInt();
long _arg2;
_arg2 = data.readLong();
int _arg3;
_arg3 = data.readInt();
this.enqueue(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_setQueuePosition:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setQueuePosition(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setShuffleMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setShuffleMode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setRepeatMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setRepeatMode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_moveQueueItem:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.moveQueueItem(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_refresh:
{
data.enforceInterface(DESCRIPTOR);
this.refresh();
reply.writeNoException();
return true;
}
case TRANSACTION_playlistChanged:
{
data.enforceInterface(DESCRIPTOR);
this.playlistChanged();
reply.writeNoException();
return true;
}
case TRANSACTION_isPlaying:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isPlaying();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getQueue:
{
data.enforceInterface(DESCRIPTOR);
long[] _result = this.getQueue();
reply.writeNoException();
reply.writeLongArray(_result);
return true;
}
case TRANSACTION_getQueueItemAtPosition:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
long _result = this.getQueueItemAtPosition(_arg0);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getQueueSize:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getQueueSize();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getQueuePosition:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getQueuePosition();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getQueueHistoryPosition:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getQueueHistoryPosition(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getQueueHistorySize:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getQueueHistorySize();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getQueueHistoryList:
{
data.enforceInterface(DESCRIPTOR);
int[] _result = this.getQueueHistoryList();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_duration:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.duration();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_position:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.position();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_seek:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
long _result = this.seek(_arg0);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_seekRelative:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.seekRelative(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getAudioId:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getAudioId();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getCurrentTrack:
{
data.enforceInterface(DESCRIPTOR);
com.cyanogenmod.eleven.service.MusicPlaybackTrack _result = this.getCurrentTrack();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getTrack:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
com.cyanogenmod.eleven.service.MusicPlaybackTrack _result = this.getTrack(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getNextAudioId:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getNextAudioId();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getPreviousAudioId:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getPreviousAudioId();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getArtistId:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getArtistId();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getAlbumId:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getAlbumId();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getArtistName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getArtistName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getTrackName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getTrackName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getAlbumName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getAlbumName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getPath:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getPath();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getShuffleMode:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getShuffleMode();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_removeTracks:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _result = this.removeTracks(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_removeTrack:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _result = this.removeTrack(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_removeTrackAtPosition:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.removeTrackAtPosition(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getRepeatMode:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getRepeatMode();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getMediaMountedCount:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getMediaMountedCount();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getAudioSessionId:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getAudioSessionId();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setShakeToPlayEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setShakeToPlayEnabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setLockscreenAlbumArt:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setLockscreenAlbumArt(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.cyanogenmod.eleven.IElevenService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void openFile(java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_openFile, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void open(long[] list, int position, long sourceId, int sourceType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLongArray(list);
_data.writeInt(position);
_data.writeLong(sourceId);
_data.writeInt(sourceType);
mRemote.transact(Stub.TRANSACTION_open, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stop() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stop, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void pause() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_pause, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void play() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_play, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void prev(boolean forcePrevious) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((forcePrevious)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_prev, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void next() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_next, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void enqueue(long[] list, int action, long sourceId, int sourceType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLongArray(list);
_data.writeInt(action);
_data.writeLong(sourceId);
_data.writeInt(sourceType);
mRemote.transact(Stub.TRANSACTION_enqueue, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setQueuePosition(int index) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
mRemote.transact(Stub.TRANSACTION_setQueuePosition, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setShuffleMode(int shufflemode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(shufflemode);
mRemote.transact(Stub.TRANSACTION_setShuffleMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setRepeatMode(int repeatmode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(repeatmode);
mRemote.transact(Stub.TRANSACTION_setRepeatMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void moveQueueItem(int from, int to) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(from);
_data.writeInt(to);
mRemote.transact(Stub.TRANSACTION_moveQueueItem, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void refresh() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_refresh, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void playlistChanged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_playlistChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isPlaying() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isPlaying, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long[] getQueue() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getQueue, _data, _reply, 0);
_reply.readException();
_result = _reply.createLongArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getQueueItemAtPosition(int position) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(position);
mRemote.transact(Stub.TRANSACTION_getQueueItemAtPosition, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getQueueSize() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getQueueSize, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getQueuePosition() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getQueuePosition, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getQueueHistoryPosition(int position) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(position);
mRemote.transact(Stub.TRANSACTION_getQueueHistoryPosition, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getQueueHistorySize() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getQueueHistorySize, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] getQueueHistoryList() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getQueueHistoryList, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long duration() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_duration, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long position() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_position, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long seek(long pos) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(pos);
mRemote.transact(Stub.TRANSACTION_seek, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void seekRelative(long deltaInMs) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(deltaInMs);
mRemote.transact(Stub.TRANSACTION_seekRelative, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public long getAudioId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAudioId, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.cyanogenmod.eleven.service.MusicPlaybackTrack getCurrentTrack() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.cyanogenmod.eleven.service.MusicPlaybackTrack _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentTrack, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.cyanogenmod.eleven.service.MusicPlaybackTrack.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.cyanogenmod.eleven.service.MusicPlaybackTrack getTrack(int index) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.cyanogenmod.eleven.service.MusicPlaybackTrack _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
mRemote.transact(Stub.TRANSACTION_getTrack, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.cyanogenmod.eleven.service.MusicPlaybackTrack.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getNextAudioId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNextAudioId, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getPreviousAudioId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPreviousAudioId, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getArtistId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getArtistId, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getAlbumId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAlbumId, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getArtistName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getArtistName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getTrackName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTrackName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getAlbumName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAlbumName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getPath() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPath, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getShuffleMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getShuffleMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int removeTracks(int first, int last) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(first);
_data.writeInt(last);
mRemote.transact(Stub.TRANSACTION_removeTracks, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int removeTrack(long id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(id);
mRemote.transact(Stub.TRANSACTION_removeTrack, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean removeTrackAtPosition(long id, int position) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(id);
_data.writeInt(position);
mRemote.transact(Stub.TRANSACTION_removeTrackAtPosition, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getRepeatMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRepeatMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getMediaMountedCount() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMediaMountedCount, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getAudioSessionId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAudioSessionId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setShakeToPlayEnabled(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setShakeToPlayEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setLockscreenAlbumArt(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setLockscreenAlbumArt, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_openFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_open = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_stop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_pause = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_play = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_prev = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_next = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_enqueue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setQueuePosition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setShuffleMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_setRepeatMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_moveQueueItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_refresh = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_playlistChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_isPlaying = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getQueue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_getQueueItemAtPosition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_getQueueSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getQueuePosition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_getQueueHistoryPosition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_getQueueHistorySize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_getQueueHistoryList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_duration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_position = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_seek = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_seekRelative = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_getAudioId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_getCurrentTrack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_getTrack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_getNextAudioId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_getPreviousAudioId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_getArtistId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_getAlbumId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_getArtistName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_getTrackName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_getAlbumName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_getPath = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_getShuffleMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_removeTracks = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_removeTrack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_removeTrackAtPosition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_getRepeatMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_getMediaMountedCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_getAudioSessionId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_setShakeToPlayEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
static final int TRANSACTION_setLockscreenAlbumArt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
}
public void openFile(java.lang.String path) throws android.os.RemoteException;
public void open(long[] list, int position, long sourceId, int sourceType) throws android.os.RemoteException;
public void stop() throws android.os.RemoteException;
public void pause() throws android.os.RemoteException;
public void play() throws android.os.RemoteException;
public void prev(boolean forcePrevious) throws android.os.RemoteException;
public void next() throws android.os.RemoteException;
public void enqueue(long[] list, int action, long sourceId, int sourceType) throws android.os.RemoteException;
public void setQueuePosition(int index) throws android.os.RemoteException;
public void setShuffleMode(int shufflemode) throws android.os.RemoteException;
public void setRepeatMode(int repeatmode) throws android.os.RemoteException;
public void moveQueueItem(int from, int to) throws android.os.RemoteException;
public void refresh() throws android.os.RemoteException;
public void playlistChanged() throws android.os.RemoteException;
public boolean isPlaying() throws android.os.RemoteException;
public long[] getQueue() throws android.os.RemoteException;
public long getQueueItemAtPosition(int position) throws android.os.RemoteException;
public int getQueueSize() throws android.os.RemoteException;
public int getQueuePosition() throws android.os.RemoteException;
public int getQueueHistoryPosition(int position) throws android.os.RemoteException;
public int getQueueHistorySize() throws android.os.RemoteException;
public int[] getQueueHistoryList() throws android.os.RemoteException;
public long duration() throws android.os.RemoteException;
public long position() throws android.os.RemoteException;
public long seek(long pos) throws android.os.RemoteException;
public void seekRelative(long deltaInMs) throws android.os.RemoteException;
public long getAudioId() throws android.os.RemoteException;
public com.cyanogenmod.eleven.service.MusicPlaybackTrack getCurrentTrack() throws android.os.RemoteException;
public com.cyanogenmod.eleven.service.MusicPlaybackTrack getTrack(int index) throws android.os.RemoteException;
public long getNextAudioId() throws android.os.RemoteException;
public long getPreviousAudioId() throws android.os.RemoteException;
public long getArtistId() throws android.os.RemoteException;
public long getAlbumId() throws android.os.RemoteException;
public java.lang.String getArtistName() throws android.os.RemoteException;
public java.lang.String getTrackName() throws android.os.RemoteException;
public java.lang.String getAlbumName() throws android.os.RemoteException;
public java.lang.String getPath() throws android.os.RemoteException;
public int getShuffleMode() throws android.os.RemoteException;
public int removeTracks(int first, int last) throws android.os.RemoteException;
public int removeTrack(long id) throws android.os.RemoteException;
public boolean removeTrackAtPosition(long id, int position) throws android.os.RemoteException;
public int getRepeatMode() throws android.os.RemoteException;
public int getMediaMountedCount() throws android.os.RemoteException;
public int getAudioSessionId() throws android.os.RemoteException;
public void setShakeToPlayEnabled(boolean enabled) throws android.os.RemoteException;
public void setLockscreenAlbumArt(boolean enabled) throws android.os.RemoteException;
}
