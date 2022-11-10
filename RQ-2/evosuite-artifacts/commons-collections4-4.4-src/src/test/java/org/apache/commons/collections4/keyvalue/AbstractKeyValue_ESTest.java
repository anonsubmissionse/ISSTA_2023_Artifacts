/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 02:15:59 GMT 2022
 */

package org.apache.commons.collections4.keyvalue;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.collections4.keyvalue.DefaultKeyValue;
import org.apache.commons.collections4.keyvalue.DefaultMapEntry;
import org.apache.commons.collections4.keyvalue.UnmodifiableMapEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractKeyValue_ESTest extends AbstractKeyValue_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultKeyValue<Object, String> defaultKeyValue0 = new DefaultKeyValue<Object, String>();
      String string0 = defaultKeyValue0.setValue("l(S@N<X dNx1");
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultKeyValue<String, Object> defaultKeyValue0 = new DefaultKeyValue<String, Object>("DefaultKeyValue may not contain itself as a value.", "DefaultKeyValue may not contain itself as a value.");
      Object object0 = defaultKeyValue0.setValue("");
      assertNotNull(object0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer((-3526));
      DefaultMapEntry<Integer, String> defaultMapEntry0 = new DefaultMapEntry<Integer, String>(integer0, "");
      Integer integer1 = defaultMapEntry0.setKey(integer0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultMapEntry<Object, Object> defaultMapEntry0 = new DefaultMapEntry<Object, Object>((Object) null, (Object) null);
      Object object0 = defaultMapEntry0.getValue();
      assertNotNull(object0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = new Integer(2750);
      DefaultKeyValue<Integer, String> defaultKeyValue0 = new DefaultKeyValue<Integer, String>(integer0, "#DGw}]!|/");
      String string0 = defaultKeyValue0.getValue();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultKeyValue<String, Object> defaultKeyValue0 = new DefaultKeyValue<String, Object>("DefaultKeyValue may not contain itself as a value.", "DefaultKeyValue may not contain itself as a value.");
      String string0 = defaultKeyValue0.getKey();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Integer integer0 = new Integer((-766));
      UnmodifiableMapEntry<Integer, Integer> unmodifiableMapEntry0 = new UnmodifiableMapEntry<Integer, Integer>(integer0, integer0);
      // Undeclared exception!
      try { 
        unmodifiableMapEntry0.setValue(integer0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
         //
         // setValue() is not supported
         //
         verifyException("org.apache.commons.collections4.keyvalue.UnmodifiableMapEntry", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DefaultKeyValue<String, Object> defaultKeyValue0 = new DefaultKeyValue<String, Object>();
      DefaultMapEntry<Object, Object> defaultMapEntry0 = new DefaultMapEntry<Object, Object>((Object) null, "{}");
      defaultMapEntry0.setValue(defaultKeyValue0);
      Object object0 = defaultMapEntry0.getValue();
      // Undeclared exception!
      try { 
        defaultKeyValue0.setValue(object0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // DefaultKeyValue may not contain itself as a value.
         //
         verifyException("org.apache.commons.collections4.keyvalue.DefaultKeyValue", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DefaultKeyValue<Object, Object> defaultKeyValue0 = new DefaultKeyValue<Object, Object>();
      Object object0 = defaultKeyValue0.getKey();
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DefaultKeyValue<String, Object> defaultKeyValue0 = new DefaultKeyValue<String, Object>();
      String string0 = defaultKeyValue0.setKey("null=.jCAn\"9x:-");
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultKeyValue<String, Object> defaultKeyValue0 = new DefaultKeyValue<String, Object>();
      String string0 = defaultKeyValue0.toString();
      ;
}
}
