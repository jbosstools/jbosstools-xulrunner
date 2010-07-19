/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/protocol/http/public/nsIHttpHeaderVisitor.idl
 */

package org.mozilla.interfaces;

/**
 * Implement this interface to visit http headers.
 *
 * @status FROZEN
 */
public interface nsIHttpHeaderVisitor extends nsISupports {

  String NS_IHTTPHEADERVISITOR_IID =
    "{0cf40717-d7c1-4a94-8c1e-d6c9734101bb}";

  /**
     * Called by the nsIHttpChannel implementation when visiting request and
     * response headers.
     *
     * @param aHeader
     *        the header being visited.
     * @param aValue
     *        the header value (possibly a comma delimited list).
     *
     * @throw any exception to terminate enumeration
     */
  void visitHeader(String aHeader, String aValue);

}