/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/uriloader/prefetch/nsIOfflineCacheUpdate.idl
 */

package org.mozilla.interfaces;

public interface nsIOfflineCacheUpdateObserver extends nsISupports {

  String NS_IOFFLINECACHEUPDATEOBSERVER_IID =
    "{a28abeaf-a0b4-4440-b2fe-bc78249710ea}";

  /**
   * There was an error updating the cache.
   *
   * @param aUpdate
   *        The nsIOfflineCacheUpdate being processed.
   */
  void error(nsIOfflineCacheUpdate aUpdate);

  /**
   * The manifest is being checked for updates
   *
   * @param aUpdate
   *        The nsIOfflineCacheUpdate being processed.
   */
  void checking(nsIOfflineCacheUpdate aUpdate);

  /**
   * No update was necessary.
   *
   * @param aUpdate
   *        The nsIOfflineCacheUpdate being processed.
   */
  void noUpdate(nsIOfflineCacheUpdate aUpdate);

  /**
   * The cache group is now obsolete.
   *
   * @param aUpdate
   *        The nsIOfflineCacheUpdate being processed.
   */
  void obsolete(nsIOfflineCacheUpdate aUpdate);

  /**
   * Starting to download resources
   *
   * @param aUpdate
   *        The nsIOfflineCacheUpdate being processed.
   */
  void downloading(nsIOfflineCacheUpdate aUpdate);

  /**
   * An item has started downloading.
   *
   * @param aUpdate
   *        The nsIOfflineCacheUpdate being processed.
   * @param aItem
   *        load status for the item that is being downloaded.
   */
  void itemStarted(nsIOfflineCacheUpdate aUpdate, nsIDOMLoadStatus aItem);

  /**
   * An item has finished loading.
   *
   * @param aUpdate
   *        The nsIOfflineCacheUpdate being processed.
   * @param aItem
   *         load status for the item that completed.
   */
  void itemCompleted(nsIOfflineCacheUpdate aUpdate, nsIDOMLoadStatus aItem);

}