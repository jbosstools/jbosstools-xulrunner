/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xtf/public/nsIXTFElement.idl
 */

package org.mozilla.interfaces;

public interface nsIXTFElement extends nsISupports {

  String NS_IXTFELEMENT_IID =
    "{4f144387-796d-4baf-8641-5db45dba1808}";

  void onCreated(nsIXTFElementWrapper wrapper);

  void onDestroyed();

  boolean getIsAttributeHandler();

  String[] getScriptingInterfaces(long[] count);

  long NOTIFY_WILL_CHANGE_DOCUMENT = 1L;

  long NOTIFY_DOCUMENT_CHANGED = 2L;

  long NOTIFY_WILL_CHANGE_PARENT = 4L;

  long NOTIFY_PARENT_CHANGED = 8L;

  long NOTIFY_WILL_INSERT_CHILD = 16L;

  long NOTIFY_CHILD_INSERTED = 32L;

  long NOTIFY_WILL_APPEND_CHILD = 64L;

  long NOTIFY_CHILD_APPENDED = 128L;

  long NOTIFY_WILL_REMOVE_CHILD = 256L;

  long NOTIFY_CHILD_REMOVED = 512L;

  long NOTIFY_WILL_SET_ATTRIBUTE = 1024L;

  long NOTIFY_ATTRIBUTE_SET = 2048L;

  long NOTIFY_WILL_REMOVE_ATTRIBUTE = 4096L;

  long NOTIFY_ATTRIBUTE_REMOVED = 8192L;

  long NOTIFY_BEGIN_ADDING_CHILDREN = 16384L;

  long NOTIFY_DONE_ADDING_CHILDREN = 32768L;

  long NOTIFY_HANDLE_DEFAULT = 65536L;

  long NOTIFY_PERFORM_ACCESSKEY = 131072L;

  void willChangeDocument(nsIDOMDocument newDoc);

  void documentChanged(nsIDOMDocument newDoc);

  void willChangeParent(nsIDOMElement newParent);

  void parentChanged(nsIDOMElement newParent);

  void willInsertChild(nsIDOMNode child, long index);

  void childInserted(nsIDOMNode child, long index);

  void willAppendChild(nsIDOMNode child);

  void childAppended(nsIDOMNode child);

  void willRemoveChild(long index);

  void childRemoved(long index);

  void willSetAttribute(nsIAtom name, String newValue);

  void attributeSet(nsIAtom name, String newValue);

  void willRemoveAttribute(nsIAtom name);

  void attributeRemoved(nsIAtom name);

  void beginAddingChildren();

  void doneAddingChildren();

  boolean handleDefault(nsIDOMEvent aEvent);

  void cloneState(nsIDOMElement aElement);

  /**
   * Returns accesskey attribute node.
   */
  nsIDOMAttr getAccesskeyNode();

  /**
   * Performs accesskey. The method is called when accesskey is activated.
   */
  void performAccesskey();

}