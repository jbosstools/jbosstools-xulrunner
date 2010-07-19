/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/jsd/idl/jsdIDebuggerService.idl
 */

package org.mozilla.interfaces;

public interface jsdIProperty extends jsdIEphemeral {

  String JSDIPROPERTY_IID =
    "{4491ecd4-fb6b-43fb-bd6f-5d1473f1df24}";

  /**
     * FLAG_* values must be kept in sync with JSDPD_* #defines in jsdebug.h.
     */
/** visible to for/in loop */
  long FLAG_ENUMERATE = 1L;

  /** assignment is error */
  long FLAG_READONLY = 2L;

  /** property cannot be deleted */
  long FLAG_PERMANENT = 4L;

  /** property has an alias id */
  long FLAG_ALIAS = 8L;

  /** argument to function */
  long FLAG_ARGUMENT = 16L;

  /** local variable in function */
  long FLAG_VARIABLE = 32L;

  /** exception occurred looking up property, value is exception */
  long FLAG_EXCEPTION = 64L;

  /** native getter returned JS_FALSE without throwing an exception */
  long FLAG_ERROR = 128L;

  /** found via explicit lookup (property defined elsewhere.) */
  long FLAG_HINTED = 2048L;

  /** FLAG_* values OR'd together, representing the flags for this property. */
  long getFlags();

  /** jsdIValue representing the alias for this property. */
  jsdIValue getAlias();

  /** name for this property. */
  jsdIValue getName();

  /** value of this property. */
  jsdIValue getValue();

  /** slot number if this property is a local variable or parameter. */
  long getVarArgSlot();

}