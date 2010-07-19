/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/idl/nsIEditor.idl
 */

package org.mozilla.interfaces;

public interface nsIEditor extends nsISupports {

  String NS_IEDITOR_IID =
    "{96b60ba0-634a-41e4-928e-78ab0b3c4b46}";

  short eNone = 0;

  short eNext = 1;

  short ePrevious = 2;

  short eNextWord = 3;

  short ePreviousWord = 4;

  short eToBeginningOfLine = 5;

  short eToEndOfLine = 6;

  nsISelection getSelection();

  void setAttributeOrEquivalent(nsIDOMElement element, String sourceAttrName, String sourceAttrValue, boolean aSuppressTransaction);

  void removeAttributeOrEquivalent(nsIDOMElement element, String sourceAttrName, boolean aSuppressTransaction);

  /**
   * postCreate should be called after Init, and is the time that the editor
   * tells its documentStateObservers that the document has been created.
   */
  void postCreate();

  /**
   * preDestroy is called before the editor goes away, and gives the editor a
   * chance to tell its documentStateObservers that the document is going away.
   * @param aDestroyingFrames set to true when the frames being edited
   * are being destroyed (so there is no need to modify any nsISelections,
   * nor is it safe to do so)
   */
  void preDestroy(boolean aDestroyingFrames);

  /** edit flags for this editor.  May be set at any time. */
  long getFlags();

  /** edit flags for this editor.  May be set at any time. */
  void setFlags(long aFlags);

  /**
   * the MimeType of the document
   */
  String getContentsMIMEType();

  /**
   * the MimeType of the document
   */
  void setContentsMIMEType(String aContentsMIMEType);

  /** Returns true if we have a document that is not marked read-only */
  boolean getIsDocumentEditable();

  /**
   * the DOM Document this editor is associated with, refcounted.
   */
  nsIDOMDocument getDocument();

  /** the body element, i.e. the root of the editable document.
   */
  nsIDOMElement getRootElement();

  /**
   * the selection controller for the current presentation, refcounted.
   */
  nsISelectionController getSelectionController();

  /** 
   * DeleteSelection removes all nodes in the current selection.
   * @param aDir  if eNext, delete to the right (for example, the DEL key)
   *              if ePrevious, delete to the left (for example, the BACKSPACE key)
   */
  void deleteSelection(short action);

  /** Returns true if the document has no *meaningful* content */
  boolean getDocumentIsEmpty();

  /** Returns true if the document is modifed and needs saving */
  boolean getDocumentModified();

  /** Sets the current 'Save' document character set */
  String getDocumentCharacterSet();

  /** Sets the current 'Save' document character set */
  void setDocumentCharacterSet(String aDocumentCharacterSet);

  /** to be used ONLY when we need to override the doc's modification
    * state (such as when it's saved).
    */
  void resetModificationCount();

  /** Gets the modification count of the document we are editing.
    * @return the modification count of the document being edited.
    *         Zero means unchanged.
    */
  int getModificationCount();

  /** called each time we modify the document.
    * Increments the modification count of the document.
    * @param  aModCount  the number of modifications by which
    *                    to increase or decrease the count
    */
  void incrementModificationCount(int aModCount);

  /** transactionManager Get the transaction manager the editor is using.
    */
  nsITransactionManager getTransactionManager();

  /** transactionManager Get the transaction manager the editor is using.
    */
  void setTransactionManager(nsITransactionManager aTransactionManager);

  /** doTransaction() fires a transaction.
    * It is provided here so clients can create their own transactions.
    * If a transaction manager is present, it is used.  
    * Otherwise, the transaction is just executed directly.
    *
    * @param aTxn the transaction to execute
    */
  void doTransaction(nsITransaction txn);

