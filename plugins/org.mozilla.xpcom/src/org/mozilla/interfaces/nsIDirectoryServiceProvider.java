/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIDirectoryService.idl
 */

package org.mozilla.interfaces;

/**
 * nsIDirectoryServiceProvider
 *
 * Used by Directory Service to get file locations.
 *
 * @status FROZEN
 */
public interface nsIDirectoryServiceProvider extends nsISupports {

  String NS_IDIRECTORYSERVICEPROVIDER_IID =
    "{bbf8cab0-d43a-11d3-8cc2-00609792278c}";

  /**
  * getFile
  *
  * Directory Service calls this when it gets the first request for
  * a prop or on every request if the prop is not persistent.
  *
  * @param prop         The symbolic name of the file.
  * @param persistent   TRUE - The returned file will be cached by Directory
  *                     Service. Subsequent requests for this prop will
  *                     bypass the provider and use the cache.
  *                     FALSE - The provider will be asked for this prop
  *                     each time it is requested.
  *
  * @return             The file represented by the property.
  *
  */
  nsIFile getFile(String prop, boolean[] persistent);

}