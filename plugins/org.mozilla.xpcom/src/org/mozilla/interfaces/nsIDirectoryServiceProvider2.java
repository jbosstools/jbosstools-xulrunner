/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIDirectoryService.idl
 */

package org.mozilla.interfaces;

/**
 * nsIDirectoryServiceProvider2
 *
 * An extension of nsIDirectoryServiceProvider which allows
 * multiple files to be returned for the given key.
 *
 * @status FROZEN
 */
public interface nsIDirectoryServiceProvider2 extends nsIDirectoryServiceProvider {

  String NS_IDIRECTORYSERVICEPROVIDER2_IID =
    "{2f977d4b-5485-11d4-87e2-0010a4e75ef2}";

  /**
  * getFiles
  *
  * Directory Service calls this when it gets a request for
  * a prop and the requested type is nsISimpleEnumerator.
  *
  * @param prop         The symbolic name of the file list.
  *
  * @return             An enumerator for a list of file locations.
  *                     The elements in the enumeration are nsIFile
  * @returnCode         NS_SUCCESS_AGGREGATE_RESULT if this result should be
  *                     aggregated with other "lower" providers.
  */
  nsISimpleEnumerator getFiles(String prop);

}