/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsIDocShellLoadInfo.idl
 */

package org.mozilla.interfaces;

public interface nsIDocShellLoadInfo extends nsISupports {

  String NS_IDOCSHELLLOADINFO_IID =
    "{92a0a637-373e-4647-9476-ead11e005c75}";

  /** This is the referrer for the load. */
  nsIURI getReferrer();

  /** This is the referrer for the load. */
  void setReferrer(nsIURI aReferrer);

  /** The owner of the load, that is, the entity responsible for 
     *  causing the load to occur. This should be a nsIPrincipal typically.
     */
  nsISupports getOwner();

  /** The owner of the load, that is, the entity responsible for 
     *  causing the load to occur. This should be a nsIPrincipal typically.
     */
  void setOwner(nsISupports aOwner);

  /** If this attribute is true and no owner is specified, copy
     *  the owner from the referring document.
     */
  boolean getInheritOwner();

  /** If this attribute is true and no owner is specified, copy
     *  the owner from the referring document.
     */
  void setInheritOwner(boolean aInheritOwner);

  /** If this attribute is true only ever use the owner specify by
     *  the owner and inheritOwner attributes.
     *  If there are security reasons for why this is unsafe, such
     *  as trying to use a systemprincipal owner for a content docshell
     *  the load fails.
     */
  boolean getOwnerIsExplicit();

  /** If this attribute is true only ever use the owner specify by
     *  the owner and inheritOwner attributes.
     *  If there are security reasons for why this is unsafe, such
     *  as trying to use a systemprincipal owner for a content docshell
     *  the load fails.
     */
  void setOwnerIsExplicit(boolean aOwnerIsExplicit);

  int loadNormal = 0;

  int loadNormalReplace = 1;

  int loadHistory = 2;

  int loadReloadNormal = 3;

  int loadReloadBypassCache = 4;

  int loadReloadBypassProxy = 5;

  int loadReloadBypassProxyAndCache = 6;

  int loadLink = 7;

  int loadRefresh = 8;

  int loadReloadCharsetChange = 9;

  int loadBypassHistory = 10;

  int loadStopContent = 11;

  int loadStopContentAndReplace = 12;

  int loadNormalExternal = 13;

  int loadNormalBypassCache = 14;

  int loadNormalBypassProxy = 15;

  int loadNormalBypassProxyAndCache = 16;

  /** Contains a load type as specified by the load* constants */
  int getLoadType();

  /** Contains a load type as specified by the load* constants */
  void setLoadType(int aLoadType);

  /** SHEntry for this page */
  nsISHEntry getSHEntry();

  /** SHEntry for this page */
  void setSHEntry(nsISHEntry aSHEntry);

  /** Target for load, like _content, _blank etc. */
  String getTarget();

  /** Target for load, like _content, _blank etc. */
  void setTarget(String aTarget);

  /** Post data */
  nsIInputStream getPostDataStream();

  /** Post data */
  void setPostDataStream(nsIInputStream aPostDataStream);

  /** Additional headers */
  nsIInputStream getHeadersStream();

  /** Additional headers */
  void setHeadersStream(nsIInputStream aHeadersStream);

  /** True if the referrer should be sent, false if it shouldn't be
     *  sent, even if it's available. This attribute defaults to true.
     */
  boolean getSendReferrer();

  /** True if the referrer should be sent, false if it shouldn't be
     *  sent, even if it's available. This attribute defaults to true.
     */
  void setSendReferrer(boolean aSendReferrer);

}