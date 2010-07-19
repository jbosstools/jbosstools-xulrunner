/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsILivemarkService.idl
 */

package org.mozilla.interfaces;

public interface nsILivemarkService extends nsISupports {

  String NS_ILIVEMARKSERVICE_IID =
    "{62a5fe00-d85c-4a63-aef7-176d8f1b189d}";

  /**
   * Starts the livemark refresh timer.
   * Being able to manually control this allows activity such
   * as bookmarks import to occur without kicking off HTTP traffic.
   */
  void start();

  /**
   * Stop the livemark refresh timer.
   */
  void stopUpdateLivemarks();

  /**
   * Creates a new livemark
   * @param folder      The id of the parent folder
   * @param name        The name to show when displaying the livemark
   * @param siteURI     The URI of the site the livemark was created from
   * @param feedURI     The URI of the actual RSS feed
   * @param index       The index to insert at, or -1 to append
   * @returns the ID of the folder for the livemark
   */
  long createLivemark(long folder, String name, nsIURI siteURI, nsIURI feedURI, int index);

  /**
   * Same as above, use during startup to avoid HTTP traffic
   */
  long createLivemarkFolderOnly(long folder, String name, nsIURI siteURI, nsIURI feedURI, int index);

  /**
   * Determines whether the folder with the given folder ID identifies
   * a livemark container.
   *
   * @param folder    A folder ID
   *
   * @returns true if the given folder is a livemark folder, or
   *          false otherwise
   *
   * @throws NS_ERROR_INVALID_ARG if the folder ID isn't known
   */
  boolean isLivemark(long folder);

  /**
   * Determines whether the feed URI is a currently registered livemark.
   *
   * @param aFeedURI
   *        Feed URI to look for.
   *
   * @returns the found livemark folder id, or -1 if nothing was found.
   */
  long getLivemarkIdForFeedURI(nsIURI aFeedURI);

  /**
   * Gets the URI of the website associated with a livemark container.
   *
   * @param container  The folder ID of a livemark container
   *
   * @returns nsIURI representing the URI of the website; if the livemark
   *          container doesn't have a valid site URI, null will be returned
   *
   * @throws NS_ERROR_INVALID_ARG if the folder ID isn't known or identifies
   *         a folder that isn't a livemark container
   * @throws NS_ERROR_MALFORMED_URI if the site URI annotation has
   *         somehow been corrupted (and can't be turned into an nsIURI)
   */
  nsIURI getSiteURI(long container);

  /**
   * Sets the URI of the website associated with a livemark container.
   *
   * @param container  The folder ID of a livemark container
   * @param siteURI    nsIURI object representing the site URI, or null
   *                   to clear the site URI for this livemark container
   *
   * @throws NS_ERROR_INVALID_ARG if the folder ID isn't known or identifies
   *         a folder that isn't a livemark container; also if the siteURI
   *         argument isn't a valid nsIURI object (or null)
   */
  void setSiteURI(long container, nsIURI siteURI);

  /**
   * Gets the URI of the syndication feed associated with a livemark container.
   *
   * @param container  The folder ID of a livemark container
   *
   * @returns nsIURI representing the URI of the feed; if the livemark
   *          container doesn't have a valid feed URI, null will be returned
   *          of the nsIURI object returned will be the empty string.
   *
   * @throws NS_ERROR_INVALID_ARG if the folder ID isn't known or identifies
   *         a folder that isn't a livemark container
   * @throws NS_ERROR_MALFORMED_URI if the site URI annotation has
   *         somehow been corrupted (and can't be turned into an nsIURI)
   */
  nsIURI getFeedURI(long container);

  /**
   * Sets the URI of the feed associated with a livemark container.
   *
   * NOTE: The caller is responsible for reloading the livemark after
   *       changing its feed URI (since the contents are likely to be different
   *       given a different feed).
   *
   * @param container  The folder ID of a livemark container
   * @param feedURI    nsIURI object representing the syndication feed URI
   *
   * @throws NS_ERROR_INVALID_ARG if the folder ID isn't known or identifies
   *         a folder that isn't a livemark container; also if the feedURI
   *         argument isn't a valid nsIURI object
   */
  void setFeedURI(long container, nsIURI feedURI);

  /**
	 * Reloads all livemark subscriptions, whether or not they've expired.
	 */
  void reloadAllLivemarks();

  /**
	 * Reloads the livemark with this folder ID, whether or not it's expired.
	 * @param folderID		The ID of the folder to be reloaded
	 */
  void reloadLivemarkFolder(long folderID);

}