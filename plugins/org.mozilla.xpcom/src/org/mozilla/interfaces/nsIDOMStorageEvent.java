/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/storage/nsIDOMStorageEvent.idl
 */

package org.mozilla.interfaces;

/**
 * Interface for a client side storage. See
 * http://www.whatwg.org/specs/web-apps/current-work/#scs-client-side
 * for more information.
 *
 * Event sent to a window when a storage area changes.
 */
public interface nsIDOMStorageEvent extends nsIDOMEvent {

  String NS_IDOMSTORAGEEVENT_IID =
    "{fc540c28-8edd-4b7a-9c30-8638289b7a7d}";

  /**
   * Domain of the storage area which changed, or #session for
   * session storage.
   */
  String getDomain();

  /**
   * Initialize a storage event.
   */
  void initStorageEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, String domainArg);

  /**
   * Initialize a storage event.
   */
  void initStorageEventNS(String namespaceURIArg, String typeArg, boolean canBubbleArg, boolean cancelableArg, String domainArg);

}