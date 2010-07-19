/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/system/nsIBlocklistService.idl
 */

package org.mozilla.interfaces;

public interface nsIBlocklistService extends nsISupports {

  String NS_IBLOCKLISTSERVICE_IID =
    "{8439f9c0-da03-4260-8b21-dc635eed28fb}";

  long STATE_NOT_BLOCKED = 0L;

  long STATE_SOFTBLOCKED = 1L;

  long STATE_BLOCKED = 2L;

  long STATE_OUTDATED = 3L;

  /**
   * Determine if an item is blocklisted
   * @param   id
   *          The ID of the item.
   * @param   version
   *          The item's version.
   * @param   appVersion
   *          The version of the application we are checking in the blocklist.
   *          If this parameter is null, the version of the running application
   *          is used.
   * @param   toolkitVersion
   *          The version of the toolkit we are checking in the blocklist.
   *          If this parameter is null, the version of the running toolkit
   *          is used.
   * @returns true if the item is compatible with this version of the
   *          application or this version of the toolkit, false, otherwise.
   */
  boolean isAddonBlocklisted(String id, String version, String appVersion, String toolkitVersion);

  /**
   * Determine the blocklist state of an add-on
   * @param   id
   *          The ID of the item.
   * @param   version
   *          The item's version.
   * @param   appVersion
   *          The version of the application we are checking in the blocklist.
   *          If this parameter is null, the version of the running application
   *          is used.
   * @param   toolkitVersion
   *          The version of the toolkit we are checking in the blocklist.
   *          If this parameter is null, the version of the running toolkit
   *          is used.
   * @returns The STATE constant.
   */
  long getAddonBlocklistState(String id, String version, String appVersion, String toolkitVersion);

  /**
   * Determine the blocklist state of a plugin
   * @param   plugin
   *          The plugin to get the state for
   * @param   appVersion
   *          The version of the application we are checking in the blocklist.
   *          If this parameter is null, the version of the running application
   *          is used.
   * @param   toolkitVersion
   *          The version of the toolkit we are checking in the blocklist.
   *          If this parameter is null, the version of the running toolkit
   *          is used.
   * @returns The STATE constant.
   */
  long getPluginBlocklistState(nsIPluginTag plugin, String appVersion, String toolkitVersion);

}