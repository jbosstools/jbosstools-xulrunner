/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsIScrollable.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIScrollable is an interface that can be implemented by a control that
 * supports scrolling.  This is a generic interface without concern for the 
 * type of content that may be inside.  It simply deals blindly with scroll
 * position as a composite of the lowest possible scroll position, the highest
 * possible position and the current position lying somewhere between the 
 * min and the max. 
 */
public interface nsIScrollable extends nsISupports {

  String NS_ISCROLLABLE_IID =
    "{919e792a-6490-40b8-bba5-f9e9ad5640c8}";

  int ScrollOrientation_X = 1;

  int ScrollOrientation_Y = 2;

  int getCurScrollPos(int scrollOrientation);

  void setCurScrollPos(int scrollOrientation, int curPos);

  void setCurScrollPosEx(int curHorizontalPos, int curVerticalPos);

  void getScrollRange(int scrollOrientation, int[] minPos, int[] maxPos);

  void setScrollRange(int scrollOrientation, int minPos, int maxPos);

  void setScrollRangeEx(int minHorizontalPos, int maxHorizontalPos, int minVerticalPos, int maxVerticalPos);

  int Scrollbar_Auto = 1;

  int Scrollbar_Never = 2;

  int Scrollbar_Always = 3;

  int getDefaultScrollbarPreferences(int scrollOrientation);

  void setDefaultScrollbarPreferences(int scrollOrientation, int scrollbarPref);

  void getScrollbarVisibility(boolean[] verticalVisible, boolean[] horizontalVisible);

}