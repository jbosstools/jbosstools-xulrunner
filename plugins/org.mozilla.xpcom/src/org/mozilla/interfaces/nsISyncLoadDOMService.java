/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsISyncLoadDOMService.idl
 */

package org.mozilla.interfaces;

/*************************************************************************
 *                                                                       *
 *                          **** NOTICE ****                             *
 *                                                                       *
 *                                                                       *
 *    This interface is DEPRECATED!                                      *
 *    You should instead use XMLHttpRequest which now works both from    *
 *    Javascript and C++.                                                *
 *                                                                       *
 *    Additionally, synchronous network loads are evil.  Any delays      *
 *    from the server will appear as a hang in the mozilla UI.           *
 *    Therefore, they should be avoided as much as possible.             *
 *                                                                       *
 *    Don't make me come over there!!                                    *
 *                                                                       *
 *                                                                       *
 ************************************************************************/
/**
 * The nsISyncDOMLoadService interface can be used to synchronously load
 * a document.
 */
public interface nsISyncLoadDOMService extends nsISupports {

  String NS_ISYNCLOADDOMSERVICE_IID =
    "{8095998d-ae1c-4cfa-9b43-0973e5d77eb0}";

  /**
     * Synchronously load the document from the specified channel.
     *
     * @param aChannel   The channel to load the document from.
     * @param aLoaderPrincipal Principal of loading document. For security
     *                         checks null if no securitychecks should be done
     *
     * @returns The document loaded from the URI.
     */
  nsIDOMDocument loadDocument(nsIChannel aChannel, nsIPrincipal aLoaderPrincipal);

  nsIDOMDocument loadDocumentAsXML(nsIChannel aChannel, nsIPrincipal aLoaderPrincipal);

  /**
     * Synchronously load an XML document from the specified
     * channel. The channel must be possible to open synchronously.
     *
     * @param aChannel   The channel to load the document from.
     * @param aLoaderPrincipal Principal of loading document. For security
     *                         checks null if no securitychecks should be done
     *
     * @returns The document loaded from the URI.
     */
  nsIDOMDocument loadLocalDocument(nsIChannel aChannel, nsIPrincipal aLoaderPrincipal);

}