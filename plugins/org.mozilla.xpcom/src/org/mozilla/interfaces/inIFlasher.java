/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/inspector/public/inIFlasher.idl
 */

package org.mozilla.interfaces;

public interface inIFlasher extends nsISupports {

  String INIFLASHER_IID =
    "{7b4a099f-6f6e-4565-977b-fb622adbff49}";

  String getColor();

  void setColor(String aColor);

  boolean getInvert();

  void setInvert(boolean aInvert);

  int getThickness();

  void setThickness(int aThickness);

  void drawElementOutline(nsIDOMElement aElement);

  void repaintElement(nsIDOMElement aElement);

  void scrollElementIntoView(nsIDOMElement aElement);

}