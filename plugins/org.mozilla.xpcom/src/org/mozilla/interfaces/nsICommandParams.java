/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/components/commandhandler/public/nsICommandParams.idl
 */

package org.mozilla.interfaces;

public interface nsICommandParams extends nsISupports {

  String NS_ICOMMANDPARAMS_IID =
    "{83f892cf-7ed3-490e-967a-62640f3158e1}";

  short eNoType = 0;

  short eBooleanType = 1;

  short eLongType = 2;

  short eDoubleType = 3;

  short eWStringType = 4;

  short eISupportsType = 5;

  short eStringType = 6;

  short getValueType(String name);

  boolean getBooleanValue(String name);

  int getLongValue(String name);

  double getDoubleValue(String name);

  String getStringValue(String name);

  String getCStringValue(String name);

  nsISupports getISupportsValue(String name);

  void setBooleanValue(String name, boolean value);

  void setLongValue(String name, int value);

  void setDoubleValue(String name, double value);

  void setStringValue(String name, String value);

  void setCStringValue(String name, String value);

  void setISupportsValue(String name, nsISupports value);

  void removeValue(String name);

  boolean hasMoreElements();

  void first();

  /**
   * GetNext()
   * 
   * @return string pointer that will be allocated and is up 
   *         to the caller to free
   */
  String getNext();

}