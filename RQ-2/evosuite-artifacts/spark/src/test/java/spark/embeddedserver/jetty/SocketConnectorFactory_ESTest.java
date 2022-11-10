/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 06 17:13:26 GMT 2022
 */

package spark.embeddedserver.jetty;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetSocketAddress;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.junit.runner.RunWith;
import spark.embeddedserver.jetty.SocketConnectorFactory;
import spark.ssl.SslStores;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SocketConnectorFactory_ESTest extends SocketConnectorFactory_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("'\"o1e)VNa0,gCv(C{", 1);
      Server server0 = new Server(inetSocketAddress0);
      ServerConnector serverConnector0 = SocketConnectorFactory.createSocketConnector(server0, "", 0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("'\"o1e)VNa0,gCv(C{", 1);
      Server server0 = new Server(inetSocketAddress0);
      ServerConnector serverConnector0 = SocketConnectorFactory.createSocketConnector(server0, "", 0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("'\"o1e)VNa0,gCv(C{", 1);
      Server server0 = new Server(inetSocketAddress0);
      ServerConnector serverConnector0 = SocketConnectorFactory.createSocketConnector(server0, "fkfTk`", 1928);
      assertEquals(1, serverConnector0.getIdleTimeout());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("'\"o1e)VNa0,gCv(C{", 1);
      Server server0 = new Server(inetSocketAddress0);
      ServerConnector serverConnector0 = SocketConnectorFactory.createSocketConnector(server0, "fkfTk`", 1928);
      assertEquals(1, serverConnector0.getPort());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Server server0 = new Server((-1796));
      SslStores sslStores0 = SslStores.create("STARTED", "zaDIr7", "RUNNING", "STARTED", "STARTING");
      ServerConnector serverConnector0 = SocketConnectorFactory.createSecureSocketConnector(server0, "FAILED", 0, sslStores0);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Server server0 = new Server((-1796));
      SslStores sslStores0 = SslStores.create("STARTED", "zaDIr7", "RUNNING", "STARTED", "STARTING");
      ServerConnector serverConnector0 = SocketConnectorFactory.createSecureSocketConnector(server0, "FAILED", 0, sslStores0);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        SocketConnectorFactory.createSocketConnector((Server) null, "!~#/jEB!", (-1));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // 'server' must not be null
         //
         verifyException("spark.utils.Assert", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("'\"o1e)VNa0,gCv(C{", 1);
      Server server0 = new Server(inetSocketAddress0);
      SslStores sslStores0 = SslStores.create("FAILED", (String) null, "", "RUNNING", true);
      // Undeclared exception!
      try { 
        SocketConnectorFactory.createSecureSocketConnector(server0, (String) null, 1, sslStores0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // 'host' must not be null
         //
         verifyException("spark.utils.Assert", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Server server0 = new Server();
      SslStores sslStores0 = SslStores.create("FAILED", (String) null, "/of>r", "RUNNING", (String) null, false);
      ServerConnector serverConnector0 = SocketConnectorFactory.createSecureSocketConnector(server0, "STOPPED", (-2), sslStores0);
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Server server0 = new Server();
      SslStores sslStores0 = SslStores.create("FAILED", (String) null, "/of>r", "RUNNING", (String) null, false);
      ServerConnector serverConnector0 = SocketConnectorFactory.createSecureSocketConnector(server0, "STOPPED", (-2), sslStores0);
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Server server0 = new Server();
      SslStores sslStores0 = SslStores.create("STARTED", "RUNNING", (String) null, (String) null);
      ServerConnector serverConnector0 = SocketConnectorFactory.createSecureSocketConnector(server0, "STARTING", 142, sslStores0);
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Server server0 = new Server();
      SslStores sslStores0 = SslStores.create("STARTED", "RUNNING", (String) null, (String) null);
      ServerConnector serverConnector0 = SocketConnectorFactory.createSecureSocketConnector(server0, "STARTING", 142, sslStores0);
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("'\"o1e)VNa0,gCv(C{", 1);
      Server server0 = new Server(inetSocketAddress0);
      SslStores sslStores0 = SslStores.create("FAILED", (String) null, "", "RUNNING", true);
      ServerConnector serverConnector0 = SocketConnectorFactory.createSecureSocketConnector(server0, "javax.servlet.forward.query_string", 1972, sslStores0);
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("'\"o1e)VNa0,gCv(C{", 1);
      Server server0 = new Server(inetSocketAddress0);
      SslStores sslStores0 = SslStores.create("FAILED", (String) null, "", "RUNNING", true);
      ServerConnector serverConnector0 = SocketConnectorFactory.createSecureSocketConnector(server0, "javax.servlet.forward.query_string", 1972, sslStores0);
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Server server0 = new Server();
      ServerConnector serverConnector0 = SocketConnectorFactory.createSocketConnector(server0, "STOPPING", (-1924));
      assertEquals(0, serverConnector0.getIdleTimeout());
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Server server0 = new Server();
      ServerConnector serverConnector0 = SocketConnectorFactory.createSocketConnector(server0, "STOPPING", (-1924));
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SocketConnectorFactory socketConnectorFactory0 = new SocketConnectorFactory();
  }
}
