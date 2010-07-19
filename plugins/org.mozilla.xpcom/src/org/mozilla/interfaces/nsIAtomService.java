/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsIAtomService.idl
 */

package org.mozilla.interfaces;

public interface nsIAtomService extends nsISupports {

  String NS_IATOMSERVICE_IID =
    "{9c1f50b9-f9eb-42d4-a8cb-2c7600aeb241}";

  /**
   * Version of NS_NewAtom that doesn't require linking against the
   * XPCOM library.  See nsIAtom.idl.
   */
  nsIAtom getAtom(String value);

  /**
   * Version of NS_NewPermanentAtom that doesn't require linking against
   * the XPCOM library.  See nsIAtom.idl.
   */
  nsIAtom getPermanentAtom(String value);

}