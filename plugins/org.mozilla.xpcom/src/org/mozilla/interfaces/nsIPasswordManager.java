/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIPasswordManager.idl
 */

package org.mozilla.interfaces;

/** 
 * An optional interface for clients accessing or removing
 * logins that were collected by the password manager
 * 
 *
 */
public interface nsIPasswordManager extends nsISupports {

  String NS_IPASSWORDMANAGER_IID =
    "{173562f0-2173-11d5-a54c-0010a401eb10}";

  /**
   * Called to add an individual login to the list of saved logins
   *
   * @param aHost The host for which the login is being remembered
   * @param aUser The username portion of the login
   * @param aPassword The password portion of the login
   *
   */
  void addUser(String aHost, String aUser, String aPassword);

  /**
   * Called to remove an individual login from the list of save logins
   *
   * @param aHost The host for which the login is being remembered
   * @param aUser The username portion of the login
   *
   */
  void removeUser(String aHost, String aUser);

  /**
   * Called to add a host to the list of rejected hosts -- i.e., hosts for which
   * the do-you-want-to-save dialog does appear
   *
   * @param aHost The host for which the dialog is to not appear
   *
   */
  void addReject(String aHost);

  /**
   * Called to remove a host from the list of rejected hosts -- i.e., hosts for which
   * the do-you-want-to-save dialog does not appear
   *
   * @param aHost The host for which the dialog is to not appear
   *
   */
  void removeReject(String aHost);

  /**
   * Called to enumerate through each login in the password-manager list
   * The objects enumerated over are of type nsIPassword
   */
  nsISimpleEnumerator getEnumerator();

  /**
   * Called to enumerate through each rejected site in the password-manager list
   * These are sites for which the user has indicated that he doesn't want passwords saved.
   * The objects enumerated over are of type nsIPassword, although the only member of
   * that object that is relevent is the host (the user and password members are ignored).
   */
  nsISimpleEnumerator getRejectEnumerator();

}