/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpfe/appshell/public/nsIWindowMediatorListener.idl
 */

package org.mozilla.interfaces;

public interface nsIWindowMediatorListener extends nsISupports {

  String NS_IWINDOWMEDIATORLISTENER_IID =
    "{2f276982-0d60-4377-a595-d350ba516395}";

  void onWindowTitleChange(nsIXULWindow window, String newTitle);

  void onOpenWindow(nsIXULWindow window);

  void onCloseWindow(nsIXULWindow window);

}