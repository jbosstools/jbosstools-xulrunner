/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/storage/nsIDOMStorageWindow.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMStorageWindow extends nsISupports {

  String NS_IDOMSTORAGEWINDOW_IID =
    "{a44581fe-dd9b-4fd7-9893-00c4ab43f12e}";

  /**
   * Session storage for the current browsing context.
   */
  nsIDOMStorage getSessionStorage();

  /**
   * Global storage, accessible by domain.
   */
  nsIDOMStorageList getGlobalStorage();

  /**
   * Local storage for the current browsing context.
   */
  nsIDOMStorage getLocalStorage();

}