/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/cache/public/nsICacheEntryDescriptor.idl
 */

package org.mozilla.interfaces;

public interface nsICacheMetaDataVisitor extends nsISupports {

  String NS_ICACHEMETADATAVISITOR_IID =
    "{22f9a49c-3cf8-4c23-8006-54efb11ac562}";

  /**
     * Called for each key/value pair in the meta data for a cache entry
     */
  boolean visitMetaDataElement(String key, String value);

}