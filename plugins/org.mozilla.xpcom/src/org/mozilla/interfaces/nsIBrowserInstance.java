/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpfe/browser/public/nsIBrowserInstance.idl
 */

package org.mozilla.interfaces;

public interface nsIBrowserInstance extends nsISupports {

  String NS_IBROWSERINSTANCE_IID =
    "{8af0fa40-598d-11d3-806a-00600811a9c3}";

  boolean startPageCycler();

  boolean getCmdLineURLUsed();

  void setCmdLineURLUsed(boolean aCmdLineURLUsed);

  void setWebShellWindow(nsIDOMWindowInternal aWindow);

  void close();

}