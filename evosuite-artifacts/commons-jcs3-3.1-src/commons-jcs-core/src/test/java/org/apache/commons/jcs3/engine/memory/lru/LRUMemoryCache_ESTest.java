/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:05:35 GMT 2022
 */

package org.apache.commons.jcs3.engine.memory.lru;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.Delayed;
import org.apache.commons.jcs3.engine.behavior.ICacheElement;
import org.apache.commons.jcs3.engine.memory.lru.LRUMemoryCache;
import org.apache.commons.jcs3.engine.memory.util.MemoryElementDescriptor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LRUMemoryCache_ESTest extends LRUMemoryCache_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LRUMemoryCache<String, Delayed> lRUMemoryCache0 = new LRUMemoryCache<String, Delayed>();
      // Undeclared exception!
      try { 
        lRUMemoryCache0.adjustListForUpdate((ICacheElement<String, Delayed>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.engine.memory.AbstractDoubleLinkedListMemoryCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LRUMemoryCache<Object, Integer> lRUMemoryCache0 = new LRUMemoryCache<Object, Integer>();
      MemoryElementDescriptor<Object, Integer> memoryElementDescriptor0 = new MemoryElementDescriptor<Object, Integer>((ICacheElement<Object, Integer>) null);
      // Undeclared exception!
      try { 
        lRUMemoryCache0.adjustListForGet(memoryElementDescriptor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.engine.memory.lru.LRUMemoryCache", e);
      }
  }
}
