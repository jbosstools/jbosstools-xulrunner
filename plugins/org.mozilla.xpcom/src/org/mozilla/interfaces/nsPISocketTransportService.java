/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsPISocketTransportService.idl
 */

package org.mozilla.interfaces;

/**
 * This is a private interface used by the internals of the networking library.
 * It will never be frozen.  Do not use it in external code.
 */
public interface nsPISocketTransportService extends nsISocketTransportService {

  String NS_PISOCKETTRANSPORTSERVICE_IID =
    "{83123036-81c0-47cb-8d9c-bd85d29a1b3f}";

  /**
   * init/shutdown routines.
   */
  void init();

  void shutdown();

  /**
   * controls whether or not the socket transport service should poke
   * the autodialer on connection failure.
   */
  boolean getAutodialEnabled();

  /**
   * controls whether or not the socket transport service should poke
   * the autodialer on connection failure.
   */
  void setAutodialEnabled(boolean aAutodialEnabled);

  /**
   * controls the TCP sender window clamp
   */
  int getSendBufferSize();

}