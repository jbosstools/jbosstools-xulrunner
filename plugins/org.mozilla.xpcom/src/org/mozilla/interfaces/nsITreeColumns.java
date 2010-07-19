/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/xul/base/src/tree/public/nsITreeColumns.idl
 */

package org.mozilla.interfaces;

public interface nsITreeColumns extends nsISupports {

  String NS_ITREECOLUMNS_IID =
    "{f8a8d6b4-6788-438d-9009-7142798767ab}";

  /**
   * The tree widget for these columns.
   */
  nsITreeBoxObject getTree();

  /**
   * The number of columns.
   */
  int getCount();

  /**
   * An alias for count (for the benefit of scripts which treat this as an
   * array).
   */
  int getLength();

  /**
   * Get the first/last column.
   */
  nsITreeColumn getFirstColumn();

  nsITreeColumn getLastColumn();

  /**
   * Attribute based column getters.
   */
  nsITreeColumn getPrimaryColumn();

  nsITreeColumn getSortedColumn();

  nsITreeColumn getKeyColumn();

  /**
   * Get the column for the given element.
   */
  nsITreeColumn getColumnFor(nsIDOMElement element);

  /**
   * Parametric column getters.
   */
  nsITreeColumn getNamedColumn(String id);

  nsITreeColumn getColumnAt(int index);

  /**
   * This method is called whenever a treecol is added or removed and
   * the column cache needs to be rebuilt.
   */
  void invalidateColumns();

  void restoreNaturalOrder();

}