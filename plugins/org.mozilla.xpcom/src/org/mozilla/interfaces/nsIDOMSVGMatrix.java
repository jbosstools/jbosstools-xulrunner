/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGMatrix.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGMatrix extends nsISupports {

  String NS_IDOMSVGMATRIX_IID =
    "{ec2da3ef-5a99-49ed-aaef-b5af916c14ac}";

  float getA();

  void setA(float aA);

  float getB();

  void setB(float aB);

  float getC();

  void setC(float aC);

  float getD();

  void setD(float aD);

  float getE();

  void setE(float aE);

  float getF();

  void setF(float aF);

  nsIDOMSVGMatrix multiply(nsIDOMSVGMatrix secondMatrix);

  nsIDOMSVGMatrix inverse();

  nsIDOMSVGMatrix translate(float x, float y);

  nsIDOMSVGMatrix scale(float scaleFactor);

  nsIDOMSVGMatrix scaleNonUniform(float scaleFactorX, float scaleFactorY);

  nsIDOMSVGMatrix rotate(float angle);

  nsIDOMSVGMatrix rotateFromVector(float x, float y);

  nsIDOMSVGMatrix flipX();

  nsIDOMSVGMatrix flipY();

  nsIDOMSVGMatrix skewX(float angle);

  nsIDOMSVGMatrix skewY(float angle);

}