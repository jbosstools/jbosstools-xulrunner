/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsINavHistoryService.idl
 */

package org.mozilla.interfaces;

/**
 * TODO: Bug 517719.
 *
 * A predefined view adaptor for interfacing results with an nsITree. This
 * object will remove itself from its associated result when the tree has been
 * detached. This prevents circular references. Users should be aware of this,
 * if you want to re-use the same viewer, you will need to keep your own
 * reference to it and re-initialize it when the tree changes. If you use this
 * object, attach it to a result, never attach it to a tree, and forget about
 * it, it will leak!
 */
public interface nsINavHistoryResultTreeViewer extends nsINavHistoryResultViewer {

  String NS_INAVHISTORYRESULTTREEVIEWER_IID =
    "{fa77e4e9-9fc8-45d2-9507-0fe4f0602505}";

  /**
   * This allows you to get at the real node for a given row index. This is
   * only valid when a tree is attached.
   */
  nsINavHistoryResultNode nodeForTreeIndex(long aIndex);

  /**
   * Reverse of nodeForFlatIndex, returns the row index for a given result node.
   * Returns INDEX_INVISIBLE if the item is not visible (for example, its
   * parent is collapsed). This is only valid when a tree is attached. The
   * the result will always be INDEX_INVISIBLE if not.
   * 
   * Note: This sounds sort of obvious, but it got me: aNode must be a node
   *       retrieved from the same result that this viewer is for. If you 
   *       execute another query and get a node from a _different_ result, this 
   *       function will always return the index of that node in the tree that
   *       is attached to that result.
   */
  long INDEX_INVISIBLE = 4294967295L;

  long treeIndexForNode(nsINavHistoryResultNode aNode);

}