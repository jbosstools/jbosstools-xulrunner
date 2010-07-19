/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/components/nsIModuleLoader.idl
 */

package org.mozilla.interfaces;

/**
 * Module loaders are responsible for loading a component file. The static
 * component loader is special and does not use this interface.
 *
 * @note Implementations of this interface should be threadsafe,
 *       methods may be called from any thread.
 */
public interface nsIModuleLoader extends nsISupports {

  String NS_IMODULELOADER_IID =
    "{9b328e24-4d85-4a9c-9cb7-f25e66f430c3}";

  /**
   * Return the module for a specified file. The module loader should
   * cache the module and return the same module for subsequent
   * requests for the same physical file. The module loader is
   * responsible for unloading the module during shutdown.
   *
   * @throws NS_ERROR_INVALID_ARG If the filename is not recognized.
   * @throws NS_ERROR_FACTORY_NOT_LOADED If the filename is recognized but
   *           the module fails to load, e.g.: missing symbols, syntax errors
   */
  nsIModule loadModule(nsILocalFile aFile);

}