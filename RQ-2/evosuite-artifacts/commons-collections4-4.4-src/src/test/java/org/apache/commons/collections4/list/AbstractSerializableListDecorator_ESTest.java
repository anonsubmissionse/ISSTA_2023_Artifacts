/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 02:15:09 GMT 2022
 */

package org.apache.commons.collections4.list;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import org.apache.commons.collections4.list.UnmodifiableList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractSerializableListDecorator_ESTest extends AbstractSerializableListDecorator_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      UnmodifiableList<Integer> unmodifiableList0 = new UnmodifiableList<Integer>(linkedList0);
  }
}
