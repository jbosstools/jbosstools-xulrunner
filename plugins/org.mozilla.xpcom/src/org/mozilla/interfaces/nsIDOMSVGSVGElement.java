/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGSVGElement.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGSVGElement extends nsIDOMSVGElement {

  String NS_IDOMSVGSVGELEMENT_IID =
    "{83b04425-9509-49f5-af75-1ae1f8f3e871}";

  nsIDOMSVGAnimatedLength getX();

  nsIDOMSVGAnimatedLength getY();

  nsIDOMSVGAnimatedLength getWidth();

  nsIDOMSVGAnimatedLength getHeight();

  String getContentScriptType();

  void setContentScriptType(String aContentScriptType);

  String getContentStyleType();

  void setContentStyleType(String aContentStyleType);

  nsIDOMSVGRect getViewport();

  float getPixelUnitToMillimeterX();

  float getPixelUnitToMillimeterY();

  float getScreenPixelToMillimeterX();

  float getScreenPixelToMillimeterY();

  boolean getUseCurrentView();

  void setUseCurrentView(boolean aUseCurrentView);

  nsIDOMSVGViewSpec getCurrentView();

  float getCurrentScale();

  void setCurrentScale(float aCurrentScale);

  nsIDOMSVGPoint getCurrentTranslate();

  long suspendRedraw(long max_wait_milliseconds);

  void unsuspendRedraw(long suspend_handle_id);

  void unsuspendRedrawAll();

  void forceRedraw();

  void pauseAnimations();

  void unpauseAnimations();

  boolean animationsPaused();

  float getCurrentTime();

  void setCurrentTime(float seconds);

  nsIDOMNodeList getIntersectionList(nsIDOMSVGRect rect, nsIDOMSVGElement referenceElement);

  nsIDOMNodeList getEnclosureList(nsIDOMSVGRect rect, nsIDOMSVGElement referenceElement);

  boolean checkIntersection(nsIDOMSVGElement element, nsIDOMSVGRect rect);

  boolean checkEnclosure(nsIDOMSVGElement element, nsIDOMSVGRect rect);

  void deSelectAll();

  nsIDOMSVGNumber createSVGNumber();

  nsIDOMSVGLength createSVGLength();

  nsIDOMSVGAngle createSVGAngle();

  nsIDOMSVGPoint createSVGPoint();

  nsIDOMSVGMatrix createSVGMatrix();

  nsIDOMSVGRect createSVGRect();

  nsIDOMSVGTransform createSVGTransform();

  nsIDOMSVGTransform createSVGTransformFromMatrix(nsIDOMSVGMatrix matrix);

  String createSVGString();

  nsIDOMElement getElementById(String elementId);

}