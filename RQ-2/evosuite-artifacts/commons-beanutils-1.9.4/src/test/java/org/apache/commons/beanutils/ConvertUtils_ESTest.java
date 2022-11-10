/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 18:23:44 GMT 2022
 */

package org.apache.commons.beanutils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.converters.FileConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConvertUtils_ESTest extends ConvertUtils_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConvertUtils.setDefaultShort((short) (-397));
      short short0 = ConvertUtils.getDefaultShort();
      assertNotNull(short0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      ConvertUtils.getDefaultShort();
      ConvertUtils.getDefaultBoolean();
      ConvertUtils convertUtils0 = new ConvertUtils();
      ConvertUtils.getDefaultCharacter();
      Class<String> class1 = String.class;
      ConvertUtils.setDefaultDouble((short)0);
      ConvertUtils.lookup(class1, class1);
      ConvertUtils.setDefaultShort((short)0);
      Class<Float> class2 = ConvertUtils.primitiveToWrapper(class0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Object> class1 = Object.class;
      ConvertUtils.lookup(class0, class1);
      Object object0 = ConvertUtils.convert((Object) null, class1);
      assertNotNull(object0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = ConvertUtils.convert((Object) null);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      // Undeclared exception!
      try { 
        ConvertUtils.lookup(class0, (Class<?>) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Target type is missing
         //
         verifyException("org.apache.commons.beanutils.ConvertUtilsBean", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        ConvertUtils.convert((String[]) null, class0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.beanutils.ConvertUtilsBean", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Byte byte0 = new Byte((byte)1);
      // Undeclared exception!
      try { 
        ConvertUtils.convert((Object) byte0, (Class<?>) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Target type is missing
         //
         verifyException("org.apache.commons.beanutils.ConvertUtilsBean", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      Class<Character> class1 = ConvertUtils.primitiveToWrapper(class0);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Short> class1 = ConvertUtils.primitiveToWrapper(class0);
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Long> class1 = ConvertUtils.primitiveToWrapper(class0);
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Long> class0 = Long.class;
      Class<Long> class1 = ConvertUtils.primitiveToWrapper(class0);
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Class<Byte> class1 = ConvertUtils.primitiveToWrapper(class0);
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      ConvertUtils.convert("", class0);
      Object object0 = new Object();
      ConvertUtils.primitiveToWrapper(class0);
      ConvertUtils.primitiveToWrapper((Class<String>) null);
      Boolean boolean0 = Boolean.valueOf("");
      ConvertUtils.convert((Object) boolean0);
      Byte byte0 = new Byte((byte)1);
      // Undeclared exception!
      try { 
        ConvertUtils.convert((Object) byte0, (Class<?>) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Target type is missing
         //
         verifyException("org.apache.commons.beanutils.ConvertUtilsBean", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      Class<Boolean> class1 = ConvertUtils.primitiveToWrapper(class0);
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Double> class1 = ConvertUtils.primitiveToWrapper(class0);
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Integer> class1 = ConvertUtils.primitiveToWrapper(class0);
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConvertUtils.setDefaultInteger((byte)60);
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Converter converter0 = ConvertUtils.lookup(class0);
      assertNotNull(converter0);
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConvertUtils.getDefaultByte();
      ConvertUtils.getDefaultCharacter();
      Class<Object> class0 = Object.class;
      ConvertUtils.convert((Object) null, class0);
      FileConverter fileConverter0 = new FileConverter((Object) null);
      fileConverter0.toString();
      fileConverter0.toString();
      Class<String> class1 = String.class;
      ConvertUtils.register(fileConverter0, class1);
      ConvertUtils.setDefaultShort((byte)9);
      ConvertUtils.getDefaultByte();
      ConvertUtils.getDefaultCharacter();
      ConvertUtils.setDefaultBoolean(false);
      ConvertUtils.getDefaultBoolean();
      ConvertUtils.convert("org.apache.commons.beanutils.ConvertUtils", class0);
      ConvertUtils.getDefaultInteger();
      Object object0 = ConvertUtils.convert("", class0);
      assertNotNull(object0);
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Float float0 = new Float(0.0F);
      Class<Long> class0 = Long.TYPE;
      Object object0 = ConvertUtils.convert((Object) float0, (Class<?>) class0);
      assertEquals(0, object0);
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<String> class0 = String.class;
      ConvertUtils.deregister(class0);
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double double0 = ConvertUtils.getDefaultDouble();
      ;
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Long> class0 = Long.class;
      Object object0 = ConvertUtils.convert("7le,W$qK-mE0~Nv", class0);
      assertEquals(1, object0);
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ConvertUtils.setDefaultFloat((-1.0F));
  }
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ConvertUtils.setDefaultLong(0L);
  }
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[5];
      Class<Short> class0 = Short.TYPE;
      Object object0 = ConvertUtils.convert(stringArray0, class0);
      ;
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ConvertUtils.deregister();
  }
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      long long0 = ConvertUtils.getDefaultLong();
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ConvertUtils.setDefaultCharacter('I');
  }
}
