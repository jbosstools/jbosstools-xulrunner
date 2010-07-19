/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLFormElement.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMHTMLFormElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLFORMELEMENT_IID =
    "{a6cf908f-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMHTMLFormElement interface is the interface to a [X]HTML
 * form element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
  nsIDOMHTMLCollection getElements();

  int getLength();

  String getName();

  void setName(String aName);

  String getAcceptCharset();

  void setAcceptCharset(String aAcceptCharset);

  String getAction();

  void setAction(String aAction);

  String getEnctype();

  void setEnctype(String aEnctype);

  String getMethod();

  void setMethod(String aMethod);

  String getTarget();

  void setTarget(String aTarget);

  void submit();

  void reset();

}