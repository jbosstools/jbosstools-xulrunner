/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/nsIRDFCompositeDataSource.idl
 */

package org.mozilla.interfaces;

/**
 * An nsIRDFCompositeDataSource composes individual data sources, providing
 * the illusion of a single, coherent RDF graph.
 */
public interface nsIRDFCompositeDataSource extends nsIRDFDataSource {

  String NS_IRDFCOMPOSITEDATASOURCE_IID =
    "{96343820-307c-11d2-bc15-00805f912fe7}";

  /**
     *
     * Set this value to <code>true</code> if the composite datasource
     * may contains at least one datasource that has <em>negative</em>
     * assertions. (This is the default.)
     *
     * Set this value to <code>false</code> if none of the datasources
     * being composed contains a negative assertion. This allows the
     * composite datasource to perform some query optimizations.
     *
     * By default, this value is <code>true</true>.
     */
  boolean getAllowNegativeAssertions();

  /**
     *
     * Set this value to <code>true</code> if the composite datasource
     * may contains at least one datasource that has <em>negative</em>
     * assertions. (This is the default.)
     *
     * Set this value to <code>false</code> if none of the datasources
     * being composed contains a negative assertion. This allows the
     * composite datasource to perform some query optimizations.
     *
     * By default, this value is <code>true</true>.
     */
  void setAllowNegativeAssertions(boolean aAllowNegativeAssertions);

  /**
     * Set to <code>true</code> if the composite datasource should
     * take care to coalesce duplicate arcs when returning values from
     * queries. (This is the default.)
     *
     * Set to <code>false</code> if the composite datasource shouldn't
     * bother to check for duplicates. This allows the composite
     * datasource to more efficiently answer queries.
     *
     * By default, this value is <code>true</code>.
     */
  boolean getCoalesceDuplicateArcs();

  /**
     * Set to <code>true</code> if the composite datasource should
     * take care to coalesce duplicate arcs when returning values from
     * queries. (This is the default.)
     *
     * Set to <code>false</code> if the composite datasource shouldn't
     * bother to check for duplicates. This allows the composite
     * datasource to more efficiently answer queries.
     *
     * By default, this value is <code>true</code>.
     */
  void setCoalesceDuplicateArcs(boolean aCoalesceDuplicateArcs);

  /**
     * Add a datasource the the composite data source.
     * @param aDataSource the datasource to add to composite
     */
  void addDataSource(nsIRDFDataSource aDataSource);

  /**
     * Remove a datasource from the composite data source.
     * @param aDataSource the datasource to remove from the composite
     */
  void removeDataSource(nsIRDFDataSource aDataSource);

  /**
     * Retrieve the datasources in the composite data source.
     * @return an nsISimpleEnumerator that will enumerate each
     * of the datasources in the composite
     */
  nsISimpleEnumerator getDataSources();

}