/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMNSEvent.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMNSEvent extends nsISupports {

  String NS_IDOMNSEVENT_IID =
    "{9be8096b-f795-4045-9664-0c275f36fe5b}";

  int MOUSEDOWN = 1;

  int MOUSEUP = 2;

  int MOUSEOVER = 4;

  int MOUSEOUT = 8;

  int MOUSEMOVE = 16;

  int MOUSEDRAG = 32;

  int CLICK = 64;

  int DBLCLICK = 128;

  int KEYDOWN = 256;

  int KEYUP = 512;

  int KEYPRESS = 1024;

  int DRAGDROP = 2048;

  int FOCUS = 4096;

  int BLUR = 8192;

  int SELECT = 16384;

  int CHANGE = 32768;

  int RESET = 65536;

  int SUBMIT = 131072;

  int SCROLL = 262144;

  int LOAD = 524288;

  int UNLOAD = 1048576;

  int XFER_DONE = 2097152;

  int ABORT = 4194304;

  int ERROR = 8388608;

  int LOCATE = 16777216;

  int MOVE = 33554432;

  int RESIZE = 67108864;

  int FORWARD = 134217728;

  int HELP = 268435456;

  int BACK = 536870912;

  int TEXT = 1073741824;

  int ALT_MASK = 1;

  int CONTROL_MASK = 2;

  int SHIFT_MASK = 4;

  int META_MASK = 8;

  /** The original target of the event, before any retargetings. */
  nsIDOMEventTarget getOriginalTarget();

  /**
   * The explicit original target of the event.  If the event was retargeted
   * for some reason other than an anonymous boundary crossing, this will be set
   * to the target before the retargeting occurs.  For example, mouse events
   * are retargeted to their parent node when they happen over text nodes (bug
   * 185889), and in that case .target will show the parent and
   * .explicitOriginalTarget will show the text node.
   * .explicitOriginalTarget differs from .originalTarget in that it will never
   * contain anonymous content.
   */
  nsIDOMEventTarget getExplicitOriginalTarget();

  /**
   * @deprecated Use nsIDOMEvent::stopPropagation.
   */
  void preventBubble();

  /**
   * @deprecated Use nsIDOMEvent::stopPropagation.
   */
  void preventCapture();

  boolean getPreventDefault();

  boolean getIsTrusted();

}