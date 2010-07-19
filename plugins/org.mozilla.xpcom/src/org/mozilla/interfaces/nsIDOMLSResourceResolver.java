/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/load-save/nsIDOMLSResourceResolver.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMLSResourceResolver extends nsISupports {

  String NS_IDOMLSRESOURCERESOLVER_IID =
    "{9e61c7c8-8698-4477-9971-0923513919bd}";

  nsIDOMLSInput resolveResource(String type, String namespaceURI, String publicId, String systemId, String baseURI);

}