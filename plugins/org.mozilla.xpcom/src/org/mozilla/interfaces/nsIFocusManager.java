/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/base/nsIFocusManager.idl
 */

package org.mozilla.interfaces;

/**
 * The focus manager deals with all focus related behaviour. Only one element
 * in the entire application may have the focus at a time; this element
 * receives any keyboard events. While there is only one application-wide
 * focused element, each nsIDOMWindow maintains a reference to the element
 * that would be focused if the window was active.
 *
 * If the window's reference is to a frame element (iframe, browser,
 * editor), then the child window contains the element that is currently
 * focused. If the window's reference is to a root element, then the root is
 * focused. If a window's reference is null, then no element is focused, yet
 * the window is still focused.
 *
 * The blur event is fired on an element when it loses the application focus.
 * After this blur event, if the focus is moving away from a document, two
 * additional blur events are fired on the old document and window containing
 * the focus respectively.
 *
 * When a new document is focused, two focus events are fired on the new
 * document and window respectively. Then the focus event is fired on an
 * element when it gains the application focus.
 *
 * A special case is that the root element may be focused, yet does not
 * receive the element focus and blur events. Instead a focus outline may be
 * drawn around the document.
 *
 * Blur and focus events do not bubble as per the W3C DOM Events spec.
 */
public interface nsIFocusManager extends nsISupports {

  String NS_IFOCUSMANAGER_IID =
    "{cd6040a8-243f-412a-8a16-0bf2aa1083b9}";

  /**
   * The most active (frontmost) window, or null if no window that is part of
   * the application is active. Setting the activeWindow raises it, and
   * focuses the current child window's current element, if any. Setting this
   * to null or to a non-top-level window throws an NS_ERROR_INVALID_ARG
   * exception.
   */
  nsIDOMWindow getActiveWindow();

  /**
   * The most active (frontmost) window, or null if no window that is part of
   * the application is active. Setting the activeWindow raises it, and
   * focuses the current child window's current element, if any. Setting this
   * to null or to a non-top-level window throws an NS_ERROR_INVALID_ARG
   * exception.
   */
  void setActiveWindow(nsIDOMWindow aActiveWindow);

  /**
   * The child window within the activeWindow that is focused. This will
   * always be activeWindow, a child window of activeWindow or null if no
   * child window is focused. Setting the focusedWindow changes the focused
   * window and raises the toplevel window it is in. If the current focus
   * within the new focusedWindow is a frame element, then the focusedWindow
   * will actually be set to the child window and the current element within
   * that set as the focused element. This process repeats downwards until a
   * non-frame element is found.
   */
  nsIDOMWindow getFocusedWindow();

  /**
   * The child window within the activeWindow that is focused. This will
   * always be activeWindow, a child window of activeWindow or null if no
   * child window is focused. Setting the focusedWindow changes the focused
   * window and raises the toplevel window it is in. If the current focus
   * within the new focusedWindow is a frame element, then the focusedWindow
   * will actually be set to the child window and the current element within
   * that set as the focused element. This process repeats downwards until a
   * non-frame element is found.
   */
  void setFocusedWindow(nsIDOMWindow aFocusedWindow);

  /**
   * The element that is currently focused. This will always be an element
   * within the document loaded in focusedWindow or null if no element in that
   * document is focused.
   */
  nsIDOMElement getFocusedElement();

  /**
   * Returns the method that was used to focus the element in window. This
   * will either be 0, FLAG_BYMOUSE or FLAG_BYKEY. If window is null, then
   * the current focusedWindow will be used by default. This has the result
   * of retrieving the method that was used to focus the currently focused
   * element.
   */
  long getLastFocusMethod(nsIDOMWindow window);

  /**
   * Changes the focused element reference within the window containing
   * aElement to aElement.
   */
  void setFocus(nsIDOMElement aElement, long aFlags);

