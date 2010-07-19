/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/streamconv/public/nsITXTToHTMLConv.idl
 */

package org.mozilla.interfaces;

public interface nsITXTToHTMLConv extends nsIStreamConverter {

  String NS_ITXTTOHTMLCONV_IID =
    "{933355f6-1dd2-11b2-a9b0-d335b9e35983}";

  /**
   * @param text: Title to set for the HTML document.  Only applicable if
   *              preFormatHTML(true) is called.
   * @result      The given title will be used to form an HTML document
   *              from the plain text document.
   */
  void setTitle(String text);

  /**
   * @param value: true to use an HTML header and footer on the document,
   *               false to omit it.
   * @result       The document will use a header and footer if value is
   *               true.
   */
  void preFormatHTML(boolean value);

}