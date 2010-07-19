/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/jsd/idl/jsdIDebuggerService.idl
 */

package org.mozilla.interfaces;

public interface jsdIObject extends nsISupports {

  String JSDIOBJECT_IID =
    "{a735a94c-9d41-4997-8fcb-cfa8b649a5b7}";

  /**
     * The URL (filename) that contains the script which caused this object
     * to be created.
     */
  String getCreatorURL();

  /**
     * Line number in the creatorURL where this object was created.
     */
  long getCreatorLine();

  /**
     * The URL (filename) that contains the script which defined the constructor
     * used to create this object.
     */
  String getConstructorURL();

  /**
     * Line number in the creatorURL where this object was created.
     */
  long getConstructorLine();

  /**
     * jsdIValue for this object.
     */
  jsdIValue getValue();

}