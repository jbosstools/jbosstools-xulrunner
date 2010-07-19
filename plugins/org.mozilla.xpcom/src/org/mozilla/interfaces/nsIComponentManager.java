/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/components/nsIComponentManager.idl
 */

package org.mozilla.interfaces;

public interface nsIComponentManager extends nsISupports {

  String NS_ICOMPONENTMANAGER_IID =
    "{a88e5a60-205a-4bb1-94e1-2628daf51eae}";

  /**
     * getClassObject
     *
     * Returns the factory object that can be used to create instances of
     * CID aClass
     *
     * @param aClass The classid of the factory that is being requested
     */
  nsISupports getClassObject(String aClass, String aIID);

  /**
     * getClassObjectByContractID
     *
     * Returns the factory object that can be used to create instances of
     * CID aClass
     *
     * @param aClass The classid of the factory that is being requested
     */
  nsISupports getClassObjectByContractID(String aContractID, String aIID);

  /**
     * createInstance
     *
     * Create an instance of the CID aClass and return the interface aIID.
     *
     * @param aClass : ClassID of object instance requested
     * @param aDelegate : Used for aggregation
     * @param aIID : IID of interface requested
     */
  nsISupports createInstance(String aClass, nsISupports aDelegate, String aIID);

  /**
     * createInstanceByContractID
     *
     * Create an instance of the CID that implements aContractID and return the
     * interface aIID. 
     *
     * @param aContractID : aContractID of object instance requested
     * @param aDelegate : Used for aggregation
     * @param aIID : IID of interface requested
     */
  nsISupports createInstanceByContractID(String aContractID, nsISupports aDelegate, String aIID);

}