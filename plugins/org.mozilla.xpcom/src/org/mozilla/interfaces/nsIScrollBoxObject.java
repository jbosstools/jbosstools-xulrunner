/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/xul/base/public/nsIScrollBoxObject.idl
 */

package org.mozilla.interfaces;

public interface nsIScrollBoxObject extends nsISupports {

  String NS_ISCROLLBOXOBJECT_IID =
    "{56e2ada8-4631-11d4-ba11-001083023c1e}";

  /**
   * Scroll to the given coordinates, in css pixels.
   * (0,0) will put the top left corner of the scrolled element's padding-box
   * at the top left corner of the scrollport (which is its inner-border-box).
   * Values will be clamped to legal values.
   */
  void scrollTo(int x, int y);

  /**
   * Scroll the given amount of device pixels to the right and down.
   * Values will be clamped to make the resuling position legal.
   */
  void scrollBy(int dx, int dy);

  void scrollByLine(int dlines);

  void scrollByIndex(int dindexes);

  void scrollToLine(int line);

  void scrollToElement(nsIDOMElement child);

  void scrollToIndex(int index);

  /**
   * Get the current scroll position in css pixels.
   * @see scrollTo for the definition of x and y.
   */
  void getPosition(int[] x, int[] y);

  void getScrolledSize(int[] width, int[] height);

  void ensureElementIsVisible(nsIDOMElement child);

  void ensureIndexIsVisible(int index);

  void ensureLineIsVisible(int line);

}