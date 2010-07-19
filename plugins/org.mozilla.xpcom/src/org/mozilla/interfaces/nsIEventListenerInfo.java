/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/events/public/nsIEventListenerService.idl
 */

package org.mozilla.interfaces;

/**
 * An instance of this interface describes how an event listener
 * was added to an event target.
 */
public interface nsIEventListenerInfo extends nsISupports {

  String NS_IEVENTLISTENERINFO_IID =
    "{cbc2ea6e-4043-4435-ba8f-64cbf6638622}";

  /**
   * The type of the event for which the listener was added.
   */
  String getType();

  boolean getCapturing();

  boolean getAllowsUntrusted();

  boolean getInSystemEventGroup();

  /**
   * Tries to serialize event listener to a string.
   * Returns null if serialization isn't possible
   * (for example with C++ listeners).
   */
  String toSource();

  /**
   * If jsdIDebuggerService is active and the listener is implemented in JS,
   * this returns the listener as a jsdIValue. Otherwise null.
   */
  nsISupports getDebugObject();

}