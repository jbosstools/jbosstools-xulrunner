/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xul/templates/public/nsIXULSortService.idl
 */

package org.mozilla.interfaces;

/**
 * A service used to sort the contents of a XUL widget.
 */
public interface nsIXULSortService extends nsISupports {

  String NS_IXULSORTSERVICE_IID =
    "{f29270c8-3be5-4046-9b57-945a84dff132}";

  /**
     * Sort the contents of the widget containing <code>aNode</code>
     * using <code>aSortKey</code> as the comparison key, and
     * <code>aSortDirection</code> as the direction.
     *
     * @param aNode A node in the XUL widget whose children are to be sorted.
     * @param aSortKey The value to be used as the comparison key.
     * @param aSortDirection May be either <b>natural</b> to return
     * the contents to their natural (unsorted) order,
     * <b>ascending</b> to sort the contents in ascending order, or
     * <b>descending</b> to sort the contents in descending order.
     */
  void sort(nsIDOMNode aNode, String aSortKey, String aSortDirection);

}