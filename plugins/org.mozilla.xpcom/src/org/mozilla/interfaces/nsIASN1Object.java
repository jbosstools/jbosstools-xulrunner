/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIASN1Object.idl
 */

package org.mozilla.interfaces;

/**
 * This represents an ASN.1 object,
 * where ASN.1 is "Abstract Syntax Notation number One".
 *
 * The additional state information carried in this interface
 * makes it fit for being used as the data structure
 * when working with visual reprenstation of ASN.1 objects
 * in a human user interface, like in a tree widget
 * where open/close state of nodes must be remembered.
 *
 * @status FROZEN
 */
public interface nsIASN1Object extends nsISupports {

  String NS_IASN1OBJECT_IID =
    "{ba8bf582-1dd1-11b2-898c-f40246bc9a63}";

  /**
   *  Identifiers for the possible types of object.
   */
  long ASN1_END_CONTENTS = 0L;

  long ASN1_BOOLEAN = 1L;

  long ASN1_INTEGER = 2L;

  long ASN1_BIT_STRING = 3L;

  long ASN1_OCTET_STRING = 4L;

  long ASN1_NULL = 5L;

  long ASN1_OBJECT_ID = 6L;

  long ASN1_ENUMERATED = 10L;

  long ASN1_UTF8_STRING = 12L;

  long ASN1_SEQUENCE = 16L;

  long ASN1_SET = 17L;

  long ASN1_PRINTABLE_STRING = 19L;

  long ASN1_T61_STRING = 20L;

  long ASN1_IA5_STRING = 22L;

  long ASN1_UTC_TIME = 23L;

  long ASN1_GEN_TIME = 24L;

  long ASN1_VISIBLE_STRING = 26L;

  long ASN1_UNIVERSAL_STRING = 28L;

  long ASN1_BMP_STRING = 30L;

  long ASN1_HIGH_TAG_NUMBER = 31L;

  long ASN1_CONTEXT_SPECIFIC = 32L;

  long ASN1_APPLICATION = 33L;

  long ASN1_PRIVATE = 34L;

  /**
   *  "type" will be equal to one of the defined object identifiers.
   */
  long getType();

  /**
   *  "type" will be equal to one of the defined object identifiers.
   */
  void setType(long aType);

  /**
   *  This contains a tag as explained in ASN.1 standards documents.
   */
  long getTag();

  /**
   *  This contains a tag as explained in ASN.1 standards documents.
   */
  void setTag(long aTag);

  /**
   *  "displayName" contains a human readable explanatory label.
   */
  String getDisplayName();

  /**
   *  "displayName" contains a human readable explanatory label.
   */
  void setDisplayName(String aDisplayName);

  /**
   *  "displayValue" contains the human readable value.
   */
  String getDisplayValue();

  /**
   *  "displayValue" contains the human readable value.
   */
  void setDisplayValue(String aDisplayValue);

}