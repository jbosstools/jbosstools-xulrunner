/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/storage/nsIDOMStorage.idl
 */

package org.mozilla.interfaces;

/**
 * Interface for client side storage. See
 * http://www.whatwg.org/specs/web-apps/current-work/multipage/structured.html#storage0
 * for more information.
 *
 * A storage object stores an arbitrary set of key-value pairs, which
 * may be retrieved, modified and removed as needed. A key may only
 * exist once within a storage object, and only one value may be
 * associated with a particular key. Keys are stored in a particular
 * order with the condition that this order not change by merely changing
 * the value associated with a key, but the order may change when a
 * key is added or removed.
 */
public interface nsIDOMStorage extends nsISupports {

  String NS_IDOMSTORAGE_IID =
    "{43e5edad-1e02-42c4-9d99-c3d9dee22a20}";

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
   * @returns found data or empty string if the key was not found
   */
  String getItem(String key);

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

  /**
   * Clear the content of this storage bound to a domain
   * or an origin.
   */
  void clear();

}