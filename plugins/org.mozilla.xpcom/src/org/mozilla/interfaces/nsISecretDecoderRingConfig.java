/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsISecretDecoderRing.idl
 */

package org.mozilla.interfaces;

/**
 * Configuration interface for the Secret Decoder Ring
 *  - this interface allows setting the window that will be
 *    used as parent for dialog windows (such as password prompts)
 */
public interface nsISecretDecoderRingConfig extends nsISupports {

  String NS_ISECRETDECODERRINGCONFIG_IID =
    "{01d8c0f0-0ccc-11d4-9fdd-000064657374}";

  void setWindow(nsISupports w);

}