/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/profile/public/nsIToolkitProfileService.idl
 */

package org.mozilla.interfaces;

public interface nsIToolkitProfileService extends nsISupports {

  String NS_ITOOLKITPROFILESERVICE_IID =
    "{9b434f48-438c-4f85-89de-b7f321a45341}";

  boolean getStartWithLastProfile();

  void setStartWithLastProfile(boolean aStartWithLastProfile);

  boolean getStartOffline();

  void setStartOffline(boolean aStartOffline);

  nsISimpleEnumerator getProfiles();

  nsIToolkitProfile getSelectedProfile();

  void setSelectedProfile(nsIToolkitProfile aSelectedProfile);

  /**
     * Get a profile by name. This is mainly for use by the -P
     * commandline flag.
     *
     * @param aName The profile name to find.
     */
  nsIToolkitProfile getProfileByName(String aName);

  /**
     * Lock an arbitrary path as a profile. If the path does not exist, it
     * will be created and the defaults copied from the application directory.
     */
  nsIProfileLock lockProfilePath(nsILocalFile aDirectory, nsILocalFile aTempDirectory);

  /**
     * Create a new profile.
     * 
     * @param aRootDir
     *        The profile directory. May be null, in which case a suitable
     *        default will be chosen based on the profile name.
     * @param aTempDir
     *        The profile temporary directory. May be null, in which case a
     *        suitable default will be chosen based either on the profile name
     *        if aRootDir is null or aRootDir itself.
     * @param aName
     *        The profile name.
     */
  nsIToolkitProfile createProfile(nsILocalFile aRootDir, nsILocalFile aTempDir, String aName);

  /**
     * Returns the number of profiles.
     * @return 0, 1, or 2. More than 2 profiles will always return 2.
     */
  long getProfileCount();

  /**
     * Flush the profiles list file.
     */
  void flush();

}