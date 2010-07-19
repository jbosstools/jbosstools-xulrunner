/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/components/nsIComponentManagerObsolete.idl
 */

package org.mozilla.interfaces;

public interface nsIComponentManagerObsolete extends nsISupports {

  String NS_ICOMPONENTMANAGEROBSOLETE_IID =
    "{8458a740-d5dc-11d2-92fb-00e09805570f}";

  /**
     * findFactory
     *
     * Returns the factory object that can be used to create instances of
     * CID aClass
     *
     * @param aClass The classid of the factory that is being requested
     */
  nsIFactory findFactory(String aClass);

  /**
     * classIDToContractid
     *
     * Get the ContractID for a given ClassID. A ClassIDs may implement multiple
     * ContractIDs. This function return the last registered ContractID.
     *
     * @param aClass : ClassID for which ContractID is requested.
     * @return aClassName : returns class name asssociated with aClass
     * @return : ContractID last registered for aClass
     */
  String cLSIDToContractID(String aClass, String[] aClassName);

  /**
     * registryLocationForSpec
     *
     * Given a file specification, return the registry representation of
     * the filename. Files that are found relative to the components
     * directory will have a registry representation
     * "rel:<relative-native-path>" while filenames that are not, will have
     * "abs:<full-native-path>".
     */
  String registryLocationForSpec(nsIFile aSpec);

  /**
     * specForRegistyLocation
     *
     * Create a file specification for the registry representation (rel:/abs:)
     * got via registryLocationForSpec.
     */
  nsIFile specForRegistryLocation(String aLocation);

  /**
     * registerFactory
     *
     * Register a factory and ContractID associated with CID aClass
     *
     * @param aClass : CID of object
     * @param aClassName : Class Name of CID
     * @param aContractID : ContractID associated with CID aClass
     * @param aFactory : Factory that will be registered for CID aClass
     * @param aReplace : Boolean that indicates whether to replace a previous
     *                   registration for the CID aClass.
     */
  void registerFactory(String aClass, String aClassName, String aContractID, nsIFactory aFactory, boolean aReplace);

  /**
     * registerComponent
     *
     * Register a native dll module via its registry representation as returned
     * by registryLocationForSpec() as the container of CID implemenation
     * aClass and associate aContractID and aClassName to the CID aClass. Native
     * dll component type is assumed.
     *
     * @param aClass : CID implemenation contained in module
     * @param aClassName : Class name associated with CID aClass
     * @param aContractID : ContractID associated with CID aClass
     * @param aLocation : Location of module (dll). Format of this is the
     *                    registry representation as returned by
     *                    registryLocationForSpec()
     * @param aReplace : Boolean that indicates whether to replace a previous
     *                   module registration for aClass.
     * @param aPersist : Remember this registration across sessions.
     */
  void registerComponent(String aClass, String aClassName, String aContractID, String aLocation, boolean aReplace, boolean aPersist);

  /**
     * registerComponentWithType
     *
     * Register a module's location via its registry representation
     * as returned by registryLocationForSpec() as the container of CID implemenation
     * aClass of type aType and associate aContractID and aClassName to the CID aClass.
     *
     * @param aClass : CID implemenation contained in module
     * @param aClassName : Class name associated with CID aClass
     * @param aContractID : ContractID associated with CID aClass
     * @param aSpec : Filename spec for module's location.
     * @param aLocation : Location of module of type aType. Format of this string
     *                    is the registry representation as returned by
     *                    registryLocationForSpec()
     * @param aReplace : Boolean that indicates whether to replace a previous
     *                   loader registration for aClass.
     * @param aPersist : Remember this registration across sessions.
     * @param aType : Component Type of CID aClass.
     */
  void registerComponentWithType(String aClass, String aClassName, String aContractID, nsIFile aSpec, String aLocation, boolean aReplace, boolean aPersist, String aType);

