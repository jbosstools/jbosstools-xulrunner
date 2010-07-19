/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/uriloader/prefetch/nsIOfflineCacheUpdate.idl
 */

package org.mozilla.interfaces;

public interface nsIOfflineCacheUpdate extends nsISupports {

  String NS_IOFFLINECACHEUPDATE_IID =
    "{877261bb-b952-4d27-847e-859bdd47c0ec}";

  /**
 * An nsIOfflineCacheUpdate is used to update an application's offline
 * resources.
 *
 * It can be used to perform partial or complete updates.
 *
 * Each update object maintains a list of nsIDOMLoadStatus items for the
 * resources it is updating.  The list of these items will be available
 * after the object is scheduled.
 *
 * One update object will be updating at a time.  The active object will
 * load its items one by one, sending itemCompleted() to any registered
 * observers.
 */
/**
   * Fetch the status of the running update.  This will return a value
   * defined in nsIDOMOfflineResourceList.
   */
  int getStatus();

  /**
   * TRUE if the update is being used to add specific resources.
   * FALSE if the complete cache update process is happening.
   */
  boolean getPartial();

  /**
   * TRUE if this is an upgrade attempt, FALSE if it is a new cache
   * attempt.
   */
  boolean getIsUpgrade();

  /**
   * The domain being updated, and the domain that will own any URIs added
   * with this update.
   */
  String getUpdateDomain();

  /**
   * The manifest for the offline application being updated.
   */
  nsIURI getManifestURI();

  /**
   * TRUE if the cache update completed successfully.
   */
  boolean getSucceeded();

  /**
   * Initialize the update.
   *
   * @param aManifestURI
   *        The manifest URI to be checked.
   * @param aDocumentURI
   *        The page that is requesting the update.
   */
  void init(nsIURI aManifestURI, nsIURI aDocumentURI);

  /**
   * Initialize the update for partial processing. 
   *
   * @param aManifestURI
   *        The manifest URI of the related cache.
   * @param aClientID
   *        Client  ID of the cache to store resource to. This ClientID
   *        must be ID of cache in the cache group identified by
   *        the manifest URI passed in the first parameter.
   * @param aDocumentURI
   *        The page that is requesting the update. May be null 
   *        when this information is unknown.
   */
  void initPartial(nsIURI aManifestURI, String aClientID, nsIURI aDocumentURI);

  /**
   * Add a dynamic URI to the offline cache as part of the update.
   *
   * @param aURI
   *        The URI to add.
   */
  void addDynamicURI(nsIURI aURI);

  /**
   * Add the update to the offline update queue.  An offline-cache-update-added
   * event will be sent to the observer service.
   */
  void schedule();

  /**
   * Access to the list of items in the update.
   */
  long getCount();

  nsIDOMLoadStatus item(long index);

  /**
   * Observe loads that are added to the update.
   *
   * @param aObserver
   *        object that notifications will be sent to.
   * @param aHoldWeak
   *        TRUE if you want the update to hold a weak reference to the
   *        observer, FALSE for a strong reference.
   */
  void addObserver(nsIOfflineCacheUpdateObserver aObserver, boolean aHoldWeak);

  /**
   * Remove an observer from the update.
   *
   * @param aObserver
   *        the observer to remove.
   */
  void removeObserver(nsIOfflineCacheUpdateObserver aObserver);

}