/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/load-save/nsIDOMDOMImplementationLS.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMDOMImplementationLS extends nsISupports {

  String NS_IDOMDOMIMPLEMENTATIONLS_IID =
    "{e2c8b03c-a49a-4923-81b0-ba9a86da0e21}";

  int MODE_SYNCHRONOUS = 1;

  int MODE_ASYNCHRONOUS = 2;

  nsIDOMLSParser createLSParser(int mode, String schemaType);

  nsIDOMLSSerializer createLSSerializer();

  nsIDOMLSInput createLSInput();

  nsIDOMLSOutput createLSOutput();

}