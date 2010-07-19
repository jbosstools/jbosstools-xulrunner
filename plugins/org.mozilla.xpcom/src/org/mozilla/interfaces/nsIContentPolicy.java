/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsIContentPolicy.idl
 */

package org.mozilla.interfaces;

/**
 * Interface for content policy mechanism.  Implementations of this
 * interface can be used to control loading of various types of out-of-line
 * content, or processing of certain types of in-line content.
 *
 * WARNING: do not block the caller from shouldLoad or shouldProcess (e.g.,
 * by launching a dialog to prompt the user for something).
 */
public interface nsIContentPolicy extends nsISupports {

  String NS_ICONTENTPOLICY_IID =
    "{344f9cb0-9a17-44c5-ab96-ee707884266c}";

  long TYPE_OTHER = 1L;

  /**
   * Indicates an executable script (such as JavaScript).
   */
  long TYPE_SCRIPT = 2L;

  /**
   * Indicates an image (e.g., IMG elements).
   */
  long TYPE_IMAGE = 3L;

  /**
   * Indicates a stylesheet (e.g., STYLE elements).
   */
  long TYPE_STYLESHEET = 4L;

  /**
   * Indicates a generic object (plugin-handled content typically falls under
   * this category).
   */
  long TYPE_OBJECT = 5L;

  /**
   * Indicates a document at the top-level (i.e., in a browser).
   */
  long TYPE_DOCUMENT = 6L;

  /**
   * Indicates a document contained within another document (e.g., IFRAMEs,
   * FRAMES, and OBJECTs).
   */
  long TYPE_SUBDOCUMENT = 7L;

  /**
   * Indicates a timed refresh.
   *
   * shouldLoad will never get this, because it does not represent content
   * to be loaded (the actual load triggered by the refresh will go through
   * shouldLoad as expected).
   *
   * shouldProcess will get this for, e.g., META Refresh elements and HTTP
   * Refresh headers.
   */
  long TYPE_REFRESH = 8L;

  /**
   * Indicates an XBL binding request, triggered either by -moz-binding CSS
   * property or Document.addBinding method.
   */
  long TYPE_XBL = 9L;

  /**
   * Indicates a ping triggered by a click on <A PING="..."> element.
   */
  long TYPE_PING = 10L;

  /**
   * Indicates an XMLHttpRequest.
   */
  long TYPE_XMLHTTPREQUEST = 11L;

  /**
   * Indicates a request by a plugin.
   */
  long TYPE_OBJECT_SUBREQUEST = 12L;

  /**
   * Indicates a DTD loaded by an XML document.
   */
  long TYPE_DTD = 13L;

  /**
   * Indicates a font loaded via @font-face rule.
   */
  long TYPE_FONT = 14L;

  /**
   * Indicates a video or audio load.
   */
  long TYPE_MEDIA = 15L;

  /**
   * Returned from shouldLoad or shouldProcess if the load or process request
   * is rejected based on details of the request.
   */
  short REJECT_REQUEST = -1;

  /**
   * Returned from shouldLoad or shouldProcess if the load/process is rejected
   * based solely on its type (of the above flags).
   *
   * NOTE that it is not meant to stop future requests for this type--only the
   * current request.
   */
  short REJECT_TYPE = -2;

  /**
   * Returned from shouldLoad or shouldProcess if the load/process is rejected
   * based on the server it is hosted on or requested from (aContentLocation or
   * aRequestOrigin), e.g., if you block an IMAGE because it is served from
   * goatse.cx (even if you don't necessarily block other types from that
   * server/domain).
   * 
   * NOTE that it is not meant to stop future requests for this server--only the
   * current request.
   */
  short REJECT_SERVER = -3;

  /**
   * Returned from shouldLoad or shouldProcess if the load/process is rejected
   * based on some other criteria. Mozilla callers will handle this like
   * REJECT_REQUEST; third-party implementors may, for example, use this to
   * direct their own callers to consult the extra parameter for additional
   * details.
   */
  short REJECT_OTHER = -4;

