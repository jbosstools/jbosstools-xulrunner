/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsISelectionDisplay.idl
 */

package org.mozilla.interfaces;

public interface nsISelectionDisplay extends nsISupports {

  String NS_ISELECTIONDISPLAY_IID =
    "{0ddf9e1c-1dd2-11b2-a183-908a08aa75ae}";

  short DISPLAY_TEXT = 1;

  short DISPLAY_IMAGES = 2;

  short DISPLAY_FRAMES = 4;

  short DISPLAY_ALL = 7;

  void setSelectionFlags(short toggle);

  short getSelectionFlags();

}