/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/profile/public/nsIProfileMigrator.idl
 */

package org.mozilla.interfaces;

/**
 * Migrate application settings from an outside source.
 *
 * @provider Application (Profile-migration code)
 * @client   Toolkit (Startup code)
 * @obtainable service, contractid("@mozilla.org/toolkit/profile-migrator;1")
 */
public interface nsIProfileMigrator extends nsISupports {

  String NS_IPROFILEMIGRATOR_IID =
    "{24ce8b9d-b7ff-4279-aef4-26e158f03e34}";

  /**
   * Import existing profile paths.  When the app is started the first
   * time, if there are no INI-style profiles, appstartup will call
   * this method to import any registry- style profiles that may
   * exist. When this method is called, there is no event queue
   * service and this method should not attempt to use the network or
   * show any GUI.
   *
   * @note You don't actually have to move the profile data. Just call
   *       nsIToolkitProfileService.create on the existing profile path(s).
   */
  void _import();

  /**
   * Do profile migration.
   *
   * When this method is called, a default profile has been created;
   * XPCOM has been initialized such that compreg.dat is in the
   * profile; the directory service does *not* return a key for
   * NS_APP_USER_PROFILE_50_DIR or any of the keys depending on an active
   * profile. To figure out the directory of the "current" profile, use
   * aStartup.directory.
   *
   * If your migrator needs to access services that use the profile (to
   * set profile prefs or bookmarks, for example), use aStartup.doStartup.
   *
   * The startup code ignores COM exceptions thrown from this method.
   */
  void migrate(nsIProfileStartup aStartup);

}