/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/canvas/nsIDOMCanvasRenderingContext2D.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMCanvasRenderingContext2D extends nsISupports {

  String NS_IDOMCANVASRENDERINGCONTEXT2D_IID =
    "{3e7d5d06-8846-4cff-8739-44756cbf494f}";

  nsIDOMHTMLCanvasElement getCanvas();

  void save();

  void restore();

  void scale(float x, float y);

  void rotate(float angle);

  void translate(float x, float y);

  void transform(float m11, float m12, float m21, float m22, float dx, float dy);

  void setTransform(float m11, float m12, float m21, float m22, float dx, float dy);

  float getGlobalAlpha();

  void setGlobalAlpha(float aGlobalAlpha);

  String getGlobalCompositeOperation();

  void setGlobalCompositeOperation(String aGlobalCompositeOperation);

  nsIVariant getStrokeStyle();

  void setStrokeStyle(nsIVariant aStrokeStyle);

  nsIVariant getFillStyle();

  void setFillStyle(nsIVariant aFillStyle);

  nsIDOMCanvasGradient createLinearGradient(float x0, float y0, float x1, float y1);

  nsIDOMCanvasGradient createRadialGradient(float x0, float y0, float r0, float x1, float y1, float r1);

  nsIDOMCanvasPattern createPattern(nsIDOMHTMLElement image, String repetition);

  float getLineWidth();

  void setLineWidth(float aLineWidth);

  String getLineCap();

  void setLineCap(String aLineCap);

  String getLineJoin();

  void setLineJoin(String aLineJoin);

  float getMiterLimit();

  void setMiterLimit(float aMiterLimit);

  float getShadowOffsetX();

  void setShadowOffsetX(float aShadowOffsetX);

  float getShadowOffsetY();

  void setShadowOffsetY(float aShadowOffsetY);

  float getShadowBlur();

  void setShadowBlur(float aShadowBlur);

  String getShadowColor();

  void setShadowColor(String aShadowColor);

  void clearRect(float x, float y, float w, float h);

  void fillRect(float x, float y, float w, float h);

  void strokeRect(float x, float y, float w, float h);

  void beginPath();

  void closePath();

  void moveTo(float x, float y);

  void lineTo(float x, float y);

  void quadraticCurveTo(float cpx, float cpy, float x, float y);

  void bezierCurveTo(float cp1x, float cp1y, float cp2x, float cp2y, float x, float y);

  void arcTo(float x1, float y1, float x2, float y2, float radius);

  void arc(float x, float y, float r, float startAngle, float endAngle, boolean clockwise);

  void rect(float x, float y, float w, float h);

  void fill();

  void stroke();

  void clip();

  String getFont();

  void setFont(String aFont);

  String getTextAlign();

  void setTextAlign(String aTextAlign);

  String getTextBaseline();

  void setTextBaseline(String aTextBaseline);

  void fillText(String text, float x, float y, float maxWidth);

  void strokeText(String text, float x, float y, float maxWidth);

  nsIDOMTextMetrics measureText(String text);

  String getMozTextStyle();

  void setMozTextStyle(String aMozTextStyle);

  void mozDrawText(String textToDraw);

  float mozMeasureText(String textToMeasure);

  void mozPathText(String textToPath);

  void mozTextAlongPath(String textToDraw, boolean stroke);

  void drawImage();

  boolean isPointInPath(float x, float y);

  void getImageData();

  void putImageData();

  void createImageData();

  boolean getMozImageSmoothingEnabled();

  void setMozImageSmoothingEnabled(boolean aMozImageSmoothingEnabled);

  long DRAWWINDOW_DRAW_CARET = 1L;

  long DRAWWINDOW_DO_NOT_FLUSH = 2L;

  long DRAWWINDOW_DRAW_VIEW = 4L;

  /**
   * Renders a region of a window into the canvas.  The contents of
   * the window's viewport are rendered, ignoring viewport clipping
   * and scrolling.
   *
   * @param x
   * @param y
   * @param w
   * @param h specify the area of the window to render, in CSS
   * pixels.
   *
   * @param backgroundColor the canvas is filled with this color
   * before we render the window into it. This color may be
   * transparent/translucent. It is given as a CSS color string
   * (e.g., rgb() or rgba()).
   *
   * @param flags Uused to better control the drawWindow call.
   * Flags can be ORed together.
   *
   * Of course, the rendering obeys the current scale, transform and
   * globalAlpha values.
   *
   * Hints:
   * -- If 'rgba(0,0,0,0)' is used for the background color, the
   * drawing will be transparent wherever the window is transparent.
   * -- Top-level browsed documents are usually not transparent
   * because the user's background-color preference is applied,
   * but IFRAMEs are transparent if the page doesn't set a background.
   * -- If an opaque color is used for the background color, rendering
   * will be faster because we won't have to compute the window's
   * transparency.
   *
   * This API cannot currently be used by Web content. It is chrome
   * only.
   */
  void drawWindow(nsIDOMWindow window, float x, float y, float w, float h, String bgColor, long flags);

}