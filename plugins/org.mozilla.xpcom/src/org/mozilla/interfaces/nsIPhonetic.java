/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/html/content/public/nsIPhonetic.idl
 */

package org.mozilla.interfaces;

/** 
 * This interface is used to get the phonetic value of the input text.
 * It can be used to get corresponding phonetic value for ideographic text.
 * The interface can be retrieved by calling QI to the interface 
 * which implements the phonetic interface.
 */
public interface nsIPhonetic extends nsISupports {

  String NS_IPHONETIC_IID =
    "{bc6ea726-ab56-46b6-a21a-aa7b76d6818f}";

  /**
   * phonetic get the phonetic value of the input text
   */
  String getPhonetic();

}