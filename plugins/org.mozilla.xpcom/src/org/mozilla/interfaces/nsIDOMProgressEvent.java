/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMProgressEvent.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMProgressEvent is used in the media elements (<video> and <audio>
 * to inform of the progress of the media download. It is currently undefined
 * in the HTML5 specification. This implementation is a placeholder until
 * the specification is complete and is compatible with the WebKit ProgressEvent.
 */
public interface nsIDOMProgressEvent extends nsIDOMEvent {

  String NS_IDOMPROGRESSEVENT_IID =
    "{6af7022c-d7f8-414c-a11f-a7918f14052b}";

  boolean getLengthComputable();

  double getLoaded();

  double getTotal();

  void initProgressEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, boolean lengthComputableArg, double loadedArg, double totalArg);

}