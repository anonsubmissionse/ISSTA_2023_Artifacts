/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 23:16:50 GMT 2022
 */

package org.apache.commons.imaging.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.SequenceInputStream;
import java.time.ZoneId;
import java.util.LinkedList;
import java.util.Set;
import org.apache.commons.imaging.internal.Debug;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Debug_ESTest extends Debug_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      MockIOException mockIOException0 = new MockIOException(mockThrowable0);
      Debug.debug((Throwable) mockIOException0, 3);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      Debug.debug((Throwable) mockThrowable0, 0);
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable", mockThrowable0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("#:dd?S");
      mockThrowable0.setOriginForDelegate((StackTraceElement) null);
      // Undeclared exception!
      try { 
        Debug.debug((Throwable) mockThrowable0, (-1153));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.internal.Debug", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      mockThrowable0.setOriginForDelegate((StackTraceElement) null);
      // Undeclared exception!
      try { 
        Debug.debug((Throwable) mockThrowable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.internal.Debug", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      // Undeclared exception!
      try { 
        Debug.debug("_jsxh=M\"RaHI.", (Object) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Debug.debug("#Yw%V%b\"Ui_vG2");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockIOException mockIOException0 = new MockIOException();
      Debug.debug((Throwable) mockIOException0, 38);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Debug.debug((Throwable) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Debug.debug("i", (Object) mockGregorianCalendar0);
      assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2, 2, 2, 2, 2, 2);
      Debug.debug("xU", (Object) mockDate0);
      assertEquals("Sun Mar 02 02:02:02 GMT 1902", mockDate0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      File file0 = MockFile.createTempFile("M`;T/eW.", "M`;T/eW.");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(mockFileInputStream0, mockFileInputStream0);
      Debug.debug("M`;T/eW.", (Object) sequenceInputStream0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      LinkedList<String> linkedList0 = new LinkedList<String>(set0);
      Debug.debug("M`;T/eW.", (Object) linkedList0);
      assertFalse(linkedList0.contains("M`;T/eW."));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      File file0 = MockFile.createTempFile("M`;T/eW.", "M`;T/eW.");
      Debug.debug("M`;T/eW.", (Object) file0);
      assertTrue(file0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Debug.debug("M`;T/eW.", (Object) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Debug.debug();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Debug.debug("_jsxh=M\"RaHI.", (Object) "_jsxh=M\"RaHI.");
  }
}
