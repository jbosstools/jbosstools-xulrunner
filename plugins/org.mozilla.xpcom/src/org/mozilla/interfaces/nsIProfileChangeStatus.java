/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/profile/public/nsIProfileChangeStatus.idl
 */

package org.mozilla.interfaces;

public interface nsIProfileChangeStatus extends nsISupports {

  String NS_IPROFILECHANGESTATUS_IID =
    "{2f977d43-5485-11d4-87e2-0010a4e75ef2}";

  void vetoChange();

  /**
    * Called by a profile change observer when a fatal error
    * occurred during the attempt to switch the profile.
    *
    * The profile should be considered in an unsafe condition,
    * and the profile manager should inform the user and
    * exit immediately.
    *
    */
  void changeFailed();

}