/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIDirectoryEnumerator.idl
 */

package org.mozilla.interfaces;

/**
 * This interface provides a means for enumerating the contents of a directory.
 * It is similar to nsISimpleEnumerator except the retrieved entries are QI'ed 
 * to nsIFile, and there is a mechanism for closing the directory when the 
 * enumeration is complete.
 * 
 * @status UNDER_REVIEW
 */
public interface nsIDirectoryEnumerator extends nsISupports {

  String NS_IDIRECTORYENUMERATOR_IID =
    "{31f7f4ae-6916-4f2d-a81e-926a4e3022ee}";

  /**
   * Retrieves the next file in the sequence. The "nextFile" element is the 
   * first element upon the first call. This attribute is null if there is no 
   * next element.
   */
  nsIFile getNextFile();

  /**
   * Closes the directory being enumerated, releasing the system resource.
   * @throws NS_OK if the call succeeded and the directory was closed.
   *         NS_ERROR_FAILURE if the directory close failed. 
   *         It is safe to call this function many times. 
   */
  void close();

}