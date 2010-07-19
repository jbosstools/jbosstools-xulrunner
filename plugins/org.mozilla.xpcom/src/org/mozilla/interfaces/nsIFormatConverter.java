/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsIFormatConverter.idl
 */

package org.mozilla.interfaces;

public interface nsIFormatConverter extends nsISupports {

  String NS_IFORMATCONVERTER_IID =
    "{948a0023-e3a7-11d2-96cf-0060b0fb9956}";

  /**
    * Get the list of the "input" data flavors (mime types as nsISupportsCString),
    * in otherwords, the flavors that this converter can convert "from" (the 
    * incoming data to the converter).
    */
  nsISupportsArray getInputDataFlavors();

  /**
    * Get the list of the "output" data flavors (mime types as nsISupportsCString),
    * in otherwords, the flavors that this converter can convert "to" (the 
    * outgoing data to the converter).
    *
    * @param  aDataFlavorList fills list with supported flavors
    */
  nsISupportsArray getOutputDataFlavors();

  /**
    * Determines whether a converion from one flavor to another is supported
    *
    * @param  aFromFormatConverter flavor to convert from
    * @param  aFromFormatConverter flavor to convert to
    */
  boolean canConvert(String aFromDataFlavor, String aToDataFlavor);

  /**
    * Converts from one flavor to another.
    *
    * @param  aFromFormatConverter flavor to convert from
    * @param  aFromFormatConverter flavor to convert to (destination own the memory)
    * @returns returns NS_OK if it was converted
    */
  void convert(String aFromDataFlavor, nsISupports aFromData, long aDataLen, String aToDataFlavor, nsISupports[] aToData, long[] aDataToLen);

}