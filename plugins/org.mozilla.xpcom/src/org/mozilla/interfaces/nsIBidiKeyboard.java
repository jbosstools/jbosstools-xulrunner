/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsIBidiKeyboard.idl
 */

package org.mozilla.interfaces;

public interface nsIBidiKeyboard extends nsISupports {

  String NS_IBIDIKEYBOARD_IID =
    "{0d8f8f10-c92d-4a6a-b2bb-e1921f3f4dda}";

  /**
   * Determines if the current keyboard language is right-to-left
   * @throws NS_ERROR_FAILURE if no right-to-left keyboards are installed
   */
  boolean isLangRTL();

  /**
   * Sets the keyboard language to left-to-right or right-to-left
   * @param aLevel - if odd set the keyboard to RTL, if even set LTR 
   * @throws NS_ERROR_FAILURE if no right-to-left keyboards are installed
   */
  void setLangFromBidiLevel(short aLevel);

}