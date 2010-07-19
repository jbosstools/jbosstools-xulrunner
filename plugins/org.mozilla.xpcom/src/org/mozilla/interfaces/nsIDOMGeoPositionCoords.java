/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/geolocation/nsIDOMGeoPositionCoords.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMGeoPositionCoords extends nsISupports {

  String NS_IDOMGEOPOSITIONCOORDS_IID =
    "{b31702d0-6dac-4fa0-b93b-f043e71c8f9a}";

  double getLatitude();

  double getLongitude();

  double getAltitude();

  double getAccuracy();

  double getAltitudeAccuracy();

  double getHeading();

  double getSpeed();

}