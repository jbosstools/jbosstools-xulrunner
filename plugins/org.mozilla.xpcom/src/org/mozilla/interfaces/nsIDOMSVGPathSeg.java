/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGPathSeg.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGPathSeg extends nsISupports {

  String NS_IDOMSVGPATHSEG_IID =
    "{b9022da7-e26d-4df3-8c94-b45c4aedda7c}";

  int PATHSEG_UNKNOWN = 0;

  int PATHSEG_CLOSEPATH = 1;

  int PATHSEG_MOVETO_ABS = 2;

  int PATHSEG_MOVETO_REL = 3;

  int PATHSEG_LINETO_ABS = 4;

  int PATHSEG_LINETO_REL = 5;

  int PATHSEG_CURVETO_CUBIC_ABS = 6;

  int PATHSEG_CURVETO_CUBIC_REL = 7;

  int PATHSEG_CURVETO_QUADRATIC_ABS = 8;

  int PATHSEG_CURVETO_QUADRATIC_REL = 9;

  int PATHSEG_ARC_ABS = 10;

  int PATHSEG_ARC_REL = 11;

  int PATHSEG_LINETO_HORIZONTAL_ABS = 12;

  int PATHSEG_LINETO_HORIZONTAL_REL = 13;

  int PATHSEG_LINETO_VERTICAL_ABS = 14;

  int PATHSEG_LINETO_VERTICAL_REL = 15;

  int PATHSEG_CURVETO_CUBIC_SMOOTH_ABS = 16;

  int PATHSEG_CURVETO_CUBIC_SMOOTH_REL = 17;

  int PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS = 18;

  int PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL = 19;

  int getPathSegType();

  String getPathSegTypeAsLetter();

}