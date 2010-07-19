/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/intl/chardet/public/nsIDocumentCharsetInfo.idl
 */

package org.mozilla.interfaces;

public interface nsIDocumentCharsetInfo extends nsISupports {

  String NS_IDOCUMENTCHARSETINFO_IID =
    "{2d40b291-01e1-11d4-9d0e-0050040007b2}";

  nsIAtom getForcedCharset();

  void setForcedCharset(nsIAtom aForcedCharset);

  boolean getForcedDetector();

  void setForcedDetector(boolean aForcedDetector);

  nsIAtom getParentCharset();

  void setParentCharset(nsIAtom aParentCharset);

  int getParentCharsetSource();

  void setParentCharsetSource(int aParentCharsetSource);

}