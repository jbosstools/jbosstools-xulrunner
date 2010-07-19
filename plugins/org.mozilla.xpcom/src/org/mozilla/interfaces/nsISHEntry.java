/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/shistory/public/nsISHEntry.idl
 */

package org.mozilla.interfaces;

public interface nsISHEntry extends nsIHistoryEntry {

  String NS_ISHENTRY_IID =
    "{09fecea6-5453-43ba-bf91-3ff32618f037}";

  /** URI for the document */
  void setURI(nsIURI aURI);

  /** Referrer URI */
  nsIURI getReferrerURI();

  /** Referrer URI */
  void setReferrerURI(nsIURI aReferrerURI);

  /** Content viewer, for fast restoration of presentation */
  nsIContentViewer getContentViewer();

  /** Content viewer, for fast restoration of presentation */
  void setContentViewer(nsIContentViewer aContentViewer);

  /** Whether the content viewer is marked "sticky" */
  boolean getSticky();

  /** Whether the content viewer is marked "sticky" */
  void setSticky(boolean aSticky);

  /** Saved state of the global window object */
  nsISupports getWindowState();

  /** Saved state of the global window object */
  void setWindowState(nsISupports aWindowState);

  /**
     * Saved child docshells corresponding to contentViewer.  The child shells
     * are restored as children of the parent docshell, in this order, when the
     * parent docshell restores a saved presentation.
     */
/** Append a child shell to the end of our list. */
  void addChildShell(nsIDocShellTreeItem shell);

  /**
     * Get the child shell at |index|; returns null if |index| is out of bounds.
     */
  nsIDocShellTreeItem childShellAt(int index);

  /**
     * Clear the child shell list.
     */
  void clearChildShells();

  /** Saved refresh URI list for the content viewer */
  nsISupportsArray getRefreshURIList();

  /** Saved refresh URI list for the content viewer */
  void setRefreshURIList(nsISupportsArray aRefreshURIList);

  /**
     * Ensure that the cached presentation members are self-consistent.
     * If either |contentViewer| or |windowState| are null, then all of the
     * following members are cleared/reset:
     *  contentViewer, sticky, windowState, viewerBounds, childShells,
     *  refreshURIList.
     */
  void syncPresentationState();

  /** Title for the document */
  void setTitle(String aTitle);

  /** Post Data for the document */
  nsIInputStream getPostData();

  /** Post Data for the document */
  void setPostData(nsIInputStream aPostData);

  /** LayoutHistoryState for scroll position and form values */
  nsISupports getLayoutHistoryState();

  /** LayoutHistoryState for scroll position and form values */
  void setLayoutHistoryState(nsISupports aLayoutHistoryState);

  /** parent of this entry */
  nsISHEntry getParent();

  /** parent of this entry */
  void setParent(nsISHEntry aParent);

  /**
     * The loadType for this entry. This is typically loadHistory except
     * when reload is pressed, it has the appropriate reload flag
     */
  long getLoadType();

  /**
     * The loadType for this entry. This is typically loadHistory except
     * when reload is pressed, it has the appropriate reload flag
     */
  void setLoadType(long aLoadType);

  /**
     * An ID to help identify this entry from others during
     * subframe navigation
     */
  long getID();

  /**
     * An ID to help identify this entry from others during
     * subframe navigation
     */
  void setID(long aID);

  /**
     * pageIdentifier is an integer that should be the same for two entries
     * attached to the same docshell only if the two entries are entries for
     * the same page in the sense that one could go from the state represented
     * by one to the state represented by the other simply by scrolling (so the
     * entries are separated by an anchor traversal or a subframe navigation in
     * some other frame).
     */
  long getPageIdentifier();

  /**
     * pageIdentifier is an integer that should be the same for two entries
     * attached to the same docshell only if the two entries are entries for
     * the same page in the sense that one could go from the state represented
     * by one to the state represented by the other simply by scrolling (so the
     * entries are separated by an anchor traversal or a subframe navigation in
     * some other frame).
     */
  void setPageIdentifier(long aPageIdentifier);

  /** attribute to set and get the cache key for the entry */
  nsISupports getCacheKey();

  /** attribute to set and get the cache key for the entry */
  void setCacheKey(nsISupports aCacheKey);

  /** attribute to indicate whether layoutHistoryState should be saved */
  boolean getSaveLayoutStateFlag();

  /** attribute to indicate whether layoutHistoryState should be saved */
  void setSaveLayoutStateFlag(boolean aSaveLayoutStateFlag);

  /** attribute to indicate whether the page is already expired in cache */
  boolean getExpirationStatus();

  /** attribute to indicate whether the page is already expired in cache */
  void setExpirationStatus(boolean aExpirationStatus);

  /**
     * attribute to indicate the content-type of the document that this
     * is a session history entry for
     */
  String getContentType();

  /**
     * attribute to indicate the content-type of the document that this
     * is a session history entry for
     */
  void setContentType(String aContentType);

  /** Set/Get scrollers' positon in anchored pages */
  void setScrollPosition(int x, int y);

  void getScrollPosition(int[] x, int[] y);

  nsISHEntry _clone();

  /** Attribute that indicates if this entry is for a subframe navigation */
  void setIsSubFrame(boolean aFlag);

  /** Return any content viewer present in or below this node in the
        nsSHEntry tree.  This will differ from contentViewer in the case
        where a child nsSHEntry has the content viewer for this tree. */
  nsIContentViewer getAnyContentViewer(nsISHEntry[] ownerEntry);

  /**
     * Get the owner, if any, that was associated with the channel
     * that the document that was loaded to create this history entry
     * came from.
     */
  nsISupports getOwner();

  /**
     * Get the owner, if any, that was associated with the channel
     * that the document that was loaded to create this history entry
     * came from.
     */
  void setOwner(nsISupports aOwner);

}