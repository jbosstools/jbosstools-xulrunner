/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpinstall/public/nsIXPIProgressDialog.idl
 */

package org.mozilla.interfaces;

/**
 * Interface to display XPInstall download and install status.
 *
 * @status UNDER_REVIEW
 */
public interface nsIXPIProgressDialog extends nsISupports {

  String NS_IXPIPROGRESSDIALOG_IID =
    "{ce8f744e-d5a5-41b3-911f-0fee3008b64e}";

  /**
     * state values for onStateChange
     */
  short DOWNLOAD_START = 0;

  short DOWNLOAD_DONE = 1;

  short INSTALL_START = 2;

  short INSTALL_DONE = 3;

  short DIALOG_CLOSE = 4;

  /**
     * basic info to control the install progress dialog. The dialog can
     * go away any time after it has received the DIALOG_CLOSE state message
     * but needs to accept messages until that time even if it is not visible.
     *
     * Normally for each install package the dialog will receive the download
     * and install messages in START/DONE pairs, but in the case of a download
     * error the dialog will be sent only the DOWNLOAD_START followed by an
     * INSTALL_DONE message with the value nsInstall::DOWNLOAD_ERROR
     *
     * @param index     the package this message is about of those passed into
     *                  openProgressDialog. ignored when state==DIALOG_CLOSE
     * @param state     the kind of message
     * @param value     final result when state==INSTALL_DONE, otherwise ignored
     */
  void onStateChange(long index, short state, int value);

  /**
     * download progress
     *
     * @param index     the package to which this refers
     * @param value     number of bytes downloaded
     * @param maxValue  the total size
     */
  void onProgress(long index, double value, double maxValue);

}