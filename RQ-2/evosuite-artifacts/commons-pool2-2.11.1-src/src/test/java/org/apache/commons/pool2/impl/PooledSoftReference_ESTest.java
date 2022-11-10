/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 19:09:06 GMT 2022
 */

package org.apache.commons.pool2.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayDeque;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectState;
import org.apache.commons.pool2.impl.PooledSoftReference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PooledSoftReference_ESTest extends PooledSoftReference_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<String> softReference0 = new SoftReference<String>("%B_f|3i~", referenceQueue0);
      PooledSoftReference<String> pooledSoftReference0 = new PooledSoftReference<String>(softReference0);
      softReference0.enqueue();
      softReference0.get();
      softReference0.get();
      SoftReference<String> softReference1 = pooledSoftReference0.getReference();
      softReference1.clear();
      PooledSoftReference<String> pooledSoftReference1 = new PooledSoftReference<String>(softReference1);
      pooledSoftReference1.getObject();
      SoftReference<Object> softReference2 = new SoftReference<Object>(softReference1);
      ArrayDeque<PooledObject<String>> arrayDeque0 = new ArrayDeque<PooledObject<String>>();
      referenceQueue0.remove();
      pooledSoftReference0.endEvictionTest(arrayDeque0);
      PooledSoftReference<Object> pooledSoftReference2 = new PooledSoftReference<Object>(softReference2);
      referenceQueue0.remove(1921L);
      pooledSoftReference2.toString();
      pooledSoftReference2.toString();
      softReference2.clear();
      pooledSoftReference2.getLastBorrowTime();
      pooledSoftReference2.getObject();
      pooledSoftReference0.setReference(softReference0);
      // Undeclared exception!
      try { 
        pooledSoftReference2.toString();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PooledSoftReference<String> pooledSoftReference0 = new PooledSoftReference<String>((SoftReference<String>) null);
      pooledSoftReference0.setLogAbandoned(true);
      // Undeclared exception!
      try { 
        pooledSoftReference0.toString();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.pool2.impl.PooledSoftReference", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ReferenceQueue<String> referenceQueue0 = new ReferenceQueue<String>();
      SoftReference<String> softReference0 = new SoftReference<String>("", referenceQueue0);
      PooledSoftReference<String> pooledSoftReference0 = new PooledSoftReference<String>(softReference0);
      pooledSoftReference0.setLogAbandoned(true);
      softReference0.enqueue();
      softReference0.clear();
      softReference0.clear();
      softReference0.get();
      pooledSoftReference0.deallocate();
      SoftReference<String> softReference1 = pooledSoftReference0.getReference();
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PooledSoftReference<Integer> pooledSoftReference0 = new PooledSoftReference<Integer>((SoftReference<Integer>) null);
      pooledSoftReference0.getLastUsedInstant();
      pooledSoftReference0.getCreateTime();
      pooledSoftReference0.getIdleDuration();
      pooledSoftReference0.getLastUsedTime();
      // Undeclared exception!
      try { 
        pooledSoftReference0.getObject();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.pool2.impl.PooledSoftReference", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SoftReference<Object> softReference0 = new SoftReference<Object>("Object: ");
      PooledSoftReference<Object> pooledSoftReference0 = new PooledSoftReference<Object>(softReference0);
      String string0 = pooledSoftReference0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SoftReference<String> softReference0 = new SoftReference<String>("");
      softReference0.enqueue();
      PooledSoftReference<String> pooledSoftReference0 = new PooledSoftReference<String>(softReference0);
      pooledSoftReference0.toString();
      Integer integer0 = new Integer(2468);
      SoftReference<Integer> softReference1 = new SoftReference<Integer>(integer0);
      pooledSoftReference0.allocate();
      softReference1.get();
      softReference1.get();
      softReference0.enqueue();
      softReference1.get();
      softReference1.get();
      softReference1.get();
      pooledSoftReference0.toString();
      softReference0.enqueue();
      PooledSoftReference<Integer> pooledSoftReference1 = new PooledSoftReference<Integer>(softReference1);
      pooledSoftReference1.toString();
      pooledSoftReference0.setReference(softReference0);
      pooledSoftReference0.setReference(softReference0);
      pooledSoftReference0.setReference(softReference0);
      SoftReference<Object> softReference2 = new SoftReference<Object>(softReference1);
      PooledSoftReference<Object> pooledSoftReference2 = new PooledSoftReference<Object>(softReference2);
      softReference2.get();
      pooledSoftReference2.toString();
      pooledSoftReference2.setReference(softReference2);
      pooledSoftReference0.toString();
      pooledSoftReference2.toString();
      pooledSoftReference1.toString();
      pooledSoftReference2.getReference();
      pooledSoftReference2.setReference(softReference2);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PooledSoftReference<Object> pooledSoftReference0 = new PooledSoftReference<Object>((SoftReference<Object>) null);
      pooledSoftReference0.setReference((SoftReference<Object>) null);
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<String> softReference0 = new SoftReference<String>("", referenceQueue0);
      PooledSoftReference<String> pooledSoftReference1 = new PooledSoftReference<String>(softReference0);
      String string0 = pooledSoftReference1.toString();
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Integer integer0 = new Integer(0);
      SoftReference<Integer> softReference0 = new SoftReference<Integer>(integer0, (ReferenceQueue<? super Integer>) null);
      PooledSoftReference<Integer> pooledSoftReference0 = new PooledSoftReference<Integer>(softReference0);
      Integer integer1 = pooledSoftReference0.getObject();
      ;
}
}
