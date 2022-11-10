/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 20:23:37 GMT 2022
 */

package org.apache.commons.numbers.combinatorics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.function.Consumer;
import org.apache.commons.numbers.combinatorics.Combinations;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Combinations_ESTest extends Combinations_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Combinations combinations0 = Combinations.of(0, 0);
      combinations0.spliterator();
      combinations0.comparator();
      combinations0.iterator();
      combinations0.spliterator();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      combinations0.forEach(consumer0);
      combinations0.getN();
      Combinations combinations1 = Combinations.of(0, 0);
      combinations0.comparator();
      combinations0.getN();
      Combinations combinations2 = Combinations.of(4844, 0);
      combinations0.comparator();
      combinations1.getK();
      Combinations combinations3 = Combinations.of(0, 0);
      Consumer<Object> consumer1 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      combinations3.forEach(consumer1);
      combinations3.getK();
      combinations2.comparator();
      Combinations combinations4 = Combinations.of(3833, 312);
      Consumer<Object> consumer2 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      combinations4.spliterator();
      // Undeclared exception!
      combinations4.forEach(consumer2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Combinations combinations0 = Combinations.of(41, 41);
      combinations0.spliterator();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      combinations0.forEach(consumer0);
      combinations0.getK();
      combinations0.getK();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Combinations combinations0 = Combinations.of(0, 0);
      combinations0.spliterator();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      combinations0.forEach(consumer0);
      combinations0.iterator();
      combinations0.getK();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Combinations combinations0 = Combinations.of(2273, 2273);
      combinations0.comparator();
      combinations0.getK();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Combinations combinations0 = Combinations.of(0, 0);
      combinations0.getN();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Combinations combinations0 = Combinations.of(1433, 1183);
      combinations0.spliterator();
      combinations0.comparator();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Combinations combinations0 = Combinations.of(1525, 1525);
      combinations0.iterator();
      combinations0.getN();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Combinations.of((-3087), (-3087));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number -3,087 is negative
         //
         verifyException("org.apache.commons.numbers.combinatorics.BinomialCoefficient", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Combinations combinations0 = Combinations.of(1449, 0);
      combinations0.getK();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Combinations combinations0 = Combinations.of(2358, 1046);
      combinations0.comparator();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Combinations combinations0 = Combinations.of(0, 0);
      combinations0.iterator();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Combinations.of(365, 365);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Combinations.of((-567), (-567));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number -567 is negative
         //
         verifyException("org.apache.commons.numbers.combinatorics.BinomialCoefficient", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Combinations combinations0 = Combinations.of(1439, 1);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      combinations0.forEach(consumer0);
      // Undeclared exception!
      try { 
        combinations0.forEach((Consumer<? super int[]>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Combinations combinations0 = Combinations.of(0, 0);
      combinations0.spliterator();
      combinations0.comparator();
      combinations0.iterator();
      combinations0.spliterator();
      combinations0.getN();
      Combinations combinations1 = Combinations.of(0, 0);
      combinations1.comparator();
      combinations0.getN();
      Combinations combinations2 = Combinations.of(4829, 0);
      combinations0.comparator();
      combinations1.getK();
      Combinations combinations3 = Combinations.of(0, 0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      combinations3.forEach(consumer0);
      combinations3.getK();
      combinations2.comparator();
      Combinations combinations4 = Combinations.of(3833, 312);
      Consumer<Object> consumer1 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      combinations4.spliterator();
      // Undeclared exception!
      combinations4.forEach(consumer1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = 2716;
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      Combinations.of(2716, 2716);
      Combinations combinations0 = Combinations.of(2716, 2716);
      Consumer<Object> consumer1 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      combinations0.forEach(consumer1);
      // Undeclared exception!
      try { 
        Combinations.of(0, 2716);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number 2,716 is out of range [0, 0]
         //
         verifyException("org.apache.commons.numbers.combinatorics.BinomialCoefficient", e);
      }
  }
}
