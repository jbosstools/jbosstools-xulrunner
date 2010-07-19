/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMNameList.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMNameList extends nsISupports {

  String NS_IDOMNAMELIST_IID =
    "{faaf1b80-1ddd-11d9-8c46-000a95dc234c}";

  String getName(long index);

  String getNamespaceURI(long index);

  long getLength();

  boolean contains(String str);

  boolean containsNS(String namespaceURI, String name);

}