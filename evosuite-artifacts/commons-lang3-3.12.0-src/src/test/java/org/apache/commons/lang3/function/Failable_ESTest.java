/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:12:16 GMT 2022
 */

package org.apache.commons.lang3.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.reflect.Array;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.apache.commons.lang3.function.Failable;
import org.apache.commons.lang3.function.FailableBiConsumer;
import org.apache.commons.lang3.function.FailableBiFunction;
import org.apache.commons.lang3.function.FailableBiPredicate;
import org.apache.commons.lang3.function.FailableBooleanSupplier;
import org.apache.commons.lang3.function.FailableCallable;
import org.apache.commons.lang3.function.FailableConsumer;
import org.apache.commons.lang3.function.FailableDoubleBinaryOperator;
import org.apache.commons.lang3.function.FailableDoubleConsumer;
import org.apache.commons.lang3.function.FailableDoubleSupplier;
import org.apache.commons.lang3.function.FailableFunction;
import org.apache.commons.lang3.function.FailableIntConsumer;
import org.apache.commons.lang3.function.FailableIntSupplier;
import org.apache.commons.lang3.function.FailableLongConsumer;
import org.apache.commons.lang3.function.FailableLongSupplier;
import org.apache.commons.lang3.function.FailablePredicate;
import org.apache.commons.lang3.function.FailableRunnable;
import org.apache.commons.lang3.function.FailableShortSupplier;
import org.apache.commons.lang3.function.FailableSupplier;
import org.apache.commons.lang3.stream.Streams;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.evosuite.runtime.mock.java.lang.MockError;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Failable_ESTest extends Failable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FailableRunnable<RuntimeException> failableRunnable0 = (FailableRunnable<RuntimeException>) mock(FailableRunnable.class, new ViolatedAssumptionAnswer());
      FailableRunnable<Error> failableRunnable1 = (FailableRunnable<Error>) mock(FailableRunnable.class, new ViolatedAssumptionAnswer());
      FailableConsumer<Throwable, Error> failableConsumer0 = FailableConsumer.nop();
      FailableRunnable<RuntimeException>[] failableRunnableArray0 = (FailableRunnable<RuntimeException>[]) Array.newInstance(FailableRunnable.class, 3);
      failableRunnableArray0[0] = failableRunnable0;
      failableRunnableArray0[1] = failableRunnable0;
      failableRunnableArray0[2] = failableRunnable0;
      Failable.tryWithResources(failableRunnable1, failableConsumer0, failableRunnableArray0);
      assertEquals(3, failableRunnableArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FailableBiConsumer<String, Stream<Integer>, Error> failableBiConsumer0 = FailableBiConsumer.nop();
      Integer integer0 = new Integer(4129);
      UnaryOperator<Integer> unaryOperator0 = UnaryOperator.identity();
      Stream<Integer> stream0 = Stream.iterate(integer0, unaryOperator0);
      Failable.accept(failableBiConsumer0, "", stream0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FailableIntConsumer<Error> failableIntConsumer0 = FailableIntConsumer.nop();
      Failable.accept(failableIntConsumer0, (-4371));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FailableDoubleConsumer<Error> failableDoubleConsumer0 = FailableDoubleConsumer.nop();
      Failable.accept(failableDoubleConsumer0, (-3111.89000856));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FailableFunction<Integer, Stream<Integer>, Error> failableFunction0 = FailableFunction.nop();
      FailableFunction<Object, Integer, Error> failableFunction1 = FailableFunction.nop();
      FailableFunction<RuntimeException, Stream<Integer>, Error> failableFunction2 = failableFunction0.compose((FailableFunction<? super RuntimeException, ? extends Integer, Error>) failableFunction1);
      FailablePredicate<Object, Error> failablePredicate0 = FailablePredicate.falsePredicate();
      boolean boolean0 = Failable.test(failablePredicate0, (Object) failableFunction2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FailableBiPredicate<String, Integer, Error> failableBiPredicate0 = FailableBiPredicate.falsePredicate();
      Integer integer0 = new Integer(1);
      boolean boolean0 = Failable.test(failableBiPredicate0, "9#yh2R", integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FailableShortSupplier<RuntimeException> failableShortSupplier0 = (FailableShortSupplier<RuntimeException>) mock(FailableShortSupplier.class, new ViolatedAssumptionAnswer());
      doReturn((short)0).when(failableShortSupplier0).getAsShort();
      short short0 = Failable.getAsShort(failableShortSupplier0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FailableShortSupplier<RuntimeException> failableShortSupplier0 = (FailableShortSupplier<RuntimeException>) mock(FailableShortSupplier.class, new ViolatedAssumptionAnswer());
      doReturn((short) (-1)).when(failableShortSupplier0).getAsShort();
      short short0 = Failable.getAsShort(failableShortSupplier0);
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FailableLongSupplier<RuntimeException> failableLongSupplier0 = (FailableLongSupplier<RuntimeException>) mock(FailableLongSupplier.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(failableLongSupplier0).getAsLong();
      long long0 = Failable.getAsLong(failableLongSupplier0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FailableLongSupplier<Throwable> failableLongSupplier0 = (FailableLongSupplier<Throwable>) mock(FailableLongSupplier.class, new ViolatedAssumptionAnswer());
      doReturn((-1L)).when(failableLongSupplier0).getAsLong();
      long long0 = Failable.getAsLong(failableLongSupplier0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FailableIntSupplier<Throwable> failableIntSupplier0 = (FailableIntSupplier<Throwable>) mock(FailableIntSupplier.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(failableIntSupplier0).getAsInt();
      int int0 = Failable.getAsInt(failableIntSupplier0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FailableIntSupplier<RuntimeException> failableIntSupplier0 = (FailableIntSupplier<RuntimeException>) mock(FailableIntSupplier.class, new ViolatedAssumptionAnswer());
      doReturn((-934)).when(failableIntSupplier0).getAsInt();
      int int0 = Failable.getAsInt(failableIntSupplier0);
      assertEquals((-934), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FailableDoubleSupplier<Throwable> failableDoubleSupplier0 = (FailableDoubleSupplier<Throwable>) mock(FailableDoubleSupplier.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(failableDoubleSupplier0).getAsDouble();
      double double0 = Failable.getAsDouble(failableDoubleSupplier0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FailableDoubleSupplier<RuntimeException> failableDoubleSupplier0 = (FailableDoubleSupplier<RuntimeException>) mock(FailableDoubleSupplier.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0)).when(failableDoubleSupplier0).getAsDouble();
      double double0 = Failable.getAsDouble(failableDoubleSupplier0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FailableBooleanSupplier<Throwable> failableBooleanSupplier0 = (FailableBooleanSupplier<Throwable>) mock(FailableBooleanSupplier.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(failableBooleanSupplier0).getAsBoolean();
      boolean boolean0 = Failable.getAsBoolean(failableBooleanSupplier0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FailableLongSupplier<RuntimeException> failableLongSupplier0 = (FailableLongSupplier<RuntimeException>) mock(FailableLongSupplier.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(failableLongSupplier0).toString();
      FailableSupplier<Object, Error> failableSupplier0 = (FailableSupplier<Object, Error>) mock(FailableSupplier.class, new ViolatedAssumptionAnswer());
      doReturn(failableLongSupplier0).when(failableSupplier0).get();
      Object object0 = Failable.get(failableSupplier0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockIOException mockIOException0 = new MockIOException("", (Throwable) null);
      FailableCallable<Object, RuntimeException> failableCallable0 = (FailableCallable<Object, RuntimeException>) mock(FailableCallable.class, new ViolatedAssumptionAnswer());
      doReturn(mockIOException0).when(failableCallable0).call();
      Object object0 = Failable.call(failableCallable0);
      assertSame(object0, mockIOException0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FailableDoubleBinaryOperator<Throwable> failableDoubleBinaryOperator0 = (FailableDoubleBinaryOperator<Throwable>) mock(FailableDoubleBinaryOperator.class, new ViolatedAssumptionAnswer());
      doReturn((double)(short)8).when(failableDoubleBinaryOperator0).applyAsDouble(anyDouble() , anyDouble());
      double double0 = Failable.applyAsDouble(failableDoubleBinaryOperator0, 1140.0, 1140.0);
      assertEquals(8.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FailableDoubleBinaryOperator<Error> failableDoubleBinaryOperator0 = (FailableDoubleBinaryOperator<Error>) mock(FailableDoubleBinaryOperator.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0)).when(failableDoubleBinaryOperator0).applyAsDouble(anyDouble() , anyDouble());
      double double0 = Failable.applyAsDouble(failableDoubleBinaryOperator0, 1854.472173838, 1118.29);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FailableFunction<IOException, IOException, RuntimeException> failableFunction0 = FailableFunction.identity();
      MockIOException mockIOException0 = new MockIOException("8kCK,W]&V", (Throwable) null);
      IOException iOException0 = Failable.apply(failableFunction0, (IOException) mockIOException0);
      assertSame(mockIOException0, iOException0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Failable.test((FailablePredicate<Object, RuntimeException>) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.function.Failable", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Failable.stream((Collection<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.function.Failable", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Failable.run((FailableRunnable<Throwable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.function.Failable", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        Failable.rethrow((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // throwable
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        Failable.getAsShort((FailableShortSupplier<Error>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.function.Failable", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        Failable.getAsLong((FailableLongSupplier<Error>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.function.Failable", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        Failable.getAsInt((FailableIntSupplier<Throwable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.function.Failable", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        Failable.getAsDouble((FailableDoubleSupplier<RuntimeException>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.function.Failable", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        Failable.getAsBoolean((FailableBooleanSupplier<RuntimeException>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.function.Failable", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        Failable.get((FailableSupplier<Error, Throwable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.function.Failable", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        Failable.call((FailableCallable<String, RuntimeException>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.function.Failable", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        Failable.applyAsDouble((FailableDoubleBinaryOperator<RuntimeException>) null, 0.0, (-3754.73049));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.function.Failable", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockError mockError0 = new MockError("(L.x");
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException();
      // Undeclared exception!
      try { 
        Failable.apply((FailableBiFunction<Throwable, RuntimeException, Stream<Object>, Error>) null, (Throwable) mockError0, (RuntimeException) mockRuntimeException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.function.Failable", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        Failable.accept((FailableLongConsumer<RuntimeException>) null, (-1L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.function.Failable", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        Failable.accept((FailableConsumer<String, RuntimeException>) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.function.Failable", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FailableRunnable<Throwable> failableRunnable0 = (FailableRunnable<Throwable>) mock(FailableRunnable.class, new ViolatedAssumptionAnswer());
      FailableRunnable<Throwable>[] failableRunnableArray0 = (FailableRunnable<Throwable>[]) Array.newInstance(FailableRunnable.class, 4);
      failableRunnableArray0[0] = failableRunnable0;
      failableRunnableArray0[1] = failableRunnable0;
      failableRunnableArray0[2] = failableRunnable0;
      failableRunnableArray0[3] = failableRunnable0;
      Failable.tryWithResources(failableRunnable0, (FailableConsumer<Throwable, ? extends Throwable>) null, failableRunnableArray0);
      assertEquals(4, failableRunnableArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FailableRunnable<Throwable> failableRunnable0 = (FailableRunnable<Throwable>) mock(FailableRunnable.class, new ViolatedAssumptionAnswer());
      FailableRunnable<Throwable>[] failableRunnableArray0 = (FailableRunnable<Throwable>[]) Array.newInstance(FailableRunnable.class, 4);
      // Undeclared exception!
      try { 
        Failable.tryWithResources(failableRunnable0, (FailableConsumer<Throwable, ? extends Throwable>) null, failableRunnableArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // runnable
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        Failable.tryWithResources((FailableRunnable<? extends Throwable>) null, (FailableConsumer<Throwable, ? extends Throwable>) null, (FailableRunnable<? extends Throwable>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.function.Failable", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException();
      // Undeclared exception!
      try { 
        Failable.rethrow(mockRuntimeException0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FailableBooleanSupplier<Throwable> failableBooleanSupplier0 = (FailableBooleanSupplier<Throwable>) mock(FailableBooleanSupplier.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(failableBooleanSupplier0).getAsBoolean();
      boolean boolean0 = Failable.getAsBoolean(failableBooleanSupplier0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FailableRunnable<Error> failableRunnable0 = (FailableRunnable<Error>) mock(FailableRunnable.class, new ViolatedAssumptionAnswer());
      Failable.run(failableRunnable0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FailableDoubleSupplier<Throwable> failableDoubleSupplier0 = (FailableDoubleSupplier<Throwable>) mock(FailableDoubleSupplier.class, new ViolatedAssumptionAnswer());
      doReturn(1.0).when(failableDoubleSupplier0).getAsDouble();
      double double0 = Failable.getAsDouble(failableDoubleSupplier0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FailableSupplier<String, Throwable> failableSupplier0 = (FailableSupplier<String, Throwable>) mock(FailableSupplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(failableSupplier0).get();
      String string0 = Failable.get(failableSupplier0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FailableConsumer<Throwable, Throwable> failableConsumer0 = FailableConsumer.nop();
      FailableRunnable<RuntimeException>[] failableRunnableArray0 = (FailableRunnable<RuntimeException>[]) Array.newInstance(FailableRunnable.class, 0);
      Failable.tryWithResources((FailableRunnable<? extends Throwable>) null, failableConsumer0, failableRunnableArray0);
      assertEquals(0, failableRunnableArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FailableRunnable<RuntimeException> failableRunnable0 = (FailableRunnable<RuntimeException>) mock(FailableRunnable.class, new ViolatedAssumptionAnswer());
      FailableRunnable<RuntimeException>[] failableRunnableArray0 = (FailableRunnable<RuntimeException>[]) Array.newInstance(FailableRunnable.class, 7);
      failableRunnableArray0[0] = failableRunnable0;
      failableRunnableArray0[1] = failableRunnable0;
      failableRunnableArray0[2] = failableRunnable0;
      failableRunnableArray0[3] = failableRunnable0;
      failableRunnableArray0[4] = failableRunnable0;
      failableRunnableArray0[5] = failableRunnable0;
      failableRunnableArray0[6] = failableRunnable0;
      Failable.tryWithResources(failableRunnable0, failableRunnableArray0);
      assertEquals(7, failableRunnableArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      // Undeclared exception!
      try { 
        Failable.rethrow(mockThrowable0);
        fail("Expecting exception: UndeclaredThrowableException");
      
      } catch(UndeclaredThrowableException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.function.Failable", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockError mockError0 = new MockError("org.apache.commons.lang3.function.FailableBiPredicate");
      // Undeclared exception!
      try { 
        Failable.rethrow(mockError0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MockIOException mockIOException0 = new MockIOException();
      // Undeclared exception!
      try { 
        Failable.rethrow(mockIOException0);
        fail("Expecting exception: UncheckedIOException");
      
      } catch(UncheckedIOException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable
         //
         verifyException("org.apache.commons.lang3.function.Failable", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FailableBiConsumer<Error, IntStream, IOException> failableBiConsumer0 = FailableBiConsumer.nop();
      BiConsumer<Error, IntStream> biConsumer0 = Failable.asBiConsumer((FailableBiConsumer<Error, IntStream, ?>) failableBiConsumer0);
      assertNotNull(biConsumer0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Consumer<Locale.LanguageRange> consumer0 = Failable.asConsumer((FailableConsumer<Locale.LanguageRange, ?>) null);
      assertNotNull(consumer0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FailableBiPredicate<Error, String, RuntimeException> failableBiPredicate0 = FailableBiPredicate.falsePredicate();
      BiPredicate<Error, String> biPredicate0 = Failable.asBiPredicate((FailableBiPredicate<Error, String, ?>) failableBiPredicate0);
      assertNotNull(biPredicate0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FailableRunnable<Error> failableRunnable0 = (FailableRunnable<Error>) mock(FailableRunnable.class, new ViolatedAssumptionAnswer());
      Runnable runnable0 = Failable.asRunnable(failableRunnable0);
      assertNotNull(runnable0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FailableBiFunction<Throwable, Integer, Throwable, IOException> failableBiFunction0 = FailableBiFunction.nop();
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException();
      MockError mockError0 = new MockError(mockRuntimeException0);
      MockIOException mockIOException0 = new MockIOException(mockError0);
      Throwable throwable0 = Failable.apply(failableBiFunction0, (Throwable) mockIOException0, (Integer) null);
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FailableCallable<RuntimeException, Throwable> failableCallable0 = (FailableCallable<RuntimeException, Throwable>) mock(FailableCallable.class, new ViolatedAssumptionAnswer());
      Callable<RuntimeException> callable0 = Failable.asCallable((FailableCallable<RuntimeException, ?>) failableCallable0);
      assertNotNull(callable0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedList<RuntimeException> linkedList0 = new LinkedList<RuntimeException>();
      Streams.FailableStream<RuntimeException> streams_FailableStream0 = Failable.stream((Collection<RuntimeException>) linkedList0);
      assertNotNull(streams_FailableStream0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try { 
        Failable.accept((FailableIntConsumer<RuntimeException>) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.function.Failable", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FailableLongConsumer<Error> failableLongConsumer0 = FailableLongConsumer.nop();
      Failable.accept(failableLongConsumer0, (long) 871);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FailableBiFunction<Object, IOException, Integer, IOException> failableBiFunction0 = FailableBiFunction.nop();
      BiFunction<Object, IOException, Integer> biFunction0 = Failable.asBiFunction((FailableBiFunction<Object, IOException, Integer, ?>) failableBiFunction0);
      assertNotNull(biFunction0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FailablePredicate<RuntimeException, Error> failablePredicate0 = FailablePredicate.truePredicate();
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException((Throwable) null);
      boolean boolean0 = Failable.test(failablePredicate0, (RuntimeException) mockRuntimeException0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FailableBiPredicate<Integer, Object, RuntimeException> failableBiPredicate0 = FailableBiPredicate.truePredicate();
      Integer integer0 = new Integer((-393));
      boolean boolean0 = Failable.test(failableBiPredicate0, integer0, (Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FailableFunction<Integer, String, IOException> failableFunction0 = FailableFunction.nop();
      Function<Integer, String> function0 = Failable.asFunction((FailableFunction<Integer, String, ?>) failableFunction0);
      assertNotNull(function0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FailablePredicate<Object, Error> failablePredicate0 = FailablePredicate.truePredicate();
      Predicate<Object> predicate0 = Failable.asPredicate((FailablePredicate<Object, ?>) failablePredicate0);
      assertNotNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      // Undeclared exception!
      try { 
        Failable.accept((FailableDoubleConsumer<Error>) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.function.Failable", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FailableLongSupplier<Error> failableLongSupplier0 = (FailableLongSupplier<Error>) mock(FailableLongSupplier.class, new ViolatedAssumptionAnswer());
      doReturn((long)(short)871).when(failableLongSupplier0).getAsLong();
      long long0 = Failable.getAsLong(failableLongSupplier0);
      assertEquals(871L, long0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FailableRunnable<RuntimeException> failableRunnable0 = (FailableRunnable<RuntimeException>) mock(FailableRunnable.class, new ViolatedAssumptionAnswer());
      FailableRunnable<RuntimeException>[] failableRunnableArray0 = (FailableRunnable<RuntimeException>[]) Array.newInstance(FailableRunnable.class, 7);
      // Undeclared exception!
      try { 
        Failable.tryWithResources(failableRunnable0, failableRunnableArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // runnable
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      FailableConsumer<Throwable, RuntimeException> failableConsumer0 = FailableConsumer.nop();
      MockError mockError0 = new MockError("org.apache.commons.lang3.function.FailablePredicate");
      Failable.accept(failableConsumer0, (Throwable) mockError0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FailableIntSupplier<RuntimeException> failableIntSupplier0 = (FailableIntSupplier<RuntimeException>) mock(FailableIntSupplier.class, new ViolatedAssumptionAnswer());
      doReturn(8).when(failableIntSupplier0).getAsInt();
      int int0 = Failable.getAsInt(failableIntSupplier0);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FailableFunction<RuntimeException, Object, RuntimeException> failableFunction0 = FailableFunction.nop();
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException("org.apache.commons.lang3.function.FailablePredicate");
      Object object0 = Failable.apply(failableFunction0, (RuntimeException) mockRuntimeException0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      FailableDoubleBinaryOperator<IOException> failableDoubleBinaryOperator0 = (FailableDoubleBinaryOperator<IOException>) mock(FailableDoubleBinaryOperator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(failableDoubleBinaryOperator0).applyAsDouble(anyDouble() , anyDouble());
      double double0 = Failable.applyAsDouble(failableDoubleBinaryOperator0, 0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      FailableShortSupplier<IOException> failableShortSupplier0 = (FailableShortSupplier<IOException>) mock(FailableShortSupplier.class, new ViolatedAssumptionAnswer());
      doReturn((short)871).when(failableShortSupplier0).getAsShort();
      short short0 = Failable.getAsShort(failableShortSupplier0);
      assertEquals((short)871, short0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Integer integer0 = new Integer((-493));
      Stream<Integer> stream0 = Stream.of(integer0);
      Streams.FailableStream<Integer> streams_FailableStream0 = Failable.stream(stream0);
      assertNotNull(streams_FailableStream0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      FailableCallable<Error, Throwable> failableCallable0 = (FailableCallable<Error, Throwable>) mock(FailableCallable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(failableCallable0).call();
      Error error0 = Failable.call(failableCallable0);
      assertNull(error0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Supplier<IntStream> supplier0 = Failable.asSupplier((FailableSupplier<IntStream, ?>) null);
      assertNotNull(supplier0);
  }
}
