/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/gfx/idl/nsIScriptableRegion.idl
 */

package org.mozilla.interfaces;

public interface nsIScriptableRegion extends nsISupports {

  String NS_ISCRIPTABLEREGION_IID =
    "{4d179656-a5bd-42a6-a937-c81f820dcf2f}";

  void init();

  /**
  * copy operator equivalent that takes another region
  *
  * @param      region to copy
  * @return     void
  *
  **/
  void setToRegion(nsIScriptableRegion aRegion);

  /**
  * copy operator equivalent that takes a rect
  *
  * @param      aX xoffset of rect to set region to
  * @param      aY yoffset of rect to set region to
  * @param      aWidth width of rect to set region to
  * @param      aHeight height of rect to set region to
  * @return     void
  *
  **/
  void setToRect(int aX, int aY, int aWidth, int aHeight);

  /**
  * destructively intersect another region with this one
  *
  * @param      region to intersect
  * @return     void
  *
  **/
  void intersectRegion(nsIScriptableRegion aRegion);

  /**
  * destructively intersect a rect with this region
  *
  * @param      aX xoffset of rect to intersect with region
  * @param      aY yoffset of rect to intersect with region
  * @param      aWidth width of rect to intersect with region
  * @param      aHeight height of rect to intersect with region
  * @return     void
  *
  **/
  void intersectRect(int aX, int aY, int aWidth, int aHeight);

  /**
  * destructively union another region with this one
  *
  * @param      region to union
  * @return     void
  *
  **/
  void unionRegion(nsIScriptableRegion aRegion);

  /**
  * destructively union a rect with this region
  *
  * @param      aX xoffset of rect to union with region
  * @param      aY yoffset of rect to union with region
  * @param      aWidth width of rect to union with region
  * @param      aHeight height of rect to union with region
  * @return     void
  *
  **/
  void unionRect(int aX, int aY, int aWidth, int aHeight);

  /**
  * destructively subtract another region with this one
  *
  * @param      region to subtract
  * @return     void
  *
  **/
  void subtractRegion(nsIScriptableRegion aRegion);

  /**
  * destructively subtract a rect from this region
  *
  * @param      aX xoffset of rect to subtract with region
  * @param      aY yoffset of rect to subtract with region
  * @param      aWidth width of rect to subtract with region
  * @param      aHeight height of rect to subtract with region
  * @return     void
  *
  **/
  void subtractRect(int aX, int aY, int aWidth, int aHeight);

  /**
  * is this region empty? i.e. does it contain any pixels
  *
  * @param      none
  * @return     returns whether the region is empty
  *
  **/
  boolean isEmpty();

  /**
  * == operator equivalent i.e. do the regions contain exactly
  * the same pixels
  *
  * @param      region to compare
  * @return     whether the regions are identical
  *
  **/
  boolean isEqualRegion(nsIScriptableRegion aRegion);

  /**
  * returns the bounding box of the region i.e. the smallest
  * rectangle that completely contains the region.        
  *
  * @param      aX out parameter for xoffset of bounding rect for region
  * @param      aY out parameter for yoffset of bounding rect for region
  * @param      aWidth out parameter for width of bounding rect for region
  * @param      aHeight out parameter for height of bounding rect for region
  * @return     void
  *
  **/
  void getBoundingBox(int[] aX, int[] aY, int[] aWidth, int[] aHeight);

  /**
  * offsets the region in x and y
  *
  * @param  xoffset  pixel offset in x
  * @param  yoffset  pixel offset in y
  * @return          void
  *
  **/
  void offset(int aXOffset, int aYOffset);

  /**
   * @return null if there are no rects,
   * @return flat array of rects,ie [x1,y1,width1,height1,x2...].
   * The result will contain bogus data if values don't fit in 31 bit
   **/
  void getRects();

  /**
  * does the region intersect the rectangle?
  *
  * @param      rect to check for containment
  * @return     true if the region intersects the rect
  *
  **/
  boolean containsRect(int aX, int aY, int aWidth, int aHeight);

}