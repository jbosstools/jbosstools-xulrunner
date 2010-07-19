/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/src/xpconnect/idl/xpcIJSModuleLoader.idl
 */

package org.mozilla.interfaces;

public interface xpcIJSModuleLoader extends nsISupports {

  String XPCIJSMODULELOADER_IID =
    "{89da3673-e699-4f26-9ed7-11a528011434}";

  /**
   * To be called from JavaScript only.
   *
   * Synchronously loads and evaluates the js file located at
   * 'registryLocation' with a new, fully privileged global object.
   *
   * If 'targetObj' is specified and equal to null, returns the
   * module's global object. Otherwise (if 'targetObj' is not
   * specified, or 'targetObj' is != null) looks for a property
   * 'EXPORTED_SYMBOLS' on the new global object. 'EXPORTED_SYMBOLS'
   * is expected to be an array of strings identifying properties on
   * the global object.  These properties will be installed as
   * properties on 'targetObj', or, if 'targetObj' is not specified,
   * on the caller's global object. If 'EXPORTED_SYMBOLS' is not
   * found, an error is thrown.
   *
   * @param resourceURI A resource:// URI string to load the module from.
   * @param targetObj  the object to install the exported properties on.
   *        If this parameter is a primitive value, this method throws
   *        an exception.
   * @returns the module code's global object.
   *
   * The implementation maintains a hash of registryLocation->global obj.
   * Subsequent invocations of importModule with 'registryLocation'
   * pointing to the same file will not cause the module to be re-evaluated,
   * but the symbols in EXPORTED_SYMBOLS will be exported into the
   * specified target object and the global object returned as above.
   *
   * (This comment is duplicated to nsIXPCComponents_Utils.)
   */
  void _import(String aResourceURI);

}