/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIX509Cert3.idl
 */

package org.mozilla.interfaces;

public interface nsICertVerificationResult extends nsISupports {

  String NS_ICERTVERIFICATIONRESULT_IID =
    "{2fd0a785-9f2d-4327-8871-8c3e0783891d}";

  /**
   *  This interface reflects a container of
   *  verification results. Call will not block.
   *
   *  Obtain an array of human readable strings describing
   *  the certificate's certified usages.
   *
   *  Mirrors the results produced by 
   *  nsIX509Cert::getUsagesArray()
   *
   *  As of today, this function is a one-shot object,
   *  only the first call will succeed.
   *  This allows an optimization in the implementation, 
   *  ownership of result data will be transfered to caller.
   *
   *  @param cert The certificate that was verified.
   *  @param verified The certificate verification result, 
   *         see constants in nsIX509Cert.
   *  @param count The number of human readable usages returned.
   *  @param usages The array of human readable usages.
   */
  void getUsagesArrayResult(long[] verified, long[] count, String[][] usages);

}