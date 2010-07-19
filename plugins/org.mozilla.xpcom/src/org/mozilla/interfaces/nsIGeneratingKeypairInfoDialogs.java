/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIGenKeypairInfoDlg.idl
 */

package org.mozilla.interfaces;

/**
 * nsIGeneratingKeypairInfoDialogs
 *  This is the interface for giving feedback to the user
 *  while generating a key pair.
 */
public interface nsIGeneratingKeypairInfoDialogs extends nsISupports {

  String NS_IGENERATINGKEYPAIRINFODIALOGS_IID =
    "{11bf5cdc-1dd2-11b2-ba6a-c76afb326fa1}";

  void displayGeneratingKeypairInfo(nsIInterfaceRequestor ctx, nsIKeygenThread runnable);

}