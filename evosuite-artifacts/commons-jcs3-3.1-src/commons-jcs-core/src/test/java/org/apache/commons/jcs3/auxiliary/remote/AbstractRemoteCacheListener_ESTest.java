/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 21:59:17 GMT 2022
 */

package org.apache.commons.jcs3.auxiliary.remote;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jcs3.auxiliary.remote.RemoteCacheAttributes;
import org.apache.commons.jcs3.auxiliary.remote.RemoteCacheFactory;
import org.apache.commons.jcs3.auxiliary.remote.RemoteCacheListener;
import org.apache.commons.jcs3.auxiliary.remote.RemoteCacheNoWait;
import org.apache.commons.jcs3.auxiliary.remote.RemoteCacheNoWaitFacade;
import org.apache.commons.jcs3.auxiliary.remote.behavior.IRemoteCacheAttributes;
import org.apache.commons.jcs3.engine.CacheElementSerialized;
import org.apache.commons.jcs3.engine.behavior.ICompositeCacheManager;
import org.apache.commons.jcs3.engine.logging.CacheEventLoggerDebugLogger;
import org.apache.commons.jcs3.utils.serialization.CompressingSerializer;
import org.apache.commons.jcs3.utils.serialization.EncryptingSerializer;
import org.apache.commons.jcs3.utils.serialization.StandardSerializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractRemoteCacheListener_ESTest extends AbstractRemoteCacheListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          ArrayList<RemoteCacheNoWait<Object, RemoteCacheListener<Object, Object>>> arrayList0 = new ArrayList<RemoteCacheNoWait<Object, RemoteCacheListener<Object, Object>>>();
          RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
          CacheEventLoggerDebugLogger cacheEventLoggerDebugLogger0 = new CacheEventLoggerDebugLogger();
          StandardSerializer standardSerializer0 = new StandardSerializer();
          EncryptingSerializer encryptingSerializer0 = new EncryptingSerializer(standardSerializer0);
          CompressingSerializer compressingSerializer0 = new CompressingSerializer(encryptingSerializer0);
          RemoteCacheFactory remoteCacheFactory0 = new RemoteCacheFactory();
          RemoteCacheNoWaitFacade<Object, RemoteCacheListener<Object, Object>> remoteCacheNoWaitFacade0 = new RemoteCacheNoWaitFacade<Object, RemoteCacheListener<Object, Object>>(arrayList0, remoteCacheAttributes0, cacheEventLoggerDebugLogger0, compressingSerializer0, remoteCacheFactory0);
          IRemoteCacheAttributes iRemoteCacheAttributes0 = remoteCacheNoWaitFacade0.getAuxiliaryCacheAttributes();
          RemoteCacheListener<CacheElementSerialized<String, Object>, String> remoteCacheListener0 = null;
          try {
            remoteCacheListener0 = new RemoteCacheListener<CacheElementSerialized<String, Object>, String>(iRemoteCacheAttributes0, (ICompositeCacheManager) null, compressingSerializer0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.net.SocketPermission\" \"localhost:40000\" \"listen,resolve\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkListen(SecurityManager.java:1131)
             // sun.rmi.transport.tcp.TCPTransport.listen(TCPTransport.java:355)
             // sun.rmi.transport.tcp.TCPTransport.exportObject(TCPTransport.java:254)
             // sun.rmi.transport.tcp.TCPEndpoint.exportObject(TCPEndpoint.java:412)
             // sun.rmi.transport.LiveRef.exportObject(LiveRef.java:147)
             // sun.rmi.server.UnicastServerRef.exportObject(UnicastServerRef.java:237)
             // java.rmi.server.UnicastRemoteObject.exportObject(UnicastRemoteObject.java:383)
             // java.rmi.server.UnicastRemoteObject.exportObject(UnicastRemoteObject.java:320)
             // org.apache.commons.jcs3.auxiliary.remote.RemoteCacheListener.<init>(RemoteCacheListener.java:72)
             // sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
             // sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
             // sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.lang.reflect.Constructor.newInstance(Constructor.java:423)
             // org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:233)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:188)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
