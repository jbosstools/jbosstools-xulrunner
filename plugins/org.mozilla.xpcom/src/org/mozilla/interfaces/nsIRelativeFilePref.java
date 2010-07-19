/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/libpref/public/nsIRelativeFilePref.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIRelativeFilePref interface is a wrapper for an nsILocalFile and
 * and a directory service key. When used as a pref value, it stores a
 * relative path to the file from the location pointed to by the directory
 * service key. The path has the same syntax across all platforms.
 *
 * @see nsIPrefBranch::getComplexValue
 * @see nsIPrefBranch::setComplexValue
 * 
 */
public interface nsIRelativeFilePref extends nsISupports {

  String NS_IRELATIVEFILEPREF_IID =
    "{2f977d4e-5485-11d4-87e2-0010a4e75ef2}";

  /**
   * file
   *
   * The file whose location is stored or retrieved.
   */
  nsILocalFile getFile();

  /**
   * file
   *
   * The file whose location is stored or retrieved.
   */
  void setFile(nsILocalFile aFile);

  /**
   * relativeToKey
   *
   * A directory service key for the directory
   * from which the file path is relative.
   */
  String getRelativeToKey();

  /**
   * relativeToKey
   *
   * A directory service key for the directory
   * from which the file path is relative.
   */
  void setRelativeToKey(String aRelativeToKey);

}