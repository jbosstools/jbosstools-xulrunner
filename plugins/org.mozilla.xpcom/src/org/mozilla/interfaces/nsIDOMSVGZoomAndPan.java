/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGZoomAndPan.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGZoomAndPan extends nsISupports {

  String NS_IDOMSVGZOOMANDPAN_IID =
    "{18967370-921a-4245-8158-a279b190abca}";

  int SVG_ZOOMANDPAN_UNKNOWN = 0;

  int SVG_ZOOMANDPAN_DISABLE = 1;

  int SVG_ZOOMANDPAN_MAGNIFY = 2;

  int getZoomAndPan();

  void setZoomAndPan(int aZoomAndPan);

}