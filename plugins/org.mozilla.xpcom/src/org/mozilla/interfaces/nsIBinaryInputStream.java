/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIBinaryInputStream.idl
 */

package org.mozilla.interfaces;

/**
 * This interface allows consumption of primitive data types from a "binary
 * stream" containing untagged, big-endian binary data, i.e. as produced by an
 * implementation of nsIBinaryOutputStream.  This might be used, for example,
 * to implement network protocols or to read from architecture-neutral disk
 * files, i.e. ones that can be read and written by both big-endian and
 * little-endian platforms.
 *
 * @See nsIBinaryOutputStream
 */
public interface nsIBinaryInputStream extends nsIInputStream {

  String NS_IBINARYINPUTSTREAM_IID =
    "{7b456cb0-8772-11d3-90cf-0040056a906e}";

  void setInputStream(nsIInputStream aInputStream);

  /**
     * Read 8-bits from the stream.
     *
     * @return that byte to be treated as a boolean.
     */
  boolean readBoolean();

  short read8();

  int read16();

  long read32();

  double read64();

  float readFloat();

  double readDouble();

  /**
     * Read an 8-bit pascal style string from the stream.
     * 32-bit length field, followed by length 8-bit chars.
     */
  String readCString();

  /**
     * Read an 16-bit pascal style string from the stream.
     * 32-bit length field, followed by length PRUnichars.
     */
  String readString();

  /**
     * Read an opaque byte array from the stream.
     *
     * @param aLength the number of bytes that must be read.
     *
     * @throws NS_ERROR_FAILURE if it can't read aLength bytes
     */
  String readBytes(long aLength);

  /**
     * Read an opaque byte array from the stream, storing the results
     * as an array of PRUint8s.
     *
     * @param aLength the number of bytes that must be read.
     *
     * @throws NS_ERROR_FAILURE if it can't read aLength bytes
     */
  byte[] readByteArray(long aLength);

}