/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/streamconv/public/nsIStreamConverterService.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIStreamConverterService is a higher level stream converter factory
 * responsible for locating and creating stream converters
 * (nsIStreamConverter).
 *
 * This service retrieves an interface that can convert data from a particular
 * MIME type, to a particular MIME type. It is responsible for any intermediary
 * conversion required in order to get from X to Z, assuming direct conversion
 * is not possible.
 *
 * @author Jud Valeski
 * @see nsIStreamConverter
 */
public interface nsIStreamConverterService extends nsISupports {

  String NS_ISTREAMCONVERTERSERVICE_IID =
    "{f2b1ab53-f0bd-4adb-9365-e59b1701a258}";

  /**
     * Tests whether conversion between the two specified types is possible.
     * This is cheaper than calling convert()/asyncConvertData(); it is not
     * necessary to call this function before calling one of those, though.
     */
  boolean canConvert(String aFromType, String aToType);

  /**
     * <b>SYNCHRONOUS VERSION</b>
     * Converts a stream of one type, to a stream of another type.
     *
     * Use this method when you have a stream you want to convert.
     *
     * @param aFromStream   The stream representing the original/raw data.
     * @param aFromType     The MIME type of aFromStream.
     * @param aToType       The MIME type of the returned stream.
     * @param aContext      Either an opaque context, or a converter specific
     *                      context (implementation specific).
     * @return              The converted stream. NOTE: The returned stream
     *                      may not already be converted. An efficient stream
     *                      converter implementation will convert data on
     *                      demand rather than buffering the converted data
     *                      until it is used.
     */
  nsIInputStream convert(nsIInputStream aFromStream, String aFromType, String aToType, nsISupports aContext);

  /**
     * <b>ASYNCHRONOUS VERSION</b>
     * Retrieves a nsIStreamListener that receives the original/raw data via its
     * nsIStreamListener::OnDataAvailable() callback, then converts and pushes 
     * the data to aListener.
     *
     * Use this method when you want to proxy (and convert) nsIStreamListener
     * callbacks asynchronously.
     *
     * @param aFromType     The MIME type of the original/raw data.
     * @param aToType       The MIME type of the converted data.
     * @param aListener     The listener that receives the converted data.
     * @param aCtxt         Either an opaque context, or a converter specific
     *                      context (implementation specific).
     * @return              A nsIStreamListener that receives data via its
     *                      OnDataAvailable() method.
     */
  nsIStreamListener asyncConvertData(String aFromType, String aToType, nsIStreamListener aListener, nsISupports aContext);

}