/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMOrientationEvent.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMOrientationEvent extends nsIDOMEvent {

  String NS_IDOMORIENTATIONEVENT_IID =
    "{1618546a-c176-40a2-9086-2d973acceeb1}";

  void initOrientationEvent(String eventTypeArg, boolean canBubbleArg, boolean cancelableArg, double x, double y, double z);

  double getX();

  double getY();

  double getZ();

}