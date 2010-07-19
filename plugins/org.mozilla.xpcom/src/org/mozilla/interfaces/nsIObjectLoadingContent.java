/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsIObjectLoadingContent.idl
 */

package org.mozilla.interfaces;

/**
 * This interface represents a content node that loads objects.
 */
public interface nsIObjectLoadingContent extends nsISupports {

  String NS_IOBJECTLOADINGCONTENT_IID =
    "{90ab443e-3e99-405e-88c9-9c42adaa3217}";

  long TYPE_LOADING = 0L;

  long TYPE_IMAGE = 1L;

  long TYPE_PLUGIN = 2L;

  long TYPE_DOCUMENT = 3L;

  long TYPE_NULL = 4L;

  /**
   * The actual mime type (the one we got back from the network
   * request) for the element.
   */
  String getActualType();

  /**
   * Gets the type of the content that's currently loaded. See
   * the constants above for the list of possible values.
   */
  long getDisplayedType();

  /**
   * Gets the content type that corresponds to the give MIME type.  See the
   * constants above for the list of possible values.  If nothing else fits,
   * TYPE_NULL will be returned.
   */
  long getContentTypeForMIMEType(String aMimeType);

}