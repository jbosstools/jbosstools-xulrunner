/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/printing/nsIPrintProgress.idl
 */

package org.mozilla.interfaces;

public interface nsIPrintProgress extends nsIWebProgressListener {

  String NS_IPRINTPROGRESS_IID =
    "{7e46bc35-fb7d-4b45-ab35-82fd61015380}";

  void openProgressDialog(nsIDOMWindowInternal parent, String dialogURL, nsISupports parameters, nsIObserver openDialogObserver, boolean[] notifyOnOpen);

  void closeProgressDialog(boolean forceClose);

  void registerListener(nsIWebProgressListener listener);

  void unregisterListener(nsIWebProgressListener listener);

  void doneIniting();

  nsIPrompt getPrompter();

  boolean getProcessCanceledByUser();

  void setProcessCanceledByUser(boolean aProcessCanceledByUser);

}