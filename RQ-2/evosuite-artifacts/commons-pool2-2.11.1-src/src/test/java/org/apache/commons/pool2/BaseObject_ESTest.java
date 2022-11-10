/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 19:07:27 GMT 2022
 */

package org.apache.commons.pool2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.pool2.BaseObject;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.BaseObjectPoolConfig;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.apache.commons.pool2.impl.SoftReferenceObjectPool;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseObject_ESTest extends BaseObject_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GenericObjectPoolConfig<String> genericObjectPoolConfig0 = new GenericObjectPoolConfig<String>();
      StringBuilder stringBuilder0 = new StringBuilder();
      ((BaseObject)genericObjectPoolConfig0).toStringAppendFields(stringBuilder0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PooledObjectFactory<Object> pooledObjectFactory0 = (PooledObjectFactory<Object>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      GenericObjectPool<Object> genericObjectPool0 = new GenericObjectPool<Object>(pooledObjectFactory0);
      PooledObjectFactory<Object> pooledObjectFactory1 = genericObjectPool0.getFactory();
      SoftReferenceObjectPool<Object> softReferenceObjectPool0 = new SoftReferenceObjectPool<Object>(pooledObjectFactory1);
      // Undeclared exception!
      try { 
        ((BaseObject)softReferenceObjectPool0).toStringAppendFields((StringBuilder) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.pool2.BaseObjectPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      String string0 = genericObjectPoolConfig0.toString();
      ;
}
}
