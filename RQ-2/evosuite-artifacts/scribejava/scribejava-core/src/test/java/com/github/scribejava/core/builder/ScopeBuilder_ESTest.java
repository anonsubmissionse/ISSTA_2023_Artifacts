/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 03:09:11 GMT 2022
 */

package com.github.scribejava.core.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.core.builder.ScopeBuilder;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScopeBuilder_ESTest extends ScopeBuilder_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[1];
      ScopeBuilder scopeBuilder0 = new ScopeBuilder(stringArray0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ScopeBuilder scopeBuilder1 = scopeBuilder0.withScopes((Collection<String>) linkedList0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      ScopeBuilder scopeBuilder0 = new ScopeBuilder(stringArray0);
      String string0 = scopeBuilder0.build();
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ScopeBuilder scopeBuilder0 = new ScopeBuilder();
      // Undeclared exception!
      try { 
        scopeBuilder0.withScopes((String[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[1];
      ScopeBuilder scopeBuilder0 = new ScopeBuilder(stringArray0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("");
      List<String> list0 = linkedList0.subList(1, 1);
      linkedList0.add("");
      // Undeclared exception!
      try { 
        scopeBuilder0.withScopes((Collection<String>) list0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[1];
      ScopeBuilder scopeBuilder0 = new ScopeBuilder(stringArray0);
      ScopeBuilder scopeBuilder1 = scopeBuilder0.withScopes(stringArray0);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[1];
      ScopeBuilder scopeBuilder0 = new ScopeBuilder(stringArray0);
      ScopeBuilder scopeBuilder1 = scopeBuilder0.withScope((String) null);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[1];
      ScopeBuilder scopeBuilder0 = new ScopeBuilder(stringArray0);
      String string0 = scopeBuilder0.build();
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ScopeBuilder scopeBuilder0 = new ScopeBuilder(linkedList0);
      // Undeclared exception!
      try { 
        scopeBuilder0.build();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ScopeBuilder scopeBuilder0 = null;
      try {
        scopeBuilder0 = new ScopeBuilder((Collection<String>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractCollection", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ScopeBuilder scopeBuilder0 = null;
      try {
        scopeBuilder0 = new ScopeBuilder((String[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ScopeBuilder scopeBuilder0 = new ScopeBuilder();
      // Undeclared exception!
      try { 
        scopeBuilder0.withScopes((Collection<String>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractCollection", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ScopeBuilder scopeBuilder0 = new ScopeBuilder("FgLh\"W^'=j4t");
  }
}
