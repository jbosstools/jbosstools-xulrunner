/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/uriloader/exthandler/nsIContentDispatchChooser.idl
 */

package org.mozilla.interfaces;

/**
 * This is used to ask a user what they would like to do with a given piece of
 * content.
 */
public interface nsIContentDispatchChooser extends nsISupports {

  String NS_ICONTENTDISPATCHCHOOSER_IID =
    "{456ca3b2-02be-4f97-89a2-08c08d3ad88f}";

  /**
  * This request is passed to the helper app dialog because Gecko can not
  * handle content of this type.
  */
  long REASON_CANNOT_HANDLE = 0L;

  /**
  * Asks the user what to do with the content.
  *
  * @param aHander
  *        The interface describing the details of how this content should or
  *        can be handled.
  * @param aWindowContext
  *        The parent window context to show this chooser.  This can be null,
  *        and some implementations may not care about it.  Generally, you'll
  *        want to pass an nsIDOMWindow in so the chooser can be properly
  *        parented when opened.
  * @param aURI
  *        The URI of the resource that we are asking about.
  * @param aReason
  *        The reason why we are asking (see above).
  */
  void ask(nsIHandlerInfo aHandler, nsIInterfaceRequestor aWindowContext, nsIURI aURI, long aReason);

}