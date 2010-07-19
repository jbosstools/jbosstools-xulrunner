/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsILocalFileWin.idl
 */

package org.mozilla.interfaces;

public interface nsILocalFileWin extends nsILocalFile {

  String NS_ILOCALFILEWIN_IID =
    "{def24611-88a1-2cac-74fd-4b0b12bcaed5}";

  /**
    * getVersionInfoValue
    *
    * Retrieve a metadata field from the file's VERSIONINFO block.
    * Throws NS_ERROR_FAILURE if no value is found, or the value is empty.
    *
    * @param   aField         The field to look up.
    *
    */
  String getVersionInfoField(String aField);

  /**
     * The canonical path of the file, which avoids short/long
     * pathname inconsistencies. The nsILocalFile persistent
     * descriptor is not guaranteed to be canonicalized (it may
     * persist either the long or the short path name). The format of
     * the canonical path will vary with the underlying file system:
     * it will typically be the short pathname on filesystems that
     * support both short and long path forms.
     */
  String getCanonicalPath();

  /**
     * Windows specific file attributes.
     *
     * WFA_SEARCH_INDEXED: Generally the default on files in Windows except
     * those created in temp locations. Valid on XP and up. When set the
     * file or directory is marked to be indexed by desktop search services.
     */
  long WFA_SEARCH_INDEXED = 1L;

  /**
     * fileAttributesWin
     *
     * Set or get windows specific file attributes.
     * 
     * Throws NS_ERROR_FILE_INVALID_PATH for an invalid file.
     * Throws NS_ERROR_FAILURE if the set or get fails.
     */
  long getFileAttributesWin();

  /**
     * fileAttributesWin
     *
     * Set or get windows specific file attributes.
     * 
     * Throws NS_ERROR_FILE_INVALID_PATH for an invalid file.
     * Throws NS_ERROR_FAILURE if the set or get fails.
     */
  void setFileAttributesWin(long aFileAttributesWin);

}