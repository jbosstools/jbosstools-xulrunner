/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsISelection.idl
 */

package org.mozilla.interfaces;

/**
 * Interface for manipulating and querying the current selected range
 * of nodes within the document.
 *
 * @status FROZEN
 * @version 1.0
 */
public interface nsISelection extends nsISupports {

  String NS_ISELECTION_IID =
    "{b2c7ed59-8634-4352-9e37-5484c8b6e4e1}";

  /**
     * Returns the node in which the selection begins.
     */
  nsIDOMNode getAnchorNode();

  /**
     * The offset within the (text) node where the selection begins.
     */
  int getAnchorOffset();

  /**
     * Returns the node in which the selection ends.
     */
  nsIDOMNode getFocusNode();

  /**
     * The offset within the (text) node where the selection ends.
     */
  int getFocusOffset();

  /**
     * Indicates if the selection is collapsed or not.
     */
  boolean getIsCollapsed();

  /**
     * Returns the number of ranges in the selection.
     */
  int getRangeCount();

  /**
     * Returns the range at the specified index.
     */
  nsIDOMRange getRangeAt(int index);

  /**
     * Collapses the selection to a single point, at the specified offset
     * in the given DOM node. When the selection is collapsed, and the content
     * is focused and editable, the caret will blink there.
     * @param parentNode      The given dom node where the selection will be set
     * @param offset          Where in given dom node to place the selection (the offset into the given node)
     */
  void collapse(nsIDOMNode parentNode, int offset);

  /**
     * Extends the selection by moving the selection end to the specified node and offset,
     * preserving the selection begin position. The new selection end result will always
     * be from the anchorNode to the new focusNode, regardless of direction.
     * @param parentNode      The node where the selection will be extended to
     * @param offset          Where in node to place the offset in the new selection end
     */
  void extend(nsIDOMNode parentNode, int offset);

  /**
     * Collapses the whole selection to a single point at the start
     * of the current selection (irrespective of direction).  If content
     * is focused and editable, the caret will blink there.
     */
  void collapseToStart();

  /**
     * Collapses the whole selection to a single point at the end
     * of the current selection (irrespective of direction).  If content
     * is focused and editable, the caret will blink there.
     */
  void collapseToEnd();

  /**
     * Indicates whether the node is part of the selection. If partlyContained 
     * is set to PR_TRUE, the function returns true when some part of the node 
     * is part of the selection. If partlyContained is set to PR_FALSE, the
     * function only returns true when the entire node is part of the selection.
     */
  boolean containsNode(nsIDOMNode node, boolean partlyContained);

  /**
     * Adds all children of the specified node to the selection.
     * @param parentNode  the parent of the children to be added to the selection.
     */
  void selectAllChildren(nsIDOMNode parentNode);

  /**
     * Adds a range to the current selection.
     */
  void addRange(nsIDOMRange range);

  /**
     * Removes a range from the current selection.
     */
  void removeRange(nsIDOMRange range);

  /**
     * Removes all ranges from the current selection.
     */
  void removeAllRanges();

  /**
     * Deletes this selection from document the nodes belong to.
     */
  void deleteFromDocument();

  /**
     * Modifies the cursor Bidi level after a change in keyboard direction
     * @param langRTL is PR_TRUE if the new language is right-to-left or
     *                PR_FALSE if the new language is left-to-right.
     */
  void selectionLanguageChange(boolean langRTL);

  /**
     * Returns the whole selection into a plain text string.
     */
  String toString();

}