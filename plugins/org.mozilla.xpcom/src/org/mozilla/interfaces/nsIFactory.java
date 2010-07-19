/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/components/nsIFactory.idl
 */

package org.mozilla.interfaces;

/**
 * A class factory allows the creation of nsISupports derived
 * components without specifying a concrete base class.  
 *
 * @status FROZEN
 */
public interface nsIFactory extends nsISupports {

  String NS_IFACTORY_IID =
    "{00000001-0000-0000-c000-000000000046}";

  /**
    * Creates an instance of a component.
    *
    * @param aOuter Pointer to a component that wishes to be aggregated
    *               in the resulting instance. This will be nsnull if no
    *               aggregation is requested.
    * @param iid    The IID of the interface being requested in
    *               the component which is being currently created.
    * @param result [out] Pointer to the newly created instance, if successful.
    * @return NS_OK - Component successfully created and the interface 
    *                 being requested was successfully returned in result.
    *         NS_NOINTERFACE - Interface not accessible.
    *         NS_ERROR_NO_AGGREGATION - if an 'outer' object is supplied, but the
    *                                   component is not aggregatable.
    *         NS_ERROR* - Method failure.
    */
  nsISupports createInstance(nsISupports aOuter, String iid);

  /**
    * LockFactory provides the client a way to keep the component
    * in memory until it is finished with it. The client can call
    * LockFactory(PR_TRUE) to lock the factory and LockFactory(PR_FALSE)
    * to release the factory.	 
    *
    * @param lock - Must be PR_TRUE or PR_FALSE
    * @return NS_OK - If the lock operation was successful.
    *         NS_ERROR* - Method failure.
    */
  void lockFactory(boolean lock);

}