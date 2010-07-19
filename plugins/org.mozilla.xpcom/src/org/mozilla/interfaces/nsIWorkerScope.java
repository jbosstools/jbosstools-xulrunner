/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/threads/nsIDOMWorkers.idl
 */

package org.mozilla.interfaces;

public interface nsIWorkerScope extends nsIWorkerGlobalScope {

  String NS_IWORKERSCOPE_IID =
    "{5c55ea4b-e4ac-4ceb-bfeb-46bd5e521b8a}";

  void postMessage();

  void close();

  nsIDOMEventListener getOnmessage();

  void setOnmessage(nsIDOMEventListener aOnmessage);

  nsIDOMEventListener getOnclose();

  void setOnclose(nsIDOMEventListener aOnclose);

}