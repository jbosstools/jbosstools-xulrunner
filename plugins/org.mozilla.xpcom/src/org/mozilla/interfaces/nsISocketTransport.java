/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsISocketTransport.idl
 */

package org.mozilla.interfaces;

/**
 * nsISocketTransport
 *
 * NOTE: Connection setup is triggered by opening an input or output stream,
 * it does not start on its own. Completion of the connection setup is
 * indicated by a STATUS_CONNECTED_TO notification to the event sink (if set).
 *
 * NOTE: This is a free-threaded interface, meaning that the methods on
 * this interface may be called from any thread.
 */
public interface nsISocketTransport extends nsITransport {

  String NS_ISOCKETTRANSPORT_IID =
    "{ef3f4993-cfbc-4e5a-9509-16deafe16549}";

  /**
     * Get the host for the underlying socket connection.
     */
  String getHost();

  /**
     * Get the port for the underlying socket connection.
     */
  int getPort();

  /**
     * Security info object returned from the secure socket provider.  This
     * object supports nsISSLSocketControl, nsITransportSecurityInfo, and
     * possibly other interfaces.
     *
     * This attribute is only available once the socket is connected.
     */
  nsISupports getSecurityInfo();

  /**
     * Security notification callbacks passed to the secure socket provider
     * via nsISSLSocketControl at socket creation time.
     *
     * NOTE: this attribute cannot be changed once a stream has been opened.
     */
  nsIInterfaceRequestor getSecurityCallbacks();

  /**
     * Security notification callbacks passed to the secure socket provider
     * via nsISSLSocketControl at socket creation time.
     *
     * NOTE: this attribute cannot be changed once a stream has been opened.
     */
  void setSecurityCallbacks(nsIInterfaceRequestor aSecurityCallbacks);

  /**
     * Test if this socket transport is (still) connected.
     */
  boolean isAlive();

  /**
     * Socket timeouts in seconds.  To specify no timeout, pass PR_UINT32_MAX
     * as aValue to setTimeout.  The implementation may truncate timeout values
     * to a smaller range of values (e.g., 0 to 0xFFFF).
     */
  long getTimeout(long aType);

  void setTimeout(long aType, long aValue);

  /**
     * Values for the aType parameter passed to get/setTimeout.
     */
  long TIMEOUT_CONNECT = 0L;

  long TIMEOUT_READ_WRITE = 1L;

  /**
     * nsITransportEventSink status codes.
     *
     * Although these look like XPCOM error codes and are passed in an nsresult
     * variable, they are *not* error codes.  Note that while they *do* overlap
     * with existing error codes in Necko, these status codes are confined
     * within a very limited context where no error codes may appear, so there
     * is no ambiguity.
     *
     * The values of these status codes must never change.
     *
     * The status codes appear in near-chronological order (not in numeric
     * order).  STATUS_RESOLVING may be skipped if the host does not need to be
     * resolved.  STATUS_WAITING_FOR is an optional status code, which the impl
     * of this interface may choose not to generate.
     */
  long STATUS_RESOLVING = 2152398851L;

  long STATUS_CONNECTING_TO = 2152398855L;

  long STATUS_CONNECTED_TO = 2152398852L;

  long STATUS_SENDING_TO = 2152398853L;

  long STATUS_WAITING_FOR = 2152398858L;

  long STATUS_RECEIVING_FROM = 2152398854L;

  /**
     * connectionFlags is a bitmask that can be used to modify underlying 
     * behavior of the socket connection.
     */
  long getConnectionFlags();

  /**
     * connectionFlags is a bitmask that can be used to modify underlying 
     * behavior of the socket connection.
     */
  void setConnectionFlags(long aConnectionFlags);

  /**
     * Values for the connectionFlags
     *
     * When making a new connection BYPASS_CACHE will force the Necko DNS 
     * cache entry to be refreshed with a new call to NSPR if it is set before
     * opening the new stream.
     */
  long BYPASS_CACHE = 1L;

  /**
     * When setting this flag, the socket will not apply any
     * credentials when establishing a connection. For example,
     * an SSL connection would not send any client-certificates
     * if this flag is set.
     */
  long ANONYMOUS_CONNECT = 2L;

}