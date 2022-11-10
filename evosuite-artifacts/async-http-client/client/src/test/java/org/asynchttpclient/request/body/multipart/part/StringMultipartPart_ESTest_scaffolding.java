/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 07 15:53:31 GMT 2022
 */

package org.asynchttpclient.request.body.multipart.part;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class StringMultipartPart_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.asynchttpclient.request.body.multipart.part.StringMultipartPart"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/async-http-client/client"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(StringMultipartPart_ESTest_scaffolding.class.getClassLoader() ,
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.util.internal.Cleaner",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "io.netty.util.IllegalReferenceCountException",
      "io.netty.util.internal.logging.LocationAwareSlf4JLogger",
      "io.netty.buffer.ByteBufUtil$1",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.buffer.ByteBufUtil$2",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledDirectByteBuf",
      "io.netty.util.internal.ReflectionUtil",
      "io.netty.buffer.DuplicatedByteBuf",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "io.netty.buffer.PoolThreadCache$SubPageMemoryRegionCache",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeNoCleanerDirectByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue",
      "io.netty.util.internal.PlatformDependent0$3",
      "io.netty.util.internal.PlatformDependent0$4",
      "io.netty.util.internal.PlatformDependent0$5",
      "io.netty.util.internal.ObjectPool$RecyclerObjectPool",
      "io.netty.buffer.PooledByteBufAllocator",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.PlatformDependent0$1",
      "io.netty.util.internal.PlatformDependent0$2",
      "io.netty.util.internal.logging.InternalLogger",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache$Entry",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "io.netty.buffer.UnpooledHeapByteBuf",
      "io.netty.util.internal.PlatformDependent$1",
      "io.netty.util.internal.PlatformDependent$2",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueProducerNodeRef",
      "io.netty.util.internal.PlatformDependent$4",
      "io.netty.buffer.AdvancedLeakAwareByteBuf",
      "io.netty.buffer.FixedCompositeByteBuf",
      "io.netty.util.internal.LongCounter",
      "io.netty.util.internal.StringUtil",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "org.asynchttpclient.request.body.multipart.Part",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "io.netty.util.internal.LongAdderCounter",
      "io.netty.util.Recycler$3",
      "io.netty.buffer.SimpleLeakAwareByteBuf",
      "io.netty.buffer.PoolArena$SizeClass",
      "io.netty.util.Recycler$1",
      "io.netty.util.Recycler$2",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "io.netty.buffer.PoolThreadCache$NormalMemoryRegionCache",
      "org.asynchttpclient.request.body.multipart.part.MultipartPart",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.buffer.PooledByteBuf",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache$1",
      "io.netty.util.ReferenceCounted",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory",
      "io.netty.buffer.AbstractPooledDerivedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeHeapByteBuf",
      "io.netty.util.ResourceLeakDetectorFactory",
      "org.asynchttpclient.request.body.multipart.StringPart",
      "io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf",
      "io.netty.buffer.ByteBufAllocatorMetricProvider",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.buffer.UnreleasableByteBuf",
      "io.netty.buffer.PoolChunkList",
      "io.netty.buffer.SwappedByteBuf",
      "io.netty.buffer.PoolSubpage",
      "io.netty.buffer.Unpooled",
      "io.netty.buffer.PooledByteBufAllocator$1",
      "io.netty.buffer.ReadOnlyByteBufferBuf",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.Recycler$Handle",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.buffer.WrappedUnpooledUnsafeDirectByteBuf",
      "io.netty.buffer.PoolArenaMetric",
      "io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf",
      "org.asynchttpclient.request.body.multipart.part.PartVisitor$CounterPartVisitor",
      "io.netty.buffer.PoolThreadCache",
      "io.netty.util.internal.shaded.org.jctools.queues.SupportsIterator",
      "io.netty.buffer.PooledDuplicatedByteBuf",
      "org.asynchttpclient.util.Assertions",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "io.netty.buffer.LongLongHashMap",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
      "io.netty.buffer.PooledByteBufAllocatorMetric",
      "io.netty.util.ResourceLeak",
      "io.netty.buffer.PooledUnsafeDirectByteBuf",
      "io.netty.util.internal.MathUtil",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "io.netty.buffer.LongPriorityQueue",
      "io.netty.util.ResourceLeakTracker",
      "io.netty.buffer.AbstractUnpooledSlicedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "io.netty.buffer.EmptyByteBuf",
      "io.netty.util.internal.CleanerJava6$1",
      "io.netty.util.internal.ObjectPool$ObjectCreator",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef",
      "io.netty.buffer.ReadOnlyByteBuf",
      "io.netty.util.AsciiString",
      "io.netty.util.internal.ObjectPool$RecyclerObjectPool$1",
      "org.apache.tomcat.util.buf.Utf8Encoder",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad",
      "io.netty.buffer.UnsafeByteBufUtil",
      "io.netty.util.CharsetUtil",
      "io.netty.buffer.AbstractReferenceCountedByteBuf$1",
      "io.netty.buffer.PooledDirectByteBuf",
      "io.netty.buffer.AbstractUnsafeSwappedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "org.asynchttpclient.Param",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad",
      "io.netty.buffer.UnsafeDirectSwappedByteBuf",
      "io.netty.util.NettyRuntime",
      "io.netty.buffer.PooledSlicedByteBuf",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeDirectByteBuf",
      "io.netty.util.Recycler",
      "io.netty.util.internal.shaded.org.jctools.util.Pow2",
      "io.netty.buffer.UnpooledDirectByteBuf",
      "io.netty.util.internal.PlatformDependent0$10",
      "io.netty.buffer.UnpooledByteBufAllocator$UnpooledByteBufAllocatorMetric",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0",
      "io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueue",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledHeapByteBuf",
      "io.netty.util.Recycler$DefaultHandle",
      "io.netty.util.internal.ReferenceCountUpdater",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.util.internal.EmptyArrays",
      "io.netty.buffer.PooledUnsafeDirectByteBuf$1",
      "org.asynchttpclient.util.MiscUtils",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2",
      "org.asynchttpclient.request.body.multipart.part.StringMultipartPart",
      "io.netty.util.ByteProcessor",
      "io.netty.buffer.SizeClasses",
      "io.netty.buffer.ByteBufAllocatorMetric",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef",
      "io.netty.buffer.PoolArena$DirectArena",
      "io.netty.buffer.ReadOnlyUnsafeDirectByteBuf",
      "io.netty.util.internal.PlatformDependent$ThreadLocalRandomProvider",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess",
      "io.netty.buffer.AdvancedLeakAwareCompositeByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil$IndexedQueue",
      "io.netty.buffer.PoolSubpageMetric",
      "io.netty.buffer.WrappedCompositeByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField",
      "io.netty.buffer.UnpooledUnsafeHeapByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "org.asynchttpclient.request.body.multipart.part.PartVisitor$ByteBufVisitor",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.buffer.AbstractByteBuf",
      "io.netty.buffer.UnpooledUnsafeDirectByteBuf",
      "io.netty.buffer.PoolArena",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.buffer.CompositeByteBuf",
      "io.netty.buffer.UnpooledDuplicatedByteBuf",
      "org.asynchttpclient.request.body.multipart.part.MultipartState",
      "io.netty.buffer.AbstractDerivedByteBuf",
      "io.netty.buffer.PoolChunkMetric",
      "io.netty.buffer.PoolChunk",
      "org.asynchttpclient.request.body.multipart.part.PartVisitor",
      "io.netty.buffer.UnpooledSlicedByteBuf",
      "io.netty.buffer.SizeClassesMetric",
      "io.netty.buffer.AbstractByteBufAllocator$1",
      "io.netty.util.Recycler$Stack",
      "org.asynchttpclient.request.body.multipart.PartBase",
      "io.netty.util.internal.ObjectPool",
      "io.netty.buffer.ByteBuf",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.buffer.SimpleLeakAwareCompositeByteBuf",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "io.netty.buffer.PoolThreadCache$1",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache",
      "io.netty.buffer.WrappedByteBuf",
      "io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.buffer.ByteBufUtil",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL1Pad",
      "io.netty.buffer.PoolChunkListMetric",
      "io.netty.util.internal.ObjectPool$Handle"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.nio.channels.WritableByteChannel", false, StringMultipartPart_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.asynchttpclient.request.body.multipart.StringPart", false, StringMultipartPart_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(StringMultipartPart_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.asynchttpclient.request.body.multipart.part.MultipartPart",
      "org.asynchttpclient.request.body.multipart.part.StringMultipartPart",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.logging.Log4J2LoggerFactory",
      "io.netty.util.internal.logging.Log4JLoggerFactory",
      "io.netty.util.internal.logging.JdkLoggerFactory",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.logging.LocationAwareSlf4JLogger",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.util.internal.PlatformDependent0$1",
      "io.netty.util.internal.ReflectionUtil",
      "io.netty.util.internal.PlatformDependent0$2",
      "io.netty.util.internal.PlatformDependent0$3",
      "io.netty.util.internal.PlatformDependent0$4",
      "io.netty.util.internal.PlatformDependent0$5",
      "io.netty.util.internal.PlatformDependent0$10",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.util.internal.PlatformDependent$1",
      "io.netty.util.internal.PlatformDependent$2",
      "io.netty.util.internal.CleanerJava6$1",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.PlatformDependent$4",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.internal.CleanerJava9$1",
      "io.netty.util.internal.CleanerJava9",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.util.internal.EmptyArrays",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.buffer.ByteBuf",
      "io.netty.buffer.EmptyByteBuf",
      "io.netty.util.internal.StringUtil",
      "io.netty.buffer.UnpooledByteBufAllocator$UnpooledByteBufAllocatorMetric",
      "io.netty.util.internal.LongAdderCounter",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "io.netty.buffer.Unpooled",
      "org.asynchttpclient.request.body.multipart.part.MultipartState",
      "org.asynchttpclient.request.body.multipart.PartBase",
      "org.asynchttpclient.request.body.multipart.StringPart",
      "org.asynchttpclient.request.body.multipart.part.PartVisitor$CounterPartVisitor",
      "org.asynchttpclient.util.MiscUtils",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory",
      "io.netty.util.ResourceLeakDetectorFactory",
      "io.netty.buffer.AbstractByteBuf",
      "io.netty.util.internal.ReferenceCountUpdater",
      "io.netty.buffer.AbstractReferenceCountedByteBuf$1",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "io.netty.buffer.UnpooledHeapByteBuf",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.buffer.ByteBufUtil$1",
      "io.netty.util.CharsetUtil",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.util.NettyRuntime",
      "io.netty.buffer.PooledByteBufAllocator$1",
      "io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache",
      "io.netty.buffer.SizeClasses",
      "io.netty.buffer.PoolArena",
      "io.netty.buffer.PoolArena$DirectArena",
      "io.netty.buffer.PoolThreadCache",
      "io.netty.buffer.PoolSubpage",
      "io.netty.buffer.PoolChunkList",
      "io.netty.buffer.PooledByteBufAllocatorMetric",
      "io.netty.buffer.PooledByteBufAllocator",
      "io.netty.buffer.ByteBufUtil$2",
      "io.netty.buffer.ByteBufUtil",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache$1",
      "io.netty.util.internal.ObjectPool",
      "io.netty.util.internal.ObjectPool$RecyclerObjectPool",
      "io.netty.util.Recycler$1",
      "io.netty.util.internal.MathUtil",
      "io.netty.util.Recycler$3",
      "io.netty.util.Recycler",
      "io.netty.util.internal.ObjectPool$RecyclerObjectPool$1",
      "io.netty.util.Recycler$2",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache",
      "io.netty.buffer.PoolThreadCache$SubPageMemoryRegionCache",
      "io.netty.buffer.PoolArena$SizeClass",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "io.netty.util.internal.shaded.org.jctools.util.Pow2",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess",
      "io.netty.buffer.PoolThreadCache$NormalMemoryRegionCache",
      "io.netty.buffer.PooledByteBuf",
      "io.netty.buffer.PooledUnsafeDirectByteBuf$1",
      "io.netty.buffer.PooledUnsafeDirectByteBuf",
      "io.netty.util.Recycler$Stack",
      "io.netty.util.Recycler$DefaultHandle",
      "io.netty.buffer.PoolChunk",
      "io.netty.buffer.LongPriorityQueue",
      "io.netty.buffer.LongLongHashMap",
      "io.netty.buffer.AbstractByteBufAllocator$1",
      "org.asynchttpclient.request.body.multipart.part.PartVisitor$ByteBufVisitor",
      "io.netty.buffer.UnsafeByteBufUtil",
      "io.netty.buffer.PoolThreadCache$1",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache$Entry",
      "org.asynchttpclient.util.Assertions",
      "io.netty.util.IllegalReferenceCountException",
      "org.apache.tomcat.util.buf.Utf8Encoder",
      "io.netty.buffer.UnpooledUnsafeHeapByteBuf",
      "io.netty.buffer.AbstractDerivedByteBuf",
      "io.netty.buffer.ReadOnlyByteBuf",
      "org.asynchttpclient.request.body.multipart.part.MultipartPart$1",
      "org.asynchttpclient.Param",
      "org.eclipse.jetty.util.PathWatcher$Config",
      "org.eclipse.jetty.util.IncludeExcludeSet",
      "org.eclipse.jetty.util.PathWatcher$PathMatcherSet",
      "io.netty.buffer.UnpooledDirectByteBuf",
      "io.netty.buffer.UnpooledUnsafeDirectByteBuf",
      "io.netty.buffer.CompositeByteBuf$1",
      "io.netty.buffer.CompositeByteBuf$2",
      "io.netty.buffer.CompositeByteBuf",
      "io.netty.util.ResourceLeakDetector$DefaultResourceLeak",
      "io.netty.util.ResourceLeakDetector$TraceRecord$1",
      "io.netty.util.ResourceLeakDetector$TraceRecord",
      "io.netty.buffer.WrappedByteBuf",
      "io.netty.buffer.SimpleLeakAwareByteBuf",
      "io.netty.buffer.CompositeByteBuf$Component",
      "io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeNoCleanerDirectByteBuf",
      "org.asynchttpclient.request.body.multipart.FileLikePart",
      "org.asynchttpclient.request.body.multipart.FilePart",
      "io.netty.buffer.AbstractUnpooledSlicedByteBuf",
      "io.netty.buffer.UnpooledSlicedByteBuf",
      "io.netty.buffer.HeapByteBufUtil",
      "io.netty.util.ReferenceCountUtil",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeHeapByteBuf",
      "io.netty.util.ByteProcessor$IndexNotOfProcessor"
    );
  }
}
