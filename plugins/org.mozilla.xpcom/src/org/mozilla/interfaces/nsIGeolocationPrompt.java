/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/geolocation/nsIGeolocationProvider.idl
 */

package org.mozilla.interfaces;

public interface nsIGeolocationPrompt extends nsISupports {

  String NS_IGEOLOCATIONPROMPT_IID =
    "{2300c895-1bee-4297-912c-a57082f3e936}";

  /**
 * Interface provides a way for the application to handle
 * the UI prompts associated with geo position.
 */
/**
   * Called when a request has been made to access geolocation data
   */
  void prompt(nsIGeolocationRequest request);

}