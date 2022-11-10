/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:16:40 GMT 2022
 */

package org.apache.commons.jcs3.jcache.cdi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.cache.annotation.CacheInvocationParameter;
import javax.cache.annotation.CacheKeyGenerator;
import javax.cache.annotation.CachePut;
import javax.cache.annotation.CacheRemove;
import javax.cache.annotation.CacheRemoveAll;
import javax.cache.annotation.CacheResult;
import javax.interceptor.InvocationContext;
import org.apache.commons.jcs3.jcache.cdi.CDIJCacheHelper;
import org.apache.commons.jcs3.jcache.cdi.CacheInvocationContextImpl;
import org.apache.commons.jcs3.jcache.cdi.CacheKeyGeneratorImpl;
import org.apache.commons.jcs3.jcache.cdi.CacheKeyInvocationContextImpl;
import org.apache.commons.jcs3.jcache.cdi.CacheResolverFactoryImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CacheKeyInvocationContextImpl_ESTest extends CacheKeyInvocationContextImpl_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      LinkedList<Set<Annotation>> linkedList0 = new LinkedList<Set<Annotation>>();
      LinkedHashSet<Annotation> linkedHashSet0 = new LinkedHashSet<Annotation>();
      Integer[] integerArray0 = new Integer[8];
      Integer integer0 = new Integer(691);
      CacheResolverFactoryImpl cacheResolverFactoryImpl0 = new CacheResolverFactoryImpl();
      CacheResult cacheResult0 = mock(CacheResult.class, new ViolatedAssumptionAnswer());
      CachePut cachePut0 = mock(CachePut.class, new ViolatedAssumptionAnswer());
      CacheRemove cacheRemove0 = mock(CacheRemove.class, new ViolatedAssumptionAnswer());
      CacheRemoveAll cacheRemoveAll0 = mock(CacheRemoveAll.class, new ViolatedAssumptionAnswer());
      CDIJCacheHelper.MethodMeta cDIJCacheHelper_MethodMeta0 = new CDIJCacheHelper.MethodMeta(classArray0, linkedList0, linkedHashSet0, integerArray0, integer0, integerArray0, "org.apache.commons.jcs3.jcache.cdi.CacheInvocationContextImpl", cacheResolverFactoryImpl0, (CacheKeyGenerator) null, cacheResult0, "3", cacheResolverFactoryImpl0, (CacheKeyGenerator) null, true, cachePut0, "", cacheResolverFactoryImpl0, (CacheKeyGenerator) null, true, cacheRemove0, "", cacheResolverFactoryImpl0, true, cacheRemoveAll0);
      CacheKeyInvocationContextImpl<Annotation> cacheKeyInvocationContextImpl0 = new CacheKeyInvocationContextImpl<Annotation>((InvocationContext) null, (Annotation) null, "RKoLszof@~hZ:9Y", cDIJCacheHelper_MethodMeta0);
      // Undeclared exception!
      try { 
        cacheKeyInvocationContextImpl0.getValueParameter();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.jcache.cdi.CacheInvocationContextImpl", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      doReturn((Object[]) null).when(invocationContext0).getParameters();
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 1);
      LinkedList<Set<Annotation>> linkedList0 = new LinkedList<Set<Annotation>>();
      LinkedHashSet<Annotation> linkedHashSet0 = new LinkedHashSet<Annotation>();
      linkedList0.add((Set<Annotation>) linkedHashSet0);
      Integer integer0 = new Integer(0);
      CacheResolverFactoryImpl cacheResolverFactoryImpl0 = new CacheResolverFactoryImpl();
      CacheResult cacheResult0 = mock(CacheResult.class, new ViolatedAssumptionAnswer());
      CachePut cachePut0 = mock(CachePut.class, new ViolatedAssumptionAnswer());
      CacheRemove cacheRemove0 = mock(CacheRemove.class, new ViolatedAssumptionAnswer());
      Integer[] integerArray0 = new Integer[9];
      integerArray0[0] = integer0;
      integerArray0[1] = integerArray0[0];
      integerArray0[2] = integer0;
      integerArray0[3] = integer0;
      integerArray0[4] = integer0;
      integerArray0[5] = integer0;
      integerArray0[6] = integer0;
      integerArray0[7] = integer0;
      integerArray0[8] = integer0;
      CacheKeyGeneratorImpl cacheKeyGeneratorImpl0 = new CacheKeyGeneratorImpl();
      CDIJCacheHelper.MethodMeta cDIJCacheHelper_MethodMeta0 = new CDIJCacheHelper.MethodMeta(classArray0, linkedList0, linkedHashSet0, integerArray0, integerArray0[1], integerArray0, "{%iB|", cacheResolverFactoryImpl0, cacheKeyGeneratorImpl0, cacheResult0, "{%iB|", cacheResolverFactoryImpl0, cacheKeyGeneratorImpl0, false, cachePut0, "{%iB|", cacheResolverFactoryImpl0, cacheKeyGeneratorImpl0, false, cacheRemove0, "Q#FJ3!X@4yF 3J1Vx", cacheResolverFactoryImpl0, true, (CacheRemoveAll) null);
      CacheKeyInvocationContextImpl<Annotation> cacheKeyInvocationContextImpl0 = new CacheKeyInvocationContextImpl<Annotation>(invocationContext0, (Annotation) null, "", cDIJCacheHelper_MethodMeta0);
      // Undeclared exception!
      try { 
        cacheKeyInvocationContextImpl0.getKeyParameters();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jcs3.jcache.cdi.CacheInvocationContextImpl", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      doReturn(objectArray0).when(invocationContext0).getParameters();
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 2);
      LinkedList<Set<Annotation>> linkedList0 = new LinkedList<Set<Annotation>>();
      LinkedHashSet<Annotation> linkedHashSet0 = new LinkedHashSet<Annotation>();
      Integer[] integerArray0 = new Integer[0];
      Integer integer0 = new Integer(0);
      CacheResolverFactoryImpl cacheResolverFactoryImpl0 = new CacheResolverFactoryImpl();
      CacheResult cacheResult0 = mock(CacheResult.class, new ViolatedAssumptionAnswer());
      CachePut cachePut0 = mock(CachePut.class, new ViolatedAssumptionAnswer());
      CacheRemove cacheRemove0 = mock(CacheRemove.class, new ViolatedAssumptionAnswer());
      CDIJCacheHelper.MethodMeta cDIJCacheHelper_MethodMeta0 = new CDIJCacheHelper.MethodMeta(classArray0, linkedList0, linkedHashSet0, integerArray0, integer0, integerArray0, "{%iB|", cacheResolverFactoryImpl0, (CacheKeyGenerator) null, cacheResult0, "S7I_~3Hs:},w}=4 UX9", cacheResolverFactoryImpl0, (CacheKeyGenerator) null, false, cachePut0, "", cacheResolverFactoryImpl0, (CacheKeyGenerator) null, true, cacheRemove0, "", cacheResolverFactoryImpl0, true, (CacheRemoveAll) null);
      CacheKeyInvocationContextImpl<Annotation> cacheKeyInvocationContextImpl0 = new CacheKeyInvocationContextImpl<Annotation>(invocationContext0, (Annotation) null, "{%iB|", cDIJCacheHelper_MethodMeta0);
      // Undeclared exception!
      try { 
        cacheKeyInvocationContextImpl0.getValueParameter();
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      doReturn((Object[]) null).when(invocationContext0).getParameters();
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 2);
      LinkedList<Set<Annotation>> linkedList0 = new LinkedList<Set<Annotation>>();
      LinkedHashSet<Annotation> linkedHashSet0 = new LinkedHashSet<Annotation>();
      Integer[] integerArray0 = new Integer[0];
      Integer integer0 = new Integer(0);
      CacheResolverFactoryImpl cacheResolverFactoryImpl0 = new CacheResolverFactoryImpl();
      CacheResult cacheResult0 = mock(CacheResult.class, new ViolatedAssumptionAnswer());
      CachePut cachePut0 = mock(CachePut.class, new ViolatedAssumptionAnswer());
      CacheRemove cacheRemove0 = mock(CacheRemove.class, new ViolatedAssumptionAnswer());
      CDIJCacheHelper.MethodMeta cDIJCacheHelper_MethodMeta0 = new CDIJCacheHelper.MethodMeta(classArray0, linkedList0, linkedHashSet0, integerArray0, integer0, integerArray0, "{%iB|", cacheResolverFactoryImpl0, (CacheKeyGenerator) null, cacheResult0, "S7I_~3Hs:},w}=4 UX9", cacheResolverFactoryImpl0, (CacheKeyGenerator) null, false, cachePut0, "", cacheResolverFactoryImpl0, (CacheKeyGenerator) null, true, cacheRemove0, "", cacheResolverFactoryImpl0, true, (CacheRemoveAll) null);
      CacheKeyInvocationContextImpl<Annotation> cacheKeyInvocationContextImpl0 = new CacheKeyInvocationContextImpl<Annotation>(invocationContext0, (Annotation) null, "<|aOZHf+CkKQ~'olZ", cDIJCacheHelper_MethodMeta0);
      // Undeclared exception!
      try { 
        cacheKeyInvocationContextImpl0.getValueParameter();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jcs3.jcache.cdi.CacheInvocationContextImpl", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer[] integerArray0 = new Integer[0];
      Integer integer0 = new Integer((-233));
      CacheResolverFactoryImpl cacheResolverFactoryImpl0 = new CacheResolverFactoryImpl();
      CacheKeyGeneratorImpl cacheKeyGeneratorImpl0 = new CacheKeyGeneratorImpl();
      CacheResult cacheResult0 = mock(CacheResult.class, new ViolatedAssumptionAnswer());
      CachePut cachePut0 = mock(CachePut.class, new ViolatedAssumptionAnswer());
      CacheRemove cacheRemove0 = mock(CacheRemove.class, new ViolatedAssumptionAnswer());
      CacheRemoveAll cacheRemoveAll0 = mock(CacheRemoveAll.class, new ViolatedAssumptionAnswer());
      CDIJCacheHelper.MethodMeta cDIJCacheHelper_MethodMeta0 = new CDIJCacheHelper.MethodMeta((Class<?>[]) null, (List<Set<Annotation>>) null, (Set<Annotation>) null, integerArray0, integer0, integerArray0, "", cacheResolverFactoryImpl0, cacheKeyGeneratorImpl0, cacheResult0, (String) null, cacheResolverFactoryImpl0, cacheKeyGeneratorImpl0, true, cachePut0, "u#yr)", cacheResolverFactoryImpl0, cacheKeyGeneratorImpl0, true, cacheRemove0, (String) null, cacheResolverFactoryImpl0, true, cacheRemoveAll0);
      CacheKeyInvocationContextImpl<Annotation> cacheKeyInvocationContextImpl0 = new CacheKeyInvocationContextImpl<Annotation>((InvocationContext) null, (Annotation) null, "", cDIJCacheHelper_MethodMeta0);
      // Undeclared exception!
      try { 
        cacheKeyInvocationContextImpl0.getKeyParameters();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.jcache.cdi.CacheInvocationContextImpl", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      doReturn((Object[]) null).when(invocationContext0).getParameters();
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 2);
      LinkedList<Set<Annotation>> linkedList0 = new LinkedList<Set<Annotation>>();
      LinkedHashSet<Annotation> linkedHashSet0 = new LinkedHashSet<Annotation>();
      Integer integer0 = new Integer(0);
      CacheResolverFactoryImpl cacheResolverFactoryImpl0 = new CacheResolverFactoryImpl();
      CacheResult cacheResult0 = mock(CacheResult.class, new ViolatedAssumptionAnswer());
      CachePut cachePut0 = mock(CachePut.class, new ViolatedAssumptionAnswer());
      Integer[] integerArray0 = new Integer[7];
      integerArray0[0] = integer0;
      CacheRemove cacheRemove0 = mock(CacheRemove.class, new ViolatedAssumptionAnswer());
      CDIJCacheHelper.MethodMeta cDIJCacheHelper_MethodMeta0 = new CDIJCacheHelper.MethodMeta(classArray0, linkedList0, linkedHashSet0, integerArray0, integer0, integerArray0, "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager", cacheResolverFactoryImpl0, (CacheKeyGenerator) null, cacheResult0, "S7I_~3Hs:},w}=4 UX9", cacheResolverFactoryImpl0, (CacheKeyGenerator) null, true, cachePut0, "", cacheResolverFactoryImpl0, (CacheKeyGenerator) null, true, cacheRemove0, "&o8JdMe7Bj", cacheResolverFactoryImpl0, false, (CacheRemoveAll) null);
      CacheInvocationContextImpl<Annotation> cacheInvocationContextImpl0 = new CacheInvocationContextImpl<Annotation>(invocationContext0, cacheResult0, "", cDIJCacheHelper_MethodMeta0);
      Annotation annotation0 = cacheInvocationContextImpl0.getCacheAnnotation();
      CacheKeyInvocationContextImpl<Annotation> cacheKeyInvocationContextImpl0 = new CacheKeyInvocationContextImpl<Annotation>(invocationContext0, annotation0, "NJP $=UmHw=}}N+", cDIJCacheHelper_MethodMeta0);
      // Undeclared exception!
      try { 
        cacheKeyInvocationContextImpl0.getKeyParameters();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jcs3.jcache.cdi.CacheInvocationContextImpl", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      doReturn((Object[]) null).when(invocationContext0).getParameters();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 4);
      LinkedHashSet<Annotation> linkedHashSet0 = new LinkedHashSet<Annotation>();
      Integer[] integerArray0 = new Integer[1];
      Integer integer0 = new Integer(0);
      integerArray0[0] = integer0;
      CacheResolverFactoryImpl cacheResolverFactoryImpl0 = new CacheResolverFactoryImpl();
      CacheKeyGeneratorImpl cacheKeyGeneratorImpl0 = new CacheKeyGeneratorImpl();
      CachePut cachePut0 = mock(CachePut.class, new ViolatedAssumptionAnswer());
      CacheRemove cacheRemove0 = mock(CacheRemove.class, new ViolatedAssumptionAnswer());
      CacheRemoveAll cacheRemoveAll0 = mock(CacheRemoveAll.class, new ViolatedAssumptionAnswer());
      CDIJCacheHelper.MethodMeta cDIJCacheHelper_MethodMeta0 = new CDIJCacheHelper.MethodMeta(classArray0, (List<Set<Annotation>>) null, linkedHashSet0, integerArray0, integer0, integerArray0, "", cacheResolverFactoryImpl0, cacheKeyGeneratorImpl0, (CacheResult) null, "", cacheResolverFactoryImpl0, cacheKeyGeneratorImpl0, false, cachePut0, (String) null, cacheResolverFactoryImpl0, cacheKeyGeneratorImpl0, false, cacheRemove0, (String) null, cacheResolverFactoryImpl0, false, cacheRemoveAll0);
      CacheKeyInvocationContextImpl<Annotation> cacheKeyInvocationContextImpl0 = new CacheKeyInvocationContextImpl<Annotation>(invocationContext0, (Annotation) null, "", cDIJCacheHelper_MethodMeta0);
      // Undeclared exception!
      try { 
        cacheKeyInvocationContextImpl0.getKeyParameters();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jcs3.jcache.cdi.CacheInvocationContextImpl", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      CacheKeyInvocationContextImpl<Annotation> cacheKeyInvocationContextImpl0 = null;
      try {
        cacheKeyInvocationContextImpl0 = new CacheKeyInvocationContextImpl<Annotation>(invocationContext0, (Annotation) null, "u$-,VWj=S", (CDIJCacheHelper.MethodMeta) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.jcache.cdi.CacheMethodDetailsImpl", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Integer[] integerArray0 = new Integer[0];
      Integer integer0 = new Integer((-233));
      CacheResolverFactoryImpl cacheResolverFactoryImpl0 = new CacheResolverFactoryImpl();
      CacheKeyGeneratorImpl cacheKeyGeneratorImpl0 = new CacheKeyGeneratorImpl();
      CacheResult cacheResult0 = mock(CacheResult.class, new ViolatedAssumptionAnswer());
      CachePut cachePut0 = mock(CachePut.class, new ViolatedAssumptionAnswer());
      CacheRemove cacheRemove0 = mock(CacheRemove.class, new ViolatedAssumptionAnswer());
      CacheRemoveAll cacheRemoveAll0 = mock(CacheRemoveAll.class, new ViolatedAssumptionAnswer());
      CDIJCacheHelper.MethodMeta cDIJCacheHelper_MethodMeta0 = new CDIJCacheHelper.MethodMeta((Class<?>[]) null, (List<Set<Annotation>>) null, (Set<Annotation>) null, integerArray0, integer0, integerArray0, "", cacheResolverFactoryImpl0, cacheKeyGeneratorImpl0, cacheResult0, (String) null, cacheResolverFactoryImpl0, cacheKeyGeneratorImpl0, true, cachePut0, "u#yr)", cacheResolverFactoryImpl0, cacheKeyGeneratorImpl0, true, cacheRemove0, (String) null, cacheResolverFactoryImpl0, true, cacheRemoveAll0);
      CacheKeyInvocationContextImpl<Annotation> cacheKeyInvocationContextImpl0 = new CacheKeyInvocationContextImpl<Annotation>((InvocationContext) null, (Annotation) null, "", cDIJCacheHelper_MethodMeta0);
      CacheInvocationParameter cacheInvocationParameter0 = cacheKeyInvocationContextImpl0.getValueParameter();
      assertNotNull(cacheInvocationParameter0);
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      doReturn((Object[]) null).when(invocationContext0).getParameters();
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 3);
      LinkedList<Set<Annotation>> linkedList0 = new LinkedList<Set<Annotation>>();
      LinkedHashSet<Annotation> linkedHashSet0 = new LinkedHashSet<Annotation>();
      Integer[] integerArray0 = new Integer[0];
      linkedList0.add((Set<Annotation>) linkedHashSet0);
      Integer integer0 = new Integer(0);
      CacheResolverFactoryImpl cacheResolverFactoryImpl0 = new CacheResolverFactoryImpl();
      CacheResult cacheResult0 = mock(CacheResult.class, new ViolatedAssumptionAnswer());
      CachePut cachePut0 = mock(CachePut.class, new ViolatedAssumptionAnswer());
      CacheRemove cacheRemove0 = mock(CacheRemove.class, new ViolatedAssumptionAnswer());
      CDIJCacheHelper.MethodMeta cDIJCacheHelper_MethodMeta0 = new CDIJCacheHelper.MethodMeta(classArray0, linkedList0, linkedHashSet0, integerArray0, integer0, integerArray0, "48H|", cacheResolverFactoryImpl0, (CacheKeyGenerator) null, cacheResult0, "48H|", cacheResolverFactoryImpl0, (CacheKeyGenerator) null, true, cachePut0, "48H|", cacheResolverFactoryImpl0, (CacheKeyGenerator) null, true, cacheRemove0, "48H|", cacheResolverFactoryImpl0, true, (CacheRemoveAll) null);
      CacheKeyInvocationContextImpl<Annotation> cacheKeyInvocationContextImpl0 = new CacheKeyInvocationContextImpl<Annotation>(invocationContext0, (Annotation) null, "48H|", cDIJCacheHelper_MethodMeta0);
      // Undeclared exception!
      try { 
        cacheKeyInvocationContextImpl0.getValueParameter();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jcs3.jcache.cdi.CacheInvocationContextImpl", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      doReturn((Object[]) null).when(invocationContext0).getParameters();
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 3);
      LinkedList<Set<Annotation>> linkedList0 = new LinkedList<Set<Annotation>>();
      LinkedHashSet<Annotation> linkedHashSet0 = new LinkedHashSet<Annotation>();
      Integer[] integerArray0 = new Integer[0];
      Integer integer0 = new Integer(0);
      CacheResolverFactoryImpl cacheResolverFactoryImpl0 = new CacheResolverFactoryImpl();
      CacheResult cacheResult0 = mock(CacheResult.class, new ViolatedAssumptionAnswer());
      CachePut cachePut0 = mock(CachePut.class, new ViolatedAssumptionAnswer());
      CacheRemove cacheRemove0 = mock(CacheRemove.class, new ViolatedAssumptionAnswer());
      CDIJCacheHelper.MethodMeta cDIJCacheHelper_MethodMeta0 = new CDIJCacheHelper.MethodMeta(classArray0, linkedList0, linkedHashSet0, integerArray0, integer0, integerArray0, "48H|", cacheResolverFactoryImpl0, (CacheKeyGenerator) null, cacheResult0, "48H|", cacheResolverFactoryImpl0, (CacheKeyGenerator) null, true, cachePut0, "48H|", cacheResolverFactoryImpl0, (CacheKeyGenerator) null, true, cacheRemove0, "48H|", cacheResolverFactoryImpl0, true, (CacheRemoveAll) null);
      CacheKeyInvocationContextImpl<Annotation> cacheKeyInvocationContextImpl0 = new CacheKeyInvocationContextImpl<Annotation>(invocationContext0, (Annotation) null, "48H|", cDIJCacheHelper_MethodMeta0);
      CacheInvocationParameter[] cacheInvocationParameterArray0 = cacheKeyInvocationContextImpl0.getKeyParameters();
      CacheInvocationParameter[] cacheInvocationParameterArray1 = cacheKeyInvocationContextImpl0.getKeyParameters();
      ;
}
}
