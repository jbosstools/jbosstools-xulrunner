/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpfe/appshell/public/nsIXULBrowserWindow.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIXULBrowserWindow supplies the methods that may be called from the
 * internals of the browser area to tell the containing xul window to update
 * its ui. 
 */
public interface nsIXULBrowserWindow extends nsISupports {

  String NS_IXULBROWSERWINDOW_IID =
    "{67a601df-f091-4894-a2e2-2e6cfebb35ea}";

  /**
   * Sets the status according to JS' version of status.
   */
  void setJSStatus(String status);

  /**
   * Sets the default status according to JS' version of default status.
   */
  void setJSDefaultStatus(String status);

  /**
   * Tells the object implementing this function what link we are currently
   * over.
   */
  void setOverLink(String link, nsIDOMElement element);

}