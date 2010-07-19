/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/storage/nsIDOMStorageObsolete.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMStorageObsolete extends nsISupports {

  String NS_IDOMSTORAGEOBSOLETE_IID =
    "{18013cf9-b104-49cf-9484-c2a7a845457e}";

  /**
   * The number of keys stored.
   */
  long getLength();

  /**
   * Retrieve the name of the key at a particular index.
   *
   * @param index index of the item to retrieve
   * @returns the key at index
   * @throws INDEX_SIZE_ERR if there is no key at that index
   */
  String key(long index);

  /**
   * Retrieve an item with a given key
   *
   * @param key key to retrieve
   * @returns found item or null if the key was not found
   */
  nsIDOMStorageItem getItem(String key);

  /**
   * Assign a value with a key. If the key does not exist already, a new
   * key is added associated with that value. If the key already exists,
   * then the existing value is replaced with a new value.
   *
   * @param key key to set
   * @param data data to associate with the key
   */
  void setItem(String key, String data);

  /**
   * Remove a key and its corresponding value.
   *
   * @param key key to remove
   */
  void removeItem(String key);

}