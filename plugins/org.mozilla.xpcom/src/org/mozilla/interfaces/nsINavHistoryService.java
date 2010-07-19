/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsINavHistoryService.idl
 */

package org.mozilla.interfaces;

public interface nsINavHistoryService extends nsISupports {

  String NS_INAVHISTORYSERVICE_IID =
    "{437f539b-d541-4a0f-a200-6f9a6d45cce2}";

  /**
   * System Notifications:
   *
   * places-init-complete - Sent once the History service is completely
   *                        initialized successfully.
   * places-database-locked - Sent if initialization of the History service
   *                          failed due to the inability to open the places.sqlite
   *                          for access reasons.
   */
/**
   * This transition type means the user followed a link and got a new toplevel
   * window.
   */
  long TRANSITION_LINK = 1L;

  /**
   * This transition type means that the user typed the page's URL in the
   * URL bar or selected it from URL bar autocomplete results, clicked on
   * it from a history query (from the History sidebar, History menu, 
   * or history query in the personal toolbar or Places organizer.
   */
  long TRANSITION_TYPED = 2L;

  /**
   * This transition is set when the user followed a bookmark to get to the
   * page.
   */
  long TRANSITION_BOOKMARK = 3L;

  /**
   * This transition type is set when some inner content is loaded. This is
   * true of all images on a page, and the contents of the iframe. It is also
   * true of any content in a frame, regardless if whether or not the user
   * clicked something to get there.
   */
  long TRANSITION_EMBED = 4L;

  /**
   * Set when the transition was a permanent redirect.
   */
  long TRANSITION_REDIRECT_PERMANENT = 5L;

  /**
   * Set when the transition was a temporary redirect.
   */
  long TRANSITION_REDIRECT_TEMPORARY = 6L;

  /**
   * Set when the transition is a download.
   */
  long TRANSITION_DOWNLOAD = 7L;

  /**
   * Set when database is coherent
   */
  int DATABASE_STATUS_OK = 0;

  /**
   * Set when database did not exist and we created a new one
   */
  int DATABASE_STATUS_CREATE = 1;

  /**
   * Set when database was corrupt and we replaced it
   */
  int DATABASE_STATUS_CORRUPT = 2;

  /**
   * Set when database schema has been upgraded
   */
  int DATABASE_STATUS_UPGRADED = 3;

  /**
   * Returns the current database status
   */
  int getDatabaseStatus();

  /**
   * True if there is any history. This can be used in UI to determine whether
   * the "clear history" button should be enabled or not. This is much better
   * than using BrowserHistory.count since that can be very slow if there is
   * a lot of history (it must enumerate each item). This is pretty fast.
   */
  boolean getHasHistoryEntries();

  /**
   * Gets the original title of the page.
   */
  String getPageTitle(nsIURI aURI);

  /**
   * This is just like markPageAsTyped (in nsIBrowserHistory, also implemented
   * by the history service), but for bookmarks. It declares that the given URI
   * is being opened as a result of following a bookmark. If this URI is loaded
   * soon after this message has been received, that transition will be marked
   * as following a bookmark.
   */
  void markPageAsFollowedBookmark(nsIURI aURI);

  /**
   * Gets the stored character-set for an URI.
   *
   * @param aURI
   *        URI to retrieve character-set for
   * @returns character-set, empty string if not found
   */
  String getCharsetForURI(nsIURI aURI);

  /**
   * Sets the character-set for an URI.
   *
   * @param aURI
   *        URI to set the character-set for
   * @param aCharset
   *        character-set to be set
   */
  void setCharsetForURI(nsIURI aURI, String aCharset);

  /**
   * Returns true if this URI would be added to the history. You don't have to
   * worry about calling this, addPageToSession/addURI will always check before
   * actually adding the page. This function is public because some components
   * may want to check if this page would go in the history (i.e. for
   * annotations).
   */
  boolean canAddURI(nsIURI aURI);

