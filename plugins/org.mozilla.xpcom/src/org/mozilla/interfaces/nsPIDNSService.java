/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/dns/public/nsPIDNSService.idl
 */

package org.mozilla.interfaces;

/**
 * This is a private interface used by the internals of the networking library.
 * It will never be frozen.  Do not use it in external code.
 */
public interface nsPIDNSService extends nsIDNSService {

  String NS_PIDNSSERVICE_IID =
    "{a26c5b45-7707-4412-bbc1-2462b890848d}";

  /**
     * called to initialize the DNS service.
     */
  void init();

  /**
     * called to shutdown the DNS service.  any pending asynchronous
     * requests will be canceled, and the local cache of DNS records
     * will be cleared.  NOTE: the operating system may still have
     * its own cache of DNS records, which would be unaffected by
     * this method.
     */
  void shutdown();

}