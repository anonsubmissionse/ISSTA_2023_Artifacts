/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 02:13:59 GMT 2022
 */

package org.apache.commons.collections4.trie;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.apache.commons.collections4.trie.PatriciaTrie;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PatriciaTrie_ESTest extends PatriciaTrie_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PatriciaTrie<String> patriciaTrie0 = null;
      try {
        patriciaTrie0 = new PatriciaTrie<String>((Map<? extends String, ? extends String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PatriciaTrie<Integer> patriciaTrie0 = new PatriciaTrie<Integer>();
      PatriciaTrie<Object> patriciaTrie1 = new PatriciaTrie<Object>(patriciaTrie0);
  }
}
