/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMNSDocument.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMNSDocument extends nsISupports {

  String NS_IDOMNSDOCUMENT_IID =
    "{09a439ad-4079-46d5-a050-4d7015d1a108}";

  String getCharacterSet();

  String getDir();

  void setDir(String aDir);

  nsIDOMLocation getLocation();

  String getTitle();

  void setTitle(String aTitle);

  String getContentType();

  String getReadyState();

  String getLastModified();

  String getReferrer();

  boolean hasFocus();

  nsIDOMElement getActiveElement();

  nsIDOMNodeList getElementsByClassName(String classes);

  /**
  * Returns the element from the caller's document at the given point,
  * relative to the upper-left-most point in the (possibly scrolled)
  * window or frame.
  *
  * If the element at the given point belongs to another document (such as
  * an iframe's subdocument), the element in the calling document's DOM
  * (e.g. the iframe) is returned. If the element at the given point is
  * anonymous or XBL generated content, such as a textbox's scrollbars, then
  * the first non-anonymous parent element (that is, the textbox) is returned.
  *
  * This method returns null if either coordinate is negative, or if the
  * specified point lies outside the visible bounds of the document.
  *
  * Callers from XUL documents should wait until the onload event has fired
  * before calling this method.
  *
  * <a href="http://dev.w3.org/cvsweb/~checkout~/csswg/cssom/Overview.html?content-type=text/html;%20charset=utf-8#documentlayout-elementfrompoint">preliminary spec</a>
  */
  nsIDOMElement elementFromPoint(int x, int y);

}