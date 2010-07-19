/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/src/xpconnect/idl/mozIJSSubScriptLoader.idl
 */

package org.mozilla.interfaces;

public interface mozIJSSubScriptLoader extends nsISupports {

  String MOZIJSSUBSCRIPTLOADER_IID =
    "{8792d77e-1dd2-11b2-ac7f-9bc9be4f2916}";

  /**
     * This method should only be called from JS!
     * In JS, the signature looks like:
     * rv loadSubScript (url [, obj]);
     * @param url the url if the sub-script, it MUST be either a file:,
     *            resource:, or chrome: url, and MUST be local.
     * @param obj an optional object to evaluate the script onto, it
     *            defaults to the global object of the caller.
     * @retval rv the value returned by the sub-script
     */
  void loadSubScript(String url);

}