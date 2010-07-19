/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsIScreen.idl
 */

package org.mozilla.interfaces;

public interface nsIScreen extends nsISupports {

  String NS_ISCREEN_IID =
    "{f728830e-1dd1-11b2-9598-fb9f414f2465}";

  void getRect(int[] left, int[] top, int[] width, int[] height);

  void getAvailRect(int[] left, int[] top, int[] width, int[] height);

  int getPixelDepth();

  int getColorDepth();

}