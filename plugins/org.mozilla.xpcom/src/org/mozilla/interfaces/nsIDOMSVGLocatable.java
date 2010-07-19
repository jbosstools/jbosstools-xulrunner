/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGLocatable.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGLocatable extends nsISupports {

  String NS_IDOMSVGLOCATABLE_IID =
    "{9cf4fc9c-90b2-4d66-88f5-35049b558aee}";

  nsIDOMSVGElement getNearestViewportElement();

  nsIDOMSVGElement getFarthestViewportElement();

  nsIDOMSVGRect getBBox();

  nsIDOMSVGMatrix getCTM();

  nsIDOMSVGMatrix getScreenCTM();

  nsIDOMSVGMatrix getTransformToElement(nsIDOMSVGElement element);

}