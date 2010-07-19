/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/libpr0n/public/imgIEncoder.idl
 */

package org.mozilla.interfaces;

/**
 * imgIEncoder interface
 */
public interface imgIEncoder extends nsIInputStream {

  String IMGIENCODER_IID =
    "{ba3a854b-fb8d-4881-8af9-5849df10e5e5}";

  long INPUT_FORMAT_RGB = 0L;

  long INPUT_FORMAT_RGBA = 1L;

  long INPUT_FORMAT_HOSTARGB = 2L;

  void initFromData(byte[] data, long length, long width, long height, long stride, long inputFormat, String outputOptions);

  void startImageEncode(long width, long height, long inputFormat, String outputOptions);

  void addImageFrame(byte[] data, long length, long width, long height, long stride, long frameFormat, String frameOptions);

  void endImageEncode();

}