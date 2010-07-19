/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIFastLoadFileControl.idl
 */

package org.mozilla.interfaces;

public interface nsIFastLoadReadControl extends nsIFastLoadFileControl {

  String NS_IFASTLOADREADCONTROL_IID =
    "{652ecec6-d40b-45b6-afef-641d6c63a35b}";

  /**
     * Computes the correct checksum of the FastLoad file, independent of the
     * header's checksum value.  The header checksum field is treated as zero
     * when computing the checksum.
     */
  long computeChecksum();

  /**
     * Get the collection of dependency nsIFile instances recorded during the
     * FastLoad file write or read/update process, and checked during the read
     * process to invalidate the FastLoad file if any dependencies are newer.
     */
  nsISimpleEnumerator getDependencies();

}