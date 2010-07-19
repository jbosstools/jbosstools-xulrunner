/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/idl/nsIHTMLAbsPosEditor.idl
 */

package org.mozilla.interfaces;

public interface nsIHTMLAbsPosEditor extends nsISupports {

  String NS_IHTMLABSPOSEDITOR_IID =
    "{91375f52-20e6-4757-9835-eb04fabe5498}";

  /**
   * true if the selection container is absolutely positioned
   */
  boolean getSelectionContainerAbsolutelyPositioned();

  /**
   * this contains the absolutely positioned element currently edited
   * or null
   */
  nsIDOMElement getPositionedElement();

  /**
   * true if Absolute Positioning handling is enabled in the editor
   */
  boolean getAbsolutePositioningEnabled();

  /**
   * true if Absolute Positioning handling is enabled in the editor
   */
  void setAbsolutePositioningEnabled(boolean aAbsolutePositioningEnabled);

  /**
   * true if Snap To Grid is enabled in the editor.
   */
  boolean getSnapToGridEnabled();

  /**
   * true if Snap To Grid is enabled in the editor.
   */
  void setSnapToGridEnabled(boolean aSnapToGridEnabled);

  /**
   * sets the grid size in pixels.
   * @param aSizeInPixels [IN] the size of the grid in pixels
   */
  long getGridSize();

  /**
   * sets the grid size in pixels.
   * @param aSizeInPixels [IN] the size of the grid in pixels
   */
  void setGridSize(long aGridSize);

  /**
   * returns the deepest absolutely positioned container of the selection
   * if it exists or null.
   */
  nsIDOMElement getAbsolutelyPositionedSelectionContainer();

  /**
   * extracts the selection from the normal flow of the document and
   * positions it.
   * @param aEnabled [IN] true to absolutely position the selection,
   *                      false to put it back in the normal flow
   */
  void absolutePositionSelection(boolean aEnabled);

  /**
   * adds aChange to the z-index of the currently positioned element.
   * @param aChange [IN] relative change to apply to current z-index
   */
  void relativeChangeZIndex(int aChange);

  /**
   * extracts an element from the normal flow of the document and
   * positions it, and puts it back in the normal flow.
   * @param aElement [IN] the element
   * @param aEnabled [IN] true to absolutely position the element,
   *                      false to put it back in the normal flow
   */
  void absolutelyPositionElement(nsIDOMElement aElement, boolean aEnabled);

  /**
   * sets the position of an element; warning it does NOT check if the
   * element is already positioned or not and that's on purpose.
   * @param aElement [IN] the element
   * @param aX       [IN] the x position in pixels.
   * @param aY       [IN] the y position in pixels.
   */
  void setElementPosition(nsIDOMElement aElement, int aX, int aY);

  /**
   * returns the absolute z-index of a positioned element. Never returns 'auto'.
   * @return         the z-index of the element
   * @param aElement [IN] the element.
   */
  int getElementZIndex(nsIDOMElement aElement);

  /**
   * sets the z-index of an element.
   * @param aElement [IN] the element
   * @param aZorder  [IN] the z-index
   */
  void setElementZIndex(nsIDOMElement aElement, int aZorder);

  /**
   * adds aChange to the z-index of an arbitrary element.
   * @return         the new z-index of the element
   * @param aElement [IN] the element
   * @param aChange  [IN] relative change to apply to current z-index of
   *                      the element
   */
  int relativeChangeElementZIndex(nsIDOMElement aElement, int aChange);

  /**
   * shows a grabber attached to an arbitrary element. The grabber is an image
   * positioned on the left hand side of the top border of the element. Dragging
   * and dropping it allows to change the element's absolute position in the
   * document. See chrome://editor/content/images/grabber.gif
   * @param aElement [IN] the element
   */
  void showGrabberOnElement(nsIDOMElement aElement);

  /**
   * hide the grabber if it shown.
   */
  void hideGrabber();

  /**
   * refreshes the grabber if it shown, possibly updating its position or
   * even hiding it.
   */
  void refreshGrabber();

}