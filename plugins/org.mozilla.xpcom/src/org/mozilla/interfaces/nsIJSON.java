/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/json/nsIJSON.idl
 */

package org.mozilla.interfaces;

/**
 * Encode and decode JSON text.
 */
public interface nsIJSON extends nsISupports {

  String NS_IJSON_IID =
    "{45464c36-efde-4cb5-8e00-07480533ff35}";

  String encode();

  void encodeToStream(nsIOutputStream stream, String charset, boolean writeBOM);

  void decode(String str);

  void decodeFromStream(nsIInputStream stream, int contentLength);

}