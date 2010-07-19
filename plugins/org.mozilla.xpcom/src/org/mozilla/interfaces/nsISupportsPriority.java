/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/threads/nsISupportsPriority.idl
 */

package org.mozilla.interfaces;

/**
 * This interface exposes the general notion of a scheduled object with a
 * integral priority value.  Following UNIX conventions, smaller (and possibly
 * negative) values have higher priority.
 *
 * This interface does not strictly define what happens when the priority of an
 * object is changed.  An implementation of this interface is free to define
 * the side-effects of changing the priority of an object.  In some cases,
 * changing the priority of an object may be disallowed (resulting in an
 * exception being thrown) or may simply be ignored.
 */
public interface nsISupportsPriority extends nsISupports {

  String NS_ISUPPORTSPRIORITY_IID =
    "{aa578b44-abd5-4c19-8b14-36d4de6fdc36}";

  /**
   * Typical priority values.
   */
  int PRIORITY_HIGHEST = -20;

  int PRIORITY_HIGH = -10;

  int PRIORITY_NORMAL = 0;

  int PRIORITY_LOW = 10;

  int PRIORITY_LOWEST = 20;

  /**
   * This attribute may be modified to change the priority of this object.  The
   * implementation of this interface is free to truncate a given priority
   * value to whatever limits are appropriate.  Typically, this attribute is
   * initialized to PRIORITY_NORMAL, but implementations may choose to assign a
   * different initial value.
   */
  int getPriority();

  /**
   * This attribute may be modified to change the priority of this object.  The
   * implementation of this interface is free to truncate a given priority
   * value to whatever limits are appropriate.  Typically, this attribute is
   * initialized to PRIORITY_NORMAL, but implementations may choose to assign a
   * different initial value.
   */
  void setPriority(int aPriority);

  /**
   * This method adjusts the priority attribute by a given delta.  It helps
   * reduce the amount of coding required to increment or decrement the value
   * of the priority attribute.
   */
  void adjustPriority(int delta);

}