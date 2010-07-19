/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsIRecyclingAllocator.idl
 */

package org.mozilla.interfaces;

/**
 *
 * nsIRecyclingAllocator: A wrapper for the nsRecyclingAllocator
 *
 * Holds allocations and reuses them for subsequent allocs.
 * Thread safe and uses a timer to release freelist.
 *
 * @status UNDER-DEVELOPMENT
 */
public interface nsIRecyclingAllocator extends nsIMemory {

  String NS_IRECYCLINGALLOCATOR_IID =
    "{d064a04c-9cee-4319-be31-64d565bccba9}";

  void init(long nblocks, long recycleAfter, String id);

}