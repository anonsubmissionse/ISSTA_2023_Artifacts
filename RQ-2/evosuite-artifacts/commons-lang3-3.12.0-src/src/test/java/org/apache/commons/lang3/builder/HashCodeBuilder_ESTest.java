/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 17:57:55 GMT 2022
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.IDKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HashCodeBuilder_ESTest extends HashCodeBuilder_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode((-1756), (-531), object0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // HashCodeBuilder requires an odd initial value
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder((-3489), (-3489));
      hashCodeBuilder0.hashCode();
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append(0L);
      HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder1.append('F');
      hashCodeBuilder2.append((byte)17);
      short[] shortArray0 = new short[4];
      hashCodeBuilder1.append(shortArray0);
      int int0 = hashCodeBuilder0.toHashCode();
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      Class<Object> class0 = Object.class;
      String[] stringArray0 = new String[0];
      int int0 = HashCodeBuilder.reflectionHashCode((-1), (-1), (Object) hashCodeBuilder0, false, (Class<? super Object>) class0, stringArray0);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      Class<Object> class0 = Object.class;
      String[] stringArray0 = new String[0];
      int int0 = HashCodeBuilder.reflectionHashCode((-1), (-1), (Object) hashCodeBuilder0, false, (Class<? super Object>) class0, stringArray0);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      Class<Object> class0 = Object.class;
      String[] stringArray0 = new String[7];
      int int0 = HashCodeBuilder.reflectionHashCode((int) 1, (int)  (-1), linkedHashSet0, false, (Class<? super LinkedHashSet<Object>>) class0, stringArray0);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      int int0 = HashCodeBuilder.reflectionHashCode((-1), (-1), (Object) hashCodeBuilder0, false);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      int int0 = HashCodeBuilder.reflectionHashCode((-1), (-1), (Object) hashCodeBuilder0, false);
      assertEquals(0, hashCodeBuilder0.toHashCode());
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      int int0 = HashCodeBuilder.reflectionHashCode(87, (int) (short) (-4721), (Object) hashCodeBuilder0, true);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      int int0 = HashCodeBuilder.reflectionHashCode(87, (int) (short) (-4721), (Object) hashCodeBuilder0, true);
      assertEquals(0, hashCodeBuilder0.toHashCode());
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      int int0 = HashCodeBuilder.reflectionHashCode(87, (int) (short) (-4721), (Object) hashCodeBuilder0, true);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      int int1 = HashCodeBuilder.reflectionHashCode((Object) "HashCodeBuilder requires an odd multiplier", (Collection<String>) linkedHashSet0);
      assertEquals(0, int1);
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      int int0 = HashCodeBuilder.reflectionHashCode((-485), (-485), object0);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = HashCodeBuilder.isRegistered(object0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append(1012.8);
      hashCodeBuilder0.build();
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append(true);
      HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('B');
      hashCodeBuilder2.append((byte) (-7));
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)3;
      byteArray0[1] = (byte)65;
      byteArray0[2] = (byte)32;
      hashCodeBuilder1.append(byteArray0);
      hashCodeBuilder0.build();
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append((-864.177F));
      Integer integer0 = hashCodeBuilder1.build();
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(831, Integer.MAX_VALUE);
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append((-2728L));
      HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder1.append(false);
      long[] longArray0 = new long[12];
      longArray0[1] = (long) Integer.MAX_VALUE;
      longArray0[4] = (long) 831;
      longArray0[5] = (-2728L);
      longArray0[7] = (long) 831;
      longArray0[8] = (long) 831;
      HashCodeBuilder hashCodeBuilder3 = hashCodeBuilder2.append(longArray0);
      hashCodeBuilder3.append((boolean[]) null);
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(831, Integer.MAX_VALUE);
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append((-2728L));
      HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder1.append(false);
      long[] longArray0 = new long[12];
      longArray0[1] = (long) Integer.MAX_VALUE;
      longArray0[4] = (long) 831;
      longArray0[5] = (-2728L);
      longArray0[7] = (long) 831;
      longArray0[8] = (long) 831;
      HashCodeBuilder hashCodeBuilder3 = hashCodeBuilder2.append(longArray0);
      hashCodeBuilder3.append((boolean[]) null);
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append((short)37);
      hashCodeBuilder1.append((-3309.0F));
      byte[] byteArray0 = new byte[7];
      HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder1.append(byteArray0);
      boolean[] booleanArray0 = new boolean[2];
      hashCodeBuilder2.append(booleanArray0);
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append((short)37);
      hashCodeBuilder1.append((-3309.0F));
      byte[] byteArray0 = new byte[7];
      HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder1.append(byteArray0);
      boolean[] booleanArray0 = new boolean[2];
      hashCodeBuilder2.append(booleanArray0);
      assertEquals(1, hashCodeBuilder0.toHashCode());
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append((-2323L));
      HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder1.append((short) (-655));
      long[] longArray0 = new long[9];
      longArray0[0] = (-2323L);
      longArray0[1] = (long) (short) (-655);
      longArray0[2] = (-2323L);
      longArray0[4] = (-2323L);
      hashCodeBuilder2.append(longArray0);
      hashCodeBuilder1.append((Object[]) null);
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder((-1), (-1));
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append((-1));
      long[] longArray0 = new long[7];
      hashCodeBuilder1.append(longArray0);
      ;
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder((-1), (-1));
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append((-1));
      long[] longArray0 = new long[7];
      hashCodeBuilder1.append(longArray0);
      ;
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(2889, Integer.MAX_VALUE);
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append(Integer.MAX_VALUE);
      HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder1.appendSuper(Integer.MAX_VALUE);
      int[] intArray0 = new int[1];
      intArray0[0] = 2889;
      hashCodeBuilder2.append(intArray0);
      ;
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      float[] floatArray0 = new float[6];
      floatArray0[1] = 509.0F;
      floatArray0[5] = 190.8739F;
      hashCodeBuilder0.append(floatArray0);
      hashCodeBuilder0.append((int[]) null);
      assertEquals(0, hashCodeBuilder0.toHashCode());
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      double[] doubleArray0 = new double[6];
      hashCodeBuilder0.append((-47.867916F));
      hashCodeBuilder0.append(doubleArray0);
      ;
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((-864.177F));
      char[] charArray0 = new char[2];
      hashCodeBuilder0.append(charArray0);
      assertEquals(0, hashCodeBuilder0.toHashCode());
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append((-2323L));
      HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder1.append((short) (-655));
      long[] longArray0 = new long[9];
      longArray0[0] = (-2323L);
      longArray0[1] = (long) (short) (-655);
      longArray0[2] = (-2323L);
      longArray0[4] = (-2323L);
      HashCodeBuilder hashCodeBuilder3 = hashCodeBuilder2.append(longArray0);
      hashCodeBuilder3.append(false);
      ;
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(1, 1);
      hashCodeBuilder0.append((short) (-1));
      assertEquals(1, hashCodeBuilder0.toHashCode());
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(Integer.MAX_VALUE, Integer.MAX_VALUE);
      hashCodeBuilder0.append((-1.0F));
      Object object0 = new Object();
      hashCodeBuilder0.append(object0);
      assertEquals(0, hashCodeBuilder0.toHashCode());
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append(0);
      assertEquals(0, hashCodeBuilder0.toHashCode());
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append(0.0F);
      ;
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder((-1), (-1));
      hashCodeBuilder0.append(1279.28761);
      assertEquals(0, hashCodeBuilder0.toHashCode());
}
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append((short) (-4721));
      HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder1.append('J');
      ;
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode((Object) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // object
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode((Object) null, false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // object
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<Field> class0 = Field.class;
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode(1333, 32, (Field) null, false, (Class<? super Field>) class0, stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // object
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode((int)  (-4721), 64, "xj~25C4z]g", true, (Class<? super String>) class0, stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // HashCodeBuilder requires an odd multiplier
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Set<IDKey> set0 = HashCodeBuilder.getRegistry();
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode(0, (-777), (Object) set0, true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // object
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = new Object();
      IDKey iDKey0 = new IDKey(object0);
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode(0, 0, (Object) iDKey0, false);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // HashCodeBuilder requires an odd initial value
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode((-1856), (-1856), (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // object
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append((Object) null);
      assertEquals(1, hashCodeBuilder1.toHashCode());
}
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder((-1), (-1));
      char[] charArray0 = new char[9];
      hashCodeBuilder0.append(charArray0);
      ;
}
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = null;
      try {
        hashCodeBuilder0 = new HashCodeBuilder((-1904), 1);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // HashCodeBuilder requires an odd initial value
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder((-1), (-1));
      hashCodeBuilder0.append((-1));
      hashCodeBuilder0.append(true);
      assertEquals(0, hashCodeBuilder0.toHashCode());
}
 @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String[] stringArray0 = new String[8];
      int int0 = HashCodeBuilder.reflectionHashCode((Object) "', is neither of type Map.Entry nor an Array", stringArray0);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      int int0 = hashCodeBuilder0.toHashCode();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((-3309.0F));
      hashCodeBuilder0.append((byte)0);
      ;
}
 @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(17, 17);
      hashCodeBuilder0.append((short[]) null);
      ;
}
 @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((Object[]) null);
      assertEquals(0, hashCodeBuilder0.toHashCode());
}
 @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String[] stringArray0 = new String[2];
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(995013625, Integer.MAX_VALUE);
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append((Object[]) stringArray0);
      ;
}
 @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((long[]) null);
      ;
}
 @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      long[] longArray0 = new long[7];
      hashCodeBuilder0.append(longArray0);
      ;
}
 @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(17, 17);
      hashCodeBuilder0.append((int[]) null);
      ;
}
 @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((float[]) null);
      ;
}
 @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((double[]) null);
      assertEquals(0, hashCodeBuilder0.toHashCode());
}
 @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((char[]) null);
      assertEquals(0, hashCodeBuilder0.toHashCode());
}
 @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((byte[]) null);
      ;
}
 @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((boolean[]) null);
      ;
}
 @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = null;
      try {
        hashCodeBuilder0 = new HashCodeBuilder((-2393), 32);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // HashCodeBuilder requires an odd multiplier
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }
 @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      Class<Object> class0 = Object.class;
      String[] stringArray0 = new String[3];
      int int0 = HashCodeBuilder.reflectionHashCode((int)  (-99), 1, linkedHashSet0, false, (Class<? super LinkedHashSet<Object>>) class0, stringArray0);
      ;
}
 @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Object object0 = new Object();
      int int0 = HashCodeBuilder.reflectionHashCode((-485), (-485), object0, true);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      int int0 = HashCodeBuilder.reflectionHashCode((Object) "-N4Fznk4]j1WBF{MMG", false);
      ;
}
 @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      int int0 = HashCodeBuilder.reflectionHashCode((Object) "}", (Collection<String>) linkedHashSet0);
      ;
}
 @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode((Object) null, (Collection<String>) linkedList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // object
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.appendSuper((short) (-3));
      assertEquals(0, hashCodeBuilder1.toHashCode());
}
}
