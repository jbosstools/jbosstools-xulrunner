/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xslt/public/nsIXSLTProcessor.idl
 */

package org.mozilla.interfaces;

public interface nsIXSLTProcessor extends nsISupports {

  String NS_IXSLTPROCESSOR_IID =
    "{4a91aeb3-4100-43ee-a21e-9866268757c5}";

  /**
     * Import the stylesheet into this XSLTProcessor for transformations.
     *
     * @param style The root-node of a XSLT stylesheet. This can be either
     *              a document node or an element node. If a document node
     *              then the document can contain either a XSLT stylesheet
     *              or a LRE stylesheet.
     *              If the argument is an element node it must be the
     *              xsl:stylesheet (or xsl:transform) element of an XSLT
     *              stylesheet.
     *
     * @exception nsIXSLTException
     */
  void importStylesheet(nsIDOMNode style);

  /**
     * Transforms the node source applying the stylesheet given by
     * the importStylesheet() function. The owner document of the output node
     * owns the returned document fragment.
     *
     * @param source The node to be transformed
     * @param output This document is used to generate the output
     * @return DocumentFragment The result of the transformation
     *
     * @exception nsIXSLTException
     */
  nsIDOMDocumentFragment transformToFragment(nsIDOMNode source, nsIDOMDocument output);

  /**
     * Transforms the node source applying the stylesheet given by the
     * importStylesheet() function.
     *
     * @param source The node to be transformed
     * @return Document The result of the transformation
     *
     * @exception nsIXSLTException
     */
  nsIDOMDocument transformToDocument(nsIDOMNode source);

  /**
     * Sets a parameter to be used in subsequent transformations with this
     * nsIXSLTProcessor. If the parameter doesn't exist in the stylesheet the
     * parameter will be ignored.
     *
     * @param namespaceURI The namespaceURI of the XSLT parameter
     * @param localName    The local name of the XSLT parameter
     * @param value        The new value of the XSLT parameter
     *
     * @exception NS_ERROR_ILLEGAL_VALUE The datatype of value is
     *                                   not supported
     */
  void setParameter(String namespaceURI, String localName, nsIVariant value);

  /**
     * Gets a parameter if previously set by setParameter. Returns null
     * otherwise.
     *
     * @param namespaceURI The namespaceURI of the XSLT parameter
     * @param localName    The local name of the XSLT parameter
     * @return nsIVariant  The value of the XSLT parameter
     */
  nsIVariant getParameter(String namespaceURI, String localName);

  /**
     * Removes a parameter, if set. This will make the processor use the
     * default-value for the parameter as specified in the stylesheet.
     *
     * @param namespaceURI The namespaceURI of the XSLT parameter
     * @param localName    The local name of the XSLT parameter
     */
  void removeParameter(String namespaceURI, String localName);

  /**
     * Removes all set parameters from this nsIXSLTProcessor. This will make
     * the processor use the default-value for all parameters as specified in
     * the stylesheet.
     */
  void clearParameters();

  /**
     * Remove all parameters and stylesheets from this nsIXSLTProcessor.
     */
  void reset();

}