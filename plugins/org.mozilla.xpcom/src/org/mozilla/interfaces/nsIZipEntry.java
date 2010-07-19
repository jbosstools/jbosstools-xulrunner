/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/libjar/nsIZipReader.idl
 */

package org.mozilla.interfaces;

public interface nsIZipEntry extends nsISupports {

  String NS_IZIPENTRY_IID =
    "{e1c028bc-c478-11da-95a8-00e08161165f}";

  /**
     * The type of compression used for the item.  The possible values and
     * their meanings are defined in the zip file specification at
     * http://www.pkware.com/business_and_developers/developer/appnote/
     */
  int getCompression();

  /**
     * The compressed size of the data in the item.
     */
  long getSize();

  /**
     * The uncompressed size of the data in the item.
     */
  long getRealSize();

  /**
     * The CRC-32 hash of the file in the entry.
     */
  long getCRC32();

  /**
     * True if the name of the entry ends with '/' and false otherwise.
     */
  boolean getIsDirectory();

  /**
     * The time at which this item was last modified.
     */
  double getLastModifiedTime();

  /**
     * Use this attribute to determine whether this item is an actual zip entry
     * or is one synthesized for part of a real entry's path.  A synthesized
     * entry represents a directory within the zip file which has no
     * corresponding entry within the zip file.  For example, the entry for the
     * directory foo/ in a zip containing exactly one entry for foo/bar.txt
     * is synthetic.  If the zip file contains an actual entry for a directory,
     * this attribute will be false for the nsIZipEntry for that directory.
     * It is impossible for a file to be synthetic.
     */
  boolean getIsSynthetic();

}