  /** turn the undo system on or off
    * @param aEnable  if PR_TRUE, the undo system is turned on if available
    *                 if PR_FALSE the undo system is turned off if it
    *                 was previously on
    * @return         if aEnable is PR_TRUE, returns NS_OK if
    *                 the undo system could be initialized properly
    *                 if aEnable is PR_FALSE, returns NS_OK.
    */
  void enableUndo(boolean enable);

  /** undo reverses the effects of the last Do operation,
    * if Undo is enabled in the editor.
    * It is provided here so clients need no knowledge of whether
    * the editor has a transaction manager or not.
    * If a transaction manager is present, it is told to undo,
    * and the result of that undo is returned.  
    * Otherwise, the Undo request is ignored and an
    * error NS_ERROR_NOT_AVAILABLE is returned.
    *
    */
  void undo(long count);

  /** returns state information about the undo system.
    * @param aIsEnabled [OUT] PR_TRUE if undo is enabled
    * @param aCanUndo   [OUT] PR_TRUE if at least one transaction is
    *                         currently ready to be undone.
    */
  void canUndo(boolean[] isEnabled, boolean[] canUndo);

  /** redo reverses the effects of the last Undo operation
    * It is provided here so clients need no knowledge of whether
    * the editor has a transaction manager or not.
    * If a transaction manager is present, it is told to redo and the
    * result of the previously undone transaction is reapplied to the document.
    * If no transaction is available for Redo, or if the document
    * has no transaction manager, the Redo request is ignored and an
    * error NS_ERROR_NOT_AVAILABLE is returned.
    *
    */
  void redo(long count);

  /** returns state information about the redo system.
    * @param aIsEnabled [OUT] PR_TRUE if redo is enabled
    * @param aCanRedo   [OUT] PR_TRUE if at least one transaction is
                              currently ready to be redone.
    */
  void canRedo(boolean[] isEnabled, boolean[] canRedo);

  /** beginTransaction is a signal from the caller to the editor that
    * the caller will execute multiple updates to the content tree
    * that should be treated as a single logical operation,
    * in the most efficient way possible.<br>
    * All transactions executed between a call to beginTransaction and
    * endTransaction will be undoable as an atomic action.<br>
    * endTransaction must be called after beginTransaction.<br>
    * Calls to beginTransaction can be nested, as long as endTransaction
    * is called once per beginUpdate.
    */
  void beginTransaction();

  /** endTransaction is a signal to the editor that the caller is
    * finished updating the content model.<br>
    * beginUpdate must be called before endTransaction is called.<br>
    * Calls to beginTransaction can be nested, as long as endTransaction
    * is called once per beginTransaction.
    */
  void endTransaction();

  void beginPlaceHolderTransaction(nsIAtom name);

  void endPlaceHolderTransaction();

  boolean shouldTxnSetSelection();

  /** Set the flag that prevents insertElementTxn from changing the selection
    * @param   should  Set false to suppress changing the selection;
    *                  i.e., before using InsertElement() to insert
    *                  under <head> element
    * WARNING: You must be very careful to reset back to PR_TRUE after
    *          setting PR_FALSE, else selection/caret is trashed
    *          for further editing.
    */
  void setShouldTxnSetSelection(boolean should);

  /** Returns the inline spell checker associated with this object. The spell
    * checker is lazily created, so this function may create the object for
    * you during this call.
    * @param  autoCreate  If true, this will create a spell checker object
    *                     if one does not exist yet for this editor. If false
    *                     and the object has not been created, this function
    *                     WILL RETURN NULL.
    */
  nsIInlineSpellChecker getInlineSpellChecker(boolean autoCreate);

  /** Resyncs spellchecking state (enabled/disabled).  This should be called
    * when anything that affects spellchecking state changes, such as the
    * spellcheck attribute value.
    */
  void syncRealTimeSpell();

  /** Called when the user manually overrides the spellchecking state for this
    * editor.
    * @param  enable  The new state of spellchecking in this editor, as
    *                 requested by the user.
    */
  void setSpellcheckUserOverride(boolean enable);

