/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/geolocation/nsIDOMGeoPositionOptions.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMGeoPositionOptions extends nsISupports {

  String NS_IDOMGEOPOSITIONOPTIONS_IID =
    "{453b72de-ea90-4f09-ae16-c2e7ee0dddc4}";

  boolean getEnableHighAccuracy();

  void setEnableHighAccuracy(boolean aEnableHighAccuracy);

  int getTimeout();

  void setTimeout(int aTimeout);

  int getMaximumAge();

  void setMaximumAge(int aMaximumAge);

}