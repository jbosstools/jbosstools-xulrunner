/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/exthelper/extIApplication.idl
 */

package org.mozilla.interfaces;

public interface extIApplication extends nsISupports {

  String EXTIAPPLICATION_IID =
    "{e53d6610-7468-11dd-ad8b-0800200c9a66}";

  /**
   * The id of the application.
   */
  String getId();

  /**
   * The name of the application.
   */
  String getName();

  /**
   * The version number of the application.
   */
  String getVersion();

  /**
   * The console object for the application.
   */
  extIConsole getConsole();

  /**
   * The extensions object for the application. Contains a list
   * of all installed extensions.
   */
  extIExtensions getExtensions();

  /**
   * The preferences object for the application. Defaults to an empty
   * root branch.
   */
  extIPreferenceBranch getPrefs();

  /**
   * The storage object for the application.
   */
  extISessionStorage getStorage();

  /**
   * The events object for the application.
   * supports: "load", "ready", "quit", "unload"
   */
  extIEvents getEvents();

  /**
   * Quits the application (if nobody objects to quit-application-requested).
   * @returns whether quitting will proceed
   */
  boolean quit();

  /**
   * Restarts the application (if nobody objects to quit-application-requested).
   * @returns whether restarting will proceed
   */
  boolean restart();

}