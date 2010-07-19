/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/base/nsIBrowserDOMWindow.idl
 */

package org.mozilla.interfaces;

/**
 * The C++ source has access to the browser script source through
 * nsIBrowserDOMWindow. It is intended to be attached to the chrome DOMWindow
 * of a toplevel browser window (a XUL window). A DOMWindow that does not
 * happen to be a browser chrome window will simply have no access to any such
 * interface.
 */
public interface nsIBrowserDOMWindow extends nsISupports {

  String NS_IBROWSERDOMWINDOW_IID =
    "{f9691a49-7fb3-4b54-bb11-a4f2e0b6eddb}";

  /**
   * Values for openURI's aWhere parameter.
   */
/**
   * Do whatever the default is based on application state, user preferences,
   * and the value of the aContext parameter to openURI.
   */
  short OPEN_DEFAULTWINDOW = 0;

  /**
   * Open in the "current window".  If aOpener is provided, this should be the
   * top window in aOpener's window hierarchy, but exact behavior is
   * application-dependent.  If aOpener is not provided, it's up to the
   * application to decide what constitutes a "current window".
   */
  short OPEN_CURRENTWINDOW = 1;

  /**
   * Open in a new window.
   */
  short OPEN_NEWWINDOW = 2;

  /**
   * Open in a new content tab in the toplevel browser window corresponding to
   * this nsIBrowserDOMWindow.
   */
  short OPEN_NEWTAB = 3;

  /**
   * Values for openURI's aContext parameter.  These affect the behavior of
   * OPEN_DEFAULTWINDOW.
   */
/**
   * external link (load request from another application, xremote, etc).
   */
  short OPEN_EXTERNAL = 1;

  /**
   * internal open new window
   */
  short OPEN_NEW = 2;

  /**
   * Load a URI

   * @param aURI the URI to open. null is allowed.  If null is passed in, no
   *             load will be done, though the window the load would have
   *             happened in will be returned.
   * @param aWhere see possible values described above.
   * @param aOpener window requesting the open (can be null).
   * @param aContext the context in which the URI is being opened. This
   *                 is used only when aWhere == OPEN_DEFAULTWINDOW.
   * @return the window into which the URI was opened.
  */
  nsIDOMWindow openURI(nsIURI aURI, nsIDOMWindow aOpener, short aWhere, short aContext);

  /**
   * @param  aWindow the window to test.
   * @return whether the window is the main content window for any
   *         currently open tab in this toplevel browser window.
   */
  boolean isTabContentWindow(nsIDOMWindow aWindow);

}