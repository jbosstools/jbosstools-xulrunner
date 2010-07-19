/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/nsIRDFXMLSerializer.idl
 */

package org.mozilla.interfaces;

public interface nsIRDFXMLSerializer extends nsISupports {

  String NS_IRDFXMLSERIALIZER_IID =
    "{8ae1fbf8-1dd2-11b2-bd21-d728069cca92}";

  /**
     * Initialize the serializer with the specified datasource.
     * @param aDataSource the datasource from which data will be
     *   serialized
     */
  void init(nsIRDFDataSource aDataSource);

  /**
     * Add the specified namespace to the serializer.
     * @param aPrefix the attribute namespace prefix
     * @param aURI the namespace URI
     */
  void addNameSpace(nsIAtom aPrefix, String aURI);

}