/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/idl/nsIEditActionListener.idl
 */

package org.mozilla.interfaces;

/**
 * A generic editor action listener interface. 
 * <P>
 * nsIEditActionListener is the interface used by applications wishing to be notified
 * when the editor modifies the DOM tree.
 *
 * Note:  this is the wrong class to implement if you are interested in generic
 * change notifications.  For generic notifications, you should implement
 * nsIDocumentObserver.
 */
public interface nsIEditActionListener extends nsISupports {

  String NS_IEDITACTIONLISTENER_IID =
    "{b22907b1-ee93-11d2-8d50-000064657374}";

  /** 
   * Called before the editor creates a node.
   * @param aTag      The tag name of the DOM Node to create.
   * @param aParent   The node to insert the new object into
   * @param aPosition The place in aParent to insert the new node
   *                  0=first child, 1=second child, etc.
   *                  any number > number of current children = last child
   */
  void willCreateNode(String aTag, nsIDOMNode aParent, int aPosition);

  /** 
   * Called after the editor creates a node.
   * @param aTag      The tag name of the DOM Node to create.
   * @param aNode     The DOM Node that was created.
   * @param aParent   The node to insert the new object into
   * @param aPosition The place in aParent to insert the new node
   *                  0=first child, 1=second child, etc.
   *                  any number > number of current children = last child
   * @param aResult   The result of the create node operation.
   */
  void didCreateNode(String aTag, nsIDOMNode aNode, nsIDOMNode aParent, int aPosition, long aResult);

  /** 
   * Called before the editor inserts a node.
   * @param aNode     The DOM Node to insert.
   * @param aParent   The node to insert the new object into
   * @param aPosition The place in aParent to insert the new node
   *                  0=first child, 1=second child, etc.
   *                  any number > number of current children = last child
   */
  void willInsertNode(nsIDOMNode aNode, nsIDOMNode aParent, int aPosition);

  /** 
   * Called after the editor inserts a node.
   * @param aNode     The DOM Node to insert.
   * @param aParent   The node to insert the new object into
   * @param aPosition The place in aParent to insert the new node
   *                  0=first child, 1=second child, etc.
   *                  any number > number of current children = last child
   * @param aResult   The result of the insert node operation.
   */
  void didInsertNode(nsIDOMNode aNode, nsIDOMNode aParent, int aPosition, long aResult);

  /** 
   * Called before the editor deletes a node.
   * @param aChild    The node to delete
   */
  void willDeleteNode(nsIDOMNode aChild);

  /** 
   * Called after the editor deletes a node.
   * @param aChild    The node to delete
   * @param aResult   The result of the delete node operation.
   */
  void didDeleteNode(nsIDOMNode aChild, long aResult);

  /** 
   * Called before the editor splits a node.
   * @param aExistingRightNode   the node to split.  It will become the new node's next sibling.
   * @param aOffset              the offset of aExistingRightNode's content|children to do the split at
   * @param aNewLeftNode         [OUT] the new node resulting from the split, becomes aExistingRightNode's previous sibling.
   */
  void willSplitNode(nsIDOMNode aExistingRightNode, int aOffset);

  /** 
   * Called after the editor splits a node.
   * @param aExistingRightNode   the node to split.  It will become the new node's next sibling.
   * @param aOffset              the offset of aExistingRightNode's content|children to do the split at
   * @param aNewLeftNode         [OUT] the new node resulting from the split, becomes aExistingRightNode's previous sibling.
   */
  void didSplitNode(nsIDOMNode aExistingRightNode, int aOffset, nsIDOMNode aNewLeftNode, long aResult);

  /** 
   * Called before the editor joins 2 nodes.
   * @param aLeftNode   This node will be merged into the right node
   * @param aRightNode  The node that will be merged into.
   *                    There is no requirement that the two nodes be of
   *                    the same type.
   * @param aParent     The parent of aRightNode
   */
  void willJoinNodes(nsIDOMNode aLeftNode, nsIDOMNode aRightNode, nsIDOMNode aParent);

  /** 
   * Called after the editor joins 2 nodes.
   * @param aLeftNode   This node will be merged into the right node
   * @param aRightNode  The node that will be merged into.
   *                    There is no requirement that the two nodes be of
   *                    the same type.
   * @param aParent     The parent of aRightNode
   * @param aResult     The result of the join operation.
   */
  void didJoinNodes(nsIDOMNode aLeftNode, nsIDOMNode aRightNode, nsIDOMNode aParent, long aResult);

  /** 
   * Called before the editor inserts text.
   * @param aTextNode   This node getting inserted text
   * @param aOffset     The offset in aTextNode to insert at.
   * @param aString     The string that gets inserted.
   */
  void willInsertText(nsIDOMCharacterData aTextNode, int aOffset, String aString);

  /** 
   * Called after the editor inserts text.
   * @param aTextNode   This node getting inserted text
   * @param aOffset     The offset in aTextNode to insert at.
   * @param aString     The string that gets inserted.
   * @param aResult     The result of the insert text operation.
   */
  void didInsertText(nsIDOMCharacterData aTextNode, int aOffset, String aString, long aResult);

  /** 
   * Called before the editor deletes text.
   * @param aTextNode   This node getting text deleted
   * @param aOffset     The offset in aTextNode to delete at.
   * @param aLength     The amount of text to delete.
   */
  void willDeleteText(nsIDOMCharacterData aTextNode, int aOffset, int aLength);

  /** 
   * Called before the editor deletes text.
   * @param aTextNode   This node getting text deleted
   * @param aOffset     The offset in aTextNode to delete at.
   * @param aLength     The amount of text to delete.
   * @param aResult     The result of the delete text operation.
   */
  void didDeleteText(nsIDOMCharacterData aTextNode, int aOffset, int aLength, long aResult);

  /** 
   * Called before the editor deletes the selection.
   * @param aSelection   The selection to be deleted
   */
  void willDeleteSelection(nsISelection aSelection);

  /** 
   * Called after the editor deletes the selection.
   * @param aSelection   The selection, after deletion
   */
  void didDeleteSelection(nsISelection aSelection);

}