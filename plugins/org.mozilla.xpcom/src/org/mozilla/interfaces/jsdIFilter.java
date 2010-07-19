/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/jsd/idl/jsdIDebuggerService.idl
 */

package org.mozilla.interfaces;

public interface jsdIFilter extends nsISupports {

  String JSDIFILTER_IID =
    "{0c9189d9-4287-47a4-bca6-6ed65aaf737f}";

  /**
 * Object representing a pattern of global object and/or url the debugger should
 * ignore.  The debugger service itself will not modify properties of these
 * objects.
 */
/**
     * These two bytes of the flags attribute are reserved for interpretation
     * by the jsdService implementation.  You can do what you like with the
     * remaining flags.
     */
  long FLAG_RESERVED_MASK = 255L;

  /**
     * Filters without this flag set are ignored.
     */
  long FLAG_ENABLED = 1L;

  /**
     * Filters with this flag set are "pass" filters, they allow matching hooks
     * to continue.  Filters without this flag block matching hooks.
     */
  long FLAG_PASS = 2L;

  /**
     * FLAG_* values from above, OR'd together.
     */
  long getFlags();

  /**
     * FLAG_* values from above, OR'd together.
     */
  void setFlags(long aFlags);

  /**
     * An nsISupports version of the global object to be filtered.  A null glob
     * matches all hooks.  This attribute must be QI'able to the
     * (non-scriptable) nsIScriptGlobalObject interface.
     *
     * The jsdIService caches this value internally, so if it changes you must
     * swap the filter with itself using jsdIService::swapFilters.
     */
  nsISupports getGlobalObject();

  /**
     * An nsISupports version of the global object to be filtered.  A null glob
     * matches all hooks.  This attribute must be QI'able to the
     * (non-scriptable) nsIScriptGlobalObject interface.
     *
     * The jsdIService caches this value internally, so if it changes you must
     * swap the filter with itself using jsdIService::swapFilters.
     */
  void setGlobalObject(nsISupports aGlobalObject);

  /**
     * String representing the url pattern to be filtered.  Supports limited
     * glob matching, at the beginning and end of the pattern only.  For example,
     * "chrome://venkman*" filters all urls that start with chrome/venkman,
     * "*.cgi" filters all cgi's, and "http://myserver/utils.js" filters only
     * the utils.js file on "myserver".   A null urlPattern matches all urls.
     *
     * The jsdIService caches this value internally, to if it changes you must
     * swap the filter with itself using jsdIService::swapFilters.
     */
  String getUrlPattern();

  /**
     * String representing the url pattern to be filtered.  Supports limited
     * glob matching, at the beginning and end of the pattern only.  For example,
     * "chrome://venkman*" filters all urls that start with chrome/venkman,
     * "*.cgi" filters all cgi's, and "http://myserver/utils.js" filters only
     * the utils.js file on "myserver".   A null urlPattern matches all urls.
     *
     * The jsdIService caches this value internally, to if it changes you must
     * swap the filter with itself using jsdIService::swapFilters.
     */
  void setUrlPattern(String aUrlPattern);

  /**
     * Line number for the start of this filter.  Line numbers are one based.
     * Assigning a 0 to this attribute will tell the debugger to ignore the
     * entire file.
     */
  long getStartLine();

  /**
     * Line number for the start of this filter.  Line numbers are one based.
     * Assigning a 0 to this attribute will tell the debugger to ignore the
     * entire file.
     */
  void setStartLine(long aStartLine);

  /**
     * Line number for the end of this filter.  Line numbers are one based.
     * Assigning a 0 to this attribute will tell the debugger to ignore from
     * |startLine| to the end of the file.
     */
  long getEndLine();

  /**
     * Line number for the end of this filter.  Line numbers are one based.
     * Assigning a 0 to this attribute will tell the debugger to ignore from
     * |startLine| to the end of the file.
     */
  void setEndLine(long aEndLine);

}