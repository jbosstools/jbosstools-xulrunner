/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/profile/public/nsIProfileMigrator.idl
 */

package org.mozilla.interfaces;

/**
 * Helper interface for nsIProfileMigrator.
 *
 * @provider Toolkit (Startup code)
 * @client   Application (Profile-migration code)
 * @obtainable nsIProfileMigrator.migrate
 */
public interface nsIProfileStartup extends nsISupports {

  String NS_IPROFILESTARTUP_IID =
    "{048e5ca1-0eb7-4bb1-a9a2-a36f7d4e0e3c}";

  /**
   * The root directory of the semi-current profile, during profile migration.
   * After nsIProfileMigrator.migrate has returned, this object will not be
   * useful.
   */
  nsIFile getDirectory();

  /**
   * Do profile-startup by setting NS_APP_USER_PROFILE_50_DIR in the directory
   * service and notifying the profile-startup observer topics.
   */
  void doStartup();

}