/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsPIPlacesDatabase.idl
 */

package org.mozilla.interfaces;

/**
 * This is a private interface used by Places components to get access to the
 * database.  If outside consumers wish to use this, they should only read from
 * the database so they do not break any internal invariants.
 */
public interface nsPIPlacesDatabase extends nsISupports {

  String NS_PIPLACESDATABASE_IID =
    "{8e6d4f8a-4b8e-4026-9fca-517c4494ddb7}";

  /**
   * The database connection used by Places.
   */
  mozIStorageConnection getDBConnection();

  /**
   * Finalizes all Places internal statements, allowing to safely close the
   * database connection.
   */
  void finalizeInternalStatements();

  /**
   * Commits all pending history changes, call this before finalizing
   * statements and closing the database connection to ensure safety for all
   * history data.
   */
  void commitPendingChanges();

}