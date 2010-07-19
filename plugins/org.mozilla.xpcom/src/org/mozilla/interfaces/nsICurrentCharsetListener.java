/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/intl/uconv/idl/nsICurrentCharsetListener.idl
 */

package org.mozilla.interfaces;

public interface nsICurrentCharsetListener extends nsISupports {

  String NS_ICURRENTCHARSETLISTENER_IID =
    "{cf9428c1-df50-11d3-9d0c-0050040007b2}";

  void setCurrentCharset(String charset);

  void setCurrentMailCharset(String charset);

  void setCurrentComposerCharset(String charset);

}