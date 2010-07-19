/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/webshell/public/nsIDocumentLoaderFactory.idl
 */

package org.mozilla.interfaces;

/**
 * To get a component that implements nsIDocumentLoaderFactory
 * for a given mimetype, use nsICategoryManager to find an entry
 * with the mimetype as its name in the category "Gecko-Content-Viewers".
 * The value of the entry is the contractid of the component.
 * The component is a service, so use GetService, not CreateInstance to get it.
 */
public interface nsIDocumentLoaderFactory extends nsISupports {

  String NS_IDOCUMENTLOADERFACTORY_IID =
    "{5e7d2967-5a07-444f-95d5-25b533252d38}";

  nsIContentViewer createInstance(String aCommand, nsIChannel aChannel, nsILoadGroup aLoadGroup, String aContentType, nsISupports aContainer, nsISupports aExtraInfo, nsIStreamListener[] aDocListenerResult);

  nsIContentViewer createInstanceForDocument(nsISupports aContainer, nsISupports aDocument, String aCommand);

  /**
     * Create a blank document using the given loadgroup and given
     * principal.  aPrincipal is allowed to be null, in which case the
     * new document will get the about:blank codebase principal.
     */
  nsISupports createBlankDocument(nsILoadGroup aLoadGroup, nsIPrincipal aPrincipal);

}