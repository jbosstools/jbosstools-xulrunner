/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/streamconv/public/nsIDirIndex.idl
 */

package org.mozilla.interfaces;

/** A class holding information about a directory index.
 * These have no reference back to their original source -
 * changing these attributes won't affect the directory
 */
public interface nsIDirIndex extends nsISupports {

  String NS_IDIRINDEX_IID =
    "{23bbabd0-1dd2-11b2-86b7-aad68ae7d7e0}";

  /**
     * Entry's type is unknown
     */
  long TYPE_UNKNOWN = 0L;

  /**
     * Entry is a directory
     */
  long TYPE_DIRECTORY = 1L;

  /**
     * Entry is a file
     */
  long TYPE_FILE = 2L;

  /**
     * Entry is a symlink
     */
  long TYPE_SYMLINK = 3L;

  /**
     * The type of the entry - one of the constants above
     */
  long getType();

  /**
     * The type of the entry - one of the constants above
     */
  void setType(long aType);

  /**
     * The content type - may be null if it is unknown.
     * Unspecified for directories
     */
  String getContentType();

  /**
     * The content type - may be null if it is unknown.
     * Unspecified for directories
     */
  void setContentType(String aContentType);

  /**
     * The fully qualified filename, expressed as a uri
     *
     * This is encoded with the encoding specified in
     * the nsIDirIndexParser, and is also escaped.
     */
  String getLocation();

  /**
     * The fully qualified filename, expressed as a uri
     *
     * This is encoded with the encoding specified in
     * the nsIDirIndexParser, and is also escaped.
     */
  void setLocation(String aLocation);

  /**
     * A description for the filename, which should be
     * displayed by a viewer
     */
  String getDescription();

  /**
     * A description for the filename, which should be
     * displayed by a viewer
     */
  void setDescription(String aDescription);

  /**
     * File size, with -1 meaning "unknown"
     */
  long getSize();

  /**
     * File size, with -1 meaning "unknown"
     */
  void setSize(long aSize);

  /**
     * Last-modified time in seconds-since-epoch.
     * -1 means unknown - this is valid, because there were no
     * ftp servers in 1969
     */
  double getLastModified();

  /**
     * Last-modified time in seconds-since-epoch.
     * -1 means unknown - this is valid, because there were no
     * ftp servers in 1969
     */
  void setLastModified(double aLastModified);

}