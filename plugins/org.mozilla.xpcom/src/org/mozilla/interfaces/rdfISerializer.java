/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/rdfISerializer.idl
 */

package org.mozilla.interfaces;

/**
 * Interface used to serialize RDF.
 *
 * @status PLASMA
 */
public interface rdfISerializer extends nsISupports {

  String RDFISERIALIZER_IID =
    "{f0edfcdd-8bca-4d32-9226-7421001396a4}";

  /**
     * Synchronously serialize the given datasource to the outputstream.
     *
     * Implementations are not required to implement any buffering or
     * other stream-based optimizations.
     *
     * @param aDataSource The RDF data source to be serialized.
     * @param aOut The output stream to use.
     */
  void serialize(rdfIDataSource aDataSource, nsIOutputStream aOut);

}