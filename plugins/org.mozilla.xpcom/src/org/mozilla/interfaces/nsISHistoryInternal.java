/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/shistory/public/nsISHistoryInternal.idl
 */

package org.mozilla.interfaces;

public interface nsISHistoryInternal extends nsISupports {

  String NS_ISHISTORYINTERNAL_IID =
    "{7ca0fd71-437c-48ad-985d-11ce9e2429b4}";

  /**
   * Add a new Entry to the History List
   * @param aEntry - The entry to add
   * @param aPersist - If true this specifies that the entry should persist
   * in the list.  If false, this means that when new entries are added
   * this element will not appear in the session history list.
   */
  void addEntry(nsISHEntry aEntry, boolean aPersist);

  /**
   * Get the root transaction
   */
  nsISHTransaction getRootTransaction();

  /**
   * The toplevel docshell object to which this SHistory object belongs to.
   */
  nsIDocShell getRootDocShell();

  /**
   * The toplevel docshell object to which this SHistory object belongs to.
   */
  void setRootDocShell(nsIDocShell aRootDocShell);

  /** 
   * Update the index maintained by sessionHistory
   */
  void updateIndex();

  /**
   * Replace the nsISHEntry at a particular index
   * @param aIndex - The index at which the entry shoud be replaced
   * @param aReplaceEntry - The replacement entry for the index.
   */
  void replaceEntry(int aIndex, nsISHEntry aReplaceEntry);

  /** 
   * Get handle to the history listener
   */
  nsISHistoryListener getListener();

  /**
   * Evict content viewers until the number of content viewers per tab
   * is no more than gHistoryMaxViewers.  Also, count
   * total number of content viewers globally and evict one if we are over
   * our total max.  This is always called in Show(), after we destroy
   * the previous viewer.
   */
  void evictContentViewers(int previousIndex, int index);

  /**
    * Evict the content viewer associated with a session history entry
    * that has timed out.
    */
  void evictExpiredContentViewerForEntry(nsISHEntry aEntry);

  /**
    * Evict all the content viewers in this session history
    */
  void evictAllContentViewers();

}