/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/base/nsIDOMWindowUtils.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMWindowUtils extends nsISupports {

  String NS_IDOMWINDOWUTILS_IID =
    "{6a60fde5-a00a-4732-bbea-2787c174c04f}";

  /**
   * Image animation mode of the window. When this attribute's value
   * is changed, the implementation should set all images in the window
   * to the given value. That is, when set to kDontAnimMode, all images
   * will stop animating. The attribute's value must be one of the
   * animationMode values from imgIContainer.
   * @note Images may individually override the window's setting after
   *       the window's mode is set. Therefore images given different modes
   *       since the last setting of the window's mode may behave
   *       out of line with the window's overall mode.
   * @note The attribute's value is the window's overall mode. It may
   *       for example continue to report kDontAnimMode after all images
   *       have subsequently been individually animated.
   * @note Only images immediately in this window are affected;
   *       this is not recursive to subwindows.
   * @see imgIContainer
   */
  int getImageAnimationMode();

  /**
   * Image animation mode of the window. When this attribute's value
   * is changed, the implementation should set all images in the window
   * to the given value. That is, when set to kDontAnimMode, all images
   * will stop animating. The attribute's value must be one of the
   * animationMode values from imgIContainer.
   * @note Images may individually override the window's setting after
   *       the window's mode is set. Therefore images given different modes
   *       since the last setting of the window's mode may behave
   *       out of line with the window's overall mode.
   * @note The attribute's value is the window's overall mode. It may
   *       for example continue to report kDontAnimMode after all images
   *       have subsequently been individually animated.
   * @note Only images immediately in this window are affected;
   *       this is not recursive to subwindows.
   * @see imgIContainer
   */
  void setImageAnimationMode(int aImageAnimationMode);

  /**
   * Whether the charset of the window's current document has been forced by
   * the user.
   * Cannot be accessed from unprivileged context (not content-accessible)
   */
  boolean getDocCharsetIsForced();

  /**
   * Function to get metadata associated with the window's current document
   * @param aName the name of the metadata.  This should be all lowercase.
   * @return the value of the metadata, or the empty string if it's not set
   *
   * Will throw a DOM security error if called without UniversalXPConnect
   * privileges.
   */
  String getDocumentMetadata(String aName);

  /**
   * Force an immediate redraw of this window.  The parameter specifies
   * the number of times to redraw, and the return value is the length,
   * in milliseconds, that the redraws took.  If aCount is not specified
   * or is 0, it is taken to be 1.
   */
  long redraw(long aCount);

  /** Synthesize a mouse event for a window. The event types supported
   *  are: 
   *    mousedown, mouseup, mousemove, mouseover, mouseout, contextmenu
   *
   * Events are sent in coordinates offset by aX and aY from the window.
   *
   * Note that additional events may be fired as a result of this call. For
   * instance, typically a click event will be fired as a result of a
   * mousedown and mouseup in sequence.
   *
   * Normally at this level of events, the mouseover and mouseout events are
   * only fired when the window is entered or exited. For inter-element
   * mouseover and mouseout events, a movemove event fired on the new element
   * should be sufficient to generate the correct over and out events as well.
   *
   * Cannot be accessed from unprivileged context (not content-accessible)
   * Will throw a DOM security error if called without UniversalXPConnect
   * privileges.
   *
   * @param aType event type
   * @param aX x offset in CSS pixels
   * @param aY y offset in CSS pixels
   * @param aButton button to synthesize
   * @param aClickCount number of clicks that have been performed
   * @param aModifiers modifiers pressed, using constants defined in nsIDOMNSEvent
   * @param aIgnoreRootScrollFrame whether the event should ignore viewport bounds
   *                           during dispatch
   */
  void sendMouseEvent(String aType, float aX, float aY, int aButton, int aClickCount, int aModifiers, boolean aIgnoreRootScrollFrame);

  /** Synthesize a mouse scroll event for a window. The event types supported
   *  are: 
   *    DOMMouseScroll
   *    MozMousePixelScroll
   *
   * Events are sent in coordinates offset by aX and aY from the window.
   *
   * Cannot be accessed from unprivileged context (not content-accessible)
   * Will throw a DOM security error if called without UniversalXPConnect
   * privileges.
   *
   * @param aType event type
   * @param aX x offset in CSS pixels
   * @param aY y offset in CSS pixels
   * @param aButton button to synthesize
   * @param aScrollFlags flag bits --- see nsMouseScrollFlags in nsGUIEvent.h
   * @param aDelta the direction and amount to scroll (in lines or pixels,
   * depending on the event type)
   * @param aModifiers modifiers pressed, using constants defined in nsIDOMNSEvent
   */
  void sendMouseScrollEvent(String aType, float aX, float aY, int aButton, int aScrollFlags, int aDelta, int aModifiers);

  /**
   * Synthesize a key event to the window. The event types supported are:
   *   keydown, keyup, keypress
   *
   * Key events generally end up being sent to the focused node.
   *
   * Cannot be accessed from unprivileged context (not content-accessible)
   * Will throw a DOM security error if called without UniversalXPConnect
   * privileges.
   *
   * @param aType event type
   * @param aKeyCode key code
   * @param aCharCode character code
   * @param aModifiers modifiers pressed, using constants defined in nsIDOMNSEvent
   * @param aPreventDefault if true, preventDefault() the event before dispatch
   *
   * @return false if the event had preventDefault() called on it,
   *               true otherwise.  In other words, true if and only if the
   *               default action was taken.
   */
  boolean sendKeyEvent(String aType, int aKeyCode, int aCharCode, int aModifiers, boolean aPreventDefault);

  /**
   * See nsIWidget::SynthesizeNativeKeyEvent
   *
   * Cannot be accessed from unprivileged context (not content-accessible)
   * Will throw a DOM security error if called without UniversalXPConnect
   * privileges.
   */
  void sendNativeKeyEvent(int aNativeKeyboardLayout, int aNativeKeyCode, int aModifierFlags, String aCharacters, String aUnmodifiedCharacters);

  /**
   * See nsIWidget::ActivateNativeMenuItemAt
   *
   * Cannot be accessed from unprivileged context (not content-accessible)
   * Will throw a DOM security error if called without UniversalXPConnect
   * privileges.
   */
  void activateNativeMenuItemAt(String indexString);

  /**
   * See nsIWidget::ForceUpdateNativeMenuAt
   *
   * Cannot be accessed from unprivileged context (not content-accessible)
   * Will throw a DOM security error if called without UniversalXPConnect
   * privileges.
   */
  void forceUpdateNativeMenuAt(String indexString);

  /**
   * Focus the element aElement. The element should be in the same document
   * that the window is displaying. Pass null to blur the element, if any,
   * that currently has focus, and focus the document.
   *
   * Cannot be accessed from unprivileged context (not content-accessible)
   * Will throw a DOM security error if called without UniversalXPConnect
   * privileges.
   *
   * @param aElement the element to focus
   *
   * Do not use this method. Just use element.focus if available or
   * nsIFocusManager::SetFocus instead.
   *
   */
  void focus(nsIDOMElement aElement);

  /**
   * Force a garbage collection. This will run the cycle-collector twice to
   * make sure all garbage is collected.
   *
   * Will throw a DOM security error if called without UniversalXPConnect
   * privileges in non-debug builds. Available to all callers in debug builds.
   */
  void garbageCollect();

  /**
   * Force processing of any queued paints
   */
  void processUpdates();

  /** Synthesize a simple gesture event for a window. The event types
   *  supported are: MozSwipeGesture, MozMagnifyGestureStart,
   *  MozMagnifyGestureUpdate, MozMagnifyGesture, MozRotateGestureStart,
   *  MozRotateGestureUpdate, MozRotateGesture, MozPressTapGesture, and
   *  MozTapGesture.
   *
   * Cannot be accessed from unprivileged context (not
   * content-accessible) Will throw a DOM security error if called
   * without UniversalXPConnect privileges.
   *
   * @param aType event type
   * @param aX x offset in CSS pixels
   * @param aY y offset in CSS pixels
   * @param aDirection direction, using constants defined in nsIDOMSimpleGestureEvent
   * @param aDelta  amount of magnification or rotation for magnify and rotation events
   * @param aModifiers modifiers pressed, using constants defined in nsIDOMNSEvent
   */
  void sendSimpleGestureEvent(String aType, float aX, float aY, long aDirection, double aDelta, int aModifiers);

  /**
   * Retrieve the element at point aX, aY in the window's document.
   *
   * @param aIgnoreRootScrollFrame whether or not to ignore the root scroll
   *        frame when retrieving the element. If false, this method returns
   *        null for coordinates outside of the viewport.
   * @param aFlushLayout flushes layout if true. Otherwise, no flush occurs.
   */
  nsIDOMElement elementFromPoint(int aX, int aY, boolean aIgnoreRootScrollFrame, boolean aFlushLayout);

  /**
   * Compare the two canvases, returning the number of differing pixels and
   * the maximum difference in a channel.  This will throw an error if
   * the dimensions of the two canvases are different.
   *
   * This method requires UniversalXPConnect privileges.
   */
  long compareCanvases(nsIDOMHTMLCanvasElement aCanvas1, nsIDOMHTMLCanvasElement aCanvas2, long[] aMaxDifference);

  /**
   * Returns true if a MozAfterPaint event has been queued but not yet
   * fired.
   */
  boolean getIsMozAfterPaintPending();

  /**
   * Suppresses/unsuppresses user initiated event handling in window's document
   * and subdocuments.
   *
   * @throw NS_ERROR_DOM_SECURITY_ERR if called without UniversalXPConnect
   *        privileges and NS_ERROR_FAILURE if window doesn't have a document.
   */
  void suppressEventHandling(boolean aSuppress);

  void clearMozAfterPaintEvents();

  /**
   * Disable or enable non synthetic test mouse events on *all* windows.
   *
   * Cannot be accessed from unprivileged context (not content-accessible).
   * Will throw a DOM security error if called without UniversalXPConnect
   * privileges.
   *
   * @param aDisable  If true, disable all non synthetic test mouse events
   *               on all windows.  Otherwise, enable them.
   */
  void disableNonTestMouseEvents(boolean aDisable);

  /**
   * Returns the scroll position of the window's currently loaded document.
   *
   * @param aFlushLayout flushes layout if true. Otherwise, no flush occurs.
   * @see nsIDOMWindow::scrollX/Y
   */
  void getScrollXY(boolean aFlushLayout, int[] aScrollX, int[] aScrollY);

  /**
   * Creates a ChromeObjectWrapper for the object and returns it.
   *
   * @param scope The JavaScript object whose scope we'll use as the
   *        parent of the wrapper.
   * @param objToWrap The JavaScript object to wrap.
   * @return the wrapped object.
   */
  void getCOWForObject();

  /**
   * Get IME open state. TRUE means 'Open', otherwise, 'Close'.
   * This property works only when IMEEnabled is IME_STATUS_ENABLED.
   */
  boolean getIMEIsOpen();

  /**
   * WARNING: These values must be same as nsIWidget's values.
   */
/**
   * DISABLED means users cannot use IME completely.
   * Note that this state is *not* same as |ime-mode: disabled;|.
   */
  long IME_STATUS_DISABLED = 0L;

  /**
   * ENABLED means users can use all functions of IME. This state is same as
   * |ime-mode: normal;|.
   */
  long IME_STATUS_ENABLED = 1L;

  /**
   * PASSWORD means users cannot use most functions of IME. But on GTK2,
   * users can use "Simple IM" which only supports dead key inputting.
   * The behavior is same as the behavior of the native password field.
   * This state is same as |ime-mode: disabled;|.
   */
  long IME_STATUS_PASSWORD = 2L;

  /**
   * PLUGIN means a plug-in has focus. At this time we should not touch to
   * controlling the IME state.
   */
  long IME_STATUS_PLUGIN = 3L;

  /**
   * Get IME status, see above IME_STATUS_* definitions.
   */
  long getIMEStatus();

  /**
   * Get the number of screen pixels per CSS pixel.
   */
  float getScreenPixelsPerCSSPixel();

}