/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/geolocation/nsIDOMGeoPosition.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMGeoPosition extends nsISupports {

  String NS_IDOMGEOPOSITION_IID =
    "{23e5269f-4dd7-41c4-b52a-75918694c2de}";

  double getTimestamp();

  nsIDOMGeoPositionCoords getCoords();

  nsIDOMGeoPositionAddress getAddress();

}