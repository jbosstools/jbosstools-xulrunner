/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/load-save/nsIDOMLSProgressEvent.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMLSProgressEvent extends nsIDOMEvent {

  String NS_IDOMLSPROGRESSEVENT_IID =
    "{b9a2371f-70e9-4657-b0e8-28e15b40857e}";

  nsIDOMLSInput getInput();

  long getPosition();

  long getTotalSize();

}