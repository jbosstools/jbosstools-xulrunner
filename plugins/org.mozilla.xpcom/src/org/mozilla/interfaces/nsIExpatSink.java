/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/parser/htmlparser/public/nsIExpatSink.idl
 */

package org.mozilla.interfaces;

/**
 * This interface should be implemented by any content sink that wants
 * to get output from expat and do something with it; in other words,
 * by any sink that handles some sort of XML dialect.
 */
public interface nsIExpatSink extends nsISupports {

  String NS_IEXPATSINK_IID =
    "{f61c56b5-ea5b-42b4-ad3c-17416e72e238}";

  /**
   * Called to handle the opening tag of an element.
   * @param aName the fully qualified tagname of the element
   * @param aAtts the array of attribute names and values.  There are
   *        aAttsCount/2 names and aAttsCount/2 values, so the total number of
   *        elements in the array is aAttsCount.  The names and values
   *        alternate.  Thus, if we number attributes starting with 0,
   *        aAtts[2*k] is the name of the k-th attribute and aAtts[2*k+1] is
   *        the value of that attribute  Both explicitly specified attributes
   *        and attributes that are defined to have default values in a DTD are
   *        present in aAtts.
   * @param aAttsCount the number of elements in aAtts.
   * @param aIndex If the element has an attribute of type ID, then
   *        aAtts[aIndex] is the name of that attribute.  Otherwise, aIndex
   *        is -1
   * @param aLineNumber the line number of the start tag in the data stream.
   */
  void handleStartElement(String aName, String[] aAtts, long aAttsCount, int aIndex, long aLineNumber);

  /**
   * Called to handle the closing tag of an element.
   * @param aName the fully qualified tagname of the element
   */
  void handleEndElement(String aName);

  /**
   * Called to handle a comment
   * @param aCommentText the text of the comment (not including the
   *        "<!--" and "-->")
   */
  void handleComment(String aCommentText);

  /**
   * Called to handle a CDATA section
   * @param aData the text in the CDATA section.  This is null-terminated.
   * @param aLength the length of the aData string
   */
  void handleCDataSection(String aData, long aLength);

  /**
   * Called to handle the doctype declaration
   */
  void handleDoctypeDecl(String aSubset, String aName, String aSystemId, String aPublicId, nsISupports aCatalogData);

  /**
   * Called to handle character data.  Note that this does NOT get
   * called for the contents of CDATA sections.
   * @param aData the data to handle.  aData is NOT NULL-TERMINATED.
   * @param aLength the length of the aData string
   */
  void handleCharacterData(String aData, long aLength);

  /**
   * Called to handle a processing instruction
   * @param aTarget the PI target (e.g. xml-stylesheet)
   * @param aData all the rest of the data in the PI
   */
  void handleProcessingInstruction(String aTarget, String aData);

  /**
   * Handle the XML Declaration.
   *
   * @param aVersion    The version string, can be null if not specified.
   * @param aEncoding   The encoding string, can be null if not specified.
   * @param aStandalone -1, 0, or 1 indicating respectively that there was no
   *                    standalone parameter in the declaration, that it was
   *                    given as no, or that it was given as yes.
   */
  void handleXMLDeclaration(String aVersion, String aEncoding, int aStandalone);

  /**
   * Ask the content sink if the expat driver should log an error to the console.
   *
   * @param aErrorText  Error message to pass to content sink.
   * @param aSourceText Source text of the document we're parsing.
   * @param aError      Script error object with line number & column number
   *
   * @retval True if the expat driver should report the error.
   */
  boolean reportError(String aErrorText, String aSourceText, nsIScriptError aError);

}