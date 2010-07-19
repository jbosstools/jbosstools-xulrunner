/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/load-save/nsIDOMLSInput.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMLSInput extends nsISupports {

  String NS_IDOMLSINPUT_IID =
    "{165e7f61-5048-4c2c-b4bf-6b44bb617ee4}";

  nsISupports getCharacterStream();

  void setCharacterStream(nsISupports aCharacterStream);

  nsIInputStream getByteStream();

  void setByteStream(nsIInputStream aByteStream);

  String getStringData();

  void setStringData(String aStringData);

  String getSystemId();

  void setSystemId(String aSystemId);

  String getPublicId();

  void setPublicId(String aPublicId);

  String getBaseURI();

  void setBaseURI(String aBaseURI);

  String getEncoding();

  void setEncoding(String aEncoding);

  boolean getCertifiedText();

  void setCertifiedText(boolean aCertifiedText);

}