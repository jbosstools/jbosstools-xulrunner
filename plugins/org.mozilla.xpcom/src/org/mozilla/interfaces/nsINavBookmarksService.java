/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsINavBookmarksService.idl
 */

package org.mozilla.interfaces;

/**
 * The BookmarksService interface provides methods for managing bookmarked
 * history items.  Bookmarks consist of a set of user-customizable
 * folders.  A URI in history can be contained in one or more such folders.
 */
public interface nsINavBookmarksService extends nsISupports {

  String NS_INAVBOOKMARKSSERVICE_IID =
    "{3b6ff5c5-0ab4-4aab-b1be-d569763a6ce0}";

  /**
   * The item ID of the Places root.
   */
  long getPlacesRoot();

  /**
   * The item ID of the bookmarks menu folder.
   */
  long getBookmarksMenuFolder();

  /**
   * The item ID of the top-level folder that contain the tag "folders".
   */
  long getTagsFolder();

  /**
  * The item ID of the unfiled-bookmarks folder.
  */
  long getUnfiledBookmarksFolder();

  /**
   * The item ID of the personal toolbar folder.
   */
  long getToolbarFolder();

  /**
   * This value should be used for APIs that allow passing in an index
   * where an index is not known, or not required to be specified.
   * e.g.: When appending an item to a folder.
   */
  short DEFAULT_INDEX = -1;

  int TYPE_BOOKMARK = 1;

  int TYPE_FOLDER = 2;

  int TYPE_SEPARATOR = 3;

  int TYPE_DYNAMIC_CONTAINER = 4;

  /**
   * Inserts a child bookmark into the given folder.
   *
   *  @param aParentId
   *         The id of the parent folder
   *  @param aURI
   *         The URI to insert
   *  @param aIndex
   *         The index to insert at, or DEFAULT_INDEX to append
   *  @param aTitle
   *         The title for the new bookmark
   *  @return The ID of the newly-created bookmark.
   */
  long insertBookmark(long aParentId, nsIURI aURI, int aIndex, String aTitle);

  /**
   * Removes a child item. Used to delete a bookmark or separator.
   *  @param aItemId
   *         The child item to remove
   */
  void removeItem(long aItemId);

  /**
   * Creates a new child folder and inserts it under the given parent.
   *  @param aParentFolder
   *         The id of the parent folder
   *  @param aName
   *         The name of the new folder
   *  @param aIndex
   *         The index to insert at, or DEFAULT_INDEX to append
   *  @return The ID of the newly-inserted folder.
   */
  long createFolder(long aParentFolder, String name, int index);

  /**
   * Creates a dynamic container under the given parent folder.
   *
   *  @param aParentFolder
   *         The id of the parent folder
   *  @param aName
   *         The name of the new folder
   *  @param aContractId
   *         The contract id of the service which is to manipulate this
   *         container.
   *  @param aIndex
   *         The index to insert at, or DEFAULT_INDEX to append
   *         
   *  @return The ID of the newly-inserted folder.
   */
  long createDynamicContainer(long aParentFolder, String aName, String aContractId, int aIndex);

  /**
   * DEPRECATED and removed in Firefox 3.7. Use removeItem instead.
   */
  void removeFolder(long aFolder);

  /**
   * Gets an undo-able transaction for removing a folder from the bookmarks
   * tree. 
   *  @param aItemId
   *         The id of the folder to remove.
   *  @return An object implementing nsITransaction that can be used to undo 
   *          or redo the action. 
   *
   * This method exists because complex delete->undo operations rely on 
   * recreated folders to have the same ID they had before they were deleted, 
   * so that any other items deleted in different transactions can be 
   * re-inserted correctly. This provides a safe encapsulation of this 
   * functionality without exposing the ability to recreate folders with 
   * specific IDs (potentially dangerous if abused by other code!) in the
   * public API.
   */
  nsITransaction getRemoveFolderTransaction(long aItemId);

  /**
   * Convenience function for container services.  Removes
   * all children of the given folder.
   *  @param aItemId
   *         The id of the folder to remove children from.
   */
  void removeFolderChildren(long aItemId);

