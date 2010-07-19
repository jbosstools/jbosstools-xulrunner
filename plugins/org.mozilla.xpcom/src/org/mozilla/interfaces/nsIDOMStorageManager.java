/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/storage/nsIDOMStorageManager.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMStorageManager extends nsISupports {

  String NS_IDOMSTORAGEMANAGER_IID =
    "{c8e54beb-48f3-4538-a0ce-d6229f4d8f45}";

  /**
   * Return the amount of disk space used by a domain.  Usage is checked
   * against the domain of the page that set the key (the owner domain), not
   * the domain of the storage object.
   *
   * @param aOwnerDomain The domain to check.
   * @returns the space usage of the domain, in bytes.
   */
  int getUsage(String aOwnerDomain);

  /**
   * Clear keys owned by offline applications.  All data owned by a domain
   * with the "offline-app" permission will be removed from the database.
   */
  void clearOfflineApps();

  /**
   * Returns instance of localStorage object for aURI's origin.
   * This method ensures there is always only a single instance
   * for a single origin.
   */
  nsIDOMStorage getLocalStorageForPrincipal(nsIPrincipal aPrincipal);

}