/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsIAccelerometer.idl
 */

package org.mozilla.interfaces;

public interface nsIAccelerometer extends nsISupports {

  String NS_IACCELEROMETER_IID =
    "{4b04e228-0b33-43fc-971f-af60cedb1c21}";

  void addListener(nsIAccelerationListener aListener);

  void removeListener(nsIAccelerationListener aListener);

  void addWindowListener(nsIDOMWindow aWindow);

  void removeWindowListener(nsIDOMWindow aWindow);

}