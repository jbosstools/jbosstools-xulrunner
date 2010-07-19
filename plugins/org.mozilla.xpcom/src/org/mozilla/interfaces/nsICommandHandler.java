/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/browser/webBrowser/nsICommandHandler.idl
 */

package org.mozilla.interfaces;

public interface nsICommandHandler extends nsISupports {

  String NS_ICOMMANDHANDLER_IID =
    "{34a4fcf0-66fc-11d4-9528-0020183bf181}";

  String exec(String aCommand, String aParameters);

  String query(String aCommand, String aParameters);

}