/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/threads/nsIDOMWorkers.idl
 */

package org.mozilla.interfaces;

public interface nsIWorkerErrorEvent extends nsIDOMEvent {

  String NS_IWORKERERROREVENT_IID =
    "{73d82c1d-05de-49c9-a23b-7121ff09a67a}";

  String getMessage();

  String getFilename();

  long getLineno();

  void initErrorEvent(String aTypeArg, boolean aCanBubbleArg, boolean aCancelableArg, String aMessageArg, String aFilenameArg, long aLinenoArg);

}