/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/nsIRDFInferDataSource.idl
 */

package org.mozilla.interfaces;

/**
 * An nsIRDFInferDataSource is implemented by a infer engine. This
 * engine mimics assertions in addition to those in the baseDataSource
 * according to a particular vocabulary.
 * Infer engines have contract IDs in the form of
 * "@mozilla.org/rdf/infer-datasource;1?engine="
 */
public interface nsIRDFInferDataSource extends nsIRDFDataSource {

  String NS_IRDFINFERDATASOURCE_IID =
    "{2b04860f-4017-40f6-8a57-784a1e35077a}";

  /**
     *
     * The wrapped datasource.
     *
     * The InferDataSource contains all arcs from the wrapped
     * datasource plus those infered by the vocabulary implemented
     * by the InferDataSource.
     */
  nsIRDFDataSource getBaseDataSource();

  /**
     *
     * The wrapped datasource.
     *
     * The InferDataSource contains all arcs from the wrapped
     * datasource plus those infered by the vocabulary implemented
     * by the InferDataSource.
     */
  void setBaseDataSource(nsIRDFDataSource aBaseDataSource);

}