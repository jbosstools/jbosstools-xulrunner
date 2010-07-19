/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/load-save/nsIDOMLSOutput.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMLSOutput extends nsISupports {

  String NS_IDOMLSOUTPUT_IID =
    "{757e9971-8890-478d-a53a-07f9f6f6e0d3}";

  nsISupports getCharacterStream();

  void setCharacterStream(nsISupports aCharacterStream);

  nsIOutputStream getByteStream();

  void setByteStream(nsIOutputStream aByteStream);

  String getSystemId();

  void setSystemId(String aSystemId);

  String getEncoding();

  void setEncoding(String aEncoding);

}