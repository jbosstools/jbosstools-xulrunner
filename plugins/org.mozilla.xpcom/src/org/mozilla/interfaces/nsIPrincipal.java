/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/caps/idl/nsIPrincipal.idl
 */

package org.mozilla.interfaces;

public interface nsIPrincipal extends nsISerializable {

  String NS_IPRINCIPAL_IID =
    "{b8268b9a-2403-44ed-81e3-614075c92034}";

  /**
     * Values of capabilities for each principal. Order is
     * significant: if an operation is performed on a set
     * of capabilities, the minimum is computed.
     */
  short ENABLE_DENIED = 1;

  short ENABLE_UNKNOWN = 2;

  short ENABLE_WITH_USER_PERMISSION = 3;

  short ENABLE_GRANTED = 4;

  /**
     * Returns whether the other principal is equivalent to this principal.
     * Principals are considered equal if they are the same principal,
     * they have the same origin, or have the same certificate fingerprint ID
     */
  boolean _equals(nsIPrincipal other);

  /**
     * Whether this principal is associated with a certificate.
     */
  boolean getHasCertificate();

  /**
     * The fingerprint ID of this principal's certificate.
     * Throws if there is no certificate associated with this principal.
     */
  String getFingerprint();

  /**
     * The pretty name for the certificate.  This sort of (but not really)
     * identifies the subject of the certificate (the entity that stands behind
     * the certificate).  Note that this may be empty; prefer to get the
     * certificate itself and get this information from it, since that may
     * provide more information.
     *
     * Throws if there is no certificate associated with this principal.
     */
  String getPrettyName();

  /**
     * The subject name for the certificate.  This actually identifies the
     * subject of the certificate.  This may well not be a string that would
     * mean much to a typical user on its own (e.g. it may have a number of
     * different names all concatenated together with some information on what
     * they mean in between).
     *
     * Throws if there is no certificate associated with this principal.
     */
  String getSubjectName();

  /**
     * The certificate associated with this principal, if any.  If there isn't
     * one, this will return null.  Getting this attribute never throws.
     */
  nsISupports getCertificate();

}