  /**
     * registerComponentSpec
     *
     * Register a native dll module via its file specification as the container
     * of CID implemenation aClass and associate aContractID and aClassName to the
     * CID aClass. Native dll component type is assumed.
     *
     * @param aClass : CID implemenation contained in module
     * @param aClassName : Class name associated with CID aClass
     * @param aContractID : ContractID associated with CID aClass
     * @param aLibrary : File specification Location of module (dll).
     * @param aReplace : Boolean that indicates whether to replace a previous
     *                   module registration for aClass.
     * @param aPersist : Remember this registration across sessions.
     */
  void registerComponentSpec(String aClass, String aClassName, String aContractID, nsIFile aLibrary, boolean aReplace, boolean aPersist);

  /**
     * registerComponentLib
     *
     * Register a native dll module via its dll name (not full path) as the
     * container of CID implemenation aClass and associate aContractID and aClassName
     * to the CID aClass. Native dll component type is assumed and the system
     * services will be used to load this dll.
     *
     * @param aClass : CID implemenation contained in module
     * @param aClassName : Class name associated with CID aClass
     * @param aContractID : ContractID associated with CID aClass
     * @param aDllNameLocation : Dll name of module.
     * @param aReplace : Boolean that indicates whether to replace a previous
     *                   module registration for aClass.
     * @param aPersist : Remember this registration across sessions.
     */
  void registerComponentLib(String aClass, String aClassName, String aContractID, String aDllName, boolean aReplace, boolean aPersist);

  /**
     * unregisterFactory
     *
     * Unregister a factory associated with CID aClass.
     *
     * @param aClass : ClassID being unregistered
     * @param aFactory : Factory previously registered to create instances of
     *                   ClassID aClass.
     */
  void unregisterFactory(String aClass, nsIFactory aFactory);

  /**
     * unregisterComponent
     *
     * Disassociate module aLocation represented as registry location as returned
     * by registryLocationForSpec() as containing ClassID aClass.
     *
     * @param aClass : ClassID being unregistered
     * @param aLocation : Location of module. Format of this is the registry
     *                    representation as returned by registryLocationForSpec().
     *                    Components of any type will be unregistered.
     */
  void unregisterComponent(String aClass, String aLocation);

  /**
     * unregisterComponentSpec
     *
     * Disassociate module references by file specification aLibrarySpec as
     * containing ClassID aClass.
     */
  void unregisterComponentSpec(String aClass, nsIFile aLibrarySpec);

  /**
     * freeLibraries
     *
     * Enumerates all loaded modules and unloads unused modules.
     */
  void freeLibraries();

  /**
     * ID values for 'when'
     */
  int NS_Startup = 0;

  int NS_Script = 1;

  int NS_Timer = 2;

  int NS_Shutdown = 3;

  /**
     * autoRegister
     *
     * Enumerates directory looking for modules of all types and registers
     * modules who have changed (modtime or size) since the last time
     * autoRegister() was invoked.
     *
     * @param when : ID values of when the call is being made.
     * @param directory : Directory the will be enumerated.
     */
  void autoRegister(int when, nsIFile directory);

  /**
     * autoRegisterComponent
     *
     * Loads module using appropriate loader and gives it an opportunity to
     * register its CIDs if module's modtime or size changed since the last
     * time this was called.
     *
     * @param when : ID values of when the call is being made.
     * @param aFileLocation : File specification of module.
     */
  void autoRegisterComponent(int when, nsIFile aFileLocation);

  /**
     * autoUnregisterComponent
     *
     * Loads module using approriate loader and gives it an opportunity to
     * unregister its CIDs
     */
  void autoUnregisterComponent(int when, nsIFile aFileLocation);

  /**
     * isRegistered
     *
     * Returns true if a factory or module is registered for CID aClass.
     *
     * @param aClass : ClassID queried for registeration
     * @return : true if a factory or module is registered for CID aClass.
     *           false otherwise.
     */
  boolean isRegistered(String aClass);

  /**
     * enumerateCLSIDs
     *
     * Enumerate the list of all registered ClassIDs.
     *
     * @return : enumerator for ClassIDs.
     */
  nsIEnumerator enumerateCLSIDs();

  /**
     * enumerateContractIDs
     *
     * Enumerate the list of all registered ContractIDs.
     *
     * @return : enumerator for ContractIDs.
     */
  nsIEnumerator enumerateContractIDs();

}