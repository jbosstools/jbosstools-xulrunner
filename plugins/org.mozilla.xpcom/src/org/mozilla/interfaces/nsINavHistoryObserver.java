/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsINavHistoryService.idl
 */

package org.mozilla.interfaces;

/**
 * Similar to nsIRDFObserver for history. Note that we don't pass the data
 * source since that is always the global history.
 *
 * DANGER! If you are in the middle of a batch transaction, there may be a
 * database transaction active. You can still access the DB, but be careful.
 */
public interface nsINavHistoryObserver extends nsISupports {

  String NS_INAVHISTORYOBSERVER_IID =
    "{14065711-8a91-4d96-ba32-59512f5401b6}";

  /**
   * Notifies you that a bunch of things are about to change, don't do any
   * heavy-duty processing until onEndUpdateBatch is called.
   */
  void onBeginUpdateBatch();

  /**
   * Notifies you that we are done doing a bunch of things and you should go
   * ahead and update UI, etc.
   */
  void onEndUpdateBatch();

  /**
   * Called when a resource is visited. This is called the first time a
   * resource (page, image, etc.) is seen as well as every subsequent time.
   *
   * Normally, transition types of TRANSITION_EMBED (corresponding to images in
   * a page, for example) are not displayed in history results (unless
   * includeHidden is set). Many observers can ignore _EMBED notifications
   * (which will comprise the majority of visit notifications) to save work.
   *
   * @param aVisitID        ID of the visit that was just created.
   * @param aTime           Time of the visit
   * @param aSessionID      The ID of one connected sequence of visits.
   * @param aReferringID    The ID of the visit the user came from. 0 if empty.
   * @param aTransitionType One of nsINavHistory.TRANSITION_*
   * @param aAdded          Incremented by query nodes when the visited uri
   *                        belongs to them. If no such query exists, the 
   *                        history result creates a new query node dynamically.
   *                        It is used in places views only and can be ignored.
   */
  void onVisit(nsIURI aURI, long aVisitID, double aTime, long aSessionID, long aReferringID, long aTransitionType, long[] aAdded);

  /**
   * Called whenever either the "real" title or the custom title of the page
   * changed. BOTH TITLES ARE ALWAYS INCLUDED in this notification, even though
   * only one will change at a time. Often, consumers will want to display the
   * user title if it is available, and fall back to the page title (the one
   * specified in the <title> tag of the page).
   *
   * Note that there is a difference between an empty title and a NULL title.
   * An empty string means that somebody specifically set the title to be
   * nothing. NULL means nobody set it. From C++: use IsVoid() and SetIsVoid()
   * to see whether an empty string is "null" or not (it will always be an
   * empty string in either case).
   *
   */
  void onTitleChanged(nsIURI aURI, String aPageTitle);

  /**
   * This page and all of its visits are about to be deleted.  Note: the page
   * may not necessarily have actually existed for this function to be called.
   *
   * @param aURI
   *        The URI being deleted.
   */
  void onBeforeDeleteURI(nsIURI aURI);

  /**
   * This page and all of its visits are being deleted. Note: the page may not
   * necessarily have actually existed for this function to be called.
   *
   * Delete notifications are only 99.99% accurate. Batch delete operations
   * must be done in two steps, so first come notifications, then a bulk
   * delete. If there is some error in the middle (for example, out of memory)
   * then you'll get a notification and it won't get deleted. There's no easy
   * way around this.
   */
  void onDeleteURI(nsIURI aURI);

  /**
   * Notification that all of history is being deleted.
   */
  void onClearHistory();

  /**
   * A page has had some attribute on it changed. Note that for TYPED and
   * HIDDEN, the page may not necessarily have been added yet.
   */
  long ATTRIBUTE_FAVICON = 3L;

  void onPageChanged(nsIURI aURI, long aWhat, String aValue);

  /**
   * Called when a history entry expires. You will receive notifications that
   * a specific visit has expired with the time of that visit. When the last
   * visit for a history entry expires, the history entry itself is deleted
   * and aWholeEntry is set. (If your observer only cares about URLs and not
   * specific visits, it needs only to listen for aWholeEntry notifications).
   *
   * It is possible for a history entry to be deleted that has no visits if
   * something is out of sync or after a bookmark is deleted that has no
   * visits (thus freeing the history entry). In these cases, aVisitTime will
   * be 0.
   */
  void onPageExpired(nsIURI aURI, double aVisitTime, boolean aWholeEntry);

}