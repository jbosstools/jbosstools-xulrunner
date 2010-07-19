/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/jsd/idl/jsdIDebuggerService.idl
 */

package org.mozilla.interfaces;

public interface jsdIValue extends jsdIEphemeral {

  String JSDIVALUE_IID =
    "{9cab158f-dc78-41dd-9d11-79e05cb3f2bd}";

  /**
     * |false| unless the value is a function declared in script.
     */
  boolean getIsNative();

  /**
     * |true| if the value represents a number, either double or integer.
     * |false| for all other values, including numbers assigned as strings
     * (eg. x = "1";)
     */
  boolean getIsNumber();

  /**
     * |true| if the value represents a JavaScript primitive number or AUTF8String
     */
  boolean getIsPrimitive();

  /** Value is either |true| or |false|. */
  long TYPE_BOOLEAN = 0L;

  /** Value is a primitive number that is too large to fit in an integer. */
  long TYPE_DOUBLE = 1L;

  /** Value is a primitive number that fits into an integer. */
  long TYPE_INT = 2L;

  /** Value is a function. */
  long TYPE_FUNCTION = 3L;

  /** Value is |null|. */
  long TYPE_NULL = 4L;

  /** Value is an object. */
  long TYPE_OBJECT = 5L;

  /** Value is a primitive AUTF8String. */
  long TYPE_STRING = 6L;

  /** Value is void. */
  long TYPE_VOID = 7L;

  /**
     * One of the TYPE_* values above.
     */
  long getJsType();

  /**
     * Prototype value if this value represents an object, null if the value is
     * not an object or the object has no prototype.
     */
  jsdIValue getJsPrototype();

  /**
     * Parent value if this value represents an object, null if the value is not
     * an object or the object has no parent.
     */
  jsdIValue getJsParent();

  /**
     * Class name if this value represents an object.  Empty AUTF8String if the value
     * is not an object.
     */
  String getJsClassName();

  /**
     * Constructor name if this value represents an object.  Empty AUTF8String if the
     * value is not an object.
     */
  jsdIValue getJsConstructor();

  /**
     * Function name if this value represents a function.  Empty AUTF8String if the
     * value is not a function.
     */
  String getJsFunctionName();

  /**
     * Value if interpreted as a boolean.  Converts if necessary.
     */
  boolean getBooleanValue();

  /**
     * Value if interpreted as a double.  Converts if necessary.
     */
  double getDoubleValue();

  /**
     * Value if interpreted as an integer.  Converts if necessary.
     */
  int getIntValue();

  /**
     * Value if interpreted as an object.
     */
  jsdIObject getObjectValue();

  /**
     * Value if interpreted as a AUTF8String.  Converts if necessary.
     */
  String getStringValue();

  /**
     * Number of properties.  0 if the value is not an object, or the value is
     * an object but has no properties.
     */
  int getPropertyCount();

  /**
     * Retrieves all properties if this value represents an object.  If this
     * value is not an object a 0 element array is returned.
     * @param propArray Array of jsdIProperty values for this value.
     * @param length    Size of array.
     */
  void getProperties(jsdIProperty[][] propArray, long[] length);

  /**
     * Retrieves a single property from the value.  Only valid if the value
     * represents an object.
     * @param name Name of the property to retrieve.
     * @retval     jsdIProperty for the requested property name or null if no
     *             property exists for the requested name.
     */
  jsdIProperty getProperty(String name);

  /**
     * jsdIValues are wrappers around JavaScript engine structures.  Much of the
     * data is copied instead of shared.  The refresh method is used to resync
     * the jsdIValue with the underlying structure.
     */
  void refresh();

  /**
     * When called from JavaScript, this method returns the JavaScript value
     * wrapped by this jsdIValue.  The calling script is free to use the result
     * as it would any other JavaScript value.
     * When called from another language this method returns an xpconnect
     * defined error code.
     */
  void getWrappedValue();

  /**
     * If this is a function value, return its associated jsdIScript.
     * Otherwise, return null.
     */
  jsdIScript getScript();

}