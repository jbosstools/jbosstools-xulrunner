/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/txmgr/idl/nsITransactionListener.idl
 */

package org.mozilla.interfaces;

/**
 * The nsITransactionListener interface.
 * <P>
 * This interface is implemented by an object that tracks transactions.
 */
public interface nsITransactionListener extends nsISupports {

  String NS_ITRANSACTIONLISTENER_IID =
    "{58e330c4-7b48-11d2-98b9-00805f297d89}";

  /**
   * Called before a transaction manager calls a transaction's
   * doTransaction() method.
   * @param aManager the transaction manager doing the transaction.
   * @param aTransaction the transaction being executed.
   * @result boolean value returned by listener which indicates
   * it's desire to interrupt normal control flow. Listeners should
   * return true if they want to interrupt normal control flow, without
   * throwing an error.
   */
  boolean willDo(nsITransactionManager aManager, nsITransaction aTransaction);

  /**
   * Called after a transaction manager calls the doTransaction() method of
   * a transaction.
   * @param aManager the transaction manager that did the transaction.
   * @param aTransaction the transaction that was executed.
   * @param aDoResult the nsresult returned after executing
   * the transaction.
   */
  void didDo(nsITransactionManager aManager, nsITransaction aTransaction, long aDoResult);

  /**
   * Called before a transaction manager calls the Undo() method of
   * a transaction.
   * @param aManager the transaction manager undoing the transaction.
   * @param aTransaction the transaction being undone.
   * @result boolean value returned by listener which indicates
   * it's desire to interrupt normal control flow. Listeners should
   * return true if they want to interrupt normal control flow, without
   * throwing an error. Note that listeners can also interrupt normal
   * control flow by throwing an nsresult that indicates an error.
   */
  boolean willUndo(nsITransactionManager aManager, nsITransaction aTransaction);

  /**
   * Called after a transaction manager calls the Undo() method of
   * a transaction.
   * @param aManager the transaction manager undoing the transaction.
   * @param aTransaction the transaction being undone.
   * @param aUndoResult the nsresult returned after undoing the transaction.
   */
  void didUndo(nsITransactionManager aManager, nsITransaction aTransaction, long aUndoResult);

  /**
   * Called before a transaction manager calls the Redo() method of
   * a transaction.
   * @param aManager the transaction manager redoing the transaction.
   * @param aTransaction the transaction being redone.
   * @result boolean value returned by listener which indicates
   * it's desire to interrupt normal control flow. Listeners should
   * return true if they want to interrupt normal control flow, without
   * throwing an error. Note that listeners can also interrupt normal
   * control flow by throwing an nsresult that indicates an error.
   */
  boolean willRedo(nsITransactionManager aManager, nsITransaction aTransaction);

  /**
   * Called after a transaction manager calls the Redo() method of
   * a transaction.
   * @param aManager the transaction manager redoing the transaction.
   * @param aTransaction the transaction being redone.
   * @param aRedoResult the nsresult returned after redoing the transaction.
   */
  void didRedo(nsITransactionManager aManager, nsITransaction aTransaction, long aRedoResult);

  /**
   * Called before a transaction manager begins a batch.
   * @param aManager the transaction manager beginning a batch.
   * @result boolean value returned by listener which indicates
   * it's desire to interrupt normal control flow. Listeners should
   * return true if they want to interrupt normal control flow, without
   * throwing an error. Note that listeners can also interrupt normal
   * control flow by throwing an nsresult that indicates an error.
   */
  boolean willBeginBatch(nsITransactionManager aManager);

  /**
   * Called after a transaction manager begins a batch.
   * @param aManager the transaction manager that began a batch.
   * @param aResult the nsresult returned after beginning a batch.
   */
  void didBeginBatch(nsITransactionManager aManager, long aResult);

  /**
   * Called before a transaction manager ends a batch.
   * @param aManager the transaction manager ending a batch.
   * @result boolean value returned by listener which indicates
   * it's desire to interrupt normal control flow. Listeners should
   * return true if they want to interrupt normal control flow, without
   * throwing an error. Note that listeners can also interrupt normal
   * control flow by throwing an nsresult that indicates an error.
   */
  boolean willEndBatch(nsITransactionManager aManager);

  /**
   * Called after a transaction manager ends a batch.
   * @param aManager the transaction manager ending a batch.
   * @param aResult the nsresult returned after ending a batch.
   */
  void didEndBatch(nsITransactionManager aManager, long aResult);

  /**
   * Called before a transaction manager tries to merge
   * a transaction, that was just executed, with the
   * transaction at the top of the undo stack.
   * @param aManager the transaction manager ending a batch.
   * @param aTopTransaction the transaction at the top of the undo stack.
   * @param aTransactionToMerge the transaction to merge.
   * @result boolean value returned by listener which indicates
   * it's desire to interrupt normal control flow. Listeners should
   * return true if they want to interrupt normal control flow, without
   * throwing an error. Note that listeners can also interrupt normal
   * control flow by throwing an nsresult that indicates an error.
   */
  boolean willMerge(nsITransactionManager aManager, nsITransaction aTopTransaction, nsITransaction aTransactionToMerge);

  /**
   * Called after a transaction manager tries to merge
   * a transaction, that was just executed, with the
   * transaction at the top of the undo stack.
   * @param aManager the transaction manager ending a batch.
   * @param aTopTransaction the transaction at the top of the undo stack.
   * @param aTransactionToMerge the transaction to merge.
   * @param aDidMerge true if transaction was merged, else false.
   * @param aMergeResult the nsresult returned after the merge attempt.
   * @param aInterrupt listeners should set this to PR_TRUE if they
   * want to interrupt normal control flow, without throwing an error.
   */
  void didMerge(nsITransactionManager aManager, nsITransaction aTopTransaction, nsITransaction aTransactionToMerge, boolean aDidMerge, long aMergeResult);

}