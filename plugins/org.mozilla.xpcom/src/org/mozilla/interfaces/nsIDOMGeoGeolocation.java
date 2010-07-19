/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/geolocation/nsIDOMGeoGeolocation.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMGeoGeolocation extends nsISupports {

  String NS_IDOMGEOGEOLOCATION_IID =
    "{37687daf-b85f-4e4d-8881-85a0ad24cf78}";

  void getCurrentPosition(nsIDOMGeoPositionCallback successCallback, nsIDOMGeoPositionErrorCallback errorCallback, nsIDOMGeoPositionOptions options);

  int watchPosition(nsIDOMGeoPositionCallback successCallback, nsIDOMGeoPositionErrorCallback errorCallback, nsIDOMGeoPositionOptions options);

  void clearWatch(int watchId);

}