/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 23:52:57 GMT 2022
 */

package org.apache.commons.imaging.color;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.imaging.color.ColorDin99Lab;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ColorDin99Lab_ESTest extends ColorDin99Lab_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ColorDin99Lab colorDin99Lab0 = new ColorDin99Lab((-936.72), (-936.72), (-936.72));
      colorDin99Lab0.hashCode();
      assertEquals((-936.72), colorDin99Lab0.a99, 0.01);
      assertEquals((-936.72), colorDin99Lab0.b99, 0.01);
      assertEquals((-936.72), colorDin99Lab0.L99, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ColorDin99Lab colorDin99Lab0 = new ColorDin99Lab((-1.0), 1.0, 2154.095462098259);
      colorDin99Lab0.hashCode();
      assertEquals(2154.095462098259, colorDin99Lab0.b99, 0.01);
      assertEquals((-1.0), colorDin99Lab0.L99, 0.01);
      assertEquals(1.0, colorDin99Lab0.a99, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ColorDin99Lab colorDin99Lab0 = new ColorDin99Lab((-1447.96211871), (-1447.96211871), 3010.0);
      ColorDin99Lab colorDin99Lab1 = new ColorDin99Lab((-1447.96211871), 3010.0, (-1447.96211871));
      boolean boolean0 = colorDin99Lab0.equals(colorDin99Lab1);
      assertEquals(3010.0, colorDin99Lab1.a99, 0.01);
      assertEquals((-1447.96211871), colorDin99Lab1.L99, 0.01);
      assertFalse(boolean0);
      assertEquals(3010.0, colorDin99Lab0.b99, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ColorDin99Lab colorDin99Lab0 = new ColorDin99Lab((-1.0), 1.0, (-1.0));
      ColorDin99Lab colorDin99Lab1 = new ColorDin99Lab(1.0, 0.0, (-1.0));
      boolean boolean0 = colorDin99Lab0.equals(colorDin99Lab1);
      assertEquals((-1.0), colorDin99Lab1.b99, 0.01);
      assertEquals(1.0, colorDin99Lab0.a99, 0.01);
      assertEquals(1.0, colorDin99Lab1.L99, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ColorDin99Lab colorDin99Lab0 = new ColorDin99Lab((-1.0), 1.0, (-1.0));
      ColorDin99Lab colorDin99Lab1 = new ColorDin99Lab((-1.0), 1.0, 2154.095462098259);
      boolean boolean0 = colorDin99Lab0.equals(colorDin99Lab1);
      assertEquals((-1.0), colorDin99Lab1.L99, 0.01);
      assertEquals(1.0, colorDin99Lab1.a99, 0.01);
      assertFalse(colorDin99Lab1.equals((Object)colorDin99Lab0));
      assertEquals(2154.095462098259, colorDin99Lab1.b99, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ColorDin99Lab colorDin99Lab0 = new ColorDin99Lab(0.0, 0.0, 301.18435505341904);
      ColorDin99Lab colorDin99Lab1 = new ColorDin99Lab(0.0, 0.0, (-2383.038277473));
      boolean boolean0 = colorDin99Lab0.equals(colorDin99Lab1);
      assertFalse(boolean0);
      assertEquals(0.0, colorDin99Lab1.a99, 0.01);
      assertFalse(colorDin99Lab1.equals((Object)colorDin99Lab0));
      assertEquals((-2383.038277473), colorDin99Lab1.b99, 0.01);
      assertEquals(0.0, colorDin99Lab1.L99, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ColorDin99Lab colorDin99Lab0 = new ColorDin99Lab(0.0, 0.0, (-1.0));
      String string0 = colorDin99Lab0.toString();
      assertEquals("{L: 0.0, a: 0.0, b: -1.0}", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ColorDin99Lab colorDin99Lab0 = new ColorDin99Lab((-1447.96211871), 3010.0, (-1447.96211871));
      String string0 = colorDin99Lab0.toString();
      assertEquals("{L: -1447.96211871, a: 3010.0, b: -1447.96211871}", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ColorDin99Lab colorDin99Lab0 = new ColorDin99Lab(2973.5215453709443, 2973.5215453709443, 2973.5215453709443);
      ColorDin99Lab colorDin99Lab1 = new ColorDin99Lab(2973.5215453709443, 2973.5215453709443, 2973.5215453709443);
      boolean boolean0 = colorDin99Lab0.equals(colorDin99Lab1);
      assertTrue(boolean0);
      assertEquals(2973.5215453709443, colorDin99Lab1.b99, 0.01);
      assertEquals(2973.5215453709443, colorDin99Lab1.L99, 0.01);
      assertEquals(2973.5215453709443, colorDin99Lab1.a99, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ColorDin99Lab colorDin99Lab0 = new ColorDin99Lab(38.80227976, 38.80227976, 38.80227976);
      ColorDin99Lab colorDin99Lab1 = new ColorDin99Lab(38.80227976, (-79.81053759315277), (-79.81053759315277));
      boolean boolean0 = colorDin99Lab0.equals(colorDin99Lab1);
      assertEquals((-79.81053759315277), colorDin99Lab1.a99, 0.01);
      assertEquals(38.80227976, colorDin99Lab1.L99, 0.01);
      assertFalse(boolean0);
      assertEquals((-79.81053759315277), colorDin99Lab1.b99, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ColorDin99Lab colorDin99Lab0 = new ColorDin99Lab((-379.2758147271739), 172.07378683559386, (-379.2758147271739));
      ColorDin99Lab colorDin99Lab1 = new ColorDin99Lab(172.07378683559386, 172.07378683559386, (-379.2758147271739));
      boolean boolean0 = colorDin99Lab1.equals(colorDin99Lab0);
      assertEquals((-379.2758147271739), colorDin99Lab1.b99, 0.01);
      assertEquals(172.07378683559386, colorDin99Lab1.L99, 0.01);
      assertFalse(boolean0);
      assertEquals(172.07378683559386, colorDin99Lab0.a99, 0.01);
      assertFalse(colorDin99Lab0.equals((Object)colorDin99Lab1));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ColorDin99Lab colorDin99Lab0 = new ColorDin99Lab(2973.5215453709443, 2973.5215453709443, 2973.5215453709443);
      boolean boolean0 = colorDin99Lab0.equals((Object) null);
      assertEquals(2973.5215453709443, colorDin99Lab0.b99, 0.01);
      assertEquals(2973.5215453709443, colorDin99Lab0.L99, 0.01);
      assertEquals(2973.5215453709443, colorDin99Lab0.a99, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ColorDin99Lab colorDin99Lab0 = new ColorDin99Lab(118.84629144, 118.84629144, 118.84629144);
      boolean boolean0 = colorDin99Lab0.equals(colorDin99Lab0);
      assertEquals(118.84629144, colorDin99Lab0.L99, 0.01);
      assertEquals(118.84629144, colorDin99Lab0.b99, 0.01);
      assertTrue(boolean0);
      assertEquals(118.84629144, colorDin99Lab0.a99, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ColorDin99Lab colorDin99Lab0 = new ColorDin99Lab(118.84629144, 118.84629144, 118.84629144);
      Object object0 = new Object();
      boolean boolean0 = colorDin99Lab0.equals(object0);
      assertEquals(118.84629144, colorDin99Lab0.a99, 0.01);
      assertFalse(boolean0);
      assertEquals(118.84629144, colorDin99Lab0.L99, 0.01);
      assertEquals(118.84629144, colorDin99Lab0.b99, 0.01);
  }
}
