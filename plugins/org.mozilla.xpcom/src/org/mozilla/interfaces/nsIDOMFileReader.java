/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsIDOMFileReader.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMFileReader extends nsISupports {

  String NS_IDOMFILEREADER_IID =
    "{5db0ce80-de44-40c0-a346-e28aac4aa978}";

  void readAsBinaryString(nsIDOMFile filedata);

  void readAsText(nsIDOMFile filedata, String encoding);

  void readAsDataURL(nsIDOMFile file);

  void abort();

  int EMPTY = 0;

  int LOADING = 1;

  int DONE = 2;

  int getReadyState();

  String getResult();

  nsIDOMFileError getError();

  nsIDOMEventListener getOnloadend();

  void setOnloadend(nsIDOMEventListener aOnloadend);

}