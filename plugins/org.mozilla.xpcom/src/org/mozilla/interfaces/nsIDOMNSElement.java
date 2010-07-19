/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMNSElement.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMNSElement extends nsISupports {

  String NS_IDOMNSELEMENT_IID =
    "{c9da11bc-32d4-425e-a91f-7e0939c39251}";

  nsIDOMNodeList getElementsByClassName(String classes);

  nsIDOMClientRectList getClientRects();

  /**
   * Returns the union of all rectangles in the getClientRects() list. Empty
   * rectangles are ignored, except that if all rectangles are empty,
   * we return an empty rectangle positioned at the top-left of the first
   * rectangle in getClientRects().
   */
  nsIDOMClientRect getBoundingClientRect();

  /**
   * The vertical scroll position of the element, or 0 if the element is not
   * scrollable. This property may be assigned a value to change the
   * vertical scroll position.
   */
  int getScrollTop();

  /**
   * The vertical scroll position of the element, or 0 if the element is not
   * scrollable. This property may be assigned a value to change the
   * vertical scroll position.
   */
  void setScrollTop(int aScrollTop);

  /**
   * The horizontal scroll position of the element, or 0 if the element is not
   * scrollable. This property may be assigned a value to change the
   * horizontal scroll position.
   */
  int getScrollLeft();

  /**
   * The horizontal scroll position of the element, or 0 if the element is not
   * scrollable. This property may be assigned a value to change the
   * horizontal scroll position.
   */
  void setScrollLeft(int aScrollLeft);

  /**
   * The height of the scrollable area of the element. If the element is not
   * scrollable, scrollHeight is equivalent to the offsetHeight.
   */
  int getScrollHeight();

  /**
   * The width of the scrollable area of the element. If the element is not
   * scrollable, scrollWidth is equivalent to the offsetWidth.
   */
  int getScrollWidth();

  /**
   * The height in CSS pixels of the element's top border.
   */
  int getClientTop();

  /**
   * The width in CSS pixels of the element's left border and scrollbar
   * if it is present on the left side.
   */
  int getClientLeft();

  /**
   * The width in CSS pixels of the element's padding box. If the element is
   * scrollable, the scroll bars are included inside this height.
   */
  int getClientHeight();

  /**
   * The height in CSS pixels of the element's padding box. If the element is
   * scrollable, the scroll bars are included inside this width.
   */
  int getClientWidth();

  /**
   * Similar as the attributes on nsIDOMNode, but navigates just elements
   * rather than all nodes.
   *
   * Defined by the ElementTraversal spec.
   */
  nsIDOMElement getFirstElementChild();

  nsIDOMElement getLastElementChild();

  nsIDOMElement getPreviousElementSibling();

  nsIDOMElement getNextElementSibling();

  /**
   * Returns the number of child nodes that are nsIDOMElements.
   *
   * Defined by the ElementTraversal spec.
   */
  long getChildElementCount();

  /**
   * Returns a live nsIDOMNodeList of the current child elements.
   */
  nsIDOMNodeList getChildren();

  /**
   * Returns a DOMTokenList object reflecting the class attribute.
   */
  nsIDOMDOMTokenList getClassList();

  /**
   * Returns whether this element would be selected by the given selector string.
   *
   * See http://dev.w3.org/2006/webapi/selectors-api2/#matchtesting
   */
  boolean mozMatchesSelector(String selector);

}