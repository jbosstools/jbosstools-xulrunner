/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/mozapps/extensions/public/nsIExtensionManager.idl
 */

package org.mozilla.interfaces;

/**
 * Interface representing a location where extensions, themes etc are
 * installed.
 */
public interface nsIInstallLocation extends nsISupports {

  String NS_IINSTALLLOCATION_IID =
    "{32a74707-ec7c-af19-f4d8-d0cd8cb6a948}";

  /**
   * The string identifier of this Install Location
   */
  String getName();

  /**
   * An enumeration of nsIFiles for:
   * - locations that contain items
   * - potential dropped-in XPIs
   * Note: This enumeration resolves Text Links to the directories they
   *       refer to.
   */
  nsIDirectoryEnumerator getItemLocations();

  /**
   * The file system location where items live. Items can be dropped in
   * at this location. Can be null for Install Locations that don't have
   * a file system presence.
   * Note: This is a clone of the actual location which the caller can
   *       modify freely.
   */
  nsIFile getLocation();

  /**
   * Whether or not this Install Location is on an area of the file system
   * that could be restricted on a restricted-access account, regardless
   * of whether or not the location is restricted with the current user
   * privileges.
   */
  boolean getRestricted();

  /**
   * Whether or not the user can write to the Install Location with the
   * current access privileges. This is different from restricted because
   * it's not whether or not the location *might* be restricted, it's
   * whether or not it actually *is* restricted right now.
   */
  boolean getCanAccess();

  /**
   * Constants representing priority of some default Install Locations.
   * XXXben - priority ranking of user-level items vs. global-level items
   *          here is debatable. Should app-system-global trump
   *          xre-system-user?
   * You should not use the exact values here, you should offset from
   * these values each time you create a new Install Location. Offsetting
   * can be brittle but you should know what Install Locations are being
   * defined for your own application.
   */
  long PRIORITY_APP_PROFILE = 0L;

  long PRIORITY_APP_SYSTEM_USER = 10L;

  long PRIORITY_XRE_SYSTEM_USER = 100L;

  long PRIORITY_APP_SYSTEM_GLOBAL = 1000L;

  long PRIORITY_XRE_SYSTEM_GLOBAL = 10000L;

  /**
   * The priority level of this Install Location in loading.
   */
  int getPriority();

  /**
   * Gets the directory that contains an item.
   * @param   id
   *          The GUID of the item.
   * @returns The location of the item.
   */
  nsIFile getItemLocation(String id);

  /**
   * Retrieves the GUID for an item at the specified location.
   * @param   file
   *          The location where an item might live.
   * @returns The ID for an item that might live at the location specified.
   *
   * N.B. This function makes no promises about whether or not this path is
   *      actually maintained by this Install Location.
   */
  String getIDForLocation(nsIFile file);

  /**
   * Gets a nsIFile object for a file within an item's directory structure.
   * @param   id
   *          The GUID of the item.
   * @param   path
   *          The path to the file beneath an Extension's directory
   * @returns A file object at the requested location. The file does not
   *          necessarily have to exist.
   */
  nsIFile getItemFile(String id, String path);

  /**
   * Determines whether or not an item's resources are managed by the Extension
   * System or by some other user or process. For example, items linked to by
   * text links are managed by the user, and items linked to from Registry
   * Install Locations are usually managed by other applications or installers.
   *
   * @param   id
   *          The GUID of the item.
   * @returns true if the item's resources are managed independently of the
   *          Extension System, false otherwise.
   */
  boolean itemIsManagedIndependently(String id);

  /**
   * Stages the specified file by copying it to some location from where it
   * can be retrieved later to complete installation.
   *
   * @param   file
   *          The file to stage
   * @param   id
   *          The GUID of the item the file represents
   * @returns The staged file
   */
  nsIFile stageFile(nsIFile file, String id);

  /**
   * Returns the most recently staged package (e.g. the last XPI or JAR in a
   * directory) for an item and removes items that do not qualify.
   *
   * @param   id
   *          The ID of the staged package
   * @returns an nsIFile if the package exists otherwise null.
   */
  nsIFile getStageFile(String id);

  /**
   * Removes a file from the stage. This cleans up the stage if there is nothing
   * else left after the remove operation.
   *
   * @param   file
   *          The file to remove.
   */
  void removeFile(nsIFile file);

}