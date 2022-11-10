/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 05 20:25:34 GMT 2022
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import java.util.HashMap;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.format.DateTimePrinterInternalPrinter;
import org.joda.time.format.InternalPrinter;
import org.joda.time.format.InternalPrinterDateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimePrinterInternalPrinter_ESTest extends DateTimePrinterInternalPrinter_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("Rj$5S9}X8>/").when(dateTimePrinter0).toString();
      DateTimePrinterInternalPrinter dateTimePrinterInternalPrinter0 = (DateTimePrinterInternalPrinter)DateTimePrinterInternalPrinter.of(dateTimePrinter0);
      DateTimePrinter dateTimePrinter1 = dateTimePrinterInternalPrinter0.getUnderlying();
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("]MO8b$)+:B").when(dateTimePrinter0).toString();
      doReturn(0).when(dateTimePrinter0).estimatePrintedLength();
      InternalPrinter internalPrinter0 = DateTimePrinterInternalPrinter.of(dateTimePrinter0);
      DateTimePrinter dateTimePrinter1 = InternalPrinterDateTimePrinter.of(internalPrinter0);
      DateTimePrinterInternalPrinter.of(dateTimePrinter1);
      DateTimePrinterInternalPrinter.of(dateTimePrinter1);
      DateTimePrinterInternalPrinter.of(dateTimePrinter1);
      int int0 = internalPrinter0.estimatePrintedLength();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("]MO8b$)+:B").when(dateTimePrinter0).toString();
      doReturn((-1)).when(dateTimePrinter0).estimatePrintedLength();
      InternalPrinter internalPrinter0 = DateTimePrinterInternalPrinter.of(dateTimePrinter0);
      DateTimePrinter dateTimePrinter1 = InternalPrinterDateTimePrinter.of(internalPrinter0);
      DateTimePrinterInternalPrinter.of(dateTimePrinter1);
      DateTimePrinterInternalPrinter.of(dateTimePrinter1);
      InternalPrinter internalPrinter1 = DateTimePrinterInternalPrinter.of(dateTimePrinter1);
      int int0 = internalPrinter1.estimatePrintedLength();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn(1283).when(dateTimePrinter0).estimatePrintedLength();
      InternalPrinter internalPrinter0 = DateTimePrinterInternalPrinter.of(dateTimePrinter0);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "org1jod9.~ime.MontDa>$Property", 0, 1);
      MockDate mockDate0 = new MockDate((-1003L));
      MonthDay monthDay0 = MonthDay.fromDateFields(mockDate0);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      try { 
        internalPrinter0.printTo((Appendable) charBuffer0, (ReadablePartial) monthDay0, locale0);
        fail("Expecting exception: ReadOnlyBufferException");
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("]MO8b$)+:B").when(dateTimePrinter0).toString();
      doReturn((-1)).when(dateTimePrinter0).estimatePrintedLength();
      InternalPrinter internalPrinter0 = DateTimePrinterInternalPrinter.of(dateTimePrinter0);
      DateTimePrinter dateTimePrinter1 = InternalPrinterDateTimePrinter.of(internalPrinter0);
      InternalPrinter internalPrinter1 = DateTimePrinterInternalPrinter.of(dateTimePrinter1);
      DateTimePrinterInternalPrinter.of(dateTimePrinter1);
      DateTimePrinterInternalPrinter.of(dateTimePrinter1);
      StringBuilder stringBuilder0 = new StringBuilder("+h)\"BU1=)n`@(==rA");
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((long) 1, (Chronology) iSOChronology0);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      try { 
        internalPrinter1.printTo((Appendable) stringBuilder0, (ReadablePartial) yearMonth0, locale0);
        fail("Expecting exception: NegativeArraySizeException");
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimePrinter0).estimatePrintedLength();
      InternalPrinter internalPrinter0 = DateTimePrinterInternalPrinter.of(dateTimePrinter0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      // Undeclared exception!
      try { 
        internalPrinter0.printTo((Appendable) null, 1L, (Chronology) buddhistChronology0, 1, dateTimeZone0, (Locale) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimePrinterInternalPrinter", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("]MO8b$)+:B").when(dateTimePrinter0).toString();
      doReturn((-1)).when(dateTimePrinter0).estimatePrintedLength();
      InternalPrinter internalPrinter0 = DateTimePrinterInternalPrinter.of(dateTimePrinter0);
      DateTimePrinter dateTimePrinter1 = InternalPrinterDateTimePrinter.of(internalPrinter0);
      DateTimePrinterInternalPrinter.of(dateTimePrinter1);
      DateTimePrinterInternalPrinter.of(dateTimePrinter1);
      DateTimePrinterInternalPrinter.of(dateTimePrinter1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes((-1), 1);
      // Undeclared exception!
      try { 
        internalPrinter0.printTo((Appendable) null, 1L, (Chronology) buddhistChronology0, 1, dateTimeZone0, (Locale) null);
        fail("Expecting exception: NegativeArraySizeException");
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      InternalPrinter internalPrinter0 = DateTimePrinterInternalPrinter.of(dateTimePrinter0);
      MockFileWriter mockFileWriter0 = new MockFileWriter("org1jod9.~ime.MontDa>$Property", false);
      Locale locale0 = Locale.ITALIAN;
      internalPrinter0.printTo((Appendable) mockFileWriter0, (ReadablePartial) null, locale0);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      InternalPrinter internalPrinter0 = DateTimePrinterInternalPrinter.of(dateTimePrinter0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-11));
      Locale locale0 = Locale.KOREA;
      MonthDay monthDay0 = MonthDay.now(dateTimeZone0);
      LocalDate localDate0 = monthDay0.toLocalDate((-11));
      StringBuffer stringBuffer0 = new StringBuffer();
      internalPrinter0.printTo((Appendable) stringBuffer0, (ReadablePartial) localDate0, locale0);
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      InternalPrinter internalPrinter0 = DateTimePrinterInternalPrinter.of(dateTimePrinter0);
      MockFileWriter mockFileWriter0 = new MockFileWriter("]MO8b$)+:B");
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = new MutableDateTime((long) 1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0, 1);
      Locale locale0 = Locale.US;
      internalPrinter0.printTo((Appendable) mockFileWriter0, (long) 1, (Chronology) gJChronology0, 1, dateTimeZone0, locale0);
      assertEquals(1, internalPrinter0.estimatePrintedLength());
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      InternalPrinter internalPrinter0 = DateTimePrinterInternalPrinter.of(dateTimePrinter0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-11));
      GJChronology gJChronology0 = GJChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      StringBuffer stringBuffer0 = new StringBuffer();
      internalPrinter0.printTo((Appendable) stringBuffer0, (long) 2, (Chronology) gJChronology0, 1, dateTimeZone0, locale0);
      assertNotNull(locale0.toString());
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InternalPrinter internalPrinter0 = DateTimePrinterInternalPrinter.of((DateTimePrinter) null);
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(0, hashMap0);
      DateTimePrinter dateTimePrinter0 = InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TimeZoneName0);
      InternalPrinter internalPrinter0 = DateTimePrinterInternalPrinter.of(dateTimePrinter0);
      assertEquals(0, internalPrinter0.estimatePrintedLength());
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn(1321).when(dateTimePrinter0).estimatePrintedLength();
      InternalPrinter internalPrinter0 = DateTimePrinterInternalPrinter.of(dateTimePrinter0);
      Locale locale0 = Locale.ITALIAN;
      // Undeclared exception!
      try { 
        internalPrinter0.printTo((Appendable) null, (ReadablePartial) null, locale0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimePrinterInternalPrinter", e);
      }
  }
}
