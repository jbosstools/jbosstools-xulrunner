/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/gfx/idl/nsIFontEnumerator.idl
 */

package org.mozilla.interfaces;

public interface nsIFontEnumerator extends nsISupports {

  String NS_IFONTENUMERATOR_IID =
    "{924d98d9-3518-4cb4-8708-c74fe8e3ec3c}";

  /**
   * Return a sorted array of the names of all installed fonts.
   *
   * @param  aCount     returns number of names returned
   * @param  aResult    returns array of names
   * @return void
   */
  String[] enumerateAllFonts(long[] aCount);

  /**
   * Return a sorted array of names of fonts that support the given language
   * group and are suitable for use as the given CSS generic font.
   *
   * @param  aLangGroup language group
   * @param  aGeneric   CSS generic font
   * @param  aCount     returns number of names returned
   * @param  aResult    returns array of names
   * @return void
   */
  String[] enumerateFonts(String aLangGroup, String aGeneric, long[] aCount);

  /**
    @param  aLangGroup language group
    @return bool do we have a font for this language group
   */
  boolean haveFontFor(String aLangGroup);

  /**
   * @param  aLangGroup language group
   * @param  aGeneric CSS generic font
   * @return suggested default font for this language group and generic family
   */
  String getDefaultFont(String aLangGroup, String aGeneric);

  /**
   * update the global font list
   * return true if font list is changed
   */
  boolean updateFontList();

  /**
   * get the standard family name on the system from given family
   * @param  aName family name which may be alias
   * @return the standard family name on the system, if given name does not
   *         exist, returns empty string
   */
  String getStandardFamilyName(String aName);

}