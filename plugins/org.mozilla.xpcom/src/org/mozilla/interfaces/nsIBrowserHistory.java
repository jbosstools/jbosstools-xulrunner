/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsIBrowserHistory.idl
 */

package org.mozilla.interfaces;

public interface nsIBrowserHistory extends nsIGlobalHistory2 {

  String NS_IBROWSERHISTORY_IID =
    "{b333c6dd-3dbe-4c0b-8062-92ed92b7e7c9}";

  /**
     * addPageWithDetails
     *
     * Adds a page to history with specific time stamp information. This is used in
     * the History migrator. 
     */
  void addPageWithDetails(nsIURI aURI, String aTitle, long aLastVisited);

  /**
     * lastPageVisited
     *
     * The last page that was visited in a top-level window.
     */
  String getLastPageVisited();

  /**
     * count
     *
     * Indicate if there are entries in global history
     * For performance reasons this does not return the real number of entries
     */
  long getCount();

  /**
     * removePage
     *
     * Remove a page from history
     */
  void removePage(nsIURI aURI);

  /**
     * removePages
     *
     * Remove a bunch of pages from history
     * Notice that this does not call observers for performance reasons,
     * instead setting aDoBatchNotify true will send Begin/EndUpdateBatch
     */
  void removePages(nsIURI[] aURIs, long aLength, boolean aDoBatchNotify);

  /**
     * removePagesFromHost
     *
     * Removes all history information about pages from a given host. If
     * aEntireDomain is set, we will also delete pages from sub hosts (so if
     * we are passed in "microsoft.com" we delete "www.microsoft.com",
     * "msdn.microsoft.com", etc.). An empty host name means local files and
     * anything else with no host name. You can also pass in the localized
     * "(local files)" title given to you from a history query to remove all
     * history information from local files.
     *
     * Note that this does not call observers for single deleted uris,
     * but will send Begin/EndUpdateBatch.
     */
  void removePagesFromHost(String aHost, boolean aEntireDomain);

  /**
     * removePagesByTimeframe
     *
     * Remove all pages for a given timeframe.
     * Limits are included: aBeginTime <= timeframe <= aEndTime
     * Notice that this does not call observers for single deleted uris,
     * instead it will send Begin/EndUpdateBatch
     */
  void removePagesByTimeframe(long aBeginTime, long aEndTime);

  /**
     * removeVisitsByTimeframe
     *
     * Removes all visits in a given timeframe.  Limits are included:
     * aBeginTime <= timeframe <= aEndTime.  Any place that becomes unvisited
     * as a result will also be deleted.
     *
     * Note that removal is performed in batch, so observers will not be
     * notified of individual places that are deleted.  Instead they will be
     * notified onBeginUpdateBatch and onEndUpdateBatch.
     */
  void removeVisitsByTimeframe(long aBeginTime, long aEndTime);

  /**
     * removeAllPages
     *
     * Remove all pages from global history
     */
  void removeAllPages();

  /**
     * hidePage
     *
     * Hide the specified URL from being enumerated (and thus
     * displayed in the UI)
     * If the page hasn't been visited yet, then it will be added
     * as if it was visited, and then marked as hidden
     */
  void hidePage(nsIURI aURI);

  /**
     * markPageAsTyped
     *
     * Designate the url as having been explicitly typed in by
     * the user, so it's okay to be an autocomplete result.
     */
  void markPageAsTyped(nsIURI aURI);

}