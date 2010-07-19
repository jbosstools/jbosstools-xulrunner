/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsISimpleUnicharStreamFactory.idl
 */

package org.mozilla.interfaces;

/**
 * Factory to create objects that implement nsIUnicharInputStream,
 * converting from a unicode string or a UTF-8 stream.
 */
public interface nsISimpleUnicharStreamFactory extends nsISupports {

  String NS_ISIMPLEUNICHARSTREAMFACTORY_IID =
    "{8238cd2e-e8e3-43e8-b556-56e21389c766}";

  /**
   * Create a unicode input stream from a unicode string.
   */
  nsIUnicharInputStream createInstanceFromString(String aString);

  /**
   * Create a unicode stream from an input stream in UTF8.
   */
  nsIUnicharInputStream createInstanceFromUTF8Stream(nsIInputStream aStream);

}