/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/libpref/public/nsIPrefBranch.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIPrefBranch interface is used to manipulate the preferences data. This
 * object may be obtained from the preferences service (nsIPrefService) and
 * used to get and set default and/or user preferences across the application.
 *
 * This object is created with a "root" value which describes the base point in
 * the preferences "tree" from which this "branch" stems. Preferences are
 * accessed off of this root by using just the final portion of the preference.
 * For example, if this object is created with the root "browser.startup.",
 * the preferences "browser.startup.page", "browser.startup.homepage",
 * and "browser.startup.homepage_override" can be accessed by simply passing
 * "page", "homepage", or "homepage_override" to the various Get/Set methods.
 *
 * @see nsIPrefService
 * 
 * @status FROZEN
 */
public interface nsIPrefBranch extends nsISupports {

  String NS_IPREFBRANCH_IID =
    "{56c35506-f14b-11d3-99d3-ddbfac2ccf65}";

  /**
   * Values describing the basic preference types.
   *
   * @see getPrefType
   */
  int PREF_INVALID = 0;

  int PREF_STRING = 32;

  int PREF_INT = 64;

  int PREF_BOOL = 128;

  /**
   * Called to get the root on which this branch is based, such as
   * "browser.startup."
   */
  String getRoot();

  /**
   * Called to determine the type of a specific preference.
   *
   * @param aPrefName The preference to get the type of.
   *
   * @return long     A value representing the type of the preference. This
   *                  value will be PREF_STRING, PREF_INT, or PREF_BOOL.
   */
  int getPrefType(String aPrefName);

  /**
   * Called to get the state of an individual boolean preference.
   *
   * @param aPrefName The boolean preference to get the state of.
   *
   * @return boolean  The value of the requested boolean preference.
   *
   * @see setBoolPref
   */
  boolean getBoolPref(String aPrefName);

  /**
   * Called to set the state of an individual boolean preference.
   *
   * @param aPrefName The boolean preference to set the state of.
   * @param aValue    The boolean value to set the preference to.
   *
   * @return NS_OK The value was successfully set.
   * @return Other The value was not set or is the wrong type.
   *
   * @see getBoolPref
   */
  void setBoolPref(String aPrefName, int aValue);

  /**
   * Called to get the state of an individual string preference.
   *
   * @param aPrefName The string preference to retrieve.
   *
   * @return string   The value of the requested string preference.
   *
   * @see setCharPref
   */
  String getCharPref(String aPrefName);

  /**
   * Called to set the state of an individual string preference.
   *
   * @param aPrefName The string preference to set.
   * @param aValue    The string value to set the preference to.
   *
   * @return NS_OK The value was successfully set.
   * @return Other The value was not set or is the wrong type.
   *
   * @see getCharPref
   */
  void setCharPref(String aPrefName, String aValue);

  /**
   * Called to get the state of an individual integer preference.
   *
   * @param aPrefName The integer preference to get the value of.
   *
   * @return long     The value of the requested integer preference.
   *
   * @see setIntPref
   */
  int getIntPref(String aPrefName);

  /**
   * Called to set the state of an individual integer preference.
   *
   * @param aPrefName The integer preference to set the value of.
   * @param aValue    The integer value to set the preference to.
   *
   * @return NS_OK The value was successfully set.
   * @return Other The value was not set or is the wrong type.
   *
   * @see getIntPref
   */
  void setIntPref(String aPrefName, int aValue);

  /**
   * Called to get the state of an individual complex preference. A complex
   * preference is a preference which represents an XPCOM object that can not
   * be easily represented using a standard boolean, integer or string value.
   *
   * @param aPrefName The complex preference to get the value of.
   * @param aType     The XPCOM interface that this complex preference
   *                  represents. Interfaces currently supported are:
   *                    - nsILocalFile
   *                    - nsISupportsString (UniChar)
   *                    - nsIPrefLocalizedString (Localized UniChar)
   *                    - nsIFileSpec (deprecated - to be removed eventually)
   * @param aValue    The XPCOM object into which to the complex preference 
   *                  value should be retrieved.
   *
   * @return NS_OK The value was successfully retrieved.
   * @return Other The value does not exist or is the wrong type.
   *
   * @see setComplexValue
   */
  nsISupports getComplexValue(String aPrefName, String aType);

