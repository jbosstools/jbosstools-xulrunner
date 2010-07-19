/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsIScreenManager.idl
 */

package org.mozilla.interfaces;

public interface nsIScreenManager extends nsISupports {

  String NS_ISCREENMANAGER_IID =
    "{b92319e6-9a84-4ca7-a2cc-eec22ea9854e}";

  nsIScreen screenForRect(int left, int top, int width, int height);

  nsIScreen getPrimaryScreen();

  long getNumberOfScreens();

}