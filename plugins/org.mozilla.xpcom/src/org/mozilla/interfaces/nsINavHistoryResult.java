/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsINavHistoryService.idl
 */

package org.mozilla.interfaces;

public interface nsINavHistoryResult extends nsISupports {

  String NS_INAVHISTORYRESULT_IID =
    "{d1562f6f-8d5a-4042-8524-72f747a51b18}";

  /**
 * The result of a history/bookmark query.
 *
 * Use the "root" element to access the children of this query.
 *
 * The basic design of the system is a model-view-controller. This result object
 * represents the model where the data is stored. External components
 * provide the view and controller which define how the data looks and how
 * interaction happens.
 *   [RESULT]----->[viewer]----->[controller]
 *             |
 *             +-- nsINavHistoryResultViewer
 *
 * The result indicates to the view when something changes through the
 * nsINavHistoryResultViewer interface. The viewer is set through
 * the nsINavHistoryResult.viewer property.
 */
/**
   * Sorts all nodes recursively by the given parameter, one of
   * nsINavHistoryQueryOptions.SORT_BY_*  This will update the corresponding
   * options for this result, so that re-using the current options/queries will
   * always give you the current view.
   */
  int getSortingMode();

  /**
 * The result of a history/bookmark query.
 *
 * Use the "root" element to access the children of this query.
 *
 * The basic design of the system is a model-view-controller. This result object
 * represents the model where the data is stored. External components
 * provide the view and controller which define how the data looks and how
 * interaction happens.
 *   [RESULT]----->[viewer]----->[controller]
 *             |
 *             +-- nsINavHistoryResultViewer
 *
 * The result indicates to the view when something changes through the
 * nsINavHistoryResultViewer interface. The viewer is set through
 * the nsINavHistoryResult.viewer property.
 */
/**
   * Sorts all nodes recursively by the given parameter, one of
   * nsINavHistoryQueryOptions.SORT_BY_*  This will update the corresponding
   * options for this result, so that re-using the current options/queries will
   * always give you the current view.
   */
  void setSortingMode(int aSortingMode);

  /**
   * The annotation to use in SORT_BY_ANNOTATION_* sorting modes, set this
   * before setting the sortingMode attribute.
   */
  String getSortingAnnotation();

  /**
   * The annotation to use in SORT_BY_ANNOTATION_* sorting modes, set this
   * before setting the sortingMode attribute.
   */
  void setSortingAnnotation(String aSortingAnnotation);

  /**
   * The viewer for this result (see comment for the class for how these
   * objects are related). This may be null, in which case you can still
   * manually walk the tree using the root node. When this is non-null, you
   * can access the flattened list of items (flatItemCount, nodeForFlatIndex,
   * flatIndexForNode).
   */
  nsINavHistoryResultViewer getViewer();

  /**
   * The viewer for this result (see comment for the class for how these
   * objects are related). This may be null, in which case you can still
   * manually walk the tree using the root node. When this is non-null, you
   * can access the flattened list of items (flatItemCount, nodeForFlatIndex,
   * flatIndexForNode).
   */
  void setViewer(nsINavHistoryResultViewer aViewer);

  /**
   * This is the root of the results. Remember that you need to open all
   * containers for their contents to be valid.
   *
   * When a result goes out of scope it will continue to observe changes till
   * it is cycle collected.  While the result waits to be collected it will stay
   * in memory, and continue to update itself, potentially causing unwanted
   * additional work.  When you close the root node the result will stop
   * observing changes, so it is good practice to close the root node when you
   * are done with a result, since that will avoid unwanted performance hits.
   */
  nsINavHistoryContainerResultNode getRoot();

}