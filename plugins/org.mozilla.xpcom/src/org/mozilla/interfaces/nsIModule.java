/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/components/nsIModule.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIModule interface.
 * @status FROZEN
 */
public interface nsIModule extends nsISupports {

  String NS_IMODULE_IID =
    "{7392d032-5371-11d3-994e-00805fd26fee}";

  /** 
     * Object Instance Creation
     *
     * Obtains a Class Object from a nsIModule for a given CID and IID pair.  
     * This class object can either be query to a nsIFactory or a may be 
     * query to a nsIClassInfo.
     *
     * @param aCompMgr  : The global component manager
     * @param aClass    : ClassID of object instance requested
     * @param aIID      : IID of interface requested
     * 
     */
  nsISupports getClassObject(nsIComponentManager aCompMgr, String aClass, String aIID);

  /**
     * One time registration callback
     *
     * When the nsIModule is discovered, this method will be
     * called so that any setup registration can be preformed.
     *
     * @param aCompMgr  : The global component manager
     * @param aLocation : The location of the nsIModule on disk
     * @param aLoaderStr: Opaque loader specific string
     * @param aType     : Loader Type being used to load this module 
     */
  void registerSelf(nsIComponentManager aCompMgr, nsIFile aLocation, String aLoaderStr, String aType);

  /**
     * One time unregistration callback
     *
     * When the nsIModule is being unregistered, this method will be
     * called so that any unregistration can be preformed
     *
     * @param aCompMgr   : The global component manager
     * @param aLocation  : The location of the nsIModule on disk
     * @param aLoaderStr : Opaque loader specific string
     * 
     */
  void unregisterSelf(nsIComponentManager aCompMgr, nsIFile aLocation, String aLoaderStr);

  /** 
    * Module load management
    * 
    * @param aCompMgr  : The global component manager
    *
    * @return indicates to the caller if the module can be unloaded.
    * 		Returning PR_TRUE isn't a guarantee that the module will be
    *		unloaded. It constitues only willingness of the module to be
    *		unloaded.  It is very important to ensure that no outstanding 
    *       references to the module's code/data exist before returning 
    *       PR_TRUE. 
    *		Returning PR_FALSE guaratees that the module won't be unloaded.
    */
  boolean canUnload(nsIComponentManager aCompMgr);

}