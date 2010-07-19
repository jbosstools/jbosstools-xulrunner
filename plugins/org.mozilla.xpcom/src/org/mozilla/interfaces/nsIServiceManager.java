/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/components/nsIServiceManager.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIServiceManager manager interface provides a means to obtain
 * global services in an application. The service manager depends on the 
 * repository to find and instantiate factories to obtain services.
 *
 * Users of the service manager must first obtain a pointer to the global
 * service manager by calling NS_GetServiceManager. After that, 
 * they can request specific services by calling GetService. When they are
 * finished they can NS_RELEASE() the service as usual.
 *
 * A user of a service may keep references to particular services indefinitely
 * and only must call Release when it shuts down.
 *
 * @status FROZEN
 */
public interface nsIServiceManager extends nsISupports {

  String NS_ISERVICEMANAGER_IID =
    "{8bb35ed9-e332-462d-9155-4a002ab5c958}";

  /**
     * getServiceByContractID
     *
     * Returns the instance that implements aClass or aContractID and the
     * interface aIID.  This may result in the instance being created.
     *
     * @param aClass or aContractID : aClass or aContractID of object 
     *                                instance requested
     * @param aIID : IID of interface requested
     * @param result : resulting service 
     */
  nsISupports getService(String aClass, String aIID);

  nsISupports getServiceByContractID(String aContractID, String aIID);

  /**
     * isServiceInstantiated
     *
     * isServiceInstantiated will return a true if the service has already
     * been created, otherwise false
     *
     * @param aClass or aContractID : aClass or aContractID of object 
     *                                instance requested
     * @param aIID : IID of interface requested
     * @param aIID : IID of interface requested
     */
  boolean isServiceInstantiated(String aClass, String aIID);

  boolean isServiceInstantiatedByContractID(String aContractID, String aIID);

}