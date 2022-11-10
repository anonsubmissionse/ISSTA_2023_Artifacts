/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 23:27:23 GMT 2022
 */

package org.apache.commons.imaging;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.PrintWriter;
import org.apache.commons.imaging.FormatCompliance;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FormatCompliance_ESTest extends FormatCompliance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FormatCompliance formatCompliance0 = FormatCompliance.getDefault();
      boolean boolean0 = formatCompliance0.checkBounds("initialList", 1365, 1365, 1365);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FormatCompliance formatCompliance0 = new FormatCompliance("YAe* EJN.");
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)125;
      boolean boolean0 = formatCompliance0.compareBytes("Format Compliance: YAe* EJN.\n\t1: YAe* EJN.: 2036 (7f4)\n\n", byteArray1, byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FormatCompliance formatCompliance0 = new FormatCompliance("", false);
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = new byte[4];
      boolean boolean0 = formatCompliance0.compareBytes("", byteArray0, byteArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FormatCompliance formatCompliance0 = FormatCompliance.getDefault();
      byte[] byteArray0 = new byte[23];
      byte[] byteArray1 = new byte[1];
      boolean boolean0 = formatCompliance0.compareBytes("", byteArray1, byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FormatCompliance formatCompliance0 = new FormatCompliance("");
      boolean boolean0 = formatCompliance0.compare("", 1809, 1809);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FormatCompliance formatCompliance0 = new FormatCompliance("PwtS)OtJT I@zT");
      // Undeclared exception!
      try { 
        formatCompliance0.dump((PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.FormatCompliance", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FormatCompliance formatCompliance0 = new FormatCompliance("/Zm");
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        formatCompliance0.compareBytes((String) null, byteArray0, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.FormatCompliance", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FormatCompliance formatCompliance0 = new FormatCompliance((String) null, true);
      int[] intArray0 = new int[7];
      try { 
        formatCompliance0.compare("3S@3^", intArray0, (-1));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 3S@3^: Unexpected value: (valid: {0 (0), 0 (0), 0 (0), 0 (0), 0 (0), 0 (0), 0 (0)}, actual: -1 (ffffffff))
         //
         verifyException("org.apache.commons.imaging.FormatCompliance", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FormatCompliance formatCompliance0 = new FormatCompliance("");
      // Undeclared exception!
      try { 
        formatCompliance0.compare((String) null, (int[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.FormatCompliance", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FormatCompliance formatCompliance0 = new FormatCompliance(".</($8RB.", true);
      try { 
        formatCompliance0.compare(".</($8RB.", (-1604), 125);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // .</($8RB.: Unexpected value: (valid: -1604 (fffff9bc), actual: 125 (7d))
         //
         verifyException("org.apache.commons.imaging.FormatCompliance", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FormatCompliance formatCompliance0 = new FormatCompliance("6:7%U&oCf", false);
      int[] intArray0 = new int[1];
      boolean boolean0 = formatCompliance0.compare("H)AHfmk?,D}z&*)", intArray0, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FormatCompliance formatCompliance0 = FormatCompliance.getDefault();
      File file0 = MockFile.createTempFile(": Unexpected value: (expected: ", ": Unexpected value: (expected: ");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      formatCompliance0.dump((PrintWriter) mockPrintWriter0);
      assertEquals(41L, file0.length());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FormatCompliance formatCompliance0 = new FormatCompliance("org.apache.commons.imaging.FormatCompliance");
      formatCompliance0.addComment("", (-141));
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("org.apache.commons.imaging.FormatCompliance");
      formatCompliance0.dump((PrintWriter) mockPrintWriter0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FormatCompliance formatCompliance0 = new FormatCompliance("t[VW", true);
      try { 
        formatCompliance0.addComment("t[VW");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // t[VW
         //
         verifyException("org.apache.commons.imaging.FormatCompliance", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FormatCompliance formatCompliance0 = new FormatCompliance("^RZC6h4");
      formatCompliance0.addComment("^RZC6h4");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FormatCompliance formatCompliance0 = new FormatCompliance("`ECPl1S_E[?");
      int[] intArray0 = new int[4];
      intArray0[0] = (-1316);
      boolean boolean0 = formatCompliance0.compare("", intArray0, (-1316));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FormatCompliance formatCompliance0 = new FormatCompliance("!Q");
      boolean boolean0 = formatCompliance0.checkBounds("!Q", 68, 68, 2155);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FormatCompliance formatCompliance0 = new FormatCompliance("`ECPl1S_E[?");
      boolean boolean0 = formatCompliance0.checkBounds("mFo_}j_;", (-1316), 1559, 123);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FormatCompliance formatCompliance0 = new FormatCompliance("UXa;T.ap{?U", true);
      try { 
        formatCompliance0.checkBounds("3sq[.db#tG7c", 2689, 31, 31);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 3sq[.db#tG7c: bounds check: 2689 <= 31 <= 31: false
         //
         verifyException("org.apache.commons.imaging.FormatCompliance", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)86;
      FormatCompliance formatCompliance0 = FormatCompliance.getDefault();
      byte[] byteArray1 = new byte[2];
      boolean boolean0 = formatCompliance0.compareBytes("Format Compliance: ignore\n\tNo comments.\n\n", byteArray1, byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FormatCompliance formatCompliance0 = new FormatCompliance(".N);wd=j9z'/i", true);
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[6];
      try { 
        formatCompliance0.compareBytes("]*U,9", byteArray0, byteArray1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ]*U,9: Unexpected length: (expected: 1, actual: 6)
         //
         verifyException("org.apache.commons.imaging.FormatCompliance", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FormatCompliance formatCompliance0 = FormatCompliance.getDefault();
      boolean boolean0 = formatCompliance0.compareBytes("Format Compliance: ignore\n\tNo comments.\n\n", byteArray0, byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FormatCompliance formatCompliance0 = FormatCompliance.getDefault();
      formatCompliance0.addComment("2q", (int) (byte)86);
      formatCompliance0.dump();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FormatCompliance formatCompliance0 = FormatCompliance.getDefault();
      String string0 = formatCompliance0.toString();
      assertEquals("Format Compliance: ignore\n\tNo comments.\n\n", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FormatCompliance formatCompliance0 = new FormatCompliance("B:s5G^A\"", true);
      try { 
        formatCompliance0.addComment((String) null, 0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // null: 0 (0)
         //
         verifyException("org.apache.commons.imaging.FormatCompliance", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FormatCompliance formatCompliance0 = new FormatCompliance("");
      boolean boolean0 = formatCompliance0.compare("/NJ0tC", 1809, 0);
      assertFalse(boolean0);
  }
}
