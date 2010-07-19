/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/idl/nsIEditorObserver.idl
 */

package org.mozilla.interfaces;

/**
 * A generic editor observer interface. 
 * <P>
 * nsIEditorObserver is the interface used by applications wishing to be notified
 * when the editor has completed a user action. 
 *
 */
public interface nsIEditorObserver extends nsISupports {

  String NS_IEDITOROBSERVER_IID =
    "{a6cf9125-15b3-11d2-932e-00805f8add32}";

  /** 
   * Called after the editor completes a user action.
   */
  void editAction();

}