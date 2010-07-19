/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIAuthPromptAdapterFactory.idl
 */

package org.mozilla.interfaces;

/**
 * An interface for wrapping nsIAuthPrompt interfaces to make
 * them usable via an nsIAuthPrompt2 interface.
 */
public interface nsIAuthPromptAdapterFactory extends nsISupports {

  String NS_IAUTHPROMPTADAPTERFACTORY_IID =
    "{60e46383-bb9a-4860-8962-80d9c5c05ddc}";

  /**
   * Wrap an object implementing nsIAuthPrompt so that it's usable via
   * nsIAuthPrompt2.
   */
  nsIAuthPrompt2 createAdapter(nsIAuthPrompt aPrompt);

}