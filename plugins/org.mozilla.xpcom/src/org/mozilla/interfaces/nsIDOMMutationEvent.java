/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMMutationEvent.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMMutationEvent extends nsIDOMEvent {

  String NS_IDOMMUTATIONEVENT_IID =
    "{8e440d86-886a-4e76-9e59-c13b939c9a4b}";

  int MODIFICATION = 1;

  int ADDITION = 2;

  int REMOVAL = 3;

  nsIDOMNode getRelatedNode();

  String getPrevValue();

  String getNewValue();

  String getAttrName();

  int getAttrChange();

  void initMutationEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, nsIDOMNode relatedNodeArg, String prevValueArg, String newValueArg, String attrNameArg, int attrChangeArg);

}