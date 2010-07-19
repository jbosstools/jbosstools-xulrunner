/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIObjectInputStream.idl
 */

package org.mozilla.interfaces;

/**
 * @see nsIObjectOutputStream
 * @see nsIBinaryInputStream
 */
public interface nsIObjectInputStream extends nsIBinaryInputStream {

  String NS_IOBJECTINPUTSTREAM_IID =
    "{6c248606-4eae-46fa-9df0-ba58502368eb}";

  /**
     * Read an object from this stream to satisfy a strong or weak reference
     * to one of its interfaces.  If the interface was not along the primary
     * inheritance chain ending in the "root" or XPCOM-identity nsISupports,
     * readObject will QueryInterface from the deserialized object root to the
     * correct interface, which was specified when the object was serialized.
     *
     * @see nsIObjectOutputStream
     */
  nsISupports readObject(boolean aIsStrongRef);

}