/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMMessageEvent.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMMessageEvent interface is used for server-sent events and for
 * cross-domain messaging.
 *
 * For more information on this interface, please see
 * http://www.whatwg.org/specs/web-apps/current-work/#messageevent
 */
public interface nsIDOMMessageEvent extends nsIDOMEvent {

  String NS_IDOMMESSAGEEVENT_IID =
    "{98150805-6a15-4667-815a-1a8c87cb4bbc}";

  /**
   * Custom string data associated with this event.
   */
  String getData();

  /**
   * The origin of the site from which this event originated, which is the
   * scheme, ":", and if the URI has a host, "//" followed by the
   * host, and if the port is not the default for the given scheme,
   * ":" followed by that port.  This value does not have a trailing slash.
   */
  String getOrigin();

  /**
   * The last event ID string of the event source, for server-sent DOM events; this
   * value is the empty string for cross-origin messaging.
   */
  String getLastEventId();

  /**
   * The window which originated this event.
   */
  nsIDOMWindow getSource();

  /**
   * Initializes this event with the given data, in a manner analogous to
   * the similarly-named method on the nsIDOMEvent interface, also setting the
   * data, origin, source, and lastEventId attributes of this appropriately.
   */
  void initMessageEvent(String aType, boolean aCanBubble, boolean aCancelable, String aData, String aOrigin, String aLastEventId, nsIDOMWindow aSource);

  /**
   * Initializes this event with the given data, in a manner analogous to
   * the similarly-named method on the Event interface, also setting the data,
   * origin, source, and lastEventId attributes of this appropriately.
   */
  void initMessageEventNS(String aNamespaceURI, String aType, boolean aCanBubble, boolean aCancelable, String aData, String aOrigin, String aLastEventId, nsIDOMWindow aSource);

}