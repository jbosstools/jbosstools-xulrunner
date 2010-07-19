/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGTextPathElement.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGTextPathElement extends nsIDOMSVGTextContentElement {

  String NS_IDOMSVGTEXTPATHELEMENT_IID =
    "{5c29a76c-3489-48fe-b9ea-ea0f5b196dff}";

  int TEXTPATH_METHODTYPE_UNKNOWN = 0;

  int TEXTPATH_METHODTYPE_ALIGN = 1;

  int TEXTPATH_METHODTYPE_STRETCH = 2;

  int TEXTPATH_SPACINGTYPE_UNKNOWN = 0;

  int TEXTPATH_SPACINGTYPE_AUTO = 1;

  int TEXTPATH_SPACINGTYPE_EXACT = 2;

  nsIDOMSVGAnimatedLength getStartOffset();

  nsIDOMSVGAnimatedEnumeration getMethod();

  nsIDOMSVGAnimatedEnumeration getSpacing();

}