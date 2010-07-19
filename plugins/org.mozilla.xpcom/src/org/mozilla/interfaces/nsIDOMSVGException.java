/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGException.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGException extends nsISupports {

  String NS_IDOMSVGEXCEPTION_IID =
    "{64e6f0e1-af99-4bb9-ab25-7e56012f0021}";

  int SVG_WRONG_TYPE_ERR = 0;

  int SVG_INVALID_VALUE_ERR = 1;

  int SVG_MATRIX_NOT_INVERTABLE = 2;

  int getCode();

}