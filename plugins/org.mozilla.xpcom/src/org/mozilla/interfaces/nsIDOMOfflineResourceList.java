/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/offline/nsIDOMOfflineResourceList.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMOfflineResourceList extends nsISupports {

  String NS_IDOMOFFLINERESOURCELIST_IID =
    "{f394a721-66e9-46fc-bb24-b980bb732dd0}";

  /**
   * Get the list of dynamically-managed entries.
   */
  nsIDOMDOMStringList getMozItems();

  /**
   * Check that an entry exists in the list of dynamically-managed entries.
   *
   * @param uri
   *        The resource to check.
   */
  boolean mozHasItem(String uri);

  /**
   * Get the number of dynamically-managed entries.
   * @status DEPRECATED
   *         Clients should use the "items" attribute.
   */
  long getMozLength();

  /**
   * Get the URI of a dynamically-managed entry.
   * @status DEPRECATED
   *         Clients should use the "items" attribute.
   */
  String mozItem(long index);

  /**
   * Add an item to the list of dynamically-managed entries.  The resource
   * will be fetched into the application cache.
   *
   * @param uri
   *        The resource to add.
   */
  void mozAdd(String uri);

  /**
   * Remove an item from the list of dynamically-managed entries.  If this
   * was the last reference to a URI in the application cache, the cache
   * entry will be removed.
   *
   * @param uri
   *        The resource to remove.
   */
  void mozRemove(String uri);

  /**
   * State of the application cache this object is associated with.
   */
  int UNCACHED = 0;

  int IDLE = 1;

  int CHECKING = 2;

  int DOWNLOADING = 3;

  int UPDATEREADY = 4;

  int OBSOLETE = 5;

  int getStatus();

  /**
   * Begin the application update process on the associated application cache.
   */
  void update();

  /**
   * Swap in the newest version of the application cache, or disassociate
   * from the cache if the cache group is obsolete.
   */
  void swapCache();

  nsIDOMEventListener getOnchecking();

  void setOnchecking(nsIDOMEventListener aOnchecking);

  nsIDOMEventListener getOnerror();

  void setOnerror(nsIDOMEventListener aOnerror);

  nsIDOMEventListener getOnnoupdate();

  void setOnnoupdate(nsIDOMEventListener aOnnoupdate);

  nsIDOMEventListener getOndownloading();

  void setOndownloading(nsIDOMEventListener aOndownloading);

  nsIDOMEventListener getOnprogress();

  void setOnprogress(nsIDOMEventListener aOnprogress);

  nsIDOMEventListener getOnupdateready();

  void setOnupdateready(nsIDOMEventListener aOnupdateready);

  nsIDOMEventListener getOncached();

  void setOncached(nsIDOMEventListener aOncached);

  nsIDOMEventListener getOnobsolete();

  void setOnobsolete(nsIDOMEventListener aOnobsolete);

}