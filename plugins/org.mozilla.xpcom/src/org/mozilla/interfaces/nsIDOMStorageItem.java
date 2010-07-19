/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/storage/nsIDOMStorageItem.idl
 */

package org.mozilla.interfaces;

/**
 * Interface for a client side storage item. See
 * http://www.whatwg.org/specs/web-apps/current-work/#scs-client-side
 * for more information.
 *
 * A respresentation of a storage object item.
 */
public interface nsIDOMStorageItem extends nsISupports {

  String NS_IDOMSTORAGEITEM_IID =
    "{0cc37c78-4c5f-48e1-adfc-7480b8fe9dc4}";

  /**
   * Indicates whether a key is available only in a secure context.
   */
  boolean getSecure();

  /**
   * Indicates whether a key is available only in a secure context.
   */
  void setSecure(boolean aSecure);

  /**
   * The value associated with the item.
   */
  String getValue();

  /**
   * The value associated with the item.
   */
  void setValue(String aValue);

}