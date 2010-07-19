/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMKeyEvent.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMKeyEvent extends nsIDOMUIEvent {

  String NS_IDOMKEYEVENT_IID =
    "{028e0e6e-8b01-11d3-aae7-0010838a3123}";

  long DOM_VK_CANCEL = 3L;

  long DOM_VK_HELP = 6L;

  long DOM_VK_BACK_SPACE = 8L;

  long DOM_VK_TAB = 9L;

  long DOM_VK_CLEAR = 12L;

  long DOM_VK_RETURN = 13L;

  long DOM_VK_ENTER = 14L;

  long DOM_VK_SHIFT = 16L;

  long DOM_VK_CONTROL = 17L;

  long DOM_VK_ALT = 18L;

  long DOM_VK_PAUSE = 19L;

  long DOM_VK_CAPS_LOCK = 20L;

  long DOM_VK_ESCAPE = 27L;

  long DOM_VK_SPACE = 32L;

  long DOM_VK_PAGE_UP = 33L;

  long DOM_VK_PAGE_DOWN = 34L;

  long DOM_VK_END = 35L;

  long DOM_VK_HOME = 36L;

  long DOM_VK_LEFT = 37L;

  long DOM_VK_UP = 38L;

  long DOM_VK_RIGHT = 39L;

  long DOM_VK_DOWN = 40L;

  long DOM_VK_PRINTSCREEN = 44L;

  long DOM_VK_INSERT = 45L;

  long DOM_VK_DELETE = 46L;

  long DOM_VK_0 = 48L;

  long DOM_VK_1 = 49L;

  long DOM_VK_2 = 50L;

  long DOM_VK_3 = 51L;

  long DOM_VK_4 = 52L;

  long DOM_VK_5 = 53L;

  long DOM_VK_6 = 54L;

  long DOM_VK_7 = 55L;

  long DOM_VK_8 = 56L;

  long DOM_VK_9 = 57L;

  long DOM_VK_SEMICOLON = 59L;

  long DOM_VK_EQUALS = 61L;

  long DOM_VK_A = 65L;

  long DOM_VK_B = 66L;

  long DOM_VK_C = 67L;

  long DOM_VK_D = 68L;

  long DOM_VK_E = 69L;

  long DOM_VK_F = 70L;

  long DOM_VK_G = 71L;

  long DOM_VK_H = 72L;

  long DOM_VK_I = 73L;

  long DOM_VK_J = 74L;

  long DOM_VK_K = 75L;

  long DOM_VK_L = 76L;

  long DOM_VK_M = 77L;

  long DOM_VK_N = 78L;

  long DOM_VK_O = 79L;

  long DOM_VK_P = 80L;

  long DOM_VK_Q = 81L;

  long DOM_VK_R = 82L;

  long DOM_VK_S = 83L;

  long DOM_VK_T = 84L;

  long DOM_VK_U = 85L;

  long DOM_VK_V = 86L;

  long DOM_VK_W = 87L;

  long DOM_VK_X = 88L;

  long DOM_VK_Y = 89L;

  long DOM_VK_Z = 90L;

  long DOM_VK_CONTEXT_MENU = 93L;

  long DOM_VK_NUMPAD0 = 96L;

  long DOM_VK_NUMPAD1 = 97L;

  long DOM_VK_NUMPAD2 = 98L;

  long DOM_VK_NUMPAD3 = 99L;

  long DOM_VK_NUMPAD4 = 100L;

  long DOM_VK_NUMPAD5 = 101L;

  long DOM_VK_NUMPAD6 = 102L;

  long DOM_VK_NUMPAD7 = 103L;

  long DOM_VK_NUMPAD8 = 104L;

  long DOM_VK_NUMPAD9 = 105L;

  long DOM_VK_MULTIPLY = 106L;

  long DOM_VK_ADD = 107L;

  long DOM_VK_SEPARATOR = 108L;

  long DOM_VK_SUBTRACT = 109L;

  long DOM_VK_DECIMAL = 110L;

  long DOM_VK_DIVIDE = 111L;

  long DOM_VK_F1 = 112L;

  long DOM_VK_F2 = 113L;

  long DOM_VK_F3 = 114L;

  long DOM_VK_F4 = 115L;

  long DOM_VK_F5 = 116L;

  long DOM_VK_F6 = 117L;

  long DOM_VK_F7 = 118L;

  long DOM_VK_F8 = 119L;

  long DOM_VK_F9 = 120L;

  long DOM_VK_F10 = 121L;

  long DOM_VK_F11 = 122L;

  long DOM_VK_F12 = 123L;

  long DOM_VK_F13 = 124L;

  long DOM_VK_F14 = 125L;

  long DOM_VK_F15 = 126L;

  long DOM_VK_F16 = 127L;

  long DOM_VK_F17 = 128L;

  long DOM_VK_F18 = 129L;

  long DOM_VK_F19 = 130L;

  long DOM_VK_F20 = 131L;

  long DOM_VK_F21 = 132L;

  long DOM_VK_F22 = 133L;

  long DOM_VK_F23 = 134L;

  long DOM_VK_F24 = 135L;

  long DOM_VK_NUM_LOCK = 144L;

  long DOM_VK_SCROLL_LOCK = 145L;

  long DOM_VK_COMMA = 188L;

  long DOM_VK_PERIOD = 190L;

  long DOM_VK_SLASH = 191L;

  long DOM_VK_BACK_QUOTE = 192L;

  long DOM_VK_OPEN_BRACKET = 219L;

  long DOM_VK_BACK_SLASH = 220L;

  long DOM_VK_CLOSE_BRACKET = 221L;

  long DOM_VK_QUOTE = 222L;

  long DOM_VK_META = 224L;

  long getCharCode();

  long getKeyCode();

  boolean getAltKey();

  boolean getCtrlKey();

  boolean getShiftKey();

  boolean getMetaKey();

  void initKeyEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, nsIDOMAbstractView viewArg, boolean ctrlKeyArg, boolean altKeyArg, boolean shiftKeyArg, boolean metaKeyArg, long keyCodeArg, long charCodeArg);

}