/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/base/nsIDOMMimeTypeArray.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMMimeTypeArray extends nsISupports {

  String NS_IDOMMIMETYPEARRAY_IID =
    "{f6134683-f28b-11d2-8360-c90899049c3c}";

  long getLength();

  nsIDOMMimeType item(long index);

  nsIDOMMimeType namedItem(String name);

}