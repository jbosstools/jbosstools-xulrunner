/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/exthelper/extIApplication.idl
 */

package org.mozilla.interfaces;

/**
 * Interface used as a callback for listening to events.
 */
public interface extIEventListener extends nsISupports {

  String EXTIEVENTLISTENER_IID =
    "{2dfe3a50-ab2f-11db-abbd-0800200c9a66}";

  /**
   * This method is called whenever an event occurs of the type for which 
   * the extIEventListener interface was registered.
   *
   * @param   aEvent
   *          The extIEventItem associated with the event.
   */
  void handleEvent(extIEventItem aEvent);

}