/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/html/document/public/nsIImageDocument.idl
 */

package org.mozilla.interfaces;

public interface nsIImageDocument extends nsISupports {

  String NS_IIMAGEDOCUMENT_IID =
    "{7b80eebc-c98e-4461-8bdb-6e3b6e828890}";

  boolean getImageResizingEnabled();

  boolean getImageIsOverflowing();

  boolean getImageIsResized();

  imgIRequest getImageRequest();

  void shrinkToFit();

  void restoreImage();

  void restoreImageTo(int x, int y);

  void toggleImageSize();

}