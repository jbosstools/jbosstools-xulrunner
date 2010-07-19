/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIPipe.idl
 */

package org.mozilla.interfaces;

/**
 * XXX this interface doesn't really belong in here.  It is here because
 * currently nsPipeInputStream is the only implementation of this interface.
 */
public interface nsISearchableInputStream extends nsISupports {

  String NS_ISEARCHABLEINPUTSTREAM_IID =
    "{8c39ef62-f7c9-11d4-98f5-001083010e9b}";

  /**
     * Searches for a string in the input stream. Since the stream has a notion
     * of EOF, it is possible that the string may at some time be in the 
     * buffer, but is is not currently found up to some offset. Consequently,
     * both the found and not found cases return an offset:
     *    if found, return offset where it was found
     *    if not found, return offset of the first byte not searched
     * In the case the stream is at EOF and the string is not found, the first
     * byte not searched will correspond to the length of the buffer.
     */
  void search(String forString, boolean ignoreCase, boolean[] found, long[] offsetSearchedTo);

}