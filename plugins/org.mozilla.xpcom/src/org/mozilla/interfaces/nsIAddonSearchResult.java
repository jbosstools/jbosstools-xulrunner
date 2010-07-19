/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/mozapps/extensions/public/nsIAddonRepository.idl
 */

package org.mozilla.interfaces;

public interface nsIAddonSearchResult extends nsISupports {

  String NS_IADDONSEARCHRESULT_IID =
    "{a549a714-2ada-4bb9-8a47-be26e73d49a5}";

  /**
   * The ID of the add-on
   */
  String getId();

  /**
   * The name of the add-on
   */
  String getName();

  /**
   * The version of the add-on
   */
  String getVersion();

  /**
   * A short summary of the add-on
   */
  String getSummary();

  /**
   * The full description of the add-on
   */
  String getDescription();

  /**
   * The rating of the add-on, 0-5 or -1 if unrated.
   */
  int getRating();

  /**
   * The url of the add-ons icon or empty if there is no icon.
   */
  String getIconURL();

  /**
   * The url of a thumbnail for the add-on
   */
  String getThumbnailURL();

  /**
   * The homepage for the add-on
   */
  String getHomepageURL();

  /**
   * A EULA that must be accepted before install.
   */
  String getEula();

  /**
   * The add-on type (see nsIUpdateItem).
   */
  long getType();

  /**
   * The url of the xpi for this add-on
   */
  String getXpiURL();

  /**
   * The hash for the xpi.
   */
  String getXpiHash();

}