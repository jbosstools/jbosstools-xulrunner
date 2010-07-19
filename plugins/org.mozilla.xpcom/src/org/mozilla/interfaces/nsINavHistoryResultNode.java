/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsINavHistoryService.idl
 */

package org.mozilla.interfaces;

public interface nsINavHistoryResultNode extends nsISupports {

  String NS_INAVHISTORYRESULTNODE_IID =
    "{464ae28f-3a9c-4483-afb2-bb0fb0ddb893}";

  /**
   * Indentifies the parent result node in the result set. This is null for
   * top level nodes.
   */
  nsINavHistoryContainerResultNode getParent();

  /**
   * The history-result to which this node belongs.
   */
  nsINavHistoryResult getParentResult();

  /**
   * URI of the resource in question. For visits and URLs, this is the URL of
   * the page. For folders and queries, this is the place: URI of the
   * corresponding folder or query. This may be empty for other types of
   * objects like host containers.
   */
  String getUri();

  /**
   * Identifies the type of this node. This node can then be QI-ed to the
   * corresponding specialized result node interface.
   */
  long RESULT_TYPE_URI = 0L;

  long RESULT_TYPE_VISIT = 1L;

  long RESULT_TYPE_FULL_VISIT = 2L;

  long RESULT_TYPE_DYNAMIC_CONTAINER = 4L;

  long RESULT_TYPE_QUERY = 5L;

  long RESULT_TYPE_FOLDER = 6L;

  long RESULT_TYPE_SEPARATOR = 7L;

  long RESULT_TYPE_FOLDER_SHORTCUT = 9L;

  long getType();

  /**
   * Title of the web page, or of the node's query (day, host, folder, etc)
   */
  String getTitle();

  /**
   * Total number of times the URI has ever been accessed. For hosts, this
   * is the total of the children under it, NOT the total times the host has
   * been accessed (this would require an additional query, so is not given
   * by default when most of the time it is never needed).
   */
  long getAccessCount();

  /**
   * This is the time the user accessed the page.
   *
   * If this is a visit, it is the exact time that the page visit occurred.
   *
   * If this is a URI, it is the most recent time that the URI was visited.
   * Even if you ask for all URIs for a given date range long ago, this might
   * contain today's date if the URI was visited today.
   *
   * For hosts, or other node types with children, this is the most recent
   * access time for any of the children.
   *
   * For days queries this is the respective endTime - a maximum possible
   * visit time to fit in the day range.
   */
  double getTime();

  /**
   * This URI can be used as an image source URI and will give you the favicon
   * for the page. It is *not* the URI of the favicon, but rather something
   * that will resolve to the actual image.
   *
   * In most cases, this is an annotation URI that will query the favicon
   * service. If the entry has no favicon, this is the chrome URI of the
   * default favicon. If the favicon originally lived in chrome, this will
   * be the original chrome URI of the icon.
   */
  String getIcon();

  /**
   * This is the number of levels between this node and the top of the
   * hierarchy. The members of result.children have indentLevel = 0, their
   * children have indentLevel = 1, etc. The indent level of the root node is
   * set to -1.
   */
  int getIndentLevel();

  /**
   * You can use this to associate temporary information with the result node.
   * This property bag is associated with the result node and is not persisted
   * in any way.
   */
  nsIWritablePropertyBag getPropertyBag();

  /**
   * When this item is in a bookmark folder (parent is of type folder), this is
   * the index into that folder of this node. These indices start at 0 and
   * increase in the order that they appear in the bookmark folder. For items
   * that are not in a bookmark folder, this value is -1.
   */
  int getBookmarkIndex();

  /**
   * If the node is an item (bookmark, folder or a separator) this value is the
   * row ID of that bookmark in the database. For other nodes, this value is
   * set to -1.
   */
  long getItemId();

  /**
   * If the node is an item (bookmark, folder or a separator) this value is the 
   * time that the item was created. For other nodes, this value is 0.
   */
  double getDateAdded();

  /**
   * If the node is an item (bookmark, folder or a separator) this value is the 
   * time that the item was last modified. For other nodes, this value is 0.
   *
   *  @note When an item is added lastModified is set to the same value as
   *        dateAdded.
   */
  double getLastModified();

  /**
   * For uri nodes, this is a sorted list of the tags, delimited with commans,
   * for the uri represented by this node. Otherwise this is an empty string.
   */
  String getTags();

}