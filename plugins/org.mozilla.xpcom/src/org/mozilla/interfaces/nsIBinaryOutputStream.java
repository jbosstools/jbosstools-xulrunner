/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIBinaryOutputStream.idl
 */

package org.mozilla.interfaces;

/**
 * This interface allows writing of primitive data types (integers,
 * floating-point values, booleans, etc.) to a stream in a binary, untagged,
 * fixed-endianness format.  This might be used, for example, to implement
 * network protocols or to produce architecture-neutral binary disk files,
 * i.e. ones that can be read and written by both big-endian and little-endian
 * platforms.  Output is written in big-endian order (high-order byte first),
 * as this is traditional network order.
 *
 * @See nsIBinaryInputStream
 */
public interface nsIBinaryOutputStream extends nsIOutputStream {

  String NS_IBINARYOUTPUTSTREAM_IID =
    "{204ee610-8765-11d3-90cf-0040056a906e}";

  void setOutputStream(nsIOutputStream aOutputStream);

  /**
     * Write a boolean as an 8-bit char to the stream.
     */
  void writeBoolean(boolean aBoolean);

  void write8(short aByte);

  void write16(int a16);

  void write32(long a32);

  void write64(double a64);

  void writeFloat(float aFloat);

  void writeDouble(double aDouble);

  /**
     * Write an 8-bit pascal style string to the stream.
     * 32-bit length field, followed by length 8-bit chars.
     */
  void writeStringZ(String aString);

  /**
     * Write a 16-bit pascal style string to the stream.
     * 32-bit length field, followed by length PRUnichars.
     */
  void writeWStringZ(String aString);

  /**
     * Write an 8-bit pascal style string (UTF8-encoded) to the stream.
     * 32-bit length field, followed by length 8-bit chars.
     */
  void writeUtf8Z(String aString);

  /**
     * Write an opaque byte array to the stream.
     */
  void writeBytes(String aString, long aLength);

  /**
     * Write an opaque byte array to the stream.
     */
  void writeByteArray(byte[] aBytes, long aLength);

}