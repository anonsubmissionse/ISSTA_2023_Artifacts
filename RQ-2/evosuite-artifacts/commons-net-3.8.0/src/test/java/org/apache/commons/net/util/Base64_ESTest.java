/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 20:16:22 GMT 2022
 */

package org.apache.commons.net.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import org.apache.commons.net.util.Base64;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64_ESTest extends Base64_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Base64 base64_0 = new Base64(6, byteArray0, true);
      String string0 = base64_0.encodeToString(byteArray0);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Base64 base64_0 = new Base64(6, byteArray0, true);
      String string0 = base64_0.encodeToString(byteArray0);
      assertTrue(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Base64 base64_0 = new Base64(false);
      byte[] byteArray0 = new byte[4];
      base64_0.decode(byteArray0, (-1229), (int) (byte)0);
      assertFalse(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-40);
      byte[] byteArray1 = Base64.encodeBase64Chunked(byteArray0);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-40);
      byte[] byteArray1 = Base64.encodeBase64Chunked(byteArray0);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base64 base64_0 = new Base64(0, byteArray0, true);
      base64_0.encode(byteArray0, 0, 0);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = Base64.decodeBase64("h@!m&2AFUJA{");
      base64_0.setInitialBuffer(byteArray0, 0, 0);
      assertTrue(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = Base64.decodeBase64("h@!m&2AFUJA{");
      base64_0.setInitialBuffer(byteArray0, 0, 0);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = Base64.decodeBase64("h@!m&2AFUJA{");
      base64_0.setInitialBuffer(byteArray0, 0, 0);
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Base64 base64_0 = new Base64();
      base64_0.encode(byteArray0, (int) (byte) (-75), (-879));
      int int0 = base64_0.readResults(byteArray0, 0, 168);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      byte[] byteArray0 = Base64.toIntegerBytes(bigInteger0);
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      BigInteger bigInteger0 = Base64.decodeInteger(byteArray0);
      byte[] byteArray1 = Base64.toIntegerBytes(bigInteger0);
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = base64_0.encode(byteArray0);
      int int0 = base64_0.readResults(byteArray1, (byte)41, (byte)41);
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = base64_0.encode(byteArray0);
      int int0 = base64_0.readResults(byteArray1, (byte)41, (byte)41);
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = base64_0.encode(byteArray0);
      int int0 = base64_0.readResults(byteArray1, (byte)41, (byte)41);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base64 base64_0 = new Base64(0, byteArray0, true);
      base64_0.getLineSeparator();
      assertFalse(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Base64 base64_0 = new Base64();
      int int0 = base64_0.getLineLength();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Base64 base64_0 = new Base64();
      int int0 = base64_0.getLineLength();
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Base64 base64_0 = new Base64((-3035));
      byte[] byteArray0 = new byte[0];
      base64_0.encodeToString(byteArray0);
      assertFalse(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = Base64.encodeBase64URLSafeString(byteArray0);
      ;
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64URLSafe((byte[]) null);
      assertNotNull(byteArray0);
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = Base64.decodeBase64("]");
      String string0 = Base64.encodeBase64StringUnChunked(byteArray0);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = Base64.decodeBase64(byteArray0);
      String string0 = Base64.encodeBase64String(byteArray1, true);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      String string0 = Base64.encodeBase64String(byteArray0);
      ;
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64Chunked((byte[]) null);
      assertNotNull(byteArray0);
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Base64.encodeBase64Chunked(byteArray0);
      ;
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64((byte[]) null, true, false);
      ;
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, false, false);
      ;
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, false, false);
      ;
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, true);
      ;
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64((byte[]) null);
      ;
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0);
      ;
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte) (-39);
      Base64 base64_0 = new Base64(0);
      byte[] byteArray1 = base64_0.encode(byteArray0);
      BigInteger bigInteger0 = Base64.decodeInteger(byteArray1);
      ;
}
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte) (-39);
      Base64 base64_0 = new Base64(0);
      byte[] byteArray1 = base64_0.encode(byteArray0);
      BigInteger bigInteger0 = Base64.decodeInteger(byteArray1);
      ;
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)81;
      byte[] byteArray1 = Base64.encodeBase64(byteArray0);
      BigInteger bigInteger0 = Base64.decodeInteger(byteArray1);
      ;
}
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)81;
      byte[] byteArray1 = Base64.encodeBase64(byteArray0);
      BigInteger bigInteger0 = Base64.decodeInteger(byteArray1);
      ;
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)103;
      byteArray0[4] = (byte)50;
      BigInteger bigInteger0 = Base64.decodeInteger(byteArray0);
      byte[] byteArray1 = Base64.toIntegerBytes(bigInteger0);
      ;
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = Base64.decodeBase64((byte[]) null);
      ;
}
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = Base64.encodeBase64URLSafe(byteArray0);
      byte[] byteArray2 = Base64.decodeBase64(byteArray1);
      ;
}
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = Base64.encodeBase64URLSafe(byteArray0);
      byte[] byteArray2 = Base64.decodeBase64(byteArray1);
      ;
}
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = Base64.encodeBase64URLSafe(byteArray0);
      byte[] byteArray2 = Base64.decodeBase64(byteArray1);
      ;
}
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0);
      byte[] byteArray2 = base64_0.decode(byteArray1);
      ;
}
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0);
      byte[] byteArray2 = base64_0.decode(byteArray1);
      assertTrue(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0);
      byte[] byteArray2 = base64_0.decode(byteArray1);
      ;
}
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0);
      byte[] byteArray2 = base64_0.decode(byteArray1);
      ;
}
 @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0);
      byte[] byteArray2 = base64_0.decode(byteArray1);
      ;
}
 @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Base64 base64_0 = new Base64();
      base64_0.decode("");
      ;
}
 @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.toIntegerBytes((BigInteger) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.util.Base64", e);
      }
  }
 @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Base64 base64_0 = new Base64(false);
      byte[] byteArray0 = new byte[8];
      base64_0.encode(byteArray0);
      // Undeclared exception!
      try { 
        base64_0.readResults((byte[]) null, 1540, (-1));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
 @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Base64 base64_0 = new Base64();
      base64_0.encodeToString(byteArray0);
      // Undeclared exception!
      try { 
        base64_0.readResults(byteArray0, 2267, (byte) (-78));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
 @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.isArrayByteBase64((byte[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.util.Base64", e);
      }
  }
 @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.encodeBase64URLSafeString((byte[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
 @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.encodeBase64StringUnChunked((byte[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
 @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.encodeBase64String((byte[]) null, true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
 @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.encodeBase64String((byte[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
 @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Base64 base64_0 = new Base64(383);
      // Undeclared exception!
      try { 
        base64_0.encode((byte[]) null, 383, 81);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.decodeInteger((byte[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.decodeBase64((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.util.Base64", e);
      }
  }
 @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Base64 base64_0 = new Base64();
      // Undeclared exception!
      try { 
        base64_0.decode((byte[]) null, 1, 1297);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.util.Base64", e);
      }
  }
 @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Base64 base64_0 = new Base64(4);
      // Undeclared exception!
      try { 
        base64_0.decode((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.util.Base64", e);
      }
  }
 @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)81;
      Base64 base64_0 = null;
      try {
        base64_0 = new Base64((-1), byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // lineSeperator must not contain base64 characters: [\u0000Q\u0000\u0000\u0000\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.net.util.Base64", e);
      }
  }
 @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Base64 base64_0 = new Base64(true);
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = base64_0.encode(byteArray0);
      ;
}
 @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Base64 base64_0 = new Base64(true);
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = base64_0.encode(byteArray0);
      ;
}
 @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Base64 base64_0 = new Base64(0, (byte[]) null);
      base64_0.encode((byte[]) null);
      assertFalse(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, true, true, 73);
      ;
}
 @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, true, true, 73);
      ;
}
 @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Base64 base64_0 = new Base64(4);
      byte[] byteArray0 = base64_0.getLineSeparator();
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, false, false, 4);
      ;
}
 @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        Base64.encodeBase64(byteArray0, false, false, (int) (byte) (-43));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Input array too big, the output array would be bigger (4) than the specified maxium size of -43
         //
         verifyException("org.apache.commons.net.util.Base64", e);
      }
  }
 @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = Base64.decodeBase64(byteArray0);
      byte[] byteArray2 = Base64.encodeBase64(byteArray1, true, false, (-2059));
      ;
}
 @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64((byte[]) null, false, true, 14);
      ;
}
 @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = base64_0.decode(byteArray0);
      ;
}
 @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = base64_0.decode(byteArray0);
      ;
}
 @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      boolean boolean0 = Base64.isBase64((byte)61);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      boolean boolean0 = Base64.isBase64((byte)123);
      ;
}
 @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      boolean boolean0 = Base64.isBase64((byte)105);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      boolean boolean0 = Base64.isBase64((byte)0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      Base64 base64_0 = new Base64();
      base64_0.encode(byteArray0, (int) (byte)0, (int) (byte)1);
      base64_0.decode(byteArray0, (int) (byte)0, (-2161));
      assertTrue(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Base64 base64_0 = new Base64(493);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)101;
      // Undeclared exception!
      try { 
        base64_0.decode(byteArray0, 0, 1551);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.net.util.Base64", e);
      }
  }
 @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)124;
      Base64 base64_0 = new Base64((-41), byteArray0);
      // Undeclared exception!
      try { 
        base64_0.decode(byteArray0, 0, 766);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.net.util.Base64", e);
      }
  }
 @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Base64 base64_0 = new Base64(493);
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-41);
      // Undeclared exception!
      try { 
        base64_0.decode(byteArray0, 0, 1551);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.net.util.Base64", e);
      }
  }
 @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)61;
      Base64 base64_0 = new Base64();
      base64_0.decode(byteArray0, (int) (byte)0, (int) (byte)61);
      assertTrue(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Base64 base64_0 = new Base64(false);
      byte[] byteArray0 = new byte[1];
      base64_0.setInitialBuffer(byteArray0, 1, (short)1);
      // Undeclared exception!
      try { 
        base64_0.decode(byteArray0, (int) (byte)58, (int) (byte)58);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 58
         //
         verifyException("org.apache.commons.net.util.Base64", e);
      }
  }
 @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Base64 base64_0 = new Base64(6);
      byte[] byteArray0 = new byte[3];
      base64_0.encode(byteArray0, 58, (-1196));
      base64_0.decode(byteArray0, (int) (byte)0, 3);
      assertTrue(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      byte[] byteArray0 = new byte[36];
      Base64 base64_0 = new Base64(8, byteArray0, false);
      base64_0.encode(byteArray0, (int) (byte)0, 8);
      base64_0.decode(byteArray0, (int) (byte)0, (-1171));
      assertTrue(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Base64 base64_0 = new Base64(0, byteArray0, false);
      // Undeclared exception!
      try { 
        base64_0.encode(byteArray0, (int) (byte)0, 459);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = new byte[8];
      byteArray0[7] = (byte) (-104);
      // Undeclared exception!
      try { 
        base64_0.encode(byteArray0, (int) (byte)1, (int) (byte)115);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      Base64 base64_0 = new Base64(true);
      base64_0.encode(byteArray0, (int) (byte)0, (int) (byte)8);
      base64_0.encode(byteArray0, (int) (byte) (-78), (int) (byte) (-78));
      assertTrue(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Base64 base64_0 = new Base64();
      base64_0.encode(byteArray0, (int) (byte)1, (int) (byte)1);
      base64_0.encode(byteArray0, (int) (byte)0, (int) (byte) (-78));
      assertTrue(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      byte[] byteArray0 = new byte[36];
      Base64 base64_0 = new Base64();
      base64_0.encode(byteArray0, (int) (byte)0, 23);
      base64_0.encode(byteArray0, (int) (byte)0, (-108));
      assertTrue(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      byte[] byteArray0 = new byte[36];
      Base64 base64_0 = new Base64();
      byte[] byteArray1 = new byte[0];
      base64_0.setInitialBuffer(byteArray1, 3884, (byte)0);
      // Undeclared exception!
      try { 
        base64_0.encode(byteArray0, (int) (byte)0, (-108));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.util.Base64", e);
      }
  }
 @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base64 base64_0 = new Base64(0, byteArray0, true);
      boolean boolean0 = base64_0.isUrlSafe();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      Base64 base64_0 = new Base64();
      boolean boolean0 = base64_0.isUrlSafe();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      Base64 base64_0 = new Base64(0, byteArray0, false);
      byte[] byteArray1 = Base64.encodeBase64URLSafe(byteArray0);
      // Undeclared exception!
      try { 
        base64_0.decode(byteArray1, 0, 459);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 28
         //
         verifyException("org.apache.commons.net.util.Base64", e);
      }
  }
 @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      Base64 base64_0 = new Base64(75, (byte[]) null, true);
      ;
}
 @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
      ;
}
 @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
      ;
}
 @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.encodeInteger((BigInteger) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // encodeInteger called with null parameter
         //
         verifyException("org.apache.commons.net.util.Base64", e);
      }
  }
 @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = new byte[0];
      base64_0.encode(byteArray0);
      assertFalse(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test98()  throws Throwable  {
      Base64 base64_0 = new Base64(0);
      // Undeclared exception!
      try { 
        base64_0.encodeToString((byte[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
 @Test(timeout = 4000)
  public void test99()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)32;
      boolean boolean0 = Base64.isArrayByteBase64(byteArray0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)9;
      boolean boolean0 = Base64.isArrayByteBase64(byteArray0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64((byte[]) null, false);
      assertNotNull(byteArray0);
}
 @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      byte[] byteArray0 = Base64.decodeBase64("");
      byte[] byteArray1 = Base64.encodeBase64URLSafe(byteArray0);
      ;
}
 @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Base64 base64_0 = new Base64(false);
      base64_0.decode((byte[]) null);
      ;
}
 @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      boolean boolean0 = Base64.isBase64((byte) (-92));
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Base64 base64_0 = new Base64();
      byte[] byteArray1 = base64_0.encode(byteArray0);
      boolean boolean0 = Base64.isArrayByteBase64(byteArray1);
      ;
}
 @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Base64 base64_0 = new Base64();
      byte[] byteArray1 = base64_0.encode(byteArray0);
      boolean boolean0 = Base64.isArrayByteBase64(byteArray1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Base64 base64_0 = new Base64(false);
      byte[] byteArray0 = base64_0.decode("*GKrcDvL1Mf0Vj|VT/");
      ;
}
 @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      byte[] byteArray0 = Base64.decodeBase64("AAAAAAAAAAEAAAA=\r\n");
      ;
}
 @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      BigInteger bigInteger0 = BigInteger.ZERO;
      byte[] byteArray1 = Base64.encodeInteger(bigInteger0);
      Base64 base64_0 = new Base64(true);
      base64_0.setInitialBuffer(byteArray1, (byte)6, 0);
      // Undeclared exception!
      try { 
        base64_0.encode(byteArray0, (-1), 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      Base64 base64_0 = new Base64(true);
      base64_0.encode(byteArray0, (int) (byte)0, (int) (byte)1);
      base64_0.encode(byteArray0, (int) (byte) (-109), (int) (byte) (-109));
      assertTrue(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Base64 base64_0 = new Base64(true);
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = base64_0.encode(byteArray0);
      base64_0.encode(byteArray0, (int) (byte)3, 1366);
      ;
}
 @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Base64 base64_0 = new Base64(true);
      byte[] byteArray0 = new byte[9];
      base64_0.setInitialBuffer(byteArray0, (byte)89, 1346);
      assertTrue(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Base64 base64_0 = new Base64(14, (byte[]) null);
      base64_0.setInitialBuffer((byte[]) null, 685, (-1));
      assertTrue(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Base64 base64_0 = new Base64(false);
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = base64_0.encode(byteArray0);
      int int0 = base64_0.readResults(byteArray1, 0, (-476));
      ;
}
 @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Base64 base64_0 = new Base64(false);
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = base64_0.encode(byteArray0);
      int int0 = base64_0.readResults(byteArray1, 0, (-476));
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      Base64 base64_0 = new Base64(false);
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = base64_0.encode(byteArray0);
      int int0 = base64_0.readResults(byteArray1, 0, (-476));
      int int1 = base64_0.readResults((byte[]) null, 1540, (-1));
      ;
}
 @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = new byte[2];
      int int0 = base64_0.readResults(byteArray0, 1, (byte)1);
      assertFalse(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = new byte[2];
      int int0 = base64_0.readResults(byteArray0, 1, (byte)1);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base64 base64_0 = new Base64((-234), byteArray0, true);
      base64_0.encode(byteArray0, (-2549), (-2549));
      assertTrue(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      Base64 base64_0 = new Base64();
      int int0 = base64_0.avail();
      ;
}
 @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      Base64 base64_0 = new Base64();
      int int0 = base64_0.avail();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Base64 base64_0 = new Base64();
      byte[] byteArray1 = base64_0.encode(byteArray0);
      ;
}
 @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Base64 base64_0 = new Base64();
      byte[] byteArray1 = base64_0.encode(byteArray0);
      boolean boolean0 = base64_0.hasData();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      Base64 base64_0 = new Base64();
      boolean boolean0 = base64_0.hasData();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      Base64 base64_0 = new Base64();
      boolean boolean0 = base64_0.hasData();
      ;
}
 @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      byte[] byteArray0 = Base64.decodeBase64("X2*fK4");
      Base64 base64_0 = null;
      try {
        base64_0 = new Base64((-3998), byteArray0, false);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // lineSeperator must not contain base64 characters: [_g\uFFFD]
         //
         verifyException("org.apache.commons.net.util.Base64", e);
      }
  }
 @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      Base64 base64_0 = new Base64(6);
      byte[] byteArray0 = new byte[3];
      String string0 = base64_0.encodeToString(byteArray0);
      ;
}
 @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      Base64 base64_0 = new Base64(6);
      byte[] byteArray0 = new byte[3];
      String string0 = base64_0.encodeToString(byteArray0);
      int int0 = base64_0.avail();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      Base64 base64_0 = new Base64(6);
      byte[] byteArray0 = new byte[3];
      String string0 = base64_0.encodeToString(byteArray0);
      int int0 = base64_0.avail();
      assertTrue(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      String string0 = Base64.encodeBase64String(byteArray0, true);
      ;
}
 @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, true, true);
      String string0 = Base64.encodeBase64String(byteArray1);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base64 base64_0 = new Base64((-234), byteArray0, true);
      int int0 = base64_0.getLineLength();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base64 base64_0 = new Base64((-234), byteArray0, true);
      int int0 = base64_0.getLineLength();
      assertTrue(base64_0.isUrlSafe());
}
 @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      String string0 = Base64.encodeBase64StringUnChunked(byteArray0);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      String string0 = Base64.encodeBase64URLSafeString(byteArray0);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      byte[] byteArray0 = Base64.decodeBase64("5upLi");
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, false);
      ;
}
 @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      byte[] byteArray0 = Base64.decodeBase64("5upLi");
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, false);
      ;
}
}
