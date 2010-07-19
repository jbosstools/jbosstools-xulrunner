/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsIPersistentProperties2.idl
 */

package org.mozilla.interfaces;

public interface nsIPersistentProperties extends nsIProperties {

  String NS_IPERSISTENTPROPERTIES_IID =
    "{1a180f60-93b2-11d2-9b8b-00805f8a16d9}";

  /**
   * load a set of name/value pairs from the input stream
   * names and values should be in UTF8
   */
  void load(nsIInputStream input);

  /**
   * output the values to the stream - results will be in UTF8
   */
  void save(nsIOutputStream output, String header);

  /**
   * call subclass() to make future calls to load() set the properties
   * in this "superclass" instead
   */
  void subclass(nsIPersistentProperties superclass);

  /**
   * get an enumeration of nsIPropertyElement objects,
   * which are read-only (i.e. setting properties on the element will
   * not make changes back into the source nsIPersistentProperties
   */
  nsISimpleEnumerator enumerate();

  /**
   * shortcut to nsIProperty's get() which retrieves a string value
   * directly (and thus faster)
   */
  String getStringProperty(String key);

  /**
   * shortcut to nsIProperty's set() which sets a string value
   * directly (and thus faster). If the given property already exists,
   * then the old value will be returned
   */
  String setStringProperty(String key, String value);

}