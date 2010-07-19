/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/load-save/nsIDOMLSSerializer.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMLSSerializer extends nsISupports {

  String NS_IDOMLSSERIALIZER_IID =
    "{96ea4792-d362-4c28-a8c2-0337790d648a}";

  nsIDOMDOMConfiguration getDomConfig();

  String getNewLine();

  void setNewLine(String aNewLine);

  nsIDOMLSSerializerFilter getFilter();

  void setFilter(nsIDOMLSSerializerFilter aFilter);

  boolean write(nsIDOMNode nodeArg, nsIDOMLSOutput destination);

  boolean writeToURI(nsIDOMNode nodeArg, String uri);

  String writeToString(nsIDOMNode nodeArg);

}