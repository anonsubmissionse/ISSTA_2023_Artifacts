/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 02:11:59 GMT 2022
 */

package org.apache.commons.collections4.keyvalue;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.apache.commons.collections4.KeyValue;
import org.apache.commons.collections4.keyvalue.DefaultMapEntry;
import org.apache.commons.collections4.keyvalue.TiedMapEntry;
import org.apache.commons.collections4.keyvalue.UnmodifiableMapEntry;
import org.apache.commons.collections4.map.SingletonMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultMapEntry_ESTest extends DefaultMapEntry_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TiedMapEntry<Integer, String> tiedMapEntry0 = new TiedMapEntry<Integer, String>((Map<Integer, String>) null, (Integer) null);
      DefaultMapEntry<Integer, Object> defaultMapEntry0 = null;
      try {
        defaultMapEntry0 = new DefaultMapEntry<Integer, Object>((KeyValue<? extends Integer, ?>) tiedMapEntry0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.keyvalue.TiedMapEntry", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultMapEntry<Object, Object> defaultMapEntry0 = null;
      try {
        defaultMapEntry0 = new DefaultMapEntry<Object, Object>((Map.Entry<?, ?>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.keyvalue.DefaultMapEntry", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SingletonMap<String, String> singletonMap0 = new SingletonMap<String, String>((String) null, "-3t^<pM,q+5/");
      DefaultMapEntry<String, Object> defaultMapEntry0 = new DefaultMapEntry<String, Object>(singletonMap0);
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer((-1101));
      DefaultMapEntry<String, Integer> defaultMapEntry0 = new DefaultMapEntry<String, Integer>("-3t^<pM,q+5/", integer0);
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SingletonMap<String, String> singletonMap0 = new SingletonMap<String, String>((String) null, "-3t^<pM,q+5/");
      UnmodifiableMapEntry<String, String> unmodifiableMapEntry0 = new UnmodifiableMapEntry<String, String>(singletonMap0);
      DefaultMapEntry<Object, Object> defaultMapEntry0 = new DefaultMapEntry<Object, Object>((Map.Entry<?, ?>) unmodifiableMapEntry0);
  }
}
