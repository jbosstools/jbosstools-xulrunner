/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMUserDataHandler.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMUserDataHandler extends nsISupports {

  String NS_IDOMUSERDATAHANDLER_IID =
    "{91afebdd-a201-4db0-b728-9d59580f0cfd}";

  int NODE_CLONED = 1;

  int NODE_IMPORTED = 2;

  int NODE_DELETED = 3;

  int NODE_RENAMED = 4;

  int NODE_ADOPTED = 5;

  void handle(int operation, String key, nsIVariant data, nsIDOMNode src, nsIDOMNode dst);

}