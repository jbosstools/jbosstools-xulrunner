/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMDragEvent.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMDragEvent extends nsIDOMMouseEvent {

  String NS_IDOMDRAGEVENT_IID =
    "{d52cf140-fb90-44df-8d69-4b2bab4d461f}";

  nsIDOMDataTransfer getDataTransfer();

  void initDragEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, nsIDOMAbstractView aView, int aDetail, int aScreenX, int aScreenY, int aClientX, int aClientY, boolean aCtrlKey, boolean aAltKey, boolean aShiftKey, boolean aMetaKey, int aButton, nsIDOMEventTarget aRelatedTarget, nsIDOMDataTransfer aDataTransfer);

  void initDragEventNS(String namespaceURIArg, String typeArg, boolean canBubbleArg, boolean cancelableArg, nsIDOMAbstractView aView, int aDetail, int aScreenX, int aScreenY, int aClientX, int aClientY, boolean aCtrlKey, boolean aAltKey, boolean aShiftKey, boolean aMetaKey, int aButton, nsIDOMEventTarget aRelatedTarget, nsIDOMDataTransfer aDataTransfer);

}