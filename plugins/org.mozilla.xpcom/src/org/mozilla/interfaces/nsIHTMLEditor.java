/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/idl/nsIHTMLEditor.idl
 */

package org.mozilla.interfaces;

public interface nsIHTMLEditor extends nsISupports {

  String NS_IHTMLEDITOR_IID =
    "{afc36593-5787-4420-93d9-b2c0ccbf0cad}";

  short eLeft = 0;

  short eCenter = 1;

  short eRight = 2;

  short eJustify = 3;

  /**
   * AddDefaultProperty() registers a default style property with the editor
   *
   * @param aProperty   the property to set by default
   * @param aAttribute  the attribute of the property, if applicable.
   *                    May be null.
   *                    Example: aProperty="font", aAttribute="color"
   * @param aValue      if aAttribute is not null, the value of the attribute.
   *                    Example: aProperty="font", aAttribute="color",
   *                             aValue="0x00FFFF"
   */
  void addDefaultProperty(nsIAtom aProperty, String aAttribute, String aValue);

  /**
   * RemoveDefaultProperty() unregisters a default style property with the editor
   *
   * @param aProperty   the property to remove from defaults
   * @param aAttribute  the attribute of the property, if applicable.
   *                    May be null.
   *                    Example: aProperty="font", aAttribute="color"
   * @param aValue      if aAttribute is not null, the value of the attribute.
   *                    Example: aProperty="font", aAttribute="color",
   *                             aValue="0x00FFFF"
   */
  void removeDefaultProperty(nsIAtom aProperty, String aAttribute, String aValue);

  /**
   * RemoveAllDefaultProperties() unregisters all default style properties with the editor
   *
   */
  void removeAllDefaultProperties();

  /**
   * SetInlineProperty() sets the aggregate properties on the current selection
   *
   * @param aProperty   the property to set on the selection 
   * @param aAttribute  the attribute of the property, if applicable.
   *                    May be null.
   *                    Example: aProperty="font", aAttribute="color"
   * @param aValue      if aAttribute is not null, the value of the attribute.
   *                    May be null.
   *                    Example: aProperty="font", aAttribute="color",
   *                             aValue="0x00FFFF"
   */
  void setCSSInlineProperty(nsIAtom aProperty, String aAttribute, String aValue);

  void setInlineProperty(nsIAtom aProperty, String aAttribute, String aValue);

  /**
   * getInlineProperty() gets aggregate properties of the current selection.
   * All object in the current selection are scanned and their attributes are
   * represented in a list of Property object.
   *
   * @param aProperty   the property to get on the selection 
   * @param aAttribute  the attribute of the property, if applicable.
   *                    May be null.
   *                    Example: aProperty="font", aAttribute="color"
   * @param aValue      if aAttribute is not null, the value of the attribute.
   *                    May be null.
   *                    Example: aProperty="font", aAttribute="color",
   *                             aValue="0x00FFFF"
   * @param aFirst      [OUT] PR_TRUE if the first text node in the
   *                          selection has the property
   * @param aAny        [OUT] PR_TRUE if any of the text nodes in the
   *                          selection have the property
   * @param aAll        [OUT] PR_TRUE if all of the text nodes in the
   *                          selection have the property
   */
  void getInlineProperty(nsIAtom aProperty, String aAttribute, String aValue, boolean[] aFirst, boolean[] aAny, boolean[] aAll);

  String getInlinePropertyWithAttrValue(nsIAtom aProperty, String aAttribute, String aValue, boolean[] aFirst, boolean[] aAny, boolean[] aAll);

  /**
   * removeAllInlineProperties() deletes all the inline properties from all 
   * text in the current selection.
   */
  void removeAllInlineProperties();

  /**
   * removeInlineProperty() deletes the properties from all text in the current
   * selection.  If aProperty is not set on the selection, nothing is done.
   *
   * @param aProperty   the property to remove from the selection 
   *                    All atoms are for normal HTML tags (e.g.:
   *                    nsIEditorProperty::font) except when you want to
   *                    remove just links and not named anchors.
   *                    For that, use nsIEditorProperty::href
   * @param aAttribute  the attribute of the property, if applicable.
   *                    May be null.
   *                    Example: aProperty=nsIEditorProptery::font,
   *                    aAttribute="color"
   *                    nsIEditProperty::allAttributes is special.
   *                    It indicates that all content-based text properties
   *                    are to be removed from the selection.
   */
  void removeInlineProperty(nsIAtom aProperty, String aAttribute);

