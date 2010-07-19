/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/jsd/idl/jsdIDebuggerService.idl
 */

package org.mozilla.interfaces;

public interface jsdIErrorHook extends nsISupports {

  String JSDIERRORHOOK_IID =
    "{cea9ab1a-4b5d-416f-a197-9ffa7046f2ce}";

  /**
     * REPORT_* values must be kept in sync with JSREPORT_* #defines in
     * jsapi.h
     */
/**
     * Report is an error.
     */
  long REPORT_ERROR = 0L;

  /**
     * Report is only a warning.
     */
  long REPORT_WARNING = 1L;

  /**
     * Report represents an uncaught exception.
     */
  long REPORT_EXCEPTION = 2L;

  /**
     * Report is due to strict mode.
     */
  long REPORT_STRICT = 4L;

  /**
     * Called when the JavaScript engine encounters an error.  Return |true|
     * to pass the error along, |false| to invoke the debugHook.
     */
  boolean onError(String message, String fileName, long line, long pos, long flags, long errnum, jsdIValue exc);

}