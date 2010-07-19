/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/commandlines/public/nsICommandLineValidator.idl
 */

package org.mozilla.interfaces;

/**
 * Validates arguments on the command line of an XUL application.
 *
 * Each validator is registered in the category "command-line-validator".
 * The entries in this category are read in alphabetical order, and each
 * category value is treated as a service contractid implementing this
 * interface.
 *
 * By convention, validator with ordinary priority should begin with "m".
 *
 * Example:
 * Category               Entry          Value
 * command-line-validator b-browser      @mozilla.org/browser/clh;1
 * command-line-validator m-edit         @mozilla.org/composer/clh;1
 * command-line-validator m-irc          @mozilla.org/chatzilla/clh;1
 *
 */
public interface nsICommandLineValidator extends nsISupports {

  String NS_ICOMMANDLINEVALIDATOR_IID =
    "{5ecaa593-7660-4a3a-957a-92d5770671c7}";

  /**
   * Process the command-line validators in the proper order, calling
   * "validate()" on each.
   *
   * @throws NS_ERROR_ABORT if any validator throws NS_ERROR_ABORT. All other
   *         errors thrown by validators will be silently ignored.
   */
  void validate(nsICommandLine aCommandLine);

}