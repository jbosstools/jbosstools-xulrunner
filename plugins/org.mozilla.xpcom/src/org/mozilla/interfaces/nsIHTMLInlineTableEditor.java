/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/idl/nsIHTMLInlineTableEditor.idl
 */

package org.mozilla.interfaces;

public interface nsIHTMLInlineTableEditor extends nsISupports {

  String NS_IHTMLINLINETABLEEDITOR_IID =
    "{eda2e65c-a758-451f-9b05-77cb8de74ed2}";

  /**
   * boolean indicating if inline table editing is enabled in the editor.
   * When inline table editing is enabled, and when the selection is
   * contained in a table cell, special buttons allowing to add/remove
   * a line/column are available on the cell's border.
   */
  boolean getInlineTableEditingEnabled();

  /**
   * boolean indicating if inline table editing is enabled in the editor.
   * When inline table editing is enabled, and when the selection is
   * contained in a table cell, special buttons allowing to add/remove
   * a line/column are available on the cell's border.
   */
  void setInlineTableEditingEnabled(boolean aInlineTableEditingEnabled);

  /**
   * Shows inline table editing UI around a table cell
   * @param aCell [IN] a DOM Element being a table cell, td or th
   */
  void showInlineTableEditingUI(nsIDOMElement aCell);

  /**
   * Hide all inline table editing UI
   */
  void hideInlineTableEditingUI();

  /**
   * Modifies the table containing the selection according to the
   * activation of an inline table editing UI element
   * @param aUIAnonymousElement [IN] the inline table editing UI element
   */
  void doInlineTableEditingAction(nsIDOMElement aUIAnonymousElement);

  /**
   * Refresh already visible inline table editing UI
   */
  void refreshInlineTableEditingUI();

}