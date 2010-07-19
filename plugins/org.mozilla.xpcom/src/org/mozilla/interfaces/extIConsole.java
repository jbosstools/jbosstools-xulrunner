/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/exthelper/extIApplication.idl
 */

package org.mozilla.interfaces;

/**
 * Interface that gives simplified access to the console
 */
public interface extIConsole extends nsISupports {

  String EXTICONSOLE_IID =
    "{ae8482e0-aa5a-11db-abbd-0800200c9a66}";

  /**
   * Sends a given string to the console.
   * @param   aMsg
   *          The text to send to the console
   */
  void log(String aMsg);

  /**
   * Opens the error console window. The console window
   * is focused if already open.
   */
  void open();

}