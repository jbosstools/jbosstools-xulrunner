/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsIStringEnumerator.idl
 */

package org.mozilla.interfaces;

/**
 * Used to enumerate over an ordered list of strings.
 */
public interface nsIStringEnumerator extends nsISupports {

  String NS_ISTRINGENUMERATOR_IID =
    "{50d3ef6c-9380-4f06-9fb2-95488f7d141c}";

  boolean hasMore();

  String getNext();

}