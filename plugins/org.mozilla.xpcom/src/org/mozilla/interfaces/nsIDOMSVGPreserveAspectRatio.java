/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGPresAspectRatio.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGPreserveAspectRatio extends nsISupports {

  String NS_IDOMSVGPRESERVEASPECTRATIO_IID =
    "{7ae42f27-4799-4e7c-86c6-e1dae6ad5157}";

  int SVG_PRESERVEASPECTRATIO_UNKNOWN = 0;

  int SVG_PRESERVEASPECTRATIO_NONE = 1;

  int SVG_PRESERVEASPECTRATIO_XMINYMIN = 2;

  int SVG_PRESERVEASPECTRATIO_XMIDYMIN = 3;

  int SVG_PRESERVEASPECTRATIO_XMAXYMIN = 4;

  int SVG_PRESERVEASPECTRATIO_XMINYMID = 5;

  int SVG_PRESERVEASPECTRATIO_XMIDYMID = 6;

  int SVG_PRESERVEASPECTRATIO_XMAXYMID = 7;

  int SVG_PRESERVEASPECTRATIO_XMINYMAX = 8;

  int SVG_PRESERVEASPECTRATIO_XMIDYMAX = 9;

  int SVG_PRESERVEASPECTRATIO_XMAXYMAX = 10;

  int SVG_MEETORSLICE_UNKNOWN = 0;

  int SVG_MEETORSLICE_MEET = 1;

  int SVG_MEETORSLICE_SLICE = 2;

  int getAlign();

  void setAlign(int aAlign);

  int getMeetOrSlice();

  void setMeetOrSlice(int aMeetOrSlice);

}