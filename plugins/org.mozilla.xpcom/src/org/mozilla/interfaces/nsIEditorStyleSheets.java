/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/idl/nsIEditorStyleSheets.idl
 */

package org.mozilla.interfaces;

public interface nsIEditorStyleSheets extends nsISupports {

  String NS_IEDITORSTYLESHEETS_IID =
    "{4805e682-49b9-11d3-9ce4-ed60bd6cb5bc}";

  /** load and apply the style sheet, specified by aURL, to the
    * editor's document, replacing the last style sheet added (if any).
    * This can involve asynchronous network I/O.
    * 
    * @param aURL         The style sheet to be loaded and applied.
    */
  void replaceStyleSheet(String aURL);

  /** Add the given Style Sheet to the editor's document,
    * on top of any that are already there.
    * This is always synchronous.
    *
    * @param aURL  The style sheet to be  applied.
    */
  void addStyleSheet(String aURL);

  /** load and apply the style sheet, specified by aURL, to the
    * editor's document, replacing the last style sheet added (if any).
    * This is always synchronous.
    * 
    * @param aURL         The style sheet to be loaded and applied.
    */
  void replaceOverrideStyleSheet(String aURL);

  /** load and apply an Override style sheet, specified by aURL, to
    * the editor's document, on top of any that are already there.
    * IMPORTANT: This is assumed to be synchronous:
    *            URL is a local file with no @import used
    * This action is not undoable.
    * It is not intended for use by "user", only editor developers
    *   to change display behavior for editing (like showing special cursors)
    *   that will not be affected by loading other "document" style sheets
    *   loaded using addStyleSheet or replaceStyleSheet.
    *
    * @param aURL         The style sheet to be loaded and applied.
    */
  void addOverrideStyleSheet(String aURL);

  /** Remove the given Style Sheet from the editor's document
    * This is always synchronous
    *
    * @param aURL  The style sheet to be removed
    */
  void removeStyleSheet(String aURL);

  /** Remove the given Override Style Sheet from the editor's document
    * This is always synchronous
    *
    * @param aURL  The style sheet to be removed.
    */
  void removeOverrideStyleSheet(String aURL);

  /** Enable or disable the given Style Sheet from the editor's document
    * This is always synchronous
    *
    * @param aURL  The style sheet to be removed
    */
  void enableStyleSheet(String aURL, boolean aEnable);

}