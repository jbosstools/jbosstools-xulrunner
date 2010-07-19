/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsIDynamicContainer.idl
 */

package org.mozilla.interfaces;

/**
 * The dynamic container interface provides a base class for services that want
 * to provide containers for temporary contents.
 *
 * The service can fill result nodes directly into the container when it is
 * being opened. It can use the property bag on every result node to store data
 * associated with each item, such as full path on disk. It would create
 * additional containers for each container, registered to its service.
 *
 * See also createDynamicContainer in nsINavBookmarksService.
 */
public interface nsIDynamicContainer extends nsISupports {

  String NS_IDYNAMICCONTAINER_IID =
    "{7e85d97b-4109-4ea7-afd8-bc2cd3840d70}";

  /**
   * Called when the given container node is about to be populated so that the
   * service can populate the container if necessary.
   *
   * @param aContainer
   *        The container node for the container being opened. Note that all
   *        result nodes implement a property bag if you need to store state.
   * @param aOptions
   *        The options used to generate this query. Containers should follow
   *        these when possible, for example, whether to expand queries, etc.
   *        Implementations should use this when possible if adding query and
   *        folder nodes to the container. DO NOT MODIFY THIS VALUE.
   */
  void onContainerNodeOpening(nsINavHistoryContainerResultNode aContainer, nsINavHistoryQueryOptions aOptions);

  /**
   * Called when the given container has just been collapsed so that the
   * service can do any necessary cleanup. This is NOT guaranteed to get
   * called. In particular, if the query just goes away, you will not get this
   * call. This only happens when the container itself goes from the open state
   * to the closed state. A service with large numbers of dynamically populated
   * items might use this to do some cleanup so those items don't hang around
   *
   * @param aContainer
   *        The container node of the container being closed. The service need
   *        not worry about removing any created nodes, they will be
   *        automatically removed when this call completes.
   */
  void onContainerNodeClosed(nsINavHistoryContainerResultNode aContainer);

  /**
   * Called when the given container is about to be deleted from the bookmarks
   * table, so that the service can do any necessary cleanup.
   * Called BEFORE the container is deleted, so that the service
   * can still reference it.
   * @param aItemId
   *        The item-id of the container item.
   */
  void onContainerRemoving(long aItemId);

  /**
   * Called when the given container has just been moved, in case
   * the service needs to do any bookkeeping.
   * Called AFTER the container has been moved.
   * @param aItemId
   *        The item-id of the container item.
   * @param aNewParent
   *        The item of the new parent folder for the container.
   * @param aNewIndex
   *        The index the container will be inserted at, or -1 for append.
   */
  void onContainerMoved(long aItemId, long aNewParent, int aNewIndex);

}