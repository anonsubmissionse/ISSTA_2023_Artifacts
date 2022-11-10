/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 03:53:26 GMT 2022
 */

package org.springside.modules.utils.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springside.modules.utils.base.MoreValidate;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MoreValidate_ESTest extends MoreValidate_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreValidate.positive("", (-1135.042));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         //  (-1135.042) must be >= 0
         //
         verifyException("org.springside.modules.utils.base.MoreValidate", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Long long0 = new Long((-2008L));
      // Undeclared exception!
      try { 
        MoreValidate.positive("<zw~Y2td&ETXvc$ u", long0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // <zw~Y2td&ETXvc$ u (-2008) must be > 0
         //
         verifyException("org.springside.modules.utils.base.MoreValidate", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreValidate.positive("I)O^8h^wyO+", 0L);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // I)O^8h^wyO+ (0) must be > 0
         //
         verifyException("org.springside.modules.utils.base.MoreValidate", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        MoreValidate.positive("(zCKj&.]fy", integer0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // (zCKj&.]fy (0) must be > 0
         //
         verifyException("org.springside.modules.utils.base.MoreValidate", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreValidate.positive("Y%HQ+{!`R,W\n#/?", (-1));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Y%HQ+{!`R,W
         // #/? (-1) must be > 0
         //
         verifyException("org.springside.modules.utils.base.MoreValidate", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Long long0 = new Long(4294967295L);
      Long long1 = MoreValidate.positive("C", long0);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Long long0 = new Long(1073741824L);
      Long long1 = MoreValidate.positive("", long0);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Long long0 = Long.valueOf(37L);
      Long long1 = MoreValidate.positive("+LB[54z+rYx><A", long0);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Integer integer0 = new Integer(2146751218);
      Integer integer1 = MoreValidate.positive("696fD&g", integer0);
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Integer integer0 = new Integer(1073741824);
      Integer integer1 = MoreValidate.positive("vsUCw:b", integer0);
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(4193);
      Integer integer1 = MoreValidate.positive("oi$", integer0);
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Long long0 = new Long(1L);
      Long long1 = MoreValidate.nonNegative((String) null, long0);
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Long long0 = new Long(4294967293L);
      Long long1 = MoreValidate.nonNegative("8d &;toQBI`B", long0);
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = MoreValidate.nonNegative((String) null, integer0);
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = new Integer(1741);
      Integer integer1 = MoreValidate.nonNegative("", integer0);
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      long long0 = MoreValidate.nonNegative("^f8#b7^;_", 0L);
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = MoreValidate.nonNegative("vsUCw:b", 15);
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double double0 = MoreValidate.nonNegative(") must be >= 0", 0.0);
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreValidate.positive("$-<d$VO$L[=&UOgJssx", (Long) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.base.MoreValidate", e);
      }
  }
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreValidate.positive((String) null, (Integer) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.base.MoreValidate", e);
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreValidate.nonNegative(";+UxW#\"j4oMZ;T", (Long) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.base.MoreValidate", e);
      }
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreValidate.nonNegative("oi$", (Integer) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.base.MoreValidate", e);
      }
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreValidate.nonNegative("+zC)$MYV74F", (-1828.48810867));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // +zC)$MYV74F (-1828.48810867) must be >= 0
         //
         verifyException("org.springside.modules.utils.base.MoreValidate", e);
      }
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double double0 = MoreValidate.nonNegative("F\";.S6[uR{", 1235.90564);
      ;
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Long long0 = Long.getLong("", (-1L));
      // Undeclared exception!
      try { 
        MoreValidate.nonNegative("", long0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         //  (-1) must be >= 0
         //
         verifyException("org.springside.modules.utils.base.MoreValidate", e);
      }
  }
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Long long0 = new Long(0);
      Long long1 = MoreValidate.nonNegative((String) null, long0);
      ;
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreValidate.nonNegative((String) null, (-1262L));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // null (-1262) must be >= 0
         //
         verifyException("org.springside.modules.utils.base.MoreValidate", e);
      }
  }
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      long long0 = MoreValidate.nonNegative("+LB[54z+rYx><A", (long) 37);
      ;
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Integer integer0 = new Integer((-640));
      // Undeclared exception!
      try { 
        MoreValidate.nonNegative("+LB[54z+rYx><A", integer0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // +LB[54z+rYx><A (-640) must be >= 0
         //
         verifyException("org.springside.modules.utils.base.MoreValidate", e);
      }
  }
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Integer integer0 = new Integer(2147084116);
      Integer integer1 = MoreValidate.nonNegative("", integer0);
      ;
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreValidate.nonNegative("}z", (-820));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // }z (-820) must be >= 0
         //
         verifyException("org.springside.modules.utils.base.MoreValidate", e);
      }
  }
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = MoreValidate.nonNegative((String) null, 0);
      ;
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreValidate.positive("Y", 0.0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Y (0.0) must be >= 0
         //
         verifyException("org.springside.modules.utils.base.MoreValidate", e);
      }
  }
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double double0 = MoreValidate.positive((String) null, 1260.0);
      ;
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Long long0 = new Long(0L);
      // Undeclared exception!
      try { 
        MoreValidate.positive("", long0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         //  (0) must be > 0
         //
         verifyException("org.springside.modules.utils.base.MoreValidate", e);
      }
  }
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreValidate.positive(") must be >= 0", (long) (-1512));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // ) must be >= 0 (-1512) must be > 0
         //
         verifyException("org.springside.modules.utils.base.MoreValidate", e);
      }
  }
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Long long0 = new Long(1710L);
      long long1 = MoreValidate.positive("1710", (long) long0);
      ;
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Integer integer0 = new Integer((-3));
      // Undeclared exception!
      try { 
        MoreValidate.positive("8d &;toQBI`B", integer0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // 8d &;toQBI`B (-3) must be > 0
         //
         verifyException("org.springside.modules.utils.base.MoreValidate", e);
      }
  }
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreValidate.positive("", 0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         //  (0) must be > 0
         //
         verifyException("org.springside.modules.utils.base.MoreValidate", e);
      }
  }
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = MoreValidate.positive("+LB[54z+rYx><A", 37);
      ;
}
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MoreValidate moreValidate0 = new MoreValidate();
  }
}
