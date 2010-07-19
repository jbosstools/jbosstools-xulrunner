/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/rdfITripleVisitor.idl
 */

package org.mozilla.interfaces;

/**
 * Interface used in RDF to enumerate triples.
 * Also used by rdfIDataSource::getAllSubjects, then aPredicate,
 * aObject and aTruthValue are ignored.
 *
 * @status PLASMA
 */
public interface rdfITripleVisitor extends nsISupports {

  String RDFITRIPLEVISITOR_IID =
    "{aafea151-c271-4505-9978-a100d292800c}";

  /**
     * Callback function for returning query results.
     *
     * @param aSubject, aPredicate, aObject describe the (sub-)arc
     * @returnCode NS_RDF_STOP_VISIT to stop iterating over the query result.
     *             Any error code will stop the iteration as well.
     */
  void visit(nsIRDFNode aSubject, nsIRDFResource aPredicate, nsIRDFNode aObject, boolean aTruthValue);

}