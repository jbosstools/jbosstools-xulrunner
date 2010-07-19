/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xul/document/public/nsIController.idl
 */

package org.mozilla.interfaces;

public interface nsIControllerCommandGroup extends nsISupports {

  String NS_ICONTROLLERCOMMANDGROUP_IID =
    "{9f82c404-1c7b-11d5-a73c-eca43ca836fc}";

  void addCommandToGroup(String aCommand, String aGroup);

  void removeCommandFromGroup(String aCommand, String aGroup);

  boolean isCommandInGroup(String aCommand, String aGroup);

  nsISimpleEnumerator getGroupsEnumerator();

  nsISimpleEnumerator getEnumeratorForGroup(String aGroup);

}