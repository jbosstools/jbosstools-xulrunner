/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/base/nsIDOMPluginArray.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMPluginArray extends nsISupports {

  String NS_IDOMPLUGINARRAY_IID =
    "{f6134680-f28b-11d2-8360-c90899049c3c}";

  long getLength();

  nsIDOMPlugin item(long index);

  nsIDOMPlugin namedItem(String name);

  void refresh(boolean reloadDocuments);

}