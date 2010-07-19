/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/mozapps/extensions/public/nsIExtensionManager.idl
 */

package org.mozilla.interfaces;

public interface nsIUpdateItem extends nsISupports {

  String NS_IUPDATEITEM_IID =
    "{f559f340-5160-420f-abc8-19b251708e7e}";

  /**
 * An item managed by the Extension System. Contains metadata that describes
 * the item.
 * XXXben work in progress, the name of this interface will change after the
 *        update system is complete, probably to nsIAddon
 */
/**
   * The GUID of the item.
   */
  String getId();

  /**
   * The Version of the item, in FVF format.
   */
  String getVersion();

  /**
   * The minimum version of the application that this item works with,
   * in FVF format.
   */
  String getMinAppVersion();

  /**
   * The maximum version of the application that this item works with,
   * in FVF format.
   */
  String getMaxAppVersion();

  /**
   * The name of the Install Location where this item is installed.
   */
  String getInstallLocationKey();

  /**
   * The name of this item.
   */
  String getName();

  /**
   * The URL of the XPI where this item can be downloaded.
   */
  String getXpiURL();

  /**
   * The string Hash for the XPI file. Can be null and if supplied must be in
   * the format of "type:hash" (see the types in nsICryptoHash and
   * nsIXPInstallManager::initManagerWithHashes).
   */
  String getXpiHash();

  /**
   * The URL of the icon that can be shown for this item.
   */
  String getIconURL();

  /**
   * The URL of the update RDF file for this item.
   */
  String getUpdateRDF();

  /**
   * The public key to verify updates for this item. This must be the public
   * part of the key that was used to sign update manifests for this add-on.
   */
  String getUpdateKey();

  long TYPE_APP = 1L;

  long TYPE_EXTENSION = 2L;

  long TYPE_THEME = 4L;

  long TYPE_LOCALE = 8L;

  long TYPE_MULTI_XPI = 32L;

  long TYPE_ADDON = 14L;

  long TYPE_ANY = 255L;

  /**
   * The type of this item.
   */
  int getType();

  /**
   * The target application ID used for checking compatibility for this item.
   *
   * @note Add-ons can specify a targetApplication id of toolkit@mozilla.org in
   *       their install manifest for compatibility with all apps using a
   *       specific release of the toolkit.
   */
  String getTargetAppID();

  /**
   * Initializes this Item object.
   */
  void init(String id, String version, String installLocationKey, String minAppVersion, String maxAppVersion, String name, String downloadURL, String xpiHash, String iconURL, String updateURL, String updateKey, int type, String targetAppID);

  /**
   * Returns a JS Object source representing an nsIUpdateItem.
   */
  String getObjectSource();

}