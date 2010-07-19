/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsIScriptLoaderObserver.idl
 */

package org.mozilla.interfaces;

public interface nsIScriptLoaderObserver extends nsISupports {

  String NS_ISCRIPTLOADEROBSERVER_IID =
    "{7b787204-76fb-4764-96f1-fb7a666db4f4}";

  /**
   * The script is available for evaluation. For inline scripts, this
   * method will be called synchronously. For externally loaded scripts,
   * this method will be called when the load completes.
   *
   * @param aResult A result code representing the result of loading
   *        a script. If this is a failure code, script evaluation
   *        will not occur.
   * @param aElement The element being processed.
   * @param aIsInline Is this an inline script or externally loaded?
   * @param aURI What is the URI of the script (the document URI if
   *        it is inline).
   * @param aLineNo At what line does the script appear (generally 1
   *        if it is a loaded script).
   */
  void scriptAvailable(long aResult, nsISupports aElement, boolean aIsInline, nsIURI aURI, int aLineNo);

  /**
   * The script has been evaluated.
   *
   * @param aResult A result code representing the success or failure of
   *        the script evaluation.
   * @param aElement The element being processed.
   * @param aIsInline Is this an inline script or externally loaded?
   */
  void scriptEvaluated(long aResult, nsISupports aElement, boolean aIsInline);

}