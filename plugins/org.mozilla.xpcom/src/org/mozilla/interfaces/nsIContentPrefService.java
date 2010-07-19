/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/contentprefs/public/nsIContentPrefService.idl
 */

package org.mozilla.interfaces;

public interface nsIContentPrefService extends nsISupports {

  String NS_ICONTENTPREFSERVICE_IID =
    "{ea7d29eb-7095-476e-b5d9-13263f3ae243}";

  /**
   * Get a pref.
   *
   * Besides the regular string, integer, boolean, etc. values, this method
   * may return null (nsIDataType::VTYPE_EMPTY), which means the pref is set
   * to NULL in the database, as well as undefined (nsIDataType::VTYPE_VOID),
   * which means there is no record for this pref in the database.
   *
   * @param    aURI        the URI for which to get the pref, or null to get
   *                       the global pref (applies to all URIs)
   * @param    aName       the name of the pref to get
   *
   * @returns  the value of the pref
   */
  nsIVariant getPref(nsIURI aURI, String aName);

  /**
   * Set a pref.
   *
   * @param    aURI        the URI for which to set the pref, or null to set
   *                       the global pref (applies to all URIs)
   * @param    aName       the name of the pref to set
   * @param    aValue      the new value of the pref
   */
  void setPref(nsIURI aURI, String aName, nsIVariant aValue);

  /**
   * Check whether or not a pref exists.
   *
   * @param    aURI        the URI for which to check for the pref
   * @param    aName       the name of the pref to check for
   */
  boolean hasPref(nsIURI aURI, String aName);

  /**
   * Remove a pref.
   *
   * @param    aURI        the URI for which to remove the pref
   * @param    aName       the name of the pref to remove
   */
  void removePref(nsIURI aURI, String aName);

  /**
   * Remove all grouped prefs.  Useful for removing references to the sites
   * the user has visited when the user clears their private data.
   */
  void removeGroupedPrefs();

  /**
   * Remove all prefs with the given name.
   *
   * @param    aName        the setting name for which to remove prefs
   */
  void removePrefsByName(String aName);

  /**
   * Get the prefs that apply to the given URI.
   *
   * @param    aURI        the URI for which to retrieve prefs
   * 
   * @returns  a property bag of prefs
   */
  nsIPropertyBag2 getPrefs(nsIURI aURI);

  /**
   * Get the prefs with the given name.
   *
   * @param    aName        the setting name for which to retrieve prefs
   * 
   * @returns  a property bag of prefs
   */
  nsIPropertyBag2 getPrefsByName(String aName);

  /**
   * Add an observer.
   * 
   * @param    aName       the setting to observe, or null to add
   *                       a generic observer that observes all settings
   * @param    aObserver   the observer to add
   */
  void addObserver(String aName, nsIContentPrefObserver aObserver);

  /**
   * Remove an observer.
   *
   * @param    aName       the setting being observed, or null to remove
   *                       a generic observer that observes all settings
   * @param    aObserver   the observer to remove
   */
  void removeObserver(String aName, nsIContentPrefObserver aObserver);

  /**
   * The component that the service uses to determine the groups to which
   * URIs belong.  By default this is the "hostname grouper", which groups
   * URIs by full hostname (a.k.a. site).
   */
  nsIContentURIGrouper getGrouper();

  /**
   * The database connection to the content preferences database.
   * Useful for accessing and manipulating preferences in ways that are caller-
   * specific or for which there is not yet a generic method, although generic
   * functionality useful to multiple callers should generally be added to this
   * unfrozen interface.  Also useful for testing the database creation
   * and migration code.
   */
  mozIStorageConnection getDBConnection();

}