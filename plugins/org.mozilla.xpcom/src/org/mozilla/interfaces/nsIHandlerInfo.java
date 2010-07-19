/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/mime/public/nsIMIMEInfo.idl
 */

package org.mozilla.interfaces;

/**
 * nsIHandlerInfo gives access to the information about how a given protocol
 * scheme or MIME-type is handled.
 */
public interface nsIHandlerInfo extends nsISupports {

  String NS_IHANDLERINFO_IID =
    "{325e56a7-3762-4312-aec7-f1fcf84b4145}";

  /**
     * The type of this handler info.  For MIME handlers, this is the MIME type.
     * For protocol handlers, it's the scheme.
     * 
     * @return String representing the type.
     */
  String getType();

  /**
     * A human readable description of the handler type
     */
  String getDescription();

  /**
     * A human readable description of the handler type
     */
  void setDescription(String aDescription);

  /**
     * The application the user has said they want associated with this content
     * type. This is not always guaranteed to be set!!
     */
  nsIHandlerApp getPreferredApplicationHandler();

  /**
     * The application the user has said they want associated with this content
     * type. This is not always guaranteed to be set!!
     */
  void setPreferredApplicationHandler(nsIHandlerApp aPreferredApplicationHandler);

  /**
     * Applications that can handle this content type.
     *
     * The list will include the preferred handler, if any.  Elements of this
     * array are nsIHandlerApp objects, and this attribute will always reference
     * an array, whether or not there are any possible handlers.  If there are
     * no possible handlers, the array will contain no elements, so just check
     * its length (nsIArray::length) to see if there are any possible handlers.
     */
  nsIMutableArray getPossibleApplicationHandlers();

  /**
     * Indicates whether a default application handler exists,
     * i.e. whether launchWithFile with action = useSystemDefault is possible
     * and defaultDescription will contain usable information.
     */
  boolean getHasDefaultHandler();

  /**
     * A pretty name description of the associated default application. Only
     * usable if hasDefaultHandler is true.
     */
  String getDefaultDescription();

  /**
     * Launches the application with the specified URI, in a way that
     * depends on the value of preferredAction. preferredAction must be
     * useHelperApp or useSystemDefault.
     *  
     * @note Only the URI scheme is used to determine how to launch.  This is
     * essentially a pass-by-value operation.  This means that in the case of
     * a file: URI, the handler that is registered for file: will be launched
     * and our code will not make any decision based on the content-type or
     * extension, though the invoked file: handler is free to do so. 
     *
     * @param aURI
     *        The URI to launch this application with
     *
     * @param aWindowContext 
     *        The window to parent the dialog against, and, if a web handler
     *        is chosen, it is loaded in this window as well.  See 
     *        nsIHandlerApp.launchWithURI for more details.
     *
     * @throw NS_ERROR_INVALID_ARG if preferredAction is not valid for this
     * call. Other exceptions may be thrown.
     */
  void launchWithURI(nsIURI aURI, nsIInterfaceRequestor aWindowContext);

  /**
     * preferredAction is how the user specified they would like to handle
     * this content type: save to disk, use specified helper app, use OS
     * default handler or handle using navigator; possible value constants
     * listed below
     */
  int getPreferredAction();

  /**
     * preferredAction is how the user specified they would like to handle
     * this content type: save to disk, use specified helper app, use OS
     * default handler or handle using navigator; possible value constants
     * listed below
     */
  void setPreferredAction(int aPreferredAction);

  int saveToDisk = 0;

  /**
     * Used to indicate that we know nothing about what to do with this.  You
     * could consider this to be not initialized.
     */
  int alwaysAsk = 1;

  int useHelperApp = 2;

  int handleInternally = 3;

  int useSystemDefault = 4;

  /**
     * alwaysAskBeforeHandling: if true, we should always give the user a
     * dialog asking how to dispose of this content.
     */
  boolean getAlwaysAskBeforeHandling();

  /**
     * alwaysAskBeforeHandling: if true, we should always give the user a
     * dialog asking how to dispose of this content.
     */
  void setAlwaysAskBeforeHandling(boolean aAlwaysAskBeforeHandling);

}