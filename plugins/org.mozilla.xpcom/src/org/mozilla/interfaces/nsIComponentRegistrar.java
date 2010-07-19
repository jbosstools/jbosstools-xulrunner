/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/components/nsIComponentRegistrar.idl
 */

package org.mozilla.interfaces;

public interface nsIComponentRegistrar extends nsISupports {

  String NS_ICOMPONENTREGISTRAR_IID =
    "{2417cbfe-65ad-48a6-b4b6-eb84db174392}";

  /**
     * autoRegister
     *
     * Register a component file or all component files in a directory.  
     *
     * Component files must have an associated loader and export the required
     * symbols which this loader defines.  For example, if the given file is a
     * native library (which is built into XPCOM), it must export the symbol 
     * "NSGetModule".  Other loaders may have different semantics.
     *
     * This method may only be called from the main thread.
     * 
     * @param aSpec    : Filename spec for component file's location. If aSpec 
     *                   is a directory, then every component file in the
     *                   directory will be registered. 
     *                   If aSpec is null, static components, GRE components,
     *                   and the application's component directories will be
     *                   registered. See NS_GRE_DIR, NS_XPCOM_COMPONENT_DIR,
     *                   and NS_XPCOM_COMPONENT_DIR_LIST in
     *                   nsDirectoryServiceDefs.h.
     */
  void autoRegister(nsIFile aSpec);

  /**
     * autoUnregister
     *
     * Unregister a component file or all component files in a directory.  
     * This method may only be called from the main thread.
     *
     * @param aSpec    : Filename spec for component file's location. If aSpec 
     *                   is a directory, the every component file in the directory 
     *                   will be registered.  
     *                   If aSpec is null, then the application component's 
     *                   directory as defined by NS_XPCOM_COMPONENT_DIR will be 
     *                   registered. (see nsIDirectoryService.idl)
     *
     * @return NS_OK     Unregistration was successful.
     *         NS_ERROR* Method failure.
     */
  void autoUnregister(nsIFile aSpec);

  /**
     * registerFactory
     *
     * Register a factory with a given ContractID, CID and Class Name.
     *
     * @param aClass      : CID of object
     * @param aClassName  : Class Name of CID
     * @param aContractID : ContractID associated with CID aClass
     * @param aFactory    : Factory that will be registered for CID aClass
     *
     * @return NS_OK        Registration was successful.
     *         NS_ERROR*    method failure.
     */
  void registerFactory(String aClass, String aClassName, String aContractID, nsIFactory aFactory);

  /**
     * unregisterFactory
     *
     * Unregister a factory associated with CID aClass.
     *
     * @param aClass   : CID being unregistered
     * @param aFactory : Factory previously registered to create instances of
     *                   CID aClass.
     *
     * @return NS_OK     Unregistration was successful.
     *         NS_ERROR* Method failure.
     */
  void unregisterFactory(String aClass, nsIFactory aFactory);

  /**
     * registerFactoryLocation
     *
     * Register a factory with a given ContractID, CID and Class Name
     *
     * @param aClass      : CID of object
     * @param aClassName  : Class Name of CID
     * @param aContractID : ContractID associated with CID aClass
     * @param aFile       : Component File. This file must have an associated 
     *                      loader and export the required symbols which this 
     *                      loader specifies.
     * @param aLoaderStr  : Opaque loader specific string.  This value is
     *                      passed into the nsIModule's registerSelf
     *                      callback and must be fowarded unmodified when
     *                      registering factories via their location.
     * @param aType       : Component Type of CID aClass.  This value is
     *                      passed into the nsIModule's registerSelf
     *                      callback and must be fowarded unmodified when
     *                      registering factories via their location.
     *
     * @return NS_OK        Registration was successful.
     *         NS_ERROR*    Method failure.
     */
  void registerFactoryLocation(String aClass, String aClassName, String aContractID, nsIFile aFile, String aLoaderStr, String aType);

  /**
     * unregisterFactoryLocation
     *
     * Unregister a factory associated with CID aClass.
     *
     * @param aClass   : CID being unregistered
     * @param aFile    : Component File previously registered
     *
     * @return NS_OK     Unregistration was successful.
     *         NS_ERROR* Method failure.
     */
  void unregisterFactoryLocation(String aClass, nsIFile aFile);

  /**
     * isCIDRegistered
     *
     * Returns true if a factory is registered for the CID.
     *
     * @param aClass : CID queried for registeration
     * @return       : true if a factory is registered for CID 
     *                 false otherwise.
     */
  boolean isCIDRegistered(String aClass);

  /**
     * isContractIDRegistered
     *
     * Returns true if a factory is registered for the contract id.
     *
     * @param aClass : contract id queried for registeration
     * @return       : true if a factory is registered for contract id 
     *                 false otherwise.
     */
  boolean isContractIDRegistered(String aContractID);

  /**
     * enumerateCIDs
     *
     * Enumerate the list of all registered CIDs.
     *
     * @return : enumerator for CIDs.  Elements of the enumeration can be QI'ed
     *           for the nsISupportsID interface.  From the nsISupportsID, you 
     *           can obtain the actual CID.
     */
  nsISimpleEnumerator enumerateCIDs();

  /**
     * enumerateContractIDs
     *
     * Enumerate the list of all registered ContractIDs.
     *
     * @return : enumerator for ContractIDs. Elements of the enumeration can be 
     *           QI'ed for the nsISupportsCString interface.  From  the
     *           nsISupportsCString interface, you can obtain the actual 
     *           Contract ID string.
     */
  nsISimpleEnumerator enumerateContractIDs();

  /**
     * CIDToContractID
     *
     * Returns the Contract ID for a given CID, if one exists and is registered.
     *
     * @return : Contract ID.
     */
  String cIDToContractID(String aClass);

  /**
     * contractIDToCID
     *
     * Returns the CID for a given Contract ID, if one exists and is registered.
     *
     * @return : Contract ID.
     */
  String contractIDToCID(String aContractID);

}