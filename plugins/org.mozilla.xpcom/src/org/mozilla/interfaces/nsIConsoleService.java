/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/base/nsIConsoleService.idl
 */

package org.mozilla.interfaces;

public interface nsIConsoleService extends nsISupports {

  String NS_ICONSOLESERVICE_IID =
    "{883472a0-ea9b-11da-8ad9-0800200c9a66}";

  void logMessage(nsIConsoleMessage message);

  /**
     * Convenience method for logging simple messages.
     */
  void logStringMessage(String message);

  /**
     * Get an array of all the messages logged so far.  If no messages
     * are logged, this function will return a count of 0, but still
     * will allocate one word for messages, so as to show up as a
     * 0-length array when called from script.
     */
  void getMessageArray(nsIConsoleMessage[][] messages, long[] count);

  /**
     * To guard against stack overflows from listeners that could log
     * messages (it's easy to do this inadvertently from listeners
     * implemented in JavaScript), we don't call any listeners when
     * another error is already being logged.
     */
  void registerListener(nsIConsoleListener listener);

  /**
     * Each registered listener should also be unregistered.
     */
  void unregisterListener(nsIConsoleListener listener);

  /**
     * Clear the message buffer (e.g. for privacy reasons).
     */
  void reset();

}