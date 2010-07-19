/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/threads/nsIDOMWorkers.idl
 */

package org.mozilla.interfaces;

public interface nsIWorkerGlobalScope extends nsISupports {

  String NS_IWORKERGLOBALSCOPE_IID =
    "{c111e7d3-8044-4458-aa7b-637696ffb841}";

  nsIWorkerGlobalScope getSelf();

  nsIWorkerNavigator getNavigator();

  nsIWorkerLocation getLocation();

  nsIDOMEventListener getOnerror();

  void setOnerror(nsIDOMEventListener aOnerror);

}