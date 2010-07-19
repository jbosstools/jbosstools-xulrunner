/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGFilters.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGFEDisplacementMapElement extends nsIDOMSVGFilterPrimitiveStandardAttributes {

  String NS_IDOMSVGFEDISPLACEMENTMAPELEMENT_IID =
    "{80e1ea9c-eff3-490a-8c98-918963d2e7e9}";

  int SVG_CHANNEL_UNKNOWN = 0;

  int SVG_CHANNEL_R = 1;

  int SVG_CHANNEL_G = 2;

  int SVG_CHANNEL_B = 3;

  int SVG_CHANNEL_A = 4;

  nsIDOMSVGAnimatedString getIn1();

  nsIDOMSVGAnimatedString getIn2();

  nsIDOMSVGAnimatedNumber getScale();

  nsIDOMSVGAnimatedEnumeration getXChannelSelector();

  nsIDOMSVGAnimatedEnumeration getYChannelSelector();

}