/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIAuthPromptProvider.idl
 */

package org.mozilla.interfaces;

public interface nsIAuthPromptProvider extends nsISupports {

  String NS_IAUTHPROMPTPROVIDER_IID =
    "{bd9dc0fa-68ce-47d0-8859-6418c2ae8576}";

  /**
     * Normal (non-proxy) prompt request.
     */
  long PROMPT_NORMAL = 0L;

  /**
     * Proxy auth request.
     */
  long PROMPT_PROXY = 1L;

  /**
     * Request a prompt interface for the given prompt reason;
     * @throws NS_ERROR_NOT_AVAILABLE if no prompt is allowed or
     * available for the given reason.
     *
     * @param aPromptReason   The reason for the auth prompt;
     *                        one of #PROMPT_NORMAL or #PROMPT_PROXY
     * @param iid             The desired interface, e.g.
     *                        NS_GET_IID(nsIAuthPrompt2).
     * @returns an nsIAuthPrompt2 interface, or throws NS_ERROR_NOT_AVAILABLE
     */
  nsISupports getAuthPrompt(long aPromptReason, String iid);

}