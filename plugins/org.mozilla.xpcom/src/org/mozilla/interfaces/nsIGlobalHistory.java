/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsIGlobalHistory.idl
 */

package org.mozilla.interfaces;

public interface nsIGlobalHistory extends nsISupports {

  String NS_IGLOBALHISTORY_IID =
    "{9491c383-e3c4-11d2-bdbe-0050040a9b44}";

  /**
     * addPage
     * Add a page to the history
     *
     * @param aURL the url to the page
     */
  void addPage(String aURL);

  /**
     * isVisited
     * Checks to see if the given page is in history
     *
     * @return true if a page has been passed into addPage().
     * @param aURL the url to the page
     */
  boolean isVisited(String aURL);

}