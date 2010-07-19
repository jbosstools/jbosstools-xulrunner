/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/passwordmgr/public/nsILoginManagerPrompter.idl
 */

package org.mozilla.interfaces;

public interface nsILoginManagerPrompter extends nsISupports {

  String NS_ILOGINMANAGERPROMPTER_IID =
    "{68b3cb59-51b8-4c57-bd7f-b2ce955a593d}";

  /**
     * Initialize the prompter. Must be called before using other interfaces.
     *
     * @param aWindow
     *        The in which the user is doing some login-related action that's
     *        resulting in a need to prompt them for something. The prompt
     *        will be associated with this window (or, if a notification bar
     *        is being used, topmost opener in some cases).
     */
  void init(nsIDOMWindow aWindow);

  /**
     * Ask the user if they want to save a login (Yes, Never, Not Now)
     *
     * @param aLogin
     *        The login to be saved.
     */
  void promptToSavePassword(nsILoginInfo aLogin);

  /**
     * Ask the user if they want to change a login's password. If the
     * user consents, modifyLogin() will be called.
     *
     * @param aOldLogin
     *        The existing login (with the old password).
     * @param aNewLogin
     *        The new login.
     */
  void promptToChangePassword(nsILoginInfo aOldLogin, nsILoginInfo aNewLogin);

  /**
     * Ask the user if they want to change the password for one of
     * multiple logins, when the caller can't determine exactly which
     * login should be changed. If the user consents, modifyLogin() will
     * be called.
     *
     * @param logins
     *        An array of existing logins.
     * @param count
     *        (length of the array)
     * @param aNewLogin
     *        The new login. 
     *
     * Note: Because the caller does not know the username of the login
     *       to be changed, aNewLogin.username and aNewLogin.usernameField
     *       will be set (using the user's selection) before modifyLogin()
     *       is called.
     */
  void promptToChangePasswordWithUsernames(nsILoginInfo[] logins, long count, nsILoginInfo aNewLogin);

}