/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsINavHistoryService.idl
 */

package org.mozilla.interfaces;

public interface nsINavHistoryQueryResultNode extends nsINavHistoryContainerResultNode {

  String NS_INAVHISTORYQUERYRESULTNODE_IID =
    "{ea17745a-1852-4155-a98f-d1dd1763b3df}";

  /**
   * Clears all children of this container. For the dynamic container API.
   * TO BE CALLED FROM nsIDynamicContainer::OnContainerOpening and
   * nsIDynamicContainer::OnContainerClosed ONLY, and valid only for
   * non-bookmark-folder containers.
   *
   * UNTESTED: Container API functions are commented out until we can test
   */
/**
 * Used for places queries and as a base for bookmark folders.
 *
 * Note that if you request places to *not* be expanded in the options that
 * generated this node, this item will report it has no children and never try
 * to populate itself.
 */
/**
   * Get the queries which build this node's children.
   * Only valid for RESULT_TYPE_QUERY nodes.
   */
  nsINavHistoryQuery[] getQueries(long[] queryCount);

  /**
   * Get the options which group this node's children.
   * Only valid for RESULT_TYPE_QUERY nodes.
   */
  nsINavHistoryQueryOptions getQueryOptions();

  /**
   * For both simple folder nodes and simple-folder-query nodes, this is set
   * to the concrete itemId of the folder. Otherwise, this is set to -1.
   */
  long getFolderItemId();

}