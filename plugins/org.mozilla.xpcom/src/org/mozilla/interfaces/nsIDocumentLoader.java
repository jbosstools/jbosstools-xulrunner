/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/uriloader/base/nsIDocumentLoader.idl
 */

package org.mozilla.interfaces;

/**
 * An nsIDocumentLoader is an interface responsible for tracking groups of
 * loads that belong together (images, external scripts, etc) and subdocuments
 * (<iframe>, <frame>, etc). It is also responsible for sending
 * nsIWebProgressListener notifications.
 * XXXbz this interface should go away, we think...
 */
public interface nsIDocumentLoader extends nsISupports {

  String NS_IDOCUMENTLOADER_IID =
    "{bbe961ee-59e9-42bb-be50-0331979bb79f}";

  void stop();

  nsISupports getContainer();

  nsILoadGroup getLoadGroup();

  nsIChannel getDocumentChannel();

}