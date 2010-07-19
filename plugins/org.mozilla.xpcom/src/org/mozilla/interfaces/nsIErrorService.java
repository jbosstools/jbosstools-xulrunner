/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/base/nsIErrorService.idl
 */

package org.mozilla.interfaces;

/**
 * nsIErrorService: This is an interim service that allows nsresult codes to be mapped to 
 * string bundles that can be used to look up error messages. String bundle keys can also
 * be mapped. 
 *
 * This service will eventually get replaced by extending xpidl to allow errors to be defined.
 * (http://bugzilla.mozilla.org/show_bug.cgi?id=13423).
 */
public interface nsIErrorService extends nsISupports {

  String NS_IERRORSERVICE_IID =
    "{e72f94b2-5f85-11d4-9877-00c04fa0cf4a}";

  /**
     * Registers a string bundle URL for an error module. Error modules are obtained from
     * nsresult code with NS_ERROR_GET_MODULE.
     */
  void registerErrorStringBundle(short errorModule, String stringBundleURL);

  /**
     * Registers a string bundle URL for an error module.
     */
  void unregisterErrorStringBundle(short errorModule);

  /**
     * Retrieves a string bundle URL for an error module.
     */
  String getErrorStringBundle(short errorModule);

  /**
     * Registers a key in a string bundle for an nsresult error code. Only the code portion
     * of the nsresult is used (obtained with NS_ERROR_GET_CODE) in this registration. The
     * string bundle key is used to look up internationalized messages in the string bundle.
     */
  void registerErrorStringBundleKey(long error, String stringBundleKey);

  /**
     * Unregisters a key in a string bundle for an nsresult error code. 
     */
  void unregisterErrorStringBundleKey(long error);

  /**
     * Retrieves a key in a string bundle for an nsresult error code. If no key is registered
     * for the specified nsresult's code (obtained with NS_ERROR_GET_CODE), then the stringified
     * version of the nsresult code is returned.
     */
  String getErrorStringBundleKey(long error);

}