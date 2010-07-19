/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/protocol/http/public/nsIHttpAuthenticator.idl
 */

package org.mozilla.interfaces;

/**
 * nsIHttpAuthenticator
 *
 * Interface designed to allow for pluggable HTTP authentication modules.
 * Implementations are registered under the ContractID:
 *
 *   "@mozilla.org/network/http-authenticator;1?scheme=<auth-scheme>"  
 *
 * where <auth-scheme> is the lower-cased value of the authentication scheme
 * found in the server challenge per the rules of RFC 2617.
 */
public interface nsIHttpAuthenticator extends nsISupports {

  String NS_IHTTPAUTHENTICATOR_IID =
    "{0f331436-8bc8-4c68-a124-d0253a19d06f}";

  /**
     * Upon receipt of a server challenge, this function is called to determine
     * whether or not the current user identity has been rejected.  If true,
     * then the user will be prompted by the channel to enter (or revise) their
     * identity.  Following this, generateCredentials will be called.
     *
     * If the IDENTITY_IGNORED auth flag is set, then the aInvalidateIdentity
     * return value will be ignored, and user prompting will be suppressed.
     *
     * @param aChannel
     *        the http channel that received the challenge.
     * @param aChallenge
     *        the challenge from the WWW-Authenticate/Proxy-Authenticate
     *        server response header.  (possibly from the auth cache.)
     * @param aProxyAuth
     *        flag indicating whether or not aChallenge is from a proxy.
     * @param aSessionState
     *        see description below for generateCredentials.
     * @param aContinuationState
     *        see description below for generateCredentials.
     * @param aInvalidateIdentity
     *        return value indicating whether or not to prompt the user for a
     *        revised identity.
     */
  void challengeReceived(nsIHttpChannel aChannel, String aChallenge, boolean aProxyAuth, nsISupports[] aSessionState, nsISupports[] aContinuationState, boolean[] aInvalidatesIdentity);

  /**
     * Called to generate the authentication credentials for a particular
     * server/proxy challenge.  This is the value that will be sent back
     * to the server via an Authorization/Proxy-Authorization header.
     *
     * This function may be called using a cached challenge provided the
     * authenticator sets the REUSABLE_CHALLENGE flag.
     *
     * @param aChannel
     *        the http channel requesting credentials
     * @param aChallenge
     *        the challenge from the WWW-Authenticate/Proxy-Authenticate
     *        server response header.  (possibly from the auth cache.)
     * @param aProxyAuth
     *        flag indicating whether or not aChallenge is from a proxy.
     * @param aDomain
     *        string containing the domain name (if appropriate)
     * @param aUser
     *        string containing the user name
     * @param aPassword
     *        string containing the password
     * @param aSessionState
     *        state stored along side the user's identity in the auth cache
     *        for the lifetime of the browser session.  if a new auth cache
     *        entry is created for this challenge, then this parameter will
     *        be null.  on return, the result will be stored in the new auth
     *        cache entry.  this parameter is non-null when an auth cache entry
     *        is being reused.
     * @param aContinuationState
     *        state held by the channel between consecutive calls to
     *        generateCredentials, assuming multiple calls are required
     *        to authenticate.  this state is held for at most the lifetime of
     *        the channel.
     */
  String generateCredentials(nsIHttpChannel aChannel, String aChallenge, boolean aProxyAuth, String aDomain, String aUser, String aPassword, nsISupports[] aSessionState, nsISupports[] aContinuationState);

  /**
     * Flags defining various properties of the authenticator.
     */
  long getAuthFlags();

  /**
     * A request based authentication scheme only authenticates an individual
     * request (or a set of requests under the same authentication domain as
     * defined by RFC 2617).  BASIC and DIGEST are request based authentication
     * schemes.
     */
  long REQUEST_BASED = 1L;

  /**
     * A connection based authentication scheme authenticates an individual
     * connection.  Multiple requests may be issued over the connection without
     * repeating the authentication steps.  Connection based authentication
     * schemes can associate state with the connection being authenticated via
     * the aContinuationState parameter (see generateCredentials).
     */
  long CONNECTION_BASED = 2L;

  /**
     * The credentials returned from generateCredentials may be reused with any
     * other URLs within "the protection space" as defined by RFC 2617 section
     * 1.2.  If this flag is not set, then generateCredentials must be called
     * for each request within the protection space.  REUSABLE_CREDENTIALS
     * implies REUSABLE_CHALLENGE.
     */
  long REUSABLE_CREDENTIALS = 4L;

  /**
     * A challenge may be reused to later generate credentials in anticipation
     * of a duplicate server challenge for URLs within "the protection space"
     * as defined by RFC 2617 section 1.2.
     */
  long REUSABLE_CHALLENGE = 8L;

  /**
     * This flag indicates that the identity of the user is not required by
     * this authentication scheme.
     */
  long IDENTITY_IGNORED = 1024L;

  /**
     * This flag indicates that the identity of the user includes a domain
     * attribute that the user must supply.
     */
  long IDENTITY_INCLUDES_DOMAIN = 2048L;

  /**
     * This flag indicates that the identity will be sent encrypted. It does
     * not make sense to combine this flag with IDENTITY_IGNORED.
     */
  long IDENTITY_ENCRYPTED = 4096L;

}