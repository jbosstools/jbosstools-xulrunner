/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/exthelper/extIApplication.idl
 */

package org.mozilla.interfaces;

public interface extISessionStorage extends nsISupports {

  String EXTISESSIONSTORAGE_IID =
    "{0787ac44-29b9-4889-b97f-13573aec6971}";

  /**
 * Interface representing a simple storage system
 */
/**
   * The events object for the storage
   * supports: "change"
   */
  extIEvents getEvents();

  /**
   * Determines if a storage item exists with the given name.
   * @param   aName
   *          The name of an item
   * @returns true if an item exists with the given name,
   *          false otherwise.
   */
  boolean has(String aName);

  /**
   * Sets the value of a storage item with the given name.
   * @param   aName
   *          The name of an item
   * @param   aValue
   *          The value to assign to the item
   */
  void set(String aName, nsIVariant aValue);

  /**
   * Gets the value of a storage item with the given name. Returns a
   * default value if the item does not exist.
   * @param   aName
   *          The name of an item
   * @param   aDefaultValue
   *          The value to return if no item exists with the given name
   * @returns value of the item or the given default value if no item
   *          exists with the given name.
   */
  nsIVariant get(String aName, nsIVariant aDefaultValue);

}