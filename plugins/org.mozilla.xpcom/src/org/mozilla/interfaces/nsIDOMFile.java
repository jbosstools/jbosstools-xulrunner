/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsIDOMFile.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMFile extends nsISupports {

  String NS_IDOMFILE_IID =
    "{0845e8ae-56bd-4f0e-962a-3b3e92638a0b}";

  String getFileName();

  double getFileSize();

  String getName();

  double getSize();

  String getType();

  String getAsText(String encoding);

  String getAsDataURL();

  String getAsBinary();

}