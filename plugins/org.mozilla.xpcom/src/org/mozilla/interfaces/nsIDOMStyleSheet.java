/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/stylesheets/nsIDOMStyleSheet.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMStyleSheet extends nsISupports {

  String NS_IDOMSTYLESHEET_IID =
    "{a6cf9080-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMStyleSheet interface is a datatype for a style sheet in
 * the Document Object Model.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-Style
 *
 * @status FROZEN
 */
  String getType();

  boolean getDisabled();

  void setDisabled(boolean aDisabled);

  nsIDOMNode getOwnerNode();

  nsIDOMStyleSheet getParentStyleSheet();

  String getHref();

  String getTitle();

  nsIDOMMediaList getMedia();

}