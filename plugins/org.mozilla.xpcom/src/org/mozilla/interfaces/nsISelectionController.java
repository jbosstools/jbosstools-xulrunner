/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsISelectionController.idl
 */

package org.mozilla.interfaces;

public interface nsISelectionController extends nsISelectionDisplay {

  String NS_ISELECTIONCONTROLLER_IID =
    "{b5c3ffc4-f48a-4f25-86e1-4cf79db1bcbb}";

  short SELECTION_NONE = 0;

  short SELECTION_NORMAL = 1;

  short SELECTION_SPELLCHECK = 2;

  short SELECTION_IME_RAWINPUT = 4;

  short SELECTION_IME_SELECTEDRAWTEXT = 8;

  short SELECTION_IME_CONVERTEDTEXT = 16;

  short SELECTION_IME_SELECTEDCONVERTEDTEXT = 32;

  short SELECTION_ACCESSIBILITY = 64;

  short SELECTION_FIND = 128;

  short NUM_SELECTIONTYPES = 9;

  short SELECTION_ANCHOR_REGION = 0;

  short SELECTION_FOCUS_REGION = 1;

  short NUM_SELECTION_REGIONS = 2;

  short SELECTION_OFF = 0;

  short SELECTION_HIDDEN = 1;

  short SELECTION_ON = 2;

  short SELECTION_DISABLED = 3;

  short SELECTION_ATTENTION = 4;

  /**
   * SetDisplaySelection will set the display mode for the selection. OFF,ON,DISABLED
   */
  void setDisplaySelection(short toggle);

  /**
   * GetDisplaySelection will get the display mode for the selection. OFF,ON,DISABLED
   */
  short getDisplaySelection();

  /**
   * GetSelection will return the selection that the presentation
   *  shell may implement.
   *
   * @param aType will hold the type of selection //SelectionType
   * @param _return will hold the return value
   */
  nsISelection getSelection(short type);

  /**
   * ScrollSelectionIntoView scrolls a region of the selection,
   * so that it is visible in the scrolled view.
   *
   * @param aType the selection to scroll into view. //SelectionType
   * @param aRegion the region inside the selection to scroll into view. //SelectionRegion
   * @param aIsSynchronous when true, scrolls the selection into view
   * before returning. If false, posts a request which is processed
   * at some point after the method returns.
   *
   * Note that if isSynchronous is true, then this might flush the pending
   * reflow. It's dangerous for some objects. See bug 418470 comment 12.
   */
  void scrollSelectionIntoView(short type, short region, boolean isSynchronous);

  /**
   * RepaintSelection repaints the selection specified by aType.
   *
   * @param aType specifies the selection to repaint.
   */
  void repaintSelection(short type);

  /**
   * Set the caret as enabled or disabled. An enabled caret will
   * draw or blink when made visible. A disabled caret will never show up.
   * Can be called any time.
   * @param aEnable PR_TRUE to enable caret.  PR_FALSE to disable.
   * @return always NS_OK
   */
  void setCaretEnabled(boolean enabled);

  /**
   * Set the caret readonly or not. An readonly caret will
   * draw but not blink when made visible. 
   * @param aReadOnly PR_TRUE to enable caret.  PR_FALSE to disable.
   * @return always NS_OK
   */
  void setCaretReadOnly(boolean readOnly);

  /**
   * Gets the current state of the caret.
   * @param aEnabled  [OUT] set to the current caret state, as set by SetCaretEnabled
   * @return   if aOutEnabled==null, returns NS_ERROR_INVALID_ARG
   *           else NS_OK
   */
  boolean getCaretEnabled();

  /**
    * This is true if the caret is enabled, visible, and currently blinking.
    * This is still true when the caret is enabled, visible, but in its "off"
    * blink cycle.
    */
  boolean getCaretVisible();

