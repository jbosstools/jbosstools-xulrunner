/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsINSSErrorsService.idl
 */

package org.mozilla.interfaces;

public interface nsINSSErrorsService extends nsISupports {

  String NS_INSSERRORSSERVICE_IID =
    "{3a5c7a0f-f5da-4a8b-a748-d7c5a528f33b}";

  /**
     *  @param aNSPRCode An error code obtained using PR_GetError()
     *  @return True if it is error code defined by the NSS library
     */
  boolean isNSSErrorCode(int aNSPRCode);

  /**
     *  Function will fail if aNSPRCode is not an NSS error code.
     *  @param aNSPRCode An error code obtained using PR_GetError()
     *  @return The result of the conversion, an XPCOM error code
     */
  long getXPCOMFromNSSError(int aNSPRCode);

  /**
     *  Function will fail if aXPCOMErrorCode is not an NSS error code.
     *  @param aXPCOMErrorCode An error code obtain using getXPCOMFromNSSError
     *  return A localized human readable error explanation.
     */
  String getErrorMessage(long aXPCOMErrorCode);

  /**
     *  Function will fail if aXPCOMErrorCode is not an NSS error code.
     *  @param aXPCOMErrorCode An error code obtain using getXPCOMFromNSSError
     *  return the 
     */
  long getErrorClass(long aXPCOMErrorCode);

  long ERROR_CLASS_SSL_PROTOCOL = 1L;

  long ERROR_CLASS_BAD_CERT = 2L;

  /**
     *  The following values define the range of NSPR error codes used by NSS.
     *  NSS remains the authorative source for these numbers, as a result,
     *  the values might change in the future.
     *  The security module will perform a runtime check and assertion
     *  to ensure the values are in synch with NSS.
     */
  int NSS_SEC_ERROR_BASE = -8192;

  int NSS_SEC_ERROR_LIMIT = -7192;

  int NSS_SSL_ERROR_BASE = -12288;

  int NSS_SSL_ERROR_LIMIT = -11288;

}