/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOM3TypeInfo.idl
 */

package org.mozilla.interfaces;

public interface nsIDOM3TypeInfo extends nsISupports {

  String NS_IDOM3TYPEINFO_IID =
    "{2a1088c7-499a-49a7-9d3b-1970d21532ab}";

  String getTypeName();

  String getTypeNamespace();

  long DERIVATION_RESTRICTION = 1L;

  long DERIVATION_EXTENSION = 2L;

  long DERIVATION_UNION = 4L;

  long DERIVATION_LIST = 8L;

  boolean isDerivedFrom(String typeNamespaceArg, String typeNameArg, long derivationMethod);

}