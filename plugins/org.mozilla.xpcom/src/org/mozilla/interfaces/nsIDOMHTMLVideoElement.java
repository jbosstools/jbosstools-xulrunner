/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLVideoElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLVideoElement interface is the interface to a HTML
 * <video> element.
 *
 * For more information on this interface, please see
 * http://www.whatwg.org/specs/web-apps/current-work/#video
 *
 * @status UNDER_DEVELOPMENT
 */
public interface nsIDOMHTMLVideoElement extends nsIDOMHTMLMediaElement {

  String NS_IDOMHTMLVIDEOELEMENT_IID =
    "{edf468dc-42eb-4494-920b-56a315172640}";

  int getWidth();

  void setWidth(int aWidth);

  int getHeight();

  void setHeight(int aHeight);

  long getVideoWidth();

  long getVideoHeight();

  String getPoster();

  void setPoster(String aPoster);

}