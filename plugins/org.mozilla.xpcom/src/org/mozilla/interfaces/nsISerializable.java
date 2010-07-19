/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsISerializable.idl
 */

package org.mozilla.interfaces;

public interface nsISerializable extends nsISupports {

  String NS_ISERIALIZABLE_IID =
    "{91cca981-c26d-44a8-bebe-d9ed4891503a}";

  /**
     * Initialize the object implementing nsISerializable, which must have
     * been freshly constructed via CreateInstance.  All data members that
     * can't be set to default values must have been serialized by write,
     * and should be read from aInputStream in the same order by this method.
     */
  void read(nsIObjectInputStream aInputStream);

  /**
     * Serialize the object implementing nsISerializable to aOutputStream, by
     * writing each data member that must be recovered later to reconstitute
     * a working replica of this object, in a canonical member and byte order,
     * to aOutputStream.
     *
     * NB: a class that implements nsISerializable *must* also implement
     * nsIClassInfo, in particular nsIClassInfo::GetClassID.
     */
  void write(nsIObjectOutputStream aOutputStream);

}