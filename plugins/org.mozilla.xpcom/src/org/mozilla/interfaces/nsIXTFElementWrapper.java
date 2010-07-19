/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xtf/public/nsIXTFElementWrapper.idl
 */

package org.mozilla.interfaces;

public interface nsIXTFElementWrapper extends nsISupports {

  String NS_IXTFELEMENTWRAPPER_IID =
    "{0ad87068-c6fd-4122-a515-ffe8c4773b10}";

  nsIDOMElement getElementNode();

  nsIDOMElement getDocumentFrameElement();

  /**
   * Events can be unmasked by setting the corresponding bit as given
   * by the NOTIFY_* constants in nsIXTFElement:
   */
  long getNotificationMask();

  /**
   * Events can be unmasked by setting the corresponding bit as given
   * by the NOTIFY_* constants in nsIXTFElement:
   */
  void setNotificationMask(long aNotificationMask);

  /**
   * Sets the intrinsic state for the element.
   * @see nsIContent::IntrinsicState().
   */
  void setIntrinsicState(int newState);

  /**
   * This sets the name of the class attribute.
   * Should be called only during ::onCreated.
   * Note! nsIXTFAttributeHandler can't be used to handle class attribute.
   */
  void setClassAttributeName(nsIAtom name);

}