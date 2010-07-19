/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMSimpleGestureEvent.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMSimpleGestureEvent interface is the datatype for all
 * Mozilla-specific simple gesture events in the Document Object Model.
 *
 * The following events are generated:
 *
 * MozSwipeGesture - Generated when the user completes a swipe across
 * across the input device.
 *
 * MozMagnifyGestureStart - Generated when the user begins the magnify
 * ("pinch") gesture.  The "delta" value represents the initial
 * movement.
 *
 * MozMagnifyGestureUpdate - Generated periodically while the user is
 * continuing the magnify ("pinch") gesture.  The "delta" value
 * represents the movement since the last MozMagnifyGestureStart or
 * MozMagnifyGestureUpdate event.
 *
 * MozMagnifyGesture - Generated when the user has completed the
 * magnify ("pinch") gesture.  If you only want to receive a single
 * event when the magnify gesture is complete, you only need to hook
 * this event and can safely ignore the MozMagnifyGestureStart and the
 * MozMagnifyGestureUpdate events. The "delta" value is the cumulative
 * amount represented by the user's gesture.
 *
 * MozRotateGestureStart - Generated when the user begins the rotation
 * gesture.  The "delta" value represents the initial rotation.
 *
 * MozRotateGestureUpdate - Generated periodically while the user is
 * continuing the rotation gesture.  The "delta" value represents the
 * rotation since the last MozRotateGestureStart or
 * MozRotateGestureUpdate event.
 *
 * MozRotateGesture - Generated when the user has completed the
 * rotation gesture.  If you only want to receive a single event when
 * the rotation gesture is complete, you only need to hook this event
 * and can safely ignore the MozRotateGestureStart and the
 * MozRotateGestureUpdate events.  The "delta" value is the cumulative
 * amount of rotation represented by the user's gesture.
 *
 * MozTapGesture - Generated when the user executes a two finger
 * tap gesture on the input device. Client coordinates contain the
 * center point of the tap.
 * (XXX Not implemented on Mac)
 *
 * MozPressTapGesture - Generated when the user executes a press
 * and tap two finger gesture (first finger down, second finger down,
 * second finger up, first finger up) on the input device.
 * Client coordinates contain the center pivot point of the action.
 * (XXX Not implemented on Mac)
 *
 * Default behavior:
 *
 * Some operating systems support default behaviors for gesture events
 * when they are not handled by the application. Consumers should
 * use event.preventDefault() to prevent default behavior when
 * consuming events.
 */
public interface nsIDOMSimpleGestureEvent extends nsIDOMMouseEvent {

  String NS_IDOMSIMPLEGESTUREEVENT_IID =
    "{cb68e879-f710-415d-a871-9a550860df01}";

  long DIRECTION_UP = 1L;

  long DIRECTION_DOWN = 2L;

  long DIRECTION_LEFT = 4L;

  long DIRECTION_RIGHT = 8L;

  long ROTATION_COUNTERCLOCKWISE = 1L;

  long ROTATION_CLOCKWISE = 2L;

  long getDirection();

  double getDelta();

  void initSimpleGestureEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, nsIDOMAbstractView viewArg, int detailArg, int screenXArg, int screenYArg, int clientXArg, int clientYArg, boolean ctrlKeyArg, boolean altKeyArg, boolean shiftKeyArg, boolean metaKeyArg, int buttonArg, nsIDOMEventTarget relatedTargetArg, long directionArg, double deltaArg);

}