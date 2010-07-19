/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/idl/nsIPlaintextEditor.idl
 */

package org.mozilla.interfaces;

public interface nsIPlaintextEditor extends nsISupports {

  String NS_IPLAINTEXTEDITOR_IID =
    "{1480e196-0d5c-40cf-8563-ed8a33eabcf2}";

  int eEditorPlaintextMask = 1;

  int eEditorSingleLineMask = 2;

  int eEditorPasswordMask = 4;

  int eEditorReadonlyMask = 8;

  int eEditorDisabledMask = 16;

  int eEditorFilterInputMask = 32;

  int eEditorMailMask = 64;

  int eEditorUseAsyncUpdatesMask = 128;

  int eEditorEnableWrapHackMask = 256;

  int eEditorWidgetMask = 512;

  int eEditorNoCSSMask = 1024;

  int eEditorAllowInteraction = 2048;

  int eEditorDontEchoPassword = 4096;

  int eNewlinesPasteIntact = 0;

  int eNewlinesPasteToFirst = 1;

  int eNewlinesReplaceWithSpaces = 2;

  int eNewlinesStrip = 3;

  int eNewlinesReplaceWithCommas = 4;

  int eNewlinesStripSurroundingWhitespace = 5;

  /**
    * The length of the contents in characters.
    * XXX change this type to 'unsigned long'
    */
  int getTextLength();

  /**
    * The maximum number of characters allowed.
    *   default: -1 (unlimited).
    */
  int getMaxTextLength();

  /**
    * The maximum number of characters allowed.
    *   default: -1 (unlimited).
    */
  void setMaxTextLength(int aMaxTextLength);

  /** Get and set the body wrap width.
    * 
    * Special values:
    *    0 = wrap to window width
    *   -1 = no wrap at all
    */
  int getWrapWidth();

  /** Get and set the body wrap width.
    * 
    * Special values:
    *    0 = wrap to window width
    *   -1 = no wrap at all
    */
  void setWrapWidth(int aWrapWidth);

  /**
   * Similar to the setter for wrapWidth, but just sets the editor
   * internal state without actually changing the content being edited
   * to wrap at that column.  This should only be used by callers who
   * are sure that their content is already set up correctly.
   */
  void setWrapColumn(int aWrapColumn);

  /** Get and set newline handling.
   *
   *  Values are the constants defined above.
   */
  int getNewlineHandling();

  /** Get and set newline handling.
   *
   *  Values are the constants defined above.
   */
  void setNewlineHandling(int aNewlineHandling);

  /** 
   * EditorKeyPress consumes a keyevent.
   * @param aKeyEvent    key event to consume
   */
  void handleKeyPress(nsIDOMKeyEvent aKeyEvent);

  /**
   * Inserts a string at the current location,
   * given by the selection.
   * If the selection is not collapsed, the selection is deleted
   * and the insertion takes place at the resulting collapsed selection.
   *
   * @param aString   the string to be inserted
   */
  void insertText(String aStringToInsert);

  /**
   * Insert a line break into the content model.
   * The interpretation of a break is up to the implementation:
   * it may enter a character, split a node in the tree, etc.
   * This may be more efficient than calling InsertText with a newline.
   */
  void insertLineBreak();

}