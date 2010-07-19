/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/parser/htmlparser/public/nsIExtendedExpatSink.idl
 */

package org.mozilla.interfaces;

/**
 * This interface provides notification of syntax-level events.
 */
public interface nsIExtendedExpatSink extends nsIExpatSink {

  String NS_IEXTENDEDEXPATSINK_IID =
    "{0c2dc80f-7aa4-467a-9454-b89dba0e0779}";

  /**
   * Called at the beginning of the DTD, before any entity or notation
   * events.
   * @param aDoctypeName The document type name.
   * @param aSysid The declared system identifier for the external DTD subset,
   *               or null if none was declared.
   * @param aPubid The declared public identifier for the external DTD subset,
   *               or null if none was declared.
   */
  void handleStartDTD(String aDoctypeName, String aSysid, String aPubid);

  /**
   * Called when a prefix mapping starts to be in-scope, before any
   * startElement events.
   * @param aPrefix The Namespace prefix being declared. An empty string
   *                is used for the default element namespace, which has
   *                no prefix.
   * @param aUri The Namespace URI the prefix is mapped to.
   */
  void handleStartNamespaceDecl(String aPrefix, String aUri);

  /**
   * Called when a prefix mapping is no longer in-scope, after any
   * endElement events.
   * @param aPrefix The prefix that was being mapped. This is the empty string
   *                when a default mapping scope ends.
   */
  void handleEndNamespaceDecl(String aPrefix);

  /**
   * This is called for a declaration of notation.  The base argument is
   * whatever was set by XML_SetBase. aNotationName will never be
   * null. The other arguments can be.
   * @param aNotationName The notation name.
   * @param aSysId The notation's system identifier, or null if none was given.
   * @param aPubId The notation's pubilc identifier, or null if none was given.
   */
  void handleNotationDecl(String aNotationName, String aSysid, String aPubid);

  /**
   * This is called for a declaration of an unparsed (NDATA) entity.
   * aName, aSysid and aNotationName arguments will never be
   * null. The other arguments may be.
   * @param aName  The unparsed entity's name.
   * @param aSysId The notation's system identifier.
   * @param aPubId The notation's pubilc identifier, or null if none was given.
   * @param aNotationName The name of the associated notation.
   */
  void handleUnparsedEntityDecl(String aName, String aSysid, String aPubid, String aNotationName);

}