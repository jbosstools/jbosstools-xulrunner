/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIX509Cert3.idl
 */

package org.mozilla.interfaces;

/**
 * Extending nsIX509Cert
 */
public interface nsIX509Cert3 extends nsIX509Cert2 {

  String NS_IX509CERT3_IID =
    "{399004d8-b8c7-4eb9-8362-d99f4c0161fd}";

  /**
   *  Constants for specifying the chain mode when exporting a certificate
   */
  long CMS_CHAIN_MODE_CertOnly = 1L;

  long CMS_CHAIN_MODE_CertChain = 2L;

  long CMS_CHAIN_MODE_CertChainWithRoot = 3L;

  /**
   *  Async version of nsIX509Cert::getUsagesArray()
   *
   *  Will not block, will request results asynchronously,
   *  availability of results will be notified.
   */
  void requestUsagesArrayAsync(nsICertVerificationListener cvl);

  /**
   *  Obtain the certificate wrapped in a PKCS#7 SignedData structure,
   *  with or without the certificate chain
   *
   *  @param chainMode Whether to include the chain (with or without the root),
                       see CMS_CHAIN_MODE constants.
   *  @param length The number of bytes of the PKCS#7 data.
   *  @param data The bytes representing the PKCS#7 wrapped certificate.
   */
  byte[] exportAsCMS(long chainMode, long[] length);

  boolean getIsSelfSigned();

  /**
   * Human readable names identifying all hardware or
   * software tokens the certificate is stored on.
   *
   * @param length On success, the number of entries in the returned array.
   * @return On success, an array containing the names of all tokens 
   *         the certificate is stored on (may be empty).
   *         On failure the function throws/returns an error.
   */
  String[] getAllTokenNames(long[] length);

}