/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/parser/xml/public/nsISAXXMLReader.idl
 */

package org.mozilla.interfaces;

/**
 * Interface for reading an XML document using callbacks.
 *
 * nsISAXXMLReader is the interface that an XML parser's SAX2
 * driver must implement.  This interface allows an application to set
 * and query features and properties in the parser, to register event
 * handlers for document processing, and to initiate a document
 * parse.
 */
public interface nsISAXXMLReader extends nsIStreamListener {

  String NS_ISAXXMLREADER_IID =
    "{5556997e-d816-4218-8b54-803d4261206e}";

  /**
   * The base URI.
   */
  nsIURI getBaseURI();

  /**
   * The base URI.
   */
  void setBaseURI(nsIURI aBaseURI);

  /**
   * If the application does not register a content handler, all
   * content events reported by the SAX parser will be silently
   * ignored.
   *
   * Applications may register a new or different handler in the
   * middle of a parse, and the SAX parser must begin using the new
   * handler immediately.
   */
  nsISAXContentHandler getContentHandler();

  /**
   * If the application does not register a content handler, all
   * content events reported by the SAX parser will be silently
   * ignored.
   *
   * Applications may register a new or different handler in the
   * middle of a parse, and the SAX parser must begin using the new
   * handler immediately.
   */
  void setContentHandler(nsISAXContentHandler aContentHandler);

  /**
   * If the application does not register a DTD handler, all DTD
   * events reported by the SAX parser will be silently ignored.
   *
   * Applications may register a new or different handler in the
   * middle of a parse, and the SAX parser must begin using the new
   * handler immediately.
   */
  nsISAXDTDHandler getDtdHandler();

  /**
   * If the application does not register a DTD handler, all DTD
   * events reported by the SAX parser will be silently ignored.
   *
   * Applications may register a new or different handler in the
   * middle of a parse, and the SAX parser must begin using the new
   * handler immediately.
   */
  void setDtdHandler(nsISAXDTDHandler aDtdHandler);

  /**
   * If the application does not register an error handler, all
   * error events reported by the SAX parser will be silently ignored;
   * however, normal processing may not continue.  It is highly
   * recommended that all SAX applications implement an error handler
   * to avoid unexpected bugs.
   *
   * Applications may register a new or different handler in the
   * middle of a parse, and the SAX parser must begin using the new
   * handler immediately.
   */
  nsISAXErrorHandler getErrorHandler();

  /**
   * If the application does not register an error handler, all
   * error events reported by the SAX parser will be silently ignored;
   * however, normal processing may not continue.  It is highly
   * recommended that all SAX applications implement an error handler
   * to avoid unexpected bugs.
   *
   * Applications may register a new or different handler in the
   * middle of a parse, and the SAX parser must begin using the new
   * handler immediately.
   */
  void setErrorHandler(nsISAXErrorHandler aErrorHandler);

  /**
   * If the application does not register a lexical handler, all
   * lexical events (e.g. startDTD) reported by the SAX parser will be
   * silently ignored.
   *
   * Applications may register a new or different handler in the
   * middle of a parse, and the SAX parser must begin using the new
   * handler immediately.
   */
  nsISAXLexicalHandler getLexicalHandler();

  /**
   * If the application does not register a lexical handler, all
   * lexical events (e.g. startDTD) reported by the SAX parser will be
   * silently ignored.
   *
   * Applications may register a new or different handler in the
   * middle of a parse, and the SAX parser must begin using the new
   * handler immediately.
   */
  void setLexicalHandler(nsISAXLexicalHandler aLexicalHandler);

  /**
   * Set the value of a feature flag. NOT CURRENTLY IMPLEMENTED.
   *
   * The feature name is any fully-qualified URI.  It is possible
   * for an XMLReader to expose a feature value but to be unable to
   * change the current value.  Some feature values may be immutable
   * or mutable only in specific contexts, such as before, during, or
   * after a parse.
   *
   * All XMLReaders are required to support setting
   * http://xml.org/sax/features/namespaces to true and
   * http://xml.org/sax/features/namespace-prefixes to false.
   *
   * @param name String flag for a parser feature.
   * @param value Turn the feature on/off.
   */
  void setFeature(String name, boolean value);

  /**
   * Look up the value of a feature flag. NOT CURRENTLY IMPLEMENTED.
   *
   * The feature name is any fully-qualified URI.  It is
   * possible for an XMLReader to recognize a feature name but
   * temporarily be unable to return its value.
   * Some feature values may be available only in specific
   * contexts, such as before, during, or after a parse.
   *
   * All XMLReaders are required to recognize the
   * http://xml.org/sax/features/namespaces and the
   * http://xml.org/sax/features/namespace-prefixes feature names.
   *
   * @param name String flag for a parser feature.
   */
  boolean getFeature(String name);

  /**
   * Set the value of a property. NOT CURRENTLY IMPLEMENTED.
   *
   * The property name is any fully-qualified URI.  It is possible
   * for an XMLReader to recognize a property name but to be unable to
   * change the current value.  Some property values may be immutable
   * or mutable only in specific contexts, such as before, during, or
   * after a parse.
   *
   * XMLReaders are not required to recognize setting any specific
   * property names, though a core set is defined by SAX2.
   *
   * This method is also the standard mechanism for setting
   * extended handlers.
   *
   * @param name String flag for a parser feature
   * @param value Turn the feature on/off.
   */
  void setProperty(String name, nsISupports value);

  /**
   * Look up the value of a property. NOT CURRENTLY IMPLEMENTED.
   *
   * The property name is any fully-qualified URI.  It is
   * possible for an XMLReader to recognize a property name but
   * temporarily be unable to return its value.
   * Some property values may be available only in specific
   * contexts, such as before, during, or after a parse.
   *
   * XMLReaders are not required to recognize any specific
   * property names, though an initial core set is documented for
   * SAX2.
   *
   * Implementors are free (and encouraged) to invent their own properties,
   * using names built on their own URIs.
   *
   * @param name The property name, which is a fully-qualified URI.
   * @return The current value of the property.
   */
  boolean getProperty(String name);

  /**
   *
   * @param str The UTF16 string to be parsed
   * @param contentType The content type of the string (see parseFromStream)
   *
   */
  void parseFromString(String str, String contentType);

  /**
   *
   * @param stream The byte stream whose contents are parsed
   * @param charset The character set that was used to encode the byte
   *                stream. NULL if not specified.
   * @param contentType The content type of the string - either text/xml,
   *                    application/xml, or application/xhtml+xml.
   *                    Must not be NULL.
   *
   */
  void parseFromStream(nsIInputStream stream, String charset, String contentType);

  /**
   * Begin an asynchronous parse. This method initializes the parser,
   * and must be called before any nsIStreamListener methods. It is
   * then the caller's duty to call nsIStreamListener methods to drive
   * the parser. Once this method is called, the caller must not call
   * one of the other parse methods.
   *
   * @param observer The nsIRequestObserver to notify upon start or stop.
   *                 Can be NULL.
   */
  void parseAsync(nsIRequestObserver observer);

}