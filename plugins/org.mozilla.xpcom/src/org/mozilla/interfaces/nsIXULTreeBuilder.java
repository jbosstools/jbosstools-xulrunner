/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xul/templates/public/nsIXULTemplateBuilder.idl
 */

package org.mozilla.interfaces;

public interface nsIXULTreeBuilder extends nsISupports {

  String NS_IXULTREEBUILDER_IID =
    "{06b31b15-ebf5-4e74-a0e2-6bc0a18a3969}";

  /**
     * Retrieve the RDF resource associated with the specified row.
     */
  nsIRDFResource getResourceAtIndex(int aRowIndex);

  /**
     * Retrieve the index associated with specified RDF resource.
     */
  int getIndexOfResource(nsIRDFResource resource);

  /** 
     * Add a Tree Builder Observer to handle Tree View 
     * methods that the base builder does not implement. 
     */
  void addObserver(nsIXULTreeBuilderObserver aObserver);

  /** 
     * Remove an Tree Builder Observer.
     */
  void removeObserver(nsIXULTreeBuilderObserver aObserver);

  /** 
     * Sort the contents of the tree using the specified column.
     */
  void sort(nsIDOMElement aColumnElement);

}