  /**
   *  Increase font size for text in selection by 1 HTML unit
   *  All existing text is scanned for existing <FONT SIZE> attributes
   *  so they will be incremented instead of inserting new <FONT> tag
   */
  void increaseFontSize();

  /**
   *  Decrease font size for text in selection by 1 HTML unit
   *  All existing text is scanned for existing <FONT SIZE> attributes
   *  so they will be decreased instead of inserting new <FONT> tag
   */
  void decreaseFontSize();

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
   * Tests if a node is a BLOCK element according the the HTML 4.0 DTD.
   *   This does NOT consider CSS effect on display type
   *
   * @param aNode      the node to test
   */
  boolean nodeIsBlock(nsIDOMNode node);

  /**
   * Insert some HTML source at the current location
   *
   * @param aInputString   the string to be inserted
   */
  void insertHTML(String aInputString);

  /** 
    * Paste the text in the OS clipboard at the cursor position, replacing
    * the selected text (if any), but strip out any HTML styles and formatting
    */
  void pasteNoFormatting(int aSelectionType);

  /** 
   *  Rebuild the entire document from source HTML
   *  Needed to be able to edit HEAD and other outside-of-BODY content
   *
   *  @param aSourceString   HTML source string of the entire new document
   */
  void rebuildDocumentFromSource(String aSourceString);

  /**
   * Insert some HTML source, interpreting
   * the string argument according to the given context.
   *
   * @param aInputString   the string to be inserted
   * @param aContextStr    Context of insertion
   * @param aInfoStr       Related info to aInputString 
   * @param aFlavor        Transferable flavor, can be ""
   * @param aSourceDoc          document where input was dragged from (may be null)
   * @param aDestinationNode    location for insertion (such as when dropped)
   * @param aDestinationOffset  used with aDestNode to determine insert location
   * @param aDeleteSelection    used with aDestNode during drag&drop 
   * @param aCollapseSelection  used with aDestNode during drag&drop
   */
  void insertHTMLWithContext(String aInputString, String aContextStr, String aInfoStr, String aFlavor, nsIDOMDocument aSourceDoc, nsIDOMNode aDestinationNode, int aDestinationOffset, boolean aDeleteSelection);

  /** 
    * Insert an element, which may have child nodes, at the selection
    * Used primarily to insert a new element for various insert element dialogs,
    *   but it enforces the HTML 4.0 DTD "CanContain" rules, so it should
    *   be useful for other elements.
    *
    * @param aElement           The element to insert
    * @param aDeleteSelection   Delete the selection before inserting
    *     If aDeleteSelection is PR_FALSE, then the element is inserted 
    *     after the end of the selection for all element except
    *     Named Anchors, which insert before the selection
    */
  void insertElementAtSelection(nsIDOMElement aElement, boolean aDeleteSelection);

  /** 
   *   Set the documents title.
   */
  void setDocumentTitle(String aTitle);

  /** 
   *   Set the BaseURL for the document to the current URL
   *     but only if the page doesn't have a <base> tag
   *   This should be done after the document URL has changed,
   *     such as after saving a file
   *   This is used as base for relativizing link and image urls
   */
  void updateBaseURL();

  /** 
    * Set the selection at the suppled element
    *
    * @param aElement   An element in the document
    */
  void selectElement(nsIDOMElement aElement);

  /** 
    * Create a collapsed selection just after aElement
    * 
    * XXX could we parameterize SelectElement(before/select/after>?
    *
    * The selection is set to parent-of-aElement with an
    *   offset 1 greater than aElement's offset
    *   but it enforces the HTML 4.0 DTD "CanContain" rules, so it should
    *   be useful for other elements.
    *
    * @param aElement  An element in the document
    */
  void setCaretAfterElement(nsIDOMElement aElement);

  /**
   * SetParagraphFormat       Insert a block paragraph tag around selection
   * @param aParagraphFormat  "p", "h1" to "h6", "address", "pre", or "blockquote"
   */
  void setParagraphFormat(String aParagraphFormat);

  /**
   * getParagraphState returns what block tag paragraph format is in
   * the selection.
   * @param aMixed     True if there is more than one format
   * @return           Name of block tag. "" is returned for none.
   */
  String getParagraphState(boolean[] aMixed);

  /** 
   * getFontFaceState returns what font face is in the selection.
   * @param aMixed    True if there is more than one font face
   * @return          Name of face.  Note: "tt" is returned for
   *                  tt tag.  "" is returned for none.
   */
  String getFontFaceState(boolean[] aMixed);

