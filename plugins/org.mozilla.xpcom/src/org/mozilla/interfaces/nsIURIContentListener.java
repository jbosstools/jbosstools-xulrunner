/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/uriloader/base/nsIURIContentListener.idl
 */

package org.mozilla.interfaces;

/**
 * nsIURIContentListener is an interface used by components which
 * want to know (and have a chance to handle) a particular content type.
 * Typical usage scenarios will include running applications which register
 * a nsIURIContentListener for each of its content windows with the uri
 * dispatcher service. 
 *
 * @status FROZEN
 */
public interface nsIURIContentListener extends nsISupports {

  String NS_IURICONTENTLISTENER_IID =
    "{94928ab3-8b63-11d3-989d-001083010e9b}";

  /**
  * Gives the original content listener first crack at stopping a load before
  * it happens.
  *
  * @param aURI   URI that is being opened.
  *
  * @return       <code>false</code> if the load can continue;
  *               <code>true</code> if the open should be aborted.
  */
  boolean onStartURIOpen(nsIURI aURI);

  /**
  * Notifies the content listener to hook up an nsIStreamListener capable of
  * consuming the data stream.
  *
  * @param aContentType         Content type of the data.
  * @param aIsContentPreferred  Indicates whether the content should be
  *                             preferred by this listener.
  * @param aRequest             Request that is providing the data.
  * @param aContentHandler      nsIStreamListener that will consume the data.
  *                             This should be set to <code>nsnull</code> if
  *                             this content listener can't handle the content
  *                             type.
  *
  * @return                     <code>true</code> if the consumer wants to
  *                             handle the load completely by itself.  This
  *                             causes the URI Loader do nothing else...
  *                             <code>false</code> if the URI Loader should
  *                             continue handling the load and call the
  *                             returned streamlistener's methods. 
  */
  boolean doContent(String aContentType, boolean aIsContentPreferred, nsIRequest aRequest, nsIStreamListener[] aContentHandler);

  /**
  * When given a uri to dispatch, if the URI is specified as 'preferred 
  * content' then the uri loader tries to find a preferred content handler
  * for the content type. The thought is that many content listeners may
  * be able to handle the same content type if they have to. i.e. the mail
  * content window can handle text/html just like a browser window content
  * listener. However, if the user clicks on a link with text/html content,
  * then the browser window should handle that content and not the mail
  * window where the user may have clicked the link.  This is the difference
  * between isPreferred and canHandleContent.
  *
  * @param aContentType         Content type of the data.
  * @param aDesiredContentType  Indicates that aContentType must be converted
  *                             to aDesiredContentType before processing the
  *                             data.  This causes a stream converted to be
  *                             inserted into the nsIStreamListener chain.
  *                             This argument can be <code>nsnull</code> if
  *                             the content should be consumed directly as
  *                             aContentType.
  *
  * @return                     <code>true</code> if this is a preferred
  *                             content handler for aContentType;
  *                             <code>false<code> otherwise.
  */
  boolean isPreferred(String aContentType, String[] aDesiredContentType);

  /**
  * When given a uri to dispatch, if the URI is not specified as 'preferred
  * content' then the uri loader calls canHandleContent to see if the content
  * listener is capable of handling the content.
  *
  * @param aContentType         Content type of the data.
  * @param aIsContentPreferred  Indicates whether the content should be
  *                             preferred by this listener.
  * @param aDesiredContentType  Indicates that aContentType must be converted
  *                             to aDesiredContentType before processing the
  *                             data.  This causes a stream converted to be
  *                             inserted into the nsIStreamListener chain.
  *                             This argument can be <code>nsnull</code> if
  *                             the content should be consumed directly as
  *                             aContentType.
  *
  * @return                     <code>true</code> if the data can be consumed.
  *                             <code>false</code> otherwise.
  *
  * Note: I really envision canHandleContent as a method implemented
  * by the docshell as the implementation is generic to all doc
  * shells. The isPreferred decision is a decision made by a top level
  * application content listener that sits at the top of the docshell
  * hierarchy.
  */
  boolean canHandleContent(String aContentType, boolean aIsContentPreferred, String[] aDesiredContentType);

  /**
  * The load context associated with a particular content listener.
  * The URI Loader stores and accesses this value as needed.
  */
  nsISupports getLoadCookie();

  /**
  * The load context associated with a particular content listener.
  * The URI Loader stores and accesses this value as needed.
  */
  void setLoadCookie(nsISupports aLoadCookie);

  /**
  * The parent content listener if this particular listener is part of a chain
  * of content listeners (i.e. a docshell!)
  *
  * @note If this attribute is set to an object that implements
  *       nsISupportsWeakReference, the implementation should get the
  *       nsIWeakReference and hold that.  Otherwise, the implementation
  *       should not refcount this interface; it should assume that a non
  *       null value is always valid.  In that case, the caller is
  *       responsible for explicitly setting this value back to null if the
  *       parent content listener is destroyed.
  */
  nsIURIContentListener getParentContentListener();

  /**
  * The parent content listener if this particular listener is part of a chain
  * of content listeners (i.e. a docshell!)
  *
  * @note If this attribute is set to an object that implements
  *       nsISupportsWeakReference, the implementation should get the
  *       nsIWeakReference and hold that.  Otherwise, the implementation
  *       should not refcount this interface; it should assume that a non
  *       null value is always valid.  In that case, the caller is
  *       responsible for explicitly setting this value back to null if the
  *       parent content listener is destroyed.
  */
  void setParentContentListener(nsIURIContentListener aParentContentListener);

}