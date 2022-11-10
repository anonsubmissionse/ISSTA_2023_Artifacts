/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 17:56:50 GMT 2022
 */

package org.apache.commons.lang3.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.lang.MockError;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExceptionUtils_ESTest extends ExceptionUtils_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockError mockError0 = new MockError((String) null);
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException(mockError0);
      Class<Throwable> class0 = Throwable.class;
      Throwable throwable0 = ExceptionUtils.throwableOfThrowable((Throwable) mockRuntimeException0, class0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable((Throwable) null);
      Class<RuntimeException> class0 = RuntimeException.class;
      RuntimeException runtimeException0 = ExceptionUtils.throwableOfThrowable((Throwable) mockThrowable0, class0, 1);
      assertNotNull(runtimeException0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("%gG%o,1VuVu)@");
      LinkedList<String> linkedList1 = new LinkedList<String>();
      linkedList1.add("");
      linkedList1.add("%gG%o,1VuVu)@");
      ExceptionUtils.removeCommonFrames(linkedList1, linkedList0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("%gG%o,1VuVu)@");
      LinkedList<String> linkedList1 = new LinkedList<String>();
      linkedList1.add("");
      linkedList1.add("%gG%o,1VuVu)@");
      ExceptionUtils.removeCommonFrames(linkedList1, linkedList0);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.addLast("%gG%o,1VuVu)@");
      LinkedList<String> linkedList1 = new LinkedList<String>();
      linkedList1.add("");
      ExceptionUtils.removeCommonFrames(linkedList1, linkedList0);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerFirst("=}X~D@");
      linkedList0.add("");
      ExceptionUtils.removeCommonFrames(linkedList0, linkedList0);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerFirst("=}X~D@");
      linkedList0.add("");
      ExceptionUtils.removeCommonFrames(linkedList0, linkedList0);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = ExceptionUtils.getDefaultCauseMethodNames();
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException();
      MockRuntimeException mockRuntimeException1 = new MockRuntimeException();
      mockRuntimeException0.initCause(mockRuntimeException1);
      Throwable throwable0 = ExceptionUtils.getCause((Throwable) mockRuntimeException0, stringArray0);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String[] stringArray0 = ExceptionUtils.getDefaultCauseMethodNames();
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException();
      MockRuntimeException mockRuntimeException1 = new MockRuntimeException();
      mockRuntimeException0.initCause(mockRuntimeException1);
      Throwable throwable0 = ExceptionUtils.getCause((Throwable) mockRuntimeException0, stringArray0);
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      MockError mockError0 = new MockError();
      MockThrowable mockThrowable0 = new MockThrowable(" [wrapped] ", mockError0);
      Class<RuntimeException> class0 = RuntimeException.class;
      RuntimeException runtimeException0 = ExceptionUtils.throwableOfType((Throwable) mockThrowable0, class0);
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockError mockError0 = new MockError();
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException(mockError0);
      UndeclaredThrowableException undeclaredThrowableException0 = new UndeclaredThrowableException(mockRuntimeException0, "");
      Class<UndeclaredThrowableException> class0 = UndeclaredThrowableException.class;
      UndeclaredThrowableException undeclaredThrowableException1 = ExceptionUtils.throwableOfThrowable((Throwable) undeclaredThrowableException0, class0);
      assertNotNull(undeclaredThrowableException1.toString());
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException();
      Class<Throwable> class0 = Throwable.class;
      int int0 = ExceptionUtils.indexOfType((Throwable) mockRuntimeException0, (Class<? extends Throwable>) class0, (-1514));
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException("i_vwGgwl#9H#2}-WH6");
      MockError mockError0 = new MockError("i_vwGgwl#9H#2}-WH6", mockRuntimeException0);
      mockRuntimeException0.initCause(mockError0);
      Class<Error> class0 = Error.class;
      int int0 = ExceptionUtils.indexOfType((Throwable) mockRuntimeException0, (Class<? extends Throwable>) class0, (-4145));
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockError mockError0 = new MockError();
      UndeclaredThrowableException undeclaredThrowableException0 = new UndeclaredThrowableException(mockError0, (String) null);
      MockThrowable mockThrowable0 = new MockThrowable(undeclaredThrowableException0);
      Class<Error> class0 = Error.class;
      int int0 = ExceptionUtils.indexOfType((Throwable) mockThrowable0, (Class<? extends Throwable>) class0);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockError mockError0 = new MockError();
      Class<MockError> class0 = MockError.class;
      int int0 = ExceptionUtils.indexOfThrowable((Throwable) mockError0, (Class<? extends Throwable>) class0);
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException();
      Throwable throwable0 = mockRuntimeException0.initCause(mockRuntimeException0);
      UndeclaredThrowableException undeclaredThrowableException0 = new UndeclaredThrowableException(throwable0);
      Class<MockRuntimeException> class0 = MockRuntimeException.class;
      int int0 = ExceptionUtils.indexOfThrowable((Throwable) undeclaredThrowableException0, (Class<? extends Throwable>) class0);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockError mockError0 = new MockError("");
      Class<Error> class0 = Error.class;
      boolean boolean0 = ExceptionUtils.hasCause(mockError0, class0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Throwable[] throwableArray0 = ExceptionUtils.getThrowables((Throwable) null);
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      List<Throwable> list0 = ExceptionUtils.getThrowableList((Throwable) null);
      assertTrue(list0.isEmpty());
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = ExceptionUtils.getThrowableCount((Throwable) null);
      ;
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockError mockError0 = new MockError();
      StackTraceElement[] stackTraceElementArray0 = new StackTraceElement[9];
      StackTraceElement stackTraceElement0 = new StackTraceElement("dprl\"z_F7.", "at", (String) null, 37);
      stackTraceElementArray0[0] = stackTraceElement0;
      stackTraceElementArray0[1] = stackTraceElementArray0[0];
      stackTraceElementArray0[2] = stackTraceElementArray0[1];
      StackTraceElement stackTraceElement1 = new StackTraceElement("at", "dprl\"z_F7.", "UOK+eW[s[`fi[Dw.=$!", 6);
      stackTraceElementArray0[3] = stackTraceElement1;
      stackTraceElementArray0[4] = stackTraceElementArray0[1];
      stackTraceElementArray0[5] = stackTraceElementArray0[0];
      stackTraceElementArray0[6] = stackTraceElementArray0[0];
      stackTraceElementArray0[7] = stackTraceElementArray0[5];
      stackTraceElementArray0[8] = stackTraceElementArray0[7];
      mockError0.setStackTrace(stackTraceElementArray0);
      List<String> list0 = ExceptionUtils.getStackFrameList(mockError0);
      assertEquals(0, list0.size());
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UndeclaredThrowableException undeclaredThrowableException0 = new UndeclaredThrowableException((Throwable) null, "");
      // Undeclared exception!
      try { 
        ExceptionUtils.rethrow((Throwable) undeclaredThrowableException0);
        fail("Expecting exception: UndeclaredThrowableException");
      } catch(UndeclaredThrowableException e) {
      }
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("$UM@6Ii~'m5iXq,");
      // Undeclared exception!
      try { 
        ExceptionUtils.rethrow((Throwable) mockThrowable0);
        fail("Expecting exception: Throwable");
      } catch(Throwable e) {
      }
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException();
      // Undeclared exception!
      try { 
        ExceptionUtils.rethrow((Throwable) mockRuntimeException0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
      }
  }
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      MockError mockError0 = new MockError(mockThrowable0);
      // Undeclared exception!
      try { 
        ExceptionUtils.rethrow((Throwable) mockError0);
        fail("Expecting exception: Error");
      } catch(Error e) {
      }
  }
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      // Undeclared exception!
      try { 
        ExceptionUtils.removeCommonFrames(linkedList0, linkedList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockError mockError0 = new MockError();
      // Undeclared exception!
      try { 
        ExceptionUtils.printRootCauseStackTrace((Throwable) mockError0, (PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // printWriter
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException();
      // Undeclared exception!
      try { 
        ExceptionUtils.printRootCauseStackTrace((Throwable) mockRuntimeException0, (PrintStream) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // printStream
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UndeclaredThrowableException undeclaredThrowableException0 = new UndeclaredThrowableException((Throwable) null);
      // Undeclared exception!
      try { 
        ExceptionUtils.hasCause(undeclaredThrowableException0, (Class<? extends Throwable>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.exception.ExceptionUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("getThrowable");
      mockThrowable0.setOriginForDelegate((StackTraceElement) null);
      // Undeclared exception!
      try { 
        ExceptionUtils.getStackFrames(mockThrowable0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExceptionUtils.getStackFrames((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable(".k0RqESS");
      mockThrowable0.setOriginForDelegate((StackTraceElement) null);
      // Undeclared exception!
      try { 
        ExceptionUtils.getStackFrameList(mockThrowable0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException();
      MockPrintStream mockPrintStream0 = new MockPrintStream("at");
      ExceptionUtils.printRootCauseStackTrace((Throwable) mockRuntimeException0, (PrintStream) mockPrintStream0);
  }
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
      ExceptionUtils.printRootCauseStackTrace((Throwable) null, (PrintStream) mockPrintStream0);
  }
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockError mockError0 = new MockError();
      mockError0.initCause(mockError0);
      List<Throwable> list0 = ExceptionUtils.getThrowableList(mockError0);
      assertTrue(list0.isEmpty());
}
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = ExceptionUtils.getStackFrames("at");
      ;
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String[] stringArray0 = ExceptionUtils.getStackFrames("");
      ;
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Throwable throwable0 = ExceptionUtils.getRootCause((Throwable) null);
      assertNotNull(throwable0);
}
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = ExceptionUtils.getMessage((Throwable) null);
      ;
}
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MockError mockError0 = new MockError();
      Throwable throwable0 = ExceptionUtils.getCause((Throwable) mockError0, (String[]) null);
      ;
}
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      UndeclaredThrowableException undeclaredThrowableException0 = new UndeclaredThrowableException(mockThrowable0, "");
      Throwable throwable0 = ExceptionUtils.getCause((Throwable) undeclaredThrowableException0, (String[]) null);
      ;
}
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      UndeclaredThrowableException undeclaredThrowableException0 = new UndeclaredThrowableException((Throwable) null, "");
      String[] stringArray0 = ExceptionUtils.getRootCauseStackTrace(undeclaredThrowableException0);
      ExceptionUtils.getCause((Throwable) null, stringArray0);
      ;
}
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = ExceptionUtils.getStackTrace((Throwable) null);
      ;
}
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException("fM'w>&9Er8S_l", (Throwable) null);
      MockThrowable mockThrowable0 = new MockThrowable(mockRuntimeException0);
      UndeclaredThrowableException undeclaredThrowableException0 = new UndeclaredThrowableException(mockThrowable0, "+`:C=8PT.Y{?^");
      Throwable[] throwableArray0 = ExceptionUtils.getThrowables(undeclaredThrowableException0);
      ;
}
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MockError mockError0 = new MockError("at");
      // Undeclared exception!
      try { 
        ExceptionUtils.wrapAndThrow((Throwable) mockError0);
        fail("Expecting exception: Error");
      } catch(Error e) {
      }
  }
 @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException();
      // Undeclared exception!
      try { 
        ExceptionUtils.wrapAndThrow((Throwable) mockRuntimeException0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
      }
  }
 @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExceptionUtils.wrapAndThrow((Throwable) null);
        fail("Expecting exception: UndeclaredThrowableException");
      } catch(UndeclaredThrowableException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.exception.ExceptionUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MockError mockError0 = new MockError("u>b[gIyS\"?");
      Class<MockError> class0 = MockError.class;
      MockError mockError1 = ExceptionUtils.throwableOfThrowable((Throwable) mockError0, class0, (-385));
      ;
}
 @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MockError mockError0 = new MockError();
      Class<UndeclaredThrowableException> class0 = UndeclaredThrowableException.class;
      UndeclaredThrowableException undeclaredThrowableException0 = ExceptionUtils.throwableOfType((Throwable) mockError0, class0, 0);
      ;
}
 @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException();
      Class<Throwable> class0 = Throwable.class;
      Throwable throwable0 = ExceptionUtils.throwableOfType((Throwable) mockRuntimeException0, class0, (-272));
      ;
}
 @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MockError mockError0 = new MockError();
      UndeclaredThrowableException undeclaredThrowableException0 = ExceptionUtils.throwableOfThrowable((Throwable) mockError0, (Class<UndeclaredThrowableException>) null, 99);
      ;
}
 @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      List<String> list0 = ExceptionUtils.getStackFrameList((Throwable) null);
      // Undeclared exception!
      try { 
        ExceptionUtils.removeCommonFrames(list0, (List<String>) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // The List must not be null
         //
         verifyException("org.apache.commons.lang3.exception.ExceptionUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExceptionUtils.removeCommonFrames((List<String>) null, (List<String>) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // The List must not be null
         //
         verifyException("org.apache.commons.lang3.exception.ExceptionUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, true);
      ExceptionUtils.printRootCauseStackTrace((Throwable) null, (PrintWriter) mockPrintWriter0);
  }
 @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException("fM'w>&9Er8S_l", (Throwable) null);
      MockThrowable mockThrowable0 = new MockThrowable(mockRuntimeException0);
      UndeclaredThrowableException undeclaredThrowableException0 = new UndeclaredThrowableException(mockThrowable0, "+`:C=8PT.Y{?^");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("void");
      ExceptionUtils.printRootCauseStackTrace((Throwable) undeclaredThrowableException0, (PrintWriter) mockPrintWriter0);
      ;
}
 @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ExceptionUtils.printRootCauseStackTrace((Throwable) null);
  }
 @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException();
      UndeclaredThrowableException undeclaredThrowableException0 = new UndeclaredThrowableException(mockRuntimeException0);
      Class<Error> class0 = Error.class;
      int int0 = ExceptionUtils.indexOfThrowable((Throwable) undeclaredThrowableException0, (Class<? extends Throwable>) class0);
      ;
}
 @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Class<Throwable> class0 = Throwable.class;
      UndeclaredThrowableException undeclaredThrowableException0 = new UndeclaredThrowableException((Throwable) null, (String) null);
      int int0 = ExceptionUtils.indexOfType((Throwable) undeclaredThrowableException0, (Class<? extends Throwable>) class0);
      ;
}
 @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MockError mockError0 = new MockError();
      Class<UndeclaredThrowableException> class0 = UndeclaredThrowableException.class;
      int int0 = ExceptionUtils.indexOfThrowable((Throwable) mockError0, (Class<? extends Throwable>) class0, 127);
      ;
}
 @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException("fM'w>&9Er8S_l", (Throwable) null);
      MockThrowable mockThrowable0 = new MockThrowable(mockRuntimeException0);
      UndeclaredThrowableException undeclaredThrowableException0 = new UndeclaredThrowableException(mockThrowable0, "+`:C=8PT.Y{?^");
      Class<MockRuntimeException> class0 = MockRuntimeException.class;
      int int0 = ExceptionUtils.indexOfThrowable((Throwable) undeclaredThrowableException0, (Class<? extends Throwable>) class0, (-788));
      ;
}
 @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      MockError mockError0 = new MockError();
      int int0 = ExceptionUtils.indexOfThrowable((Throwable) mockError0, (Class<? extends Throwable>) null, 127);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Class<Throwable> class0 = Throwable.class;
      UndeclaredThrowableException undeclaredThrowableException0 = new UndeclaredThrowableException((Throwable) null, "");
      boolean boolean0 = ExceptionUtils.hasCause(undeclaredThrowableException0, class0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException();
      mockRuntimeException0.initCause(mockRuntimeException0);
      Throwable throwable0 = ExceptionUtils.getRootCause(mockRuntimeException0);
      ;
}
 @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String[] stringArray0 = ExceptionUtils.getStackFrames((Throwable) null);
      ;
}
 @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException();
      String[] stringArray0 = ExceptionUtils.getStackFrames(mockRuntimeException0);
      ;
}
 @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      MockError mockError0 = new MockError();
      StackTraceElement stackTraceElement0 = new StackTraceElement("at", "", "at", (-2211));
      StackTraceElement[] stackTraceElementArray0 = new StackTraceElement[8];
      stackTraceElementArray0[0] = stackTraceElement0;
      stackTraceElementArray0[1] = stackTraceElement0;
      stackTraceElementArray0[2] = stackTraceElement0;
      stackTraceElementArray0[3] = stackTraceElement0;
      stackTraceElementArray0[4] = stackTraceElement0;
      stackTraceElementArray0[5] = stackTraceElement0;
      stackTraceElementArray0[6] = stackTraceElement0;
      stackTraceElementArray0[7] = stackTraceElement0;
      mockError0.setStackTrace(stackTraceElementArray0);
      MockThrowable mockThrowable0 = new MockThrowable("UndeclaredThrowableException: ", mockError0);
      String[] stringArray0 = ExceptionUtils.getRootCauseStackTrace(mockThrowable0);
      ;
}
 @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String[] stringArray0 = ExceptionUtils.getRootCauseStackTrace((Throwable) null);
      ;
}
 @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      MockError mockError0 = new MockError();
      MockThrowable mockThrowable0 = new MockThrowable("UndeclaredThrowableException: ", mockError0);
      String string0 = ExceptionUtils.getRootCauseMessage(mockThrowable0);
      ;
}
 @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      String string0 = ExceptionUtils.getRootCauseMessage((Throwable) null);
      ;
}
 @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      UndeclaredThrowableException undeclaredThrowableException0 = new UndeclaredThrowableException((Throwable) null, "");
      String string0 = ExceptionUtils.getMessage(undeclaredThrowableException0);
      ;
}
 @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      MockError mockError0 = new MockError();
      MockThrowable mockThrowable0 = new MockThrowable("UndeclaredThrowableException: ", mockError0);
      Throwable throwable0 = ExceptionUtils.getCause((Throwable) mockThrowable0);
      ;
}
 @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      MockError mockError0 = new MockError();
      String[] stringArray0 = new String[6];
      Throwable throwable0 = ExceptionUtils.getCause((Throwable) mockError0, stringArray0);
      assertNotNull(throwable0);
}
 @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Throwable throwable0 = ExceptionUtils.getCause((Throwable) null);
      ;
}
 @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Class<UndeclaredThrowableException> class0 = UndeclaredThrowableException.class;
      MockThrowable mockThrowable0 = new MockThrowable("");
      int int0 = ExceptionUtils.indexOfType((Throwable) mockThrowable0, (Class<? extends Throwable>) class0);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      UndeclaredThrowableException undeclaredThrowableException0 = new UndeclaredThrowableException((Throwable) null);
      Class<UndeclaredThrowableException> class0 = UndeclaredThrowableException.class;
      int int0 = ExceptionUtils.indexOfThrowable((Throwable) undeclaredThrowableException0, (Class<? extends Throwable>) class0, 0);
      ;
}
 @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Class<Throwable> class0 = Throwable.class;
      int int0 = ExceptionUtils.indexOfThrowable((Throwable) null, class0);
      ;
}
 @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      MockError mockError0 = new MockError();
      int int0 = ExceptionUtils.getThrowableCount(mockError0);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ExceptionUtils exceptionUtils0 = new ExceptionUtils();
  }
 @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      MockError mockError0 = new MockError("boolean");
      Class<Throwable> class0 = Throwable.class;
      Throwable throwable0 = ExceptionUtils.throwableOfType((Throwable) mockError0, class0, 486);
      ;
}
 @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      MockError mockError0 = new MockError();
      Class<Throwable> class0 = Throwable.class;
      Throwable throwable0 = ExceptionUtils.throwableOfType((Throwable) mockError0, class0);
      ;
}
 @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Class<Error> class0 = Error.class;
      Error error0 = ExceptionUtils.throwableOfThrowable((Throwable) null, class0);
      ;
}
 @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExceptionUtils.rethrow((Throwable) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.exception.ExceptionUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException();
      MockError mockError0 = new MockError("at");
      Throwable throwable0 = mockRuntimeException0.initCause(mockError0);
      Class<RuntimeException> class0 = RuntimeException.class;
      int int0 = ExceptionUtils.indexOfType(throwable0, class0, 0);
      ;
}
}
