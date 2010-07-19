/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/mozapps/update/public/nsIUpdateService.idl
 */

package org.mozilla.interfaces;

/**
 * An interface that describes an object representing a patch file that can
 * be downloaded and applied to a version of this application so that it
 * can be updated.
 */
public interface nsIUpdatePatch extends nsISupports {

  String NS_IUPDATEPATCH_IID =
    "{56863a67-bd69-42de-9f40-583e625b457d}";

  /**
   * The type of this patch:
   * "partial"      A binary difference between two application versions
   * "complete"     A complete patch containing all of the replacement files
   *                to update to the new version
   */
  String getType();

  /**
   * The type of this patch:
   * "partial"      A binary difference between two application versions
   * "complete"     A complete patch containing all of the replacement files
   *                to update to the new version
   */
  void setType(String aType);

  /**
   * The URL this patch was being downloaded from
   */
  String getURL();

  /**
   * The URL this patch was being downloaded from
   */
  void setURL(String aURL);

  /**
   * The hash function to use when determining this file's integrity
   */
  String getHashFunction();

  /**
   * The hash function to use when determining this file's integrity
   */
  void setHashFunction(String aHashFunction);

  /**
   * The value of the hash function named above that should be computed if
   * this file is not corrupt.
   */
  String getHashValue();

  /**
   * The value of the hash function named above that should be computed if
   * this file is not corrupt.
   */
  void setHashValue(String aHashValue);

  /**
   * The size of this file, in bytes.
   */
  long getSize();

  /**
   * The size of this file, in bytes.
   */
  void setSize(long aSize);

  /**
   * The state of this patch
   */
  String getState();

  /**
   * The state of this patch
   */
  void setState(String aState);

  /**
   * true if this patch is currently selected as the patch to be downloaded and
   * installed for this update transaction, false if another patch from this
   * update has been selected.
   */
  boolean getSelected();

  /**
   * true if this patch is currently selected as the patch to be downloaded and
   * installed for this update transaction, false if another patch from this
   * update has been selected.
   */
  void setSelected(boolean aSelected);

  /**
   * Serializes this patch object into a DOM Element
   * @param   updates
   *          The document to serialize into
   * @returns The DOM Element created by the serialization process
   */
  nsIDOMElement serialize(nsIDOMDocument updates);

}