/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsITransferable.idl
 */

package org.mozilla.interfaces;

public interface nsIFlavorDataProvider extends nsISupports {

  String NS_IFLAVORDATAPROVIDER_IID =
    "{7e225e5f-711c-11d7-9fae-000393636592}";

  /**
    * Retrieve the data from this data provider.
    *
    * @param  aTransferable (in parameter) the transferable we're being called for.
    * @param  aFlavor (in parameter) the flavor of data to retrieve
    * @param  aData the data. Some variant of class in nsISupportsPrimitives.idl
    * @param  aDataLen the length of the data
    */
  void getFlavorData(nsITransferable aTransferable, String aFlavor, nsISupports[] aData, long[] aDataLen);

}