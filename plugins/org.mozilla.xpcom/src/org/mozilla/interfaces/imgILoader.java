/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/libpr0n/public/imgILoader.idl
 */

package org.mozilla.interfaces;

/**
 * imgILoader interface
 *
 * @author Stuart Parmenter <pavlov@netscape.com>
 * @version 0.3
 * @see imagelib2
 */
public interface imgILoader extends nsISupports {

  String IMGILOADER_IID =
    "{d2f50c69-1064-4ce3-a92d-01dc5f5b4842}";

  /**
   * Checks if a decoder for the an image with the given mime type is available
   * @param mimeType The type to find a decoder for
   * @return true if a decoder is available, false otherwise
   */
  boolean supportImageWithMimeType(String mimeType);

}