/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/base/nsIDebug2.idl
 */

package org.mozilla.interfaces;

public interface nsIDebug2 extends nsIDebug {

  String NS_IDEBUG2_IID =
    "{9c9307ed-480a-4f2a-8f29-21378c03bcbc}";

  /**
     * Whether XPCOM was compiled with DEBUG defined.  This often
     * correlates to whether other code (e.g., Firefox, XULRunner) was
     * compiled with DEBUG defined.
     */
  boolean getIsDebugBuild();

  /**
     * The number of assertions since process start.
     */
  int getAssertionCount();

}