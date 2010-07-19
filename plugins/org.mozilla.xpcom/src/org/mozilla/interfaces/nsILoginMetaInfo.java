/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/passwordmgr/public/nsILoginMetaInfo.idl
 */

package org.mozilla.interfaces;

/**
 * An object containing metainfo for a login stored by the login manager.
 *
 * Code using login manager can generally ignore this interface. When adding
 * logins, default value will be created. When modifying logins, these
 * properties will be unchanged unless a change is explicitly requested [by
 * using modifyLogin() with a nsIPropertyBag]. When deleting a login or
 * comparing logins, these properties are ignored.
 */
public interface nsILoginMetaInfo extends nsISupports {

  String NS_ILOGINMETAINFO_IID =
    "{867407d5-10e0-43a0-bc81-a324740534ca}";

  /**
     * The GUID to uniquely identify the login. This can be any arbitrary
     * string, but a format as created by nsIUUIDGenerator is recommended.
     * For example, "{d4e1a1f6-5ea0-40ee-bff5-da57982f21cf}"
     *
     * addLogin will generate a random value unless a value is provided.
     *
     * addLogin and modifyLogin will throw if the GUID already exists.
     */
  String getGuid();

  /**
     * The GUID to uniquely identify the login. This can be any arbitrary
     * string, but a format as created by nsIUUIDGenerator is recommended.
     * For example, "{d4e1a1f6-5ea0-40ee-bff5-da57982f21cf}"
     *
     * addLogin will generate a random value unless a value is provided.
     *
     * addLogin and modifyLogin will throw if the GUID already exists.
     */
  void setGuid(String aGuid);

}