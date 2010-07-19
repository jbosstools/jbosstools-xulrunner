/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsIAnnotationService.idl
 */

package org.mozilla.interfaces;

public interface nsIAnnotationService extends nsISupports {

  String NS_IANNOTATIONSERVICE_IID =
    "{ba249b58-346f-42a9-a393-203ae34ec6c4}";

  /**
     * Valid values for aExpiration, which sets the expiration policy for your
     * annotation. The times for the days, weeks and months policies are
     * measured since the last visit date of the page in question. These 
     * will not expire so long as the user keeps visiting the page from time
     * to time.
     */
  int EXPIRE_SESSION = 0;

  int EXPIRE_WEEKS = 2;

  int EXPIRE_MONTHS = 3;

  int EXPIRE_NEVER = 4;

  int EXPIRE_WITH_HISTORY = 5;

  int EXPIRE_DAYS = 6;

  int TYPE_INT32 = 1;

  int TYPE_DOUBLE = 2;

  int TYPE_STRING = 3;

  int TYPE_BINARY = 4;

  int TYPE_INT64 = 5;

  /**
     * Sets an annotation, overwriting any previous annotation with the same
     * URL/name. IT IS YOUR JOB TO NAMESPACE YOUR ANNOTATION NAMES.
     * Use the form "namespace/value", so your name would be like
     * "bills_extension/page_state" or "history/thumbnail".
     *
     * Do not use characters that are not valid in URLs such as spaces, ":",
     * commas, or most other symbols. You should stick to ASCII letters and
     * numbers plus "_", "-", and "/".
     *
     * aExpiration is one of EXPIRE_* above. aFlags should be 0 for now, some
     * flags will be defined in the future.
     *
     * NOTE: ALL PAGE ANNOTATIONS WILL GET DELETED WHEN THE PAGE IS REMOVED FROM
     * HISTORY IF THE PAGE IS NOT BOOKMARKED. This means that if you create an
     * annotation on an unvisited URI, it will get deleted when the browser
     * shuts down. Otherwise, URIs can exist in history as annotations but the
     * user has no way of knowing it, potentially violating their privacy
     * expectations about actions such as "Clear history".
     * If there is an important annotation that the user or extension wants to
     * keep, you should add a bookmark for the page and use an EXPIRE_NEVER
     * annotation.  This will ensure the annotation exists until the item is
     * removed by the user.
     * See EXPIRE_* constants above for further information.
     *
     * The annotation "favicon" is special. Favicons are stored in the favicon
     * service, but are special cased in the protocol handler so they look like
     * annotations. Do not set favicons using this service, it will not work.
     *
     * Binary annotations should be set using
     * setItemAnnotationBinary/setPageAnnotationBinary. For other types, only
     * C++ consumers may use the type-specific methods.
     */
  void setPageAnnotation(nsIURI aURI, String aName, nsIVariant aValue, int aFlags, int aExpiration);

  void setItemAnnotation(long aItemId, String aName, nsIVariant aValue, int aFlags, int aExpiration);

  void setPageAnnotationBinary(nsIURI aURI, String aName, byte[] aData, long aDataLen, String aMimeType, int aFlags, int aExpiration);

  void setItemAnnotationBinary(long aItemId, String aName, byte[] aData, long aDataLen, String aMimeType, int aFlags, int aExpiration);

  /**
     * Retrieves the value of a given annotation. Throws an error if the
     * annotation does not exist. Throws for binary annotations, for which
     * getPageAnnotationBinary/getItemAnnotationBinary should be used. C++
     * consumers may use the type-specific methods.
     *
     * The type-specific methods throw if the given annotation is set in
     * a different type.
     */
  nsIVariant getPageAnnotation(nsIURI aURI, String aName);

  nsIVariant getItemAnnotation(long aItemId, String aName);

  /**
     * @see getPageAnnotation. This also returns the
     * MIME type.
     */
  void getPageAnnotationBinary(nsIURI aURI, String aName, byte[][] aData, long[] aDataLen, String[] aMimeType);

  void getItemAnnotationBinary(long aItemId, String aName, byte[][] aData, long[] aDataLen, String[] aMimeType);

  /**
     * Retrieves info about an existing annotation. aMimeType will be empty
     * if the value was not binary data.
     *
     * aType will be one of TYPE_* constansts above
     *
     * example JS:
     *   var flags = {}, exp = {}, mimeType = {};
     *   annotator.getAnnotationInfo(myURI, "foo", flags, exp, mimeType);
     *   // now you can use 'exp.value' and 'flags.value'
     */
  void getPageAnnotationInfo(nsIURI aURI, String aName, int[] aFlags, int[] aExpiration, String[] aMimeType, int[] aType);

  void getItemAnnotationInfo(long aItemId, String aName, int[] aFlags, int[] aExpiration, String[] aMimeType, int[] aType);

  /**
     * Retrieves the type of an existing annotation
     * Use getAnnotationInfo if you need this along with the mime-type etc.
     *
     * @param aURI
     *        the uri on which the annotation is set
     * @param aName
     *        the annotation name
     * @return one of the TYPE_* constants above
     * @throws if the annotation is not set
     */
  int getPageAnnotationType(nsIURI aURI, String aName);

  int getItemAnnotationType(long aItemId, String aName);

  /**
     * Returns a list of all URIs having a given annotation.
     */
  nsIURI[] getPagesWithAnnotation(String name, long[] resultCount);

  long[] getItemsWithAnnotation(String name, long[] resultCount);

  /**
     * Get the names of all annotations for this URI.
     *
     * example JS:
     *   var annotations = annotator.getPageAnnotations(myURI, {});
     */
  nsIVariant[] getPageAnnotationNames(nsIURI aURI, long[] count);

  nsIVariant[] getItemAnnotationNames(long aItemId, long[] count);

  /**
     * Test for annotation existance.
     */
  boolean pageHasAnnotation(nsIURI aURI, String aName);

  boolean itemHasAnnotation(long aItemId, String aName);

  /**
     * Removes a specific annotation. Succeeds even if the annotation is
     * not found.
     */
  void removePageAnnotation(nsIURI aURI, String aName);

  void removeItemAnnotation(long aItemId, String aName);

  /**
     * Removes all annotations for the given page/item.
     * We may want some other similar functions to get annotations with given
     * flags (once we have flags defined).
     */
  void removePageAnnotations(nsIURI aURI);

  void removeItemAnnotations(long aItemId);

  /**
     * Copies all annotations from the source to the destination URI/item. If
     * the destination already has an annotation with the same name as one on
     * the source, it will be overwritten if aOverwriteDest is set. Otherwise,
     * the destination URIs will be preferred.
     *
     * All the source annotations will stay as-is. If you don't want them
     * any more, use removePageAnnotations on that URI.
     */
  void copyPageAnnotations(nsIURI aSourceURI, nsIURI aDestURI, boolean aOverwriteDest);

  void copyItemAnnotations(long aSourceItemId, long aDestItemId, boolean aOverwriteDest);

  /**
     * Adds an annotation observer. The annotation service will keep an owning
     * reference to the observer object.
     */
  void addObserver(nsIAnnotationObserver aObserver);

  /**
     * Removes an annotaton observer previously registered by addObserver.
     */
  void removeObserver(nsIAnnotationObserver aObserver);

  /**
     * Returns a URI that can be used to access the given binary annotation.
     * This function does NOT check that the annotation exists. Also, note that
     * you can only load URIs for annotations that have have a valid MIME type
     * set by setAnnotationBinary. No non-URI valid chars in name, especially
     * colon, which will mess up parsing.
     */
  nsIURI getAnnotationURI(nsIURI aURI, String aName);

}