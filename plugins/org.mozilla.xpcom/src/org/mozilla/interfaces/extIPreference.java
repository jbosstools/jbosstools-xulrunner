/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/exthelper/extIApplication.idl
 */

package org.mozilla.interfaces;

public interface extIPreference extends nsISupports {

  String EXTIPREFERENCE_IID =
    "{2c7462e2-72c2-4473-9007-0e6ae71e23ca}";

  /**
 * Interface for accessing a single preference. The data is not cached.
 * All reads access the current state of the preference.
 */
/**
   * The name of the preference.
   */
  String getName();

  /**
   * A string representing the type of preference (String, Boolean, or Number).
   */
  String getType();

  /**
   * Get/Set the value of the preference.
   */
  nsIVariant getValue();

  /**
   * Get/Set the value of the preference.
   */
  void setValue(nsIVariant aValue);

  /**
   * Get the locked state of the preference. Set to a boolean value to (un)lock it.
   */
  boolean getLocked();

  /**
   * Get the locked state of the preference. Set to a boolean value to (un)lock it.
   */
  void setLocked(boolean aLocked);

  /**
   * Check if a preference has been modified by the user, or not.
   */
  boolean getModified();

  /**
   * The preference branch that contains this preference.
   */
  extIPreferenceBranch getBranch();

  /**
   * The events object for this preference.
   * supports: "change"
   */
  extIEvents getEvents();

  /**
   * Resets a preference back to its default values.
   */
  void reset();

}