  /**
   * Call to manually add a visit for a specific page. This will probably not
   * be commonly used other than for backup/restore type operations. If the URI
   * does not have an entry in the history database already, one will be created
   * with no visits, no title, hidden, not typed.  Adding a visit will
   * automatically increment the visit count for the visited page and will unhide
   * it and/or mark it typed according to the transition type.
   *
   * @param aURI             Visited page
   * @param aTime            Time page was visited (microseconds)
   * @param aReferringURI    The URI of the visit that generated this one. Use
   *                         null for no referrer.
   * @param aTranstitionType Type of transition: one of TRANSITION_* above
   * @param aIsRedirect      True if the given visit redirects to somewhere else.
   *                         (ie you will create an visit out of here that is a
   *                         redirect transition). This causes this page to be
   *                         hidden in normal history views (unless it has been
   *                         unhidden by visiting it with a non-redirect).
   * @param aSessionID       The session ID that this page belongs to. Use 0 for
   *                         no session.
   * @returns The ID of the created visit. This will be 0 if the URI is not
   *          valid for adding to history (canAddURI = false).
   */
  long addVisit(nsIURI aURI, double aTime, nsIURI aReferringURI, int aTransitionType, boolean aIsRedirect, long aSessionID);

  /**
   * This returns a new query object that you can pass to executeQuer[y/ies].
   * It will be initialized to all empty (so using it will give you all history).
   */
  nsINavHistoryQuery getNewQuery();

  /**
   * This returns a new options object that you can pass to executeQuer[y/ies]
   * after setting the desired options.
   */
  nsINavHistoryQueryOptions getNewQueryOptions();

  /**
   * Executes a single query.
   */
  nsINavHistoryResult executeQuery(nsINavHistoryQuery aQuery, nsINavHistoryQueryOptions options);

  /**
   * Executes an array of queries. All of the query objects are ORed
   * together. Within a query, all the terms are ANDed together as in
   * executeQuery. See executeQuery()
   */
  nsINavHistoryResult executeQueries(nsINavHistoryQuery[] aQueries, long aQueryCount, nsINavHistoryQueryOptions options);

  /**
   * Converts a query URI-like string to an array of actual query objects for
   * use to executeQueries(). The output query array may be empty if there is
   * no information. However, there will always be an options structure returned
   * (if nothing is defined, it will just have the default values).
   */
  void queryStringToQueries(String aQueryString, nsINavHistoryQuery[][] aQueries, long[] aResultCount, nsINavHistoryQueryOptions[] options);

  /**
   * Converts a query into an equivalent string that can be persisted. Inverse
   * of queryStringToQueries()
   */
  String queriesToQueryString(nsINavHistoryQuery[] aQueries, long aQueryCount, nsINavHistoryQueryOptions options);

  /**
   * Adds a history observer. If ownsWeak is false, the history service will
   * keep an owning reference to the observer.  If ownsWeak is true, then
   * aObserver must implement nsISupportsWeakReference, and the history service
   * will keep a weak reference to the observer.
   */
  void addObserver(nsINavHistoryObserver observer, boolean ownsWeak);

  /**
   * Removes a history observer.
   */
  void removeObserver(nsINavHistoryObserver observer);

  /**
   * Runs the passed callback in batch mode. Use this when a lot of things
   * are about to change. Calls can be nested, observers will only be
   * notified when all batches begin/end.
   *
   * @param aCallback
   *        nsINavHistoryBatchCallback interface to call.
   * @param aUserData
   *        Opaque parameter passed to nsINavBookmarksBatchCallback
   */
  void runInBatchMode(nsINavHistoryBatchCallback aCallback, nsISupports aClosure);

  /** 
   * True if history is disabled. currently, 
   * history is disabled if the browser.history_expire_days pref is 0
   */
  boolean getHistoryDisabled();

  /**
   * Import the given Mork history file.
   *  @param file     The Mork history file to import
   */
  void importHistory(nsIFile file);

}