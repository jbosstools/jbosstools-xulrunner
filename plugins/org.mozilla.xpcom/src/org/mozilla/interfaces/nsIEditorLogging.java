/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/idl/nsIEditorLogging.idl
 */

package org.mozilla.interfaces;

public interface nsIEditorLogging extends nsISupports {

  String NS_IEDITORLOGGING_IID =
    "{4805e681-49b9-11d3-9ce4-ed60bd6cb5bc}";

  /** Start logging.
   * @param aLogFile     The file to which the log should be written.
    */
  void startLogging(nsIFile aLogFile);

  /** Stop logging.
    */
  void stopLogging();

}