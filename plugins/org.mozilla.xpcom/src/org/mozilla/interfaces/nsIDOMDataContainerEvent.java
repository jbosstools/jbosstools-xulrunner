/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMDataContainerEvent.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMDataContainerEvent extends nsIDOMEvent {

  String NS_IDOMDATACONTAINEREVENT_IID =
    "{3600d66c-b9ac-4c22-b39a-d64cce619921}";

  /**
   * Return the data associated with the given key.
   *
   * @param  key  the key
   * @return      the data associated with the key
   */
  nsIVariant getData(String key);

  /**
   * Set the data for the given key.
   *
   * @param  key   the data key
   * @param  data  the data
   * @throws       NS_ERROR_UNEXPECTED if the method is called during event
   *               dispatch
   */
  void setData(String key, nsIVariant data);

}