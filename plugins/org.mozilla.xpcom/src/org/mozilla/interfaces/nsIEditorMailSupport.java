/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/idl/nsIEditorMailSupport.idl
 */

package org.mozilla.interfaces;

public interface nsIEditorMailSupport extends nsISupports {

  String NS_IEDITORMAILSUPPORT_IID =
    "{fdf23301-4a94-11d3-9ce4-9960496c41bc}";

  /** Paste the text in the OS clipboard at the cursor position,
    * as a quotation (whose representation is dependant on the editor type),
    * replacing the selected text (if any).
    * @param aSelectionType Text or html?
    */
  void pasteAsQuotation(int aSelectionType);

  /** Insert a string as quoted text
    * (whose representation is dependant on the editor type),
    * replacing the selected text (if any).
    * @param aQuotedText  The actual text to be quoted
    * @return             The node which was inserted
    */
  nsIDOMNode insertAsQuotation(String aQuotedText);

  /**
   * Inserts a plaintext string at the current location,
   * with special processing for lines beginning with ">",
   * which will be treated as mail quotes and inserted
   * as plaintext quoted blocks.
   * If the selection is not collapsed, the selection is deleted
   * and the insertion takes place at the resulting collapsed selection.
   *
   * @param aString   the string to be inserted
   */
  void insertTextWithQuotations(String aStringToInsert);

  /** Paste a string as quoted text,
    * whose representation is dependant on the editor type,
    * replacing the selected text (if any)
    * @param aCitation    The "mid" URL of the source message
    * @param aSelectionType Text or html?
    */
  void pasteAsCitedQuotation(String aCitation, int aSelectionType);

  /** Insert a string as quoted text
    * (whose representation is dependant on the editor type),
    * replacing the selected text (if any),
    * including, if possible, a "cite" attribute.
    * @param aQuotedText  The actual text to be quoted
    * @param aCitation    The "mid" URL of the source message
    * @param aInsertHTML  Insert as html?  (vs plaintext)
    * @return             The node which was inserted
    */
  nsIDOMNode insertAsCitedQuotation(String aQuotedText, String aCitation, boolean aInsertHTML);

  /**
   * Rewrap the selected part of the document, re-quoting if necessary.
   * @param aRespectNewlines  Try to maintain newlines in the original?
   */
  void rewrap(boolean aRespectNewlines);

  /**
   * Strip any citations in the selected part of the document.
   */
  void stripCites();

  /**
   * Get a list of IMG and OBJECT tags in the current document.
   */
  nsISupportsArray getEmbeddedObjects();

}