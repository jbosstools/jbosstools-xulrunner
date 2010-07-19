/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/jsd/idl/jsdIDebuggerService.idl
 */

package org.mozilla.interfaces;

public interface jsdIFilterEnumerator extends nsISupports {

  String JSDIFILTERENUMERATOR_IID =
    "{e391ba85-9379-4762-b387-558e38db730f}";

  /**
 * Pass an instance of one of these to jsdIDebuggerService::enumerateFilters.
 */
/**
     * The enumerateFilter method will be called once for every filter the
     * debugger knows about.
     */
  void enumerateFilter(jsdIFilter filter);

}