  /** cut the currently selected text, putting it into the OS clipboard
    * What if no text is selected?
    * What about mixed selections?
    * What are the clipboard formats?
    */
  void cut();

  /** Can we cut? True if the doc is modifiable, and we have a non-
    * collapsed selection.
    */
  boolean canCut();

  /** copy the currently selected text, putting it into the OS clipboard
    * What if no text is selected?
    * What about mixed selections?
    * What are the clipboard formats?
    */
  void copy();

  /** Can we copy? True if we have a non-collapsed selection.
    */
  boolean canCopy();

  /** paste the text in the OS clipboard at the cursor position, replacing
    * the selected text (if any)
    */
  void paste(int aSelectionType);

  /** Can we paste? True if the doc is modifiable, and we have
    * pasteable data in the clipboard.
    */
  boolean canPaste(int aSelectionType);

  /** sets the document selection to the entire contents of the document */
  void selectAll();

  /** sets the document selection to the beginning of the document */
  void beginningOfDocument();

  /** sets the document selection to the end of the document */
  void endOfDocument();

  /** 
    * canDrag decides if a drag should be started
    * (for example, based on the current selection and mousepoint).
    */
  boolean canDrag(nsIDOMEvent aEvent);

  /** 
    * doDrag transfers the relevant data (as appropriate)
    * to a transferable so it can later be dropped.
    */
  void doDrag(nsIDOMEvent aEvent);

  /** 
    * insertFromDrop looks for a dragsession and inserts the
    * relevant data in response to a drop.
    */
  void insertFromDrop(nsIDOMEvent aEvent);

  /**
   * setAttribute() sets the attribute of aElement.
   * No checking is done to see if aAttribute is a legal attribute of the node,
   * or if aValue is a legal value of aAttribute.
   *
   * @param aElement    the content element to operate on
   * @param aAttribute  the string representation of the attribute to set
   * @param aValue      the value to set aAttribute to
   */
  void setAttribute(nsIDOMElement aElement, String attributestr, String attvalue);

  /**
   * getAttributeValue() retrieves the attribute's value for aElement.
   *
   * @param aElement      the content element to operate on
   * @param aAttribute    the string representation of the attribute to get
   * @param aResultValue  [OUT] the value of aAttribute.
   *                      Only valid if aResultIsSet is PR_TRUE
   * @return              PR_TRUE if aAttribute is set on the current node,
   *                      PR_FALSE if it is not.
   */
  boolean getAttributeValue(nsIDOMElement aElement, String attributestr, String[] resultValue);

  /**
   * removeAttribute() deletes aAttribute from the attribute list of aElement.
   * If aAttribute is not an attribute of aElement, nothing is done.
   *
   * @param aElement      the content element to operate on
   * @param aAttribute    the string representation of the attribute to get
   */
  void removeAttribute(nsIDOMElement aElement, String aAttribute);

  /**
   * cloneAttribute() copies the attribute from the source node to
   * the destination node and delete those not in the source.
   *
   * The supplied nodes MUST BE ELEMENTS (most callers are working with nodes)
   * @param aAttribute    the name of the attribute to copy
   * @param aDestNode     the destination element to operate on
   * @param aSourceNode   the source element to copy attributes from
   * @exception NS_ERROR_NULL_POINTER at least one of the nodes is null
   * @exception NS_ERROR_NO_INTERFACE at least one of the nodes is not an
   *                                  element
   */
  void cloneAttribute(String aAttribute, nsIDOMNode aDestNode, nsIDOMNode aSourceNode);

  /**
   * cloneAttributes() is similar to nsIDOMNode::cloneNode(),
   *   it assures the attribute nodes of the destination are identical
   *   with the source node by copying all existing attributes from the
   *   source and deleting those not in the source.
   *   This is used when the destination node (element) already exists
   *
   * The supplied nodes MUST BE ELEMENTS (most callers are working with nodes)
   * @param aDestNode     the destination element to operate on
   * @param aSourceNode   the source element to copy attributes from
   */
  void cloneAttributes(nsIDOMNode destNode, nsIDOMNode sourceNode);

