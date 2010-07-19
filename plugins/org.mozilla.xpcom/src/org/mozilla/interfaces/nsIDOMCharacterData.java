/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMCharacterData.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMCharacterData extends nsIDOMNode {

  String NS_IDOMCHARACTERDATA_IID =
    "{a6cf9072-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMCharacterData interface extends nsIDOMNode with a set of 
 * attributes and methods for accessing character data in the DOM.
 * 
 * For more information on this interface please see 
 * http://www.w3.org/TR/DOM-Level-2-Core/
 *
 * @status FROZEN
 */
  String getData();

  /**
 * The nsIDOMCharacterData interface extends nsIDOMNode with a set of 
 * attributes and methods for accessing character data in the DOM.
 * 
 * For more information on this interface please see 
 * http://www.w3.org/TR/DOM-Level-2-Core/
 *
 * @status FROZEN
 */
  void setData(String aData);

  long getLength();

  String substringData(long offset, long count);

  void appendData(String arg);

  void insertData(long offset, String arg);

  void deleteData(long offset, long count);

  void replaceData(long offset, long count, String arg);

}