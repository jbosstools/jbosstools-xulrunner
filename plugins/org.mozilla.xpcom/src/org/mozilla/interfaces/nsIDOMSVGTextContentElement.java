/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGTextContentElement.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGTextContentElement extends nsIDOMSVGElement {

  String NS_IDOMSVGTEXTCONTENTELEMENT_IID =
    "{87ad94bc-07c9-412b-b2d8-de245a2e84a5}";

  int LENGTHADJUST_UNKNOWN = 0;

  int LENGTHADJUST_SPACING = 1;

  int LENGTHADJUST_SPACINGANDGLYPHS = 2;

  nsIDOMSVGAnimatedLength getTextLength();

  nsIDOMSVGAnimatedEnumeration getLengthAdjust();

  int getNumberOfChars();

  float getComputedTextLength();

  float getSubStringLength(long charnum, long nchars);

  nsIDOMSVGPoint getStartPositionOfChar(long charnum);

  nsIDOMSVGPoint getEndPositionOfChar(long charnum);

  nsIDOMSVGRect getExtentOfChar(long charnum);

  float getRotationOfChar(long charnum);

  int getCharNumAtPosition(nsIDOMSVGPoint point);

  void selectSubString(long charnum, long nchars);

}