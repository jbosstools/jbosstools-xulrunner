/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsINavHistoryService.idl
 */

package org.mozilla.interfaces;

public interface nsINavHistoryQueryOptions extends nsISupports {

  String NS_INAVHISTORYQUERYOPTIONS_IID =
    "{b3d5de06-f8ef-4433-84c2-b8b237403b2a}";

  /**
 * This object represents the global options for executing a query.
 */
/**
   * You can ask for the results to be pre-sorted. Since the DB has indices
   * of many items, it can produce sorted results almost for free. These should
   * be self-explanatory.
   *
   * Note: re-sorting is slower, as is sorting by title or when you have a
   * host name.
   *
   * For bookmark items, SORT_BY_NONE means sort by the natural bookmark order.
   */
  int SORT_BY_NONE = 0;

  int SORT_BY_TITLE_ASCENDING = 1;

  int SORT_BY_TITLE_DESCENDING = 2;

  int SORT_BY_DATE_ASCENDING = 3;

  int SORT_BY_DATE_DESCENDING = 4;

  int SORT_BY_URI_ASCENDING = 5;

  int SORT_BY_URI_DESCENDING = 6;

  int SORT_BY_VISITCOUNT_ASCENDING = 7;

  int SORT_BY_VISITCOUNT_DESCENDING = 8;

  int SORT_BY_KEYWORD_ASCENDING = 9;

  int SORT_BY_KEYWORD_DESCENDING = 10;

  int SORT_BY_DATEADDED_ASCENDING = 11;

  int SORT_BY_DATEADDED_DESCENDING = 12;

  int SORT_BY_LASTMODIFIED_ASCENDING = 13;

  int SORT_BY_LASTMODIFIED_DESCENDING = 14;

  int SORT_BY_TAGS_ASCENDING = 17;

  int SORT_BY_TAGS_DESCENDING = 18;

  int SORT_BY_ANNOTATION_ASCENDING = 19;

  int SORT_BY_ANNOTATION_DESCENDING = 20;

  /**
   * "URI" results, one for each URI visited in the range. Individual result
   * nodes will be of type "URI".
   */
  int RESULTS_AS_URI = 0;

  /**
   * "Visit" results, with one for each time a page was visited (this will
   * often give you multiple results for one URI). Individual result nodes will
   * have type "Visit"
   *
   * @note This result type is only supported by QUERY_TYPE_HISTORY.
   */
  int RESULTS_AS_VISIT = 1;

  /**
   * This is identical to RESULT_TYPE_VISIT except that individual result nodes
   * will have type "FullVisit".  This is used for the attributes that are not
   * commonly accessed to save space in the common case (the lists can be very
   * long).
   *
   * @note Not yet implemented. See bug 409662.
   * @note This result type is only supported by QUERY_TYPE_HISTORY.
   */
  int RESULTS_AS_FULL_VISIT = 2;

  /**
   * This returns query nodes for each predefined date range where we 
   * had visits. The node contains information how to load its content:
   * - visits for the given date range will be loaded.
   *
   * @note This result type is only supported by QUERY_TYPE_HISTORY.
   */
  int RESULTS_AS_DATE_QUERY = 3;

  /**
   * This returns nsINavHistoryQueryResultNode nodes for each site where we 
   * have visits. The node contains information how to load its content:
   * - last visit for each url in the given host will be loaded.
   *
   * @note This result type is only supported by QUERY_TYPE_HISTORY.
   */
  int RESULTS_AS_SITE_QUERY = 4;

  /**
   * This returns nsINavHistoryQueryResultNode nodes for each day where we 
   * have visits. The node contains information how to load its content:
   * - list of hosts visited in the given period will be loaded.
   *
   * @note This result type is only supported by QUERY_TYPE_HISTORY.
   */
  int RESULTS_AS_DATE_SITE_QUERY = 5;

  /**
   * This returns nsINavHistoryQueryResultNode nodes for each tag.
   * The node contains information how to load its content:
   * - list of bookmarks with the given tag will be loaded.
   *
   * @note Setting this resultType will force queryType to QUERY_TYPE_BOOKMARKS.
   */
  int RESULTS_AS_TAG_QUERY = 6;