  /**
   * Show the caret even in selections. By default the caret is hidden unless the
   * selection is collapsed. Use this function to show the caret even in selections.
   * @param aVisibility PR_TRUE to show the caret in selections.  PR_FALSE to hide.
   * @return always NS_OK
   */
  void setCaretVisibilityDuringSelection(boolean visibility);

  /** CharacterMove will move the selection one character forward/backward in the document.
   *  this will also have the effect of collapsing the selection if the aExtend = PR_FALSE
   *  the "point" of selection that is extended is considered the "focus" point. 
   *  or the last point adjusted by the selection.
   *  @param aForward forward or backward if PR_FALSE
   *  @param aExtend  should it collapse the selection of extend it?
   */
  void characterMove(boolean forward, boolean extend);

  /** WordMove will move the selection one word forward/backward in the document.
   *  this will also have the effect of collapsing the selection if the aExtend = PR_FALSE
   *  the "point" of selection that is extended is considered the "focus" point. 
   *  or the last point adjusted by the selection.
   *  @param aForward forward or backward if PR_FALSE
   *  @param aExtend  should it collapse the selection of extend it?
   */
  void wordMove(boolean forward, boolean extend);

  /** LineMove will move the selection one line forward/backward in the document.
   *  this will also have the effect of collapsing the selection if the aExtend = PR_FALSE
   *  the "point" of selection that is extended is considered the "focus" point. 
   *  or the last point adjusted by the selection.
   *  @param aForward forward or backward if PR_FALSE
   *  @param aExtend  should it collapse the selection of extend it?
   */
  void lineMove(boolean forward, boolean extend);

  /** IntraLineMove will move the selection to the front of the line or end of the line
   *  in the document.
   *  this will also have the effect of collapsing the selection if the aExtend = PR_FALSE
   *  the "point" of selection that is extended is considered the "focus" point. 
   *  or the last point adjusted by the selection.
   *  @param aForward forward or backward if PR_FALSE
   *  @param aExtend  should it collapse the selection of extend it?
   */
  void intraLineMove(boolean forward, boolean extend);

  /** PageMove will move the selection one page forward/backward in the document.
   *  this will also have the effect of collapsing the selection if the aExtend = PR_FALSE
   *  the "point" of selection that is extended is considered the "focus" point. 
   *  or the last point adjusted by the selection.
   *  @param aForward forward or backward if PR_FALSE
   *  @param aExtend  should it collapse the selection of extend it?
   */
  void pageMove(boolean forward, boolean extend);

  /** CompleteScroll will move page view to the top or bottom of the document
   *  @param aForward forward or backward if PR_FALSE
   */
  void completeScroll(boolean forward);

  /** CompleteMove will move page view to the top or bottom of the document
   *  this will also have the effect of collapsing the selection if the aExtend = PR_FALSE
   *  the "point" of selection that is extended is considered the "focus" point. 
   *  or the last point adjusted by the selection.
   *  @param aForward forward or backward if PR_FALSE
   *  @param aExtend  should it collapse the selection of extend it?
   */
  void completeMove(boolean forward, boolean extend);

  /** ScrollPage will scroll the page without affecting the selection.
   *  @param aForward scroll forward or backwards in selection
   */
  void scrollPage(boolean forward);

  /** ScrolLine will scroll line up or down dependent on the boolean
   *  @param aForward scroll forward or backwards in selection
   */
  void scrollLine(boolean forward);

  /** ScrolHorizontal will scroll left or right dependent on the boolean
   *  @param aLeft if true will scroll left. if not will scroll right.
   */
  void scrollHorizontal(boolean left);

  /** SelectAll will select the whole page
   */
  void selectAll();

  /** CheckVisibility will return true if textnode and offsets are actually rendered 
   *  in the current precontext.
   *  @param aNode textNode to test
   *  @param aStartOffset  offset in dom to first char of textnode to test
   *  @param aEndOffset    offset in dom to last char of textnode to test
   *  @param aReturnBool   boolean returned TRUE if visible FALSE if not
   */
  boolean checkVisibility(nsIDOMNode node, short startOffset, short endOffset);

}