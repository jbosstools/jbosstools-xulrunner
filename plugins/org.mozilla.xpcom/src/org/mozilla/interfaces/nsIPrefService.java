/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/libpref/public/nsIPrefService.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIPrefService interface is the main entry point into the back end
 * preferences management library. The preference service is directly
 * responsible for the management of the preferences files and also facilitates
 * access to the preference branch object which allows the direct manipulation
 * of the preferences themselves.
 *
 * @see nsIPrefBranch
 * 
 * @status FROZEN
 */
public interface nsIPrefService extends nsISupports {

  String NS_IPREFSERVICE_IID =
    "{decb9cc7-c08f-4ea5-be91-a8fc637ce2d2}";

  /**
   * Called to read in the preferences specified in a user preference file.
   *
   * @param aFile The file to be read.
   *
   * @note
   * If nsnull is passed in for the aFile parameter the default preferences
   * file(s) [prefs.js, user.js] will be read and processed.
   *
   * @return NS_OK File was read and processed.
   * @return Other File failed to read or contained invalid data.
   *
   * @see savePrefFile
   * @see nsIFile
   */
  void readUserPrefs(nsIFile aFile);

  /**
   * Called to completely flush and re-initialize the preferences system.
   *
   * @return NS_OK The preference service was re-initialized correctly.
   * @return Other The preference service failed to restart correctly.
   */
  void resetPrefs();

  /**
   * Called to reset all preferences with user set values back to the
   * application default values.
   *
   * @return NS_OK Always.
   */
  void resetUserPrefs();

  /**
   * Called to write current preferences state to a file.
   *
   * @param aFile The file to be written.
   *
   * @note
   * If nsnull is passed in for the aFile parameter the preference data is
   * written out to the current preferences file (usually prefs.js.)
   *
   * @return NS_OK File was written.
   * @return Other File failed to write.
   *
   * @see readUserPrefs
   * @see nsIFile
   */
  void savePrefFile(nsIFile aFile);

  /**
   * Call to get a Preferences "Branch" which accesses user preference data.
   * Using a Set method on this object will always create or set a user
   * preference value. When using a Get method a user set value will be
   * returned if one exists, otherwise a default value will be returned.
   *
   * @param aPrefRoot The preference "root" on which to base this "branch".
   *                  For example, if the root "browser.startup." is used, the
   *                  branch will be able to easily access the preferences
   *                  "browser.startup.page", "browser.startup.homepage", or
   *                  "browser.startup.homepage_override" by simply requesting
   *                  "page", "homepage", or "homepage_override". nsnull or "" 
   *                  may be used to access to the entire preference "tree".
   *
   * @return nsIPrefBranch The object representing the requested branch.
   *
   * @see getDefaultBranch
   */
  nsIPrefBranch getBranch(String aPrefRoot);

  /**
   * Call to get a Preferences "Branch" which accesses only the default 
   * preference data. Using a Set method on this object will always create or
   * set a default preference value. When using a Get method a default value
   * will always be returned.
   *
   * @param aPrefRoot The preference "root" on which to base this "branch".
   *                  For example, if the root "browser.startup." is used, the
   *                  branch will be able to easily access the preferences
   *                  "browser.startup.page", "browser.startup.homepage", or
   *                  "browser.startup.homepage_override" by simply requesting
   *                  "page", "homepage", or "homepage_override". nsnull or "" 
   *                  may be used to access to the entire preference "tree".
   *
   * @note
   * Few consumers will want to create default branch objects. Many of the
   * branch methods do nothing on a default branch because the operations only
   * make sense when applied to user set preferences.
   *
   * @return nsIPrefBranch The object representing the requested default branch.
   *
   * @see getBranch
   */
  nsIPrefBranch getDefaultBranch(String aPrefRoot);

}