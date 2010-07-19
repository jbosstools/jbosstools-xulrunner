/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLTimeRanges.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMHTMLTimeRanges extends nsISupports {

  String NS_IDOMHTMLTIMERANGES_IID =
    "{5c9995a1-9fce-44e8-aa7f-de52ff4c3f46}";

  long getLength();

  float start(long index);

  float end(long index);

}