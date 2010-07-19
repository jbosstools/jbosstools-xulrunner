/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIStreamTransportService.idl
 */

package org.mozilla.interfaces;

/**
 * This service read/writes a stream on a background thread.
 *
 * Use this service to transform any blocking stream (e.g., file stream)
 * into a fully asynchronous stream that can be read/written without 
 * blocking the main thread.
 */
public interface nsIStreamTransportService extends nsISupports {

  String NS_ISTREAMTRANSPORTSERVICE_IID =
    "{8268d474-efbf-494f-a152-e8a8616f4e52}";

  /**
     * CreateInputTransport
     *
     * @param aStream
     *        The input stream that will be read on a background thread.
     *        This stream must implement "blocking" stream semantics.
     * @param aStartOffset
     *        The input stream will be read starting from this offset.  Pass
     *        -1 to read from the current stream offset.  NOTE: this parameter
     *        is ignored if the stream does not support nsISeekableStream.
     * @param aReadLimit
     *        This parameter limits the number of bytes that will be read from
     *        the input stream.  Pass -1 to read everything.
     * @param aCloseWhenDone
     *        Specify this flag to have the input stream closed once its
     *        contents have been completely read.
     *
     * @return nsITransport instance.
     */
  nsITransport createInputTransport(nsIInputStream aStream, long aStartOffset, long aReadLimit, boolean aCloseWhenDone);

  /**
     * CreateOutputTransport
     *
     * @param aStream
     *        The output stream that will be written to on a background thread.
     *        This stream must implement "blocking" stream semantics.
     * @param aStartOffset
     *        The output stream will be written starting at this offset.  Pass
     *        -1 to write to the current stream offset.  NOTE: this parameter
     *        is ignored if the stream does not support nsISeekableStream.
     * @param aWriteLimit
     *        This parameter limits the number of bytes that will be written to
     *        the output stream.  Pass -1 for unlimited writing.
     * @param aCloseWhenDone
     *        Specify this flag to have the output stream closed once its
     *        contents have been completely written.
     *
     * @return nsITransport instance.
     */
  nsITransport createOutputTransport(nsIOutputStream aStream, long aStartOffset, long aWriteLimit, boolean aCloseWhenDone);

}