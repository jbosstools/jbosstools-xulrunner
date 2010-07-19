/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/uriloader/exthandler/nsIExternalHelperAppService.idl
 */

package org.mozilla.interfaces;

/**
 * The external helper app service is used for finding and launching
 * platform specific external applications for a given mime content type.
 */
public interface nsIExternalHelperAppService extends nsISupports {

  String NS_IEXTERNALHELPERAPPSERVICE_IID =
    "{9e456297-ba3e-42b1-92bd-b7db014268cb}";

  /**
   * Binds an external helper application to a stream listener. The caller
   * should pump data into the returned stream listener. When the OnStopRequest
   * is issued, the stream listener implementation will launch the helper app
   * with this data.
   * @param aMimeContentType The content type of the incoming data
   * @param aRequest The request corresponding to the incoming data
   * @param aWindowContext Use GetInterface to retrieve properties like the
   *                       dom window or parent window...
   *                       The service might need this in order to bring up dialogs.
   * @param aForceSave True to always save this content to disk, regardless of
   *                   nsIMIMEInfo and other such influences.
   * @return A nsIStreamListener which the caller should pump the data into.
   */
  nsIStreamListener doContent(String aMimeContentType, nsIRequest aRequest, nsIInterfaceRequestor aWindowContext, boolean aForceSave);

  /**
   * Returns true if data from a URL with this extension combination
   * is to be decoded from aEncodingType prior to saving or passing
   * off to helper apps, false otherwise.
   */
  boolean applyDecodingForExtension(String aExtension, String aEncodingType);

}