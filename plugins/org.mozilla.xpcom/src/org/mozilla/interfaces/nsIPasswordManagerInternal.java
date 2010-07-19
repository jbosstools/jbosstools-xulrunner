/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIPasswordManagerInternal.idl
 */

package org.mozilla.interfaces;

public interface nsIPasswordManagerInternal extends nsISupports {

  String NS_IPASSWORDMANAGERINTERNAL_IID =
    "{a448531f-dc92-4dc1-9012-da841febcbe0}";

  /**
   * A Call to find a login in the password manager list that matches the
   * specified parameters. If any input parameter is null, it is
   * not tested for when looking for the match.
   *
   * @param aHostURI The uri part of a login to search for, or null
   * @param aUsername The username part of a login to search for, or null
   * @param aPassword The password part of a login to search for, or null
   * @param aHostURIFound The uri found in the login
   * @param aUsernameFound The username found in the login
   * @param aPasswordFound The password found in the login
   */
  void findPasswordEntry(String aHostURI, String aUsername, String aPassword, String[] aHostURIFound, String[] aUsernameFound, String[] aPasswordFound);

  /**
   * Called to add an individual login to the list of saved logins. 
   * All parameters are clear text.
   *
   * @param aKey The key for which the login is being remembered (often the page URI)
   * @param aUser The username portion of the login
   * @param aPassword The password portion of the login
   * @param aUserFieldName The name of the field that contained the username
   * @param aPassFieldName The name of the field that contained the password
   */
  void addUserFull(String aKey, String aUser, String aPassword, String aUserFieldName, String aPassFieldName);

  void addUserFull2(String aKey, String aUser, String aPassword, String aUserFieldName, String aPassFieldName, String ActionURL);

  /**
   * Reads logins from a Mozilla Password Manager file, augmenting the current 
   * in-memory set. If a duplicate entry is encountered, the data from the file
   * being read replaces that currently held.
   * 
   * @param aPasswordFile The file to read logins from.
   */
  void readPasswords(nsIFile aPasswordFile);

}