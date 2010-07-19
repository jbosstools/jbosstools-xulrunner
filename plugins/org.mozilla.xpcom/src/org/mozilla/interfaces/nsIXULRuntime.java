/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/system/nsIXULRuntime.idl
 */

package org.mozilla.interfaces;

/**
 * Provides information about the XUL runtime.
 * @status UNSTABLE - This interface is not frozen and will probably change in
 *                    future releases. If you need this functionality to be
 *                    stable/frozen, please contact Benjamin Smedberg.
 */
public interface nsIXULRuntime extends nsISupports {

  String NS_IXULRUNTIME_IID =
    "{17311145-97da-49eb-b984-965bdee8879c}";

  /**
   * Whether the application was launched in safe mode.
   */
  boolean getInSafeMode();

  /**
   * Whether to write console errors to a log file. If a component
   * encounters startup errors that might prevent the app from showing
   * proper UI, it should set this flag to "true".
   */
  boolean getLogConsoleErrors();

  /**
   * Whether to write console errors to a log file. If a component
   * encounters startup errors that might prevent the app from showing
   * proper UI, it should set this flag to "true".
   */
  void setLogConsoleErrors(boolean aLogConsoleErrors);

  /**
   * A string tag identifying the current operating system. This is taken
   * from the OS_TARGET configure variable. It will always be available.
   */
  String getOS();

  /**
   * A string tag identifying the binary ABI of the current processor and
   * compiler vtable. This is taken from the TARGET_XPCOM_ABI configure
   * variable. It may not be available on all platforms, especially
   * unusual processor or compiler combinations.
   *
   * The result takes the form <processor>-<compilerABI>, for example:
   *   x86-msvc
   *   ppc-gcc3
   *
   * This value should almost always be used in combination with "OS".
   *
   * @throw NS_ERROR_NOT_AVAILABLE if not available.
   */
  String getXPCOMABI();

  /**
   * A string tag identifying the target widget toolkit in use.
   * This is taken from the MOZ_WIDGET_TOOLKIT configure variable.
   */
  String getWidgetToolkit();

}