  /** 
   * getFontColorState returns what font face is in the selection.
   * @param aMixed     True if there is more than one font color
   * @return           Color string. "" is returned for none.
   */
  String getFontColorState(boolean[] aMixed);

  /** 
   * getFontColorState returns what font face is in the selection.
   * @param aMixed     True if there is more than one font color
   * @return           Color string. "" is returned for none.
   */
  String getBackgroundColorState(boolean[] aMixed);

  /** 
   * getHighlightColorState returns what the highlight color of the selection.
   * @param aMixed     True if there is more than one font color
   * @return           Color string. "" is returned for none.
   */
  String getHighlightColorState(boolean[] aMixed);

  /** 
   * getListState returns what list type is in the selection.
   * @param aMixed    True if there is more than one type of list, or
   *                  if there is some list and non-list
   * @param aOL       The company that employs me.  No, really, it's 
   *                  true if an "ol" list is selected.
   * @param aUL       true if an "ul" list is selected.
   * @param aDL       true if a "dl" list is selected.
   */
  void getListState(boolean[] aMixed, boolean[] aOL, boolean[] aUL, boolean[] aDL);

  /** 
   * getListItemState returns what list item type is in the selection.
   * @param aMixed    True if there is more than one type of list item, or
   *                  if there is some list and non-list
   * @param aLI       true if "li" list items are selected.
   * @param aDT       true if "dt" list items are selected.
   * @param aDD       true if "dd" list items are selected.
   */
  void getListItemState(boolean[] aMixed, boolean[] aLI, boolean[] aDT, boolean[] aDD);

  /** 
   * getAlignment     returns what alignment is in the selection.
   * @param aMixed    True if there is more than one type of list item, or
   *                  if there is some list and non-list
   * @param aAlign    enum value for first encountered alignment
   *                  (left/center/right)
   */
  void getAlignment(boolean[] aMixed, short[] aAlign);

  /**
   * Document me!
   * 
   */
  void getIndentState(boolean[] aCanIndent, boolean[] aCanOutdent);

  /**
   * Document me!
   * 
   */
  void makeOrChangeList(String aListType, boolean entireList, String aBulletType);

  /**
   * Document me!
   * 
   */
  void removeList(String aListType);

  /**
   * Document me!
   * 
   */
  void indent(String aIndent);

  /**
   * Document me!
   * 
   */
  void align(String aAlign);

  /** 
   * Return the input node or a parent matching the given aTagName,
   *   starting the search at the supplied node.
   * An example of use is for testing if a node is in a table cell
   *   given a selection anchor node.
   *
   * @param aTagName  The HTML tagname
   *  Special input values:
   *    Use "href" to get a link node 
   *      (an "A" tag with the "href" attribute set)
   *    Use "anchor" or "namedanchor" to get a named anchor node
   *      (an "A" tag with the "name" attribute set)
   *    Use "list" to get an OL, UL, or DL list node
   *    Use "td" to get either a TD or TH cell node
   *
   * @param aNode    The node in the document to start the search.
   *     If it is null, the anchor node of the current selection is used.
   * @return         NS_EDITOR_ELEMENT_NOT_FOUND if an element is not found
   *                 (passes NS_SUCCEEDED macro)
   */
  nsIDOMElement getElementOrParentByTagName(String aTagName, nsIDOMNode aNode);

  /** 
   * Return an element only if it is the only node selected,
   *    such as an image, horizontal rule, etc.
   * The exception is a link, which is more like a text attribute:
   *    The Anchor tag is returned if the selection is within the textnode(s)
   *    that are children of the "A" node.
   *    This could be a collapsed selection, i.e., a caret
   *    within the link text.
   *
   * @param aTagName  The HTML tagname or and empty string 
   *       to get any element (but only if it is the only element selected)
   *    Special input values for Links and Named anchors:
   *    Use "href" to get a link node
   *      (an "A" tag with the "href" attribute set)
   *    Use "anchor" or "namedanchor" to get a named anchor node
   *      (an "A" tag with the "name" attribute set)
   * @return          NS_EDITOR_ELEMENT_NOT_FOUND if an element is not found
   *                  (passes NS_SUCCEEDED macro)
   */
  nsIDOMElement getSelectedElement(String aTagName);

  /** 
   * Output the contents of the <HEAD> section as text/HTML format
   */
  String getHeadContentsAsHTML();

  /** 
   * Replace all children of <HEAD> with string of HTML source
   */
  void replaceHeadContentsWithHTML(String aSourceToInsert);

