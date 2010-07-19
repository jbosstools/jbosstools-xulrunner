/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpfe/appshell/public/nsIXULWindow.idl
 */

package org.mozilla.interfaces;

public interface nsIXULWindow extends nsISupports {

  String NS_IXULWINDOW_IID =
    "{c175a596-ee13-420a-aa74-13ad3a14deb1}";

  /**
   * The docshell owning the XUL for this window.
   */
  nsIDocShell getDocShell();

  /**
   * Indicates if this window is instrinsically sized.	
   */
  boolean getIntrinsicallySized();

  /**
   * Indicates if this window is instrinsically sized.	
   */
  void setIntrinsicallySized(boolean aIntrinsicallySized);

  /**
   * The primary content shell.  
   *
   * Note that this is a docshell tree item and therefore can not be assured of
   * what object it is. It could be an editor, a docshell, or a browser object.
   * Or down the road any other object that supports being a DocShellTreeItem
   * Query accordingly to determine the capabilities.
   */
  nsIDocShellTreeItem getPrimaryContentShell();

  /**
   * The content shell specified by the supplied id.
   *
   * Note that this is a docshell tree item and therefore can not be assured of
   * what object it is.  It could be an editor, a docshell, or a browser object.
   * Or down the road any other object that supports being a DocShellTreeItem
   * Query accordingly to determine the capabilities.
   */
  nsIDocShellTreeItem getContentShellById(String ID);

  /**
   * Tell this window that it has picked up a child XUL window
   * @param aChild the child window being added
   */
  void addChildWindow(nsIXULWindow aChild);

  /**
   * Tell this window that it has lost a child XUL window
   * @param aChild the child window being removed
   */
  void removeChildWindow(nsIXULWindow aChild);

  /**
   * Move the window to a centered position.
   * @param aRelative the window relative to which the window is moved.
   *                  See screen parameter for details. if null, the
   *                  window is centered relative to the main screen.
   * @param aScreen   PR_TRUE to center the window relative to the screen
   *                  containing aRelative. PR_FALSE to center it relative
   *                  to aRelative itself.
   * @param aAlert    PR_TRUE to move the window to an alert position,
   *                  generally centered horizontally and 1/3 down from the top.
   */
  void center(nsIXULWindow aRelative, boolean aScreen, boolean aAlert);

  /**
   * Shows the window as a modal window. That is, ensures that it is visible
   * and runs a local event loop, exiting only once the window has been closed.
   */
  void showModal();

  long lowestZ = 0L;

  long loweredZ = 4L;

  long normalZ = 5L;

  long raisedZ = 6L;

  long highestZ = 9L;

  long getZLevel();

  void setZLevel(long aZLevel);

  /**
   * contextFlags are from nsIWindowCreator2
   */
  long getContextFlags();

  /**
   * contextFlags are from nsIWindowCreator2
   */
  void setContextFlags(long aContextFlags);

  long getChromeFlags();

  void setChromeFlags(long aChromeFlags);

  /**
   * Create a new window.
   * @param aChromeFlags see nsIWebBrowserChrome
   * @return the newly minted window
   */
  nsIXULWindow createNewWindow(int aChromeFlags, nsIAppShell aAppShell);

  nsIXULBrowserWindow getXULBrowserWindow();

  void setXULBrowserWindow(nsIXULBrowserWindow aXULBrowserWindow);

}