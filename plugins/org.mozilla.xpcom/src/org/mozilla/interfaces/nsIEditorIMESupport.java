/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/idl/nsIEditorIMESupport.idl
 */

package org.mozilla.interfaces;

public interface nsIEditorIMESupport extends nsISupports {

  String NS_IEDITORIMESUPPORT_IID =
    "{57032dcb-e8c7-4eb6-8ec6-a0f8e300809d}";

  /**
   * endComposition() Handles the end of inline input composition.
   */
  void endComposition();

  /**
   * forceCompositionEnd() force the composition end
   */
  void forceCompositionEnd();

  /**
   * whether this editor has active IME transaction
   */
  boolean getComposing();

}