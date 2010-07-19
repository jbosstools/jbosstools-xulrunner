/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/nsIRDFDataSource.idl
 */

package org.mozilla.interfaces;

public interface nsIRDFDataSource extends nsISupports {

  String NS_IRDFDATASOURCE_IID =
    "{0f78da58-8321-11d2-8eac-00805f29f370}";

  /** The "URI" of the data source. This used by the RDF service's
     * |GetDataSource()| method to cache datasources.
     */
  String getURI();

  /** Find an RDF resource that points to a given node over the
     * specified arc & truth value
     *
     * @return NS_RDF_NO_VALUE if there is no source that leads
     * to the target with the specified property.
     */
  nsIRDFResource getSource(nsIRDFResource aProperty, nsIRDFNode aTarget, boolean aTruthValue);

  /**
     * Find all RDF resources that point to a given node over the
     * specified arc & truth value
     *
     * @return NS_OK unless a catastrophic error occurs. If the
     * method returns NS_OK, you may assume that nsISimpleEnumerator points
     * to a valid (but possibly empty) cursor.
     */
  nsISimpleEnumerator getSources(nsIRDFResource aProperty, nsIRDFNode aTarget, boolean aTruthValue);

  /**
     * Find a child of that is related to the source by the given arc
     * arc and truth value
     *
     * @return NS_RDF_NO_VALUE if there is no target accessible from the
     * source via the specified property.
     */
  nsIRDFNode getTarget(nsIRDFResource aSource, nsIRDFResource aProperty, boolean aTruthValue);

  /**
     * Find all children of that are related to the source by the given arc
     * arc and truth value.
     *
     * @return NS_OK unless a catastrophic error occurs. If the
     * method returns NS_OK, you may assume that nsISimpleEnumerator points
     * to a valid (but possibly empty) cursor.
     */
  nsISimpleEnumerator getTargets(nsIRDFResource aSource, nsIRDFResource aProperty, boolean aTruthValue);

  /**
     * Add an assertion to the graph.
     */
  void _assert(nsIRDFResource aSource, nsIRDFResource aProperty, nsIRDFNode aTarget, boolean aTruthValue);

  /**
     * Remove an assertion from the graph.
     */
  void unassert(nsIRDFResource aSource, nsIRDFResource aProperty, nsIRDFNode aTarget);

  /**
     * Change an assertion from
     *
     *   [aSource]--[aProperty]-->[aOldTarget]
     *
     * to
     * 
     *   [aSource]--[aProperty]-->[aNewTarget]
     */
  void change(nsIRDFResource aSource, nsIRDFResource aProperty, nsIRDFNode aOldTarget, nsIRDFNode aNewTarget);

  /**
     * 'Move' an assertion from
     *
     *   [aOldSource]--[aProperty]-->[aTarget]
     *
     * to
     * 
     *   [aNewSource]--[aProperty]-->[aTarget]
     */
  void move(nsIRDFResource aOldSource, nsIRDFResource aNewSource, nsIRDFResource aProperty, nsIRDFNode aTarget);

  /**
     * Query whether an assertion exists in this graph.
     */
  boolean hasAssertion(nsIRDFResource aSource, nsIRDFResource aProperty, nsIRDFNode aTarget, boolean aTruthValue);

  /**
     * Add an observer to this data source. If the datasource
     * supports observers, the datasource source should hold a strong
     * reference to the observer.
     */
  void addObserver(nsIRDFObserver aObserver);

  /**
     * Remove an observer from this data source.
     */
  void removeObserver(nsIRDFObserver aObserver);

  /**
     * Get a cursor to iterate over all the arcs that point into a node.
     *
     * @return NS_OK unless a catastrophic error occurs. If the method
     * returns NS_OK, you may assume that labels points to a valid (but
     * possible empty) nsISimpleEnumerator object.
     */
  nsISimpleEnumerator arcLabelsIn(nsIRDFNode aNode);

  /**
     * Get a cursor to iterate over all the arcs that originate in
     * a resource.
     *
     * @return NS_OK unless a catastrophic error occurs. If the method
     * returns NS_OK, you may assume that labels points to a valid (but
     * possible empty) nsISimpleEnumerator object.
     */
  nsISimpleEnumerator arcLabelsOut(nsIRDFResource aSource);

  /**
     * Retrieve all of the resources that the data source currently
     * refers to.
     */
  nsISimpleEnumerator getAllResources();

  /**
     * Returns whether a given command is enabled for a set of sources. 
     */
  boolean isCommandEnabled(nsISupportsArray aSources, nsIRDFResource aCommand, nsISupportsArray aArguments);

  /**
     * Perform the specified command on set of sources.
     */
  void doCommand(nsISupportsArray aSources, nsIRDFResource aCommand, nsISupportsArray aArguments);

  /**
     * Returns the set of all commands defined for a given source.
     */
  nsISimpleEnumerator getAllCmds(nsIRDFResource aSource);

  /**
     * Returns true if the specified node is pointed to by the specified arc.
     * Equivalent to enumerating ArcLabelsIn and comparing for the specified arc.
     */
  boolean hasArcIn(nsIRDFNode aNode, nsIRDFResource aArc);

  /**
     * Returns true if the specified node has the specified outward arc.
     * Equivalent to enumerating ArcLabelsOut and comparing for the specified arc.
     */
  boolean hasArcOut(nsIRDFResource aSource, nsIRDFResource aArc);

  /**
     * Notify observers that the datasource is about to send several
     * notifications at once.
     * This must be followed by calling endUpdateBatch(), otherwise
     * viewers will get out of sync.
     */
  void beginUpdateBatch();

  /**
     * Notify observers that the datasource has completed issuing
     * a notification group.
     */
  void endUpdateBatch();

}