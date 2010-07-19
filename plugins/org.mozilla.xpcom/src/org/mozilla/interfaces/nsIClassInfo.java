/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/components/nsIClassInfo.idl
 */

package org.mozilla.interfaces;

/**
 * Provides information about a specific implementation class
 * @status FROZEN
 */
public interface nsIClassInfo extends nsISupports {

  String NS_ICLASSINFO_IID =
    "{986c11d0-f340-11d4-9075-0010a4e73d9a}";

  /**
     * Get an ordered list of the interface ids that instances of the class 
     * promise to implement. Note that nsISupports is an implicit member 
     * of any such list and need not be included. 
     *
     * Should set *count = 0 and *array = null and return NS_OK if getting the 
     * list is not supported.
     */
  String[] getInterfaces(long[] count);

  /**
     * Get a language mapping specific helper object that may assist in using
     * objects of this class in a specific lanaguage. For instance, if asked
     * for the helper for nsIProgrammingLanguage::JAVASCRIPT this might return 
     * an object that can be QI'd into the nsIXPCScriptable interface to assist 
     * XPConnect in supplying JavaScript specific behavior to callers of the 
     * instance object.
     *
     * see: nsIProgrammingLanguage.idl
     *
     * Should return null if no helper available for given language.
     */
  nsISupports getHelperForLanguage(long language);

  /**
     * A contract ID through which an instance of this class can be created
     * (or accessed as a service, if |flags & SINGLETON|), or null.
     */
  String getContractID();

  /**
     * A human readable string naming the class, or null.
     */
  String getClassDescription();

  /**
     * A class ID through which an instance of this class can be created
     * (or accessed as a service, if |flags & SINGLETON|), or null.
     */
  String getClassID();

  /**
     * Return language type from list in nsIProgrammingLanguage
     */
  long getImplementationLanguage();

  /**
     * Bitflags for 'flags' attribute.
     */
  long SINGLETON = 1L;

  long THREADSAFE = 2L;

  long MAIN_THREAD_ONLY = 4L;

  long DOM_OBJECT = 8L;

  long PLUGIN_OBJECT = 16L;

  long EAGER_CLASSINFO = 32L;

  /**
     * 'flags' attribute bitflag: whether objects of this type implement
     * nsIContent.
     */
  long CONTENT_NODE = 64L;

  long RESERVED = 2147483648L;

  long getFlags();

}