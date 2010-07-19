/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/shistory/public/nsISHistoryListener.idl
 */

package org.mozilla.interfaces;

/**
 * nsISHistoryListener defines the interface one can implement to receive
 * notifications about activities in session history and to be able to
 * cancel them.
 *
 * A session history listener will be notified when pages are added, removed
 * and loaded from session history. It can prevent any action (except adding
 * a new session history entry) from happening by returning false from the
 * corresponding callback method.
 *
 * A session history listener can be registered on a particular nsISHistory
 * instance via the nsISHistory::addSHistoryListener() method.
 *
 * @status FROZEN
 */
public interface nsISHistoryListener extends nsISupports {

  String NS_ISHISTORYLISTENER_IID =
    "{3b07f591-e8e1-11d4-9882-00c04fa02f40}";

  /**
   * Called when a new document is added to session history. New documents are
   * added to session history by docshell when new pages are loaded in a frame
   * or content area, for example via nsIWebNavigation::loadURI()
   *
   * @param aNewURI     The URI of the document to be added to session history.
   */
  void onHistoryNewEntry(nsIURI aNewURI);

  /**
   * Called when navigating to a previous session history entry, for example
   * due to a nsIWebNavigation::goBack() call.
   *
   * @param aBackURI    The URI of the session history entry being navigated to.
   * @return            Whether the operation can proceed.
   */
  boolean onHistoryGoBack(nsIURI aBackURI);

  /**
   * Called when navigating to a next session history entry, for example
   * due to a nsIWebNavigation::goForward() call.
   *
   * @param aForwardURI   The URI of the session history entry being navigated to.
   * @return              Whether the operation can proceed.
   */
  boolean onHistoryGoForward(nsIURI aForwardURI);

  /** 
   * Called when the current document is reloaded, for example due to a
   * nsIWebNavigation::reload() call.
   *
   * @param aReloadURI    The URI of the document to be reloaded.
   * @param aReloadFlags  Flags that indicate how the document is to be 
   *                      refreshed. See constants on the nsIWebNavigation
   *                      interface.
   * @return              Whether the operation can proceed.
   *
   * @see  nsIWebNavigation
   */
  boolean onHistoryReload(nsIURI aReloadURI, long aReloadFlags);

  /**
   * Called when navigating to a session history entry by index, for example,
   * when nsIWebNavigation::gotoIndex() is called.
   *
   * @param aIndex        The index in session history of the entry to be loaded.
   * @param aGotoURI      The URI of the session history entry to be loaded.
   * @return              Whether the operation can proceed.
   */
  boolean onHistoryGotoIndex(int aIndex, nsIURI aGotoURI);

  /**
   * Called when entries are removed from session history. Entries can be
   * removed from session history for various reasons, for example to control
   * the memory usage of the browser, to prevent users from loading documents
   * from history, to erase evidence of prior page loads, etc.
   *
   * To purge documents from session history call nsISHistory::PurgeHistory()
   *
   * @param aNumEntries   The number of entries to be removed from session history.
   * @return              Whether the operation can proceed.
   */
  boolean onHistoryPurge(int aNumEntries);

}