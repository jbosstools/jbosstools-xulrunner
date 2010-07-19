/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/components/windowwatcher/public/nsIPromptFactory.idl
 */

package org.mozilla.interfaces;

/**
 * This interface allows creating various prompts that have a specific parent.
 */
public interface nsIPromptFactory extends nsISupports {

  String NS_IPROMPTFACTORY_IID =
    "{2532b748-75db-4732-9173-78d3bf34f694}";

  /**
   * Returns an object implementing the specified interface that creates
   * prompts parented to aParent.
   */
  nsISupports getPrompt(nsIDOMWindow aParent, String iid);

}