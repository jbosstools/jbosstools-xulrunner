/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/uriloader/prefetch/nsIOfflineCacheUpdate.idl
 */

package org.mozilla.interfaces;

public interface nsIOfflineCacheUpdateService extends nsISupports {

  String NS_IOFFLINECACHEUPDATESERVICE_IID =
    "{6fd2030f-7b00-4102-a0e3-d73078821eb1}";

  /**
     * Constants for the offline-app permission.
     *
     * XXX: This isn't a great place for this, but it's really the only
     * private offline-app-related interface
     */
/**
     * Allow the domain to use offline APIs, and don't warn about excessive
     * usage.
     */
  long ALLOW_NO_WARN = 3L;

  /**
     * Access to the list of cache updates that have been scheduled.
     */
  long getNumUpdates();

  nsIOfflineCacheUpdate getUpdate(long index);

  /**
     * Schedule a cache update for a given offline manifest.  If an
     * existing update is scheduled or running, that update will be returned.
     * Otherwise a new update will be scheduled.
     */
  nsIOfflineCacheUpdate scheduleUpdate(nsIURI aManifestURI, nsIURI aDocumentURI);

  /**
     * Schedule a cache update for a manifest when the document finishes
     * loading.
     */
  void scheduleOnDocumentStop(nsIURI aManifestURI, nsIURI aDocumentURI, nsIDOMDocument aDocument);

  /**
     * Checks whether a principal should have access to the offline
     * cache.
     * @param aPrincipal
     *        The principal to check.
     * @param aPrefBranch
     *        The pref branch to use to check the
     *        offline-apps.allow_by_default pref.  If not specified,
     *        the pref service will be used.
     */
  boolean offlineAppAllowed(nsIPrincipal aPrincipal, nsIPrefBranch aPrefBranch);

  /**
     * Checks whether a document at the given URI should have access
     * to the offline cache.
     * @param aURI
     *        The URI to check
     * @param aPrefBranch
     *        The pref branch to use to check the
     *        offline-apps.allow_by_default pref.  If not specified,
     *        the pref service will be used.
     */
  boolean offlineAppAllowedForURI(nsIURI aURI, nsIPrefBranch aPrefBranch);

}