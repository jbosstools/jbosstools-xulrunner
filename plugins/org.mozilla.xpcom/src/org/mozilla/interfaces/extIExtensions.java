/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/exthelper/extIApplication.idl
 */

package org.mozilla.interfaces;

/**
 * Interface representing a list of all installed extensions
 */
public interface extIExtensions extends nsISupports {

  String EXTIEXTENSIONS_IID =
    "{de281930-aa5a-11db-abbd-0800200c9a66}";

  /**
   * Array of extIExtension listing all extensions in the application.
   */
  nsIVariant getAll();

  /**
   * Determines if an extension exists with the given id.
   * @param   aId
   *          The id of an extension
   * @returns true if an extension exists with the given id,
   *          false otherwise.
   */
  boolean has(String aId);

  /**
   * Gets a extIExtension object for an extension.
   * @param   aId
   *          The id of an extension
   * @returns An extension object or null if no extension exists
   *          with the given id.
   */
  extIExtension get(String aId);

}