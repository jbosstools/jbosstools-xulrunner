/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIInputStreamTee.idl
 */

package org.mozilla.interfaces;

/**
 * A nsIInputStreamTee is a wrapper for an input stream, that when read
 * reads the specified amount of data from its |source| and copies that
 * data to its |sink|.  |sink| must be a blocking output stream.
 */
public interface nsIInputStreamTee extends nsIInputStream {

  String NS_IINPUTSTREAMTEE_IID =
    "{44e8b2c8-1ecb-4a63-8b23-3e3500c34f32}";

  nsIInputStream getSource();

  void setSource(nsIInputStream aSource);

  nsIOutputStream getSink();

  void setSink(nsIOutputStream aSink);

}