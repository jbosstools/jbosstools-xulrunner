/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIRecentBadCertsService.idl
 */

package org.mozilla.interfaces;

/**
 * This represents a global list of recently seen bad ssl status
 * including the bad cert.
 * The implementation will decide how many entries it will hold,
 * the number is expected to be small.
 */
public interface nsIRecentBadCertsService extends nsISupports {

  String NS_IRECENTBADCERTSSERVICE_IID =
    "{a5ae8b05-a76e-408f-b0ba-02a831265749}";

  /**
   *  Retrieve the recently seen bad ssl status for the given hostname:port.
   *  If no SSL cert was recently seen for the given hostname:port, return null.
   *  If a good cert was seen for the given hostname:port, return null.
   *
   *  @param aHostNameWithPort The host:port whose entry should be tested
   *  @return null or a recently seen bad ssl status with cert
   */
  nsISSLStatus getRecentBadCert(String aHostNameWithPort);

  /**
   *  A bad certificate that should be remembered by the service.
   *  Will be added as the most recently seen cert.
   *  The service may forget older entries to make room for the new one.
   *
   *  @param aHostNameWithPort The host:port whose entry should be tested
   *  @param aCert The bad ssl status with certificate
   */
  void addBadCert(String aHostNameWithPort, nsISSLStatus aStatus);

}