/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIKeyModule.idl
 */

package org.mozilla.interfaces;

public interface nsIKeyObject extends nsISupports {

  String NS_IKEYOBJECT_IID =
    "{4b31f4ed-9424-4710-b946-79b7e33cf3a8}";

  short SYM_KEY = 1;

  short PRIVATE_KEY = 2;

  short PUBLIC_KEY = 3;

  short RC4 = 1;

  short AES_CBC = 2;

  short HMAC = 257;

  short getType();

}