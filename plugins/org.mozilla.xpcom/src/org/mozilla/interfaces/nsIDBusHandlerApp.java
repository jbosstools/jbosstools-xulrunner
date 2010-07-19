/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/mime/public/nsIMIMEInfo.idl
 */

package org.mozilla.interfaces;

/**
 * nsIDBusHandlerApp represents local applications launched by DBus a message
 * invoking a method taking a single string argument descibing a URI
 */
public interface nsIDBusHandlerApp extends nsIHandlerApp {

  String NS_IDBUSHANDLERAPP_IID =
    "{1ffc274b-4cbf-4bb5-a635-05ad2cbb6534}";

  /**
     * Service defines the dbus service that should handle this protocol.
     * If its not set,  NS_ERROR_FAILURE will be returned by LaunchWithURI
     */
  String getService();

  /**
     * Service defines the dbus service that should handle this protocol.
     * If its not set,  NS_ERROR_FAILURE will be returned by LaunchWithURI
     */
  void setService(String aService);

  /**
     * Objpath defines the object path of the dbus service that should handle 
     * this protocol. If its not set,  NS_ERROR_FAILURE will be returned 
     * by LaunchWithURI
     */
  String getObjectPath();

  /**
     * Objpath defines the object path of the dbus service that should handle 
     * this protocol. If its not set,  NS_ERROR_FAILURE will be returned 
     * by LaunchWithURI
     */
  void setObjectPath(String aObjectPath);

  /**
     * DBusInterface defines the interface of the dbus service that should 
     * handle this protocol. If its not set,  NS_ERROR_FAILURE will be  
     * returned by LaunchWithURI
     */
  String getDBusInterface();

  /**
     * DBusInterface defines the interface of the dbus service that should 
     * handle this protocol. If its not set,  NS_ERROR_FAILURE will be  
     * returned by LaunchWithURI
     */
  void setDBusInterface(String aDBusInterface);

  /**
     * Method defines the dbus method that should be invoked to handle this 
     * protocol. If its not set,  NS_ERROR_FAILURE will be returned by 
     * LaunchWithURI
     */
  String getMethod();

  /**
     * Method defines the dbus method that should be invoked to handle this 
     * protocol. If its not set,  NS_ERROR_FAILURE will be returned by 
     * LaunchWithURI
     */
  void setMethod(String aMethod);

}