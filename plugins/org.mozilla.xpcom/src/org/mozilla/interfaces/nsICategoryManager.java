/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/components/nsICategoryManager.idl
 */

package org.mozilla.interfaces;

public interface nsICategoryManager extends nsISupports {

  String NS_ICATEGORYMANAGER_IID =
    "{3275b2cd-af6d-429a-80d7-f0c5120342ac}";

  /**
     * Get the value for the given category's entry.
     * @param aCategory The name of the category ("protocol")
     * @param aEntry The entry you're looking for ("http")
     * @return The value.
     */
  String getCategoryEntry(String aCategory, String aEntry);

  /**
     * Add an entry to a category.
     * @param aCategory The name of the category ("protocol")
     * @param aEntry The entry to be added ("http")
     * @param aValue The value for the entry ("moz.httprulez.1")
     * @param aPersist Should this data persist between invocations?
     * @param aReplace Should we replace an existing entry?
     * @return Previous entry, if any
     */
  String addCategoryEntry(String aCategory, String aEntry, String aValue, boolean aPersist, boolean aReplace);

  /**
     * Delete an entry from the category.
     * @param aCategory The name of the category ("protocol")
     * @param aEntry The entry to be added ("http")
     * @param aPersist Delete persistent data from registry, if present?
     */
  void deleteCategoryEntry(String aCategory, String aEntry, boolean aPersist);

  /**
     * Delete a category and all entries.
     * @param aCategory The category to be deleted.
     */
  void deleteCategory(String aCategory);

  /**
     * Enumerate the entries in a category.
     * @param aCategory The category to be enumerated.
     * @return a simple enumerator, each result QIs to
     *         nsISupportsCString.
     */
  nsISimpleEnumerator enumerateCategory(String aCategory);

  /**
     * Enumerate all existing categories
     * @param aCategory The category to be enumerated.
     * @return a simple enumerator, each result QIs to
     *         nsISupportsCString.
     */
  nsISimpleEnumerator enumerateCategories();

}