/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpfe/components/directory/nsIHTTPIndex.idl
 */

package org.mozilla.interfaces;

public interface nsIHTTPIndex extends nsISupports {

  String NS_IHTTPINDEX_IID =
    "{6f2bdbd0-58c3-11d3-be36-00104bde6048}";

  /**
     * The base URL of the HTTP index
     */
  String getBaseURL();

  /**
     * The RDF datasource that contains the HTTP index information.
     */
  nsIRDFDataSource getDataSource();

  /**
     * The charset to use for decoding FTP filenames
     */
  String getEncoding();

  /**
     * The charset to use for decoding FTP filenames
     */
  void setEncoding(String aEncoding);

}