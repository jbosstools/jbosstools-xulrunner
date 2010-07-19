/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/libpr0n/public/imgILoad.idl
 */

package org.mozilla.interfaces;

/**
 * imgILoad interface
 *
 * @author Stuart Parmenter <pavlov@netscape.com>
 * @version 0.1
 * @see imagelib2
 */
public interface imgILoad extends nsISupports {

  String IMGILOAD_IID =
    "{e6273acc-1dd1-11b2-a08b-824ad1b1628d}";

  /**
   * the image container...
   * @return the image object associated with the request.
   * @attention NEED DOCS
   */
  imgIContainer getImage();

  /**
   * the image container...
   * @return the image object associated with the request.
   * @attention NEED DOCS
   */
  void setImage(imgIContainer aImage);

  boolean getIsMultiPartChannel();

}