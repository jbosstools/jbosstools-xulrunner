/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/mime/public/nsIMIMEInfo.idl
 */

package org.mozilla.interfaces;

/**
 * nsIWebHandlerApp is a web-based handler, as speced by the WhatWG HTML5
 * draft.  Currently, only GET-based handlers are supported.  At some point, 
 * we probably want to work with WhatWG to spec out and implement POST-based
 * handlers as well.
 */
public interface nsIWebHandlerApp extends nsIHandlerApp {

  String NS_IWEBHANDLERAPP_IID =
    "{7521a093-c498-45ce-b462-df7ba0d882f6}";

  /**
     * Template used to construct the URI to GET.  Template is expected to have
     * a %s in it, and the escaped URI to be handled is inserted in place of 
     * that %s, as per the HTML5 spec.
     */
  String getUriTemplate();

  /**
     * Template used to construct the URI to GET.  Template is expected to have
     * a %s in it, and the escaped URI to be handled is inserted in place of 
     * that %s, as per the HTML5 spec.
     */
  void setUriTemplate(String aUriTemplate);

}