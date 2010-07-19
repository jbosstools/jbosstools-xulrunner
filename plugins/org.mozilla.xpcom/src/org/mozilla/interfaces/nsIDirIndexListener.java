/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/streamconv/public/nsIDirIndexListener.idl
 */

package org.mozilla.interfaces;

/**
 * This interface is used to receive contents of directory index listings
 * from a protocol. They can then be transformed into an output format
 * (such as rdf, html, etc)
 */
public interface nsIDirIndexListener extends nsISupports {

  String NS_IDIRINDEXLISTENER_IID =
    "{fae4e9a8-1dd1-11b2-b53c-8f3aa1bbf8f5}";

  /**
     * Called for each directory entry
     *
     * @param request - the request
     * @param ctxt - opaque parameter
     * @param index - new index to add
     */
  void onIndexAvailable(nsIRequest aRequest, nsISupports aCtxt, nsIDirIndex aIndex);

  /**
     * Called for each information line
     *
     * @param request - the request
     * @param ctxt - opaque parameter
     * @param info - new info to add
     */
  void onInformationAvailable(nsIRequest aRequest, nsISupports aCtxt, String aInfo);

}