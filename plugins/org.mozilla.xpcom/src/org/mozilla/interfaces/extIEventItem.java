/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/exthelper/extIApplication.idl
 */

package org.mozilla.interfaces;

/**
 * Interface holds information about an event.
 */
public interface extIEventItem extends nsISupports {

  String EXTIEVENTITEM_IID =
    "{05281820-ab62-11db-abbd-0800200c9a66}";

  /**
   * The name of the event
   */
  String getType();

  /**
   * Can hold extra details and data associated with the event. This
   * is optional and event specific. If the event does not send extra
   * details, this is null.
   */
  nsIVariant getData();

  /**
   * Cancels the event if it is cancelable.
   */
  void preventDefault();

}