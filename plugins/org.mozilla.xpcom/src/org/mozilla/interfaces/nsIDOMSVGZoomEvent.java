/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGZoomEvent.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGZoomEvent extends nsIDOMUIEvent {

  String NS_IDOMSVGZOOMEVENT_IID =
    "{339a8c7a-552e-4cbc-8d96-8370a3939358}";

  nsIDOMSVGRect getZoomRectScreen();

  float getPreviousScale();

  nsIDOMSVGPoint getPreviousTranslate();

  float getNewScale();

  nsIDOMSVGPoint getNewTranslate();

}