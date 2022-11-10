/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 06 17:04:58 GMT 2022
 */

package spark.utils.urldecoding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.utils.urldecoding.TypeUtil;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeUtil_ESTest extends TypeUtil_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = TypeUtil.toHexString((byte)25);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = TypeUtil.toHexString((byte) (-97));
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = TypeUtil.convertHexDigit('?');
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte) (-23);
      String string0 = TypeUtil.toString(byteArray0, (int) (byte)60);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[8] = (byte)65;
      String string0 = TypeUtil.toString(byteArray0, 14);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-61);
      String string0 = TypeUtil.toString(byteArray0, 10);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      try { 
        TypeUtil.parseInt("java.lang.Short", 1, 1, 0);
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
         //
         // a
         //
         verifyException("spark.utils.urldecoding.TypeUtil", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int int0 = TypeUtil.parseInt("", 65, (-1), (-337));
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = TypeUtil.toString(byteArray0, (-805));
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      String string0 = TypeUtil.toHexString(byteArray0, 1593, (int) (byte) (-127));
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = TypeUtil.parseInt("04000000000000000000", 0, (byte) (-9), 622);
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = TypeUtil.convertHexDigit(25);
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = TypeUtil.convertHexDigit(';');
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtil.toString((byte[]) null, (int) (byte) (-75));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.utils.urldecoding.TypeUtil", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        TypeUtil.toString(byteArray0, (int) (byte)0);
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("spark.utils.urldecoding.TypeUtil", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtil.toHexString((byte[]) null, 2677, 175);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.utils.urldecoding.TypeUtil", e);
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      try { 
        TypeUtil.parseInt("00", 0, (-1438), 0);
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
         //
         // 00
         //
         verifyException("spark.utils.urldecoding.TypeUtil", e);
      }
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtil.parseInt((String) null, 0, 2756, 2756);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.utils.urldecoding.TypeUtil", e);
      }
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-70);
      // Undeclared exception!
      try { 
        TypeUtil.toHexString(byteArray0, (int) (byte)0, 789);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("spark.utils.urldecoding.TypeUtil", e);
      }
  }
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = TypeUtil.toHexString(byteArray0, (int) (byte)0, 1);
      ;
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = TypeUtil.convertHexDigit(16);
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = TypeUtil.toHexString((byte) (-1));
      ;
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtil.convertHexDigit(1547536);
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
         //
         // !hex 1547536
         //
         verifyException("spark.utils.urldecoding.TypeUtil", e);
      }
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtil.convertHexDigit((-988807168));
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
         //
         // !hex -988807168
         //
         verifyException("spark.utils.urldecoding.TypeUtil", e);
      }
  }
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtil.convertHexDigit('');
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
         //
         // !hex 
         //
         verifyException("spark.utils.urldecoding.TypeUtil", e);
      }
  }
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = TypeUtil.convertHexDigit('0');
      ;
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtil.convertHexDigit('\u0000');
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
         //
         // !hex \u0000
         //
         verifyException("spark.utils.urldecoding.TypeUtil", e);
      }
  }
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-3);
      String string0 = TypeUtil.toString(byteArray0, 18);
      ;
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtil.parseInt("00", (byte)0, (byte)50, (byte)0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = TypeUtil.parseInt("Ff", 0, (byte) (-1), 659);
      ;
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = TypeUtil.parseInt("", 0, 0, 1);
      ;
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TypeUtil typeUtil0 = new TypeUtil();
  }
}
