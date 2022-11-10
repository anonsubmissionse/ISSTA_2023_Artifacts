/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 00:34:11 GMT 2022
 */

package org.apache.commons.configuration2.convert;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.BatchUpdateException;
import java.sql.DataTruncation;
import java.sql.SQLClientInfoException;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLNonTransientConnectionException;
import java.sql.SQLRecoverableException;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLTransientConnectionException;
import java.sql.SQLWarning;
import java.time.chrono.IsoEra;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.function.Function;
import org.apache.commons.configuration2.convert.DefaultConversionHandler;
import org.apache.commons.configuration2.convert.DefaultListDelimiterHandler;
import org.apache.commons.configuration2.convert.LegacyListDelimiterHandler;
import org.apache.commons.configuration2.interpol.ConfigurationInterpolator;
import org.apache.commons.configuration2.interpol.ConstantLookup;
import org.apache.commons.configuration2.interpol.ExprLookup;
import org.apache.commons.configuration2.interpol.InterpolatorSpecification;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultConversionHandler_ESTest extends DefaultConversionHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = DefaultConversionHandler.INSTANCE;
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('*');
      Collection<String> collection0 = defaultListDelimiterHandler0.splitString("kQ=", false);
      ConfigurationInterpolator configurationInterpolator0 = new ConfigurationInterpolator();
      Class<DefaultListDelimiterHandler> class0 = DefaultListDelimiterHandler.class;
      LinkedList<DefaultListDelimiterHandler> linkedList0 = new LinkedList<DefaultListDelimiterHandler>();
      // Undeclared exception!
      try { 
        defaultConversionHandler0.toCollection((Object) collection0, class0, configurationInterpolator0, (Collection<DefaultListDelimiterHandler>) linkedList0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The value 'kQ=' (class java.lang.String) can't be converted to a org.apache.commons.configuration2.convert.DefaultListDelimiterHandler object
         //
         verifyException("org.apache.commons.configuration2.convert.PropertyConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = DefaultConversionHandler.INSTANCE;
      LegacyListDelimiterHandler legacyListDelimiterHandler0 = new LegacyListDelimiterHandler('S');
      Class<Object> class0 = Object.class;
      Object object0 = defaultConversionHandler0.INSTANCE.to((Object) legacyListDelimiterHandler0, class0, (ConfigurationInterpolator) null);
      assertSame(legacyListDelimiterHandler0, object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = DefaultConversionHandler.INSTANCE;
      boolean boolean0 = defaultConversionHandler0.isEmptyElement("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = DefaultConversionHandler.INSTANCE;
      SQLTransientConnectionException sQLTransientConnectionException0 = new SQLTransientConnectionException("yyyy-MM-dd HH:mm:ss", "w|");
      SQLSyntaxErrorException sQLSyntaxErrorException0 = new SQLSyntaxErrorException("failed finding method ", "-u3Kp5@+!/C", 256, sQLTransientConnectionException0);
      boolean boolean0 = defaultConversionHandler0.isEmptyElement(sQLSyntaxErrorException0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = DefaultConversionHandler.INSTANCE;
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException("");
      SQLWarning sQLWarning0 = new SQLWarning(sQLIntegrityConstraintViolationException0);
      boolean boolean0 = defaultConversionHandler0.isComplexObject(sQLWarning0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = DefaultConversionHandler.INSTANCE;
      boolean boolean0 = defaultConversionHandler0.isComplexObject((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = DefaultConversionHandler.INSTANCE;
      defaultConversionHandler0.setDateFormat("");
      String string0 = defaultConversionHandler0.getDateFormat();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = DefaultConversionHandler.INSTANCE;
      SQLRecoverableException sQLRecoverableException0 = new SQLRecoverableException((String) null, (String) null);
      Collection<?> collection0 = defaultConversionHandler0.INSTANCE.extractValues(sQLRecoverableException0, (-1));
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = DefaultConversionHandler.INSTANCE;
      Collection<?> collection0 = defaultConversionHandler0.extractValues((Object) null);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = DefaultConversionHandler.INSTANCE;
      Class<SQLClientInfoException> class0 = SQLClientInfoException.class;
      ConfigurationInterpolator configurationInterpolator0 = new ConfigurationInterpolator();
      Object object0 = defaultConversionHandler0.extractConversionValue("+{K6Hn><A1C2UM", class0, configurationInterpolator0);
      assertEquals("+{K6Hn><A1C2UM", object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = DefaultConversionHandler.INSTANCE;
      Class<DefaultListDelimiterHandler> class0 = DefaultListDelimiterHandler.class;
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = defaultConversionHandler0.convertValue((Object) null, class0, (ConfigurationInterpolator) null);
      assertNull(defaultListDelimiterHandler0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = DefaultConversionHandler.INSTANCE;
      ConfigurationInterpolator configurationInterpolator0 = new ConfigurationInterpolator();
      MockIOException mockIOException0 = new MockIOException("+{K6Hn><A1C2UM");
      SQLTransientConnectionException sQLTransientConnectionException0 = new SQLTransientConnectionException("f4,e34/1!{'u]\"3", mockIOException0);
      SQLDataException sQLDataException0 = new SQLDataException("g=_24+3gR*\"8u@+OP", "f4,e34/1!{'u]\"3", sQLTransientConnectionException0);
      SQLWarning sQLWarning0 = new SQLWarning("org.apache.commons.configuration2.interpol.ConfigurationInterpolator", "+{K6Hn><A1C2UM", sQLDataException0);
      SQLRecoverableException sQLRecoverableException0 = new SQLRecoverableException("org.apache.commons.configuration2.interpol.ConfigurationInterpolator.defaultPrefixLookups", "+{K6Hn><A1C2UM", 0, sQLWarning0);
      Class<String> class0 = String.class;
      String string0 = defaultConversionHandler0.INSTANCE.convertValue((Object) sQLRecoverableException0, class0, configurationInterpolator0);
      assertEquals("java.sql.SQLRecoverableException: org.apache.commons.configuration2.interpol.ConfigurationInterpolator.defaultPrefixLookups", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = DefaultConversionHandler.INSTANCE;
      InterpolatorSpecification interpolatorSpecification0 = mock(InterpolatorSpecification.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(interpolatorSpecification0).getDefaultLookups();
      doReturn((ConfigurationInterpolator) null).when(interpolatorSpecification0).getInterpolator();
      doReturn((ConfigurationInterpolator) null).when(interpolatorSpecification0).getParentInterpolator();
      doReturn((Map) null).when(interpolatorSpecification0).getPrefixLookups();
      doReturn((Function) null).when(interpolatorSpecification0).getStringConverter();
      ConfigurationInterpolator configurationInterpolator0 = ConfigurationInterpolator.fromSpecification(interpolatorSpecification0);
      Class<SQLNonTransientConnectionException> class0 = SQLNonTransientConnectionException.class;
      SQLNonTransientConnectionException sQLNonTransientConnectionException0 = defaultConversionHandler0.convert((Object) null, class0, configurationInterpolator0);
      assertNull(sQLNonTransientConnectionException0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = DefaultConversionHandler.INSTANCE;
      ConfigurationInterpolator configurationInterpolator0 = new ConfigurationInterpolator();
      ConstantLookup constantLookup0 = new ConstantLookup();
      Class<String> class0 = String.class;
      String string0 = defaultConversionHandler0.INSTANCE.convert((Object) constantLookup0, class0, configurationInterpolator0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = new DefaultConversionHandler();
      Class<String> class0 = String.class;
      Locale locale0 = Locale.GERMAN;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      // Undeclared exception!
      try { 
        defaultConversionHandler0.toCollection((Object) "yyyy-MM-dd HH:mm:ss", class0, (ConfigurationInterpolator) null, (Collection<String>) set0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = new DefaultConversionHandler();
      // Undeclared exception!
      try { 
        defaultConversionHandler0.INSTANCE.toArray("org.apache.commons.configuration2.interpol.ConfigurationInterpolator.defaultPrefixLookups", (Class<?>) null, (ConfigurationInterpolator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.configuration2.convert.DefaultConversionHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = new DefaultConversionHandler();
      // Undeclared exception!
      try { 
        defaultConversionHandler0.to((Object) defaultConversionHandler0, (Class<SQLDataException>) null, (ConfigurationInterpolator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.configuration2.convert.PropertyConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = new DefaultConversionHandler();
      IsoEra isoEra0 = IsoEra.CE;
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        defaultConversionHandler0.extractConversionValue(isoEra0, class0, (ConfigurationInterpolator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.configuration2.convert.DefaultConversionHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = new DefaultConversionHandler();
      LegacyListDelimiterHandler legacyListDelimiterHandler0 = new LegacyListDelimiterHandler('>');
      Class<SQLRecoverableException> class0 = SQLRecoverableException.class;
      ConfigurationInterpolator configurationInterpolator0 = new ConfigurationInterpolator();
      // Undeclared exception!
      try { 
        defaultConversionHandler0.convertValue((Object) legacyListDelimiterHandler0, class0, configurationInterpolator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The value 'org.apache.commons.configuration2.convert.LegacyListDelimiterHandler@2' (class org.apache.commons.configuration2.convert.LegacyListDelimiterHandler) can't be converted to a java.sql.SQLRecoverableException object
         //
         verifyException("org.apache.commons.configuration2.convert.PropertyConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = DefaultConversionHandler.INSTANCE;
      Class<BatchUpdateException> class0 = BatchUpdateException.class;
      InterpolatorSpecification interpolatorSpecification0 = mock(InterpolatorSpecification.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(interpolatorSpecification0).getDefaultLookups();
      doReturn((ConfigurationInterpolator) null).when(interpolatorSpecification0).getInterpolator();
      doReturn((ConfigurationInterpolator) null).when(interpolatorSpecification0).getParentInterpolator();
      doReturn((Map) null).when(interpolatorSpecification0).getPrefixLookups();
      doReturn((Function) null).when(interpolatorSpecification0).getStringConverter();
      ConfigurationInterpolator configurationInterpolator0 = ConfigurationInterpolator.fromSpecification(interpolatorSpecification0);
      // Undeclared exception!
      try { 
        defaultConversionHandler0.convert((Object) "", class0, configurationInterpolator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The value '' (class java.lang.String) can't be converted to a java.sql.BatchUpdateException object
         //
         verifyException("org.apache.commons.configuration2.convert.PropertyConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = new DefaultConversionHandler();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        defaultConversionHandler0.convert((Object) "yyyy-MM-dd HH:mm:ss", class0, (ConfigurationInterpolator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.configuration2.convert.DefaultConversionHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = new DefaultConversionHandler();
      ConstantLookup constantLookup0 = new ConstantLookup();
      Class<Object> class0 = Object.class;
      Object object0 = defaultConversionHandler0.toArray(constantLookup0, class0, (ConfigurationInterpolator) null);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = DefaultConversionHandler.INSTANCE;
      ExprLookup exprLookup0 = new ExprLookup();
      ConfigurationInterpolator configurationInterpolator0 = exprLookup0.getInterpolator();
      Class<DataTruncation> class0 = DataTruncation.class;
      Object object0 = defaultConversionHandler0.extractConversionValue((Object) null, class0, configurationInterpolator0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = DefaultConversionHandler.INSTANCE;
      Class<SQLNonTransientConnectionException> class0 = SQLNonTransientConnectionException.class;
      ConfigurationInterpolator configurationInterpolator0 = new ConfigurationInterpolator();
      // Undeclared exception!
      try { 
        defaultConversionHandler0.toArray("yyyy-MM-dd HH:mm:ss", class0, configurationInterpolator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The value 'yyyy-MM-dd HH:mm:ss' (class java.lang.String) can't be converted to a java.sql.SQLNonTransientConnectionException object
         //
         verifyException("org.apache.commons.configuration2.convert.PropertyConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = new DefaultConversionHandler();
      Class<Integer> class0 = Integer.class;
      ConfigurationInterpolator configurationInterpolator0 = new ConfigurationInterpolator();
      Integer integer0 = defaultConversionHandler0.INSTANCE.to((Object) null, class0, configurationInterpolator0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = DefaultConversionHandler.INSTANCE;
      Class<SQLRecoverableException> class0 = SQLRecoverableException.class;
      ConfigurationInterpolator configurationInterpolator0 = new ConfigurationInterpolator();
      Stack<SQLRecoverableException> stack0 = new Stack<SQLRecoverableException>();
      defaultConversionHandler0.toCollection((Object) "", class0, configurationInterpolator0, (Collection<SQLRecoverableException>) stack0);
      assertTrue(stack0.empty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = new DefaultConversionHandler();
      Class<SQLRecoverableException> class0 = SQLRecoverableException.class;
      Vector<SQLRecoverableException> vector0 = new Vector<SQLRecoverableException>();
      defaultConversionHandler0.toCollection((Object) null, class0, (ConfigurationInterpolator) null, (Collection<SQLRecoverableException>) vector0);
      assertEquals("[]", vector0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = new DefaultConversionHandler();
      Class<SQLDataException> class0 = SQLDataException.class;
      // Undeclared exception!
      try { 
        defaultConversionHandler0.toCollection((Object) "yyyy-MM-dd HH:mm:ss", class0, (ConfigurationInterpolator) null, (Collection<SQLDataException>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Target collection must not be null!
         //
         verifyException("org.apache.commons.configuration2.convert.DefaultConversionHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = DefaultConversionHandler.INSTANCE;
      Class<SQLException> class0 = SQLException.class;
      ConfigurationInterpolator configurationInterpolator0 = new ConfigurationInterpolator();
      Object object0 = defaultConversionHandler0.INSTANCE.toArray("", class0, configurationInterpolator0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = new DefaultConversionHandler();
      Class<SQLException> class0 = SQLException.class;
      Object object0 = defaultConversionHandler0.toArray((Object) null, class0, (ConfigurationInterpolator) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = new DefaultConversionHandler();
      String string0 = defaultConversionHandler0.getDateFormat();
      assertEquals("yyyy-MM-dd HH:mm:ss", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultConversionHandler defaultConversionHandler0 = DefaultConversionHandler.INSTANCE;
      ConstantLookup constantLookup0 = new ConstantLookup();
      Class<Object> class0 = Object.class;
      Object object0 = defaultConversionHandler0.toArray(constantLookup0, class0, (ConfigurationInterpolator) null);
      Class<SQLDataException> class1 = SQLDataException.class;
      // Undeclared exception!
      try { 
        defaultConversionHandler0.to(object0, class1, (ConfigurationInterpolator) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The value 'org.apache.commons.configuration2.interpol.ConstantLookup@1' (class org.apache.commons.configuration2.interpol.ConstantLookup) can't be converted to a java.sql.SQLDataException object
         //
         verifyException("org.apache.commons.configuration2.convert.PropertyConverter", e);
      }
  }
}