  /**
   * Called to set the state of an individual complex preference. A complex
   * preference is a preference which represents an XPCOM object that can not
   * be easily represented using a standard boolean, integer or string value.
   *
   * @param aPrefName The complex preference to set the value of.
   * @param aType     The XPCOM interface that this complex preference
   *                  represents. Interfaces currently supported are:
   *                    - nsILocalFile
   *                    - nsISupportsString (UniChar)
   *                    - nsIPrefLocalizedString (Localized UniChar)
   *                    - nsIFileSpec (deprecated - to be removed eventually)
   * @param aValue    The XPCOM object from which to set the complex preference 
   *                  value.
   *
   * @return NS_OK The value was successfully set.
   * @return Other The value was not set or is the wrong type.
   *
   * @see getComplexValue
   */
  void setComplexValue(String aPrefName, String aType, nsISupports aValue);

  /**
   * Called to clear a user set value from a specific preference. This will, in
   * effect, reset the value to the default value. If no default value exists
   * the preference will cease to exist.
   *
   * @param aPrefName The preference to be cleared.
   *
   * @note
   * This method does nothing if this object is a default branch.
   *
   * @return NS_OK The user preference was successfully cleared.
   * @return Other The preference does not exist or have a user set value.
   */
  void clearUserPref(String aPrefName);

  /**
   * Called to lock a specific preference. Locking a preference will cause the
   * preference service to always return the default value regardless of
   * whether there is a user set value or not.
   *
   * @param aPrefName The preference to be locked.
   *
   * @note
   * This method can be called on either a default or user branch but, in
   * effect, always operates on the default branch.
   *
   * @return NS_OK The preference was successfully locked.
   * @return Other The preference does not exist or an error occurred.
   *
   * @see unlockPref
   */
  void lockPref(String aPrefName);

  /**
   * Called to check if a specific preference has a user value associated to
   * it.
   *
   * @param aPrefName The preference to be tested.
   *
   * @note
   * This method can be called on either a default or user branch but, in
   * effect, always operates on the user branch.
   *
   * @note
   * If a preference was manually set to a value that equals the default value,
   * then the preference no longer has a user set value, i.e. it is
   * considered reset to its default value.
   * In particular, this method will return false for such a preference and
   * the preference will not be saved to a file by nsIPrefService.savePrefFile.
   *
   * @return boolean  true  The preference has a user set value.
   *                  false The preference only has a default value.
   */
  boolean prefHasUserValue(String aPrefName);

  /**
   * Called to check if a specific preference is locked. If a preference is
   * locked calling its Get method will always return the default value.
   *
   * @param aPrefName The preference to be tested.
   *
   * @note
   * This method can be called on either a default or user branch but, in
   * effect, always operates on the default branch.
   *
   * @return boolean  true  The preference is locked.
   *                  false The preference is not locked.
   *
   * @see lockPref
   * @see unlockPref
   */
  boolean prefIsLocked(String aPrefName);

  /**
   * Called to unlock a specific preference. Unlocking a previously locked 
   * preference allows the preference service to once again return the user set
   * value of the preference.
   *
   * @param aPrefName The preference to be unlocked.
   *
   * @note
   * This method can be called on either a default or user branch but, in
   * effect, always operates on the default branch.
   *
   * @return NS_OK The preference was successfully unlocked.
   * @return Other The preference does not exist or an error occurred.
   *
   * @see lockPref
   */
  void unlockPref(String aPrefName);

  /**
   * Called to remove all of the preferences referenced by this branch.
   *
   * @param aStartingAt The point on the branch at which to start the deleting
   *                    preferences. Pass in "" to remove all preferences
   *                    referenced by this branch.
   *
   * @note
   * This method can be called on either a default or user branch but, in
   * effect, always operates on both.
   *
   * @return NS_OK The preference(s) were successfully removed.
   * @return Other The preference(s) do not exist or an error occurred.
   */
  void deleteBranch(String aStartingAt);

  /**
   * Returns an array of strings representing the child preferences of the
   * root of this branch.
   * 
   * @param aStartingAt The point on the branch at which to start enumerating
   *                    the child preferences. Pass in "" to enumerate all
   *                    preferences referenced by this branch.
   * @param aCount      Receives the number of elements in the array.
   * @param aChildArray Receives the array of child preferences.
   *
   * @note
   * This method can be called on either a default or user branch but, in
   * effect, always operates on both.
   *
   * @return NS_OK The preference list was successfully retrieved.
   * @return Other The preference(s) do not exist or an error occurred.
   */
  String[] getChildList(String aStartingAt, long[] aCount);

  /**
   * Called to reset all of the preferences referenced by this branch to their
   * default values.
   *
   * @param aStartingAt The point on the branch at which to start the resetting
   *                    preferences to their default values. Pass in "" to
   *                    reset all preferences referenced by this branch.
   *
   * @note
   * This method can be called on either a default or user branch but, in
   * effect, always operates on the user branch.
   *
   * @return NS_OK The preference(s) were successfully reset.
   * @return Other The preference(s) do not exist or an error occurred.
   */
  void resetBranch(String aStartingAt);

}