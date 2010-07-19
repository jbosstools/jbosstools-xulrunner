/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/sidebar/nsISidebar.idl
 */

package org.mozilla.interfaces;

public interface nsISidebarExternal extends nsISupports {

  String NS_ISIDEBAREXTERNAL_IID =
    "{4350fb73-9305-41df-a669-11d26222d420}";

  void addSearchProvider(String aDescriptionURL);

  long isSearchProviderInstalled(String aSearchURL);

}