  /** 
   * Return a new element with default attribute values
   * 
   * This does not rely on the selection, and is not sensitive to context.
   * 
   * Used primarily to supply new element for various insert element dialogs
   *  (Image, Link, NamedAnchor, Table, and HorizontalRule 
   *   are the only returned elements as of 7/25/99)
   *
   * @param aTagName  The HTML tagname
   *    Special input values for Links and Named anchors:
   *    Use "href" to get a link node
   *      (an "A" tag with the "href" attribute set)
   *    Use "anchor" or "namedanchor" to get a named anchor node
   *      (an "A" tag with the "name" attribute set)
   * @return          The new element created.
   */
  nsIDOMElement createElementWithDefaults(String aTagName);

  /** 
   * Insert an link element as the parent of the current selection
   *
   * @param aElement   An "A" element with a non-empty "href" attribute
   */
  void insertLinkAroundSelection(nsIDOMElement aAnchorElement);

  /** 
   * Set the value of the "bgcolor" attribute on the document's <body> element
   *
   * @param aColor  The HTML color string, such as "#ffccff" or "yellow"
   */
  void setBackgroundColor(String aColor);

  /** 
   * Set an attribute on the document's <body> element
   *    such as text, link, background colors
   *
   * 8/31/00 THIS ISN'T BEING USED? SHOULD WE DROP IT?
   *
   * @param aAttr   The attribute to be set
   * @param aValue  The value of the attribute
   */
  void setBodyAttribute(String aAttr, String aValue);

  /** 
   * XXX Used to suppress spurious drag/drop events to workaround bug 50703
   * Don't use this method! It will go away after first release!
   */
  void ignoreSpuriousDragEvent(boolean aIgnoreSpuriousDragEvent);

  /**
   * Find all the nodes in the document which contain references
   * to outside URIs (e.g. a href, img src, script src, etc.)
   * The objects in the array will be type nsIURIRefObject.
   *
   * @return aNodeList    the linked nodes found
   */
  nsISupportsArray getLinkedObjects();

  /** 
   * A boolean which is true is the HTMLEditor has been instantiated
   * with CSS knowledge and if the CSS pref is currently checked
   *
   * @return    true if CSS handled and enabled
   */
  boolean getIsCSSEnabled();

  /** 
   * A boolean which is true is the HTMLEditor has been instantiated
   * with CSS knowledge and if the CSS pref is currently checked
   *
   * @return    true if CSS handled and enabled
   */
  void setIsCSSEnabled(boolean aIsCSSEnabled);

  /**
   * Add listener for insertion override
   * @param inFilter  function which callers want called during insertion
   */
  void addInsertionListener(nsIContentFilter inFilter);

  /**
   * Remove listener for insertion override
   * @param inFilter  function which callers do not want called during insertion
   */
  void removeInsertionListener(nsIContentFilter inFilter);

  /**
   * Returns an anonymous nsDOMElement of type aTag,
   * child of aParentNode. If aIsCreatedHidden is true, the class
   * "hidden" is added to the created element. If aAnonClass is not
   * the empty string, it becomes the value of the attribute "_moz_anonclass"
   * @return a DOM Element
   * @param aTag             [IN] a string representing the desired type of
   *                              the element to create
   * @param aParentNode      [IN] the parent node of the created anonymous
   *                              element
   * @param aAnonClass       [IN] contents of the _moz_anonclass attribute
   * @param aIsCreatedHidden [IN] a boolean specifying if the class "hidden"
   *                              is to be added to the created anonymous
   *                              element
   */
  nsIDOMElement createAnonymousElement(String aTag, nsIDOMNode aParentNode, String aAnonClass, boolean aIsCreatedHidden);

  /**
   * returns the deepest container of the selection
   * @return a DOM Element
   */
  nsIDOMElement getSelectionContainer();

  /**
   * Checks if the anonymous nodes created by the HTML editor have to be
   * refreshed or hidden depending on a possible new state of the selection
   * @param aSelection [IN] a selection
   */
  void checkSelectionStateForAnonymousButtons(nsISelection aSelection);

  boolean isAnonymousElement(nsIDOMElement aElement);

  /**
   * A boolean indicating if a return key pressed in a paragraph creates
   * another paragraph or just inserts a <br> at the caret
   *
   * @return    true if CR in a paragraph creates a new paragraph
   */
  boolean getReturnInParagraphCreatesNewParagraph();

  /**
   * A boolean indicating if a return key pressed in a paragraph creates
   * another paragraph or just inserts a <br> at the caret
   *
   * @return    true if CR in a paragraph creates a new paragraph
   */
  void setReturnInParagraphCreatesNewParagraph(boolean aReturnInParagraphCreatesNewParagraph);

}