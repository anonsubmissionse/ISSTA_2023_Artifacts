/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:18:17 GMT 2022
 */

package org.apache.commons.jcs3.jcache.cdi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.annotation.Annotation;
import javax.cache.annotation.CacheKeyInvocationContext;
import org.apache.commons.jcs3.jcache.cdi.CacheKeyGeneratorImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CacheKeyGeneratorImpl_ESTest extends CacheKeyGeneratorImpl_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CacheKeyGeneratorImpl cacheKeyGeneratorImpl0 = new CacheKeyGeneratorImpl();
      // Undeclared exception!
      try { 
        cacheKeyGeneratorImpl0.generateCacheKey((CacheKeyInvocationContext<? extends Annotation>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.jcache.cdi.CacheKeyGeneratorImpl", e);
      }
  }
}
