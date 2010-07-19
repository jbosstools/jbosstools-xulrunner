/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsISound.idl
 */

package org.mozilla.interfaces;

public interface nsISound extends nsISupports {

  String NS_ISOUND_IID =
    "{86b75b05-db60-4c3e-97a7-82b363a41a01}";

  void play(nsIURL aURL);

  /**
   * for playing system sounds
   *
   * NS_SYSSOUND_* params are obsolete. The new events will not be supported by
   * this method.  You should use playEventSound method instaed.
   */
  void playSystemSound(String soundAlias);

  void beep();

  /**
    * Not strictly necessary, but avoids delay before first sound.
    * The various methods on nsISound call Init() if they need to.
	*/
  void init();

  /**
   * In some situations, playEventSound will be called.  Then, each
   * implementations will play a system sound for the event if it's necessary.
   *
   * NOTE: Don't change these values because they are used in
   * nsPIPromptService.idl. So, if they are changed, that makes big impact for
   * the embedders.
   */
  long EVENT_NEW_MAIL_RECEIVED = 0L;

  long EVENT_ALERT_DIALOG_OPEN = 1L;

  long EVENT_CONFIRM_DIALOG_OPEN = 2L;

  long EVENT_PROMPT_DIALOG_OPEN = 3L;

  long EVENT_SELECT_DIALOG_OPEN = 4L;

  long EVENT_MENU_EXECUTE = 5L;

  long EVENT_MENU_POPUP = 6L;

  void playEventSound(long aEventId);

}