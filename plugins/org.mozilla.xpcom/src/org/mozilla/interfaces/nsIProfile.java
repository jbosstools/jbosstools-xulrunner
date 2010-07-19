/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/profile/public/nsIProfile.idl
 */

package org.mozilla.interfaces;

/**
 * nsIProfile
 * 
 * @status FROZEN
 * @version 1.0
 */
public interface nsIProfile extends nsISupports {

  String NS_IPROFILE_IID =
    "{02b0625a-e7f3-11d2-9f5a-006008a6efe9}";

  int getProfileCount();

  String[] getProfileList(long[] length);

  boolean profileExists(String profileName);

  String getCurrentProfile();

  void setCurrentProfile(String aCurrentProfile);

  long SHUTDOWN_PERSIST = 1L;

  long SHUTDOWN_CLEANSE = 2L;

  void shutDownCurrentProfile(long shutDownType);

  void createNewProfile(String profileName, String nativeProfileDir, String langcode, boolean useExistingDir);

  void renameProfile(String oldName, String newName);

  void deleteProfile(String name, boolean canDeleteFiles);

  void cloneProfile(String profileName);

}