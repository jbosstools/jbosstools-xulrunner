/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/exthelper/extIApplication.idl
 */

package org.mozilla.interfaces;

/**
 * Interface representing an extension
 */
public interface extIExtension extends nsISupports {

  String EXTIEXTENSION_IID =
    "{10cee02c-f6e0-4d61-ab27-c16572b18c46}";

  /**
   * The id of the extension.
   */
  String getId();

  /**
   * The name of the extension.
   */
  String getName();

  /**
   * Check if the extension is currently enabled, or not.
   */
  boolean getEnabled();

  /**
   * The version number of the extension.
   */
  String getVersion();

  /**
   * Indicates whether this is the extension's first run after install
   */
  boolean getFirstRun();

  /**
   * The preferences object for the extension. Defaults to the
   * "extensions.<extensionid>." branch.
   */
  extIPreferenceBranch getPrefs();

  /**
   * The storage object for the extension.
   */
  extISessionStorage getStorage();

  /**
   * The events object for the extension.
   * supports: "uninstall"
   */
  extIEvents getEvents();

}