/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/plugin/base/public/nsIPluginTag.idl
 */

package org.mozilla.interfaces;

public interface nsIPluginTag extends nsISupports {

  String NS_IPLUGINTAG_IID =
    "{13a1b39e-72e5-442d-aa73-5905ffaf837b}";

  String getDescription();

  String getFilename();

  String getVersion();

  String getName();

  boolean getDisabled();

  void setDisabled(boolean aDisabled);

  boolean getBlocklisted();

  void setBlocklisted(boolean aBlocklisted);

}