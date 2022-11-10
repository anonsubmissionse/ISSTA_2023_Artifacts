/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 07 03:58:20 GMT 2022
 */

package org.springside.modules.utils.net;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class IPUtil_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.springside.modules.utils.net.IPUtil"; 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/springside4/modules/utils"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(IPUtil_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.hash.HashCode$LongHashCode",
      "com.google.common.io.ByteStreams$1",
      "com.google.common.hash.Crc32cHashFunction",
      "com.google.common.io.ByteStreams$FastByteArrayOutputStream",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.base.CharMatcher$ForPredicate",
      "com.google.common.base.JdkPattern",
      "com.google.common.base.CharMatcher$JavaDigit",
      "com.google.common.hash.AbstractNonStreamingHashFunction",
      "com.google.common.base.Splitter$MapSplitter",
      "org.springside.modules.utils.collection.type.SortedArrayList",
      "com.google.common.base.CharMatcher$IsNot",
      "com.google.common.base.CharMatcher$InRange",
      "com.google.common.base.CharMatcher$JavaLetter",
      "com.google.common.base.CharMatcher$JavaLetterOrDigit",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "com.google.common.hash.Hashing$1",
      "com.google.common.base.Converter$IdentityConverter",
      "com.google.common.base.CommonPattern",
      "com.google.common.hash.Funnel",
      "com.google.common.base.Predicate",
      "com.google.common.base.CharMatcher$IsEither",
      "com.google.common.io.ByteStreams",
      "com.google.common.base.CharMatcher$Invisible",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.hash.Hashing$ChecksumType$2",
      "com.google.common.hash.Hashing$ChecksumType$1",
      "com.google.common.hash.Hashing$ChecksumType",
      "com.google.common.base.CharMatcher$Any",
      "com.google.common.io.ByteProcessor",
      "org.springside.modules.utils.net.IPUtil",
      "com.google.common.hash.Hashing$Md5Holder",
      "com.google.common.net.InetAddresses$TeredoInfo",
      "com.google.common.base.JdkPattern$JdkMatcher",
      "com.google.common.hash.Murmur3_32HashFunction",
      "com.google.common.hash.MessageDigestHashFunction",
      "com.google.common.hash.AbstractStreamingHashFunction",
      "com.google.common.hash.Hashing$SipHash24Holder",
      "com.google.common.io.ByteArrayDataInput",
      "com.google.common.hash.PrimitiveSink",
      "com.google.common.hash.Hasher",
      "com.google.common.hash.Hashing$LinearCongruentialGenerator",
      "com.google.common.hash.HashCode",
      "com.google.common.base.CharMatcher",
      "com.google.common.io.ByteStreams$ByteArrayDataInputStream",
      "com.google.common.base.CharMatcher$And",
      "com.google.common.hash.FarmHashFingerprint64",
      "com.google.common.base.CharMatcher$AnyOf",
      "com.google.common.base.Preconditions",
      "com.google.common.net.InetAddresses",
      "com.google.common.base.CharMatcher$1",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.google.common.base.Converter$ConverterComposition",
      "com.google.common.hash.Hashing$Sha256Holder",
      "org.springside.modules.utils.collection.ListUtil",
      "com.google.common.hash.Hashing$Sha384Holder",
      "com.google.common.io.ByteStreams$ByteArrayDataOutputStream",
      "com.google.common.base.CommonMatcher",
      "com.google.common.base.CharMatcher$BitSetMatcher",
      "org.springside.modules.utils.text.MoreStringUtil",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "com.google.common.base.Splitter",
      "com.google.common.base.CharMatcher$JavaUpperCase",
      "com.google.common.io.ByteArrayDataOutput",
      "com.google.common.base.Converter",
      "com.google.common.hash.Hashing$Sha1Holder",
      "com.google.common.base.Function",
      "com.google.common.base.CharMatcher$BreakingWhitespace",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.io.ByteStreams$LimitedInputStream",
      "com.google.common.primitives.Ints$IntConverter",
      "com.google.common.base.Converter$ReverseConverter",
      "com.google.common.hash.Hashing$Sha512Holder",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.CharMatcher$SingleWidth",
      "com.google.common.base.CharMatcher$JavaLowerCase",
      "com.google.common.hash.HashFunction",
      "com.google.common.base.Splitter$Strategy",
      "org.springside.modules.utils.number.NumberUtil",
      "com.google.common.hash.Hashing$Crc32cHolder",
      "com.google.common.hash.ChecksumHashFunction",
      "com.google.common.hash.Hashing$Murmur3_128Holder",
      "com.google.common.hash.SipHashFunction",
      "com.google.common.base.AbstractIterator$1",
      "com.google.common.base.Supplier",
      "com.google.common.hash.Hashing",
      "com.google.common.hash.AbstractCompositeHashFunction",
      "com.google.common.hash.Hashing$FarmHashFingerprint64Holder",
      "com.google.common.base.Splitter$1$1",
      "com.google.common.hash.Murmur3_128HashFunction",
      "com.google.common.base.AbstractIterator$State",
      "com.google.common.hash.Hashing$Murmur3_32Holder",
      "com.google.common.base.CharMatcher$Negated",
      "com.google.common.base.Splitter$5",
      "com.google.common.hash.Hashing$Crc32Holder",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.common.hash.Hashing$Adler32Holder",
      "com.google.common.primitives.Ints",
      "com.google.common.hash.HashCode$IntHashCode",
      "com.google.common.hash.HashCode$BytesHashCode",
      "com.google.common.base.CharMatcher$Or",
      "com.google.common.base.Splitter$1",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.hash.Hashing$ConcatenatedHashFunction",
      "com.google.common.base.Splitter$SplittingIterator",
      "com.google.common.base.AbstractIterator",
      "com.google.common.base.CharMatcher$Digit"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(IPUtil_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.springside.modules.utils.net.IPUtil",
      "com.google.common.base.CharMatcher$BreakingWhitespace",
      "com.google.common.base.Preconditions",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "com.google.common.base.CharMatcher$Digit",
      "com.google.common.base.CharMatcher$JavaDigit",
      "com.google.common.base.CharMatcher$JavaLetter",
      "com.google.common.base.CharMatcher$JavaLetterOrDigit",
      "com.google.common.base.CharMatcher$JavaUpperCase",
      "com.google.common.base.CharMatcher$JavaLowerCase",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.google.common.base.CharMatcher$Invisible",
      "com.google.common.base.CharMatcher$SingleWidth",
      "com.google.common.base.CharMatcher$Any",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.base.Splitter",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.Splitter$1",
      "com.google.common.base.Splitter$5",
      "com.google.common.base.AbstractIterator",
      "com.google.common.base.Splitter$SplittingIterator",
      "com.google.common.base.Splitter$1$1",
      "com.google.common.base.AbstractIterator$State",
      "com.google.common.base.AbstractIterator$1",
      "com.google.common.net.InetAddresses",
      "com.google.common.hash.Hashing",
      "com.google.common.hash.AbstractStreamingHashFunction",
      "com.google.common.hash.Murmur3_32HashFunction",
      "com.google.common.hash.Hashing$Murmur3_32Holder",
      "org.springside.modules.utils.text.MoreStringUtil",
      "com.google.common.io.ByteStreams$1",
      "com.google.common.io.ByteStreams",
      "com.google.common.io.ByteStreams$ByteArrayDataInputStream",
      "com.google.common.primitives.Ints",
      "org.springside.modules.utils.number.NumberUtil",
      "org.springside.modules.utils.collection.ListUtil"
    );
  }
}
