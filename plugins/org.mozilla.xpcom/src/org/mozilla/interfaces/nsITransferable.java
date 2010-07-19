/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsITransferable.idl
 */

package org.mozilla.interfaces;

/**
  * nsIFlavorDataProvider allows a flavor to 'promise' data later,
  * supplying the data lazily.
  * 
  * To use it, call setTransferData, passing the flavor string,
  * a nsIFlavorDataProvider QI'd to nsISupports, and a data size of 0.
  *
  * When someone calls getTransferData later, if the data size is
  * stored as 0, the nsISupports will be QI'd to nsIFlavorDataProvider,
  * and its getFlavorData called.
  *
  */
public interface nsITransferable extends nsISupports {

  String NS_ITRANSFERABLE_IID =
    "{8b5314bc-db01-11d2-96ce-0060b0fb9956}";

  int kFlavorHasDataProvider = 0;

  /**
    * Computes a list of flavors (mime types as nsISupportsCString) that the transferable 
    * can export, either through intrinsic knowledge or output data converters.
    *
    * @param  aDataFlavorList fills list with supported flavors. This is a copy of
    *          the internal list, so it may be edited w/out affecting the transferable.
    */
  nsISupportsArray flavorsTransferableCanExport();

  /**
    * Given a flavor retrieve the data. 
    *
    * @param  aFlavor (in parameter) the flavor of data to retrieve
    * @param  aData the data. Some variant of class in nsISupportsPrimitives.idl
    * @param  aDataLen the length of the data
    */
  void getTransferData(String aFlavor, nsISupports[] aData, long[] aDataLen);

  /**
    * Returns the best flavor in the transferable, given those that have
    * been added to it with |AddFlavor()|
    *
    * @param  aFlavor (out parameter) the flavor of data that was retrieved
    * @param  aData the data. Some variant of class in nsISupportsPrimitives.idl
    * @param  aDataLen the length of the data
    */
  void getAnyTransferData(String[] aFlavor, nsISupports[] aData, long[] aDataLen);

  /**
    * Returns true if the data is large.
    */
  boolean isLargeDataSet();

  /**
    * Computes a list of flavors (mime types as nsISupportsCString) that the transferable can
    * accept into it, either through intrinsic knowledge or input data converters.
    *
    * @param  outFlavorList fills list with supported flavors. This is a copy of
    *          the internal list, so it may be edited w/out affecting the transferable.
    */
  nsISupportsArray flavorsTransferableCanImport();

  /**
    * Sets the data in the transferable with the specified flavor. The transferable
    * will maintain its own copy the data, so it is not necessary to do that beforehand.
    *
    * @param  aFlavor the flavor of data that is being set
    * @param  aData the data, either some variant of class in nsISupportsPrimitives.idl,
    *         an nsIFile, or an nsIFlavorDataProvider (see above)
    * @param  aDataLen the length of the data, or 0 if passing a nsIFlavorDataProvider
    */
  void setTransferData(String aFlavor, nsISupports aData, long aDataLen);

  /**
    * Add the data flavor, indicating that this transferable 
    * can receive this type of flavor
    *
    * @param  aDataFlavor a new data flavor to handle
    */
  void addDataFlavor(String aDataFlavor);

  /**
    * Removes the data flavor matching the given one (string compare) and the data
    * that goes along with it.
    *
    * @param  aDataFlavor a data flavor to remove
    */
  void removeDataFlavor(String aDataFlavor);

  nsIFormatConverter getConverter();

  void setConverter(nsIFormatConverter aConverter);

}