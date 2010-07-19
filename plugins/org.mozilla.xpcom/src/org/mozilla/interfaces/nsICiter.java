/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/idl/nsICiter.idl
 */

package org.mozilla.interfaces;

/** Handle plaintext citations, as in mail quoting.
  * Used by the editor but not dependant on it.
  */
public interface nsICiter extends nsISupports {

  String NS_ICITER_IID =
    "{a6cf9102-15b3-11d2-932e-00805f8add32}";

  String getCiteString(String aInString);

  String stripCites(String aInString);

  String rewrap(String aInString, long aWrapCol, long aFirstLineOffset, boolean aRespectNewlines);

}