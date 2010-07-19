/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/xre/nsINativeAppSupport.idl
 */

package org.mozilla.interfaces;

public interface nsINativeAppSupport extends nsISupports {

  String NS_INATIVEAPPSUPPORT_IID =
    "{5fdf8480-1f98-11d4-8077-00600811a9c3}";

  boolean start();

  void enable();

  boolean stop();

  void quit();

  void onLastWindowClosing();

  void reOpen();

}