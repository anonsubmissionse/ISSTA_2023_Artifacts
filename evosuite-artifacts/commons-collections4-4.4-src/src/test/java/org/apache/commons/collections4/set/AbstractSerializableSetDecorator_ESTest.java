/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 02:15:12 GMT 2022
 */

package org.apache.commons.collections4.set;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import org.apache.commons.collections4.set.ListOrderedSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractSerializableSetDecorator_ESTest extends AbstractSerializableSetDecorator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListOrderedSet<LinkedList<Object>> listOrderedSet0 = new ListOrderedSet<LinkedList<Object>>();
  }
}
