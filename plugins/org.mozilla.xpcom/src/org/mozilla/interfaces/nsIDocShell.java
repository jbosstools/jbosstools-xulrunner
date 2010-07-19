/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsIDocShell.idl
 */

package org.mozilla.interfaces;

public interface nsIDocShell extends nsISupports {

  String NS_IDOCSHELL_IID =
    "{8adfb831-1053-4a19-884d-bcdad7277b4b}";

  int INTERNAL_LOAD_FLAGS_NONE = 0;

  int INTERNAL_LOAD_FLAGS_INHERIT_OWNER = 1;

  int INTERNAL_LOAD_FLAGS_DONT_SEND_REFERRER = 2;

  int INTERNAL_LOAD_FLAGS_ALLOW_THIRD_PARTY_FIXUP = 4;

  int INTERNAL_LOAD_FLAGS_FIRST_LOAD = 8;

  int INTERNAL_LOAD_FLAGS_BYPASS_CLASSIFIER = 16;

  int INTERNAL_LOAD_FLAGS_FORCE_ALLOW_COOKIES = 32;

  /**
   * Creates a DocShellLoadInfo object that you can manipulate and then pass
   * to loadURI.
   */
  void createLoadInfo(nsIDocShellLoadInfo[] loadInfo);

  /**
   * Reset state to a new content model within the current document and the document
   * viewer.  Called by the document before initiating an out of band document.write().
   */
  void prepareForNewContentModel();

  /**
   * For editors and suchlike who wish to change the URI associated with the
   * document. Note if you want to get the current URI, use the read-only
   * property on nsIWebNavigation.
   */
  void setCurrentURI(nsIURI aURI);

  /**
   * Content Viewer that is currently loaded for this DocShell.  This may
   * change as the underlying content changes.
   */
  nsIContentViewer getContentViewer();

  /**
   * This attribute allows chrome to tie in to handle DOM events that may
   * be of interest to chrome.
   */
  nsIDOMEventTarget getChromeEventHandler();

  /**
   * This attribute allows chrome to tie in to handle DOM events that may
   * be of interest to chrome.
   */
  void setChromeEventHandler(nsIDOMEventTarget aChromeEventHandler);

  /**
   * The document charset info.  This is used by a load to determine priorities
   * for charset detection etc.
   */
  nsIDocumentCharsetInfo getDocumentCharsetInfo();

  /**
   * The document charset info.  This is used by a load to determine priorities
   * for charset detection etc.
   */
  void setDocumentCharsetInfo(nsIDocumentCharsetInfo aDocumentCharsetInfo);

  /**
   * Whether to allow plugin execution
   */
  boolean getAllowPlugins();

  /**
   * Whether to allow plugin execution
   */
  void setAllowPlugins(boolean aAllowPlugins);

  /**
   * Whether to allow Javascript execution
   */
  boolean getAllowJavascript();

  /**
   * Whether to allow Javascript execution
   */
  void setAllowJavascript(boolean aAllowJavascript);

  /**
   * Attribute stating if refresh based redirects can be allowed
   */
  boolean getAllowMetaRedirects();

  /**
   * Attribute stating if refresh based redirects can be allowed
   */
  void setAllowMetaRedirects(boolean aAllowMetaRedirects);

  /**
   * Attribute stating if it should allow subframes (framesets/iframes) or not
   */
  boolean getAllowSubframes();

  /**
   * Attribute stating if it should allow subframes (framesets/iframes) or not
   */
  void setAllowSubframes(boolean aAllowSubframes);

  /**
   * Attribute stating whether or not images should be loaded.
   */
  boolean getAllowImages();

  /**
   * Attribute stating whether or not images should be loaded.
   */
  void setAllowImages(boolean aAllowImages);

  /**
   * Attribute that determines whether DNS prefetch is allowed for this subtree
   * of the docshell tree.  Defaults to true.  Setting this will make it take
   * effect starting with the next document loaded in the docshell.
   */
  boolean getAllowDNSPrefetch();

  /**
   * Attribute that determines whether DNS prefetch is allowed for this subtree
   * of the docshell tree.  Defaults to true.  Setting this will make it take
   * effect starting with the next document loaded in the docshell.
   */
  void setAllowDNSPrefetch(boolean aAllowDNSPrefetch);

  /**
   * Get an enumerator over this docShell and its children.
   *
   * @param aItemType  - Only include docShells of this type, or if typeAll,
   *                     include all child shells.
   *                     Uses types from nsIDocShellTreeItem.
   * @param aDirection - Whether to enumerate forwards or backwards.
   */
  int ENUMERATE_FORWARDS = 0;

  int ENUMERATE_BACKWARDS = 1;

  nsISimpleEnumerator getDocShellEnumerator(int aItemType, int aDirection);

  /**
   * The type of application that created this window
   */
  long APP_TYPE_UNKNOWN = 0L;

  long APP_TYPE_MAIL = 1L;

  long APP_TYPE_EDITOR = 2L;

  long getAppType();

  void setAppType(long aAppType);

  /**
   * certain dochshells (like the message pane)
   * should not throw up auth dialogs
   * because it can act as a password trojan
   */
  boolean getAllowAuth();

  /**
   * certain dochshells (like the message pane)
   * should not throw up auth dialogs
   * because it can act as a password trojan
   */
  void setAllowAuth(boolean aAllowAuth);

