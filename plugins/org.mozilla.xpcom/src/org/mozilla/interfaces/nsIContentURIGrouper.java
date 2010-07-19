/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/contentprefs/public/nsIContentURIGrouper.idl
 */

package org.mozilla.interfaces;

public interface nsIContentURIGrouper extends nsISupports {

  String NS_ICONTENTURIGROUPER_IID =
    "{4bb38cb4-c3cb-4d17-9799-1b3132b39723}";

  /**
     * Determine the group to which the URI belongs.
     *
     * @param    aURI       the URI to group
     *
     * @returns  the group to which the URI belongs
     */
  String group(nsIURI aURI);

}