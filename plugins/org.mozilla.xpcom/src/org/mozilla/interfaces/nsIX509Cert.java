/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIX509Cert.idl
 */

package org.mozilla.interfaces;

/**
 * This represents a X.509 certificate.
 *
 * @status FROZEN
 */
public interface nsIX509Cert extends nsISupports {

  String NS_IX509CERT_IID =
    "{f0980f60-ee3d-11d4-998b-00b0d02354a0}";

  /**
   *  A nickname for the certificate.
   */
  String getNickname();

  /**
   *  The primary email address of the certificate, if present.
   */
  String getEmailAddress();

  /**
   *  Obtain a list of all email addresses
   *  contained in the certificate.
   *
   *  @param length The number of strings in the returned array.
   *  @return An array of email addresses.
   */
  String[] getEmailAddresses(long[] length);

  /**
   *  Check whether a given address is contained in the certificate.
   *  The comparison will convert the email address to lowercase.
   *  The behaviour for non ASCII characters is undefined.
   *
   *  @param aEmailAddress The address to search for.
   *                
   *  @return True if the address is contained in the certificate.
   */
  boolean containsEmailAddress(String aEmailAddress);

  /**
   *  The subject owning the certificate.
   */
  String getSubjectName();

  /**
   *  The subject's common name.
   */
  String getCommonName();

  /**
   *  The subject's organization.
   */
  String getOrganization();

  /**
   *  The subject's organizational unit.
   */
  String getOrganizationalUnit();

  /**
   *  The fingerprint of the certificate's public key,
   *  calculated using the SHA1 algorithm.
   */
  String getSha1Fingerprint();

  /**
   *  The fingerprint of the certificate's public key,
   *  calculated using the MD5 algorithm.
   */
  String getMd5Fingerprint();

  /**
   *  A human readable name identifying the hardware or
   *  software token the certificate is stored on.
   */
  String getTokenName();

  /**
   *  The subject identifying the issuer certificate.
   */
  String getIssuerName();

  /**
   *  The serial number the issuer assigned to this certificate.
   */
  String getSerialNumber();

  /**
   *  The issuer subject's common name.
   */
  String getIssuerCommonName();

  /**
   *  The issuer subject's organization.
   */
  String getIssuerOrganization();

  /**
   *  The issuer subject's organizational unit.
   */
  String getIssuerOrganizationUnit();

  /**
   *  The certificate used by the issuer to sign this certificate.
   */
  nsIX509Cert getIssuer();

  /**
   *  This certificate's validity period.
   */
  nsIX509CertValidity getValidity();

  /**
   *  A unique identifier of this certificate within the local storage.
   */
  String getDbKey();

  /**
   *  A human readable identifier to label this certificate.
   */
  String getWindowTitle();

  /**
   *  Constants to classify the type of a certificate.
   */
  long UNKNOWN_CERT = 0L;

  long CA_CERT = 1L;

  long USER_CERT = 2L;

  long EMAIL_CERT = 4L;

  long SERVER_CERT = 8L;

  /**
   *  Constants for certificate verification results.
   */
  long VERIFIED_OK = 0L;

  long NOT_VERIFIED_UNKNOWN = 1L;

  long CERT_REVOKED = 2L;

  long CERT_EXPIRED = 4L;

  long CERT_NOT_TRUSTED = 8L;

  long ISSUER_NOT_TRUSTED = 16L;

  long ISSUER_UNKNOWN = 32L;

  long INVALID_CA = 64L;

  long USAGE_NOT_ALLOWED = 128L;

  /**
   *  Constants that describe the certified usages of a certificate.
   */
  long CERT_USAGE_SSLClient = 0L;

  long CERT_USAGE_SSLServer = 1L;

  long CERT_USAGE_SSLServerWithStepUp = 2L;

  long CERT_USAGE_SSLCA = 3L;

  long CERT_USAGE_EmailSigner = 4L;

  long CERT_USAGE_EmailRecipient = 5L;

  long CERT_USAGE_ObjectSigner = 6L;

  long CERT_USAGE_UserCertImport = 7L;

  long CERT_USAGE_VerifyCA = 8L;

  long CERT_USAGE_ProtectedObjectSigner = 9L;

  long CERT_USAGE_StatusResponder = 10L;

  long CERT_USAGE_AnyCA = 11L;

  /**
   *  Obtain a list of certificates that contains this certificate 
   *  and the issuing certificates of all involved issuers,
   *  up to the root issuer.
   *
   *  @return The chain of certifficates including the issuers.
   */
  nsIArray getChain();

  /**
   *  Obtain an array of human readable strings describing
   *  the certificate's certified usages.
   *
   *  @param ignoreOcsp Do not use OCSP even if it is currently activated.
   *  @param verified The certificate verification result, see constants.
   *  @param count The number of human readable usages returned.
   *  @param usages The array of human readable usages.
   */
  void getUsagesArray(boolean ignoreOcsp, long[] verified, long[] count, String[][] usages);

  /**
   *  Obtain a single comma separated human readable string describing
   *  the certificate's certified usages.
   *
   *  @param ignoreOcsp Do not use OCSP even if it is currently activated.
   *  @param verified The certificate verification result, see constants.
   *  @param purposes The string listing the usages.
   */
  void getUsagesString(boolean ignoreOcsp, long[] verified, String[] usages);

  /**
   *  Verify the certificate for a particular usage.
   *
   *  @return The certificate verification result, see constants.
   */
  long verifyForUsage(long usage);

  /**
   *  This is the attribute which describes the ASN1 layout
   *  of the certificate.  This can be used when doing a
   *  "pretty print" of the certificate's ASN1 structure.
   */
  nsIASN1Object getASN1Structure();

  /**
   *  Obtain a raw binary encoding of this certificate
   *  in DER format.
   *
   *  @param length The number of bytes in the binary encoding.
   *  @param data The bytes representing the DER encoded certificate.
   */
  byte[] getRawDER(long[] length);

  /**
   *  Test whether two certificate instances represent the 
   *  same certificate.
   *
   *  @return Whether the certificates are equal
   */
  boolean _equals(nsIX509Cert other);

}