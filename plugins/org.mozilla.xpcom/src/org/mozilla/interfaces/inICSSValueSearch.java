/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/inspector/public/inICSSValueSearch.idl
 */

package org.mozilla.interfaces;

public interface inICSSValueSearch extends inISearchProcess {

  String INICSSVALUESEARCH_IID =
    "{e0d39e48-1dd1-11b2-81bd-9a0c117f0736}";

  nsIDOMDocument getDocument();

  void setDocument(nsIDOMDocument aDocument);

  String getBaseURL();

  void setBaseURL(String aBaseURL);

  boolean getReturnRelativeURLs();

  void setReturnRelativeURLs(boolean aReturnRelativeURLs);

  boolean getNormalizeChromeURLs();

  void setNormalizeChromeURLs(boolean aNormalizeChromeURLs);

  void addPropertyCriteria(String aPropName);

  String getTextCriteria();

  void setTextCriteria(String aTextCriteria);

}