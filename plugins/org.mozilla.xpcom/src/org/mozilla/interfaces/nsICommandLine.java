/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/commandlines/public/nsICommandLine.idl
 */

package org.mozilla.interfaces;

/**
 * Represents the command line used to invoke a XUL application. This may be the
 * original command-line of this instance, or a command line remoted from another
 * instance of the application.
 *
 * DEFINITIONS:
 * "arguments" are any values found on the command line.
 * "flags" are switches. In normalized form they are preceded by a single dash.
 * Some flags may take "parameters", e.g. "-url <param>" or "-install-xpi <param>"
 *
 * @status UNDER_REVIEW This interface is intended to be frozen, but isn't frozen
 *                      yet. Please use with care.
 */
public interface nsICommandLine extends nsISupports {

  String NS_ICOMMANDLINE_IID =
    "{bc3173bd-aa46-46a0-9d25-d9867a9659b6}";

  /**
   * Number of arguments in the command line. The application name is not
   * part of the command line.
   */
  int getLength();

  /**
   * Get an argument from the array of command-line arguments.
   *
   * On windows, flags of the form /flag are normalized to -flag. /flag:param
   * are normalized to -flag param.
   *
   * On *nix and mac flags of the form --flag are normalized to -flag. --flag=param
   * are normalized to the form -flag param.
   *
   * @param aIndex The argument to retrieve. This index is 0-based, and does
   *               not include the application name.
   * @return       The indexth argument.
   * @throws       NS_ERROR_INVALID_ARG if aIndex is out of bounds.
   */
  String getArgument(int aIndex);

  /**
   * Find a command-line flag.
   *
   * @param aFlag          The flag name to locate. Do not include the initial
   *                       hyphen.
   * @param aCaseSensitive Whether to do case-sensitive comparisons.
   * @return               The position of the flag in the command line.
   */
  int findFlag(String aFlag, boolean aCaseSensitive);

  /**
   * Remove arguments from the command line. This normally occurs after
   * a handler has processed the arguments.
   *
   * @param aStart  Index to begin removing.
   * @param aEnd    Index to end removing, inclusive.
   */
  void removeArguments(int aStart, int aEnd);

  /**
   * A helper method which will find a flag and remove it in one step.
   *
   * @param aFlag  The flag name to find and remove.
   * @param aCaseSensitive Whether to do case-sensitive comparisons.
   * @return       Whether the flag was found.
   */
  boolean handleFlag(String aFlag, boolean aCaseSensitive);

  /**
   * Find a flag with a parameter and remove both. This is a helper
   * method that combines "findFlag" and "removeArguments" in one step.
   *
   * @return   null (a void astring) if the flag is not found. The parameter value
   *           if found. Note that null and the empty string are not the same.
   * @throws   NS_ERROR_INVALID_ARG if the flag exists without a parameter
   *
   * @param aFlag The flag name to find and remove.
   * @param aCaseSensitive Whether to do case-sensitive flag search.
   */
  String handleFlagWithParam(String aFlag, boolean aCaseSensitive);

  /**
   * The type of command line being processed.
   *
   * STATE_INITIAL_LAUNCH  is the first launch of the application instance.
   * STATE_REMOTE_AUTO     is a remote command line automatically redirected to
   *                       this instance.
   * STATE_REMOTE_EXPLICIT is a remote command line explicitly redirected to
   *                       this instance using xremote/windde/appleevents.
   */
  long getState();

  long STATE_INITIAL_LAUNCH = 0L;

  long STATE_REMOTE_AUTO = 1L;

  long STATE_REMOTE_EXPLICIT = 2L;

  /**
   * There may be a command-line handler which performs a default action if
   * there was no explicit action on the command line (open a default browser
   * window, for example). This flag allows the default action to be prevented.
   */
  boolean getPreventDefault();

  /**
   * There may be a command-line handler which performs a default action if
   * there was no explicit action on the command line (open a default browser
   * window, for example). This flag allows the default action to be prevented.
   */
  void setPreventDefault(boolean aPreventDefault);

  /**
   * The working directory for this command line. Use this property instead
   * of the working directory for the current process, since a redirected
   * command line may have had a different working directory.
   */
  nsIFile getWorkingDirectory();

  /**
   * A window to be targeted by this command line. In most cases, this will
   * be null (xremote will sometimes set this attribute).
   */
  nsIDOMWindow getWindowContext();

  /**
   * Resolve a file-path argument into an nsIFile. This method gracefully
   * handles relative or absolute file paths, according to the working
   * directory of this command line.
   *
   * @param aArgument  The command-line argument to resolve.
   */
  nsIFile resolveFile(String aArgument);

  /**
   * Resolves a URI argument into a URI. This method has platform-specific
   * logic for converting an absolute URI or a relative file-path into the
   * appropriate URI object; it gracefully handles win32 C:\ paths which would
   * confuse the ioservice if passed directly.
   *
   * @param aArgument  The command-line argument to resolve.
   */
  nsIURI resolveURI(String aArgument);

}