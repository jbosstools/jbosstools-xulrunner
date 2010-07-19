/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xml/document/public/nsIXPointer.idl
 */

package org.mozilla.interfaces;

/**
 * XXX A good XPointerResult would probably mimic XPathresult,
 *     this range list is just the minimum that will be able to represent
 *     all return values, although it would be more user friendly to return
 *     nodes and node lists when they are possible.
 */
public interface nsIXPointerResult extends nsISupports {

  String NS_IXPOINTERRESULT_IID =
    "{d3992637-f474-4b65-83ed-323fe69c60d2}";

  nsIDOMRange item(long index);

  long getLength();

}