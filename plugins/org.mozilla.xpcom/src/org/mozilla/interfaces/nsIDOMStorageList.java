/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/storage/nsIDOMStorageList.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMStorageList extends nsISupports {

  String NS_IDOMSTORAGELIST_IID =
    "{a4e9b257-5ccf-4b17-8721-23ac45c83128}";

  /**
   * Returns a storage object for a particular domain.
   *
   * @param domain domain to retrieve
   * @returns a storage area for the given domain
   */
  nsIDOMStorageObsolete namedItem(String domain);

}