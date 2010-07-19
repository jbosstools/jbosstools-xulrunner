/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsISystemProxySettings.idl
 */

package org.mozilla.interfaces;

/** 
 * This interface allows the proxy code to use platform-specific proxy
 * settings when the proxy preference is set to "automatic discovery". This service
 * acts like a PAC parser to netwerk, but it will actually read the system settings and
 * either return the proper proxy data from the autoconfig URL specified in the system proxy,
 * or generate proxy data based on the system's manual proxy settings.
 */
public interface nsISystemProxySettings extends nsISupports {

  String NS_ISYSTEMPROXYSETTINGS_IID =
    "{a9f3ae38-b769-4e0b-9317-578388e326c9}";

  /**
     * If non-empty, use this PAC file. If empty, call getProxyForURI instead.
     */
  String getPACURI();

  /**
     * See nsIProxyAutoConfig::getProxyForURI; this function behaves exactly
     * the same way.
     */
  String getProxyForURI(nsIURI aURI);

}