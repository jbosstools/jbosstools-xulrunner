/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIObjectOutputStream.idl
 */

package org.mozilla.interfaces;

/**
 * @See nsIObjectInputStream
 * @See nsIBinaryOutputStream
 */
public interface nsIObjectOutputStream extends nsIBinaryOutputStream {

  String NS_IOBJECTOUTPUTSTREAM_IID =
    "{92c898ac-5fde-4b99-87b3-5d486422094b}";

  /**
     * Write the object whose "root" or XPCOM-identity nsISupports is aObject.
     * The cause for writing this object is a strong or weak reference, so the
     * aIsStrongRef argument must tell which kind of pointer is being followed
     * here during serialization.
     *
     * If the object has only one strong reference in the serialization and no
     * weak refs, use writeSingleRefObject.  This is a valuable optimization:
     * it saves space in the stream, and cycles on both ends of the process.
     *
     * If the reference being serialized is a pointer to an interface not on
     * the primary inheritance chain ending in the root nsISupports, you must
     * call writeCompoundObject instead of this method.
     */
  void writeObject(nsISupports aObject, boolean aIsStrongRef);

  /**
     * Write an object referenced singly and strongly via its root nsISupports
     * or a subclass of its root nsISupports.  There must not be other refs to
     * aObject in memory, or in the serialization.
     */
  void writeSingleRefObject(nsISupports aObject);

  /**
     * Write the object referenced by an interface pointer at aObject that
     * inherits from a non-primary nsISupports, i.e., a reference to one of
     * the multiply inherited interfaces derived from an nsISupports other
     * than the root or XPCOM-identity nsISupports; or a reference to an
     * inner object in the case of true XPCOM aggregation.  aIID identifies
     * this interface.
     */
  void writeCompoundObject(nsISupports aObject, String aIID, boolean aIsStrongRef);

  void writeID(String aID);

}