/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsIClipboard.idl
 */

package org.mozilla.interfaces;

public interface nsIClipboard extends nsISupports {

  String NS_ICLIPBOARD_IID =
    "{38984945-8674-4d04-b786-5c0ca9434457}";

  int kSelectionClipboard = 0;

  int kGlobalClipboard = 1;

  /**
    * Given a transferable, set the data on the native clipboard
    *
    * @param  aTransferable The transferable
    * @param  anOwner The owner of the transferable
    * @param  aWhichClipboard Specifies the clipboard to which this operation applies.
    * @result NS_Ok if no errors
    */
  void setData(nsITransferable aTransferable, nsIClipboardOwner anOwner, int aWhichClipboard);

  /**
    * Given a transferable, get the clipboard data.
    *
    * @param  aTransferable The transferable
    * @param  aWhichClipboard Specifies the clipboard to which this operation applies.
    * @result NS_Ok if no errors
    */
  void getData(nsITransferable aTransferable, int aWhichClipboard);

  /**
    * This empties the clipboard and notifies the clipboard owner.
    * This empties the "logical" clipboard. It does not clear the native clipboard.
    *
    * @param  aWhichClipboard Specifies the clipboard to which this operation applies.
    * @result NS_OK if successful.
    */
  void emptyClipboard(int aWhichClipboard);

  /**
    * This provides a way to give correct UI feedback about, for instance, a paste 
    * should be allowed. It does _NOT_ actually retreive the data and should be a very
    * inexpensive call. All it does is check if there is data on the clipboard matching
    * any of the flavors in the given list.
    *
    * @param  aFlavorList     An array of ASCII strings.
    * @param  aLength         The length of the aFlavorList.
    * @param  aWhichClipboard Specifies the clipboard to which this operation applies.
    * @outResult - if data is present matching one of 
    * @result NS_OK if successful.
    */
  boolean hasDataMatchingFlavors(String[] aFlavorList, long aLength, int aWhichClipboard);

  /**
    * Allows clients to determine if the implementation supports the concept of a 
    * separate clipboard for selection.
    * 
    * @outResult - true if 
    * @result NS_OK if successful.
    */
  boolean supportsSelectionClipboard();

}