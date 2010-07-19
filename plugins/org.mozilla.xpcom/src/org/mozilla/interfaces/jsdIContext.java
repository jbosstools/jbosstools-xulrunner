/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/jsd/idl/jsdIDebuggerService.idl
 */

package org.mozilla.interfaces;

public interface jsdIContext extends jsdIEphemeral {

  String JSDICONTEXT_IID =
    "{3e5c934d-6863-4d81-96f5-76a3b962fc2b}";

  /**
     * OPT_* values must be kept in sync with JSOPTION_* #defines in jsapi.h.
     */
/**
     * Strict mode is on.
     */
  int OPT_STRICT = 1;

  /**
     * Warnings reported as errors.
     */
  int OPT_WERR = 2;

  /**
     * Makes eval() use the last object on its 'obj' param's scope chain as the
     * ECMA 'variables object'.
     */
  int OPT_VAROBJFIX = 4;

  /**
     * Private data for this object is an nsISupports object.  Attempting to
     * alter this bit will result in an NS_ERROR_ILLEGAL_VALUE.
     */
  int OPT_ISUPPORTS = 8;

  /**
     * OPT_* values above, OR'd together.
     */
  long getOptions();

  /**
     * OPT_* values above, OR'd together.
     */
  void setOptions(long aOptions);

  /**
     * Last version set on this context.
     * Scripts typically select this with the "language" attribute.
     * See the VERSION_* consts on jsdIDebuggerService.
     */
  int getVersion();

  /**
     * Last version set on this context.
     * Scripts typically select this with the "language" attribute.
     * See the VERSION_* consts on jsdIDebuggerService.
     */
  void setVersion(int aVersion);

  /**
     * Unique tag among all valid jsdIContext objects, useful as a hash key.
     */
  long getTag();

  /**
     * Private data for this context, if it is an nsISupports, |null| otherwise.
     */
  nsISupports getPrivateData();

  /**
     * Retrieve the underlying context wrapped by this jsdIContext.
     */
  nsISupports getWrappedContext();

  /**
     * Top of the scope chain for this context.
     */
  jsdIValue getGlobalObject();

  /**
     * |true| if this context should be allowed to run scripts, |false|
     * otherwise.  This attribute is only valid for contexts which implement
     * nsIScriptContext.  Setting or getting this attribute on any other
     * context will throw a NS_ERROR_NO_INTERFACE exception.
     */
  boolean getScriptsEnabled();

  /**
     * |true| if this context should be allowed to run scripts, |false|
     * otherwise.  This attribute is only valid for contexts which implement
     * nsIScriptContext.  Setting or getting this attribute on any other
     * context will throw a NS_ERROR_NO_INTERFACE exception.
     */
  void setScriptsEnabled(boolean aScriptsEnabled);

}