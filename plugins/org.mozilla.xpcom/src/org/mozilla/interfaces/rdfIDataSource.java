/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/rdfIDataSource.idl
 */

package org.mozilla.interfaces;

/**
 * Interface used in RDF to describe data sources.
 *
 * @status PLASMA
 */
public interface rdfIDataSource extends nsISupports {

  String RDFIDATASOURCE_IID =
    "{ebce86bd-1568-4a34-a808-9ccf9cde8087}";

  /**
     * Visit all the subject resources in the datasource. The order is
     * intederminate and may change from one invocation to the next.
     * The subjects will be in the aSubject argument in calls into
     * aVisitor, aPredicate and aObject will be null.
     * @note Implementations may throw NS_ERROR_NOT_IMPLEMENTED for
     * this method, but in this case RDF serializations of this
     * datasource will not be possible.
     */
  void visitAllSubjects(rdfITripleVisitor aVisitor);

  /**
     * Visit all the triples in the datasource. The order is
     * intederminate and may change from one invocation to the next.
     * @note Implementations may throw NS_ERROR_NOT_IMPLEMENTED for
     * this method, but in this case RDF serializations of this
     * datasource will not be possible.
     */
  void visitAllTriples(rdfITripleVisitor aVisitor);

}