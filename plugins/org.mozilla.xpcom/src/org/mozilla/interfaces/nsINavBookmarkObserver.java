/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsINavBookmarksService.idl
 */

package org.mozilla.interfaces;

/**
 * Observer for bookmark changes.
 */
public interface nsINavBookmarkObserver extends nsISupports {

  String NS_INAVBOOKMARKOBSERVER_IID =
    "{1f7e9032-b2c0-4561-b35b-94ba3f8344e2}";

  /**
   * Notify this observer that a batch transaction has started.
   * Other notifications will be sent during the batch change,
   * but the observer is guaranteed that onEndUpdateBatch() will be called
   * at the completion of changes.
   */
  void onBeginUpdateBatch();

  /**
   * Notify this observer that a batch transaction has ended.
   */
  void onEndUpdateBatch();

  /**
   * Notify this observer that an item was added.  Called after the actual
   * add took place. The items following the index will be shifted down, but
   * no additional notifications will be sent.
   *
   * @param aItemId
   *        The id of the bookmark that was added.
   * @param aParentId
   *        The id of the folder to which the item was added.
   * @param aIndex
   *        The item's index in the folder.
   * @param aItemType
   *        The type of the item that was added (one of the TYPE_* constants
   *        defined above).
   */
  void onItemAdded(long aItemId, long aParentId, int aIndex, int aItemType);

  /**
   * Notify this observer that an item is about to be removed.  Called before
   * the actual removal will take place.
   *
   * @param aItemId
   *        The id of the bookmark to be removed.
   * @param aItemType
   *        The type of the item to be removed (one of the TYPE_* constants
   *        defined above).
   */
  void onBeforeItemRemoved(long aItemId, int aItemType);

  /**
   * Notify this observer that an item was removed.  Called after the actual
   * remove took place. The items following the index will be shifted up, but
   * no additional notifications will be sent.
   *
   * @param aItemId
   *        The id of the item that was removed.
   * @param aParentId
   *        The id of the folder from which the item was removed.
   * @param aIndex
   *        The bookmark's index in the folder.
   * @param aItemType
   *        The type of the item that was removed (one of the TYPE_* constants
   *        defined above).
   */
  void onItemRemoved(long aItemId, long aParentId, int aIndex, int aItemType);

  /**
   * Notify this observer that an item's information has changed.  This
   * will be called whenever any attributes like "title" are changed.
   * 
   * @param aItemId
   *        The id of the item that was changed.
   * @param aProperty
   *        The property which changed.
   * @param aIsAnnotationProperty
   *        Whether or not aProperty the name of an item annotation.
   * @param aProperty
   *        The property which has been changed (see list below).
   * @param aNewValue
   *        For certain properties, this is set to the new value of the
   *        property (see list below).
   * @param aLastModified
   *        If the item's lastModified field has changed, this parameter is
   *        set to the new value, otherwise it's set to 0.
   * @param aItemType
   *        The type of the item that has been changed(one of the TYPE_* constants
   *        defined above).
   *        
   * property = "cleartime": (history was deleted, there is no last visit date):
   *                         value = empty string.
   * property = "title": value = new title.
   * property = "favicon": value = new "moz-anno" URL of favicon image
   * property = "uri": value = new uri spec.
   * property = "tags: (tags set for the bookmarked uri have changed)
   *             value = empty string.
   * property = "dateAdded": value = PRTime when the item was first added
   * property = "lastModified": value = PRTime when the item was last modified
   * aIsAnnotationProperty = true: value = empty string.
   */
  void onItemChanged(long aItemId, String aProperty, boolean aIsAnnotationProperty, String aNewValue, double aLastModified, int aItemType);

  /**
   * Notify that the item was visited. Normally in bookmarks we use the last
   * visit date, and normally the time will be a new visit that will be more
   * recent, but this is not guaranteed. You should check to see if it's
   * actually more recent before using this new time.
   *
   * @param aBookmarkId
   *        The id of the bookmark that was visited.
   * @see onItemChanged property = "cleartime" for when all visit dates are
   * deleted for the URI.
   */
  void onItemVisited(long aBookmarkId, long aVisitID, double time);

  /**
   * Notify this observer that an item has been moved.
   *  @param aItemId
   *         The id of the item that was moved.
   *  @param aOldParentId
   *         The id of the old parent.
   *  @param aOldIndex
   *         The old index inside the old parent.
   *  @param aNewParentId
   *         The id of the new parent.
   *  @param aNewIndex
   *         The index inside the new parent.
   * @param  aItemType
   *         The type of the item that was moved (one of the TYPE_* constants
   *         defined above).
   */
  void onItemMoved(long aItemId, long aOldParentId, int aOldIndex, long aNewParentId, int aNewIndex, int aItemType);

}