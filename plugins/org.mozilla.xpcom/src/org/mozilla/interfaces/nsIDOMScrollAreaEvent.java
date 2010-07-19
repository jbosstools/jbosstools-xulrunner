/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMScrollAreaEvent.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMScrollAreaEvent extends nsIDOMUIEvent {

  String NS_IDOMSCROLLAREAEVENT_IID =
    "{b2f49035-4a2f-4e62-8fb0-deb68b0de4d9}";

  float getX();

  float getY();

  float getWidth();

  float getHeight();

  void initScrollAreaEvent(String aEventType, boolean aCanBubble, boolean aCancelable, nsIDOMAbstractView aView, int aDetail, float x, float y, float width, float height);

}