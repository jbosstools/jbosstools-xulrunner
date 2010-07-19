/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/exthelper/extIApplication.idl
 */

package org.mozilla.interfaces;

/**
 * Interface for supporting custom events.
 */
public interface extIEvents extends nsISupports {

  String EXTIEVENTS_IID =
    "{3a8ec9d0-ab19-11db-abbd-0800200c9a66}";

  /**
   * Adds an event listener to the list. If multiple identical event listeners
   * are registered on the same event target with the same parameters the
   * duplicate instances are discarded. They do not cause the EventListener
   * to be called twice and since they are discarded they do not need to be
   * removed with the removeListener method.
   *
   * @param   aEvent
   *          The name of an event
   * @param   aListener
   *          The reference to a listener
   */
  void addListener(String aEvent, extIEventListener aListener);

  /**
   * Removes an event listener from the list. Calling remove
   * with arguments which do not identify any currently registered
   * event listener has no effect.
   * @param   aEvent
   *          The name of an event
   * @param   aListener
   *          The reference to a listener
   */
  void removeListener(String aEvent, extIEventListener aListener);

}