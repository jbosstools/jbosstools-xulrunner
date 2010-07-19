/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/src/xpconnect/idl/xpccomponents.idl
 */

package org.mozilla.interfaces;

/**
* interface of object returned by Components.Constructor
* (additional interesting stuff only reflected into JavaScript)
*/
public interface nsIXPCConstructor extends nsISupports {

  String NS_IXPCCONSTRUCTOR_IID =
    "{c814ca20-e0dc-11d3-8f5f-0010a4e73d9a}";

  nsIJSCID getClassID();

  nsIJSIID getInterfaceID();

  String getInitializer();

}