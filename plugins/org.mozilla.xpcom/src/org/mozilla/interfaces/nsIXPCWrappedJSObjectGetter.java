/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/src/xpconnect/idl/nsIXPConnect.idl
 */

package org.mozilla.interfaces;

/***************************************************************************/
/**
 * This is a sort of a placeholder interface. It is not intended to be
 * implemented. It exists to give the nsIXPCSecurityManager an iid on
 * which to gate a specific activity in XPConnect.
 *
 * That activity is...
 *
 * When JavaScript code uses a component that is itself implemented in
 * JavaScript then XPConnect will build a wrapper rather than directly
 * expose the JSObject of the component. This allows components implemented
 * in JavaScript to 'look' just like any other xpcom component (from the
 * perspective of the JavaScript caller). This insulates the component from
 * the caller and hides any properties or methods that are not part of the
 * interface as declared in xpidl. Usually this is a good thing.
 *
 * However, in some cases it is useful to allow the JS caller access to the
 * JS component's underlying implementation. In order to facilitate this
 * XPConnect supports the 'wrappedJSObject' property. The caller code can do:
 *
 * // 'foo' is some xpcom component (that might be implemented in JS).
 * try {
 *   var bar = foo.wrappedJSObject;
 *   if(bar) {
 *      // bar is the underlying JSObject. Do stuff with it here.
 *   }
 * } catch(e) {
 *   // security exception?
 * }
 *
 * Recall that 'foo' above is an XPConnect wrapper, not the underlying JS
 * object. The property get "foo.wrappedJSObject" will only succeed if three
 * conditions are met:
 *
 * 1) 'foo' really is an XPConnect wrapper around a JSObject.
 * 2) The underlying JSObject actually implements a "wrappedJSObject"
 *    property that returns a JSObject. This is called by XPConnect. This
 *    restriction allows wrapped objects to only allow access to the underlying
 *    JSObject if they choose to do so. Ususally this just means that 'foo'
 *    would have a property tht looks like:
 *       this.wrappedJSObject = this.
 * 3) The implemementation of nsIXPCSecurityManager (if installed) allows
 *    a property get on the interface below. Although the JSObject need not
 *    implement 'nsIXPCWrappedJSObjectGetter', XPConnect will ask the
 *    security manager if it is OK for the caller to access the only method
 *    in nsIXPCWrappedJSObjectGetter before allowing the activity. This fits
 *    in with the security manager paradigm and makes control over accessing
 *    the property on this interface the control factor for getting the
 *    underlying wrapped JSObject of a JS component from JS code.
 *
 * Notes:
 *
 * a) If 'foo' above were the underlying JSObject and not a wrapper at all,
 *    then this all just works and XPConnect is not part of the picture at all.
 * b) One might ask why 'foo' should not just implement an interface through
 *    which callers might get at the underlying object. There are three reasons:
 *   i)   XPConnect would still have to do magic since JSObject is not a
 *        scriptable type.
 *   ii)  JS Components might use aggregation (like C++ objects) and have
 *        different JSObjects for different interfaces 'within' an aggregate
 *        object. But, using an additional interface only allows returning one
 *        underlying JSObject. However, this allows for the possibility that
 *        each of the aggregte JSObjects could return something different.
 *        Note that one might do: this.wrappedJSObject = someOtherObject;
 *   iii) Avoiding the explicit interface makes it easier for both the caller
 *        and the component.
 *
 *  Anyway, some future implementation of nsIXPCSecurityManager might want
 *  do special processing on 'nsIXPCSecurityManager::CanGetProperty' when
 *  the interface id is that of nsIXPCWrappedJSObjectGetter.
 */
public interface nsIXPCWrappedJSObjectGetter extends nsISupports {

  String NS_IXPCWRAPPEDJSOBJECTGETTER_IID =
    "{254bb2e0-6439-11d4-8fe0-0010a4e73d9a}";

  nsISupports getNeverCalled();

}