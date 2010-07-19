/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIPipe.idl
 */

package org.mozilla.interfaces;

/**
 * nsIPipe represents an in-process buffer that can be read using nsIInputStream
 * and written using nsIOutputStream.  The reader and writer of a pipe do not
 * have to be on the same thread.  As a result, the pipe is an ideal mechanism
 * to bridge data exchange between two threads.  For example, a worker thread
 * might write data to a pipe from which the main thread will read.
 *
 * Each end of the pipe can be either blocking or non-blocking.  Recall that a
 * non-blocking stream will return NS_BASE_STREAM_WOULD_BLOCK if it cannot be
 * read or written to without blocking the calling thread.  For example, if you
 * try to read from an empty pipe that has not yet been closed, then if that
 * pipe's input end is non-blocking, then the read call will fail immediately
 * with NS_BASE_STREAM_WOULD_BLOCK as the error condition.  However, if that
 * pipe's input end is blocking, then the read call will not return until the
 * pipe has data or until the pipe is closed.  This example presumes that the
 * pipe is being filled asynchronously on some background thread.
 *
 * The pipe supports nsIAsyncInputStream and nsIAsyncOutputStream, which give
 * the user of a non-blocking pipe the ability to wait for the pipe to become
 * ready again.  For example, in the case of an empty non-blocking pipe, the
 * user can call AsyncWait on the input end of the pipe to be notified when 
 * the pipe has data to read (or when the pipe becomes closed).
 *
 * NS_NewPipe2 and NS_NewPipe provide convenient pipe constructors.  In most
 * cases nsIPipe is not actually used.  It is usually enough to just get
 * references to the pipe's input and output end.  In which case, the pipe is
 * automatically closed when the respective pipe ends are released.
 */
public interface nsIPipe extends nsISupports {

  String NS_IPIPE_IID =
    "{f4211abc-61b3-11d4-9877-00c04fa0cf4a}";

  /**
     * initialize this pipe
     *
     * @param nonBlockingInput
     *        true specifies non-blocking input stream behavior
     * @param nonBlockingOutput
     *        true specifies non-blocking output stream behavior
     * @param segmentSize
     *        specifies the segment size in bytes (pass 0 to use default value)
     * @param segmentCount
     *        specifies the max number of segments (pass 0 to use default
     *        value).   Passing PR_UINT32_MAX here causes the pipe to have
     *        "infinite" space.  This mode can be useful in some cases, but
     *        should always be used with caution.  The default value for this
     *        parameter is a finite value.
     * @param segmentAllocator
     *        pass reference to nsIMemory to have all pipe allocations use this
     *        allocator (pass null to use the default allocator)
     */
  void init(boolean nonBlockingInput, boolean nonBlockingOutput, long segmentSize, long segmentCount, nsIMemory segmentAllocator);

  /**
     * The pipe's input end, which also implements nsISearchableInputStream.
     */
  nsIAsyncInputStream getInputStream();

  /**
     * The pipe's output end.
     */
  nsIAsyncOutputStream getOutputStream();

}