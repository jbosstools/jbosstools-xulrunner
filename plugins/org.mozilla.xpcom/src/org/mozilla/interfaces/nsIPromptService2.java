/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/components/windowwatcher/public/nsIPromptService2.idl
 */

package org.mozilla.interfaces;

/**
 * This is an improved version of nsIPromptService that is less prescriptive
 * about the resulting user interface.
 *
 * @status INCOMPLETE do not freeze before fixing bug 228207
 */
public interface nsIPromptService2 extends nsIPromptService {

  String NS_IPROMPTSERVICE2_IID =
    "{cf86d196-dbee-4482-9dfa-3477aa128319}";

  boolean promptAuth(nsIDOMWindow aParent, nsIChannel aChannel, long level, nsIAuthInformation authInfo, String checkboxLabel, boolean[] checkValue);

  nsICancelable asyncPromptAuth(nsIDOMWindow aParent, nsIChannel aChannel, nsIAuthPromptCallback aCallback, nsISupports aContext, long level, nsIAuthInformation authInfo, String checkboxLabel, boolean[] checkValue);

}