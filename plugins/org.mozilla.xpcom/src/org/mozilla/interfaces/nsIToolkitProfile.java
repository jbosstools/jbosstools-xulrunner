/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/profile/public/nsIToolkitProfile.idl
 */

package org.mozilla.interfaces;

public interface nsIToolkitProfile extends nsISupports {

  String NS_ITOOLKITPROFILE_IID =
    "{7422b090-4a86-4407-972e-75468a625388}";

  /**
 * A interface representing a profile.
 * @note THIS INTERFACE SHOULD BE IMPLEMENTED BY THE TOOLKIT CODE ONLY! DON'T
 *       EVEN THINK ABOUT IMPLEMENTING THIS IN JAVASCRIPT!
 */
/**
     * The location of the profile directory.
     */
  nsILocalFile getRootDir();

  /**
     * The location of the profile local directory, which may be the same as
     * the root directory.  See nsIProfileLock::localDirectory.
     */
  nsILocalFile getLocalDir();

  /**
     * The name of the profile.
     */
  String getName();

  /**
     * The name of the profile.
     */
  void setName(String aName);

  /**
     * Removes the profile from the registry of profiles.
     *
     * @param removeFiles
     *        Indicates whether or not the profile directory should be
     *        removed in addition.
     */
  void remove(boolean removeFiles);

  /**
     * Lock this profile using platform-specific locking methods.
     *
     * @param lockFile If locking fails, this may return a lockFile object
     *                 which can be used in platform-specific ways to
     *                 determine which process has the file locked. Null
     *                 may be passed.
     * @return An interface which holds a profile lock as long as you reference
     *         it.
     * @throws NS_ERROR_FILE_ACCESS_DENIED if the profile was already locked.
     */
  nsIProfileLock lock(nsIProfileUnlocker[] aUnlocker);

}