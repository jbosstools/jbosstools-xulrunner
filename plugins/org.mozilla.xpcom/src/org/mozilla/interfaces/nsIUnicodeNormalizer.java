/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/intl/unicharutil/idl/nsIUnicodeNormalizer.idl
 */

package org.mozilla.interfaces;

public interface nsIUnicodeNormalizer extends nsISupports {

  String NS_IUNICODENORMALIZER_IID =
    "{b43a461f-1bcf-4329-820b-66e48c979e14}";

  /**
 * Normalize Unicode (NFD, NFC, NFKD, NFKC).
 *
 * NFD: Canonical Decomposition
 * NFC: Canonical Decomposition, followed by Canonical Composition
 * NFKD: Compatibility Decomposition
 * NFKC: Compatibility Decomposition, followed by Canonical Composition
 * Reference: Unicode Standard, TR15, Unicode Normalization Forms
 *
 * @param aSrc         [IN]  nsAString which contains an input UTF-16 string.
 * @param aDest        [OUT] A pointer to an output buffer provided by a callee.
 * @return             NS_OK for success, 
 */
  void normalizeUnicodeNFD(String aSrc, String[] aDest);

  void normalizeUnicodeNFC(String aSrc, String[] aDest);

  void normalizeUnicodeNFKD(String aSrc, String[] aDest);

  void normalizeUnicodeNFKC(String aSrc, String[] aDest);

}