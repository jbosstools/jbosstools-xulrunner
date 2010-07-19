/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/base/nsIDOMPlugin.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMPlugin extends nsISupports {

  String NS_IDOMPLUGIN_IID =
    "{ff69a292-c74d-4ef5-9d0f-86112fff2d5b}";

  String getDescription();

  String getFilename();

  String getVersion();

  String getName();

  long getLength();

  nsIDOMMimeType item(long index);

  nsIDOMMimeType namedItem(String name);

}