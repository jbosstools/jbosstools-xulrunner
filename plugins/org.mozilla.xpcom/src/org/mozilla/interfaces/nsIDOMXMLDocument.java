/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMXMLDocument.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMXMLDocument extends nsIDOMDocument {

  String NS_IDOMXMLDOCUMENT_IID =
    "{8816d003-e7c8-4065-8827-829b8d07b6e0}";

  /**
   * Whether to load synchronously or asynchronously.
   * The default is async==true.
   */
  boolean getAsync();

  /**
   * Whether to load synchronously or asynchronously.
   * The default is async==true.
   */
  void setAsync(boolean aAsync);

  /**
   * Load an XML document.
   *
   * @param  url URL to an XML document.
   * @return     True if load successfull.
   */
  boolean load(String url);

  /**
  * Evaluate FIXptr expression. FIXptr is a W3C NOTE, see
  *
  * http://lists.w3.org/Archives/Public/www-xml-linking-comments/2001AprJun/att-0074/01-NOTE-FIXptr-20010425.htm
  *
  * @param  expression FIXptr string.
  * @return            The range object that results from evaluation
  */
  nsIDOMRange evaluateFIXptr(String expression);

  /**
  * Evaluate XPointer expression.
  */
  nsIXPointerResult evaluateXPointer(String expression);

}