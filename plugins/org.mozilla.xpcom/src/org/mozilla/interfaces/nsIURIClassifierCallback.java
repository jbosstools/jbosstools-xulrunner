/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsIURIClassifier.idl
 */

package org.mozilla.interfaces;

/**
 * Callback function for nsIURIClassifier lookups.
 */
public interface nsIURIClassifierCallback extends nsISupports {

  String NS_IURICLASSIFIERCALLBACK_IID =
    "{8face46e-0c96-470f-af40-0037dcd797bd}";

  /**
   * Called by the URI classifier service when it is done checking a URI.
   *
   * Clients are responsible for associating callback objects with classify()
   * calls.
   *
   * @param aErrorCode
   *        The error code with which the channel should be cancelled, or
   *        NS_OK if the load should continue normally.
   */
  void onClassifyComplete(long aErrorCode);

}