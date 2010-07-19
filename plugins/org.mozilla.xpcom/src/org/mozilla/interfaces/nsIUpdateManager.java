/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/mozapps/update/public/nsIUpdateService.idl
 */

package org.mozilla.interfaces;

/**
 * An interface describing a global application service that maintains a list
 * of updates previously performed as well as the current active update.
 */
public interface nsIUpdateManager extends nsISupports {

  String NS_IUPDATEMANAGER_IID =
    "{fede66a9-9f96-4507-a22a-775ee885577e}";

  /**
   * Gets the update at the specified index
   * @param   index
   *          The index within the updates array
   * @returns The nsIUpdate object at the specified index
   */
  nsIUpdate getUpdateAt(int index);

  /**
   * Gets the total number of updates in the history list.
   */
  int getUpdateCount();

  /**
   * The active (current) update. The active update is not in the history list.
   */
  nsIUpdate getActiveUpdate();

  /**
   * The active (current) update. The active update is not in the history list.
   */
  void setActiveUpdate(nsIUpdate aActiveUpdate);

  /**
   * Saves all updates to disk.
   */
  void saveUpdates();

}