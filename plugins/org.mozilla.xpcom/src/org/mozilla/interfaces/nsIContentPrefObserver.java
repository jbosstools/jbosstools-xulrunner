/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/contentprefs/public/nsIContentPrefService.idl
 */

package org.mozilla.interfaces;

public interface nsIContentPrefObserver extends nsISupports {

  String NS_ICONTENTPREFOBSERVER_IID =
    "{746c7a02-f6c1-4869-b434-7c8b86e60e61}";

  /**
   * Called when a content pref is set to a different value.
   * 
   * @param    aGroup      the group to which the pref belongs, or null
   *                       if it's a global pref (applies to all URIs)
   * @param    aName       the name of the pref that was set
   * @param    aValue      the new value of the pref
   */
  void onContentPrefSet(String aGroup, String aName, nsIVariant aValue);

  /**
   * Called when a content pref is removed.
   * 
   * @param    aGroup      the group to which the pref belongs, or null
   *                       if it's a global pref (applies to all URIs)
   * @param    aName       the name of the pref that was removed
   */
  void onContentPrefRemoved(String aGroup, String aName);

}