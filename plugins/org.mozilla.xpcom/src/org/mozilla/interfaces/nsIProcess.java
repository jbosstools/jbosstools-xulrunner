/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/threads/nsIProcess.idl
 */

package org.mozilla.interfaces;

public interface nsIProcess extends nsISupports {

  String NS_IPROCESS_IID =
    "{3c09efde-5f49-42b8-8520-57be02a5f84e}";

  /**
   * Initialises the process with an executable to be run. Call the run method
   * to run the executable.
   * @param executable The executable to run.
   */
  void init(nsIFile executable);

  /**
   * Kills the running process. After exiting the process will either have
   * been killed or a failure will have been returned.
   */
  void kill();

  /**
   * Executes the file this object was initialized with
   * @param blocking   Whether to wait until the process terminates before
                       returning or not.
   * @param args       An array of arguments to pass to the process in the
   *                   native character set.
   * @param count      The length of the args array.
   */
  void run(boolean blocking, String[] args, long count);

  /**
   * Executes the file this object was initialized with optionally calling
   * an observer after the process has finished running.
   * @param args       An array of arguments to pass to the process in the
   *                   native character set.
   * @param count      The length of the args array.
   * @param observer   An observer to notify when the process has completed. It
   *                   will receive this process instance as the subject and
   *                   "process-finished" or "process-failed" as the topic. The
   *                   observer will be notified on the main thread.
   * @param holdWeak   Whether to use a weak reference to hold the observer.
   */
  void runAsync(String[] args, long count, nsIObserver observer, boolean holdWeak);

  /**
   * The process identifier of the currently running process. This will only
   * be available after the process has started and may not be available on
   * some platforms.
   */
  long getPid();

  /**
   * The exit value of the process. This is only valid after the process has
   * exited.
   */
  int getExitValue();

  /**
   * Returns whether the process is currently running or not.
   */
  boolean getIsRunning();

}