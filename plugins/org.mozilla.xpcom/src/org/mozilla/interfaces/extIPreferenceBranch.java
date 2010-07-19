/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/exthelper/extIApplication.idl
 */

package org.mozilla.interfaces;

/**
 * Interface for simplified access to preferences. The interface has a
 * predefined root preference branch. The root branch is set based on the
 * context of the owner. For example, an extension's preferences have a root
 * of "extensions.<extensionid>.", while the application level preferences
 * have an empty root. All preference "aName" parameters used in this interface
 * are relative to the root branch.
 */
public interface extIPreferenceBranch extends nsISupports {

  String EXTIPREFERENCEBRANCH_IID =
    "{ce697d40-aa5a-11db-abbd-0800200c9a66}";

  /**
   * The name of the branch root.
   */
  String getRoot();

  /**
   * Array of extIPreference listing all preferences in this branch.
   */
  nsIVariant getAll();

  /**
   * The events object for the preferences
   * supports: "change"
   */
  extIEvents getEvents();

  /**
   * Check to see if a preference exists.
   * @param   aName
   *          The name of preference
   * @returns true if the preference exists, false if not
   */
  boolean has(String aName);

  /**
   * Gets an object representing a preference
   * @param   aName
   *          The name of preference
   * @returns a preference object, or null if the preference does not exist
   */
  extIPreference get(String aName);

  /**
   * Gets the value of a preference. Returns a default value if
   * the preference does not exist.
   * @param   aName
   *          The name of preference
   * @param   aDefaultValue
   *          The value to return if preference does not exist
   * @returns value of the preference or the given default value if preference
   *          does not exists.
   */
  nsIVariant getValue(String aName, nsIVariant aDefaultValue);

  /**
   * Sets the value of a storage item with the given name.
   * @param   aName
   *          The name of an item
   * @param   aValue
   *          The value to assign to the item
   */
  void setValue(String aName, nsIVariant aValue);

  /**
   * Resets all preferences in a branch back to their default values.
   */
  void reset();

}