  /**
   * Move the focus to another element. If aStartElement is specified, then
   * movement is done relative to aStartElement. If aStartElement is null,
   * then movement is done relative to the currently focused element. If no
   * element is focused, focus the first focusable element within the
   * document (or the last focusable element if aType is MOVEFOCUS_END). This
   * method is equivalent to setting the focusedElement to the new element.
   *
   * Specifying aStartElement and using MOVEFOCUS_LAST is not currently
   * implemented.
   *
   * If no element is found, and aType is either MOVEFOCUS_ROOT or
   * MOVEFOCUS_CARET, then the focus is cleared. If aType is any other value,
   * the focus is not changed.
   *
   * Returns the element that was focused.
   */
  nsIDOMElement moveFocus(nsIDOMWindow aWindow, nsIDOMElement aStartElement, long aType, long aFlags);

  /**
   * Clears the focused element within aWindow. If the current focusedWindow
   * is a descendant of aWindow, sets the current focusedWindow to aWindow.
   *
   * @throws NS_ERROR_INVALID_ARG if aWindow is null
   */
  void clearFocus(nsIDOMWindow aWindow);

  /**
   * Returns the currently focused element within aWindow. If aWindow is equal
   * to the current value of focusedWindow, then the returned element will be
   * the application-wide focused element (the value of focusedElement). The
   * return value will be null if no element is focused.
   *
   * If aDeep is true, then child frames are traversed and the return value
   * may be the element within a child descendant window that is focused. If
   * aDeep if false, then the return value will be the frame element if the
   * focus is in a child frame.
   *
   * aFocusedWindow will be set to the currently focused descendant window of
   * aWindow, or to aWindow if aDeep is false. This will be set even if no
   * element is focused.
   *
   * @throws NS_ERROR_INVALID_ARG if aWindow is null
   */
  nsIDOMElement getFocusedElementForWindow(nsIDOMWindow aWindow, boolean aDeep, nsIDOMWindow[] aFocusedWindow);

  /**
   * Moves the selection caret within aWindow to the current focus.
   */
  void moveCaretToFocus(nsIDOMWindow aWindow);

  long FLAG_RAISE = 1L;

  /**
   * Do not scroll the element to focus into view
   */
  long FLAG_NOSCROLL = 2L;

  /**
   * If attempting to change focus in a window that is not focused, do not
   * switch focus to that window. Instead, just update the focus within that
   * window and leave the application focus as is. This flag will have no
   * effect if a child window is focused and an attempt is made to adjust the
   * focus in an ancestor, as the frame must be switched in this case.
   */
  long FLAG_NOSWITCHFRAME = 4L;

  /**
   * Focus is changing due to a mouse operation, for instance the mouse was
   * clicked on an element.
   */
  long FLAG_BYMOUSE = 4096L;

  /**
   * Focus is changing due to a key operation, for instance pressing the tab
   * key. This flag would normally be passed when MOVEFOCUS_FORWARD or
   * MOVEFOCUS_BACKWARD is used.
   */
  long FLAG_BYKEY = 8192L;

  /**
   * Focus is changing due to a call to MoveFocus. This flag will be implied
   * when MoveFocus is called except when one of the other mechanisms (mouse
   * or key) is specified, or when the type is MOVEFOCUS_ROOT or
   * MOVEFOCUS_CARET.
   */
  long FLAG_BYMOVEFOCUS = 16384L;

  /** move focus forward one element, used when pressing TAB */
  long MOVEFOCUS_FORWARD = 1L;

  /** move focus backward one element, used when pressing Shift+TAB */
  long MOVEFOCUS_BACKWARD = 2L;

  /** move focus forward to the next frame document, used when pressing F6 */
  long MOVEFOCUS_FORWARDDOC = 3L;

  /** move focus forward to the previous frame document, used when pressing Shift+F6 */
  long MOVEFOCUS_BACKWARDDOC = 4L;

  /** move focus to the first focusable element */
  long MOVEFOCUS_FIRST = 5L;

  /** move focus to the last focusable element */
  long MOVEFOCUS_LAST = 6L;

  /** move focus to the root element in the document */
  long MOVEFOCUS_ROOT = 7L;

  /** move focus to a link at the position of the caret. This is a special value used to
   *  focus links as the caret moves over them in caret browsing mode.
   */
  long MOVEFOCUS_CARET = 8L;

}