/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMNotifyPaintEvent.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMNotifyPaintEvent interface is used for the MozDOMAfterPaint
 * event, which fires at a window when painting has happened in
 * that window.
 */
public interface nsIDOMNotifyPaintEvent extends nsIDOMEvent {

  String NS_IDOMNOTIFYPAINTEVENT_IID =
    "{792e5779-7c39-4817-91a7-fdb3fba6428f}";

  /**
   * Get a list of rectangles which are affected. The rectangles are in CSS pixels
   * relative to the viewport origin.
   * If the caller is not trusted (e.g., regular Web content) then only painting
   * caused by the current document is reported; in particular, painting in subdocuments
   * is not reported.
   */
  nsIDOMClientRectList getClientRects();

  /**
   * Get the bounding box of the rectangles which are affected. The rectangle
   * is in CSS pixels relative to the viewport origin.
   * If the caller is not trusted (e.g., regular Web content) then only painting
   * caused by the current document is reported; in particular, painting in subdocuments
   * is not reported.
   */
  nsIDOMClientRect getBoundingClientRect();

  nsIDOMPaintRequestList getPaintRequests();

}