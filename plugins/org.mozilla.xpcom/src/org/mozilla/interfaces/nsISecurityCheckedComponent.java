/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/caps/idl/nsISecurityCheckedComponent.idl
 */

package org.mozilla.interfaces;

/**
 * Each method of this interface should return a string representing the
 * script capability needed to perform the operation on the target component.
 *
 * Return values of 'allAccess' or 'noAccess' unconditionally allow or deny
 * access to the operation.
 */
public interface nsISecurityCheckedComponent extends nsISupports {

  String NS_ISECURITYCHECKEDCOMPONENT_IID =
    "{0dad9e8c-a12d-4dcb-9a6f-7d09839356e1}";

  String canCreateWrapper(String iid);

  String canCallMethod(String iid, String methodName);

  String canGetProperty(String iid, String propertyName);

  String canSetProperty(String iid, String propertyName);

}