  /**
   * This is a container with an URI result type that contains the last
   * modified bookmarks for the given tag.
   * Tag folder id must be defined in the query.
   *
   * @note Setting this resultType will force queryType to QUERY_TYPE_BOOKMARKS.
   */
  int RESULTS_AS_TAG_CONTENTS = 7;

  /**
   * The sorting mode to be used for this query.
   * mode is one of SORT_BY_*
   */
  int getSortingMode();

  /**
   * The sorting mode to be used for this query.
   * mode is one of SORT_BY_*
   */
  void setSortingMode(int aSortingMode);

  /**
   * The annotation to use in SORT_BY_ANNOTATION_* sorting modes.
   */
  String getSortingAnnotation();

  /**
   * The annotation to use in SORT_BY_ANNOTATION_* sorting modes.
   */
  void setSortingAnnotation(String aSortingAnnotation);

  /**
   * Sets the result type. One of RESULT_TYPE_* which includes how URIs are
   * represented.
   */
  int getResultType();

  /**
   * Sets the result type. One of RESULT_TYPE_* which includes how URIs are
   * represented.
   */
  void setResultType(int aResultType);

  /**
   * This option excludes all URIs and separators from a bookmarks query.
   * This would be used if you just wanted a list of bookmark folders and
   * queries (such as the left pane of the places page).
   * Defaults to false.
   */
  boolean getExcludeItems();

  /**
   * This option excludes all URIs and separators from a bookmarks query.
   * This would be used if you just wanted a list of bookmark folders and
   * queries (such as the left pane of the places page).
   * Defaults to false.
   */
  void setExcludeItems(boolean aExcludeItems);

  /**
   * Set to true to exclude queries ("place:" URIs) from the query results.
   * Simple folder queries (bookmark folder symlinks) will still be included.
   * Defaults to false.
   */
  boolean getExcludeQueries();

  /**
   * Set to true to exclude queries ("place:" URIs) from the query results.
   * Simple folder queries (bookmark folder symlinks) will still be included.
   * Defaults to false.
   */
  void setExcludeQueries(boolean aExcludeQueries);

  /**
   * Set to true to exclude read-only folders from the query results. This is
   * designed for cases where you want to give the user the option of filing
   * something into a list of folders. It only affects cases where the actual
   * folder result node would appear in its parent folder and filters it out.
   * It doesn't affect the query at all, and doesn't affect more complex
   * queries (such as "folders with annotation X").
   */
  boolean getExcludeReadOnlyFolders();

  /**
   * Set to true to exclude read-only folders from the query results. This is
   * designed for cases where you want to give the user the option of filing
   * something into a list of folders. It only affects cases where the actual
   * folder result node would appear in its parent folder and filters it out.
   * It doesn't affect the query at all, and doesn't affect more complex
   * queries (such as "folders with annotation X").
   */
  void setExcludeReadOnlyFolders(boolean aExcludeReadOnlyFolders);

  /**
   * This option excludes items from a bookmarks query
   * if the parent of the item has this annotation.
   * An example is to exclude livemark items
   * (parent folders have the "livemark/feedURI" annotation)
   * Ignored for queries over history.
   */
  String getExcludeItemIfParentHasAnnotation();

  /**
   * This option excludes items from a bookmarks query
   * if the parent of the item has this annotation.
   * An example is to exclude livemark items
   * (parent folders have the "livemark/feedURI" annotation)
   * Ignored for queries over history.
   */
  void setExcludeItemIfParentHasAnnotation(String aExcludeItemIfParentHasAnnotation);

  /**
   * When set, allows items with "place:" URIs to appear as containers,
   * with the container's contents filled in from the stored query.
   * If not set, these will appear as normal items. Doesn't do anything if
   * excludeQueries is set. Defaults to false.
   *
   * Note that this has no effect on folder links, which are place: URIs
   * returned by nsINavBookmarkService.GetFolderURI. These are always expanded
   * and will appear as bookmark folders.
   */
  boolean getExpandQueries();

