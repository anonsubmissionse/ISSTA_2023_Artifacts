/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 22:02:10 GMT 2022
 */

package org.apache.commons.jcs3.auxiliary.remote.http.client;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class RemoteHttpCache_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.jcs3.auxiliary.remote.http.client.RemoteHttpCache"; 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-jcs3-3.1-src/commons-jcs-core"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
    java.lang.System.setProperty("java.rmi.server.hostname", "127.0.0.1"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RemoteHttpCache_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.http.conn.scheme.LayeredSocketFactory",
      "org.apache.commons.jcs3.auxiliary.remote.server.behavior.RemoteType",
      "org.apache.http.conn.scheme.SocketFactoryAdaptor",
      "org.apache.commons.jcs3.engine.behavior.ICacheElement",
      "org.apache.commons.jcs3.utils.struct.DoubleLinkedList",
      "org.apache.http.cookie.MalformedCookieException",
      "org.apache.http.conn.ConnectionRequest",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCache",
      "org.apache.commons.jcs3.utils.threadpool.DaemonThreadFactory",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheAttributes",
      "org.apache.http.config.SocketConfig$Builder",
      "org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal$ZombieEvent",
      "org.apache.commons.jcs3.admin.CountingOnlyOutputStream",
      "org.apache.commons.jcs3.engine.behavior.ICache",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteLocation",
      "org.apache.commons.jcs3.log.LogFactory",
      "org.apache.http.conn.HttpClientConnectionManager",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheFactory",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralCacheAttributes",
      "org.apache.http.HttpException",
      "org.apache.http.cookie.CookieSpec",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager$ThreadPoolManagerHolder",
      "org.apache.http.client.CredentialsProvider",
      "org.apache.http.client.ClientProtocolException",
      "org.apache.http.client.methods.Configurable",
      "org.apache.commons.jcs3.engine.CacheStatus",
      "org.apache.commons.jcs3.engine.behavior.ICompositeCacheManager",
      "org.apache.commons.jcs3.auxiliary.remote.http.client.behavior.IRemoteHttpCacheClient",
      "org.apache.commons.jcs3.engine.control.CompositeCacheConfigurator",
      "org.apache.commons.jcs3.auxiliary.remote.CommonRemoteCacheAttributes",
      "org.apache.http.client.methods.RequestBuilder$InternalRequest",
      "org.apache.http.auth.Credentials",
      "org.apache.commons.jcs3.utils.struct.DoubleLinkedListNode",
      "org.apache.http.client.methods.AbstractExecutionAwareRequest",
      "org.apache.http.HttpConnectionMetrics",
      "org.apache.commons.jcs3.log.JulLogFactory",
      "org.apache.http.HttpClientConnection",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheEventLogging",
      "org.apache.commons.jcs3.access.exception.CacheException",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPListener",
      "org.apache.http.conn.ConnectionPoolTimeoutException",
      "org.apache.commons.jcs3.access.exception.ObjectExistsException",
      "org.apache.commons.jcs3.engine.stats.StatElement",
      "org.apache.http.protocol.HttpProcessor",
      "org.apache.http.auth.AuthProtocolState",
      "org.apache.commons.jcs3.engine.behavior.IShutdownObserver",
      "org.apache.commons.jcs3.engine.behavior.ICacheEventQueue$QueueType",
      "org.apache.http.client.RedirectStrategy",
      "org.apache.commons.jcs3.engine.control.event.behavior.ElementEventType",
      "org.apache.commons.jcs3.utils.discovery.DiscoveredService",
      "org.apache.commons.jcs3.auxiliary.remote.http.client.AbstractHttpClient",
      "org.apache.http.protocol.HttpContext",
      "org.apache.http.params.HttpParams",
      "org.apache.http.HttpResponse",
      "org.apache.http.impl.client.HttpClientBuilder",
      "org.apache.commons.jcs3.engine.behavior.ICompositeCacheAttributes",
      "org.apache.commons.jcs3.engine.control.CompositeCache",
      "org.apache.http.config.MessageConstraints",
      "org.apache.commons.jcs3.engine.behavior.IRequireScheduler",
      "org.apache.http.Header",
      "org.apache.commons.jcs3.auxiliary.remote.http.client.RemoteHttpClientListener",
      "org.apache.commons.jcs3.utils.timing.ElapsedTimer",
      "org.apache.commons.jcs3.engine.control.group.GroupId",
      "org.apache.commons.jcs3.utils.serialization.StandardSerializer",
      "org.apache.http.conn.ConnectionKeepAliveStrategy",
      "org.apache.commons.jcs3.engine.control.event.behavior.IElementEventQueue",
      "org.apache.http.conn.ssl.X509HostnameVerifier",
      "org.apache.commons.jcs3.auxiliary.remote.value.RemoteCacheResponse",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager$1",
      "org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal$PutEvent",
      "org.apache.commons.jcs3.auxiliary.remote.http.client.RemoteHttpCacheAttributes",
      "org.apache.commons.jcs3.engine.behavior.ICacheListener",
      "org.apache.commons.jcs3.utils.discovery.behavior.IDiscoveryListener",
      "org.apache.http.cookie.CookieOrigin",
      "org.apache.http.conn.util.PublicSuffixListParser",
      "org.apache.http.HttpEntity",
      "org.apache.http.client.methods.HttpRequestBase",
      "org.apache.commons.jcs3.auxiliary.remote.behavior.IRemoteCacheDispatcher",
      "org.apache.commons.jcs3.engine.logging.CacheEvent",
      "org.apache.commons.jcs3.engine.memory.lru.LRUMemoryCache",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheMonitor",
      "org.apache.commons.jcs3.auxiliary.remote.value.RemoteCacheRequest",
      "org.apache.http.conn.scheme.SocketFactory",
      "org.apache.commons.jcs3.utils.config.PropertySetterException",
      "org.apache.commons.jcs3.auxiliary.remote.AbstractRemoteCacheListener",
      "org.apache.commons.jcs3.engine.behavior.ICacheType$CacheType",
      "org.apache.http.impl.execchain.ClientExecChain",
      "org.apache.commons.jcs3.engine.logging.CacheEventLoggerDebugLogger",
      "org.apache.http.HttpVersion",
      "org.apache.http.config.ConnectionConfig$Builder",
      "org.apache.http.conn.SchemePortResolver",
      "org.apache.commons.jcs3.engine.control.event.ElementEventQueue",
      "org.apache.http.conn.DnsResolver",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPCacheFactory",
      "org.apache.commons.jcs3.engine.stats.behavior.IStatElement",
      "org.apache.http.client.methods.RequestBuilder",
      "org.apache.commons.jcs3.engine.CacheElementSerialized",
      "org.apache.commons.jcs3.engine.ZombieCacheWatch",
      "org.apache.http.auth.AuthScheme",
      "org.apache.http.message.AbstractHttpMessage",
      "org.apache.http.auth.MalformedChallengeException",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralElementDescriptor",
      "org.apache.http.HttpEntityEnclosingRequest",
      "org.apache.commons.jcs3.engine.stats.behavior.IStats",
      "org.apache.http.conn.routing.RouteInfo$TunnelType",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralCacheNoWait",
      "org.apache.http.client.UserTokenHandler",
      "org.apache.http.conn.HttpRoutedConnection",
      "org.apache.commons.jcs3.engine.ZombieCacheService",
      "org.apache.http.ConnectionReuseStrategy",
      "org.apache.commons.jcs3.engine.logging.behavior.ICacheEventLogger",
      "org.apache.commons.jcs3.auxiliary.lateral.behavior.ILateralCacheAttributes",
      "org.apache.commons.jcs3.engine.control.event.behavior.IElementEvent",
      "org.apache.http.conn.ConnectionReleaseTrigger",
      "org.apache.http.conn.ManagedHttpClientConnection",
      "org.apache.commons.jcs3.engine.CacheWatchRepairable",
      "org.apache.http.client.methods.RequestBuilder$InternalEntityEclosingRequest",
      "org.apache.http.config.SocketConfig",
      "org.apache.http.client.config.RequestConfig",
      "org.apache.http.StatusLine",
      "org.apache.http.RequestLine",
      "org.apache.http.config.Lookup",
      "org.apache.http.HttpMessage",
      "org.apache.commons.jcs3.log.Log",
      "org.apache.http.HttpRequestInterceptor",
      "org.apache.commons.jcs3.engine.memory.behavior.IMemoryCache",
      "org.apache.http.client.AuthCache",
      "org.apache.http.HeaderIterator",
      "org.apache.commons.jcs3.utils.zip.CompressionUtil",
      "org.apache.http.conn.ClientConnectionManager",
      "org.apache.http.conn.scheme.SchemeSocketFactory",
      "org.apache.commons.jcs3.auxiliary.remote.http.client.RemoteHttpCacheFactory",
      "org.apache.http.HttpInetConnection",
      "org.apache.http.HttpRequest",
      "org.apache.http.client.BackoffManager",
      "org.apache.http.client.AuthenticationStrategy",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.behavior.ITCPLateralCacheAttributes",
      "org.apache.http.conn.socket.ConnectionSocketFactory",
      "org.apache.commons.jcs3.utils.serialization.SerializationConversionUtil",
      "org.apache.commons.jcs3.engine.logging.behavior.ICacheEvent",
      "org.apache.http.conn.util.PublicSuffixMatcher",
      "org.apache.http.conn.routing.RouteInfo$LayerType",
      "org.apache.commons.jcs3.engine.behavior.IZombie",
      "org.apache.commons.jcs3.auxiliary.remote.behavior.IRemoteCacheConstants",
      "org.apache.commons.jcs3.utils.config.PropertySetter",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheNoWaitFacade",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.TCPLateralCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.remote.http.client.RemoteHttpCache",
      "org.apache.http.client.methods.HttpUriRequest",
      "org.apache.http.protocol.HttpRequestExecutor",
      "org.apache.http.client.methods.HttpRequestWrapper",
      "org.apache.commons.jcs3.engine.behavior.IElementSerializer$1",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPDiscoveryListener",
      "org.apache.http.conn.util.PublicSuffixList",
      "org.apache.commons.jcs3.engine.CacheInfo",
      "org.apache.http.conn.ConnectTimeoutException",
      "org.apache.http.client.methods.AbortableHttpRequest",
      "org.apache.http.client.HttpClient",
      "org.apache.http.conn.scheme.LayeredSocketFactoryAdaptor",
      "org.apache.commons.jcs3.engine.ElementAttributes",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheFactory",
      "org.apache.http.cookie.Cookie",
      "org.apache.commons.jcs3.auxiliary.lateral.behavior.ILateralCacheListener",
      "org.apache.commons.jcs3.auxiliary.AuxiliaryCache",
      "org.apache.http.protocol.HttpCoreContext",
      "org.apache.http.client.methods.HttpRequestWrapper$HttpEntityEnclosingRequestWrapper",
      "org.apache.commons.jcs3.engine.control.event.behavior.IElementEventHandler",
      "org.apache.commons.jcs3.auxiliary.remote.behavior.IRemoteCacheListener",
      "org.apache.commons.jcs3.auxiliary.remote.AbstractRemoteAuxiliaryCache",
      "org.apache.http.ProtocolVersion",
      "org.apache.commons.jcs3.admin.JCSAdminBean",
      "org.apache.commons.jcs3.engine.match.KeyMatcherPatternImpl",
      "org.apache.http.auth.AuthScope",
      "org.apache.commons.jcs3.engine.behavior.ICacheObserver",
      "org.apache.http.HttpHost",
      "org.apache.http.conn.UnsupportedSchemeException",
      "org.apache.http.ProtocolException",
      "org.apache.commons.jcs3.utils.threadpool.PoolConfiguration$WhenBlockedPolicy",
      "org.apache.http.client.methods.HttpEntityEnclosingRequestBase",
      "org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal",
      "org.apache.commons.jcs3.utils.threadpool.PoolConfiguration",
      "org.apache.http.client.protocol.HttpClientContext",
      "org.apache.commons.jcs3.engine.memory.util.MemoryElementDescriptor",
      "org.apache.commons.jcs3.io.ObjectInputStreamClassLoaderAware",
      "org.apache.commons.jcs3.log.MessageFormatter",
      "org.apache.http.concurrent.Cancellable",
      "org.apache.commons.jcs3.engine.behavior.ICacheServiceNonLocal",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheManager",
      "org.apache.commons.jcs3.engine.behavior.ICacheEventQueue",
      "org.apache.commons.jcs3.engine.behavior.ICacheElementSerialized",
      "org.apache.commons.jcs3.engine.behavior.IElementAttributes",
      "org.apache.commons.jcs3.admin.JCSJMXBean",
      "org.apache.commons.jcs3.utils.serialization.EncryptingSerializer",
      "org.apache.http.conn.routing.HttpRoutePlanner",
      "org.apache.http.Consts",
      "org.apache.commons.jcs3.utils.discovery.UDPDiscoveryService",
      "org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal$RemoveEvent",
      "org.apache.http.util.Args",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralCacheMonitor",
      "org.apache.commons.jcs3.auxiliary.remote.behavior.IRemoteCacheAttributes",
      "org.apache.commons.jcs3.engine.behavior.ICompositeCacheAttributes$DiskUsagePattern",
      "org.apache.http.conn.util.PublicSuffixMatcherLoader",
      "org.apache.commons.jcs3.utils.discovery.UDPDiscoveryAttributes",
      "org.apache.http.config.ConnectionConfig",
      "org.apache.commons.jcs3.log.JulLogAdapter",
      "org.apache.commons.jcs3.auxiliary.AuxiliaryCacheFactory",
      "org.apache.http.conn.socket.LayeredConnectionSocketFactory",
      "org.apache.http.conn.scheme.Scheme",
      "org.apache.http.HttpResponseInterceptor",
      "org.apache.http.config.MessageConstraints$Builder",
      "org.apache.commons.jcs3.auxiliary.AuxiliaryCacheAttributes",
      "org.apache.commons.jcs3.engine.behavior.ICacheService",
      "org.apache.http.client.config.RequestConfig$Builder",
      "org.apache.commons.jcs3.auxiliary.remote.value.RemoteRequestType",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager",
      "org.apache.commons.jcs3.engine.behavior.IProvideScheduler",
      "org.apache.http.auth.AuthenticationException",
      "org.apache.http.auth.AuthState",
      "org.apache.commons.jcs3.engine.behavior.IElementSerializer",
      "org.apache.http.NameValuePair",
      "org.apache.commons.jcs3.log.LogManager$LogFactoryHolder",
      "org.apache.commons.jcs3.access.exception.ObjectNotFoundException",
      "org.apache.commons.jcs3.auxiliary.lateral.behavior.ILateralCacheAttributes$Type",
      "org.apache.commons.jcs3.engine.control.CompositeCacheManager",
      "org.apache.http.conn.ClientConnectionRequest",
      "org.apache.http.conn.routing.HttpRoute",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralCommand",
      "org.apache.commons.jcs3.log.LogManager",
      "org.apache.http.client.CookieStore",
      "org.apache.http.client.methods.CloseableHttpResponse",
      "org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal$RemoveAllEvent",
      "org.apache.commons.jcs3.engine.CacheElement",
      "org.apache.commons.jcs3.engine.memory.AbstractMemoryCache",
      "org.apache.commons.jcs3.auxiliary.remote.AbstractRemoteCacheNoWaitFacade",
      "org.apache.http.client.HttpRequestRetryHandler",
      "org.apache.commons.jcs3.engine.stats.behavior.ICacheStats",
      "org.apache.commons.jcs3.auxiliary.remote.behavior.IRemoteCacheClient",
      "org.apache.commons.jcs3.engine.match.behavior.IKeyMatcher",
      "org.apache.commons.jcs3.auxiliary.remote.behavior.ICommonRemoteCacheAttributes",
      "org.apache.http.conn.scheme.SchemeRegistry",
      "org.apache.http.impl.client.CloseableHttpClient",
      "org.apache.http.ParseException",
      "org.apache.commons.jcs3.engine.CompositeCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralCacheNoWaitFacade",
      "org.apache.commons.jcs3.engine.behavior.ICacheType",
      "org.apache.commons.jcs3.auxiliary.remote.http.client.RemoteHttpCacheDispatcher",
      "org.apache.commons.jcs3.utils.config.OptionConverter",
      "org.apache.commons.jcs3.auxiliary.remote.http.client.RemoteHttpCacheMonitor",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheNoWait",
      "org.apache.http.client.ServiceUnavailableRetryStrategy",
      "org.apache.commons.jcs3.utils.serialization.CompressingSerializer",
      "org.apache.http.impl.client.InternalHttpClient",
      "org.apache.http.client.methods.HttpExecutionAware",
      "org.apache.http.HeaderElement",
      "org.apache.http.conn.ManagedClientConnection",
      "org.apache.http.client.ConnectionBackoffStrategy",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheAttributes",
      "org.apache.commons.jcs3.engine.memory.AbstractDoubleLinkedListMemoryCache",
      "org.apache.commons.jcs3.engine.stats.Stats",
      "org.apache.commons.jcs3.auxiliary.remote.http.client.RemoteHttpCacheClient",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheListener",
      "org.apache.http.conn.util.DomainType",
      "org.apache.http.conn.routing.RouteInfo",
      "org.apache.http.HttpConnection",
      "org.apache.http.client.ResponseHandler",
      "org.apache.commons.jcs3.engine.behavior.IShutdownObservable"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RemoteHttpCache_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCache",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheEventLogging",
      "org.apache.commons.jcs3.log.LogManager",
      "org.apache.commons.jcs3.log.JulLogFactory",
      "org.apache.commons.jcs3.log.LogManager$LogFactoryHolder",
      "org.apache.commons.jcs3.log.JulLogAdapter",
      "org.apache.commons.jcs3.auxiliary.remote.AbstractRemoteAuxiliaryCache",
      "org.apache.commons.jcs3.auxiliary.remote.http.client.RemoteHttpCache",
      "org.apache.commons.jcs3.engine.ZombieCacheService",
      "org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal",
      "org.apache.commons.jcs3.engine.control.CompositeCacheManager",
      "org.apache.commons.jcs3.engine.CompositeCacheAttributes",
      "org.apache.commons.jcs3.engine.behavior.ICompositeCacheAttributes$DiskUsagePattern",
      "org.apache.commons.jcs3.engine.ElementAttributes",
      "org.apache.commons.jcs3.utils.threadpool.DaemonThreadFactory",
      "org.apache.commons.jcs3.admin.JCSAdminBean",
      "org.apache.commons.jcs3.engine.behavior.IElementSerializer$1",
      "org.apache.commons.jcs3.engine.behavior.IElementSerializer",
      "org.apache.commons.jcs3.utils.serialization.StandardSerializer",
      "org.apache.commons.jcs3.utils.serialization.EncryptingSerializer",
      "org.apache.commons.jcs3.auxiliary.remote.AbstractRemoteCacheListener",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheListener",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager",
      "org.apache.commons.jcs3.utils.threadpool.PoolConfiguration$WhenBlockedPolicy",
      "org.apache.commons.jcs3.utils.threadpool.PoolConfiguration",
      "org.apache.commons.jcs3.utils.config.PropertySetter",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager$ThreadPoolManagerHolder",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.remote.CommonRemoteCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.remote.http.client.RemoteHttpCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.remote.behavior.IRemoteCacheConstants",
      "org.apache.commons.jcs3.auxiliary.remote.server.behavior.RemoteType",
      "org.apache.commons.jcs3.log.MessageFormatter",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheFactory",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPCacheFactory",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.TCPLateralCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.lateral.behavior.ILateralCacheAttributes$Type",
      "org.apache.commons.jcs3.utils.serialization.CompressingSerializer",
      "org.apache.commons.jcs3.auxiliary.remote.http.client.RemoteHttpCacheFactory",
      "org.apache.commons.jcs3.utils.config.OptionConverter",
      "org.apache.commons.jcs3.auxiliary.remote.http.client.RemoteHttpCacheClient",
      "org.apache.commons.jcs3.auxiliary.remote.http.client.AbstractHttpClient",
      "org.apache.commons.jcs3.auxiliary.remote.http.client.RemoteHttpCacheDispatcher",
      "org.apache.http.ProtocolVersion",
      "org.apache.http.util.Args",
      "org.apache.http.HttpVersion",
      "org.apache.http.impl.client.HttpClientBuilder",
      "org.apache.http.client.config.RequestConfig$Builder",
      "org.apache.http.client.config.RequestConfig",
      "org.apache.http.conn.util.PublicSuffixMatcherLoader",
      "org.apache.http.conn.util.PublicSuffixListParser",
      "org.apache.http.Consts",
      "org.apache.http.conn.util.DomainType",
      "org.apache.commons.jcs3.engine.control.CompositeCacheConfigurator",
      "org.apache.commons.jcs3.engine.control.event.ElementEventQueue",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager$1",
      "org.apache.commons.jcs3.utils.timing.ElapsedTimer",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPListener",
      "org.apache.commons.jcs3.engine.CacheInfo",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheMonitor",
      "org.apache.commons.jcs3.auxiliary.remote.http.client.RemoteHttpCacheMonitor",
      "org.apache.commons.jcs3.engine.match.KeyMatcherPatternImpl",
      "org.apache.commons.jcs3.engine.logging.CacheEventLoggerDebugLogger",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheFactory",
      "org.apache.commons.jcs3.auxiliary.remote.AbstractRemoteCacheNoWaitFacade",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheNoWaitFacade",
      "org.apache.commons.jcs3.engine.stats.Stats",
      "org.apache.commons.jcs3.engine.stats.StatElement",
      "org.apache.commons.jcs3.engine.CacheElement",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteLocation",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralCacheMonitor",
      "org.apache.commons.jcs3.engine.CacheWatchRepairable",
      "org.apache.commons.jcs3.engine.ZombieCacheWatch",
      "org.apache.commons.jcs3.engine.logging.CacheEvent",
      "org.apache.commons.jcs3.auxiliary.remote.http.client.RemoteHttpClientListener",
      "org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal$ZombieEvent",
      "org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal$RemoveEvent",
      "org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal$RemoveAllEvent",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralCacheNoWait",
      "org.apache.commons.jcs3.utils.discovery.UDPDiscoveryService",
      "org.apache.commons.jcs3.engine.CacheElementSerialized",
      "org.apache.commons.jcs3.utils.serialization.SerializationConversionUtil",
      "org.apache.commons.jcs3.engine.control.CompositeCache",
      "org.apache.commons.jcs3.engine.memory.AbstractMemoryCache",
      "org.apache.commons.jcs3.engine.memory.AbstractDoubleLinkedListMemoryCache",
      "org.apache.commons.jcs3.engine.memory.lru.LRUMemoryCache",
      "org.apache.commons.jcs3.utils.struct.DoubleLinkedList",
      "org.apache.commons.jcs3.io.ObjectInputStreamClassLoaderAware",
      "org.apache.commons.jcs3.utils.zip.CompressionUtil",
      "org.apache.commons.jcs3.engine.CacheStatus",
      "org.apache.commons.jcs3.engine.behavior.ICacheType$CacheType"
    );
  }
}
