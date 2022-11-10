/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 07 15:45:52 GMT 2022
 */

package org.asynchttpclient.filter;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ThrottleRequestFilter_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.asynchttpclient.filter.ThrottleRequestFilter"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ThrottleRequestFilter_ESTest_scaffolding.class.getClassLoader() ,
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.handler.codec.http.HttpHeaders",
      "io.netty.util.AttributeMap",
      "io.netty.util.internal.Cleaner",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "io.netty.util.IllegalReferenceCountException",
      "org.asynchttpclient.Request",
      "io.netty.util.concurrent.ScheduledFuture",
      "io.netty.util.internal.logging.LocationAwareSlf4JLogger",
      "io.netty.buffer.ByteBufUtil$1",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.buffer.ByteBufUtil$2",
      "io.netty.util.ResourceLeakDetector$TraceRecord",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledDirectByteBuf",
      "io.netty.handler.codec.http.HttpObject",
      "io.netty.buffer.CompositeByteBuf$Component",
      "io.netty.util.internal.ReflectionUtil",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$ExitCondition",
      "io.netty.buffer.AbstractPooledDerivedByteBuf$PooledNonRetainedDuplicateByteBuf",
      "io.netty.buffer.DuplicatedByteBuf",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "org.asynchttpclient.AsyncHandler$State",
      "io.netty.util.internal.ThreadExecutorMap",
      "io.netty.util.internal.ThreadLocalRandom",
      "org.asynchttpclient.filter.RequestFilter",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "org.asynchttpclient.netty.NettyResponseFuture",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeNoCleanerDirectByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue",
      "io.netty.util.internal.PlatformDependent0$3",
      "io.netty.channel.ChannelOutboundBuffer$MessageProcessor",
      "io.netty.util.internal.PlatformDependent0$4",
      "io.netty.util.internal.PlatformDependent0$5",
      "io.netty.util.internal.ObjectPool$RecyclerObjectPool",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.buffer.PooledByteBufAllocator",
      "io.netty.util.internal.PlatformDependent0$1",
      "io.netty.util.internal.PlatformDependent0$2",
      "io.netty.handler.codec.DefaultHeadersImpl",
      "io.netty.handler.codec.http.EmptyHttpHeaders",
      "org.asynchttpclient.SignatureCalculator",
      "io.netty.util.ByteProcessor$1",
      "io.netty.resolver.DefaultNameResolver",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.util.internal.logging.InternalLogger",
      "org.asynchttpclient.request.body.Body$BodyState",
      "io.netty.handler.codec.http.EmptyHttpHeaders$InstanceInitializer",
      "org.asynchttpclient.netty.timeout.ReadTimeoutTimerTask",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache$Entry",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "io.netty.buffer.UnpooledHeapByteBuf",
      "org.asynchttpclient.request.body.generator.BodyGenerator",
      "io.netty.util.concurrent.EventExecutor",
      "io.netty.util.internal.PlatformDependent$1",
      "io.netty.util.internal.PlatformDependent$2",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueProducerNodeRef",
      "io.netty.util.internal.PlatformDependent$4",
      "io.netty.util.ResourceLeakDetector$DefaultResourceLeak",
      "io.netty.channel.ChannelOption",
      "io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode",
      "io.netty.buffer.AdvancedLeakAwareByteBuf",
      "io.netty.buffer.FixedCompositeByteBuf",
      "io.netty.util.internal.LongCounter",
      "io.netty.util.ByteProcessor$4",
      "io.netty.util.ByteProcessor$3",
      "io.netty.util.internal.ThreadLocalRandom$1",
      "io.netty.util.internal.StringUtil",
      "io.netty.util.ByteProcessor$2",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$Consumer",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "org.asynchttpclient.ListenableFuture",
      "org.asynchttpclient.request.body.multipart.Part",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "io.netty.handler.codec.DefaultHeaders$NameValidator",
      "io.netty.util.internal.LongAdderCounter",
      "io.netty.util.internal.ThrowableUtil",
      "io.netty.channel.ChannelMetadata",
      "io.netty.util.TimerTask",
      "io.netty.util.Recycler$3",
      "io.netty.buffer.FixedCompositeByteBuf$Component",
      "io.netty.buffer.SimpleLeakAwareByteBuf",
      "io.netty.channel.ChannelOutboundBuffer$1",
      "io.netty.buffer.PoolArena$SizeClass",
      "io.netty.util.Recycler$1",
      "org.asynchttpclient.RequestBuilder",
      "io.netty.util.Recycler$2",
      "io.netty.util.concurrent.GlobalEventExecutor$TaskRunner",
      "io.netty.util.Attribute",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "io.netty.util.Signal$1",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.buffer.PooledByteBuf",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache$1",
      "io.netty.util.ReferenceCounted",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory",
      "io.netty.buffer.PooledDuplicatedByteBuf$1",
      "org.asynchttpclient.netty.request.body.NettyBody",
      "io.netty.util.concurrent.DefaultFutureListeners",
      "io.netty.buffer.AbstractPooledDerivedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField",
      "org.asynchttpclient.filter.ReleasePermitOnComplete",
      "io.netty.handler.codec.ValueConverter",
      "org.asynchttpclient.filter.FilterContext$FilterContextBuilder",
      "io.netty.util.ResourceLeakDetectorFactory",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeHeapByteBuf",
      "io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node",
      "io.netty.util.concurrent.Future",
      "org.asynchttpclient.Realm$Builder",
      "io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf",
      "io.netty.util.HashingStrategy$1",
      "org.asynchttpclient.channel.ChannelPoolPartitioning",
      "org.asynchttpclient.uri.UriParser",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "io.netty.buffer.ByteBufAllocatorMetricProvider",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.buffer.UnreleasableByteBuf",
      "io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf$1",
      "io.netty.channel.ChannelId",
      "io.netty.buffer.PoolChunkList",
      "org.asynchttpclient.filter.ThrottleRequestFilter",
      "io.netty.buffer.PoolSubpage",
      "io.netty.buffer.SwappedByteBuf",
      "io.netty.util.AbstractConstant",
      "io.netty.buffer.Unpooled",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.buffer.PooledByteBufAllocator$1",
      "io.netty.channel.MessageSizeEstimator",
      "io.netty.buffer.ReadOnlyByteBufferBuf",
      "io.netty.channel.ChannelProgressiveFuture",
      "io.netty.util.internal.DefaultPriorityQueue",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.Recycler$Handle",
      "io.netty.util.concurrent.OrderedEventExecutor",
      "io.netty.util.internal.ThreadExecutorMap$3",
      "org.asynchttpclient.AsyncHandler",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.channel.EventLoop",
      "io.netty.buffer.WrappedUnpooledUnsafeDirectByteBuf",
      "io.netty.util.internal.PriorityQueueNode",
      "io.netty.buffer.PoolArenaMetric",
      "io.netty.buffer.PooledDirectByteBuf$1",
      "io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf",
      "io.netty.handler.codec.DecoderResult",
      "io.netty.buffer.PoolThreadCache",
      "io.netty.util.internal.shaded.org.jctools.queues.SupportsIterator",
      "io.netty.buffer.PooledDuplicatedByteBuf",
      "org.asynchttpclient.util.Assertions",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad",
      "io.netty.handler.codec.http.DefaultHttpHeaders",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "org.asynchttpclient.HttpResponseBodyPart",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "io.netty.handler.codec.http.DefaultHttpHeaders$HeaderValueConverterAndValidator",
      "io.netty.util.AsciiString$2",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "org.asynchttpclient.RequestBuilderBase",
      "io.netty.util.internal.PriorityQueue",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
      "io.netty.buffer.PooledByteBufAllocatorMetric",
      "io.netty.util.AsciiString$1",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.util.ResourceLeak",
      "io.netty.channel.ChannelHandlerContext",
      "io.netty.buffer.PooledUnsafeDirectByteBuf",
      "io.netty.util.HashingStrategy",
      "io.netty.util.internal.MathUtil",
      "io.netty.util.concurrent.BlockingOperationException",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "io.netty.buffer.LongPriorityQueue",
      "org.reactivestreams.Subscriber",
      "io.netty.handler.codec.DefaultHeaders$HeaderEntry",
      "io.netty.util.ResourceLeakTracker",
      "io.netty.channel.ChannelProgressivePromise",
      "io.netty.handler.codec.DefaultHeaders$NameValidator$1",
      "io.netty.util.concurrent.DefaultPromise$LeanCancellationException",
      "io.netty.channel.EventLoopGroup",
      "org.asynchttpclient.netty.channel.ConnectionSemaphore",
      "io.netty.util.concurrent.GenericFutureListener",
      "io.netty.buffer.AbstractUnpooledSlicedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$Supplier",
      "io.netty.channel.Channel$Unsafe",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "io.netty.util.internal.CleanerJava6$1",
      "io.netty.buffer.EmptyByteBuf",
      "io.netty.buffer.AbstractPooledDerivedByteBuf$PooledNonRetainedSlicedByteBuf",
      "org.asynchttpclient.request.body.Body",
      "org.reactivestreams.Subscription",
      "org.asynchttpclient.uri.Uri",
      "org.asynchttpclient.filter.FilterContext",
      "io.netty.channel.ChannelOutboundBuffer$Entry$1",
      "io.netty.util.internal.ObjectPool$ObjectCreator",
      "io.netty.util.concurrent.GlobalEventExecutor$1",
      "io.netty.util.ByteProcessor$IndexNotOfProcessor",
      "io.netty.util.concurrent.ScheduledFutureTask",
      "io.netty.util.AttributeKey",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef",
      "io.netty.buffer.ReadOnlyByteBuf",
      "io.netty.buffer.PooledSlicedByteBuf$1",
      "io.netty.handler.codec.http.HttpMessage",
      "io.netty.util.AsciiString",
      "io.netty.util.internal.ObjectPool$RecyclerObjectPool$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad",
      "org.asynchttpclient.proxy.ProxyServer$Builder",
      "io.netty.util.CharsetUtil",
      "io.netty.handler.codec.http.DefaultHttpHeaders$2",
      "io.netty.handler.codec.http.DefaultHttpHeaders$1",
      "io.netty.buffer.PooledDirectByteBuf",
      "io.netty.buffer.AbstractReferenceCountedByteBuf$1",
      "io.netty.util.concurrent.GenericProgressiveFutureListener",
      "io.netty.buffer.AbstractUnsafeSwappedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.handler.codec.http.HttpRequest",
      "io.netty.resolver.NameResolver",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad",
      "io.netty.buffer.UnsafeDirectSwappedByteBuf",
      "io.netty.util.NettyRuntime",
      "io.netty.buffer.PooledSlicedByteBuf",
      "io.netty.util.concurrent.DefaultPromise$CauseHolder",
      "io.netty.channel.ChannelPipeline",
      "io.netty.channel.RecvByteBufAllocator",
      "io.netty.handler.codec.http.cookie.Cookie",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeDirectByteBuf",
      "io.netty.util.Recycler",
      "io.netty.util.AttributeKey$1",
      "org.asynchttpclient.proxy.ProxyType",
      "io.netty.util.concurrent.ProgressivePromise",
      "io.netty.buffer.UnpooledDirectByteBuf",
      "io.netty.util.internal.PlatformDependent0$10",
      "io.netty.buffer.UnpooledByteBufAllocator$UnpooledByteBufAllocatorMetric",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "io.netty.util.Constant",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue",
      "io.netty.channel.ChannelOption$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0",
      "io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache",
      "org.asynchttpclient.Realm",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueue",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.util.concurrent.CompleteFuture",
      "io.netty.util.concurrent.ProgressiveFuture",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledHeapByteBuf",
      "io.netty.util.concurrent.PromiseTask",
      "io.netty.handler.codec.CharSequenceValueConverter",
      "io.netty.util.internal.ReferenceCountUpdater",
      "io.netty.channel.MessageSizeEstimator$Handle",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.util.internal.EmptyArrays",
      "io.netty.util.concurrent.ImmediateEventExecutor$2",
      "io.netty.util.concurrent.ImmediateEventExecutor$1",
      "io.netty.buffer.PooledUnsafeDirectByteBuf$1",
      "org.asynchttpclient.util.MiscUtils",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2",
      "io.netty.handler.codec.http.HttpMethod$EnumNameMap",
      "io.netty.buffer.UnsafeHeapSwappedByteBuf",
      "io.netty.util.concurrent.Promise",
      "io.netty.util.ByteProcessor$IndexOfProcessor",
      "org.reactivestreams.Publisher",
      "io.netty.util.ByteProcessor",
      "io.netty.buffer.SizeClasses",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.buffer.ByteBufAllocatorMetric",
      "io.netty.channel.Channel",
      "io.netty.util.concurrent.DefaultPromise$StacklessCancellationException",
      "io.netty.channel.RecvByteBufAllocator$Handle",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef",
      "io.netty.buffer.PoolArena$DirectArena",
      "io.netty.util.internal.PlatformDependent$ThreadLocalRandomProvider",
      "io.netty.buffer.ReadOnlyUnsafeDirectByteBuf",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess",
      "io.netty.handler.codec.DecoderResultProvider",
      "io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil$IndexedQueue",
      "io.netty.buffer.AdvancedLeakAwareCompositeByteBuf",
      "org.asynchttpclient.netty.timeout.TimeoutTimerTask",
      "io.netty.util.ConstantPool",
      "io.netty.buffer.PoolSubpageMetric",
      "io.netty.buffer.WrappedCompositeByteBuf",
      "org.asynchttpclient.HttpResponseStatus",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField",
      "io.netty.channel.ChannelPromise",
      "io.netty.buffer.UnpooledUnsafeHeapByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.resolver.AddressResolver",
      "io.netty.buffer.AbstractByteBuf",
      "io.netty.buffer.UnpooledUnsafeDirectByteBuf",
      "io.netty.buffer.PoolArena",
      "io.netty.util.AsciiString$CharEqualityComparator",
      "io.netty.util.internal.logging.InternalLogLevel",
      "io.netty.resolver.InetNameResolver",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.handler.codec.DefaultHeaders",
      "io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf$1",
      "org.asynchttpclient.netty.request.NettyRequest",
      "io.netty.resolver.SimpleNameResolver",
      "org.asynchttpclient.Realm$AuthScheme",
      "io.netty.handler.codec.Headers",
      "io.netty.channel.ChannelOutboundBuffer",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.buffer.CompositeByteBuf",
      "io.netty.buffer.UnpooledDuplicatedByteBuf",
      "io.netty.channel.ChannelOutboundInvoker",
      "io.netty.buffer.AbstractDerivedByteBuf",
      "io.netty.buffer.PoolChunkMetric",
      "io.netty.buffer.PoolChunk",
      "org.asynchttpclient.filter.FilterContext$1",
      "io.netty.channel.ChannelOutboundBuffer$Entry",
      "io.netty.handler.codec.http.HttpVersion",
      "io.netty.channel.WriteBufferWaterMark",
      "io.netty.buffer.UnpooledSlicedByteBuf",
      "io.netty.buffer.SizeClassesMetric",
      "io.netty.util.Recycler$Stack",
      "org.asynchttpclient.netty.timeout.TimeoutsHolder",
      "io.netty.util.internal.ObjectPool",
      "org.asynchttpclient.filter.FilterException",
      "io.netty.buffer.ByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.buffer.SimpleLeakAwareCompositeByteBuf",
      "org.asynchttpclient.netty.channel.ChannelState",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$2",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "io.netty.util.internal.IntegerHolder",
      "io.netty.util.Timeout",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache",
      "io.netty.handler.codec.http.HttpMethod",
      "io.netty.util.concurrent.PromiseTask$SentinelRunnable",
      "io.netty.util.concurrent.EventExecutorGroup",
      "io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf",
      "io.netty.buffer.WrappedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$WaitStrategy",
      "io.netty.channel.ChannelInboundInvoker",
      "org.asynchttpclient.proxy.ProxyServer",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.channel.ChannelFuture",
      "io.netty.buffer.ByteBufUtil",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL1Pad",
      "io.netty.buffer.PoolChunkListMetric",
      "io.netty.buffer.CompositeByteBuf$1",
      "io.netty.channel.ChannelConfig",
      "io.netty.handler.codec.http.DefaultHttpHeaders$HeaderValueConverter",
      "io.netty.buffer.CompositeByteBuf$ByteWrapper",
      "io.netty.buffer.CompositeByteBuf$2",
      "io.netty.channel.ChannelHandler",
      "io.netty.util.internal.ObjectPool$Handle",
      "io.netty.util.Signal",
      "io.netty.util.concurrent.FailedFuture",
      "io.netty.util.Signal$SignalConstant"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.asynchttpclient.filter.FilterContext", false, ThrottleRequestFilter_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ThrottleRequestFilter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.asynchttpclient.filter.ThrottleRequestFilter",
      "org.asynchttpclient.filter.FilterContext",
      "org.asynchttpclient.filter.FilterException",
      "org.asynchttpclient.filter.FilterContext$FilterContextBuilder",
      "org.asynchttpclient.filter.ReleasePermitOnComplete"
    );
  }
}
