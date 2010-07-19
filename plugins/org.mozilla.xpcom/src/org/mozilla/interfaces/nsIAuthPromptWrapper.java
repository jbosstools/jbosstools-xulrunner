/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/components/windowwatcher/public/nsIAuthPromptWrapper.idl
 */

package org.mozilla.interfaces;

/**
 * nsIAuthPromptWrapper
 *
 * An override of nsIAuthPrompt which performs some action
 * on the data going through nsIAuthPrompt methods. Persisting
 * data from the prompts and using it to pre-fill subsequent prompts
 * would be one such action.
 *
 * @status
 */
public interface nsIAuthPromptWrapper extends nsIAuthPrompt {

  String NS_IAUTHPROMPTWRAPPER_IID =
    "{6228d644-17fe-11d4-8cee-0060b0fc14a3}";

  /**
     * setPromptDialogs
     *
     * @param dialogs  the dialog implementation which will
     *                 be used to display the prompts
     */
  void setPromptDialogs(nsIPrompt dialogs);

}