  /**
   * Moves an item to a different container, preserving its contents.
   *  @param aItemId
   *         The id of the item to move
   *  @param aNewParentId
   *         The id of the new parent
   *  @param aIndex
   *         The index under aNewParent, or DEFAULT_INDEX to append
   *
   * NOTE: When moving down in the same container we take into account the
   * removal of the original item. If you want to move from index X to
   * index Y > X you must use moveItem(id, folder, Y + 1)
   */
  void moveItem(long aItemId, long aNewParentId, int aIndex);

  /**
   * DEPRECATED and removed in Firefox 3.7.
   */
  long getChildFolder(long aFolder, String aSubFolder);

  /**
   * Inserts a bookmark separator into the given folder at the given index.
   * The separator can be removed using removeChildAt().
   *  @param aParentId
   *         The id of the parent folder
   *  @param aIndex
   *         The separator's index under folder, or DEFAULT_INDEX to append
   *  @return The ID of the new separator.
   */
  long insertSeparator(long aParentId, int aIndex);

  /**
   * DEPRECATED and removed in Firefox 3.7. Use removeItem instead.
   */
  void removeChildAt(long aFolder, int aIndex);

  /**
   * Get the itemId given the containing folder and the index.
   *  @param aParentId
   *         The id of the diret parent folder of the item
   *  @param aIndex
   *         The index of the item within the parent folder.
   *         Pass DEFAULT_INDEX for the last item.
   *  @return The ID of the found item, -1 if the item does not exists.
   */
  long getIdForItemAt(long aParentId, int aIndex);

  /**
   * Get a globally unique identifier for an item, meant to be used in
   * sync scenarios.  Even if their contents are exactly the same
   * (including an item in a different profile with the same ItemId),
   * the GUID would be different.
   *  @param   aItemId
   *           The ID of the item to get the GUID for
   *  @return The GUID string.
   */
  String getItemGUID(long aItemId);

  /**
   * Set a globally unique identifier.  This can be useful when a sync
   * algorithm deems two independently created items (on different
   * profiles) to be the same item.
   *  @param   aItemId
   *           The id of the item to set the GUID of
   *  @param   aGUID
   *           The GUID string
   */
  void setItemGUID(long aItemId, String aGUID);

  /**
   * Get the ID of the item with the given GUID.
   * @param   aGUID
   *          The GUID string of the item to search for
   * @return The item ID, or -1 if not found.
   */
  long getItemIdForGUID(String aGUID);

  /**
   * Set the title for an item.
   *  @param aItemId
   *         The id of the item whose title should be updated 
   *  @param aTitle
   *         The new title for the bookmark.
   */
  void setItemTitle(long aItemId, String aTitle);

  /**
   * Get the title for an item.
   *
   * If no item title is available it will return a void string (null in JS).
   *
   *  @param aItemId
   *         The id of the item whose title should be retrieved
   *  @return The title of the item.
   */
  String getItemTitle(long aItemId);

  /**
   * Set the date added time for an item.
   */
  void setItemDateAdded(long aItemId, double aDateAdded);

  /**
   * Get the date added time for an item.
   */
  double getItemDateAdded(long aItemId);

  /**
   * Set the last modified time for an item.
   *
   *  @note This is the only method that will send an itemChanged notification
   *        for the property.  lastModified will still be updated in
   *        any other method that changes an item property, but we will send
   *        the corresponding itemChanged notification instead.
   */
  void setItemLastModified(long aItemId, double aLastModified);

  /**
   * Get the last modified time for an item.
   *
   *  @note When an item is added lastModified is set to the same value as
   *        dateAdded.
   */
  double getItemLastModified(long aItemId);

  /**
   * Get the URI for a bookmark item.
   */
  nsIURI getBookmarkURI(long aItemId);

  /**
   * Get the index for an item.
   */
  int getItemIndex(long aItemId);

  /**
   * Changes the index for a item. This method does not change the indices of
   * any other items in the same folder, so ensure that the new index does not
   * already exist, or change the index of other items accordingly, otherwise
   * the indices will become corrupted.
   *
   * WARNING: This is API is intended for scenarios such as folder sorting,
   *          where the caller manages the indices of *all* items in the folder.
   *          You must always ensure each index is unique after a reordering.
   *
   *  @param aItemId    The id of the item to modify
   *  @param aNewIndex  The new index
   * 
   *  @throws If aNewIndex is out of bounds.
   */
  void setItemIndex(long aItemId, int aNewIndex);

