/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 23:56:09 GMT 2022
 */

package org.apache.commons.imaging.palette;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.imaging.palette.ColorSpaceSubset;
import org.apache.commons.imaging.palette.QuantizedPalette;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QuantizedPalette_ESTest extends QuantizedPalette_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<ColorSpaceSubset> linkedList0 = new LinkedList<ColorSpaceSubset>();
      ColorSpaceSubset colorSpaceSubset0 = new ColorSpaceSubset((-2127), 1);
      linkedList0.add(colorSpaceSubset0);
      QuantizedPalette quantizedPalette0 = new QuantizedPalette(linkedList0, 1);
      int int0 = quantizedPalette0.length();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<ColorSpaceSubset> linkedList0 = new LinkedList<ColorSpaceSubset>();
      ColorSpaceSubset colorSpaceSubset0 = new ColorSpaceSubset(1, 1);
      linkedList0.add(colorSpaceSubset0);
      QuantizedPalette quantizedPalette0 = new QuantizedPalette(linkedList0, 1);
      int int0 = quantizedPalette0.getPaletteIndex(1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<ColorSpaceSubset> linkedList0 = new LinkedList<ColorSpaceSubset>();
      ColorSpaceSubset colorSpaceSubset0 = new ColorSpaceSubset((-2127), 1);
      linkedList0.add(colorSpaceSubset0);
      linkedList0.add(colorSpaceSubset0);
      QuantizedPalette quantizedPalette0 = new QuantizedPalette(linkedList0, 1);
      int int0 = quantizedPalette0.getPaletteIndex(717);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<ColorSpaceSubset> linkedList0 = new LinkedList<ColorSpaceSubset>();
      int[] intArray0 = new int[5];
      ColorSpaceSubset colorSpaceSubset0 = new ColorSpaceSubset(0, 0, intArray0, intArray0);
      colorSpaceSubset0.rgb = 0;
      linkedList0.add(colorSpaceSubset0);
      QuantizedPalette quantizedPalette0 = new QuantizedPalette(linkedList0, 0);
      assertEquals(1, quantizedPalette0.length());
      
      int int0 = quantizedPalette0.getEntry(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<ColorSpaceSubset> linkedList0 = new LinkedList<ColorSpaceSubset>();
      ColorSpaceSubset colorSpaceSubset0 = new ColorSpaceSubset((-2127), 1);
      colorSpaceSubset0.rgb = (-2127);
      linkedList0.add(colorSpaceSubset0);
      colorSpaceSubset0.rgb = 1;
      linkedList0.add(colorSpaceSubset0);
      QuantizedPalette quantizedPalette0 = new QuantizedPalette(linkedList0, 1);
      int int0 = quantizedPalette0.getEntry(1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<ColorSpaceSubset> linkedList0 = new LinkedList<ColorSpaceSubset>();
      ColorSpaceSubset colorSpaceSubset0 = new ColorSpaceSubset(8, 8);
      linkedList0.add(colorSpaceSubset0);
      QuantizedPalette quantizedPalette0 = new QuantizedPalette(linkedList0, 2661);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<ColorSpaceSubset> linkedList0 = new LinkedList<ColorSpaceSubset>();
      linkedList0.add((ColorSpaceSubset) null);
      QuantizedPalette quantizedPalette0 = null;
      try {
        quantizedPalette0 = new QuantizedPalette(linkedList0, 1168);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.palette.QuantizedPalette", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<ColorSpaceSubset> linkedList0 = new LinkedList<ColorSpaceSubset>();
      QuantizedPalette quantizedPalette0 = null;
      try {
        quantizedPalette0 = new QuantizedPalette(linkedList0, 3093);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.palette.QuantizedPalette", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<ColorSpaceSubset> linkedList0 = new LinkedList<ColorSpaceSubset>();
      int[] intArray0 = new int[2];
      ColorSpaceSubset colorSpaceSubset0 = new ColorSpaceSubset(3, 2762, intArray0, intArray0);
      linkedList0.add(colorSpaceSubset0);
      QuantizedPalette quantizedPalette0 = null;
      try {
        quantizedPalette0 = new QuantizedPalette(linkedList0, (-4799));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.imaging.palette.QuantizedPalette", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<ColorSpaceSubset> linkedList0 = new LinkedList<ColorSpaceSubset>();
      ColorSpaceSubset colorSpaceSubset0 = new ColorSpaceSubset(1, 1);
      linkedList0.add(colorSpaceSubset0);
      QuantizedPalette quantizedPalette0 = new QuantizedPalette(linkedList0, 1);
      int int0 = quantizedPalette0.getEntry(0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QuantizedPalette quantizedPalette0 = new QuantizedPalette((List<ColorSpaceSubset>) null, (-70));
      // Undeclared exception!
      try { 
        quantizedPalette0.getPaletteIndex((-70));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.imaging.palette.QuantizedPalette", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<ColorSpaceSubset> linkedList0 = new LinkedList<ColorSpaceSubset>();
      QuantizedPalette quantizedPalette0 = new QuantizedPalette(linkedList0, 1);
      // Undeclared exception!
      try { 
        quantizedPalette0.getEntry(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<ColorSpaceSubset> linkedList0 = new LinkedList<ColorSpaceSubset>();
      QuantizedPalette quantizedPalette0 = new QuantizedPalette(linkedList0, 1);
      // Undeclared exception!
      try { 
        quantizedPalette0.getPaletteIndex(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.palette.QuantizedPalette", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<ColorSpaceSubset> linkedList0 = new LinkedList<ColorSpaceSubset>();
      QuantizedPalette quantizedPalette0 = new QuantizedPalette(linkedList0, 1);
      int int0 = quantizedPalette0.length();
      assertEquals(0, int0);
  }
}
