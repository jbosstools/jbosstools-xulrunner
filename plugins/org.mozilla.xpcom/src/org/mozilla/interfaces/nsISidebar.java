/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/sidebar/nsISidebar.idl
 */

package org.mozilla.interfaces;

public interface nsISidebar extends nsISupports {

  String NS_ISIDEBAR_IID =
    "{67cf6231-c303-4f7e-b9b1-a0e87772ecfd}";

  void addPanel(String aTitle, String aContentURL, String aCustomizeURL);

  void addPersistentPanel(String aTitle, String aContentURL, String aCustomizeURL);

  void addSearchEngine(String engineURL, String iconURL, String suggestedTitle, String suggestedCategory);

  void addMicrosummaryGenerator(String generatorURL);

}