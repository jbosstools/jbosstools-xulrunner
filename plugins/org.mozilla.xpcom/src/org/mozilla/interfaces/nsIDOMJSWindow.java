/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/base/nsIDOMJSWindow.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMJSWindow extends nsISupports {

  String NS_IDOMJSWINDOW_IID =
    "{14efb76c-5bd6-449e-b36f-0cbd22981f20}";

  void dump(String str);

  /**
   * These methods take typeless arguments and optional arguments, the
   * first argument is either a function or a string, the second
   * argument must be a number (ms) and the rest of the arguments (2
   * ... n) are passed to the callback function
   */
  int setTimeout();

  int setInterval();

  /**
   * These methods take one optional argument that's the timer ID to
   * clear. Often in existing code these methods are passed undefined,
   * which is a nop so we need to support that as well.
   */
  void clearTimeout();

  void clearInterval();

  /**
   * This method is here for backwards compatibility with 4.x only,
   * its implementation is a no-op
   */
  void setResizable(boolean resizable);

  /**
   * @deprecated These are old Netscape 4 methods. Do not use,
   *             the implementation is no-op.
   */
  void captureEvents(int eventFlags);

  void releaseEvents(int eventFlags);

  void routeEvent(nsIDOMEvent evt);

  void enableExternalCapture();

  void disableExternalCapture();

  /**
   * This is the scriptable version of nsIDOMWindowInternal::open()
   * that takes 3 optional arguments. Its binary name is OpenJS to
   * avoid colliding with nsIDOMWindowInternal::open(), which has the
   * same signature. The reason we can't have that collision is that
   * the implementation needs to know whether it was called from JS or
   * not.
   *
   * IOW, DO NOT CALL THIS FROM C++
   */
  nsIDOMWindow open(String url, String name, String options);

  /**
   * This is the scriptable version of
   * nsIDOMWindowInternal::openDialog() that takes 3 optional
   * arguments, plus any additional arguments are passed on as
   * arguments on the dialog's window object (window.arguments).
   */
  nsIDOMWindow openDialog(String url, String name, String options);

  /**
   * window.frames in Netscape 4.x and IE is just a reference to the
   * window itself (i.e. window.frames === window), but this doesn't
   * make sense from a generic API point of view so that's why this is
   * JS specific.
   *
   * This property is "replaceable" in JavaScript.
   */
  nsIDOMWindow getFrames();

}