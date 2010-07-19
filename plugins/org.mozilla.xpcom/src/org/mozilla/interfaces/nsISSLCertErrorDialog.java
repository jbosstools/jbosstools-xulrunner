/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsISSLCertErrorDialog.idl
 */

package org.mozilla.interfaces;

public interface nsISSLCertErrorDialog extends nsISupports {

  String NS_ISSLCERTERRORDIALOG_IID =
    "{0729ce8e-8935-4989-ba72-a2d6307f2365}";

  /**
   *  Called when an SSL connection aborts because of a bad certificate,
   *  and no other code is in place for reporting the problem.
   *  Should bring up a dialog to inform the user and display the certificate.
   *
   *  @param status Might be used to query additional information
   *  @param cert The certificate that this error is about
   *  @param textErrorMessage An error message with whitespace formatting
   *  @param htmlErrorMessage Optional, might either be empty,
                              or might contain the same message as in
                              textErrorMessage plus some html formatting.
   *  @param hostName The error occurred when connecting to this hostName.
   *  @param portNumber The error occurred when connecting to this portNumber.
   */
  void showCertError(nsIInterfaceRequestor ctx, nsISSLStatus status, nsIX509Cert cert, String textErrorMessage, String htmlErrorMessage, String hostName, long portNumber);

}