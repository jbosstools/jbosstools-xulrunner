/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/base/nsIDOMLocation.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMLocation extends nsISupports {

  String NS_IDOMLOCATION_IID =
    "{a6cf906d-15b3-11d2-932e-00805f8add32}";

  /**
            * These properties refer to the current location of the document.
            * This will correspond to the URI shown in the location bar, which
            * can be different from the documentURI of the document.
            */
  String getHash();

  /**
            * These properties refer to the current location of the document.
            * This will correspond to the URI shown in the location bar, which
            * can be different from the documentURI of the document.
            */
  void setHash(String aHash);

  String getHost();

  void setHost(String aHost);

  String getHostname();

  void setHostname(String aHostname);

  String getHref();

  void setHref(String aHref);

  String getPathname();

  void setPathname(String aPathname);

  String getPort();

  void setPort(String aPort);

  String getProtocol();

  void setProtocol(String aProtocol);

  String getSearch();

  void setSearch(String aSearch);

  void reload(boolean forceget);

  void replace(String url);

  void assign(String url);

  String toString();

}