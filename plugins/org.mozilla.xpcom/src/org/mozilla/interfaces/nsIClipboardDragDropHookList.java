/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsIClipboardDragDropHookList.idl
 */

package org.mozilla.interfaces;

/**
 * Please note that the following api is not intended for embedders;
 * it is intended as an internal (to gecko).  Embedders can indirectly
 * call these by sending commands (see description in 
 * nsIClipboardDragDropHooks.idl).
 *
 * Internal gecko usage is accomplished by calling get_Interface on a
 * docshell.
 */
public interface nsIClipboardDragDropHookList extends nsISupports {

  String NS_ICLIPBOARDDRAGDROPHOOKLIST_IID =
    "{876a2015-6b66-11d7-8f18-0003938a9d96}";

  /**
   * Add a hook to list.
   * @param aHooks  implementation of hooks
   */
  void addClipboardDragDropHooks(nsIClipboardDragDropHooks aHooks);

  /**
   * Remove a hook from list (note if this implementation is not present
   * in the list then removal will be ignored).
   * @param aHooks  implementation of hooks
   */
  void removeClipboardDragDropHooks(nsIClipboardDragDropHooks aHooks);

  /**
   * Gets an enumerator for all hooks which have been added.
   * @return nsISimpleEnumerator for nsIClipboardDragDropHooks
   */
  nsISimpleEnumerator getHookEnumerator();

}