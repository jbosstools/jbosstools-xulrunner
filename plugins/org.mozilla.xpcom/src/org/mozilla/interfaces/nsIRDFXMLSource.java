/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/nsIRDFXMLSource.idl
 */

package org.mozilla.interfaces;

public interface nsIRDFXMLSource extends nsISupports {

  String NS_IRDFXMLSOURCE_IID =
    "{4da56f10-99fe-11d2-8ebb-00805f29f370}";

  /**
     * Serialize the contents of the datasource to aStream.
     * @param aStream the output stream the will receive the
     *   RDF/XML. Currently, the output stream need only
     *   implement the |write()| method.
     */
  void serialize(nsIOutputStream aStream);

}