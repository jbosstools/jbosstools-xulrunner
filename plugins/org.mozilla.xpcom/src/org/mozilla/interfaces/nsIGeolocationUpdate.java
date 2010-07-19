/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/geolocation/nsIGeolocationProvider.idl
 */

package org.mozilla.interfaces;

/** 
 * Interface provides a way for a geolocation provider to
 * notify the system that a new location is available.
 */
public interface nsIGeolocationUpdate extends nsISupports {

  String NS_IGEOLOCATIONUPDATE_IID =
    "{b89d7227-9f04-4236-a582-25a3f2779d72}";

  /**
   * Notify the geolocation service that a new geolocation
   * has been discovered.
   * This must be called on the main thread
   */
  void update(nsIDOMGeoPosition position);

}