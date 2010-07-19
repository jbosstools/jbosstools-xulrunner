/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsINavHistoryService.idl
 */

package org.mozilla.interfaces;

public interface nsINavHistoryContainerResultNode extends nsINavHistoryResultNode {

  String NS_INAVHISTORYCONTAINERRESULTNODE_IID =
    "{f9c8e1c1-e701-44ad-893c-8504c3956929}";

  /**
 * Base class for container results. This includes all types of groupings.
 * Bookmark folders and places queries will be QueryResultNodes which extends
 * these items.
 */
/**
   * Set this to allow descent into the container. When closed, attempting
   * to call getChildren or childCount will result in an error. You should
   * set this to false when you are done reading.
   *
   * For HOST and DAY groupings, doing this is free since the children have
   * been precomputed. For queries and bookmark folders, being open means they
   * will keep themselves up-to-date by listening for updates and re-querying
   * as needed.
   */
  boolean getContainerOpen();

  /**
 * Base class for container results. This includes all types of groupings.
 * Bookmark folders and places queries will be QueryResultNodes which extends
 * these items.
 */
/**
   * Set this to allow descent into the container. When closed, attempting
   * to call getChildren or childCount will result in an error. You should
   * set this to false when you are done reading.
   *
   * For HOST and DAY groupings, doing this is free since the children have
   * been precomputed. For queries and bookmark folders, being open means they
   * will keep themselves up-to-date by listening for updates and re-querying
   * as needed.
   */
  void setContainerOpen(boolean aContainerOpen);

  /**
   * This indicates whether this node "may" have children, and can be used
   * when the container is open or closed. When the container is closed, it
   * will give you an exact answer if the node can easily be populated (for
   * example, a bookmark folder). If not (for example, a complex history query),
   * it will return true. When the container is open, it will always be
   * accurate. It is intended to be used to see if we should draw the "+" next
   * to a tree item.
   */
  boolean getHasChildren();

  /**
   * This gives you the children of the nodes. It is preferrable to use this
   * interface over the array one, since it avoids creating an nsIArray object
   * and the interface is already the correct type.
   *
   * @throws NS_ERROR_NOT_AVAILABLE if containerOpen is false.
   */
  long getChildCount();

  nsINavHistoryResultNode getChild(long aIndex);

  /**
   * Returns false if this node's list of children can be modified
   * (adding or removing children, or reordering children), or true if
   * the UI should not allow the list of children to be modified.
   * This is false for bookmark folder nodes unless setFolderReadOnly() has
   * been called to override it, and true for non-folder nodes.
   */
  boolean getChildrenReadOnly();

  /**
   * This is a string representing the dynamic container API service that is
   * responsible for this container. This throws if if the node is not a dynamic
   * container.
   */
  String getDynamicContainerType();

  /**
   * Appends a full visit node to this container and returns it. For the dynamic
   * container API. TO BE CALLED FROM nsIDynamicContainer::OnContainerOpening()
   * ONLY, and only for non-bookmark-folder containers.
   *
   * @see nsINavHistoryURIResultNode for parameters.
   */
  nsINavHistoryResultNode appendURINode(String aURI, String aTitle, long aAccessCount, double aTime, String aIconURI);

  /**
   * Appends a full visit node to this container and returns it. For the dynamic
   * container API. TO BE CALLED FROM nsIDynamicContainer::OnContainerOpening()
   * ONLY, and only for non-bookmark-folder containers.
   *
   * @see nsINavHistoryVisitResultNode for parameters.
   *
   * UNTESTED: Container API functions are commented out until we can test
   */
/**
   * Appends a full visit node to this container and returns it. For the dynamic
   * container API. TO BE CALLED FROM nsIDynamicContainer::OnContainerOpening()
   * ONLY, and only for non-bookmark-folder containers.
   *
   * @see nsINavHistoryFullVisitResultNode for parameters.
   *
   * UNTESTED: Container API functions are commented out until we can test
   */
/**
   * Appends a container node to this container and returns it. For the dynamic
   * container API. TO BE CALLED FROM nsIDynamicContainer::OnContainerOpening()
   * ONLY, and only for non-bookmark-folder containers.
   *
   * aContainerType should be RESULT_TYPE_DYNAMIC_CONTAINER.
   * When type is dynamic container you must
   * specify a dynamic container type, otherwise, the dynamic container type must
   * be null. Use appendQueryNode and appendFolderNode for the other container
   * types.
   *
   * UNTESTED: Container API functions are commented out until we can test
   */
/**
   * Appends a query node to this container and returns it. For the dynamic
   * container API. TO BE CALLED FROM nsIDynamicContainer::OnContainerOpening()
   * ONLY, and only for non-bookmark-folder containers.
   *
   * Normally you should supply an empty string for IconURI and it will take
   * the default query icon for the current theme.
   *
   * UNTESTED: Container API functions are commented out until we can test
   */
/**
   * Appends a bookmark folder node to this container and returns it. For the
   * dynamic container API. TO BE CALLED FROM nsIDynamicContainer::OnContainerOpening()
   * ONLY, and only for non-bookmark-folder containers.
   *
   * All container attributes will come from the boomkarks service for this
   * folder.
   */
  nsINavHistoryContainerResultNode appendFolderNode(long aFolderId);

}