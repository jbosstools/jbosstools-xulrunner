/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/components/windowwatcher/public/nsIWindowWatcher.idl
 */

package org.mozilla.interfaces;

/**
 * nsIWindowWatcher is the keeper of Gecko/DOM Windows. It maintains
 * a list of open top-level windows, and allows some operations on them.

 * Usage notes:

 *   This component has an |activeWindow| property. Clients may expect
 * this property to be always current, so to properly integrate this component
 * the application will need to keep it current by setting the property
 * as the active window changes.
 *   This component should not keep a (XPCOM) reference to any windows;
 * the implementation will claim no ownership. Windows must notify
 * this component when they are created or destroyed, so only a weak
 * reference is kept. Note that there is no interface for such notifications
 * (not a public one, anyway). This is taken care of both in Mozilla and
 * by common embedding code. Embedding clients need do nothing special
 * about that requirement.
 *   This component must be initialized at application startup by calling
 * setWindowCreator.
 *
 * @status FROZEN
 */
public interface nsIWindowWatcher extends nsISupports {

  String NS_IWINDOWWATCHER_IID =
    "{002286a8-494b-43b3-8ddd-49e3fc50622b}";

  /** Create a new window. It will automatically be added to our list
      (via addWindow()).
      @param aParent parent window, if any. Null if no parent.  If it is
             impossible to get to an nsIWebBrowserChrome from aParent, this
             method will effectively act as if aParent were null.
      @param aURL url to which to open the new window. Must already be
             escaped, if applicable. can be null.
      @param aName window name from JS window.open. can be null.  If a window
             with this name already exists, the openWindow call may just load
             aUrl in it (if aUrl is not null) and return it.
      @param aFeatures window features from JS window.open. can be null.
      @param aArguments extra argument(s) to the new window, to be attached
             as the |arguments| property. An nsISupportsArray will be
             unwound into multiple arguments (but not recursively!).
             can be null.
      @return the new window

      @note This method may examine the JS context stack for purposes of
            determining the security context to use for the search for a given
            window named aName.
      @note This method should try to set the default charset for the new
            window to the default charset of aParent.  This is not guaranteed,
            however.
      @note This method may dispatch a "toplevel-window-ready" notification
            via nsIObserverService if the window did not already exist.
  */
  nsIDOMWindow openWindow(nsIDOMWindow aParent, String aUrl, String aName, String aFeatures, nsISupports aArguments);

  /** Clients of this service can register themselves to be notified
      when a window is opened or closed (added to or removed from this
      service). This method adds an aObserver to the list of objects
      to be notified.
      @param aObserver the object to be notified when windows are
                       opened or closed. Its Observe method will be
                       called with the following parameters:

      aObserver::Observe interprets its parameters so:
      aSubject the window being opened or closed, sent as an nsISupports
               which can be QIed to an nsIDOMWindow.
      aTopic   a wstring, either "domwindowopened" or "domwindowclosed".
      someData not used.
  */
  void registerNotification(nsIObserver aObserver);

  /** Clients of this service can register themselves to be notified
      when a window is opened or closed (added to or removed from this
      service). This method removes an aObserver from the list of objects
      to be notified.
      @param aObserver the observer to be removed.
  */
  void unregisterNotification(nsIObserver aObserver);

  /** Get an iterator for currently open windows in the order they were opened,
      guaranteeing that each will be visited exactly once.
      @return an enumerator which will itself return nsISupports objects which
              can be QIed to an nsIDOMWindow
  */
  nsISimpleEnumerator getWindowEnumerator();

  /** Return a newly created nsIPrompt implementation.
      @param aParent the parent window used for posing alerts. can be null.
      @return a new nsIPrompt object
  */
  nsIPrompt getNewPrompter(nsIDOMWindow aParent);

  /** Return a newly created nsIAuthPrompt implementation.
      @param aParent the parent window used for posing alerts. can be null.
      @return a new nsIAuthPrompt object
  */
  nsIAuthPrompt getNewAuthPrompter(nsIDOMWindow aParent);

  /** Set the window creator callback. It must be filled in by the app.
      openWindow will use it to create new windows.
      @param creator the callback. if null, the callback will be cleared
                     and window creation capabilities lost.
  */
  void setWindowCreator(nsIWindowCreator creator);

  /** Retrieve the chrome window mapped to the given DOM window. Window
      Watcher keeps a list of all top-level DOM windows currently open,
      along with their corresponding chrome interfaces. Since DOM Windows
      lack a (public) means of retrieving their corresponding chrome,
      this method will do that.
      @param aWindow the DOM window whose chrome window the caller needs
      @return the corresponding chrome window
  */
  nsIWebBrowserChrome getChromeForWindow(nsIDOMWindow aWindow);

  /**
      Retrieve an existing window (or frame).
      @param aTargetName the window name
      @param aCurrentWindow a starting point in the window hierarchy to
                            begin the search.  If null, each toplevel window
                            will be searched.

      Note: This method will search all open windows for any window or
      frame with the given window name. Make sure you understand the
      security implications of this before using this method!
  */
  nsIDOMWindow getWindowByName(String aTargetName, nsIDOMWindow aCurrentWindow);

  /** The Watcher serves as a global storage facility for the current active
      (frontmost non-floating-palette-type) window, storing and returning
      it on demand. Users must keep this attribute current, including after
      the topmost window is closed. This attribute obviously can return null
      if no windows are open, but should otherwise always return a valid
      window.
  */
  nsIDOMWindow getActiveWindow();

  /** The Watcher serves as a global storage facility for the current active
      (frontmost non-floating-palette-type) window, storing and returning
      it on demand. Users must keep this attribute current, including after
      the topmost window is closed. This attribute obviously can return null
      if no windows are open, but should otherwise always return a valid
      window.
  */
  void setActiveWindow(nsIDOMWindow aActiveWindow);

}