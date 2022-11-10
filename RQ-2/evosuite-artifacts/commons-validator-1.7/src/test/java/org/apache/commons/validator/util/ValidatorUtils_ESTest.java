/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:45:58 GMT 2022
 */

package org.apache.commons.validator.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import org.apache.commons.collections.FastHashMap;
import org.apache.commons.validator.Arg;
import org.apache.commons.validator.Msg;
import org.apache.commons.validator.Var;
import org.apache.commons.validator.util.ValidatorUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ValidatorUtils_ESTest extends ValidatorUtils_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ValidatorUtils.replace("", "", "");
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Var var0 = new Var("", "", "");
      var0.setResource(true);
      hashMap0.put("", "");
      hashMap0.put("", var0);
      Msg msg0 = new Msg();
      msg0.setName((String) null);
      hashMap0.put("", msg0);
      FastHashMap fastHashMap0 = new FastHashMap(hashMap0);
      FastHashMap fastHashMap1 = ValidatorUtils.copyFastHashMap(fastHashMap0);
      ValidatorUtils.copyFastHashMap(fastHashMap0);
      Object object0 = new Object();
      ValidatorUtils validatorUtils0 = new ValidatorUtils();
      BiFunction<ValidatorUtils, ValidatorUtils, Var> biFunction0 = (BiFunction<ValidatorUtils, ValidatorUtils, Var>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      fastHashMap1.merge(object0, validatorUtils0, biFunction0);
      ValidatorUtils.copyMap(fastHashMap0);
      FastHashMap fastHashMap2 = ValidatorUtils.copyFastHashMap(fastHashMap1);
      ValidatorUtils.copyMap(fastHashMap2);
      Object object1 = new Object();
      ValidatorUtils.getValueAsString(object1, "");
      ValidatorUtils validatorUtils1 = new ValidatorUtils();
      ValidatorUtils.replace("}#", (String) null, "_ %:");
      // Undeclared exception!
      try { 
        ValidatorUtils.getValueAsString("", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // No name specified for bean class 'class java.lang.String'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FastHashMap fastHashMap0 = new FastHashMap();
      FastHashMap fastHashMap1 = ValidatorUtils.copyFastHashMap(fastHashMap0);
      FastHashMap fastHashMap2 = ValidatorUtils.copyFastHashMap(fastHashMap1);
      Var var0 = new Var();
      var0.setJsType("");
      var0.setBundle("        USING CONVERTER ");
      fastHashMap2.put("        USING CONVERTER ", var0);
      fastHashMap2.putIfAbsent(fastHashMap1, fastHashMap0);
      ValidatorUtils.copyMap(fastHashMap2);
      ValidatorUtils.copyMap(fastHashMap2);
      ValidatorUtils.replace("", "", "");
      ValidatorUtils.replace("        USING CONVERTER ", "G5[06='gh3", "");
      ValidatorUtils.copyFastHashMap(fastHashMap2);
      ValidatorUtils validatorUtils0 = new ValidatorUtils();
      ValidatorUtils.copyFastHashMap(fastHashMap0);
      ValidatorUtils.copyFastHashMap(fastHashMap1);
      ValidatorUtils.copyMap(fastHashMap0);
      ValidatorUtils.getValueAsString(var0, "        USING CONVERTER ");
      ValidatorUtils.copyFastHashMap(fastHashMap2);
      ValidatorUtils.replace("", (String) null, "");
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ValidatorUtils validatorUtils0 = new ValidatorUtils();
      FastHashMap fastHashMap0 = new FastHashMap(2);
      Msg msg0 = new Msg();
      Object object0 = new Object();
      Msg msg1 = new Msg();
      fastHashMap0.put((Object) null, msg1);
      msg0.toString();
      fastHashMap0.put(object0, (Object) null);
      fastHashMap0.put(msg0, msg0);
      // Undeclared exception!
      try { 
        ValidatorUtils.copyFastHashMap(fastHashMap0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.validator.util.ValidatorUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = "~9N4C+V[9=5T&PtVF";
      String string1 = "ih@^Gpv$zmU";
      ValidatorUtils.replace("~9N4C+V[9=5T&PtVF", "ih@^Gpv$zmU", "ih@^Gpv$zmU");
      ValidatorUtils.getValueAsString("ih@^Gpv$zmU", "\n");
      ValidatorUtils validatorUtils0 = new ValidatorUtils();
      FastHashMap fastHashMap0 = new FastHashMap();
      Arg arg0 = new Arg();
      arg0.toString();
      fastHashMap0.put("\n", arg0);
      FastHashMap fastHashMap1 = ValidatorUtils.copyFastHashMap(fastHashMap0);
      Map<String, Object> map0 = ValidatorUtils.copyMap(fastHashMap1);
      ValidatorUtils.copyMap(map0);
      ValidatorUtils.copyMap(fastHashMap0);
      String string2 = "W?pUTwW|q";
      // Undeclared exception!
      try { 
        ValidatorUtils.getValueAsString((Object) null, "W?pUTwW|q");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // No bean specified
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ValidatorUtils.replace("", "", "");
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.values();
      hashMap0.put("", "");
      Arg arg0 = new Arg();
      hashMap0.put("\u0004oO", arg0);
      ValidatorUtils.copyMap(hashMap0);
      ValidatorUtils.getValueAsString("\u0004oO", "");
      Arg arg1 = new Arg();
      arg1.setName("\u0004oO");
      ValidatorUtils.getValueAsString(arg1, "");
      ValidatorUtils validatorUtils0 = new ValidatorUtils();
      ValidatorUtils.replace((String) null, "E+>i3u:r2/c@S]}\"", "");
      ValidatorUtils.getValueAsString(validatorUtils0, "");
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ValidatorUtils.replace("", "", "|L4vH1");
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Var var0 = new Var("", "[<", "'");
      hashMap0.put("Warning - null logger in constructor; possible log4j misconfiguration.", var0);
      hashMap0.put("'", "'");
      ValidatorUtils.copyMap(hashMap0);
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ValidatorUtils validatorUtils0 = new ValidatorUtils();
      // Undeclared exception!
      try { 
        ValidatorUtils.copyFastHashMap((FastHashMap) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.util.ValidatorUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = new Object();
      Object object1 = new Object();
      hashMap0.put(",/9DZmICs'#K`eSc", object1);
      hashMap0.put(",/9DZmICs'#K`eSc", object0);
      ValidatorUtils.copyMap(hashMap0);
      Object object2 = new Object();
      String string0 = ValidatorUtils.getValueAsString(object2, ",/9DZmICs'#K`eSc");
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ValidatorUtils.replace("Nested property names are not allowed: Property '", "Nested property names are not allowed: Property '", "Nested property names are not allowed: Property '");
      String string0 = "";
      ValidatorUtils.getValueAsString("Nested property names are not allowed: Property '", "");
      // Undeclared exception!
      try { 
        ValidatorUtils.copyMap((Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.util.ValidatorUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      FastHashMap fastHashMap0 = new FastHashMap();
      FastHashMap fastHashMap1 = new FastHashMap(fastHashMap0);
      BiConsumer<Var, Arg> biConsumer0 = (BiConsumer<Var, Arg>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      fastHashMap0.forEach(biConsumer0);
      fastHashMap0.put(fastHashMap1, fastHashMap1);
      fastHashMap1.setFast(true);
      fastHashMap1.put(fastHashMap0, fastHashMap0);
      // Undeclared exception!
      try { 
        ValidatorUtils.copyFastHashMap(fastHashMap1);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
         //
         // org.apache.commons.collections.FastHashMap cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.validator.util.ValidatorUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ValidatorUtils validatorUtils0 = new ValidatorUtils();
      String string0 = "";
      ValidatorUtils.replace("", "", "");
      String string1 = "tY";
      String string2 = null;
      ValidatorUtils.replace("tY", "tY", (String) null);
      ValidatorUtils.replace("", "", "");
      FastHashMap fastHashMap0 = new FastHashMap(1531, 1531);
      Msg msg0 = new Msg();
      Var var0 = new Var();
      var0.setResource(true);
      fastHashMap0.put(msg0, var0);
      // Undeclared exception!
      try { 
        ValidatorUtils.copyMap(fastHashMap0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
         //
         // org.apache.commons.validator.Msg cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.validator.util.ValidatorUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = ValidatorUtils.replace("", "org.apache.commons.validator.util.ValidatorUtils", "org.apache.commons.validator.util.ValidatorUtils");
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = ValidatorUtils.replace("", "", "ic,lf$>");
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ValidatorUtils validatorUtils0 = new ValidatorUtils();
      FastHashMap fastHashMap0 = new FastHashMap();
      Map<String, Object> map0 = ValidatorUtils.copyMap(fastHashMap0);
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FastHashMap fastHashMap0 = new FastHashMap(849);
      FastHashMap fastHashMap1 = ValidatorUtils.copyFastHashMap(fastHashMap0);
      assertTrue(fastHashMap1.getFast());
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        ValidatorUtils.getValueAsString((Object) null, ":{7xcWCT!_");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // No bean specified
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FastHashMap fastHashMap0 = new FastHashMap();
      Map<String, Object> map0 = ValidatorUtils.copyMap(fastHashMap0);
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ValidatorUtils.replace((String) null, (String) null, "");
      ValidatorUtils validatorUtils0 = new ValidatorUtils();
      Arg arg0 = new Arg();
      // Undeclared exception!
      try { 
        ValidatorUtils.getValueAsString(arg0, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // No name specified for bean class 'class org.apache.commons.validator.Arg'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FastHashMap fastHashMap0 = new FastHashMap();
      FastHashMap fastHashMap1 = ValidatorUtils.copyFastHashMap(fastHashMap0);
      FastHashMap fastHashMap2 = ValidatorUtils.copyFastHashMap(fastHashMap1);
      Var var0 = new Var("        USING CONVERTER ", "        USING CONVERTER ", "        USING CONVERTER ");
      var0.setJsType("yO");
      var0.setBundle("        USING CONVERTER ");
      fastHashMap2.put("        USING CONVERTER ", var0);
      fastHashMap2.putIfAbsent(fastHashMap1, fastHashMap0);
      Map<String, Object> map0 = ValidatorUtils.copyMap(fastHashMap2);
      Map<String, Object> map1 = ValidatorUtils.copyMap(fastHashMap2);
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FastHashMap fastHashMap0 = new FastHashMap();
      FastHashMap fastHashMap1 = ValidatorUtils.copyFastHashMap(fastHashMap0);
      FastHashMap fastHashMap2 = ValidatorUtils.copyFastHashMap(fastHashMap1);
      Var var0 = new Var("        USING CONVERTER ", "        USING CONVERTER ", "        USING CONVERTER ");
      var0.setJsType("yO");
      var0.setBundle("        USING CONVERTER ");
      fastHashMap2.put("        USING CONVERTER ", var0);
      fastHashMap2.putIfAbsent(fastHashMap1, fastHashMap0);
      Map<String, Object> map0 = ValidatorUtils.copyMap(fastHashMap2);
      Map<String, Object> map1 = ValidatorUtils.copyMap(fastHashMap2);
      ;
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FastHashMap fastHashMap0 = new FastHashMap();
      FastHashMap fastHashMap1 = ValidatorUtils.copyFastHashMap(fastHashMap0);
      FastHashMap fastHashMap2 = ValidatorUtils.copyFastHashMap(fastHashMap1);
      Var var0 = new Var("        USING CONVERTER ", "        USING CONVERTER ", "        USING CONVERTER ");
      var0.setJsType("yO");
      var0.setBundle("        USING CONVERTER ");
      fastHashMap2.put("        USING CONVERTER ", var0);
      fastHashMap2.putIfAbsent(fastHashMap1, fastHashMap0);
      Map<String, Object> map0 = ValidatorUtils.copyMap(fastHashMap2);
      Map<String, Object> map1 = ValidatorUtils.copyMap(fastHashMap2);
      ValidatorUtils.replace("", "", "");
      String string0 = ValidatorUtils.replace("        USING CONVERTER ", "yO", "");
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FastHashMap fastHashMap0 = new FastHashMap();
      FastHashMap fastHashMap1 = ValidatorUtils.copyFastHashMap(fastHashMap0);
      FastHashMap fastHashMap2 = ValidatorUtils.copyFastHashMap(fastHashMap1);
      Var var0 = new Var("        USING CONVERTER ", "        USING CONVERTER ", "        USING CONVERTER ");
      var0.setJsType("yO");
      var0.setBundle("        USING CONVERTER ");
      fastHashMap2.put("        USING CONVERTER ", var0);
      fastHashMap2.putIfAbsent(fastHashMap1, fastHashMap0);
      Map<String, Object> map0 = ValidatorUtils.copyMap(fastHashMap2);
      Map<String, Object> map1 = ValidatorUtils.copyMap(fastHashMap2);
      ValidatorUtils.replace("", "", "");
      String string0 = ValidatorUtils.replace("        USING CONVERTER ", "yO", "");
      FastHashMap fastHashMap3 = ValidatorUtils.copyFastHashMap(fastHashMap2);
      ValidatorUtils validatorUtils0 = new ValidatorUtils();
      ValidatorUtils.copyFastHashMap(fastHashMap0);
      ValidatorUtils.copyFastHashMap(fastHashMap1);
      ValidatorUtils.copyMap(fastHashMap0);
      ValidatorUtils.getValueAsString(var0, "        USING CONVERTER ");
      FastHashMap fastHashMap4 = ValidatorUtils.copyFastHashMap(fastHashMap2);
      ;
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FastHashMap fastHashMap0 = new FastHashMap();
      FastHashMap fastHashMap1 = ValidatorUtils.copyFastHashMap(fastHashMap0);
      FastHashMap fastHashMap2 = ValidatorUtils.copyFastHashMap(fastHashMap1);
      Var var0 = new Var("        USING CONVERTER ", "        USING CONVERTER ", "        USING CONVERTER ");
      var0.setJsType("yO");
      var0.setBundle("        USING CONVERTER ");
      fastHashMap2.put("        USING CONVERTER ", var0);
      fastHashMap2.putIfAbsent(fastHashMap1, fastHashMap0);
      Map<String, Object> map0 = ValidatorUtils.copyMap(fastHashMap2);
      Map<String, Object> map1 = ValidatorUtils.copyMap(fastHashMap2);
      ValidatorUtils.replace("", "", "");
      String string0 = ValidatorUtils.replace("        USING CONVERTER ", "yO", "");
      FastHashMap fastHashMap3 = ValidatorUtils.copyFastHashMap(fastHashMap2);
      ValidatorUtils validatorUtils0 = new ValidatorUtils();
      ValidatorUtils.copyFastHashMap(fastHashMap0);
      ValidatorUtils.copyFastHashMap(fastHashMap1);
      ValidatorUtils.copyMap(fastHashMap0);
      ValidatorUtils.getValueAsString(var0, "        USING CONVERTER ");
      FastHashMap fastHashMap4 = ValidatorUtils.copyFastHashMap(fastHashMap2);
      ;
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = "~9N4C+V[9=5T&PtVF";
      String string1 = "ih@^Gpv$zmU";
      ValidatorUtils.replace("~9N4C+V[9=5T&PtVF", "ih@^Gpv$zmU", "ih@^Gpv$zmU");
      ValidatorUtils validatorUtils0 = new ValidatorUtils();
      FastHashMap fastHashMap0 = new FastHashMap();
      Arg arg0 = new Arg();
      arg0.toString();
      fastHashMap0.put("\n", arg0);
      FastHashMap fastHashMap1 = ValidatorUtils.copyFastHashMap(fastHashMap0);
      Map<String, Object> map0 = ValidatorUtils.copyMap(fastHashMap1);
      ValidatorUtils.copyMap(map0);
      ValidatorUtils.copyMap(fastHashMap0);
      String string2 = "W?pUTwW|q";
      // Undeclared exception!
      try { 
        ValidatorUtils.getValueAsString((Object) null, "W?pUTwW|q");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // No bean specified
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = ValidatorUtils.replace("5HP", "5HP", "5HP");
      String string1 = ValidatorUtils.replace("", "", (String) null);
      ;
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object object0 = new Object();
      String string0 = ValidatorUtils.getValueAsString(object0, "RWh`O\"");
      ;
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ValidatorUtils.replace("#o", (String) null, "Index: ");
      FastHashMap fastHashMap0 = new FastHashMap();
      fastHashMap0.put("Index: ", (Object) null);
      FastHashMap fastHashMap1 = new FastHashMap(fastHashMap0);
      fastHashMap1.clone();
      ValidatorUtils.copyFastHashMap(fastHashMap1);
      Object object0 = new Object();
      Arg arg0 = new Arg();
      arg0.setResource(true);
      fastHashMap1.put("#o", arg0);
      fastHashMap0.put(object0, (Object) null);
      ValidatorUtils.getValueAsString(fastHashMap1, "#o");
      // Undeclared exception!
      try { 
        ValidatorUtils.copyMap(fastHashMap0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.validator.util.ValidatorUtils", e);
      }
  }
}
