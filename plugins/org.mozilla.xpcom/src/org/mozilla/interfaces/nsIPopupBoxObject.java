/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/xul/base/public/nsIPopupBoxObject.idl
 */

package org.mozilla.interfaces;

public interface nsIPopupBoxObject extends nsISupports {

  String NS_IPOPUPBOXOBJECT_IID =
    "{a41af368-9f73-4d73-a058-49dd7e41f9ea}";

  /**
   *  This method is deprecated. Use openPopup or openPopupAtScreen instead.
   */
  void showPopup(nsIDOMElement srcContent, nsIDOMElement popupContent, int xpos, int ypos, String popupType, String anchorAlignment, String popupAlignment);

  /**
   *  Hide the popup if it is open.
   */
  void hidePopup();

  /** 
   * Allow the popup to automatically position itself.
   */
  boolean getAutoPosition();

  /** 
   * Allow the popup to automatically position itself.
   */
  void setAutoPosition(boolean aAutoPosition);

  /**
   * If keyboard navigation is enabled, the keyboard may be used to navigate
   * the menuitems on the popup. Enabling keyboard navigation is the default
   * behaviour and will install capturing key event listeners on the popup
   * that do not propagate key events to the contents. If you wish to place
   * elements in a popup which accept key events, such as textboxes, keyboard
   * navigation should be disabled.
   *
   * Setting ignorekeys="true" on the popup element also disables keyboard
   * navigation, and is recommended over calling this method.
   */
  void enableKeyboardNavigator(boolean enableKeyboardNavigator);

  /** 
   * Enable automatic popup dismissal. This only has effect when called
   * on an open popup.
   */
  void enableRollup(boolean enableRollup);

  /**
   * Control whether the event that caused the popup to be automatically
   * dismissed ("rolled up") should be consumed, or dispatched as a
   * normal event.  This should be set immediately before calling showPopup()
   * if non-default behavior is desired.
   */
  long ROLLUP_DEFAULT = 0L;

  long ROLLUP_CONSUME = 1L;

  long ROLLUP_NO_CONSUME = 2L;

  void setConsumeRollupEvent(long consume);

  /** 
   * Size the popup to the given dimensions
   */
  void sizeTo(int width, int height);

  /**
   * Move the popup to a point on screen in CSS pixels.
   */
  void moveTo(int left, int top);

  /**
   * Open the popup relative to a specified node at a specific location.
   *
   * The popup may be either anchored to another node or opened freely.
   * To anchor a popup to a node, supply an anchor node and set the position
   * to a string indicating the manner in which the popup should be anchored.
   * Possible values for position are:
   *    before_start, before_end, after_start, after_end,
   *    start_before, start_after, end_before, end_after,
   *    overlap, after_pointer
   *
   * The anchor node does not need to be in the same document as the popup.
   *
   * If the attributesOverride argument is true, the popupanchor, popupalign
   * and position attributes on the popup node override the position value
   * argument. If attributesOverride is false, the attributes are only used
   * if position is empty.
   *
   * For an anchored popup, the x and y arguments may be used to offset the 
   * popup from its anchored position by some distance, measured in CSS pixels.
   * x increases to the right and y increases down. Negative values may also
   * be used to move to the left and upwards respectively.
   *
   * Unanchored popups may be created by supplying null as the anchor node.
   * An unanchored popup appears at the position specified by x and y,
   * relative to the viewport of the document containing the popup node. In
   * this case, position and attributesOverride are ignored.
   *
   * @param anchorElement the node to anchor the popup to, may be null
   * @param position manner is which to anchor the popup to node
   * @param x horizontal offset
   * @param y vertical offset
   * @param isContextMenu true for context menus, false for other popups
   * @param attributesOverride true if popup node attributes override position
   */
  void openPopup(nsIDOMElement anchorElement, String position, int x, int y, boolean isContextMenu, boolean attributesOverride);

  /**
   * Open the popup at a specific screen position specified by x and y. This
   * position may be adjusted if it would cause the popup to be off of the
   * screen. The x and y coordinates are measured in CSS pixels. The monitor
   * selected is determined within the platform specific widget code, but
   * in general, the coordinates are relative to the screen the window
   * containing the popup is on.
   *
   * @param isContextMenu true for context menus, false for other popups
   * @param x horizontal screen position
   * @param y vertical screen position
   */
  void openPopupAtScreen(int x, int y, boolean isContextMenu);

  /**
   * Returns the state of the popup:
   *   closed - the popup is closed
   *   open - the popup is open
   *   showing - the popup is in the process of being shown
   *   hiding - the popup is in the process of being hidden
   */
  String getPopupState();

}