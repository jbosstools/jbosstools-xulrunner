/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/idl/nsIDocumentStateListener.idl
 */

package org.mozilla.interfaces;

public interface nsIDocumentStateListener extends nsISupports {

  String NS_IDOCUMENTSTATELISTENER_IID =
    "{050cdc00-3b8e-11d3-9ce4-a458f454fcbc}";

  void notifyDocumentCreated();

  void notifyDocumentWillBeDestroyed();

  void notifyDocumentStateChanged(boolean nowDirty);

}