/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsISelection2.idl
 */

package org.mozilla.interfaces;

public interface nsISelection2 extends nsISelection {

  String NS_ISELECTION2_IID =
    "{5d21d5fe-3691-4716-a334-4691eea54d29}";

  /**
   * Returns the type of the selection (see nsISelectionController for
   * available constants).
   */
  short getType();

  /**
   * Return array of ranges intersecting with the given DOM interval.
   */
  nsIDOMRange[] getRangesForInterval(nsIDOMNode beginNode, int beginOffset, nsIDOMNode endNode, int endOffset, boolean allowAdjacent, long[] resultCount);

  /**
   * Scrolls a region of the selection, so that it is visible in
   * the scrolled view.
   *
   * @param aRegion - the region inside the selection to scroll into view
   *                  (see selection region constants defined in
   *                   nsISelectionController).
   * @param aIsSynchronous - when true, scrolls the selection into view
   *                         before returning. If false, posts a request which
   *                         is processed at some point after the method returns.
   * @param aVPercent - how to align the frame vertically. A value of 0
   *                   means the frame's upper edge is aligned with the top edge
   *                   of the visible area. A value of 100 means the frame's
   *                   bottom edge is aligned with the bottom edge of
   *                   the visible area. For values in between, the point
   *                   "aVPercent" down the frame is placed at the point
   *                   "aVPercent" down the visible area. A value of 50 centers
   *                   the frame vertically. A value of -1 means move
   *                   the frame the minimum amount necessary in order for
   *                   the entire frame to be visible vertically (if possible).
   * @param aHPercent - how to align the frame horizontally. A value of 0
   *                    means the frame's left edge is aligned with the left
   *                    edge of the visible area. A value of 100 means the
   *                    frame's right edge is aligned with the right edge of
   *                    the visible area. For values in between, the point
   *                    "aHPercent" across the frame is placed at the point
   *                    "aHPercent" across the visible area. A value of 50
   *                    centers the frame horizontally . A value of -1 means
   *                    move the frame the minimum amount necessary in order
   *                    for the entire frame to be visible horizontally
   *                    (if possible).
   */
  void scrollIntoView(short aRegion, boolean aIsSynchronous, short aVPercent, short aHPercent);

}