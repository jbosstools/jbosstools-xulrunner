/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/txmgr/idl/nsITransactionList.idl
 */

package org.mozilla.interfaces;

public interface nsITransactionList extends nsISupports {

  String NS_ITRANSACTIONLIST_IID =
    "{97f863f3-f886-11d4-9d39-0060b0f8baff}";

  /**
   * The number of transactions contained in this list.
   */
  int getNumItems();

  /**
   * itemIsBatch() returns true if the item at aIndex is a batch. Note that
   * currently there is no requirement for a TransactionManager implementation
   * to associate a toplevel nsITransaction with a batch so it is possible for
   * itemIsBatch() to return true and getItem() to return null. However, you
   * can still access the transactions contained in the batch with a call to
   * getChildListForItem().
   * @param aIndex The index of the item in the list.
   */
  boolean itemIsBatch(int aIndex);

  /**
   * getItem() returns the transaction at the given index in the list. Note that
   * a null can be returned here if the item is a batch. The transaction
   * returned is AddRef'd so it is up to the caller to Release the transaction
   * when it is done.
   * @param aIndex The index of the item in the list.
   */
  nsITransaction getItem(int aIndex);

  /**
   * getNumChildrenForItem() returns the number of child (auto-aggreated)
   * transactions the item at aIndex has.
   * @param aIndex The index of the item in the list.
   */
  int getNumChildrenForItem(int aIndex);

  /**
   * getChildListForItem() returns the list of children associated with the
   * item at aIndex. Implementations may return null if there are no children,
   * or an empty list. The list returned is AddRef'd so it is up to the caller
   * to Release the transaction when it is done.
   * @param aIndex The index of the item in the list.
   */
  nsITransactionList getChildListForItem(int aIndex);

}