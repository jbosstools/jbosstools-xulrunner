/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/mozapps/update/public/nsIUpdateService.idl
 */

package org.mozilla.interfaces;

/**
 * An interface that describes an object representing an available update to
 * the current application - this update may have several available patches
 * from which one must be selected to download and install, for example we
 * might select a binary difference patch first and attempt to apply that,
 * then if the application process fails fall back to downloading a complete
 * file-replace patch. This object also contains information about the update
 * that the front end and other application services can use to learn more
 * about what is going on.
 */
public interface nsIUpdate extends nsISupports {

  String NS_IUPDATE_IID =
    "{9d6a388b-2e0c-4d0e-9a60-5c9739a7ada5}";

  /**
   * The type of update:
   *   "major"  A major new version of the Application
   *   "minor"  A minor update to the Application (e.g. security update)
   */
  String getType();

  /**
   * The type of update:
   *   "major"  A major new version of the Application
   *   "minor"  A minor update to the Application (e.g. security update)
   */
  void setType(String aType);

  /**
   * The name of the update, or "<Application Name> <Update Version>"
   */
  String getName();

  /**
   * The name of the update, or "<Application Name> <Update Version>"
   */
  void setName(String aName);

  /**
   * The Application version of this update.
   */
  String getVersion();

  /**
   * The Application version of this update.
   */
  void setVersion(String aVersion);

  /**
   * The Toolkit version of this update.
   */
  String getPlatformVersion();

  /**
   * The Toolkit version of this update.
   */
  void setPlatformVersion(String aPlatformVersion);

  /**
   * The Addon version of this update. Used by the Extension System to track
   * compatibility of installed addons with this update.
   */
  String getExtensionVersion();

  /**
   * The Addon version of this update. Used by the Extension System to track
   * compatibility of installed addons with this update.
   */
  void setExtensionVersion(String aExtensionVersion);

  /**
   * The Build ID of this update. Used to determine a particular build, down
   * to the hour, minute and second of its creation. This allows the system
   * to differentiate between several nightly builds with the same |version|
   * for example.
   */
  String getBuildID();

  /**
   * The Build ID of this update. Used to determine a particular build, down
   * to the hour, minute and second of its creation. This allows the system
   * to differentiate between several nightly builds with the same |version|
   * for example.
   */
  void setBuildID(String aBuildID);

  /**
   * The URL to a page which offers details about the content of this
   * update. Ideally, this page is not the release notes but some other page
   * that summarizes the differences between this update and the previous,
   * which also links to the release notes.
   */
  String getDetailsURL();

  /**
   * The URL to a page which offers details about the content of this
   * update. Ideally, this page is not the release notes but some other page
   * that summarizes the differences between this update and the previous,
   * which also links to the release notes.
   */
  void setDetailsURL(String aDetailsURL);

  /**
   * The URL to a HTML fragment that contains a license for this update. If
   * this is specified, the user is shown the license file after they choose
   * to install the update and they must agree to it before the download
   * commences.
   */
  String getLicenseURL();

  /**
   * The URL to a HTML fragment that contains a license for this update. If
   * this is specified, the user is shown the license file after they choose
   * to install the update and they must agree to it before the download
   * commences.
   */
  void setLicenseURL(String aLicenseURL);

  /**
   * The URL to the Update Service that supplied this update.
   */
  String getServiceURL();

  /**
   * The URL to the Update Service that supplied this update.
   */
  void setServiceURL(String aServiceURL);

  /**
   * The channel used to retrieve this update from the Update Service.
   */
  String getChannel();

  /**
   * The channel used to retrieve this update from the Update Service.
   */
  void setChannel(String aChannel);

  /**
   * Whether or not the update being downloaded is a complete replacement of
   * the user's existing installation or a patch representing the difference
   * between the new version and the previous version.
   */
  boolean getIsCompleteUpdate();

  /**
   * Whether or not the update being downloaded is a complete replacement of
   * the user's existing installation or a patch representing the difference
   * between the new version and the previous version.
   */
  void setIsCompleteUpdate(boolean aIsCompleteUpdate);

  /**
   * Whether or not the update is a security update or not. If this is true,
   * then we present more serious sounding user interface messages to the
   * user.
   */
  boolean getIsSecurityUpdate();

  /**
   * Whether or not the update is a security update or not. If this is true,
   * then we present more serious sounding user interface messages to the
   * user.
   */
  void setIsSecurityUpdate(boolean aIsSecurityUpdate);

  /**
   * When the update was installed.
   */
  long getInstallDate();

  /**
   * When the update was installed.
   */
  void setInstallDate(long aInstallDate);

  /**
   * A message associated with this update, if any.
   */
  String getStatusText();

  /**
   * A message associated with this update, if any.
   */
  void setStatusText(String aStatusText);

  /**
   * The currently selected patch for this update.
   */
  nsIUpdatePatch getSelectedPatch();

  /**
   * The state of the selected patch:
   *   "downloading"       The update is being downloaded.
   *   "pending"           The update is ready to be applied.
   *   "applying"          The update is being applied.
   *   "succeeded"         The update was successfully applied.
   *   "download-failed"   The update failed to be downloaded.
   *   "failed"            The update failed to be applied.
   */
  String getState();

  /**
   * The state of the selected patch:
   *   "downloading"       The update is being downloaded.
   *   "pending"           The update is ready to be applied.
   *   "applying"          The update is being applied.
   *   "succeeded"         The update was successfully applied.
   *   "download-failed"   The update failed to be downloaded.
   *   "failed"            The update failed to be applied.
   */
  void setState(String aState);

  /**
   * A numeric error code that conveys additional information about the state
   * of a failed update.  If the update is not in the "failed" state, then this
   * value is zero.
   *
   * TODO: Define typical error codes (for now, see updater/errors.h)
   */
  int getErrorCode();

  /**
   * A numeric error code that conveys additional information about the state
   * of a failed update.  If the update is not in the "failed" state, then this
   * value is zero.
   *
   * TODO: Define typical error codes (for now, see updater/errors.h)
   */
  void setErrorCode(int aErrorCode);

  /**
   * The number of patches supplied by this update.
   */
  long getPatchCount();

  /**
   * Retrieves a patch.
   * @param   index
   *          The index of the patch to retrieve.
   * @returns The nsIUpdatePatch at the specified index.
   */
  nsIUpdatePatch getPatchAt(long index);

  /**
   * Serializes this update object into a DOM Element
   * @param   updates
   *          The document to serialize into
   * @returns The DOM Element created by the serialization process
   */
  nsIDOMElement serialize(nsIDOMDocument updates);

}