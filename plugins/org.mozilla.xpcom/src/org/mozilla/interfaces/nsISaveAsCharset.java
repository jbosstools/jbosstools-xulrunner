/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/intl/unicharutil/idl/nsISaveAsCharset.idl
 */

package org.mozilla.interfaces;

public interface nsISaveAsCharset extends nsISupports {

  String NS_ISAVEASCHARSET_IID =
    "{33b87f70-7a9c-11d3-915c-006008a6edf6}";

  long mask_Fallback = 255L;

  long mask_Entity = 768L;

  long mask_CharsetFallback = 1024L;

  long attr_FallbackNone = 0L;

  long attr_FallbackQuestionMark = 1L;

  long attr_FallbackEscapeU = 2L;

  long attr_FallbackDecimalNCR = 3L;

  long attr_FallbackHexNCR = 4L;

  long attr_EntityNone = 0L;

  long attr_EntityBeforeCharsetConv = 256L;

  long attr_EntityAfterCharsetConv = 512L;

  long attr_CharsetFallback = 1024L;

  long attr_plainTextDefault = 0L;

  long attr_htmlTextDefault = 259L;

  String getCharset();

  void init(String charset, long attr, long entityVersion);

  String convert(String inString);

}