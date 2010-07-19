/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/threads/nsIDOMWorkers.idl
 */

package org.mozilla.interfaces;

public interface nsIWorker extends nsIAbstractWorker {

  String NS_IWORKER_IID =
    "{daf945c3-8d29-4724-8939-dd383f7d27a7}";

  void postMessage();

  nsIDOMEventListener getOnmessage();

  void setOnmessage(nsIDOMEventListener aOnmessage);

  void terminate();

}