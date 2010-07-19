/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/shistory/public/nsISHTransaction.idl
 */

package org.mozilla.interfaces;

/**
 * The nsISHTransaction.
 */
public interface nsISHTransaction extends nsISupports {

  String NS_ISHTRANSACTION_IID =
    "{2edf705f-d252-4971-9f09-71dd0f760dc6}";

  /**
     * The nsISHEntry for the current transaction
     */
  nsISHEntry getSHEntry();

  /**
     * The nsISHEntry for the current transaction
     */
  void setSHEntry(nsISHEntry aSHEntry);

  /**
	 * The parent of this transaction
	 */
  nsISHTransaction getPrev();

  /**
	 * The parent of this transaction
	 */
  void setPrev(nsISHTransaction aPrev);

  /**
	 * The legitimate child of this transaction 
	 */
  nsISHTransaction getNext();

  /**
	 * The legitimate child of this transaction 
	 */
  void setNext(nsISHTransaction aNext);

  /**
	 *	Specifies if this transaction should persist.  If not it will be replaced
	 * by new additions to the list.
	 */
  boolean getPersist();

  /**
	 *	Specifies if this transaction should persist.  If not it will be replaced
	 * by new additions to the list.
	 */
  void setPersist(boolean aPersist);

  /**
	 * Create a transaction with parent and History Entry 
	 */
  void create(nsISHEntry aSHEntry, nsISHTransaction aPrev);

}