  /**
   * Get an item's type (bookmark, separator, folder).
   * The type is one of the TYPE_* constants defined above.
   */
  int getItemType(long aItemId);

  /**
   * Checks whether a folder is marked as read-only.
   * If this is set to true, UI will not allow the user to add, remove,
   * or reorder children in this folder. The default for all folders is false.
   * Note: This does not restrict API calls, only UI actions.
   *
   * @param aItemId
   *        the item-id of the folder.
   */
  boolean getFolderReadonly(long aItemId);

  /**
   * Sets or unsets the readonly flag from a folder.
   * If this is set to true, UI will not allow the user to add, remove,
   * or reorder children in this folder. The default for all folders is false.
   * Note: This does not restrict API calls, only UI actions.
   *
   * @param aFolder
   *        the item-id of the folder.
   * @param aReadOnly
   *        the read-only state (boolean).
   */
  void setFolderReadonly(long aFolder, boolean aReadOnly);

  /**
   * Returns true if the given URI is in any bookmark folder. If you want the
   * results to be redirect-aware, use getBookmarkedURIFor()
   */
  boolean isBookmarked(nsIURI aURI);

  /**
   * Used to see if the given URI is bookmarked, or any page that redirected to
   * it is bookmarked. For example, if I bookmark "mozilla.org" by manually
   * typing it in, and follow the bookmark, I will get redirected to
   * "www.mozilla.org". Logically, this new page is also bookmarked. This
   * function, if given "www.mozilla.org", will return the URI of the bookmark,
   * in this case "mozilla.org".
   *
   * If there is no bookmarked page found, it will return NULL.
   */
  nsIURI getBookmarkedURIFor(nsIURI aURI);

  /**
   * Change the bookmarked URI for a bookmark.
   * This changes which "place" the bookmark points at,
   * which means all annotations, etc are carried along.
   */
  void changeBookmarkURI(long aItemId, nsIURI aNewURI);

  /**
   * Get the parent folder's id for an item.
   */
  long getFolderIdForItem(long aItemId);

  /**
   * Returns the list of bookmark ids that contain the given URI.
   */
  long[] getBookmarkIdsForURI(nsIURI aURI, long[] count);

  /**
   * Associates the given keyword with the given bookmark.
   *
   * Use an empty keyword to clear the keyword associated with the URI.
   * In both of these cases, succeeds but does nothing if the URL/keyword is not found.
   */
  void setKeywordForBookmark(long aItemId, String aKeyword);

  /**
   * Retrieves the keyword for the given URI. Will be void string
   * (null in JS) if no such keyword is found.
   */
  String getKeywordForURI(nsIURI aURI);

  /**
   * Retrieves the keyword for the given bookmark. Will be void string
   * (null in JS) if no such keyword is found.
   */
  String getKeywordForBookmark(long aItemId);

  /**
   * Returns the URI associated with the given keyword. Empty if no such
   * keyword is found.
   */
  nsIURI getURIForKeyword(String keyword);

  /**
   * Adds a bookmark observer. If ownsWeak is false, the bookmark service will
   * keep an owning reference to the observer.  If ownsWeak is true, then
   * aObserver must implement nsISupportsWeakReference, and the bookmark
   * service will keep a weak reference to the observer.
   */
  void addObserver(nsINavBookmarkObserver observer, boolean ownsWeak);

  /**
   * Removes a bookmark observer.
   */
  void removeObserver(nsINavBookmarkObserver observer);

  /**
   * Runs the passed callback inside of a database transaction.
   * Use this when a lot of things are about to change, for example
   * adding or deleting a large number of bookmark items. Calls can
   * be nested. Observers are notified when batches begin and end, via 
   * nsINavBookmarkObserver.onBeginUpdateBatch/onEndUpdateBatch.
   *
   * @param aCallback
   *        nsINavHistoryBatchCallback interface to call.
   * @param aUserData
   *        Opaque parameter passed to nsINavBookmarksBatchCallback
   */
  void runInBatchMode(nsINavHistoryBatchCallback aCallback, nsISupports aUserData);

}