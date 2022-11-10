/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 07 15:54:17 GMT 2022
 */

package org.asynchttpclient;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class BoundRequestBuilder_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.asynchttpclient.BoundRequestBuilder"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BoundRequestBuilder_ESTest_scaffolding.class.getClassLoader() ,
      "io.netty.util.concurrent.ScheduledFutureTask",
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef",
      "io.netty.handler.codec.http.HttpHeaders",
      "io.netty.util.AttributeMap",
      "io.netty.util.internal.Cleaner",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "org.asynchttpclient.Request",
      "io.netty.util.concurrent.ScheduledFuture",
      "io.netty.util.internal.logging.LocationAwareSlf4JLogger",
      "io.netty.util.AsciiString",
      "io.netty.util.internal.PlatformDependent0",
      "org.asynchttpclient.util.Utf8UrlEncoder",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad",
      "io.netty.util.internal.ReflectionUtil",
      "org.asynchttpclient.AsyncHttpClientConfig",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "org.asynchttpclient.proxy.ProxyServer$Builder",
      "org.asynchttpclient.AsyncHandler$State",
      "io.netty.util.internal.ThreadExecutorMap",
      "io.netty.handler.codec.http.DefaultHttpHeaders$2",
      "io.netty.handler.codec.http.DefaultHttpHeaders$1",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "org.asynchttpclient.webdav.WebDavResponse",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "org.asynchttpclient.Param",
      "io.netty.resolver.NameResolver",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "io.netty.util.internal.PlatformDependent0$3",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad",
      "io.netty.util.internal.PlatformDependent0$4",
      "io.netty.handler.codec.HeadersUtils",
      "io.netty.util.internal.PlatformDependent0$5",
      "io.netty.util.concurrent.DefaultPromise$CauseHolder",
      "io.netty.handler.codec.http.cookie.Cookie",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef",
      "io.netty.util.internal.CleanerJava6",
      "org.asynchttpclient.util.UriEncoder$1",
      "io.netty.util.internal.PlatformDependent0$1",
      "org.asynchttpclient.util.UriEncoder$2",
      "io.netty.handler.codec.DefaultHeadersImpl",
      "io.netty.util.internal.PlatformDependent0$2",
      "org.asynchttpclient.SignatureCalculator",
      "org.asynchttpclient.channel.ChannelPoolPartitioning$PerHostChannelPoolPartitioning",
      "io.netty.handler.codec.http.EmptyHttpHeaders",
      "io.netty.resolver.DefaultNameResolver",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.util.concurrent.ProgressivePromise",
      "io.netty.util.internal.logging.InternalLogger",
      "io.netty.handler.codec.http.EmptyHttpHeaders$InstanceInitializer",
      "io.netty.util.internal.PlatformDependent0$10",
      "org.asynchttpclient.request.body.generator.BodyGenerator",
      "io.netty.util.concurrent.EventExecutor",
      "io.netty.util.internal.PlatformDependent$1",
      "io.netty.util.internal.PlatformDependent$2",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue",
      "org.asynchttpclient.AsyncHttpClient",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueProducerNodeRef",
      "io.netty.util.internal.PlatformDependent$4",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0",
      "org.asynchttpclient.Realm",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueue",
      "io.netty.util.concurrent.CompleteFuture",
      "io.netty.util.concurrent.ProgressiveFuture",
      "io.netty.util.internal.LongCounter",
      "io.netty.util.internal.StringUtil",
      "io.netty.util.concurrent.PromiseTask",
      "io.netty.handler.codec.CharSequenceValueConverter",
      "org.asynchttpclient.ClientStats",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "org.asynchttpclient.ListenableFuture",
      "io.netty.util.concurrent.ImmediateEventExecutor$2",
      "io.netty.util.concurrent.ImmediateEventExecutor$1",
      "org.asynchttpclient.request.body.multipart.Part",
      "org.asynchttpclient.util.MiscUtils",
      "io.netty.handler.codec.DefaultHeaders$NameValidator",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2",
      "io.netty.util.internal.ThrowableUtil",
      "org.asynchttpclient.RequestBuilder",
      "io.netty.util.concurrent.GlobalEventExecutor$TaskRunner",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.util.concurrent.Promise",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "org.reactivestreams.Publisher",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.util.ByteProcessor",
      "org.asynchttpclient.Response",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.channel.Channel",
      "io.netty.util.concurrent.DefaultPromise$StacklessCancellationException",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField",
      "io.netty.handler.codec.ValueConverter",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef",
      "io.netty.util.internal.PlatformDependent$ThreadLocalRandomProvider",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.handler.codec.http.HttpHeaderNames",
      "io.netty.util.concurrent.Future",
      "org.asynchttpclient.Realm$Builder",
      "org.asynchttpclient.AsyncCompletionHandler",
      "org.asynchttpclient.channel.ChannelPoolPartitioning",
      "org.asynchttpclient.uri.UriParser",
      "io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil$IndexedQueue",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "org.asynchttpclient.HttpResponseStatus",
      "io.netty.util.internal.DefaultPriorityQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "io.netty.util.concurrent.OrderedEventExecutor",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.util.internal.ThreadExecutorMap$3",
      "io.netty.resolver.AddressResolver",
      "io.netty.util.AsciiString$CharEqualityComparator",
      "org.asynchttpclient.AsyncHandler",
      "io.netty.resolver.InetNameResolver",
      "io.netty.handler.codec.DefaultHeaders",
      "io.netty.util.internal.PriorityQueueNode",
      "org.asynchttpclient.netty.request.NettyRequest",
      "io.netty.resolver.SimpleNameResolver",
      "io.netty.handler.codec.Headers",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.util.internal.shaded.org.jctools.queues.SupportsIterator",
      "org.asynchttpclient.util.Assertions",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad",
      "org.asynchttpclient.BoundRequestBuilder",
      "io.netty.handler.codec.http.DefaultHttpHeaders",
      "org.asynchttpclient.util.UriEncoder",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "io.netty.handler.codec.http.DefaultHttpHeaders$HeaderValueConverterAndValidator",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "org.asynchttpclient.HttpResponseBodyPart",
      "io.netty.channel.ChannelOutboundInvoker",
      "org.asynchttpclient.DefaultRequest",
      "io.netty.util.AsciiString$2",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "org.asynchttpclient.RequestBuilderBase",
      "io.netty.util.internal.PriorityQueue",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
      "io.netty.util.AsciiString$1",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.util.HashingStrategy",
      "org.asynchttpclient.handler.ProgressAsyncHandler",
      "io.netty.util.internal.MathUtil",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.concurrent.FastThreadLocal",
      "org.asynchttpclient.Response$ResponseBuilder",
      "io.netty.util.concurrent.BlockingOperationException",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "io.netty.handler.codec.DefaultHeaders$HeaderEntry",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$2",
      "org.asynchttpclient.util.HttpUtils",
      "io.netty.handler.codec.DefaultHeaders$NameValidator$1",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "io.netty.util.concurrent.DefaultPromise$LeanCancellationException",
      "io.netty.handler.codec.http.HttpHeaderValues",
      "org.asynchttpclient.AsyncCompletionHandlerBase",
      "io.netty.util.concurrent.PromiseTask$SentinelRunnable",
      "io.netty.util.concurrent.EventExecutorGroup",
      "org.asynchttpclient.proxy.ProxyServer",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL1Pad",
      "io.netty.handler.codec.http.DefaultHttpHeaders$HeaderValueConverter",
      "io.netty.util.internal.CleanerJava6$1",
      "org.asynchttpclient.uri.Uri",
      "io.netty.util.concurrent.FailedFuture",
      "io.netty.util.concurrent.GlobalEventExecutor$1"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.asynchttpclient.AsyncHandler", false, BoundRequestBuilder_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.asynchttpclient.AsyncHttpClient", false, BoundRequestBuilder_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.asynchttpclient.ListenableFuture", false, BoundRequestBuilder_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.asynchttpclient.Request", false, BoundRequestBuilder_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BoundRequestBuilder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.asynchttpclient.uri.Uri",
      "org.asynchttpclient.uri.UriParser",
      "org.asynchttpclient.util.Assertions",
      "org.asynchttpclient.util.MiscUtils",
      "io.netty.resolver.SimpleNameResolver",
      "io.netty.resolver.InetNameResolver",
      "io.netty.resolver.DefaultNameResolver",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.logging.LocationAwareSlf4JLogger",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.util.concurrent.CompleteFuture",
      "io.netty.util.concurrent.FailedFuture",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$1",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$2",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.util.concurrent.DefaultPromise$CauseHolder",
      "io.netty.util.concurrent.DefaultPromise$StacklessCancellationException",
      "io.netty.util.internal.ThrowableUtil",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.util.concurrent.PromiseTask$SentinelRunnable",
      "io.netty.util.concurrent.PromiseTask",
      "io.netty.util.concurrent.ScheduledFutureTask",
      "io.netty.util.concurrent.GlobalEventExecutor$1",
      "io.netty.util.concurrent.GlobalEventExecutor$TaskRunner",
      "io.netty.util.internal.DefaultPriorityQueue",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "io.netty.util.internal.StringUtil",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.util.internal.ThreadExecutorMap",
      "io.netty.util.internal.ThreadExecutorMap$3",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.util.concurrent.ImmediateEventExecutor$1",
      "io.netty.util.concurrent.ImmediateEventExecutor$2",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "org.asynchttpclient.RequestBuilderBase",
      "org.asynchttpclient.BoundRequestBuilder",
      "org.asynchttpclient.RequestBuilder",
      "org.asynchttpclient.channel.ChannelPoolPartitioning$PerHostChannelPoolPartitioning",
      "io.netty.handler.codec.http.EmptyHttpHeaders$InstanceInitializer",
      "io.netty.handler.codec.http.EmptyHttpHeaders",
      "io.netty.handler.codec.http.HttpHeaders",
      "io.netty.handler.codec.http.DefaultHttpHeaders$1",
      "io.netty.handler.codec.http.DefaultHttpHeaders$2",
      "io.netty.handler.codec.http.DefaultHttpHeaders",
      "io.netty.handler.codec.DefaultHeaders",
      "io.netty.handler.codec.DefaultHeadersImpl",
      "io.netty.util.internal.MathUtil",
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
      "io.netty.util.AsciiString$1",
      "io.netty.util.AsciiString$2",
      "io.netty.util.AsciiString",
      "io.netty.handler.codec.CharSequenceValueConverter",
      "io.netty.handler.codec.http.DefaultHttpHeaders$HeaderValueConverter",
      "io.netty.handler.codec.http.DefaultHttpHeaders$HeaderValueConverterAndValidator",
      "io.netty.handler.codec.DefaultHeaders$HeaderEntry",
      "io.netty.handler.codec.http.HttpHeaderNames",
      "io.netty.handler.codec.HeadersUtils",
      "io.netty.handler.codec.http.HttpHeaderValues",
      "org.asynchttpclient.util.HttpUtils",
      "org.asynchttpclient.DefaultRequest",
      "io.netty.handler.codec.DefaultHeaders$NameValidator$1",
      "io.netty.handler.codec.DefaultHeaders$NameValidator",
      "org.asynchttpclient.util.Utf8UrlEncoder",
      "org.asynchttpclient.AsyncCompletionHandler",
      "org.asynchttpclient.AsyncCompletionHandlerBase",
      "org.asynchttpclient.Response$ResponseBuilder",
      "org.asynchttpclient.Param",
      "io.reactivex.annotations.BackpressureKind",
      "net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper",
      "org.asynchttpclient.proxy.ProxyServer$Builder",
      "org.asynchttpclient.request.body.generator.ReactiveStreamsBodyGenerator",
      "org.asynchttpclient.request.body.generator.QueueBasedFeedableBodyGenerator",
      "org.asynchttpclient.request.body.generator.UnboundedQueueFeedableBodyGenerator",
      "org.asynchttpclient.Realm$Builder",
      "org.asynchttpclient.util.StringBuilderPool",
      "org.asynchttpclient.util.UriEncoder"
    );
  }
}
