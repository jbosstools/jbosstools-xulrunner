/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/intl/chardet/public/nsICharsetResolver.idl
 */

package org.mozilla.interfaces;

public interface nsICharsetResolver extends nsISupports {

  String NS_ICHARSETRESOLVER_IID =
    "{d143a084-b626-4614-845f-41f3ca43a674}";

  /**
     * Called to resolve the charset that should be used for parsing the
     * document being loaded from aChannel.
     *
     * If the charset cannot be resolved, but the implementation of
     * nsICharsetResolver wants to be notified of the final resolved charset
     * when one is available, it can set wantCharset to true.  If this is done,
     * the caller of requestCharset is responsible for calling
     * notifyResovedCharset and passing it the final resolved charset and the
     * closure that requestCharset set.
     * 
     * @param aWebNavigation the nsIWebNavigation the document is being loaded
     *                       in.  May be null.
     * @param aChannel the channel the document is coming in from.
     * @param aWantCharset gets set to true if notifyResolvedCharset should be
     *                     called with the given closure object.
     * @param aClosure a resulting object which should be passed
     *                 to notifyResolvedCharset if wantCharset is set to
     *                 true.
     * @returns the resolved charset, or the empty string if no
     *          charset could be determined.
     */
  String requestCharset(nsIWebNavigation aWebNavigation, nsIChannel aChannel, boolean[] aWantCharset, nsISupports[] aClosure);

  /**
     * notifyResolvedCharset
     *
     * some implementations may request that they be notified when the
     * charset is actually detected. 
     *
     * @param charset the detected charset
     * @param closure the closre returned by detectCharset() above
     */
  void notifyResolvedCharset(String charset, nsISupports closure);

}