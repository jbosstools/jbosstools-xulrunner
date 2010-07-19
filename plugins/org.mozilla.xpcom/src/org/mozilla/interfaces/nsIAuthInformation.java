/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIAuthInformation.idl
 */

package org.mozilla.interfaces;

/**
 * A object that hold authentication information. The caller of
 * nsIAuthPrompt2::promptUsernameAndPassword or
 * nsIAuthPrompt2::promptPasswordAsync provides an object implementing this
 * interface; the prompt implementation can then read the values here to prefill
 * the dialog. After the user entered the authentication information, it should
 * set the attributes of this object to indicate to the caller what was entered
 * by the user.
 */
public interface nsIAuthInformation extends nsISupports {

  String NS_IAUTHINFORMATION_IID =
    "{0d73639c-2a92-4518-9f92-28f71fea5f20}";

  /** @name Flags */
/**
   * This dialog belongs to a network host.
   */
  long AUTH_HOST = 1L;

  /**
   * This dialog belongs to a proxy.
   */
  long AUTH_PROXY = 2L;

  /**
   * This dialog needs domain information. The user interface should show a
   * domain field, prefilled with the domain attribute's value.
   */
  long NEED_DOMAIN = 4L;

  /**
   * This dialog only asks for password information. Authentication prompts
   * SHOULD NOT show a username field. Attempts to change the username field
   * will have no effect. nsIAuthPrompt2 implementations should, however, show
   * its initial value to the user in some form. For example, a paragraph in
   * the dialog might say "Please enter your password for user jsmith at
   * server intranet".
   *
   * This flag is mutually exclusive with #NEED_DOMAIN.
   */
  long ONLY_PASSWORD = 8L;

  /**
   * Flags describing this dialog. A bitwise OR of the flag values
   * above.
   *
   * It is possible that neither #AUTH_HOST nor #AUTH_PROXY are set.
   *
   * Auth prompts should ignore flags they don't understand; especially, they
   * should not throw an exception because of an unsupported flag.
   */
  long getFlags();

  /**
   * The server-supplied realm of the authentication as defined in RFC 2617.
   * Can be the empty string if the protocol does not support realms.
   * Otherwise, this is a human-readable string like "Secret files".
   */
  String getRealm();

  /**
   * The authentication scheme used for this request, if applicable. If the
   * protocol for this authentication does not support schemes, this will be
   * the empty string. Otherwise, this will be a string such as "basic" or 
   * "digest". This string will always be in lowercase.
   */
  String getAuthenticationScheme();

  /**
   * The initial value should be used to prefill the dialog or be shown
   * in some other way to the user.
   * On return, this parameter should contain the username entered by
   * the user.
   * This field can only be changed if the #ONLY_PASSWORD flag is not set.
   */
  String getUsername();

  /**
   * The initial value should be used to prefill the dialog or be shown
   * in some other way to the user.
   * On return, this parameter should contain the username entered by
   * the user.
   * This field can only be changed if the #ONLY_PASSWORD flag is not set.
   */
  void setUsername(String aUsername);

  /**
   * The initial value should be used to prefill the dialog or be shown
   * in some other way to the user.
   * The password should not be shown in clear.
   * On return, this parameter should contain the password entered by
   * the user.
   */
  String getPassword();

  /**
   * The initial value should be used to prefill the dialog or be shown
   * in some other way to the user.
   * The password should not be shown in clear.
   * On return, this parameter should contain the password entered by
   * the user.
   */
  void setPassword(String aPassword);

  /**
   * The initial value should be used to prefill the dialog or be shown
   * in some other way to the user.
   * On return, this parameter should contain the domain entered by
   * the user.
   * This attribute is only used if flags include #NEED_DOMAIN.
   */
  String getDomain();

  /**
   * The initial value should be used to prefill the dialog or be shown
   * in some other way to the user.
   * On return, this parameter should contain the domain entered by
   * the user.
   * This attribute is only used if flags include #NEED_DOMAIN.
   */
  void setDomain(String aDomain);

}