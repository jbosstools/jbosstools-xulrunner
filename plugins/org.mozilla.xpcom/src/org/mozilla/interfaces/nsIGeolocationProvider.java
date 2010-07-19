/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/geolocation/nsIGeolocationProvider.idl
 */

package org.mozilla.interfaces;

/**
 * Interface provides location information to the nsGeolocator
 * via the nsIDOMGeolocationCallback interface.  After
 * startup is called, any geo location change should call
 * callback.update().
 */
public interface nsIGeolocationProvider extends nsISupports {

  String NS_IGEOLOCATIONPROVIDER_IID =
    "{701413ed-0f51-64f7-71c7-4369d8e07d6e}";

  /**
   * Start up the provider.  This is called before any other
   * method.  may be called multiple times.
   */
  void startup();

  /**
   * watch
   * When a location change is observed, notify the callback
   */
  void watch(nsIGeolocationUpdate callback);

  /**
   * shutdown
   * Shuts down the location device.
   */
  void shutdown();

}