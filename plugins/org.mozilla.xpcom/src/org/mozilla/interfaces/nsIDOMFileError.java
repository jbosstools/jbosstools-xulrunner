/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsIDOMFileError.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMFileError extends nsISupports {

  String NS_IDOMFILEERROR_IID =
    "{4bdafb64-15e2-49c1-a090-4315a7884a56}";

  int NOT_FOUND_ERR = 8;

  int NOT_READABLE_ERR = 24;

  int SECURITY_ERR = 18;

  int ABORT_ERR = 20;

  int ENCODING_ERR = 26;

  int getCode();

}