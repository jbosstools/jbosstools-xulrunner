/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLEmbedElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLEmbedElement interface is the interface to a [X]HTML
 * embed element.
 *
 * Note that this is not a W3C standard interface, it is Mozilla
 * proprietary.
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLEmbedElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLEMBEDELEMENT_IID =
    "{123f90ab-15b3-11d2-456e-00805f8add32}";

  String getAlign();

  void setAlign(String aAlign);

  String getHeight();

  void setHeight(String aHeight);

  String getName();

  void setName(String aName);

  String getSrc();

  void setSrc(String aSrc);

  String getType();

  void setType(String aType);

  String getWidth();

  void setWidth(String aWidth);

}