/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/base/nsIInterfaceRequestor.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIInterfaceRequestor interface defines a generic interface for 
 * requesting interfaces that a given object might provide access to.
 * This is very similar to QueryInterface found in nsISupports.  
 * The main difference is that interfaces returned from GetInterface()
 * are not required to provide a way back to the object implementing this 
 * interface.  The semantics of QI() dictate that given an interface A that 
 * you QI() on to get to interface B, you must be able to QI on B to get back 
 * to A.  This interface however allows you to obtain an interface C from A 
 * that may or most likely will not have the ability to get back to A. 
 *
 * @status FROZEN
 */
public interface nsIInterfaceRequestor extends nsISupports {

  String NS_IINTERFACEREQUESTOR_IID =
    "{033a1470-8b2a-11d3-af88-00a024ffc08c}";

  /**
    * Retrieves the specified interface pointer.
    *
    * @param uuid The IID of the interface being requested.
    * @param result [out] The interface pointer to be filled in if
    *               the interface is accessible.
    * @return NS_OK - interface was successfully returned.
    *         NS_NOINTERFACE - interface not accessible.
    *         NS_ERROR* - method failure.
    */
  nsISupports getInterface(String uuid);

}