/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMNSMouseEvent.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMNSMouseEvent interface extends nsIDOMMouseEvent
 * by providing various information related to the mouse event.
 */
public interface nsIDOMNSMouseEvent extends nsIDOMMouseEvent {

  String NS_IDOMNSMOUSEEVENT_IID =
    "{1b8e528d-7dca-44ee-8ee6-c44594ebcef1}";

  float getMozPressure();

  void initNSMouseEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, nsIDOMAbstractView viewArg, int detailArg, int screenXArg, int screenYArg, int clientXArg, int clientYArg, boolean ctrlKeyArg, boolean altKeyArg, boolean shiftKeyArg, boolean metaKeyArg, int buttonArg, nsIDOMEventTarget relatedTargetArg, float pressure);

}