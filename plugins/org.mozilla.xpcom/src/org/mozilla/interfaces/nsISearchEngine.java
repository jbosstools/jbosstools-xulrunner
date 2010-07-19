/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/search/nsIBrowserSearchService.idl
 */

package org.mozilla.interfaces;

public interface nsISearchEngine extends nsISupports {

  String NS_ISEARCHENGINE_IID =
    "{803e510b-4b27-4ba2-a16d-bb5fa953c166}";

  /**
   * Gets a nsISearchSubmission object that contains information about what to
   * send to the search engine, including the URI and postData, if applicable.
   *
   * @param  data
   *         Data to add to the submission object.
   *         i.e. the search terms.
   *
   * @param  responseType
   *         The MIME type that we'd like to receive in response
   *         to this submission.  If null, will default to "text/html".
   *
   * @returns A nsISearchSubmission object that contains information about what
   *          to send to the search engine.  If no submission can be
   *          obtained for the given responseType, returns null.
   */
  nsISearchSubmission getSubmission(String data, String responseType);

  /**
   * Adds a parameter to the search engine's submission data. This should only
   * be called on engines created via addEngineWithDetails.
   *
   * @param name
   *        The parameter's name. Must not be null.
   *
   * @param value
   *        The value to pass. If value is "{searchTerms}", it will be
   *        substituted with the user-entered data when retrieving the
   *        submission. Must not be null.
   *
   * @param responseType
   *        Since an engine can have several different request URLs,
   *        differentiated by response types, this parameter selects
   *        a request to add parameters to.  If null, will default
   *        to "text/html"
   *
   * @throws NS_ERROR_FAILURE if the search engine is read-only.
   * @throws NS_ERROR_INVALID_ARG if name or value are null.
   */
  void addParam(String name, String value, String responseType);

  /**
   * Determines whether the engine can return responses in the given
   * MIME type.  Returns true if the engine spec has a URL with the
   * given responseType, false otherwise.
   *
   * @param responseType
   *        The MIME type to check for
   */
  boolean supportsResponseType(String responseType);

  /**
   * Supported search engine types.
   */
  long TYPE_MOZSEARCH = 1L;

  long TYPE_SHERLOCK = 2L;

  long TYPE_OPENSEARCH = 3L;

  /**
   * Supported search engine data types.
   */
  long DATA_XML = 1L;

  long DATA_TEXT = 2L;

  /**
   * The shortcut alias of the engine. This is a unique identifier.
   */
  String getAlias();

  /**
   * The shortcut alias of the engine. This is a unique identifier.
   */
  void setAlias(String aAlias);

  /**
   * A text description describing the engine.
   */
  String getDescription();

  /**
   * Whether the engine should be hidden from the user.
   */
  boolean getHidden();

  /**
   * Whether the engine should be hidden from the user.
   */
  void setHidden(boolean aHidden);

  /**
   * A nsIURI corresponding to the engine's icon, stored locally. May be null.
   */
  nsIURI getIconURI();

  /**
   * The display name of the search engine. This is a unique identifier.
   */
  String getName();

  /**
   * A URL string pointing to the engine's search form.
   */
  String getSearchForm();

  /**
   * The search engine type.
   */
  int getType();

}