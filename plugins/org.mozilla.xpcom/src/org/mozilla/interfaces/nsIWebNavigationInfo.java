/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsIWebNavigationInfo.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIWebNavigationInfo interface exposes a way to get information
 * on the capabilities of Gecko webnavigation objects.
 *
 * @status UNDER_REVIEW
 */
public interface nsIWebNavigationInfo extends nsISupports {

  String NS_IWEBNAVIGATIONINFO_IID =
    "{62a93afb-93a1-465c-84c8-0432264229de}";

  /**
   * Returned by isTypeSupported to indicate lack of support for a type.
   * @note this is guaranteed not to change, so that boolean tests can be done
   * on the return value if isTypeSupported to detect whether a type is
   * supported at all.
   */
  long UNSUPPORTED = 0L;

  /**
   * Returned by isTypeSupported to indicate that a type is supported as an
   * image.
   */
  long IMAGE = 1L;

  /**
   * Returned by isTypeSupported to indicate that a type is supported via an
   * NPAPI ("Netscape 4 API") plug-in.  This is not the value returned for
   * "XPCOM plug-ins".
   */
  long PLUGIN = 2L;

  /**
   * @note Other return types may be added here in the future as they become
   * relevant.
   */
/**
   * Returned by isTypeSupported to indicate that a type is supported via some
   * other means.
   */
  long OTHER = 32768L;

  /**
   * Query whether aType is supported.
   * @param aType the MIME type in question.
   * @param aWebNav the nsIWebNavigation object for which the request
   *        is being made.  This is allowed to be null.  If it is non-null,
   *        the return value of this method may depend on the exact state of
   *        aWebNav and the values set through nsIWebBrowserSetup; otherwise
   *        the method will assume that the caller is interested in information
   *        about nsIWebNavigation objects in their default state.
   * @return an enum value indicating whether and how aType is supported.
   * @note This method may rescan plugins to ensure that they're properly
   *       registered for the types they support.
   */
  long isTypeSupported(String aType, nsIWebNavigation aWebNav);

}