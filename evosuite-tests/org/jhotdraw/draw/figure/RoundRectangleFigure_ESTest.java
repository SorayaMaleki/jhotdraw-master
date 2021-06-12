/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 12 15:49:57 GMT 2021
 */

package org.jhotdraw.draw.figure;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jhotdraw.draw.DefaultDrawing;
import org.jhotdraw.draw.Drawing;
import org.jhotdraw.draw.connector.AbstractConnector;
import org.jhotdraw.draw.connector.Connector;
import org.jhotdraw.draw.figure.Figure;
import org.jhotdraw.draw.figure.ImageFigure;
import org.jhotdraw.draw.figure.LabeledLineConnectionFigure;
import org.jhotdraw.draw.figure.LineConnectionFigure;
import org.jhotdraw.draw.figure.RoundRectangleFigure;
import org.jhotdraw.draw.io.ImageOutputFormat;
import org.jhotdraw.draw.locator.BezierLabelLocator;
import org.jhotdraw.draw.locator.FontSizeLocator;
import org.jhotdraw.draw.locator.RelativeDecoratorLocator;
import org.jhotdraw.xml.DOMInput;
import org.jhotdraw.xml.DOMOutput;
import org.jhotdraw.xml.DefaultDOMFactory;
import org.jhotdraw.xml.JavaPrimitivesDOMFactory;
import org.jhotdraw.xml.JavaxDOMOutput;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RoundRectangleFigure_ESTest extends RoundRectangleFigure_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      Point2D.Double point2D_Double0 = new Point2D.Double(1249.9958, 1249.9958);
      roundRectangleFigure0.setBounds(point2D_Double0, point2D_Double0);
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure(656.84, (-475.5), (-1.0), 0.0);
      roundRectangleFigure0.setArc((-1110.9864518421857), (-1110.9864518421857));
      roundRectangleFigure0.setArcHeight(0.0);
      assertEquals(0.0, roundRectangleFigure0.getArcHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      AbstractConnector abstractConnector0 = new AbstractConnector(roundRectangleFigure0);
      JavaPrimitivesDOMFactory javaPrimitivesDOMFactory0 = new JavaPrimitivesDOMFactory();
      JavaxDOMOutput javaxDOMOutput0 = new JavaxDOMOutput(javaPrimitivesDOMFactory0);
      abstractConnector0.write(javaxDOMOutput0);
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      RoundRectangle2D.Double roundRectangle2D_Double0 = (RoundRectangle2D.Double)roundRectangleFigure0.getTransformRestoreData();
      roundRectangleFigure0.restoreTransformTo(roundRectangle2D_Double0);
      assertEquals(0.0, roundRectangle2D_Double0.width, 0.01);
      assertEquals(0.0, roundRectangle2D_Double0.x, 0.01);
      assertEquals(0.0, roundRectangle2D_Double0.y, 0.01);
      assertEquals(20.0, roundRectangle2D_Double0.arcwidth, 0.01);
      assertEquals(20.0, roundRectangle2D_Double0.archeight, 0.01);
      assertEquals(0.0, roundRectangle2D_Double0.height, 0.01);
      assertEquals(0.0, roundRectangle2D_Double0.getMaxX(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure(20.0, 20.0, 0.0, 0.0);
      Rectangle2D.Double rectangle2D_Double0 = roundRectangleFigure0.getDrawingArea();
      assertEquals(21.5, rectangle2D_Double0.getMaxY(), 0.01);
      assertEquals(21.5, rectangle2D_Double0.getMaxX(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      RelativeDecoratorLocator relativeDecoratorLocator0 = new RelativeDecoratorLocator((-97.79), (-97.79), true);
      Point2D.Double point2D_Double0 = relativeDecoratorLocator0.locate((Figure) roundRectangleFigure0);
      roundRectangleFigure0.setBounds(point2D_Double0, point2D_Double0);
      assertEquals(0.0, point2D_Double0.x, 0.01);
      assertEquals(0.0, point2D_Double0.y, 0.01);
      
      Rectangle2D.Double rectangle2D_Double0 = roundRectangleFigure0.getDrawingArea();
      assertEquals(1.6, rectangle2D_Double0.getMaxX(), 0.01);
      assertEquals(1.6, rectangle2D_Double0.getMaxY(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure((-234.90166519092972), 0.0, 0.0, (-234.90166519092972));
      Rectangle2D.Double rectangle2D_Double0 = roundRectangleFigure0.getDrawingArea();
      assertEquals((-233.40166519092972), rectangle2D_Double0.getMaxX(), 0.01);
      assertEquals((-233.40166519092972), rectangle2D_Double0.getMaxY(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure(0.1, 0.1, 0.1, 0.0);
      Rectangle2D.Double rectangle2D_Double0 = roundRectangleFigure0.getBounds();
      assertEquals(0.1, rectangle2D_Double0.getCenterY(), 0.01);
      assertEquals(0.0, rectangle2D_Double0.height, 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
      assertEquals(0.15000000000000002, rectangle2D_Double0.getCenterX(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure((-825.74), (-825.74), (-825.74), (-825.74));
      Rectangle2D.Double rectangle2D_Double0 = roundRectangleFigure0.getBounds();
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
      assertEquals((-1651.48), rectangle2D_Double0.getMaxX(), 0.01);
      assertEquals((-1651.48), rectangle2D_Double0.getMaxY(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
      
      roundRectangleFigure0.setArcWidth(0.0);
      double double0 = roundRectangleFigure0.getArcWidth();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      roundRectangleFigure0.setArc((-97.79), 0.0);
      double double0 = roundRectangleFigure0.getArcWidth();
      assertEquals((-97.79), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      roundRectangleFigure0.setArc((-97.79), 0.0);
      double double0 = roundRectangleFigure0.getArcHeight();
      assertEquals((-97.79), roundRectangleFigure0.getArcWidth(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure(0.0, (-2561.3759727), 0.0, (-1.57));
      roundRectangleFigure0.setArc(547.671547824, (-2561.3759727));
      double double0 = roundRectangleFigure0.getArcHeight();
      assertEquals(547.671547824, roundRectangleFigure0.getArcWidth(), 0.01);
      assertEquals((-2561.3759727), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      FontSizeLocator fontSizeLocator0 = new FontSizeLocator();
      ImageFigure imageFigure0 = new ImageFigure(1532.78, 360.0, 0.0, 3370.8782);
      Point2D.Double point2D_Double0 = fontSizeLocator0.locate((Figure) imageFigure0);
      roundRectangleFigure0.contains(point2D_Double0);
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      roundRectangleFigure0.setVisible(false);
      RoundRectangleFigure roundRectangleFigure1 = roundRectangleFigure0.clone();
      assertNotSame(roundRectangleFigure1, roundRectangleFigure0);
      assertEquals(20.0, roundRectangleFigure1.getArcWidth(), 0.01);
      assertEquals(20.0, roundRectangleFigure1.getArcHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      roundRectangleFigure0.setConnectable(false);
      RoundRectangleFigure roundRectangleFigure1 = roundRectangleFigure0.clone();
      assertNotSame(roundRectangleFigure1, roundRectangleFigure0);
      assertEquals(20.0, roundRectangleFigure1.getArcWidth(), 0.01);
      assertEquals(20.0, roundRectangleFigure1.getArcHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure(8.0, (-22.534312), 8.0, 102.96039379354);
      roundRectangleFigure0.setArcWidth((-22.534312));
      roundRectangleFigure0.clone();
      assertEquals((-22.534312), roundRectangleFigure0.getArcWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      roundRectangleFigure0.setArc(0.0, 0.0);
      roundRectangleFigure0.clone();
      assertEquals(0.0, roundRectangleFigure0.getArcWidth(), 0.01);
      assertEquals(0.0, roundRectangleFigure0.getArcHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      // Undeclared exception!
      try { 
        roundRectangleFigure0.write((DOMOutput) null);
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
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      DefaultDOMFactory defaultDOMFactory0 = new DefaultDOMFactory();
      JavaxDOMOutput javaxDOMOutput0 = new JavaxDOMOutput(defaultDOMFactory0);
      javaxDOMOutput0.openElement("arcHeight");
      // Undeclared exception!
      try { 
        roundRectangleFigure0.write(javaxDOMOutput0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Storable name not known to factory: arcHeight
         //
         verifyException("org.jhotdraw.xml.DefaultDOMFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure(0.0, 0.0, 0.0, 0.0);
      // Undeclared exception!
      try { 
        roundRectangleFigure0.transform((AffineTransform) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.figure.RoundRectangleFigure", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure((-36.36125324298), 1.57, (-36.36125324298), 1.57);
      // Undeclared exception!
      try { 
        roundRectangleFigure0.setBounds((Point2D.Double) null, (Point2D.Double) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.figure.RoundRectangleFigure", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      // Undeclared exception!
      try { 
        roundRectangleFigure0.restoreTransformTo((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.figure.RoundRectangleFigure", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure(0.1, 0.1, 0.1, 0.1);
      // Undeclared exception!
      try { 
        roundRectangleFigure0.drawStroke((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.AttributeKeys", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure((-1.57), (-1.57), (-1.57), 255.0);
      // Undeclared exception!
      try { 
        roundRectangleFigure0.drawFill((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.AttributeKeys", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure(1174.5720963046, 1174.5720963046, 1174.5720963046, 0.5);
      // Undeclared exception!
      try { 
        roundRectangleFigure0.contains((Point2D.Double) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.geom.RectangularShape", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      Point2D.Double point2D_Double0 = roundRectangleFigure0.getEndPoint();
      roundRectangleFigure0.setBounds(point2D_Double0, point2D_Double0);
      Rectangle2D.Double rectangle2D_Double0 = roundRectangleFigure0.getBounds();
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
      assertEquals(0.0, rectangle2D_Double0.y, 0.01);
      assertEquals(0.1, rectangle2D_Double0.getMaxX(), 0.01);
      assertEquals(0.0, rectangle2D_Double0.x, 0.01);
      assertEquals(0.05, rectangle2D_Double0.getCenterY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      Rectangle2D.Double rectangle2D_Double0 = roundRectangleFigure0.getBounds();
      assertEquals(0.0, rectangle2D_Double0.width, 0.01);
      assertEquals(0.0, rectangle2D_Double0.height, 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
      assertEquals(0.0, rectangle2D_Double0.getMaxY(), 0.01);
      assertEquals(0.0, rectangle2D_Double0.y, 0.01);
      assertEquals(0.0, rectangle2D_Double0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      ImageOutputFormat imageOutputFormat0 = new ImageOutputFormat();
      DefaultDrawing defaultDrawing0 = new DefaultDrawing();
      List<Figure> list0 = defaultDrawing0.getChildrenFrontToBack();
      BufferedImage bufferedImage0 = imageOutputFormat0.toImage((Drawing) defaultDrawing0, list0, (double) (-2869.344F), false);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      roundRectangleFigure0.transform(((SunGraphics2D) graphics2D0).transform);
      roundRectangleFigure0.drawStroke(graphics2D0);
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      ImageOutputFormat imageOutputFormat0 = new ImageOutputFormat();
      DefaultDrawing defaultDrawing0 = new DefaultDrawing();
      List<Figure> list0 = defaultDrawing0.getChildrenFrontToBack();
      BufferedImage bufferedImage0 = imageOutputFormat0.toImage((Drawing) defaultDrawing0, list0, (double) (-2869.3545F), false);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      roundRectangleFigure0.drawStroke(graphics2D0);
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      ImageOutputFormat imageOutputFormat0 = new ImageOutputFormat();
      DefaultDrawing defaultDrawing0 = new DefaultDrawing();
      List<Figure> list0 = defaultDrawing0.getChildrenFrontToBack();
      BufferedImage bufferedImage0 = imageOutputFormat0.toImage((Drawing) defaultDrawing0, list0, (double) (-2869.3545F), false);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      roundRectangleFigure0.transform(((SunGraphics2D) graphics2D0).transform);
      roundRectangleFigure0.drawFill(graphics2D0);
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      ImageOutputFormat imageOutputFormat0 = new ImageOutputFormat();
      DefaultDrawing defaultDrawing0 = new DefaultDrawing();
      Vector<Figure> vector0 = new Vector<Figure>();
      BufferedImage bufferedImage0 = imageOutputFormat0.toImage((Drawing) defaultDrawing0, (List<Figure>) vector0, 3.141592653589793, false);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      roundRectangleFigure0.drawFill(graphics2D0);
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      roundRectangleFigure0.createHandles(960);
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      double double0 = roundRectangleFigure0.getArcWidth();
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
      assertEquals(20.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      BezierLabelLocator bezierLabelLocator0 = new BezierLabelLocator();
      LineConnectionFigure lineConnectionFigure0 = new LineConnectionFigure();
      Point2D.Double point2D_Double0 = bezierLabelLocator0.getRelativeLabelPoint(lineConnectionFigure0, roundRectangleFigure0);
      roundRectangleFigure0.findConnector(point2D_Double0, lineConnectionFigure0);
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      Point2D.Double point2D_Double0 = roundRectangleFigure0.getEndPoint();
      LabeledLineConnectionFigure labeledLineConnectionFigure0 = new LabeledLineConnectionFigure();
      Connector connector0 = labeledLineConnectionFigure0.findConnector(point2D_Double0, labeledLineConnectionFigure0);
      // Undeclared exception!
      try { 
        roundRectangleFigure0.restoreTransformTo(connector0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jhotdraw.draw.connector.ChopBezierConnector cannot be cast to java.awt.geom.RoundRectangle2D$Double
         //
         verifyException("org.jhotdraw.draw.figure.RoundRectangleFigure", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      DefaultDOMFactory defaultDOMFactory0 = new DefaultDOMFactory();
      JavaxDOMOutput javaxDOMOutput0 = new JavaxDOMOutput(defaultDOMFactory0);
      // Undeclared exception!
      try { 
        roundRectangleFigure0.write(javaxDOMOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sun.org.apache.xerces.internal.dom.DocumentImpl cannot be cast to org.w3c.dom.Element
         //
         verifyException("org.jhotdraw.xml.JavaxDOMOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      Point2D.Double point2D_Double0 = roundRectangleFigure0.getEndPoint();
      LabeledLineConnectionFigure labeledLineConnectionFigure0 = new LabeledLineConnectionFigure();
      Connector connector0 = labeledLineConnectionFigure0.findConnector(point2D_Double0, labeledLineConnectionFigure0);
      roundRectangleFigure0.findCompatibleConnector(connector0, false);
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
      assertEquals(0.0, point2D_Double0.y, 0.01);
      assertEquals(0.0, point2D_Double0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      roundRectangleFigure0.setArc((-408.20775341), (-1.5));
      roundRectangleFigure0.setArcWidth((-1.5));
      assertEquals((-1.5), roundRectangleFigure0.getArcHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure(3515.0, 3515.0, 3515.0, 3515.0);
      // Undeclared exception!
      try { 
        roundRectangleFigure0.read((DOMInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.figure.AbstractAttributedFigure", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      double double0 = roundRectangleFigure0.getArcHeight();
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
      assertEquals(20.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      Rectangle2D.Double rectangle2D_Double0 = roundRectangleFigure0.getDrawingArea();
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
      assertEquals(1.5, rectangle2D_Double0.getMaxX(), 0.01);
      assertEquals(1.5, rectangle2D_Double0.getMaxY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      BezierLabelLocator bezierLabelLocator0 = new BezierLabelLocator();
      LineConnectionFigure lineConnectionFigure0 = new LineConnectionFigure();
      Point2D.Double point2D_Double0 = bezierLabelLocator0.getRelativeLabelPoint(lineConnectionFigure0, roundRectangleFigure0);
      boolean boolean0 = roundRectangleFigure0.contains(point2D_Double0);
      assertEquals(20.0, roundRectangleFigure0.getArcHeight(), 0.01);
      assertEquals(20.0, roundRectangleFigure0.getArcWidth(), 0.01);
      assertTrue(boolean0);
  }
}