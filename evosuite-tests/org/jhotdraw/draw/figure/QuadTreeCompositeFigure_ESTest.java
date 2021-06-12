/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 12 16:29:02 GMT 2021
 */

package org.jhotdraw.draw.figure;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Rectangle2D;
import javax.swing.event.UndoableEditEvent;
import javax.swing.undo.UndoManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jhotdraw.draw.AttributeKey;
import org.jhotdraw.draw.event.FigureEvent;
import org.jhotdraw.draw.figure.LabeledLineConnectionFigure;
import org.jhotdraw.draw.figure.LineConnectionFigure;
import org.jhotdraw.draw.figure.ListFigure;
import org.jhotdraw.draw.figure.QuadTreeCompositeFigure;
import org.jhotdraw.draw.figure.RoundRectangleFigure;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QuadTreeCompositeFigure_ESTest extends QuadTreeCompositeFigure_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QuadTreeCompositeFigure quadTreeCompositeFigure0 = mock(QuadTreeCompositeFigure.class, CALLS_REAL_METHODS);
      QuadTreeCompositeFigure.FigureHandler quadTreeCompositeFigure_FigureHandler0 = quadTreeCompositeFigure0.new FigureHandler();
      ListFigure listFigure0 = new ListFigure();
      LabeledLineConnectionFigure labeledLineConnectionFigure0 = new LabeledLineConnectionFigure();
      FigureEvent figureEvent0 = new FigureEvent(listFigure0, (AttributeKey<?>) null, labeledLineConnectionFigure0, (Object) null);
      // Undeclared exception!
      try { 
        quadTreeCompositeFigure_FigureHandler0.figureChanged(figureEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.figure.QuadTreeCompositeFigure$FigureHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QuadTreeCompositeFigure quadTreeCompositeFigure0 = mock(QuadTreeCompositeFigure.class, CALLS_REAL_METHODS);
      QuadTreeCompositeFigure.FigureHandler quadTreeCompositeFigure_FigureHandler0 = quadTreeCompositeFigure0.new FigureHandler();
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      UndoManager undoManager0 = new UndoManager();
      UndoableEditEvent undoableEditEvent0 = new UndoableEditEvent(roundRectangleFigure0, undoManager0);
      quadTreeCompositeFigure_FigureHandler0.undoableEditHappened(undoableEditEvent0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QuadTreeCompositeFigure quadTreeCompositeFigure0 = mock(QuadTreeCompositeFigure.class, CALLS_REAL_METHODS);
      QuadTreeCompositeFigure.FigureHandler quadTreeCompositeFigure_FigureHandler0 = quadTreeCompositeFigure0.new FigureHandler();
      // Undeclared exception!
      try { 
        quadTreeCompositeFigure_FigureHandler0.figureRequestRemove((FigureEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.figure.QuadTreeCompositeFigure$FigureHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QuadTreeCompositeFigure quadTreeCompositeFigure0 = mock(QuadTreeCompositeFigure.class, CALLS_REAL_METHODS);
      QuadTreeCompositeFigure.FigureHandler quadTreeCompositeFigure_FigureHandler0 = quadTreeCompositeFigure0.new FigureHandler();
      LineConnectionFigure lineConnectionFigure0 = new LineConnectionFigure();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      FigureEvent figureEvent0 = new FigureEvent(lineConnectionFigure0, rectangle2D_Double0);
      // Undeclared exception!
      try { 
        quadTreeCompositeFigure_FigureHandler0.areaInvalidated(figureEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.figure.AbstractFigure", e);
      }
  }
}