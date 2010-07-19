/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIDirectoryService.idl
 */

package org.mozilla.interfaces;

/**
 * nsIDirectoryService
 *
 * @status FROZEN
 */
public interface nsIDirectoryService extends nsISupports {

  String NS_IDIRECTORYSERVICE_IID =
    "{57a66a60-d43a-11d3-8cc2-00609792278c}";

  /**
  * init
  *
  * Must be called. Used internally by XPCOM initialization.
  *
  */
  void init();

  /**
  * registerProvider
  *
  * Register a provider with the service.
  *
  * @param prov            The service will keep a strong reference
  *                        to this object. It will be released when
  *                        the service is released.
  *
  */
  void registerProvider(nsIDirectoryServiceProvider prov);

  /**
  * unregisterProvider
  *
  * Unregister a provider with the service.
  *
  * @param prov            
  *
  */
  void unregisterProvider(nsIDirectoryServiceProvider prov);

}