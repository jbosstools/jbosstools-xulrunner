/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/geolocation/nsIDOMGeoPositionError.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMGeoPositionError extends nsISupports {

  String NS_IDOMGEOPOSITIONERROR_IID =
    "{ad9fa4c8-ec71-4b2d-8294-9adf06ddec32}";

  int PERMISSION_DENIED = 1;

  int POSITION_UNAVAILABLE = 2;

  int TIMEOUT = 3;

  short getCode();

}