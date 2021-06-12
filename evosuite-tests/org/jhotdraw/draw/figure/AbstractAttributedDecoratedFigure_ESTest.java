/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 12 16:22:45 GMT 2021
 */

package org.jhotdraw.draw.figure;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jhotdraw.draw.DefaultDrawing;
import org.jhotdraw.draw.Drawing;
import org.jhotdraw.draw.QuadTreeDrawing;
import org.jhotdraw.draw.figure.AbstractAttributedDecoratedFigure;
import org.jhotdraw.draw.figure.Figure;
import org.jhotdraw.draw.figure.ImageFigure;
import org.jhotdraw.draw.figure.LabelFigure;
import org.jhotdraw.draw.figure.LabeledLineConnectionFigure;
import org.jhotdraw.draw.figure.TextAreaFigure;
import org.jhotdraw.draw.figure.TextFigure;
import org.jhotdraw.draw.io.ImageOutputFormat;
import org.jhotdraw.draw.locator.FontSizeLocator;
import org.jhotdraw.xml.DOMOutput;
import org.jhotdraw.xml.DefaultDOMFactory;
import org.jhotdraw.xml.JavaxDOMOutput;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractAttributedDecoratedFigure_ESTest extends AbstractAttributedDecoratedFigure_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ImageFigure imageFigure0 = new ImageFigure();
      imageFigure0.updateDecoratorBounds();
      assertTrue(imageFigure0.isRemovable());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LabelFigure labelFigure0 = new LabelFigure((String) null);
      ImageOutputFormat imageOutputFormat0 = new ImageOutputFormat((String) null, (String) null, "dft|yb", (byte) (-50));
      DefaultDrawing defaultDrawing0 = new DefaultDrawing();
      BufferedImage bufferedImage0 = imageOutputFormat0.toImage((Drawing) defaultDrawing0, (List<Figure>) null, (double) (byte)0, false);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      labelFigure0.draw(sunGraphics2D0);
      assertEquals(0, sunGraphics2D0.strokeHint);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ImageFigure imageFigure0 = new ImageFigure();
      Rectangle2D.Double rectangle2D_Double0 = imageFigure0.getFigureDrawingArea();
      assertEquals(0.5, rectangle2D_Double0.getMaxX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextFigure textFigure0 = new TextFigure();
      Rectangle2D.Double rectangle2D_Double0 = textFigure0.getFigureDrawingArea();
      assertEquals(28.373046875, rectangle2D_Double0.getMaxX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TextAreaFigure textAreaFigure0 = new TextAreaFigure((String) null);
      AffineTransform affineTransform0 = new AffineTransform(1362.6167F, 1362.6167F, (-3177.8042F), 3309.705F, (-403.5F), 1.0F);
      textAreaFigure0.transform(affineTransform0);
      Rectangle2D.Double rectangle2D_Double0 = textAreaFigure0.getFigureDrawingArea();
      assertEquals((-1.5), rectangle2D_Double0.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ImageFigure imageFigure0 = new ImageFigure(0.0, 12.0F, (-2087.5), (-1743.3903));
      Rectangle2D.Double rectangle2D_Double0 = imageFigure0.getDrawingArea();
      assertEquals((-1043.75), rectangle2D_Double0.getCenterX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LabelFigure labelFigure0 = new LabelFigure();
      LabeledLineConnectionFigure labeledLineConnectionFigure0 = new LabeledLineConnectionFigure();
      Point2D.Double point2D_Double0 = labeledLineConnectionFigure0.getOutermostPoint();
      boolean boolean0 = labelFigure0.contains(point2D_Double0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LabelFigure labelFigure0 = new LabelFigure("");
      // Undeclared exception!
      try { 
        labelFigure0.write((DOMOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.figure.TextFigure", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TextFigure textFigure0 = new TextFigure();
      // Undeclared exception!
      try { 
        textFigure0.drawFigure((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.figure.AbstractAttributedFigure", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ImageFigure imageFigure0 = new ImageFigure(0.0, 12.0F, (-2087.5), (-1743.3903));
      // Undeclared exception!
      try { 
        imageFigure0.contains((Point2D.Double) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.geom.RectangularShape", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ImageFigure imageFigure0 = new ImageFigure();
      QuadTreeDrawing quadTreeDrawing0 = new QuadTreeDrawing();
      imageFigure0.setDecorator(quadTreeDrawing0);
      AbstractAttributedDecoratedFigure abstractAttributedDecoratedFigure0 = imageFigure0.clone();
      assertNotSame(abstractAttributedDecoratedFigure0, imageFigure0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TextAreaFigure textAreaFigure0 = new TextAreaFigure("$;B/u1sT{E{oH4<Y");
      DefaultDOMFactory defaultDOMFactory0 = new DefaultDOMFactory();
      JavaxDOMOutput javaxDOMOutput0 = new JavaxDOMOutput(defaultDOMFactory0);
      textAreaFigure0.writeDecorator(javaxDOMOutput0);
      assertTrue(textAreaFigure0.isEditable());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TextAreaFigure textAreaFigure0 = new TextAreaFigure();
      FontSizeLocator fontSizeLocator0 = new FontSizeLocator();
      Point2D.Double point2D_Double0 = fontSizeLocator0.locate((Figure) textAreaFigure0);
      boolean boolean0 = textAreaFigure0.contains(point2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ImageFigure imageFigure0 = new ImageFigure();
      imageFigure0.setDecorator((Figure) null);
      assertTrue(imageFigure0.isSelectable());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TextAreaFigure textAreaFigure0 = new TextAreaFigure();
      TextAreaFigure textAreaFigure1 = textAreaFigure0.clone();
      assertNotSame(textAreaFigure1, textAreaFigure0);
      
      textAreaFigure1.setDecorator(textAreaFigure0);
      Rectangle2D.Double rectangle2D_Double0 = textAreaFigure1.getDrawingArea();
      assertEquals(6.0, rectangle2D_Double0.width, 0.01);
      assertEquals(6.0, rectangle2D_Double0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TextAreaFigure textAreaFigure0 = new TextAreaFigure("");
      Rectangle2D.Double rectangle2D_Double0 = textAreaFigure0.getDrawingArea();
      assertEquals(5.0, rectangle2D_Double0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ImageFigure imageFigure0 = new ImageFigure();
      Figure figure0 = imageFigure0.getDecorator();
      assertNull(figure0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LabelFigure labelFigure0 = new LabelFigure();
      // Undeclared exception!
      try { 
        labelFigure0.drawDecorator((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.figure.AbstractAttributedDecoratedFigure", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TextAreaFigure textAreaFigure0 = new TextAreaFigure();
      // Undeclared exception!
      try { 
        textAreaFigure0.draw((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.figure.AbstractAttributedFigure", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ImageFigure imageFigure0 = new ImageFigure((-950.91775), 0.0, 3610.845481388991, (-950.91775));
      DefaultDOMFactory defaultDOMFactory0 = new DefaultDOMFactory();
      JavaxDOMOutput javaxDOMOutput0 = new JavaxDOMOutput(defaultDOMFactory0);
      // Undeclared exception!
      try { 
        imageFigure0.write(javaxDOMOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sun.org.apache.xerces.internal.dom.DocumentImpl cannot be cast to org.w3c.dom.Element
         //
         verifyException("org.jhotdraw.xml.JavaxDOMOutput", e);
      }
  }
}