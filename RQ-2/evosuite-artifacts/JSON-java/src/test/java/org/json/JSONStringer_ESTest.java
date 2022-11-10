/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 06 14:33:51 GMT 2022
 */

package org.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.json.JSONStringer;
import org.json.JSONWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONStringer_ESTest extends JSONStringer_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JSONStringer jSONStringer0 = new JSONStringer();
      jSONStringer0.array();
      String string0 = jSONStringer0.toString();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JSONStringer jSONStringer0 = new JSONStringer();
      jSONStringer0.array();
      JSONWriter jSONWriter0 = jSONStringer0.endArray();
      jSONWriter0.writer = null;
      // Undeclared exception!
      try { 
        jSONStringer0.toString();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JSONStringer jSONStringer0 = new JSONStringer();
      jSONStringer0.array();
      jSONStringer0.endArray();
      String string0 = jSONStringer0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JSONStringer jSONStringer0 = new JSONStringer();
      String string0 = jSONStringer0.toString();
      ;
}
}
