/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsIClipboardHelper.idl
 */

package org.mozilla.interfaces;

/**
 * helper service for common uses of nsIClipboard.
 */
public interface nsIClipboardHelper extends nsISupports {

  String NS_ICLIPBOARDHELPER_IID =
    "{44073a98-1dd2-11b2-8600-d0ae854dbe93}";

  /**
   * copy string to given clipboard
   *
   * @param aString, the string to copy to the clipboard
   * @param aClipboardID, the ID of the clipboard to copy to
   *        (eg. kSelectionClipboard -- see nsIClipboard.idl)
   */
  void copyStringToClipboard(String aString, int aClipboardID);

  /**
   * copy string to (default) clipboard
   *
   * @param aString, the string to copy to the clipboard
   */
  void copyString(String aString);

}