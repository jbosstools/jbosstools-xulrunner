/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/reflect/xptinfo/public/nsIXPTLoader.idl
 */

package org.mozilla.interfaces;

/**
 * The XPT loader interface: implemented by a loader to grab an input
 * stream which will be consumed by the interface loader.
 */
public interface nsIXPTLoader extends nsISupports {

  String NS_IXPTLOADER_IID =
    "{368a15d9-17a9-4c2b-ac3d-a35b3a22b876}";

  /**
     * enumerate entries in the given archive
     * for each entry found, the loader will call the sink's
     * foundEntry() method with the appropriate information and a
     * stream that the consumer can read from
     * @param file the file to read from
     * @param sink an object which will be called with each file found
     *             in the file
     */
  void enumerateEntries(nsILocalFile file, nsIXPTLoaderSink sink);

  /**
     * Load a specific entry from the archive
     * @param file the file to read from
     * @param name the name of the xpt within the file
     * @return an input stream that will read the raw xpt data from
     *         the file
     */
  nsIInputStream loadEntry(nsILocalFile file, String name);

}