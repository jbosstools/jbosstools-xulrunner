/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/base/nsIDOMChromeWindow.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMChromeWindow extends nsISupports {

  String NS_IDOMCHROMEWINDOW_IID =
    "{09b86cbd-9784-4fe4-9be6-70b9bbca3a9c}";

  int STATE_MAXIMIZED = 1;

  int STATE_MINIMIZED = 2;

  int STATE_NORMAL = 3;

  int STATE_FULLSCREEN = 4;

  int getWindowState();

  /**
   * browserDOMWindow provides access to yet another layer of
   * utility functions implemented by chrome script. It will be null
   * for DOMWindows not corresponding to browsers.
   */
  nsIBrowserDOMWindow getBrowserDOMWindow();

  /**
   * browserDOMWindow provides access to yet another layer of
   * utility functions implemented by chrome script. It will be null
   * for DOMWindows not corresponding to browsers.
   */
  void setBrowserDOMWindow(nsIBrowserDOMWindow aBrowserDOMWindow);

  void getAttention();

  void getAttentionWithCycleCount(int aCycleCount);

  void setCursor(String cursor);

  void maximize();

  void minimize();

  void restore();

  /**
   * Notify a default button is loaded on a dialog or a wizard.
   * defaultButton is the default button.
   */
  void notifyDefaultButtonLoaded(nsIDOMElement defaultButton);

}