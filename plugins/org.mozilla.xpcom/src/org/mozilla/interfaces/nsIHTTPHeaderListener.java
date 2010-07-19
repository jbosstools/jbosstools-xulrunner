/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/plugin/base/public/nsIHTTPHeaderListener.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIHTTPHeaderListener interface allows plugin authors to
 * access HTTP Response headers after issuing an
 * nsIPluginHost::{GetURL,PostURL}() call. <P>

 * IMPORTANT NOTE: The plugin author must provide an instance to
 * {GetURL,PostURL}() that implements both nsIPluginStreamListener and
 * nsIHTTPHeaderListener.  This instance is passed in through
 * {GetURL,PostURL}()'s streamListener parameter.  The browser will then
 * QI thi streamListener to see if it implements
 * nsIHTTPHeaderListener.
 */
public interface nsIHTTPHeaderListener extends nsISupports {

  String NS_IHTTPHEADERLISTENER_IID =
    "{ea51e0b8-871c-4b85-92da-6f400394c5ec}";

  /**
   * Called for each HTTP Response header.
   * NOTE: You must copy the values of the params.  
   */
  void newResponseHeader(String headerName, String headerValue);

  /**
   * Called once for the HTTP Response status line.
   * Value does NOT include a terminating newline.
   * NOTE: You must copy this value.
   */
  void statusLine(String line);

}