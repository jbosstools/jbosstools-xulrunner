/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLElement.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMHTMLElement extends nsIDOMElement {

  String NS_IDOMHTMLELEMENT_IID =
    "{a6cf9085-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMHTMLElement interface is the primary [X]HTML element
 * interface. It represents a single [X]HTML element in the document
 * tree.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
  String getId();

  /**
 * The nsIDOMHTMLElement interface is the primary [X]HTML element
 * interface. It represents a single [X]HTML element in the document
 * tree.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
  void setId(String aId);

  String getTitle();

  void setTitle(String aTitle);

  String getLang();

  void setLang(String aLang);

  String getDir();

  void setDir(String aDir);

  String getClassName();

  void setClassName(String aClassName);

}