  /**
   * Set/Get the document scale factor.  When setting this attribute, a
   * NS_ERROR_NOT_IMPLEMENTED error may be returned by implementations
   * not supporting zoom.  Implementations not supporting zoom should return
   * 1.0 all the time for the Get operation.  1.0 by the way is the default
   * of zoom.  This means 100% of normal scaling or in other words normal size
   * no zoom. 
   */
  float getZoom();

  /**
   * Set/Get the document scale factor.  When setting this attribute, a
   * NS_ERROR_NOT_IMPLEMENTED error may be returned by implementations
   * not supporting zoom.  Implementations not supporting zoom should return
   * 1.0 all the time for the Get operation.  1.0 by the way is the default
   * of zoom.  This means 100% of normal scaling or in other words normal size
   * no zoom. 
   */
  void setZoom(float aZoom);

  int getMarginWidth();

  void setMarginWidth(int aMarginWidth);

  int getMarginHeight();

  void setMarginHeight(int aMarginHeight);

  void tabToTreeOwner(boolean forward, boolean[] tookFocus);

  /**
   * Current busy state for DocShell
   */
  long BUSY_FLAGS_NONE = 0L;

  long BUSY_FLAGS_BUSY = 1L;

  long BUSY_FLAGS_BEFORE_PAGE_LOAD = 2L;

  long BUSY_FLAGS_PAGE_LOADING = 4L;

  /**
   * Load commands for the document 
   */
  long LOAD_CMD_NORMAL = 1L;

  long LOAD_CMD_RELOAD = 2L;

  long LOAD_CMD_HISTORY = 4L;

  long getBusyFlags();

  long getLoadType();

  void setLoadType(long aLoadType);

  boolean isBeingDestroyed();

  boolean getIsExecutingOnLoadHandler();

  nsISupports getLayoutHistoryState();

  void setLayoutHistoryState(nsISupports aLayoutHistoryState);

  boolean getShouldSaveLayoutState();

  /**
   * The SecureBrowserUI object for this docshell.  This is set by XUL
   * <browser> or nsWebBrowser for their root docshell.
   */
  nsISecureBrowserUI getSecurityUI();

  /**
   * The SecureBrowserUI object for this docshell.  This is set by XUL
   * <browser> or nsWebBrowser for their root docshell.
   */
  void setSecurityUI(nsISecureBrowserUI aSecurityUI);

  /**
   * Cancel the XPCOM timers for each meta-refresh URI in this docshell,
   * and this docshell's children, recursively. The meta-refresh timers can be
   * restarted using resumeRefreshURIs().  If the timers are already suspended,
   * this has no effect.
   */
  void suspendRefreshURIs();

  /**
   * Restart the XPCOM timers for each meta-refresh URI in this docshell,
   * and this docshell's children, recursively.  If the timers are already
   * running, this has no effect.
   */
  void resumeRefreshURIs();

  /**
   * Begin firing WebProgressListener notifications for restoring a page
   * presentation. |viewer| is the content viewer whose document we are
   * starting to load.  If null, it defaults to the docshell's current content
   * viewer, creating one if necessary.  |top| should be true for the toplevel
   * docshell that is being restored; it will be set to false when this method
   * is called for child docshells.  This method will post an event to
   * complete the simulated load after returning to the event loop.
   */
  void beginRestore(nsIContentViewer viewer, boolean top);

  /**
   * Finish firing WebProgressListener notifications and DOM events for
   * restoring a page presentation.  This should only be called via
   * beginRestore().
   */
  void finishRestore();

  boolean getRestoringDocument();

  boolean getUseErrorPages();

  void setUseErrorPages(boolean aUseErrorPages);

  /**
   * Keeps track of the previous SHTransaction index and the current
   * SHTransaction index at the time that the doc shell begins to load.
   * Used for ContentViewer eviction.
   */
  int getPreviousTransIndex();

  int getLoadedTransIndex();

  /**
   * Notification that entries have been removed from the beginning of a
   * nsSHistory which has this as its rootDocShell.
   *
   * @param numEntries - The number of entries removed
   */
  void historyPurged(int numEntries);

  nsIDOMStorage getSessionStorageForURI(nsIURI uri);

  nsIDOMStorage getSessionStorageForPrincipal(nsIPrincipal principal, boolean create);

  void addSessionStorage(nsIPrincipal principal, nsIDOMStorage storage);

  /**
   * Gets the channel for the currently loaded document, if any. 
   * For a new document load, this will be the channel of the previous document
   * until after OnLocationChange fires.
   */
  nsIChannel getCurrentDocumentChannel();

  /**
   * Find out whether the docshell is currently in the middle of a page
   * transition. This is set just before the pagehide/unload events fire.
   */
  boolean getIsInUnload();

  /**
   * Find out if the currently loaded document came from a suspicious channel
   * (such as a JAR channel where the server-returned content type isn't a
   * known JAR type).
   */
  boolean getChannelIsUnsafe();

  /**
   * If true, this browser is not visible in the traditional sense, but
   * is actively being rendered to the screen (ex. painted on a canvas)
   * and should be treated accordingly.
   **/
  boolean getIsOffScreenBrowser();

  /**
   * If true, this browser is not visible in the traditional sense, but
   * is actively being rendered to the screen (ex. painted on a canvas)
   * and should be treated accordingly.
   **/
  void setIsOffScreenBrowser(boolean aIsOffScreenBrowser);

}