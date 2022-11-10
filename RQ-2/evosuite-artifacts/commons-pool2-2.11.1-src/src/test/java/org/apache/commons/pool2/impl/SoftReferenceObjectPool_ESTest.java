/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 19:03:35 GMT 2022
 */

package org.apache.commons.pool2.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.ref.SoftReference;
import java.util.NoSuchElementException;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.apache.commons.pool2.impl.PooledSoftReference;
import org.apache.commons.pool2.impl.SoftReferenceObjectPool;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SoftReferenceObjectPool_ESTest extends SoftReferenceObjectPool_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PooledObjectFactory<String> pooledObjectFactory0 = (PooledObjectFactory<String>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn("").when(pooledObjectFactory0).toString();
      SoftReferenceObjectPool<String> softReferenceObjectPool0 = new SoftReferenceObjectPool<String>(pooledObjectFactory0);
      StringBuilder stringBuilder0 = new StringBuilder(0);
      softReferenceObjectPool0.toStringAppendFields(stringBuilder0);
      assertTrue(softReferenceObjectPool0.isClosed());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)113;
      byteArray0[3] = (byte)1;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      Integer integer0 = new Integer(5433);
      DefaultPooledObject<Integer> defaultPooledObject0 = new DefaultPooledObject<Integer>(integer0);
      boolean boolean0 = false;
      PooledObjectFactory<Integer> pooledObjectFactory0 = (PooledObjectFactory<Integer>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn(defaultPooledObject0, (PooledObject) null).when(pooledObjectFactory0).makeObject();
      doReturn(true).when(pooledObjectFactory0).validateObject(nullable(org.apache.commons.pool2.PooledObject.class));
      SoftReferenceObjectPool<Integer> softReferenceObjectPool0 = new SoftReferenceObjectPool<Integer>(pooledObjectFactory0);
      try { 
        softReferenceObjectPool0.addObjects(5240);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.pool2.impl.SoftReferenceObjectPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer(0);
      DefaultPooledObject<Integer> defaultPooledObject0 = new DefaultPooledObject<Integer>(integer0);
      PooledObjectFactory<Integer> pooledObjectFactory0 = (PooledObjectFactory<Integer>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn(defaultPooledObject0).when(pooledObjectFactory0).makeObject();
      doReturn(true).when(pooledObjectFactory0).validateObject(nullable(org.apache.commons.pool2.PooledObject.class));
      SoftReferenceObjectPool<Integer> softReferenceObjectPool0 = new SoftReferenceObjectPool<Integer>(pooledObjectFactory0);
      softReferenceObjectPool0.addObject();
      int int0 = softReferenceObjectPool0.getNumIdle();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer(1);
      DefaultPooledObject<Integer> defaultPooledObject0 = new DefaultPooledObject<Integer>(integer0);
      PooledObjectFactory<Integer> pooledObjectFactory0 = (PooledObjectFactory<Integer>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn(defaultPooledObject0).when(pooledObjectFactory0).makeObject();
      doReturn(true).when(pooledObjectFactory0).validateObject(nullable(org.apache.commons.pool2.PooledObject.class));
      SoftReferenceObjectPool<Integer> softReferenceObjectPool0 = new SoftReferenceObjectPool<Integer>(pooledObjectFactory0);
      softReferenceObjectPool0.borrowObject();
      int int0 = softReferenceObjectPool0.getNumActive();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SoftReferenceObjectPool<Object> softReferenceObjectPool0 = new SoftReferenceObjectPool<Object>((PooledObjectFactory<Object>) null);
      PooledObjectFactory<Object> pooledObjectFactory0 = softReferenceObjectPool0.getFactory();
      assertNotNull(pooledObjectFactory0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PooledObjectFactory<PooledSoftReference<Object>> pooledObjectFactory0 = (PooledObjectFactory<PooledSoftReference<Object>>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn((PooledObject) null).when(pooledObjectFactory0).makeObject();
      SoftReferenceObjectPool<PooledSoftReference<Object>> softReferenceObjectPool0 = new SoftReferenceObjectPool<PooledSoftReference<Object>>(pooledObjectFactory0);
      try { 
        softReferenceObjectPool0.borrowObject();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.pool2.impl.SoftReferenceObjectPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PooledObjectFactory<Object> pooledObjectFactory0 = (PooledObjectFactory<Object>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      SoftReferenceObjectPool<Object> softReferenceObjectPool0 = new SoftReferenceObjectPool<Object>(pooledObjectFactory0);
      softReferenceObjectPool0.close();
      try { 
        softReferenceObjectPool0.borrowObject();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
         //
         // Pool not open
         //
         verifyException("org.apache.commons.pool2.BaseObjectPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PooledObjectFactory<Object> pooledObjectFactory0 = (PooledObjectFactory<Object>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn((PooledObject) null).when(pooledObjectFactory0).makeObject();
      SoftReferenceObjectPool<Object> softReferenceObjectPool0 = new SoftReferenceObjectPool<Object>(pooledObjectFactory0);
      try { 
        softReferenceObjectPool0.addObject();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.pool2.impl.SoftReferenceObjectPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SoftReferenceObjectPool<Integer> softReferenceObjectPool0 = new SoftReferenceObjectPool<Integer>((PooledObjectFactory<Integer>) null);
      softReferenceObjectPool0.clear();
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Integer integer0 = new Integer(5433);
      DefaultPooledObject<Integer> defaultPooledObject0 = new DefaultPooledObject<Integer>(integer0);
      PooledObjectFactory<Integer> pooledObjectFactory0 = (PooledObjectFactory<Integer>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn(defaultPooledObject0).when(pooledObjectFactory0).makeObject();
      doReturn(true, true, false).when(pooledObjectFactory0).validateObject(nullable(org.apache.commons.pool2.PooledObject.class));
      SoftReferenceObjectPool<Integer> softReferenceObjectPool0 = new SoftReferenceObjectPool<Integer>(pooledObjectFactory0);
      softReferenceObjectPool0.addObject();
      softReferenceObjectPool0.borrowObject();
      softReferenceObjectPool0.returnObject(integer0);
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(5433);
      DefaultPooledObject<Integer> defaultPooledObject0 = new DefaultPooledObject<Integer>(integer0);
      PooledObjectFactory<Integer> pooledObjectFactory0 = (PooledObjectFactory<Integer>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn(defaultPooledObject0).when(pooledObjectFactory0).makeObject();
      doReturn(true, true).when(pooledObjectFactory0).validateObject(nullable(org.apache.commons.pool2.PooledObject.class));
      SoftReferenceObjectPool<Integer> softReferenceObjectPool0 = new SoftReferenceObjectPool<Integer>(pooledObjectFactory0);
      softReferenceObjectPool0.addObject();
      softReferenceObjectPool0.returnObject(integer0);
      int int0 = softReferenceObjectPool0.getNumActive();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer(5433);
      PooledObjectFactory<Integer> pooledObjectFactory0 = (PooledObjectFactory<Integer>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      SoftReferenceObjectPool<Integer> softReferenceObjectPool0 = new SoftReferenceObjectPool<Integer>(pooledObjectFactory0);
      try { 
        softReferenceObjectPool0.returnObject(integer0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
         //
         // Returned object not currently part of this pool
         //
         verifyException("org.apache.commons.pool2.impl.SoftReferenceObjectPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(5433);
      DefaultPooledObject<Integer> defaultPooledObject0 = new DefaultPooledObject<Integer>(integer0);
      PooledObjectFactory<Integer> pooledObjectFactory0 = (PooledObjectFactory<Integer>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn(defaultPooledObject0).when(pooledObjectFactory0).makeObject();
      doReturn(true).when(pooledObjectFactory0).validateObject(nullable(org.apache.commons.pool2.PooledObject.class));
      SoftReferenceObjectPool<Integer> softReferenceObjectPool0 = new SoftReferenceObjectPool<Integer>(pooledObjectFactory0);
      softReferenceObjectPool0.addObject();
      softReferenceObjectPool0.clear();
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SoftReference<String> softReference0 = new SoftReference<String>("Could not create a validated object, cause: ");
      PooledSoftReference<String> pooledSoftReference0 = new PooledSoftReference<String>(softReference0);
      PooledObjectFactory<String> pooledObjectFactory0 = (PooledObjectFactory<String>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn(pooledSoftReference0).when(pooledObjectFactory0).makeObject();
      doReturn(true).when(pooledObjectFactory0).validateObject(nullable(org.apache.commons.pool2.PooledObject.class));
      SoftReferenceObjectPool<String> softReferenceObjectPool0 = new SoftReferenceObjectPool<String>(pooledObjectFactory0);
      softReferenceObjectPool0.addObject();
      softReferenceObjectPool0.invalidateObject("Could not create a validated object, cause: ");
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = new Integer(5433);
      DefaultPooledObject<Integer> defaultPooledObject0 = new DefaultPooledObject<Integer>(integer0);
      PooledObjectFactory<Integer> pooledObjectFactory0 = (PooledObjectFactory<Integer>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn(defaultPooledObject0, defaultPooledObject0).when(pooledObjectFactory0).makeObject();
      doReturn(true, false, false).when(pooledObjectFactory0).validateObject(nullable(org.apache.commons.pool2.PooledObject.class));
      SoftReferenceObjectPool<Integer> softReferenceObjectPool0 = new SoftReferenceObjectPool<Integer>(pooledObjectFactory0);
      softReferenceObjectPool0.addObject();
      try { 
        softReferenceObjectPool0.borrowObject();
        fail("Expecting exception: NoSuchElementException");
      } catch(NoSuchElementException e) {
         //
         // Could not create a validated object, cause: org.evosuite.runtime.mock.java.lang.MockThrowable: ValidateObject failed
         //
         verifyException("org.apache.commons.pool2.impl.SoftReferenceObjectPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultPooledObject<Object> defaultPooledObject0 = new DefaultPooledObject<Object>((Object) null);
      PooledObjectFactory<Object> pooledObjectFactory0 = (PooledObjectFactory<Object>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn((PooledObject) null).when(pooledObjectFactory0).makeObject();
      SoftReferenceObjectPool<Object> softReferenceObjectPool0 = new SoftReferenceObjectPool<Object>(pooledObjectFactory0);
      try { 
        softReferenceObjectPool0.borrowObject();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.pool2.impl.SoftReferenceObjectPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SoftReferenceObjectPool<Integer> softReferenceObjectPool0 = new SoftReferenceObjectPool<Integer>((PooledObjectFactory<Integer>) null);
      try { 
        softReferenceObjectPool0.borrowObject();
        fail("Expecting exception: NoSuchElementException");
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.pool2.impl.SoftReferenceObjectPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SoftReferenceObjectPool<Integer> softReferenceObjectPool0 = new SoftReferenceObjectPool<Integer>((PooledObjectFactory<Integer>) null);
      try { 
        softReferenceObjectPool0.addObject();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
         //
         // Cannot add objects without a factory.
         //
         verifyException("org.apache.commons.pool2.impl.SoftReferenceObjectPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PooledObjectFactory<Object> pooledObjectFactory0 = (PooledObjectFactory<Object>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      SoftReferenceObjectPool<Object> softReferenceObjectPool0 = new SoftReferenceObjectPool<Object>(pooledObjectFactory0);
      int int0 = softReferenceObjectPool0.getNumActive();
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PooledObjectFactory<Object> pooledObjectFactory0 = (PooledObjectFactory<Object>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      SoftReferenceObjectPool<Object> softReferenceObjectPool0 = new SoftReferenceObjectPool<Object>(pooledObjectFactory0);
      softReferenceObjectPool0.close();
      Integer integer0 = new Integer(1789);
      try { 
        softReferenceObjectPool0.returnObject(integer0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
         //
         // Returned object not currently part of this pool
         //
         verifyException("org.apache.commons.pool2.impl.SoftReferenceObjectPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PooledObjectFactory<Object> pooledObjectFactory0 = (PooledObjectFactory<Object>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      SoftReferenceObjectPool<Object> softReferenceObjectPool0 = new SoftReferenceObjectPool<Object>(pooledObjectFactory0);
      // Undeclared exception!
      try { 
        softReferenceObjectPool0.toStringAppendFields((StringBuilder) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.pool2.BaseObjectPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PooledObjectFactory<PooledSoftReference<Object>> pooledObjectFactory0 = (PooledObjectFactory<PooledSoftReference<Object>>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(pooledObjectFactory0).toString();
      SoftReferenceObjectPool<PooledSoftReference<Object>> softReferenceObjectPool0 = new SoftReferenceObjectPool<PooledSoftReference<Object>>(pooledObjectFactory0);
      PooledObjectFactory<PooledSoftReference<Object>> pooledObjectFactory1 = softReferenceObjectPool0.getFactory();
      ;
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PooledObjectFactory<String> pooledObjectFactory0 = (PooledObjectFactory<String>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      SoftReferenceObjectPool<String> softReferenceObjectPool0 = new SoftReferenceObjectPool<String>(pooledObjectFactory0);
      try { 
        softReferenceObjectPool0.invalidateObject("Could not create a validated object, cause: ");
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
         //
         // Object to invalidate is not currently part of this pool
         //
         verifyException("org.apache.commons.pool2.impl.SoftReferenceObjectPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PooledObjectFactory<String> pooledObjectFactory0 = (PooledObjectFactory<String>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      SoftReferenceObjectPool<String> softReferenceObjectPool0 = new SoftReferenceObjectPool<String>(pooledObjectFactory0);
      int int0 = softReferenceObjectPool0.getNumIdle();
      ;
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultPooledObject<String> defaultPooledObject0 = new DefaultPooledObject<String>(".JWpXxExjpm");
      PooledObjectFactory<String> pooledObjectFactory0 = (PooledObjectFactory<String>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn(defaultPooledObject0).when(pooledObjectFactory0).makeObject();
      doReturn(false).when(pooledObjectFactory0).validateObject(nullable(org.apache.commons.pool2.PooledObject.class));
      SoftReferenceObjectPool<String> softReferenceObjectPool0 = new SoftReferenceObjectPool<String>(pooledObjectFactory0);
      softReferenceObjectPool0.addObject();
      assertTrue(softReferenceObjectPool0.isClosed());
}
}
