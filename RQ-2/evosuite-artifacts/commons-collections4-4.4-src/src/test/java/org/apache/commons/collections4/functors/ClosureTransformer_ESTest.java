/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 02:07:49 GMT 2022
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.AnyPredicate;
import org.apache.commons.collections4.functors.ClosureTransformer;
import org.apache.commons.collections4.functors.ExceptionClosure;
import org.apache.commons.collections4.functors.ForClosure;
import org.apache.commons.collections4.functors.NotPredicate;
import org.apache.commons.collections4.functors.SwitchClosure;
import org.apache.commons.collections4.functors.WhileClosure;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClosureTransformer_ESTest extends ClosureTransformer_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Closure<Object> closure0 = ExceptionClosure.exceptionClosure();
      ForClosure<Object> forClosure0 = new ForClosure<Object>((-665), closure0);
      ClosureTransformer<Integer> closureTransformer0 = new ClosureTransformer<Integer>(forClosure0);
      Integer integer0 = closureTransformer0.transform((Integer) null);
      assertNotNull(integer0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClosureTransformer<Closure<Object>> closureTransformer0 = new ClosureTransformer<Closure<Object>>((Closure<? super Closure<Object>>) null);
      Closure<? super Closure<Object>> closure0 = closureTransformer0.getClosure();
      assertNotNull(closure0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 0);
      AnyPredicate<Object> anyPredicate0 = new AnyPredicate<Object>(predicateArray0);
      NotPredicate<Object> notPredicate0 = new NotPredicate<Object>(anyPredicate0);
      HashMap<Predicate<Object>, Closure<Object>> hashMap0 = new HashMap<Predicate<Object>, Closure<Object>>();
      Closure<Object> closure0 = SwitchClosure.switchClosure((Map<Predicate<Object>, Closure<Object>>) hashMap0);
      Closure<Object> closure1 = WhileClosure.whileClosure((Predicate<? super Object>) notPredicate0, (Closure<? super Object>) closure0, true);
      ClosureTransformer<Predicate<Object>> closureTransformer0 = new ClosureTransformer<Predicate<Object>>(closure1);
      // Undeclared exception!
      closureTransformer0.transform(notPredicate0);
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ForClosure<Object> forClosure0 = new ForClosure<Object>(512, (Closure<? super Object>) null);
      ClosureTransformer<String> closureTransformer0 = new ClosureTransformer<String>(forClosure0);
      // Undeclared exception!
      try { 
        closureTransformer0.transform("1>mqz1M5RbQ");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.functors.ForClosure", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClosureTransformer.closureTransformer((Closure<? super Transformer<Closure, Closure<Object>>>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // Closure must not be null
         //
         verifyException("org.apache.commons.collections4.functors.ClosureTransformer", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HashMap<Predicate<Object>, Closure<Object>> hashMap0 = new HashMap<Predicate<Object>, Closure<Object>>();
      Closure<Object> closure0 = SwitchClosure.switchClosure((Map<Predicate<Object>, Closure<Object>>) hashMap0);
      Transformer<Boolean, Boolean> transformer0 = ClosureTransformer.closureTransformer((Closure<? super Boolean>) closure0);
      ;
}
}