  /**
   * Returned from shouldLoad or shouldProcess if the load or process request
   * is not rejected.
   */
  short ACCEPT = 1;

  /**
   * Should the resource at this location be loaded?
   * ShouldLoad will be called before loading the resource at aContentLocation
   * to determine whether to start the load at all.
   *
   * @param aContentType      the type of content being tested. This will be one
   *                          one of the TYPE_* constants.
   *
   * @param aContentLocation  the location of the content being checked; must
   *                          not be null
   *
   * @param aRequestOrigin    OPTIONAL. the location of the resource that
   *                          initiated this load request; can be null if
   *                          inapplicable
   *
   * @param aContext          OPTIONAL. the nsIDOMNode or nsIDOMWindow that
   *                          initiated the request, or something that can QI
   *                          to one of those; can be null if inapplicable.
   *
   * @param aMimeTypeGuess    OPTIONAL. a guess for the requested content's
   *                          MIME type, based on information available to
   *                          the request initiator (e.g., an OBJECT's type
   *                          attribute); does not reliably reflect the
   *                          actual MIME type of the requested content
   *
   * @param aExtra            an OPTIONAL argument, pass-through for non-Gecko
   *                          callers to pass extra data to callees.
   *
   * @return ACCEPT or REJECT_*
   *
   * @note shouldLoad can be called while the DOM and layout of the document
   * involved is in an inconsistent state.  This means that implementors of
   * this method MUST NOT do any of the following:
   * 1)  Modify the DOM in any way (e.g. setting attributes is a no-no).
   * 2)  Query any DOM properties that depend on layout (e.g. offset*
   *     properties).
   * 3)  Query any DOM properties that depend on style (e.g. computed style).
   * 4)  Query any DOM properties that depend on the current state of the DOM
   *     outside the "context" node (e.g. lengths of node lists).
   * 5)  [JavaScript implementations only] Access properties of any sort on any
   *     object without using XPCNativeWrapper (either explicitly or
   *     implicitly).  Due to various DOM0 things, this leads to item 4.
   * If you do any of these things in your shouldLoad implementation, expect
   * unpredictable behavior, possibly including crashes, content not showing
   * up, content showing up doubled, etc.  If you need to do any of the things
   * above, do them off timeout or event.
   */
  short shouldLoad(long aContentType, nsIURI aContentLocation, nsIURI aRequestOrigin, nsISupports aContext, String aMimeTypeGuess, nsISupports aExtra);

  /**
   * Should the resource be processed?
   * ShouldProcess will be called once all the information passed to it has
   * been determined about the resource, typically after part of the resource
   * has been loaded.
   *
   * @param aContentType      the type of content being tested. This will be one
   *                          one of the TYPE_* constants.
   *
   * @param aContentLocation  OPTIONAL; the location of the resource being
   *                          requested: MAY be, e.g., a post-redirection URI
   *                          for the resource.
   *
   * @param aRequestOrigin    OPTIONAL. the location of the resource that
   *                          initiated this load request; can be null if
   *                          inapplicable
   *
   * @param aContext          OPTIONAL. the nsIDOMNode or nsIDOMWindow that
   *                          initiated the request, or something that can QI
   *                          to one of those; can be null if inapplicable.
   *
   * @param aMimeType         the MIME type of the requested resource (e.g.,
   *                          image/png), as reported by the networking library,
   *                          if available (may be empty if inappropriate for
   *                          the type, e.g., TYPE_REFRESH).
   *
   * @param aExtra            an OPTIONAL argument, pass-through for non-Gecko
   *                          callers to pass extra data to callees.
   *
   * @return ACCEPT or REJECT_*
   *
   * @note shouldProcess can be called while the DOM and layout of the document
   * involved is in an inconsistent state.  See the note on shouldLoad to see
   * what this means for implementors of this method.
   */
  short shouldProcess(long aContentType, nsIURI aContentLocation, nsIURI aRequestOrigin, nsISupports aContext, String aMimeType, nsISupports aExtra);

}