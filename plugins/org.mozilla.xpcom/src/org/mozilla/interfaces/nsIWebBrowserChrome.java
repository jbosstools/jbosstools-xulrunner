/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/browser/webBrowser/nsIWebBrowserChrome.idl
 */

package org.mozilla.interfaces;

/**
 * nsIWebBrowserChrome corresponds to the top-level, outermost window
 * containing an embedded Gecko web browser.
 *
 * @status FROZEN
 */
public interface nsIWebBrowserChrome extends nsISupports {

  String NS_IWEBBROWSERCHROME_IID =
    "{ba434c60-9d52-11d3-afb0-00a024ffc08c}";

  long STATUS_SCRIPT = 1L;

  long STATUS_SCRIPT_DEFAULT = 2L;

  long STATUS_LINK = 3L;

  /**
     * Called when the status text in the chrome needs to be updated.
     * @param statusType indicates what is setting the text
     * @param status status string. null is an acceptable value meaning
     *               no status.
     */
  void setStatus(long statusType, String status);

  /**
     * The currently loaded WebBrowser.  The browser chrome may be
     * told to set the WebBrowser object to a new object by setting this
     * attribute.  In this case the implementer is responsible for taking the 
     * new WebBrowser object and doing any necessary initialization or setup 
     * as if it had created the WebBrowser itself.  This includes positioning
     * setting up listeners etc.
     */
  nsIWebBrowser getWebBrowser();

  /**
     * The currently loaded WebBrowser.  The browser chrome may be
     * told to set the WebBrowser object to a new object by setting this
     * attribute.  In this case the implementer is responsible for taking the 
     * new WebBrowser object and doing any necessary initialization or setup 
     * as if it had created the WebBrowser itself.  This includes positioning
     * setting up listeners etc.
     */
  void setWebBrowser(nsIWebBrowser aWebBrowser);

  /**
     * Definitions for the chrome flags
     */
  long CHROME_DEFAULT = 1L;

  long CHROME_WINDOW_BORDERS = 2L;

  long CHROME_WINDOW_CLOSE = 4L;

  long CHROME_WINDOW_RESIZE = 8L;

  long CHROME_MENUBAR = 16L;

  long CHROME_TOOLBAR = 32L;

  long CHROME_LOCATIONBAR = 64L;

  long CHROME_STATUSBAR = 128L;

  long CHROME_PERSONAL_TOOLBAR = 256L;

  long CHROME_SCROLLBARS = 512L;

  long CHROME_TITLEBAR = 1024L;

  long CHROME_EXTRA = 2048L;

  long CHROME_WITH_SIZE = 4096L;

  long CHROME_WITH_POSITION = 8192L;

  long CHROME_WINDOW_MIN = 16384L;

  long CHROME_WINDOW_POPUP = 32768L;

  long CHROME_WINDOW_RAISED = 33554432L;

  long CHROME_WINDOW_LOWERED = 67108864L;

  long CHROME_CENTER_SCREEN = 134217728L;

  long CHROME_DEPENDENT = 268435456L;

  long CHROME_MODAL = 536870912L;

  long CHROME_OPENAS_DIALOG = 1073741824L;

  long CHROME_OPENAS_CHROME = 2147483648L;

  long CHROME_ALL = 4094L;

  /**
     * The chrome flags for this browser chrome. The implementation should
     * reflect the value of this attribute by hiding or showing its chrome
     * appropriately.
     */
  long getChromeFlags();

  /**
     * The chrome flags for this browser chrome. The implementation should
     * reflect the value of this attribute by hiding or showing its chrome
     * appropriately.
     */
  void setChromeFlags(long aChromeFlags);

  /**
     * Asks the implementer to destroy the window associated with this
     * WebBrowser object.
     */
  void destroyBrowserWindow();

  /**
     * Tells the chrome to size itself such that the browser will be the 
     * specified size.
     * @param aCX new width of the browser
     * @param aCY new height of the browser
     */
  void sizeBrowserTo(int aCX, int aCY);

  /**
     * Shows the window as a modal window.
     * @return (the function error code) the status value specified by
     *         in exitModalEventLoop.
     */
  void showAsModal();

  /**
     * Is the window modal (that is, currently executing a modal loop)?
     * @return true if it's a modal window
     */
  boolean isWindowModal();

  /**
     * Exit a modal event loop if we're in one. The implementation
     * should also exit out of the loop if the window is destroyed.
     * @param aStatus - the result code to return from showAsModal
     */
  void exitModalEventLoop(long aStatus);

}