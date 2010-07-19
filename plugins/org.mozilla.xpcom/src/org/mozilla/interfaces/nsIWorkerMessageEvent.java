/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/threads/nsIDOMWorkers.idl
 */

package org.mozilla.interfaces;

public interface nsIWorkerMessageEvent extends nsIDOMEvent {

  String NS_IWORKERMESSAGEEVENT_IID =
    "{508f2d49-e9a0-4fe8-bd33-321820173b4a}";

  String getData();

  String getOrigin();

  nsISupports getSource();

  void initMessageEvent(String aTypeArg, boolean aCanBubbleArg, boolean aCancelableArg, String aDataArg, String aOriginArg, nsISupports aSourceArg);

}