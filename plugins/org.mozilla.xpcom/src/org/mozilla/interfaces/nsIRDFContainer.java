/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/nsIRDFContainer.idl
 */

package org.mozilla.interfaces;

public interface nsIRDFContainer extends nsISupports {

  String NS_IRDFCONTAINER_IID =
    "{d4214e90-fb94-11d2-bdd8-00104bde6048}";

  nsIRDFDataSource getDataSource();

  nsIRDFResource getResource();

  /**
     * Initialize the container wrapper to the specified resource
     * using the specified datasource for context.
     */
  void init(nsIRDFDataSource aDataSource, nsIRDFResource aContainer);

  /**
     * Return the number of elements in the container. Note that this
     * may not always be accurate due to aggregation.
     */
  int getCount();

  /**
     * Return an enumerator that can be used to enumerate the contents
     * of the container in ascending order.
     */
  nsISimpleEnumerator getElements();

  /**
     * Append an element to the container, assigning it the next
     * available ordinal.
     */
  void appendElement(nsIRDFNode aElement);

  /**
     * Remove the first occurence of the specified element from the
     * container. If aRenumber is 'true', then the underlying RDF graph
     * will be 're-numbered' to account for the removal.
     */
  void removeElement(nsIRDFNode aElement, boolean aRenumber);

  /**
     * Insert aElement at the specified index. If aRenumber is 'true', then
     * the underlying RDF graph will be 're-numbered' to accomodate the new
     * element.
     */
  void insertElementAt(nsIRDFNode aElement, int aIndex, boolean aRenumber);

  /**
     * Remove the element at the specified index. If aRenumber is 'true', then
     * the underlying RDF graph will be 're-numbered' to account for the
     * removal.
     *
     * @return the element that was removed.
     */
  nsIRDFNode removeElementAt(int aIndex, boolean aRenumber);

  /**
     * Determine the index of an element in the container.
     *
     * @return The index of the specified element in the container. If
     * the element is not contained in the container, this function
     * returns '-1'.
     */
  int indexOf(nsIRDFNode aElement);

}