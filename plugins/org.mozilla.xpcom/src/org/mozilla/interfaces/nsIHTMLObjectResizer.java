/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/idl/nsIHTMLObjectResizer.idl
 */

package org.mozilla.interfaces;

public interface nsIHTMLObjectResizer extends nsISupports {

  String NS_IHTMLOBJECTRESIZER_IID =
    "{8b396020-69d3-451f-80c1-1a96a7da25a9}";

  short eTopLeft = 0;

  short eTop = 1;

  short eTopRight = 2;

  short eLeft = 3;

  short eRight = 4;

  short eBottomLeft = 5;

  short eBottom = 6;

  short eBottomRight = 7;

  /**
   * the element currently displaying resizers
   */
  nsIDOMElement getResizedObject();

  /**
   * a boolean indicating if object resizing is enabled in the editor
   */
  boolean getObjectResizingEnabled();

  /**
   * a boolean indicating if object resizing is enabled in the editor
   */
  void setObjectResizingEnabled(boolean aObjectResizingEnabled);

  /**
   * Shows active resizers around an element's frame
   * @param aResizedElement [IN] a DOM Element
   */
  void showResizers(nsIDOMElement aResizedElement);

  /**
   * Hide resizers if they are visible
   */
  void hideResizers();

  /**
   * Refresh visible resizers
   */
  void refreshResizers();

  /**
   * event callback when a mouse button is pressed
   * @param aX      [IN] horizontal position of the pointer
   * @param aY      [IN] vertical position of the pointer
   * @param aTarget [IN] the element triggering the event
   * @param aMouseEvent [IN] the event
   */
  void mouseDown(int aX, int aY, nsIDOMElement aTarget, nsIDOMEvent aMouseEvent);

  /**
   * event callback when a mouse button is released
   * @param aX      [IN] horizontal position of the pointer
   * @param aY      [IN] vertical position of the pointer
   * @param aTarget [IN] the element triggering the event
   */
  void mouseUp(int aX, int aY, nsIDOMElement aTarget);

  /**
   * event callback when the mouse pointer is moved
   * @param aMouseEvent [IN] the event
   */
  void mouseMove(nsIDOMEvent aMouseEvent);

  /**
   * Creates a resize listener that can be used to get notifications
   * that the user started to resize an object or finalized such an operation
   * @param aListener [IN] an instance of nsIHTMLObjectResizeListener
   */
  void addObjectResizeEventListener(nsIHTMLObjectResizeListener aListener);

  /**
   * Deletes a resize listener
   * @param aListener [IN] an instance of nsIHTMLObjectResizeListener
   */
  void removeObjectResizeEventListener(nsIHTMLObjectResizeListener aListener);

}