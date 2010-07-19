/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/mime/public/nsIMIMEInfo.idl
 */

package org.mozilla.interfaces;

/**
 * nsIMIMEInfo extends nsIHandlerInfo with a bunch of information specific to
 * MIME content-types. There is a one-to-many relationship between MIME types
 * and file extensions. This means that a MIMEInfo object may have multiple
 * file extensions associated with it.  However, the reverse is not true.
 *
 * MIMEInfo objects are generally retrieved from the MIME Service
 * @see nsIMIMEService
 */
public interface nsIMIMEInfo extends nsIHandlerInfo {

  String NS_IMIMEINFO_IID =
    "{1c21acef-c7a1-40c6-9d40-a20480ee53a1}";

  /**
     * Gives you an array of file types associated with this type.
     *
     * @return Number of elements in the array.
     * @return Array of extensions.
     */
  nsIUTF8StringEnumerator getFileExtensions();

  /**
     * Set File Extensions. Input is a comma delimited list of extensions.
     */
  void setFileExtensions(String aExtensions);

  /**
     * Returns whether or not the given extension is
     * associated with this MIME info.
     *
     * @return TRUE if the association exists. 
     */
  boolean extensionExists(String aExtension);

  /**
     * Append a given extension to the set of extensions
     */
  void appendExtension(String aExtension);

  /**
     * Returns the first extension association in
     * the internal set of extensions.
     *
     * @return The first extension.
     */
  String getPrimaryExtension();

  /**
     * Returns the first extension association in
     * the internal set of extensions.
     *
     * @return The first extension.
     */
  void setPrimaryExtension(String aPrimaryExtension);

  /**
     * The MIME type of this MIMEInfo.
     * 
     * @return String representing the MIME type.
     * 
     * @deprecated  use nsIHandlerInfo::type instead.
     */
  String getMIMEType();

  /**
     * Returns whether or not these two nsIMIMEInfos are logically
     * equivalent.
     *
     * @returns PR_TRUE if the two are considered equal
     */
  boolean _equals(nsIMIMEInfo aMIMEInfo);

  /** 
     * Returns a list of nsILocalHandlerApp objects containing
     * handlers associated with this mimeinfo. Implemented per 
     * platform using information in this object to generate the
     * best list. Typically used for an "open with" style user 
     * option.
     * 
     * @return nsIArray of nsILocalHandlerApp
     */
  nsIArray getPossibleLocalHandlers();

  /**
     * Launches the application with the specified file, in a way that
     * depends on the value of preferredAction. preferredAction must be
     * useHelperApp or useSystemDefault.
     *
     * @param aFile The file to launch this application with.
     *
     * @throw NS_ERROR_INVALID_ARG if action is not valid for this function.
     * Other exceptions may be thrown.
     */
  void launchWithFile(nsIFile aFile);

}