/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/nsIRDFXMLParser.idl
 */

package org.mozilla.interfaces;

public interface nsIRDFXMLParser extends nsISupports {

  String NS_IRDFXMLPARSER_IID =
    "{1831dd2e-1dd2-11b2-bdb3-86b7b50b70b5}";

  /**
     * Create a stream listener that can be used to asynchronously
     * parse RDF/XML.
     * @param aSink the RDF datasource the will receive the data
     * @param aBaseURI the base URI used to resolve relative
     *   references in the RDF/XML
     * @return an nsIStreamListener object to handle the data
     */
  nsIStreamListener parseAsync(nsIRDFDataSource aSink, nsIURI aBaseURI);

  /**
     * Parse a string of RDF/XML
     * @param aSink the RDF datasource that will receive the data
     * @param aBaseURI the base URI used to resolve relative
     *   references in the RDF/XML
     * @param aSource a UTF8 string containing RDF/XML data.
     */
  void parseString(nsIRDFDataSource aSink, nsIURI aBaseURI, String aSource);

}