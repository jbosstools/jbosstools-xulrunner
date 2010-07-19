/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/offline/nsIDOMLoadStatus.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMLoadStatus extends nsISupports {

  String NS_IDOMLOADSTATUS_IID =
    "{2cb53a8a-d2f4-4ddf-874f-3bc2d595c41a}";

  nsIDOMNode getSource();

  String getUri();

  int getTotalSize();

  int getLoadedSize();

  int getReadyState();

  int getStatus();

  int UNINITIALIZED = 0;

  int REQUESTED = 1;

  int RECEIVING = 2;

  int LOADED = 3;

}