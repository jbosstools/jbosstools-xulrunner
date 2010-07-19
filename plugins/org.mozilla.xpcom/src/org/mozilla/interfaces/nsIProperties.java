/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsIProperties.idl
 */

package org.mozilla.interfaces;

public interface nsIProperties extends nsISupports {

  String NS_IPROPERTIES_IID =
    "{78650582-4e93-4b60-8e85-26ebd3eb14ca}";

  /**
     * Gets a property with a given name. 
     *
     * @return NS_ERROR_FAILURE if a property with that name doesn't exist.
     * @return NS_ERROR_NO_INTERFACE if the found property fails to QI to the 
     * given iid.
     */
  nsISupports get(String prop, String iid);

  /**
     * Sets a property with a given name to a given value. 
     */
  void set(String prop, nsISupports value);

  /**
     * Returns true if the property with the given name exists.
     */
  boolean has(String prop);

  /**
     * Undefines a property.
     * @return NS_ERROR_FAILURE if a property with that name doesn't
     * already exist.
     */
  void undefine(String prop);

  /**
     *  Returns an array of the keys.
     */
  String[] getKeys(long[] count);

}