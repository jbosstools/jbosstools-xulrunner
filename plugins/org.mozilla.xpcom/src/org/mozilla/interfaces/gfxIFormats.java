/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/gfx/idl/gfxIFormats.idl
 */

package org.mozilla.interfaces;

/**
 * gfxIFormats interface
 *
 * @author Tim Rowley <tor@cs.brown.edu>
 * @author Stuart Parmenter <pavlov@netscape.com>
 * @version 0.0
 * @see gfx_format
 */
public interface gfxIFormats {

  String GFXIFORMATS_IID =
    "{96d086e6-1dd1-11b2-b6b2-b77b59390247}";

  /**
   * RGB    - duh...
   */
  int RGB = 0;

  /**
   * BGR    - same as RGB except byteswaped
   */
  int BGR = 1;

  /**
   * RGB_A1 - RGB image and 1-bit alpha mask
   */
  int RGB_A1 = 2;

  /**
   * BGR_A1 - same as RGB_A1 except byteswaped
   */
  int BGR_A1 = 3;

  /**
   * RGB_A8 - RGB image and 8-bit alpha image
   */
  int RGB_A8 = 4;

  /**
   * BGR_A8 - same as RGB_A8 except byteswaped
   */
  int BGR_A8 = 5;

  /**
   * RGBA   - packed RGBA image
   */
  int RGBA = 6;

  /**
   * BGRA   - packed RGBA image
   */
  int BGRA = 7;

  /**
   * PAL    - Palette based image data, all opaque colors
   *		  PRUint32 colormap[256];
   *		  PRUint8 pixels[width*height];
   */
  int PAL = 8;

  /**
   * PAL_A1 - Palette based image data, with transparency
   *		  PRUint32 colormap[256];
   *		  PRUint8 pixels[width*height];
   */
  int PAL_A1 = 9;

}