/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIBadCertListener2.idl
 */

package org.mozilla.interfaces;

/**
 * A mechanism to report a broken SSL status. The recipient should NOT block.
 * Can be used to obtain the SSL handshake status of a connection
 * that will be canceled because of improper cert status.
 */
public interface nsIBadCertListener2 extends nsISupports {

  String NS_IBADCERTLISTENER2_IID =
    "{2c3d268c-ad82-49f3-99aa-e9ffddd7a0dc}";

  /**
   *  @param socketInfo A network communication context that can be used to obtain more information
   *                    about the active connection.
   *  @param status The SSL status object that describes the problem(s).
   *  @param targetSite The Site name that was used to open the current connection.
   *
   *  @return The consumer shall return true if it wants to suppress the error message
   *          related to the bad cert (the connection will still get canceled).
   */
  boolean notifyCertProblem(nsIInterfaceRequestor socketInfo, nsISSLStatus status, String targetSite);

}