/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/nsIRDFContainerUtils.idl
 */

package org.mozilla.interfaces;

public interface nsIRDFContainerUtils extends nsISupports {

  String NS_IRDFCONTAINERUTILS_IID =
    "{d4214e91-fb94-11d2-bdd8-00104bde6048}";

  /**
     * Returns 'true' if the property is an RDF ordinal property.
     */
  boolean isOrdinalProperty(nsIRDFResource aProperty);

  /**
     * Convert the specified index to an ordinal property.
     */
  nsIRDFResource indexToOrdinalResource(int aIndex);

  /**
     * Convert the specified ordinal property into an index
     */
  int ordinalResourceToIndex(nsIRDFResource aOrdinal);

  /**
     * Return 'true' if the specified resource is a container
     */
  boolean isContainer(nsIRDFDataSource aDataSource, nsIRDFResource aResource);

  /**
     * Return 'true' if the specified resource is a container and it is empty
     */
  boolean isEmpty(nsIRDFDataSource aDataSource, nsIRDFResource aResource);

  /**
     * Return 'true' if the specified resource is a bag
     */
  boolean isBag(nsIRDFDataSource aDataSource, nsIRDFResource aResource);

  /**
     * Return 'true' if the specified resource is a sequence
     */
  boolean isSeq(nsIRDFDataSource aDataSource, nsIRDFResource aResource);

  /**
     * Return 'true' if the specified resource is an alternation
     */
  boolean isAlt(nsIRDFDataSource aDataSource, nsIRDFResource aResource);

  /**
     * Decorates the specified resource appropriately to make it
     * usable as an empty bag in the specified data source.
     */
  nsIRDFContainer makeBag(nsIRDFDataSource aDataSource, nsIRDFResource aResource);

  /**
     * Decorates the specified resource appropriately to make it
     * usable as an empty sequence in the specified data source.
     */
  nsIRDFContainer makeSeq(nsIRDFDataSource aDataSource, nsIRDFResource aResource);

  /**
     * Decorates the specified resource appropriately to make it
     * usable as an empty alternation in the specified data source.
     */
  nsIRDFContainer makeAlt(nsIRDFDataSource aDataSource, nsIRDFResource aResource);

  /**
     * Retrieve the index of element in the container. Returns -1 if
     * the element is not in the container.
     */
  int indexOf(nsIRDFDataSource aDataSource, nsIRDFResource aContainer, nsIRDFNode aElement);

}