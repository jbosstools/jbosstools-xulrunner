/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMMouseScrollEvent.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMMouseScrollEvent extends nsIDOMMouseEvent {

  String NS_IDOMMOUSESCROLLEVENT_IID =
    "{ba8d1a7e-b475-4542-8d32-01e7ea7b8091}";

  int HORIZONTAL_AXIS = 1;

  int VERTICAL_AXIS = 2;

  int getAxis();

  void initMouseScrollEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, nsIDOMAbstractView viewArg, int detailArg, int screenXArg, int screenYArg, int clientXArg, int clientYArg, boolean ctrlKeyArg, boolean altKeyArg, boolean shiftKeyArg, boolean metaKeyArg, int buttonArg, nsIDOMEventTarget relatedTargetArg, int axis);

}