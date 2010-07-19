/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIAsyncStreamCopier.idl
 */

package org.mozilla.interfaces;

public interface nsIAsyncStreamCopier extends nsIRequest {

  String NS_IASYNCSTREAMCOPIER_IID =
    "{5a19ca27-e041-4aca-8287-eb248d4c50c0}";

  /**
     * Initialize the stream copier.
     *
     * @param aSource
     *        contains the data to be copied.
     * @param aSink
     *        specifies the destination for the data.
     * @param aTarget
     *        specifies the thread on which the copy will occur.  a null value
     *        is permitted and will cause the copy to occur on an unspecified
     *        background thread.
     * @param aSourceBuffered
     *        true if aSource implements ReadSegments.
     * @param aSinkBuffered
     *        true if aSink implements WriteSegments.
     * @param aChunkSize
     *        specifies how many bytes to read/write at a time.  this controls
     *        the granularity of the copying.  it should match the segment size
     *        of the "buffered" streams involved.
     * @param aCloseSource
     *        true if aSource should be closed after copying.
     * @param aCloseSink
     *        true if aSink should be closed after copying.
     *
     * NOTE: at least one of the streams must be buffered.
     */
  void init(nsIInputStream aSource, nsIOutputStream aSink, nsIEventTarget aTarget, boolean aSourceBuffered, boolean aSinkBuffered, long aChunkSize, boolean aCloseSource, boolean aCloseSink);

  /**
     * asyncCopy triggers the start of the copy.  The observer will be notified
     * when the copy completes.
     *
     * @param aObserver
     *        receives notifications.
     * @param aObserverContext
     *        passed to observer methods.
     */
  void asyncCopy(nsIRequestObserver aObserver, nsISupports aObserverContext);

}