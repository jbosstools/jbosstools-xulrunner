/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/inspector/public/inIDeepTreeWalker.idl
 */

package org.mozilla.interfaces;

public interface inIDeepTreeWalker extends nsIDOMTreeWalker {

  String INIDEEPTREEWALKER_IID =
    "{91fca0e9-99d6-406b-9d78-4c96f11e9ee4}";

  boolean getShowAnonymousContent();

  void setShowAnonymousContent(boolean aShowAnonymousContent);

  boolean getShowSubDocuments();

  void setShowSubDocuments(boolean aShowSubDocuments);

  void init(nsIDOMNode aRoot, long aWhatToShow);

}