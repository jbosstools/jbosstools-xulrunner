/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsICertOverrideService.idl
 */

package org.mozilla.interfaces;

/**
 * This represents the global list of triples
 *   {host:port, cert-fingerprint, allowed-overrides} 
 * that the user wants to accept without further warnings. 
 */
public interface nsICertOverrideService extends nsISupports {

  String NS_ICERTOVERRIDESERVICE_IID =
    "{31738d2a-77d3-4359-84c9-4be2f38fb8c5}";

  /**
   *  Override Untrusted
   */
  short ERROR_UNTRUSTED = 1;

  /**
   *  Override hostname Mismatch
   */
  short ERROR_MISMATCH = 2;

  /**
   *  Override Time error
   */
  short ERROR_TIME = 4;

  /**
   *  The given cert should always be accepted for the given hostname:port,
   *  regardless of errors verifying the cert.
   *  Host:Port is a primary key, only one entry per host:port can exist.
   *  The implementation will store a fingerprint of the cert.
   *  The implementation will decide which fingerprint alg is used.
   *
   *  @param aHostName The host (punycode) this mapping belongs to
   *  @param aPort The port this mapping belongs to, if it is -1 then it 
   *          is internaly treated as 443
   *  @param aCert The cert that should always be accepted
   *  @param aOverrideBits The errors we want to be overriden
   */
  void rememberValidityOverride(String aHostName, int aPort, nsIX509Cert aCert, long aOverrideBits, boolean aTemporary);

  /**
   *  The given cert should always be accepted for the given hostname:port,
   *  regardless of errors verifying the cert.
   *  Host:Port is a primary key, only one entry per host:port can exist.
   *  The implementation will store a fingerprint of the cert.
   *  The implementation will decide which fingerprint alg is used.
   *
   *  @param aHostName The host (punycode) this mapping belongs to
   *  @param aPort The port this mapping belongs to, if it is -1 then it 
   *          is internaly treated as 443
   *  @param aCert The cert that should always be accepted
   *  @param aOverrideBits The errors that are currently overriden
   *  @return whether an override entry for aHostNameWithPort is currently on file
   *          that matches the given certificate
   */
  boolean hasMatchingOverride(String aHostName, int aPort, nsIX509Cert aCert, long[] aOverrideBits, boolean[] aIsTemporary);

  /**
   *  Retrieve the stored override for the given hostname:port.
   *
   *  @param aHostName The host (punycode) whose entry should be tested
   *  @param aPort The port whose entry should be tested, if it is -1 then it 
   *          is internaly treated as 443
   *  @param aHashAlg On return value True, the fingerprint hash algorithm
   *                  as an OID value in dotted notation.
   *  @param aFingerprint On return value True, the stored fingerprint 
   *  @param aOverrideBits The errors that are currently overriden
   *  @return whether a matching override entry for aHostNameWithPort 
   *          and aFingerprint is currently on file
   */
  boolean getValidityOverride(String aHostName, int aPort, String[] aHashAlg, String[] aFingerprint, long[] aOverrideBits, boolean[] aIsTemporary);

  /**
   *  Remove a override for the given hostname:port.
   *
   *  @param aHostName The host (punycode) whose entry should be cleared.
   *  @param aPort The port whose entry should be cleared, if it is -1 then it 
   *          is internaly treated as 443
   */
  void clearValidityOverride(String aHostName, int aPort);

  /**
   *  Obtain the full list of hostname:port for which overrides are known.
   *
   *  @param aCount The number of host:port entries returned
   *  @param aHostsWithPortsArray The array of host:port entries returned
   */
  void getAllOverrideHostsWithPorts(long[] aCount, String[][] aHostsWithPortsArray);

  /**
   *  Is the given cert used in rules?
   *
   *  @param aCert The cert we're looking for
   *  @return how many override entries are currently on file
   *          for the given certificate
   */
  long isCertUsedForOverrides(nsIX509Cert aCert, boolean aCheckTemporaries, boolean aCheckPermanents);

}