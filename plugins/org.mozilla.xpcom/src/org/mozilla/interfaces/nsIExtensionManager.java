/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/mozapps/extensions/public/nsIExtensionManager.idl
 */

package org.mozilla.interfaces;

/**
 * Interface representing a system for the installation and management of
 * Extensions, Themes etc.
 *
 * XXXben - Some of this stuff should go into a management-ey interface,
 *          some into an app-startup-ey interface.
 */
public interface nsIExtensionManager extends nsISupports {

  String NS_IEXTENSIONMANAGER_IID =
    "{494e8302-8689-4a8a-a08d-0da17c649c7d}";

  /**
   * Constants representing types of update checks.
   */
  long UPDATE_CHECK_NEWVERSION = 0L;

  long UPDATE_CHECK_COMPATIBILITY = 1L;

  long UPDATE_SYNC_COMPATIBILITY = 2L;

  long UPDATE_NOTIFY_NEWVERSION = 3L;

  /**
   * Constants that callers can use to indicate the reason for an add-on update
   * check. Internal code uses other constants in nsExtensionManager.js.in.
   *
   * The update check is being performed at the request of the user.
   */
  long UPDATE_WHEN_USER_REQUESTED = 1L;

  /**
   * The update check is being performed after a new version of the application
   * has been detected.
   */
  long UPDATE_WHEN_NEW_APP_DETECTED = 2L;

  /**
   * The update check is being performed after a new version of the application
   * has been installed.
   */
  long UPDATE_WHEN_NEW_APP_INSTALLED = 3L;

  /**
   * Starts the Extension Manager, checking for item changes, additions and
   * removals, and finishing pending operations.
   * @returns true if the application has rewritten the extensions.ini file
   *          and needs to restart to register components/chrome etc,
   *          false otherwise
   */
  boolean start();

  /**
   * Determines if there are incompatible items installed (and offers to
   * upgrade them to newer versions if available, via a UI).
   * @returns true if there were incompatible items that were disabled
   *          and the application needs to restart to re-register components,
   *          chrome etc, false otherwise.
   */
  boolean checkForMismatches();

  /**
   * Gets the Install Location for an item
   * @param   id
   *          The GUID of the item
   * @returns The Install Location where the item is installed or null if the
   *          location cannot be obtained (e.g. an invalid id).
   */
  nsIInstallLocation getInstallLocation(String id);

  /**
   * An enumeration of all registered Install Items
   */
  nsISimpleEnumerator getInstallLocations();

  /**
   * Installs an item from a XPI/JAR file into the location specified.
   * @param   xpiFile
   *          The source file to install from. This function stages a copy
   *          of this file for persistence across potential application
   *          restarts, you are responsible for removing the file you pass
   *          in.
   * @param   installLocationKey
   *          The name identifier of an Install Location to install into.
   */
  void installItemFromFile(nsIFile xpiFile, String installLocationKey);

  /**
   * Uninstalls an item
   * @param   id
   *          The GUID of the item.
   */
  void uninstallItem(String id);

  /**
   * Enables a disabled item
   * @param   id
   *          The GUID of the item.
   */
  void enableItem(String id);

  /**
   * Disables an enabled item
   * @param   id
   *          The GUID of the item.
   */
  void disableItem(String id);

  /**
   * Checks for updates to a list of items.
   * @param   items
   *          An array of nsIUpdateItems to check for updates for.
   * @param   itemCount
   *          The length of |items|
   * @param   updateCheckType
   *          UPDATE_CHECK_NEWVERSION if this check should find the newest
   *          versions available and write the results to the extensions
   *          datasource.
   *          UPDATE_CHECK_COMPATIBILITY if this check should only find newer
   *          target application compatibility information for the currently
   *          installed version and write the results to the extensions
   *          datasource.
   *          UPDATE_SYNC_COMPATIBILITY if this check should only find target
   *          application compatibility information for the currently
   *          installed version and synchronize the values to the extensions
   *          datasource.
   *          UPDATE_NOTIFY_NEWVERSION if this check should find the newest
   *          versions available without updating the extensions datasource.
   * @param   listener
   *          An nsIAddonUpdateCheckListener object which will be notified
   *          during the update check process. If not null, the object's
   *          onUpdateStarted() and onUpdateEnded() methods will be called even
   *          if there are no items to update.
   * @param   updateType (optional)
   *          The type of the update check. Should be one of the UPDATE_WHEN
   *          values.
   * @param   appVersion (optional)
   *          The version of the application to check for compatible updates.
   *          This param is only honored when updateCheckType is equal to
   *          UPDATE_NOTIFY_NEWVERSION and it defaults to the current version of
   *          the application when it is not specified.
   * @param   platformVersion (optional)
   *          The version of the toolkit to check for compatible updates.
   *          This param is only honored when updateCheckType is equal to
   *          UPDATE_NOTIFY_NEWVERSION and it defaults to the current version of
   *          the toolkit when it is not specified.
   *
   * @throws  NS_ERROR_ILLEGAL_VALUE if any item is invalid.
   */
  void update(nsIUpdateItem[] items, long itemCount, long updateCheckType, nsIAddonUpdateCheckListener listener, long updateType, String appVersion, String platformVersion);

