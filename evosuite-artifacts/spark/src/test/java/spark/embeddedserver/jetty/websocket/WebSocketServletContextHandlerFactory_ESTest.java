/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 06 17:16:54 GMT 2022
 */

package spark.embeddedserver.jetty.websocket;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.JLayeredPane;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.embeddedserver.jetty.websocket.WebSocketHandlerWrapper;
import spark.embeddedserver.jetty.websocket.WebSocketServletContextHandlerFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WebSocketServletContextHandlerFactory_ESTest extends WebSocketServletContextHandlerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, WebSocketHandlerWrapper> hashMap0 = new HashMap<String, WebSocketHandlerWrapper>();
      hashMap0.put((String) null, (WebSocketHandlerWrapper) null);
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      Optional<Integer> optional0 = Optional.of(integer0);
      ServletContextHandler servletContextHandler0 = WebSocketServletContextHandlerFactory.create(hashMap0, optional0);
      assertNull(servletContextHandler0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Optional<Integer> optional0 = Optional.empty();
      ConcurrentHashMap<String, WebSocketHandlerWrapper> concurrentHashMap0 = new ConcurrentHashMap<String, WebSocketHandlerWrapper>();
      ServletContextHandler servletContextHandler0 = WebSocketServletContextHandlerFactory.create(concurrentHashMap0, optional0);
      assertFalse(servletContextHandler0.isCompactPath());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Optional<Integer> optional0 = Optional.ofNullable((Integer) null);
      ServletContextHandler servletContextHandler0 = WebSocketServletContextHandlerFactory.create((Map<String, WebSocketHandlerWrapper>) null, optional0);
      assertNull(servletContextHandler0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WebSocketServletContextHandlerFactory webSocketServletContextHandlerFactory0 = new WebSocketServletContextHandlerFactory();
  }
}
