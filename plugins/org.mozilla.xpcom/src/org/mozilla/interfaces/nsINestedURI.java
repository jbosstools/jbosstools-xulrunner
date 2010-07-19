/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsINestedURI.idl
 */

package org.mozilla.interfaces;

/**
 * nsINestedURI is an interface that must be implemented by any nsIURI
 * implementation which has an "inner" URI that it actually gets data
 * from.
 *
 * For example, if URIs for the scheme "sanitize" have the structure:
 *
 *   sanitize:http://example.com
 *
 * and opening a channel on such a sanitize: URI gets the data from
 * http://example.com, sanitizes it, and returns it, then the sanitize: URI
 * should implement nsINestedURI and return the http://example.com URI as its
 * inner URI.
 */
public interface nsINestedURI extends nsISupports {

  String NS_INESTEDURI_IID =
    "{6de2c874-796c-46bf-b57f-0d7bd7d6cab0}";

  /**
   * The inner URI for this nested URI.  This must not return null if the
   * getter succeeds; URIs that have no inner must not QI to this interface.
   * Dynamically changing whether there is an inner URI is not allowed.
   *
   * Modifying the returned URI must not in any way modify the nested URI; this
   * means the returned URI must be either immutable or a clone.
   */
  nsIURI getInnerURI();

  /**
   * The innermost URI for this nested URI.  This must not return null if the
   * getter succeeds.  This is equivalent to repeatedly calling innerURI while
   * the returned URI QIs to nsINestedURI.
   *
   * Modifying the returned URI must not in any way modify the nested URI; this
   * means the returned URI must be either immutable or a clone.   
   */
  nsIURI getInnermostURI();

}