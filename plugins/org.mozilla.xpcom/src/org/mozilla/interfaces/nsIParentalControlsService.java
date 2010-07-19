/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/parentalcontrols/public/nsIParentalControlsService.idl
 */

package org.mozilla.interfaces;

public interface nsIParentalControlsService extends nsISupports {

  String NS_IPARENTALCONTROLSSERVICE_IID =
    "{871cf229-2b21-4f04-b24d-e08061f14815}";

  /**
   * @returns true if the current user account has parental controls
   * restrictions enabled.
   */
  boolean getParentalControlsEnabled();

  /**
   * @returns true if the current user account parental controls
   * restrictions include the blocking of all file downloads.
   */
  boolean getBlockFileDownloadsEnabled();

  /**
   * Request that blocked URI(s) be allowed through parental
   * control filters. Returns true if the URI was successfully
   * overriden. Note, may block while native UI is shown.
   *
   * @param aTarget(s)          URI to be overridden. In the case of
   *                            multiple URI, the first URI in the array
   *                            should be the root URI of the site.
   * @param window              Window that generates the event.
   */
  boolean requestURIOverride(nsIURI aTarget, nsIInterfaceRequestor aWindowContext);

  boolean requestURIOverrides(nsIArray aTargets, nsIInterfaceRequestor aWindowContext);

  /**
   * @returns true if the current user account has parental controls
   * logging enabled. If true, applications should log relevent events
   * using 'log'.
   */
  boolean getLoggingEnabled();

  /**
   * Log entry types. Additional types can be defined and implemented
   * as needed. Other possible event types might include email events,
   * media related events, and IM events. 
   */
  short ePCLog_URIVisit = 1;

  short ePCLog_FileDownload = 2;

  /**
   * Log an application specific parental controls
   * event.
   *
   * @param aEntryType       Constant defining the type of event.
   * @param aFlag            A flag indicating if the subject content
   *                         was blocked.
   * @param aSource          The URI source of the subject content.
   * @param aTarget          The location the content was saved to if
   *                         no blocking occured.
   */
  void log(short aEntryType, boolean aFlag, nsIURI aSource, nsIFile aTarget);

}