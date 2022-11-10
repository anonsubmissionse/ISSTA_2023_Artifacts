/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:58:14 GMT 2022
 */

package org.apache.commons.collections4;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.ClosureUtils;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.ChainedClosure;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.ForClosure;
import org.apache.commons.collections4.functors.IdentityPredicate;
import org.apache.commons.collections4.functors.IfClosure;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.apache.commons.collections4.functors.NOPClosure;
import org.apache.commons.collections4.functors.NullIsExceptionPredicate;
import org.apache.commons.collections4.functors.NullIsTruePredicate;
import org.apache.commons.collections4.functors.NullPredicate;
import org.apache.commons.collections4.functors.OnePredicate;
import org.apache.commons.collections4.functors.SwitchClosure;
import org.apache.commons.collections4.functors.SwitchTransformer;
import org.apache.commons.collections4.functors.TransformerClosure;
import org.apache.commons.collections4.functors.TransformerPredicate;
import org.apache.commons.collections4.functors.TruePredicate;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.apache.commons.collections4.functors.WhileClosure;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClosureUtils_ESTest extends ClosureUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<Predicate<Object>, Closure<Object>> hashMap0 = new HashMap<Predicate<Object>, Closure<Object>>();
      Closure<Object> closure0 = SwitchClosure.switchClosure((Map<Predicate<Object>, Closure<Object>>) hashMap0);
      HashMap<InstanceofPredicate, Transformer<Object, Boolean>> hashMap1 = new HashMap<InstanceofPredicate, Transformer<Object, Boolean>>();
      Transformer<Object, Boolean> transformer0 = SwitchTransformer.switchTransformer((Map<? extends Predicate<? super Object>, ? extends Transformer<? super Object, ? extends Boolean>>) hashMap1);
      Predicate<Object> predicate0 = TransformerPredicate.transformerPredicate((Transformer<? super Object, Boolean>) transformer0);
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 4);
      predicateArray0[0] = predicate0;
      predicateArray0[1] = predicate0;
      predicateArray0[2] = predicate0;
      predicateArray0[3] = predicate0;
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 4);
      closureArray0[0] = closure0;
      closureArray0[1] = closure0;
      closureArray0[2] = closure0;
      closureArray0[3] = closure0;
      Closure<AllPredicate<NullIsTruePredicate>> closure1 = ClosureUtils.switchClosure((Predicate<? super AllPredicate<NullIsTruePredicate>>[]) predicateArray0, (Closure<? super AllPredicate<NullIsTruePredicate>>[]) closureArray0, (Closure<? super AllPredicate<NullIsTruePredicate>>) closure0);
      assertNotNull(closure1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IdentityPredicate<Object> identityPredicate0 = new IdentityPredicate<Object>((Object) null);
      HashMap<Predicate<Object>, Closure<Object>> hashMap0 = new HashMap<Predicate<Object>, Closure<Object>>();
      Closure<Object> closure0 = SwitchClosure.switchClosure((Map<Predicate<Object>, Closure<Object>>) hashMap0);
      IfClosure<Object> ifClosure0 = new IfClosure<Object>(identityPredicate0, closure0, closure0);
      Closure<String> closure1 = ClosureUtils.ifClosure((Predicate<? super String>) identityPredicate0, (Closure<? super String>) ifClosure0);
      assertNotNull(closure1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 7);
      Closure<Object> closure0 = ClosureUtils.invokerClosure("", (Class<?>[]) classArray0, (Object[]) classArray0);
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 9);
      closureArray0[0] = closure0;
      closureArray0[1] = closureArray0[0];
      closureArray0[2] = closure0;
      closureArray0[3] = closure0;
      closureArray0[4] = closure0;
      closureArray0[5] = closure0;
      closureArray0[6] = closure0;
      closureArray0[7] = closure0;
      closureArray0[8] = closure0;
      Closure<Object> closure1 = ClosureUtils.chainedClosure((Closure<? super Object>[]) closureArray0);
      assertFalse(closure1.equals((Object)closure0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Predicate<Object> predicate0 = NullPredicate.nullPredicate();
      // Undeclared exception!
      try { 
        ClosureUtils.whileClosure((Predicate<? super AllPredicate<TruePredicate>>) predicate0, (Closure<? super AllPredicate<TruePredicate>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Closure must not be null
         //
         verifyException("org.apache.commons.collections4.functors.WhileClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<InstanceofPredicate> linkedList0 = new LinkedList<InstanceofPredicate>();
      Predicate<Object> predicate0 = OnePredicate.onePredicate((Collection<? extends Predicate<? super Object>>) linkedList0);
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 7);
      predicateArray0[0] = predicate0;
      predicateArray0[1] = predicate0;
      predicateArray0[2] = predicate0;
      predicateArray0[3] = predicate0;
      predicateArray0[4] = predicate0;
      predicateArray0[5] = predicate0;
      predicateArray0[6] = predicate0;
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 4);
      HashMap<InstanceofPredicate, Closure<Object>> hashMap0 = new HashMap<InstanceofPredicate, Closure<Object>>();
      HashMap<Predicate<Object>, Closure<Object>> hashMap1 = new HashMap<Predicate<Object>, Closure<Object>>(hashMap0);
      Closure<Object> closure0 = ClosureUtils.switchClosure((Map<Predicate<Object>, Closure<Object>>) hashMap1);
      closureArray0[0] = closure0;
      closureArray0[1] = closure0;
      ChainedClosure<Object> chainedClosure0 = new ChainedClosure<Object>(closureArray0);
      closureArray0[2] = (Closure<Object>) chainedClosure0;
      WhileClosure<Object> whileClosure0 = new WhileClosure<Object>(predicate0, closure0, true);
      closureArray0[3] = (Closure<Object>) whileClosure0;
      // Undeclared exception!
      try { 
        ClosureUtils.switchClosure((Predicate<? super Object>[]) predicateArray0, (Closure<? super Object>[]) closureArray0, (Closure<? super Object>) closure0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The predicate and closure arrays must be the same size
         //
         verifyException("org.apache.commons.collections4.functors.SwitchClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Closure<InstanceofPredicate> closure0 = ClosureUtils.invokerClosure("org.apache.commons.collections4.functors.ConstantFactory");
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 1);
      Class<Object> class0 = Object.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      predicateArray0[0] = (Predicate<Object>) instanceofPredicate0;
      Closure<InstanceofPredicate>[] closureArray0 = (Closure<InstanceofPredicate>[]) Array.newInstance(Closure.class, 5);
      closureArray0[0] = closure0;
      closureArray0[1] = closure0;
      closureArray0[2] = closure0;
      closureArray0[3] = closure0;
      closureArray0[4] = closure0;
      // Undeclared exception!
      try { 
        ClosureUtils.switchClosure((Predicate<? super InstanceofPredicate>[]) predicateArray0, (Closure<? super InstanceofPredicate>[]) closureArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The predicate and closure arrays must be the same size
         //
         verifyException("org.apache.commons.collections4.functors.SwitchClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 6);
      Class<InstanceofPredicate>[] classArray0 = (Class<InstanceofPredicate>[]) Array.newInstance(Class.class, 3);
      // Undeclared exception!
      try { 
        ClosureUtils.invokerClosure((String) null, (Class<?>[]) classArray0, (Object[]) predicateArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The method to invoke must not be null
         //
         verifyException("org.apache.commons.collections4.functors.InvokerTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 2);
      // Undeclared exception!
      try { 
        ClosureUtils.invokerClosure("", (Class<?>[]) classArray0, (Object[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The parameter types must match the arguments
         //
         verifyException("org.apache.commons.collections4.functors.InvokerTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClosureUtils.invokerClosure((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The method to invoke must not be null
         //
         verifyException("org.apache.commons.collections4.functors.InvokerTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Predicate<Object> predicate0 = NullPredicate.nullPredicate();
      // Undeclared exception!
      try { 
        ClosureUtils.ifClosure((Predicate<? super SwitchClosure<AllPredicate>>) predicate0, (Closure<? super SwitchClosure<AllPredicate>>) null, (Closure<? super SwitchClosure<AllPredicate>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Closures must not be null
         //
         verifyException("org.apache.commons.collections4.functors.IfClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 7);
      Transformer<Object, InstanceofPredicate> transformer0 = InvokerTransformer.invokerTransformer("-t/MdY>FdH:^H", (Class<?>[]) classArray0, (Object[]) classArray0);
      TransformerClosure<Object> transformerClosure0 = new TransformerClosure<Object>(transformer0);
      // Undeclared exception!
      try { 
        ClosureUtils.doWhileClosure((Closure<? super Object>) transformerClosure0, (Predicate<? super Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Predicate must not be null
         //
         verifyException("org.apache.commons.collections4.functors.WhileClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Closure<Object>> linkedList0 = new LinkedList<Closure<Object>>();
      linkedList0.add((Closure<Object>) null);
      // Undeclared exception!
      try { 
        ClosureUtils.chainedClosure((Collection<? extends Closure<? super NOPClosure<NOPClosure>>>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The closure array must not contain a null closure, index 0 was null
         //
         verifyException("org.apache.commons.collections4.functors.FunctorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer((-1916));
      ConstantTransformer<Object, Integer> constantTransformer0 = new ConstantTransformer<Object, Integer>(integer0);
      Closure<Boolean> closure0 = ClosureUtils.asClosure((Transformer<? super Boolean, ?>) constantTransformer0);
      assertNotNull(closure0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Closure<NullIsExceptionPredicate<InstanceofPredicate>> closure0 = ClosureUtils.invokerClosure("QYsS]*bf");
      Closure<Object> closure1 = NOPClosure.nopClosure();
      HashMap<String, Closure<String>> hashMap0 = new HashMap<String, Closure<String>>();
      IdentityPredicate<Object> identityPredicate0 = new IdentityPredicate<Object>(closure0);
      IfClosure<String> ifClosure0 = new IfClosure<String>(identityPredicate0, closure1);
      hashMap0.put("QYsS]*bf", ifClosure0);
      Closure<String> closure2 = ClosureUtils.switchMapClosure((Map<? extends String, Closure<String>>) hashMap0);
      assertNotNull(closure2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClosureUtils.switchMapClosure((Map<? extends IfClosure<TransformerPredicate>, Closure<IfClosure<TransformerPredicate>>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The object and closure map must not be null
         //
         verifyException("org.apache.commons.collections4.ClosureUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 2);
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 9);
      Closure<Object> closure0 = ClosureUtils.nopClosure();
      // Undeclared exception!
      try { 
        ClosureUtils.switchClosure((Predicate<? super Object>[]) predicateArray0, (Closure<? super Object>[]) closureArray0, (Closure<? super Object>) closure0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The predicate array must not contain a null predicate, index 0 was null
         //
         verifyException("org.apache.commons.collections4.functors.FunctorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Closure<Object> closure0 = ClosureUtils.nopClosure();
      // Undeclared exception!
      try { 
        ClosureUtils.ifClosure((Predicate<? super Object>) null, (Closure<? super Object>) closure0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Predicate must not be null
         //
         verifyException("org.apache.commons.collections4.functors.IfClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 9);
      // Undeclared exception!
      try { 
        ClosureUtils.chainedClosure((Closure<? super Object>[]) closureArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The closure array must not contain a null closure, index 0 was null
         //
         verifyException("org.apache.commons.collections4.functors.FunctorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<Closure<Object>> linkedList0 = new LinkedList<Closure<Object>>();
      Closure<Object> closure0 = ClosureUtils.chainedClosure((Collection<? extends Closure<? super Object>>) linkedList0);
      assertFalse(linkedList0.contains(closure0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Closure<Object> closure0 = ClosureUtils.nopClosure();
      ForClosure<Object> forClosure0 = new ForClosure<Object>(0, closure0);
      Closure<Object> closure1 = ClosureUtils.forClosure(0, (Closure<? super Object>) forClosure0);
      assertSame(closure1, closure0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 1);
      Closure<InstanceofPredicate>[] closureArray0 = (Closure<InstanceofPredicate>[]) Array.newInstance(Closure.class, 5);
      // Undeclared exception!
      try { 
        ClosureUtils.switchClosure((Predicate<? super InstanceofPredicate>[]) predicateArray0, (Closure<? super InstanceofPredicate>[]) closureArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The predicate array must not contain a null predicate, index 0 was null
         //
         verifyException("org.apache.commons.collections4.functors.FunctorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Closure<UniquePredicate<SwitchClosure>> closure0 = ClosureUtils.exceptionClosure();
      assertNotNull(closure0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedList<InstanceofPredicate> linkedList0 = new LinkedList<InstanceofPredicate>();
      Predicate<Object> predicate0 = OnePredicate.onePredicate((Collection<? extends Predicate<? super Object>>) linkedList0);
      Closure<Object> closure0 = ClosureUtils.nopClosure();
      ForClosure<Object> forClosure0 = new ForClosure<Object>(0, closure0);
      Closure<Object> closure1 = ClosureUtils.ifClosure((Predicate<? super Object>) predicate0, (Closure<? super Object>) forClosure0, (Closure<? super Object>) closure0);
      assertFalse(closure1.equals((Object)closure0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EqualPredicate<Object> equalPredicate0 = new EqualPredicate<Object>("org.apache.commons.collections4.ClosureUtils");
      HashMap<Predicate<Object>, Closure<Object>> hashMap0 = new HashMap<Predicate<Object>, Closure<Object>>();
      Closure<Object> closure0 = ClosureUtils.switchClosure((Map<Predicate<Object>, Closure<Object>>) hashMap0);
      Closure<Object> closure1 = ClosureUtils.whileClosure((Predicate<? super Object>) equalPredicate0, (Closure<? super Object>) closure0);
      assertFalse(closure1.equals((Object)closure0));
  }
}
