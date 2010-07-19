/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/passwordmgr/public/nsILoginManagerIEMigrationHelper.idl
 */

package org.mozilla.interfaces;

public interface nsILoginManagerIEMigrationHelper extends nsISupports {

  String NS_ILOGINMANAGERIEMIGRATIONHELPER_IID =
    "{8a59ea3d-b8d0-48af-a3e2-63e27a02cde7}";

  /**
     * Takes a login provided from nsIEProfileMigrator, migrates it to the
     * current login manager format, and adds it to the list of stored logins.
     *
     * @param aLogin
     *        The login to be migrated.
     *
     * Note: In some cases, multiple logins may be created from a single input
     *       when the format is ambigious.
     *
     */
  void migrateAndAddLogin(nsILoginInfo aLogin);

}