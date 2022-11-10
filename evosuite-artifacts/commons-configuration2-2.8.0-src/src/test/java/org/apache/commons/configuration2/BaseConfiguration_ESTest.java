/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 01:02:19 GMT 2022
 */

package org.apache.commons.configuration2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.configuration2.BaseConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.XMLPropertiesConfiguration;
import org.apache.commons.configuration2.event.ConfigurationEvent;
import org.apache.commons.configuration2.event.EventListener;
import org.apache.commons.configuration2.event.EventType;
import org.apache.commons.configuration2.interpol.ConfigurationInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseConfiguration_ESTest extends BaseConfiguration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BaseConfiguration baseConfiguration0 = new BaseConfiguration();
      baseConfiguration0.addPropertyDirect("b;c/{w*-F!", (Object) null);
      int int0 = baseConfiguration0.sizeInternal();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseConfiguration baseConfiguration0 = new BaseConfiguration();
      Object object0 = baseConfiguration0.getPropertyInternal("");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BaseConfiguration baseConfiguration0 = new BaseConfiguration();
      baseConfiguration0.addProperty("catalog-name", "catalog-name");
      Object object0 = baseConfiguration0.getPropertyInternal("catalog-name");
      assertEquals("catalog-name", object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PropertiesConfiguration propertiesConfiguration0 = new PropertiesConfiguration();
      propertiesConfiguration0.setInterpolator((ConfigurationInterpolator) null);
      // Undeclared exception!
      try { 
        propertiesConfiguration0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.configuration2.AbstractConfiguration", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BaseConfiguration baseConfiguration0 = new BaseConfiguration();
      Object object0 = baseConfiguration0.clone();
      assertNotSame(object0, baseConfiguration0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PropertiesConfiguration propertiesConfiguration0 = new PropertiesConfiguration();
      propertiesConfiguration0.addPropertyDirect("/(^qLTycd?C/<jT", "/(^qLTycd?C/<jT");
      Object object0 = propertiesConfiguration0.clone();
      assertNotSame(object0, propertiesConfiguration0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PropertiesConfiguration propertiesConfiguration0 = new PropertiesConfiguration();
      EventType<ConfigurationEvent> eventType0 = ConfigurationEvent.CLEAR_PROPERTY;
      Collection<EventListener<? super ConfigurationEvent>> collection0 = propertiesConfiguration0.getEventListeners(eventType0);
      propertiesConfiguration0.addPropertyDirect("ISO-8859-1", collection0);
      Object object0 = propertiesConfiguration0.clone();
      assertNotSame(object0, propertiesConfiguration0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XMLPropertiesConfiguration xMLPropertiesConfiguration0 = new XMLPropertiesConfiguration();
      xMLPropertiesConfiguration0.addProperty("UTF-8", "UTF-8");
      boolean boolean0 = xMLPropertiesConfiguration0.containsKeyInternal("UTF-8");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PropertiesConfiguration propertiesConfiguration0 = new PropertiesConfiguration();
      boolean boolean0 = propertiesConfiguration0.containsKeyInternal("ISO-8859-1");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XMLPropertiesConfiguration xMLPropertiesConfiguration0 = new XMLPropertiesConfiguration();
      boolean boolean0 = xMLPropertiesConfiguration0.isEmptyInternal();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PropertiesConfiguration propertiesConfiguration0 = new PropertiesConfiguration();
      EventType<ConfigurationEvent> eventType0 = ConfigurationEvent.CLEAR_PROPERTY;
      Collection<EventListener<? super ConfigurationEvent>> collection0 = propertiesConfiguration0.getEventListeners(eventType0);
      propertiesConfiguration0.addPropertyDirect("ISO-8859-1", collection0);
      boolean boolean0 = propertiesConfiguration0.isEmptyInternal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PropertiesConfiguration propertiesConfiguration0 = new PropertiesConfiguration();
      int int0 = propertiesConfiguration0.sizeInternal();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PropertiesConfiguration propertiesConfiguration0 = new PropertiesConfiguration();
      Iterator<String> iterator0 = propertiesConfiguration0.getKeysInternal();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XMLPropertiesConfiguration xMLPropertiesConfiguration0 = new XMLPropertiesConfiguration();
      xMLPropertiesConfiguration0.clearInternal();
      assertFalse(xMLPropertiesConfiguration0.isDetailEvents());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XMLPropertiesConfiguration xMLPropertiesConfiguration0 = new XMLPropertiesConfiguration();
      xMLPropertiesConfiguration0.clearPropertyDirect("UTF-8");
      assertFalse(xMLPropertiesConfiguration0.isDetailEvents());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PropertiesConfiguration propertiesConfiguration0 = new PropertiesConfiguration();
      EventType<ConfigurationEvent> eventType0 = ConfigurationEvent.CLEAR_PROPERTY;
      Collection<EventListener<? super ConfigurationEvent>> collection0 = propertiesConfiguration0.getEventListeners(eventType0);
      propertiesConfiguration0.addPropertyDirect("ISO-8859-1", collection0);
      propertiesConfiguration0.addPropertyDirect("ISO-8859-1", "ISO-8859-1");
      Integer integer0 = new Integer(0);
      propertiesConfiguration0.addPropertyDirect("ISO-8859-1", integer0);
      assertFalse(propertiesConfiguration0.isThrowExceptionOnMissing());
  }
}
