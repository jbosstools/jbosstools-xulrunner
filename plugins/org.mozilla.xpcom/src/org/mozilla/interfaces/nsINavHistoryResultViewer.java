/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsINavHistoryService.idl
 */

package org.mozilla.interfaces;

/**
 * Allows clients to observe what is happening to a result as it updates itself
 * according to history and bookmark system events. Register this observer on a
 * result using registerView
 *
 * @see nsINavHistoryResult for where this fits in
 */
public interface nsINavHistoryResultViewer extends nsISupports {

  String NS_INAVHISTORYRESULTVIEWER_IID =
    "{af4ac418-a687-4775-8ffa-97c160196432}";

  /**
   * Called when 'aItem' is inserted into 'aParent' at index 'aNewIndex'.
   * The item previously at index (if any) and everything below it will have
   * been shifted down by one. The item may be a container or a leaf.
   */
  void nodeInserted(nsINavHistoryContainerResultNode aParent, nsINavHistoryResultNode aNode, long aNewIndex);

  /**
   * Called whan 'aItem' is removed from 'aParent' at 'aOldIndex'. The item
   * may be a container or a leaf. This function will be called after the item
   * has been removed from its parent list, but before anything else (including
   * NULLing out the item's parent) has happened.
   */
  void nodeRemoved(nsINavHistoryContainerResultNode aParent, nsINavHistoryResultNode aItem, long aOldIndex);

  /**
   * Called whan 'aItem' is moved from 'aOldParent' at 'aOldIndex' to
   * aNewParent at aNewIndex. The item may be a container or a leaf.
   *
   * XXX: at the moment, this method is called only when an item is moved
   * within the same container. When an item is moved between containers,
   * a new node is created for the item, and the itemRemoved/itemAdded methods
   * are used.
   */
  void nodeMoved(nsINavHistoryResultNode aNode, nsINavHistoryContainerResultNode aOldParent, long aOldIndex, nsINavHistoryContainerResultNode aNewParent, long aNewIndex);

  /**
   * Called right after aNode's title has changed.
   * 
   * @param aNode
   *        a result node
   * @param aNewTitle
   *        the new title
   */
  void nodeTitleChanged(nsINavHistoryResultNode aNode, String aNewTitle);

  /**
   * Called right after aNode's uri property has changed.
   * 
   * @param aNode
   *        a result node
   * @param aNewURI
   *        the new uri
   */
  void nodeURIChanged(nsINavHistoryResultNode aNode, String aNewURI);

  /**
   * Called right after aNode's icon property has changed.
   *
   * @param aNode
   *        a result node
   *
   * @note: The new icon is accessible through aNode.icon.
   */
  void nodeIconChanged(nsINavHistoryResultNode aNode);

  /**
   * Called right after aNode's time property or accessCount property, or both,
   * have changed.
   *
   * @param aNode
   *        a uri result node
   * @param aNewVisitDate
   *        the new visit date
   * @param aNewAccessCount
   *        the new access-count
   */
  void nodeHistoryDetailsChanged(nsINavHistoryResultNode aNode, double aNewVisitDate, long aNewAccessCount);

  /**
   * Called when the tags set on the uri represented by aNode have changed.
   *
   * @param aNode
   *        a uri result node
   *
   * @note: The new tags list is accessible through aNode.tags.
   */
  void nodeTagsChanged(nsINavHistoryResultNode aNode);

  /**
   * Called right after the aNode's keyword property has changed.
   * 
   * @param aNode
   *        a uri result node
   * @param aNewKeyword
   *        the new keyword
   */
  void nodeKeywordChanged(nsINavHistoryResultNode aNode, String aNewKeyword);

  /**
   * Called right after an annotation of aNode's has changed (set, altered, or
   * unset).
   * 
   * @param aNode
   *        a result node
   * @param aAnnoName
   *        the name of the annotation that changed
   */
  void nodeAnnotationChanged(nsINavHistoryResultNode aNode, String aAnnoName);

  /**
   * Called right after aNode's dateAdded property has changed.
   *
   * @param aNode
   *        a result node
   * @param aNewValue
   *        the new value of the dateAdded property
   */
  void nodeDateAddedChanged(nsINavHistoryResultNode aNode, double aNewValue);

  /**
   * Called right after aNode's dateModified property has changed.
   *
   * @param aNode
   *        a result node
   * @param aNewValue
   *        the new value of the dateModified property
   */
  void nodeLastModifiedChanged(nsINavHistoryResultNode aNode, double aNewValue);

  /**
   * Called when an item is being replaced with another item at the exact
   * same position.
   *
   * @param aParentNode
   *        the parent node of the node which is being replaced
   * @param aOldNode
   *        the node which is being replaced
   * @param aNewNode
   *        the new node
   * @param aParentNode
   *        the index in aParentNode, at which a node is being replaced
   */
  void nodeReplaced(nsINavHistoryContainerResultNode aParentNode, nsINavHistoryResultNode aOldNode, nsINavHistoryResultNode aNewNode, long aIndex);

  /**
   * Called after a container node went from closed to opened.
   *
   * @param aContainerNode
   *        the container node which was opened
   */
  void containerOpened(nsINavHistoryContainerResultNode aContainerNode);

  /**
   * Called after a container node went from opened to closed. This will be
   * called for the topmost container that is closing, and implies that any
   * child containers have closed as well.
   *
   * @param aContainerNode
   *        the container node which was closed
   */
  void containerClosed(nsINavHistoryContainerResultNode aContainerNode);

  /**
   * Called when something significant has happened within the container. The
   * contents of the container should be re-built.
   *
   * @param aContainerNode
   *        the container node to invalidate
   */
  void invalidateContainer(nsINavHistoryContainerResultNode aContainerNode);

  /**
   * This is called to indicate to the UI that the sort has changed to the
   * given mode. For trees, for example, this would update the column headers
   * to reflect the sorting. For many other types of views, this won't be
   * applicable.
   *
   * @param sortingMode  One of nsINavHistoryQueryOptions.SORT_BY_* that
   *                     indicates the new sorting mode.
   *
   * This only is expected to update the sorting UI. invalidateAll() will also
   * get called if the sorting changes to update everything.
   */
  void sortingChanged(int sortingMode);

  /**
   * Called by the result when this object is set using
   * nsINavHistoryResult.viewer. This will be set to NULL when the result
   * is being deallocated. This should not be set by other code.
   */
  nsINavHistoryResult getResult();

  /**
   * Called by the result when this object is set using
   * nsINavHistoryResult.viewer. This will be set to NULL when the result
   * is being deallocated. This should not be set by other code.
   */
  void setResult(nsINavHistoryResult aResult);

}