/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xtf/public/nsIXTFAttributeHandler.idl
 */

package org.mozilla.interfaces;

public interface nsIXTFAttributeHandler extends nsISupports {

  String NS_IXTFATTRIBUTEHANDLER_IID =
    "{72152f7f-7e8d-43fd-8477-3f29ae8d240d}";

  boolean handlesAttribute(nsIAtom name);

  void setAttribute(nsIAtom name, String newValue);

  void removeAttribute(nsIAtom name);

  String getAttribute(nsIAtom name);

  boolean hasAttribute(nsIAtom name);

  long getAttributeCount();

  nsIAtom getAttributeNameAt(long index);

}