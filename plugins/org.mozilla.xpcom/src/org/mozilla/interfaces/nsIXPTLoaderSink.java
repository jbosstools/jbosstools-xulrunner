/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/reflect/xptinfo/public/nsIXPTLoader.idl
 */

package org.mozilla.interfaces;

/**
 * Implement nsIXPTLoaderSink if you want to enumerate the entries in
 * an XPT archive of some kind
 */
public interface nsIXPTLoaderSink extends nsISupports {

  String NS_IXPTLOADERSINK_IID =
    "{6e48c500-8682-4730-add6-7db693b9e7ba}";

  /**
     * called by the loader for each entry in the archive
     * @param itemName the name of this particular item in the archive
     * @param index the index of the item inthe archive
     * @param stream contains the contents of the xpt file
     */
  void foundEntry(String itemName, int index, nsIInputStream xptData);

}