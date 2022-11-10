/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:38:05 GMT 2022
 */

package org.asynchttpclient.netty.channel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.util.Attribute;
import java.time.format.FormatStyle;
import java.util.concurrent.Delayed;
import org.asynchttpclient.netty.channel.Channels;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Channels_ESTest extends Channels_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ChannelHandler[] channelHandlerArray0 = new ChannelHandler[8];
      EmbeddedChannel embeddedChannel0 = new EmbeddedChannel(true, channelHandlerArray0);
      Channels.setDiscard(embeddedChannel0);
      assertTrue(embeddedChannel0.isRegistered());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      doReturn((Attribute) null).when(channel0).attr(nullable(io.netty.util.AttributeKey.class));
      // Undeclared exception!
      try { 
        Channels.setAttribute(channel0, channel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.channel.Channels", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      doReturn((Attribute) null).when(channel0).attr(nullable(io.netty.util.AttributeKey.class));
      // Undeclared exception!
      try { 
        Channels.setActiveToken(channel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.channel.Channels", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      doReturn((Attribute) null).when(channel0).attr(nullable(io.netty.util.AttributeKey.class));
      // Undeclared exception!
      try { 
        Channels.isActiveTokenSet(channel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.channel.Channels", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Channels.getAttribute((Channel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.channel.Channels", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EmbeddedChannel embeddedChannel0 = new EmbeddedChannel();
      Channels.setAttribute(embeddedChannel0, embeddedChannel0);
      Object object0 = Channels.getAttribute(embeddedChannel0);
      assertSame(embeddedChannel0, object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EmbeddedChannel embeddedChannel0 = new EmbeddedChannel();
      Channels.silentlyCloseChannel(embeddedChannel0);
      Channels.silentlyCloseChannel(embeddedChannel0);
      assertFalse(embeddedChannel0.isActive());
      assertFalse(embeddedChannel0.isWritable());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Channels.silentlyCloseChannel((Channel) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Attribute<Object> attribute0 = (Attribute<Object>) mock(Attribute.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(attribute0).getAndSet(any());
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      doReturn(attribute0).when(channel0).attr(nullable(io.netty.util.AttributeKey.class));
      boolean boolean0 = Channels.isActiveTokenSet(channel0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EmbeddedChannel embeddedChannel0 = new EmbeddedChannel();
      boolean boolean0 = Channels.isActiveTokenSet(embeddedChannel0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = Channels.isActiveTokenSet((Channel) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EmbeddedChannel embeddedChannel0 = new EmbeddedChannel();
      boolean boolean0 = Channels.isChannelActive(embeddedChannel0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(channel0).isActive();
      boolean boolean0 = Channels.isChannelActive(channel0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = Channels.isChannelActive((Channel) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EmbeddedChannel embeddedChannel0 = new EmbeddedChannel();
      Object object0 = Channels.getAttribute(embeddedChannel0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      doReturn((Attribute<Delayed>) null).when(channel0).attr(nullable(io.netty.util.AttributeKey.class));
      Object object0 = Channels.getAttribute(channel0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Attribute<FormatStyle> attribute0 = (Attribute<FormatStyle>) mock(Attribute.class, new ViolatedAssumptionAnswer());
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      doReturn(attribute0).when(channel0).attr(nullable(io.netty.util.AttributeKey.class));
      Channels.setActiveToken(channel0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Channels channels0 = new Channels();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Channels.setDiscard((Channel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.channel.Channels", e);
      }
  }
}
