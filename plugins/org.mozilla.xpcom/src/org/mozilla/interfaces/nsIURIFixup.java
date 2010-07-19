/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsIURIFixup.idl
 */

package org.mozilla.interfaces;

/**
 * Interface implemented by objects capable of fixing up strings into URIs
 */
public interface nsIURIFixup extends nsISupports {

  String NS_IURIFIXUP_IID =
    "{773081ac-9f81-4bdb-9e7a-5e87b4361f09}";

  /** No fixup flags. */
  long FIXUP_FLAG_NONE = 0L;

  /**
     * Allow the fixup to use a keyword lookup service to complete the URI.
     * The fixup object implementer should honour this flag and only perform
     * any lengthy keyword (or search) operation if it is set.
     */
  long FIXUP_FLAG_ALLOW_KEYWORD_LOOKUP = 1L;

  /**
     * Tell the fixup to make an alternate URI from the input URI, for example
     * to turn foo into www.foo.com.
     */
  long FIXUP_FLAGS_MAKE_ALTERNATE_URI = 2L;

  /**
     * Converts an internal URI (e.g. a wyciwyg URI) into one which we can
     * expose to the user, for example on the URL bar.
     *
     * @param  aURI       The URI to be converted
     * @return nsIURI     The converted, exposable URI
     * @throws NS_ERROR_MALFORMED_URI when the exposable portion of aURI is malformed
     * @throws NS_ERROR_UNKNOWN_PROTOCOL when we can't get a protocol handler service
     *         for the URI scheme.
     */
  nsIURI createExposableURI(nsIURI aURI);

  /**
     * Converts the specified string into a URI, first attempting
     * to correct any errors in the syntax or other vagaries. Returns
     * a wellformed URI or nsnull if it can't.
     *
     * @param aURIText    Candidate URI.
     * @param aFixupFlags Flags that govern ways the URI may be fixed up.
     */
  nsIURI createFixupURI(String aURIText, long aFixupFlags);

  /**
     * Converts the specified keyword string into a URI.  Note that it's the
     * caller's responsibility to check whether keywords are enabled and
     * whether aKeyword is a sensible keyword.
     */
  nsIURI keywordToURI(String aKeyword);

}