/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/profile/public/nsIToolkitProfile.idl
 */

package org.mozilla.interfaces;

/**
 * Hold on to a profile lock. Once you release the last reference to this
 * interface, the profile lock is released.
 */
public interface nsIProfileLock extends nsISupports {

  String NS_IPROFILELOCK_IID =
    "{50e07b0a-f338-4da3-bcdb-f4bb0db94dbe}";

  /**
     * The main profile directory.
     */
  nsILocalFile getDirectory();

  /**
     * A directory corresponding to the main profile directory that exists for
     * the purpose of storing data on the local filesystem, including cache
     * files or other data files that may not represent critical user data.
     * (e.g., this directory may not be included as part of a backup scheme.)
     *
     * In some cases, this directory may just be the main profile directory.
     */
  nsILocalFile getLocalDirectory();

  /**
     * Unlock the profile.
     */
  void unlock();

}