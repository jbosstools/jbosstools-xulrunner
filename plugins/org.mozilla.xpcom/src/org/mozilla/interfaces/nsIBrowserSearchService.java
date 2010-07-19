/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/search/nsIBrowserSearchService.idl
 */

package org.mozilla.interfaces;

public interface nsIBrowserSearchService extends nsISupports {

  String NS_IBROWSERSEARCHSERVICE_IID =
    "{8307b8f2-08ea-45b8-96bf-b1dc7688fe3b}";

  /**
   * Adds a new search engine from the file at the supplied URI, optionally
   * asking the user for confirmation first.  If a confirmation dialog is
   * shown, it will offer the option to begin using the newly added engine
   * right away; if no confirmation dialog is shown, the new engine will be
   * used right away automatically.
   *
   * @param engineURL
   *        The URL to the search engine's description file.
   *
   * @param dataType
   *        An integer representing the plugin file format. Must be one
   *        of the supported search engine data types defined above.
   *
   * @param iconURL
   *        A URL string to an icon file to be used as the search engine's
   *        icon. This value may be overridden by an icon specified in the
   *        engine description file.
   *
   * @param confirm
   *        A boolean value indicating whether the user should be asked for
   *        confirmation before this engine is added to the list.  If this
   *        value is false, the engine will be added to the list upon successful
   *        load, but it will not be selected as the current engine.
   *
   * @throws NS_ERROR_FAILURE if the type is invalid, or if the description
   *         file cannot be successfully loaded.
   */
  void addEngine(String engineURL, int dataType, String iconURL, boolean confirm);

  /**
   * Adds a new search engine, without asking the user for confirmation and
   * without starting to use it right away.
   *
   * @param name
   *        The search engine's name. Must be unique. Must not be null.
   *
   * @param iconURL
   *        Optional: A URL string pointing to the icon to be used to represent
   *        the engine.
   *
   * @param alias
   *        Optional: A unique shortcut that can be used to retrieve the
   *        search engine.
   *
   * @param description
   *        Optional: a description of the search engine.
   *
   * @param method
   *        The HTTP request method used when submitting a search query.
   *        Must be a case insensitive value of either "get" or "post".
   *
   * @param url
   *        The URL to which search queries should be sent.
   *        Must not be null.
   */
  void addEngineWithDetails(String name, String iconURL, String alias, String description, String method, String url);

  /**
   * Un-hides all engines installed in the directory corresponding to
   * the directory service's NS_APP_SEARCH_DIR key. (i.e. the set of
   * engines returned by getDefaultEngines)
   */
  void restoreDefaultEngines();

  /**
   * Returns an engine with the specified alias.
   *
   * @param   alias
   *          The search engine's alias.
   * @returns The corresponding nsISearchEngine object, or null if it doesn't
   *          exist.
   */
  nsISearchEngine getEngineByAlias(String alias);

  /**
   * Returns an engine with the specified name.
   *
   * @param   aEngineName
   *          The name of the engine.
   * @returns The corresponding nsISearchEngine object, or null if it doesn't
   *          exist.
   */
  nsISearchEngine getEngineByName(String aEngineName);

  /**
   * Returns an array of all installed search engines.
   *
   * @returns an array of nsISearchEngine objects.
   */
  nsISearchEngine[] getEngines(long[] engineCount);

  /**
   * Returns an array of all installed search engines whose hidden attribute is
   * false.
   *
   * @returns an array of nsISearchEngine objects.
   */
  nsISearchEngine[] getVisibleEngines(long[] engineCount);

  /**
   * Returns an array of all default search engines. This includes all loaded
   * engines that aren't in the user's profile directory
   * (NS_APP_USER_SEARCH_DIR).
   *
   * @returns an array of nsISearchEngine objects.
   */
  nsISearchEngine[] getDefaultEngines(long[] engineCount);

  /**
   * Moves a visible search engine.
   *
   * @param  engine
   *         The engine to move.
   * @param  newIndex
   *         The engine's new index in the set of visible engines.
   *
   * @throws NS_ERROR_FAILURE if newIndex is out of bounds, or if engine is
   *         hidden.
   */
  void moveEngine(nsISearchEngine engine, int newIndex);

  /**
   * Removes the search engine. If the search engine is installed in a global
   * location, this will just hide the engine. If the engine is in the user's
   * profile directory, it will be removed from disk.
   *
   * @param  engine
   *         The engine to remove.
   */
  void removeEngine(nsISearchEngine engine);

  /**
   * The default search engine. May be null if there are no visible
   * search engines installed.
   */
  nsISearchEngine getDefaultEngine();

  /**
   * The currently active search engine. May be null if there are no visible
   * search engines installed.
   */
  nsISearchEngine getCurrentEngine();

  /**
   * The currently active search engine. May be null if there are no visible
   * search engines installed.
   */
  void setCurrentEngine(nsISearchEngine aCurrentEngine);

}