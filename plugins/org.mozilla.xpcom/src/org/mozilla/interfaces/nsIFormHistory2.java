/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/satchel/public/nsIFormHistory.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIFormHistory object is a service which holds a set of name/value
 * pairs.  The names correspond to form field names, and the values correspond
 * to values the user has submitted.  So, several values may exist for a single
 * name.
 *
 * Note: this interface provides no means to access stored values.
 * Stored values are used by the FormFillController to generate
 * autocomplete matches.
 */
public interface nsIFormHistory2 extends nsISupports {

  String NS_IFORMHISTORY2_IID =
    "{5d7d84d1-9798-4016-bf61-a32acf09b29d}";

  /**
   * Returns true if the form history has any entries.
   */
  boolean getHasEntries();

  /**
   * Adds a name and value pair to the form history.
   */
  void addEntry(String name, String value);

  /**
   * Removes a name and value pair from the form history.
   */
  void removeEntry(String name, String value);

  /**
   * Removes all entries that are paired with a name.
   */
  void removeEntriesForName(String name);

  /**
   * Removes all entries in the entire form history.
   */
  void removeAllEntries();

  /**
   * Returns true if there is no entry that is paired with a name.
   */
  boolean nameExists(String name);

  /**
   * Gets whether a name and value pair exists in the form history.
   */
  boolean entryExists(String name, String value);

  /**
   * Removes entries that were created between the specified times.
   *
   * @param aBeginTime
   *        The beginning of the timeframe, in microseconds
   * @param aEndTime
   *        The end of the timeframe, in microseconds
   */
  void removeEntriesByTimeframe(long aBeginTime, long aEndTime);

  /**
   * Returns the underlying DB connection the form history module is using.
   */
  mozIStorageConnection getDBConnection();

}