  /**
   * When set, allows items with "place:" URIs to appear as containers,
   * with the container's contents filled in from the stored query.
   * If not set, these will appear as normal items. Doesn't do anything if
   * excludeQueries is set. Defaults to false.
   *
   * Note that this has no effect on folder links, which are place: URIs
   * returned by nsINavBookmarkService.GetFolderURI. These are always expanded
   * and will appear as bookmark folders.
   */
  void setExpandQueries(boolean aExpandQueries);

  /**
   * Most items in history are marked "hidden." Only toplevel pages that the
   * user sees in the URL bar are not hidden. Hidden things include the content
   * of iframes and all images on web pages. Normally, you don't want these
   * things. If you do, set this flag and you'll get all items, even hidden
   * ones. Does nothing for bookmark queries. Defaults to false.
   */
  boolean getIncludeHidden();

  /**
   * Most items in history are marked "hidden." Only toplevel pages that the
   * user sees in the URL bar are not hidden. Hidden things include the content
   * of iframes and all images on web pages. Normally, you don't want these
   * things. If you do, set this flag and you'll get all items, even hidden
   * ones. Does nothing for bookmark queries. Defaults to false.
   */
  void setIncludeHidden(boolean aIncludeHidden);

  /**
   * Include both redirected-from and redirected-to pages into results.
   */
  int REDIRECTS_MODE_ALL = 0;

  /**
   * Query results will not include redirected-to pages, but will include
   * redirected-from pages.
   */
  int REDIRECTS_MODE_SOURCE = 1;

  /**
   * Query results will not include redirected-from pages but will include
   * redirected-to pages.
   */
  int REDIRECTS_MODE_TARGET = 2;

  /**
   * Defines how redirects should be handled, see REDIRECTS_MODE_* constants
   * above.
   * Defaults to REDIRECTS_MODE_ALL.
   * Note: this option is effective only on QUERY_TYPE_HISTORY.
   */
  int getRedirectsMode();

  /**
   * Defines how redirects should be handled, see REDIRECTS_MODE_* constants
   * above.
   * Defaults to REDIRECTS_MODE_ALL.
   * Note: this option is effective only on QUERY_TYPE_HISTORY.
   */
  void setRedirectsMode(int aRedirectsMode);

  /**
   * Separate/group history items based on session information.  Only
   * matters when sorting by date.
   */
  boolean getShowSessions();

  /**
   * Separate/group history items based on session information.  Only
   * matters when sorting by date.
   */
  void setShowSessions(boolean aShowSessions);

  /**
   * This is the maximum number of results that you want. The query is exeucted,
   * the results are sorted, and then the top 'maxResults' results are taken
   * and returned. Set to 0 (the default) to get all results.
   *
   * THIS DOES NOT WORK IN CONJUNCTION WITH SORTING BY TITLE. This is because
   * sorting by title requires us to sort after using locale-sensetive sorting
   * (as opposed to letting the database do it for us).
   *
   * Instead, we get the result ordered by date, pick the maxResult most recent
   * ones, and THEN sort by title.
   */
  long getMaxResults();

  /**
   * This is the maximum number of results that you want. The query is exeucted,
   * the results are sorted, and then the top 'maxResults' results are taken
   * and returned. Set to 0 (the default) to get all results.
   *
   * THIS DOES NOT WORK IN CONJUNCTION WITH SORTING BY TITLE. This is because
   * sorting by title requires us to sort after using locale-sensetive sorting
   * (as opposed to letting the database do it for us).
   *
   * Instead, we get the result ordered by date, pick the maxResult most recent
   * ones, and THEN sort by title.
   */
  void setMaxResults(long aMaxResults);

  int QUERY_TYPE_HISTORY = 0;

  int QUERY_TYPE_BOOKMARKS = 1;

  int QUERY_TYPE_UNIFIED = 2;

  /**
   * The type of search to use when querying the DB; This attribute is only
   * honored by query nodes. It is silently ignored for simple folder queries.
   */
  int getQueryType();

  /**
   * The type of search to use when querying the DB; This attribute is only
   * honored by query nodes. It is silently ignored for simple folder queries.
   */
  void setQueryType(int aQueryType);

  /**
   * Creates a new options item with the same parameters of this one.
   */
  nsINavHistoryQueryOptions _clone();

}