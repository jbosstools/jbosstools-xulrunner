/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/base/nsIStyleSheetService.idl
 */

package org.mozilla.interfaces;

public interface nsIStyleSheetService extends nsISupports {

  String NS_ISTYLESHEETSERVICE_IID =
    "{1f42a6a2-ab0a-45d4-8a96-396f58ea6c6d}";

  long AGENT_SHEET = 0L;

  long USER_SHEET = 1L;

  /**
   * Synchronously loads a style sheet from |sheetURI| and adds it to the list
   * of user or agent style sheets.
   *
   * A user sheet loaded via this API will come before userContent.css and
   * userChrome.css in the cascade (so the rules in it will have lower
   * precedence than rules in those sheets).
   *
   * An agent sheet loaded via this API will come after ua.css in the cascade
   * (so the rules in it will have higher precedence than rules in ua.css).
   *
   * The relative ordering of two user or two agent sheets loaded via
   * this API is undefined.
   *
   * Sheets added via this API take effect on all documents, including
   * already-loaded ones, immediately.
   */
  void loadAndRegisterSheet(nsIURI sheetURI, long type);

  /**
   * Returns true if a style sheet at |sheetURI| has previously been
   * added to the list of style sheets specified by |type|.
   */
  boolean sheetRegistered(nsIURI sheetURI, long type);

  /**
   * Remove the style sheet at |sheetURI| from the list of style sheets
   * specified by |type|.  The removal takes effect immediately, even for
   * already-loaded documents.
   */
  void unregisterSheet(nsIURI sheetURI, long type);

}