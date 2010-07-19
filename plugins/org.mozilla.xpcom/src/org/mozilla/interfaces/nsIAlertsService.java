/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/alerts/public/nsIAlertsService.idl
 */

package org.mozilla.interfaces;

public interface nsIAlertsService extends nsISupports {

  String NS_IALERTSSERVICE_IID =
    "{e177399e-2e31-4019-aed3-cba63ce9fa99}";

  /**
    * Displays a sliding notification window.
    *    
    * @param imageUrl       A URL identifying the image to put in the alert.
    * @param title          The title for the alert.
    * @param text           The contents of the alert.
    * @param textClickable  If true, causes the alert text to look like a link
    *                       and notifies the listener when user attempts to 
    *                       click the alert text.
    * @param cookie         A blind cookie the alert will pass back to the 
    *                       consumer during the alert listener callbacks.
    * @param alertListener  Used for callbacks. May be null if the caller 
    *                       doesn't care about callbacks.
    * @param name           The name of the notification.  This is currently
    *                       only used on OS X with Growl.  On OS X with Growl,
    *                       users can disable notifications with a given name.
    *
    * @throws NS_ERROR_NOT_AVAILABLE If the notification cannot be displayed.
    *
    * The following arguments will be passed to the alertListener's observe() 
    * method:
    *   subject - null
    *   topic   - "alertfinished" when the alert goes away
    *             "alertclickcallback" when the text is clicked
    *   data    - the value of the cookie parameter passed to showAlertNotification.
    */
  void showAlertNotification(String imageUrl, String title, String text, boolean textClickable, String cookie, nsIObserver alertListener, String name);

}