  /** 
   * createNode instantiates a new element of type aTag and inserts it
   * into aParent at aPosition.
   * @param aTag      The type of object to create
   * @param aParent   The node to insert the new object into
   * @param aPosition The place in aParent to insert the new node
   * @return          The node created.  Caller must release aNewNode.
   */
  nsIDOMNode createNode(String tag, nsIDOMNode parent, int position);

  /** 
   * insertNode inserts aNode into aParent at aPosition.
   * No checking is done to verify the legality of the insertion.
   * That is the responsibility of the caller.
   * @param aNode     The DOM Node to insert.
   * @param aParent   The node to insert the new object into
   * @param aPosition The place in aParent to insert the new node
   *                  0=first child, 1=second child, etc.
   *                  any number > number of current children = last child
   */
  void insertNode(nsIDOMNode node, nsIDOMNode parent, int aPosition);

  /** 
   * splitNode() creates a new node identical to an existing node,
   * and split the contents between the two nodes
   * @param aExistingRightNode   the node to split.
   *                             It will become the new node's next sibling.
   * @param aOffset              the offset of aExistingRightNode's
   *                             content|children to do the split at
   * @param aNewLeftNode         [OUT] the new node resulting from the split,
   *                             becomes aExistingRightNode's previous sibling.
   */
  void splitNode(nsIDOMNode existingRightNode, int offset, nsIDOMNode[] newLeftNode);

  /** 
   * joinNodes() takes 2 nodes and merge their content|children.
   * @param aLeftNode     The left node.  It will be deleted.
   * @param aRightNode    The right node. It will remain after the join.
   * @param aParent       The parent of aExistingRightNode
   *
   *                      There is no requirement that the two nodes be
   *                      of the same type.  However, a text node can be
   *                      merged only with another text node.
   */
  void joinNodes(nsIDOMNode leftNode, nsIDOMNode rightNode, nsIDOMNode parent);

  /** 
   * deleteNode removes aChild from aParent.
   * @param aChild    The node to delete
   */
  void deleteNode(nsIDOMNode child);

  /** 
   * markNodeDirty() sets a special dirty attribute on the node.
   * Usually this will be called immediately after creating a new node.
   * @param aNode      The node for which to insert formatting.
   */
  void markNodeDirty(nsIDOMNode node);

  /** 
   * Switches the editor element direction; from "Left-to-Right" to
   * "Right-to-Left", and vice versa.
   */
  void switchTextDirection();

  /**
   * Output methods:
   * aFormatType is a mime type, like text/plain.
   */
  String outputToString(String formatType, long flags);

  void outputToStream(nsIOutputStream aStream, String formatType, String charsetOverride, long flags);

  /** add an EditorObserver to the editors list of observers. */
  void addEditorObserver(nsIEditorObserver observer);

  /** Remove an EditorObserver from the editor's list of observers. */
  void removeEditorObserver(nsIEditorObserver observer);

  /** add an EditActionListener to the editors list of listeners. */
  void addEditActionListener(nsIEditActionListener listener);

  /** Remove an EditActionListener from the editor's list of listeners. */
  void removeEditActionListener(nsIEditActionListener listener);

  /** Add a DocumentStateListener to the editors list of doc state listeners. */
  void addDocumentStateListener(nsIDocumentStateListener listener);

  /** Remove a DocumentStateListener to the editors list of doc state listeners. */
  void removeDocumentStateListener(nsIDocumentStateListener listener);

  /**
   * And a debug method -- show us what the tree looks like right now
   */
  void dumpContentTree();

  /** Dumps a text representation of the content tree to standard out */
  void debugDumpContent();

  void debugUnitTests(int[] outNumTests, int[] outNumTestsFailed);

}