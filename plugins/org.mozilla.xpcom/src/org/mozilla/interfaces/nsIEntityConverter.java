/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/intl/unicharutil/idl/nsIEntityConverter.idl
 */

package org.mozilla.interfaces;

public interface nsIEntityConverter extends nsISupports {

  String NS_IENTITYCONVERTER_IID =
    "{d14c7111-55e0-11d3-91d9-00105aa3f7dc}";

  long entityNone = 0L;

  long html40Latin1 = 1L;

  long html40Symbols = 2L;

  long html40Special = 4L;

  long transliterate = 8L;

  long mathml20 = 16L;

  long html32 = 1L;

  long html40 = 7L;

  long entityW3C = 23L;

  String convertUTF32ToEntity(long character, long entityVersion);

  String convertToEntity(char character, long entityVersion);

  String convertToEntities(String inString, long entityVersion);

}