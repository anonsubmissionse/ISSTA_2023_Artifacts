/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Oct 09 18:24:42 GMT 2022
 */

package org.apache.commons.beanutils.converters;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BooleanConverter_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.beanutils.converters.BooleanConverter"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-beanutils-1.9.4"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BooleanConverter_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.beanutils.converters.BigDecimalConverter",
      "org.apache.commons.beanutils.SuppressPropertiesBeanIntrospector",
      "org.apache.commons.beanutils.BeanUtilsBean$1",
      "org.apache.commons.beanutils.converters.SqlTimestampConverter",
      "org.apache.commons.beanutils.PropertyUtils",
      "org.apache.commons.beanutils.ConversionException",
      "org.apache.commons.beanutils.BeanUtils",
      "org.apache.commons.beanutils.ContextClassLoaderLocal",
      "org.apache.commons.beanutils.converters.ArrayConverter",
      "org.apache.commons.collections.FastHashMap",
      "org.apache.commons.beanutils.converters.BooleanConverter",
      "org.apache.commons.beanutils.ConvertUtilsBean",
      "org.apache.commons.beanutils.IntrospectionContext",
      "org.apache.commons.beanutils.converters.DateTimeConverter",
      "org.apache.commons.beanutils.converters.ClassConverter",
      "org.apache.commons.beanutils.converters.AbstractConverter",
      "org.apache.commons.beanutils.converters.ByteConverter",
      "org.apache.commons.beanutils.converters.DateConverter",
      "org.apache.commons.beanutils.expression.Resolver",
      "org.apache.commons.beanutils.converters.ConverterFacade",
      "org.apache.commons.beanutils.converters.ShortConverter",
      "org.apache.commons.beanutils.converters.SqlTimeConverter",
      "org.apache.commons.beanutils.converters.NumberConverter",
      "org.apache.commons.beanutils.converters.StringConverter",
      "org.apache.commons.beanutils.converters.FloatConverter",
      "org.apache.commons.beanutils.BeanIntrospectionData",
      "org.apache.commons.beanutils.converters.LongConverter",
      "org.apache.commons.beanutils.DynaProperty",
      "org.apache.commons.beanutils.NestedNullException",
      "org.apache.commons.beanutils.DefaultBeanIntrospector",
      "org.apache.commons.beanutils.BeanUtilsBean",
      "org.apache.commons.beanutils.converters.BigIntegerConverter",
      "org.apache.commons.beanutils.WeakFastHashMap",
      "org.apache.commons.beanutils.converters.CharacterConverter",
      "org.apache.commons.beanutils.converters.SqlDateConverter",
      "org.apache.commons.beanutils.BeanAccessLanguageException",
      "org.apache.commons.beanutils.converters.IntegerConverter",
      "org.apache.commons.beanutils.converters.FileConverter",
      "org.apache.commons.beanutils.MappedPropertyDescriptor",
      "org.apache.commons.beanutils.expression.DefaultResolver",
      "org.apache.commons.beanutils.Converter",
      "org.apache.commons.beanutils.ConvertUtils",
      "org.apache.commons.beanutils.PropertyUtilsBean",
      "org.apache.commons.beanutils.BeanIntrospector",
      "org.apache.commons.beanutils.converters.URLConverter",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "org.apache.commons.beanutils.converters.DoubleConverter",
      "org.apache.commons.beanutils.converters.CalendarConverter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BooleanConverter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.beanutils.converters.AbstractConverter",
      "org.apache.commons.beanutils.converters.BooleanConverter",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "org.apache.commons.beanutils.ConversionException",
      "org.apache.commons.beanutils.ConvertUtils",
      "org.apache.commons.beanutils.BeanUtils",
      "org.apache.commons.beanutils.ContextClassLoaderLocal",
      "org.apache.commons.beanutils.BeanUtilsBean$1",
      "org.apache.commons.beanutils.BeanUtilsBean",
      "org.apache.commons.beanutils.ConvertUtilsBean",
      "org.apache.commons.beanutils.WeakFastHashMap",
      "org.apache.commons.beanutils.converters.ConverterFacade",
      "org.apache.commons.beanutils.converters.NumberConverter",
      "org.apache.commons.beanutils.converters.ByteConverter",
      "org.apache.commons.beanutils.converters.CharacterConverter",
      "org.apache.commons.beanutils.converters.DoubleConverter",
      "org.apache.commons.beanutils.converters.FloatConverter",
      "org.apache.commons.beanutils.converters.IntegerConverter",
      "org.apache.commons.beanutils.converters.LongConverter",
      "org.apache.commons.beanutils.converters.ShortConverter",
      "org.apache.commons.beanutils.converters.BigDecimalConverter",
      "org.apache.commons.beanutils.converters.BigIntegerConverter",
      "org.apache.commons.beanutils.converters.StringConverter",
      "org.apache.commons.beanutils.converters.ClassConverter",
      "org.apache.commons.beanutils.converters.DateTimeConverter",
      "org.apache.commons.beanutils.converters.DateConverter",
      "org.apache.commons.beanutils.converters.CalendarConverter",
      "org.apache.commons.beanutils.converters.FileConverter",
      "org.apache.commons.beanutils.converters.SqlDateConverter",
      "org.apache.commons.beanutils.converters.SqlTimeConverter",
      "org.apache.commons.beanutils.converters.SqlTimestampConverter",
      "org.apache.commons.beanutils.converters.URLConverter",
      "org.apache.commons.beanutils.converters.ArrayConverter",
      "org.apache.commons.beanutils.PropertyUtilsBean",
      "org.apache.commons.beanutils.expression.DefaultResolver",
      "org.apache.commons.beanutils.DefaultBeanIntrospector",
      "org.apache.commons.beanutils.SuppressPropertiesBeanIntrospector"
    );
  }
}
