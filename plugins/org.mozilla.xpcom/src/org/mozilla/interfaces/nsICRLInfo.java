/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsICRLInfo.idl
 */

package org.mozilla.interfaces;

/**
 * Information on a Certificate Revocation List (CRL)
 * issued by a Aertificate Authority (CA).
 *
 * @status FROZEN
 */
public interface nsICRLInfo extends nsISupports {

  String NS_ICRLINFO_IID =
    "{c185d920-4a3e-11d5-ba27-00108303b117}";

  /**
   *  The issuing CA's organization.
   */
  String getOrganization();

  /**
   *  The issuing CA's organizational unit.
   */
  String getOrganizationalUnit();

  /**
   *  The time this CRL was created at.
   */
  double getLastUpdate();

  /**
   *  The time the suggested next update for this CRL.
   */
  double getNextUpdate();

  /**
   *  lastUpdate formatted as a human readable string
   *  formatted according to the environment locale.
   */
  String getLastUpdateLocale();

  /**
   *  nextUpdate formatted as a human readable string
   *  formatted according to the environment locale.
   */
  String getNextUpdateLocale();

  /**
   *  The key identifying the CRL in the database.
   */
  String getNameInDb();

  /**
   *  The URL this CRL was last fetched from.
   */
  String getLastFetchURL();

}