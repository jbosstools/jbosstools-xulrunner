/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/idl/nsIContentFilter.idl
 */

package org.mozilla.interfaces;

public interface nsIContentFilter extends nsISupports {

  String NS_ICONTENTFILTER_IID =
    "{c18c49a8-62f0-4045-9884-4aa91e388f14}";

  /**
   * This notification occurs in an editor during these events:
   *    * open of document (once rendered in window but before editable)
   *    * paste from clipboard
   *    * drop from mouse
   *    * insertion of html (such as with "cmd_insertHTML")
   * It provides a hook so the above actions can be canceled or the data
   * can be modified (using standard DOM APIs) or left untouched.  The data
   * that results (if any) from all filter callbacks is what will be used
   * for transaction purposes (undo/redo) except for the open event.
   *
   * The willDeleteSelection parameter is offered for filters who want to
   * handle the insertion themselves and need to handle drag/drop correctly.
   * The flag is true when the editor intends to delete the selection.
   *
   * Callers who want to cancel all insertion can simply set
   * continueWithInsertion to PR_FALSE and return.
   * Note: If cancellation occurs during the "open" event, the editor will
   * still be available but will be empty.
   *
   * Callers who want to allow insertion of the data with no changes
   * can simply set continueWithInsertion to PR_TRUE and return.
   *
   * Callers who want to modify the content (docFragment) being inserted are 
   * responsible for updating contentStartNode, contentStartOffset, 
   * contentEndNode, and contentEndOffset (if necessary).  
   * Callers are responsible for freeing and addref'ing if they want to 
   * completely replace any of the DOM nodes passed in.
   *
   * The location where insertion will occur should be considered an
   * approximation since the editor may need to adjust it if it deletes
   * the selection as part of the event and later determines that insertion
   * point is an empty container which should also be removed (or in other
   * scenarios such as -moz-user-select:none).
   *
   * In some scenarios the selection will be deleted.  If callers choose
   * to adjust the insertion point, they should be careful that the insertion
   * point is not in the current selection.
   *
   * The contentStartNode and contentEndNode are not necessarily
   * immediate children of the docFragment.  Any nodes outside of the range
   * set by contentStartNode and contentEndNode are for context from the
   * source document.
   *
   * @param mimeType          the mimetype used for retrieving data
   * @param contentSourceURL  location where docFragment came from
   * @param sourceDocument      document where content came from (can be null)
   * @param willDeleteSelection tells hook if selection will/should be deleted
   * @param docFragment         fragment of node to be inserted
   * @param contentStartNode    node under which content to be inserted begins
   * @param contentStartOffset  start offset within contentStartNode
   * @param contentEndNode      node under which content to be inserted ends
   * @param contentEndOffset    ending offset withing contentEndNode
   * @param insertionPointNode     location where insertion will occur
   * @param insertionPointOffset   offset within node where insertion occurs
   * @param continueWithInsertion  flag to cancel insertion (if desired)
   */
  void notifyOfInsertion(String mimeType, nsIURL contentSourceURL, nsIDOMDocument sourceDocument, boolean willDeleteSelection, nsIDOMNode[] docFragment, nsIDOMNode[] contentStartNode, int[] contentStartOffset, nsIDOMNode[] contentEndNode, int[] contentEndOffset, nsIDOMNode[] insertionPointNode, int[] insertionPointOffset, boolean[] continueWithInsertion);

}