  /**
   * Gets a nsIUpdateItem for the item with the specified id.
   * @param   id
   *          The GUID of the item to construct a nsIUpdateItem for.
   * @returns The nsIUpdateItem representing the item or null if the item does
   *          not exist.
   */
  nsIUpdateItem getItemForID(String id);

  /**
   * Retrieves a list of visible nsIUpdateItems of items matching the
   * specified type.
   * @param   type
   *          The type of item to return.
   * @param   countRef
   *          The XPCJS reference to the number of items returned.
   * @returns An array of nsIUpdateItems matching the id/type filter.
   *
   * XXXben - it would be good if this function took an optional
   *          install location.
   */
  nsIUpdateItem[] getItemList(long type, long[] itemCount);

  /**
   * Retrieves a list of nsIUpdateItems of items that are incompatible
   * with the supplied parameters.
   * @param   appVersion
   *          The version of the application to check compatibility against
   * @param   platformVersion
   *          The version of the toolkit to check compatibility against
   * @param   type
   *          The type of item to return
   * @param   includeDisabled
   *          true if disabled items should be included in the result set,
   *          false otherwise
   * @param   countRef
   *          The XPCJS reference to the number of items returned.
   * @returns An array of incompatible nsIUpdateItems.
   */
  nsIUpdateItem[] getIncompatibleItemList(String appVersion, String platformVersion, long type, boolean includeDisabled, long[] itemCount);

  /**
   * The Extensions Datasource
   * XXXben - the datasource should be registered with the RDF system, so it
   *          can be accessed via rdf:extensions, and not exposed through the API
   *          like this.
   */
  nsIRDFDataSource getDatasource();

  /**
   * Adds active download entries to the UI
   * @param   items
   *          A list of nsIUpdateItems to entries to add
   * @param   itemCount
   *          The length of |items|
   * @param   manager
   *          null when called from chrome
   *          the XPInstallManager when not called from chrome (e.g. web page)
   *
   * @throws  NS_ERROR_ILLEGAL_VALUE if any item is invalid, or if itemCount == 0.
   */
  void addDownloads(nsIUpdateItem[] items, long itemCount, nsIObserver manager);

  /**
   * Removes an active download from the UI
   * @param   url
   *          The URL of the active download to remove
   */
  void removeDownload(String url);

  /**
   * Adds an install listener so the front end can listen to download
   * and install progress.
   * @param   listener
   *          The listener to add
   * @returns the index of the added listen in the listener list.
   */
  int addInstallListener(nsIAddonInstallListener listener);

  /**
   * Removes an install progress listener.
   * @param   index
   *          The index of the listener to remove.
   */
  void removeInstallListenerAt(int index);

  /**
   * Cancels a pending install or upgrade of an item. If the item does
   * not have a pending install or upgrade then this will do nothing.
   * @param   id
   *          The ID of the item.
   */
  void cancelInstallItem(String id);

  /**
   * Cancels a pending uninstall of an item
   * @param   id
   *          The ID of the item.
   */
  void cancelUninstallItem(String id);

  /**
   * Retrieves a list of installed nsIUpdateItems of items that are dependent
   * on another item.
   * @param   id
   *          The ID of the item that other items depend on.
   * @param   includeDisabled
   *          Whether to include disabled items in the set returned.
   * @param   countRef
   *          The XPCJS reference to the number of items returned.
   * @returns An array of installed nsIUpdateItems that depend on the item
   *          specified by the id parameter.
   */
  nsIUpdateItem[] getDependentItemListForID(String id, boolean includeDisabled, long[] itemCount);

  /**
   * Checks for changes to the blocklist using the local blocklist file.
   * This will immediately application disable items that have been hard blocked
   * and application enable items that are no longer hard blocked. It will also
   * return items that are either soft or hard blocked and aren't already
   * disabled or disabled pending a restart.
   *
   * This is likely to change or go away in the future and should not be used
   * by anyone outside of the blocklist service.
   *
   * @returns An array of nsIUpdateItems that are blocklisted or the user should
   *          be warned about but are currently enabled.
   */
  nsIUpdateItem[] updateAndGetNewBlocklistedItems(long[] itemCount);

}