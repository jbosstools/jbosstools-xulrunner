/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xslt/public/txIEXSLTRegExFunctions.idl
 */

package org.mozilla.interfaces;

public interface txIEXSLTRegExFunctions extends nsISupports {

  String TXIEXSLTREGEXFUNCTIONS_IID =
    "{c180e993-aced-4839-95a0-ecd5ff138be9}";

  txINodeSet match(txIFunctionEvaluationContext aContext, String aString, String aRegEx, String aFlags);

  String replace(String aString, String aRegEx, String aFlags, String aReplace);

  boolean test(String aString, String aRegEx, String aFlags);

}