/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/search/nsIBrowserSearchService.idl
 */

package org.mozilla.interfaces;

public interface nsISearchSubmission extends nsISupports {

  String NS_ISEARCHSUBMISSION_IID =
    "{58e4f602-a7c8-4cd1-9dca-716705e826ef}";

  /**
   * The POST data associated with a search submission, wrapped in a MIME
   * input stream. May be null.
   */
  nsIInputStream getPostData();

  /**
   * The URI to submit a search to.
   */
  nsIURI getUri();

}