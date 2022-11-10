/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:34:30 GMT 2022
 */

package org.asynchttpclient.request.body.generator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.UnpooledByteBufAllocator;
import io.netty.buffer.UnpooledUnsafeDirectByteBuf;
import io.netty.buffer.UnpooledUnsafeHeapByteBuf;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import org.asynchttpclient.request.body.Body;
import org.asynchttpclient.request.body.generator.BodyChunk;
import org.asynchttpclient.request.body.generator.PushBody;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PushBody_ESTest extends PushBody_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PriorityQueue<BodyChunk> priorityQueue0 = new PriorityQueue<BodyChunk>();
      PushBody pushBody0 = new PushBody(priorityQueue0);
      PooledByteBufAllocator pooledByteBufAllocator0 = new PooledByteBufAllocator();
      UnpooledUnsafeDirectByteBuf unpooledUnsafeDirectByteBuf0 = new UnpooledUnsafeDirectByteBuf(pooledByteBufAllocator0, 962, 962);
      unpooledUnsafeDirectByteBuf0.writeByte(962);
      ByteBuf byteBuf0 = pooledByteBufAllocator0.buffer(962);
      BodyChunk bodyChunk0 = new BodyChunk(unpooledUnsafeDirectByteBuf0, false);
      unpooledUnsafeDirectByteBuf0.release();
      priorityQueue0.add(bodyChunk0);
      // Undeclared exception!
      try { 
        pushBody0.transferTo(byteBuf0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
         //
         // refCnt: 0
         //
         verifyException("io.netty.buffer.AbstractByteBuf", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayDeque<BodyChunk> arrayDeque0 = new ArrayDeque<BodyChunk>();
      UnpooledByteBufAllocator unpooledByteBufAllocator0 = new UnpooledByteBufAllocator(true, true);
      UnpooledUnsafeHeapByteBuf unpooledUnsafeHeapByteBuf0 = new UnpooledUnsafeHeapByteBuf(unpooledByteBufAllocator0, 5400, 5400);
      byte[] byteArray0 = new byte[1];
      ByteBuf byteBuf0 = unpooledUnsafeHeapByteBuf0.writeBytes(byteArray0);
      BodyChunk bodyChunk0 = new BodyChunk(byteBuf0, true);
      arrayDeque0.add(bodyChunk0);
      PushBody pushBody0 = new PushBody(arrayDeque0);
      // Undeclared exception!
      pushBody0.transferTo(unpooledUnsafeHeapByteBuf0);
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PriorityQueue<BodyChunk> priorityQueue0 = new PriorityQueue<BodyChunk>();
      PushBody pushBody0 = new PushBody(priorityQueue0);
      // Undeclared exception!
      try { 
        pushBody0.transferTo((ByteBuf) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.request.body.generator.PushBody", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayDeque<BodyChunk> arrayDeque0 = new ArrayDeque<BodyChunk>();
      UnpooledByteBufAllocator unpooledByteBufAllocator0 = new UnpooledByteBufAllocator(true, true);
      UnpooledUnsafeHeapByteBuf unpooledUnsafeHeapByteBuf0 = new UnpooledUnsafeHeapByteBuf(unpooledByteBufAllocator0, 5377, 5377);
      ByteBuf byteBuf0 = unpooledUnsafeHeapByteBuf0.writeDoubleLE((-2294.879));
      BodyChunk bodyChunk0 = new BodyChunk(unpooledUnsafeHeapByteBuf0, true);
      arrayDeque0.add(bodyChunk0);
      PushBody pushBody0 = new PushBody(arrayDeque0);
      // Undeclared exception!
      try { 
        pushBody0.transferTo(byteBuf0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
         //
         // writerIndex(5376) + minWritableBytes(8) exceeds maxCapacity(5377): UnpooledUnsafeHeapByteBuf(ridx: 5368, widx: 5376, cap: 5377/5377)
         //
         verifyException("io.netty.buffer.AbstractByteBuf", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayDeque<BodyChunk> arrayDeque0 = new ArrayDeque<BodyChunk>();
      UnpooledByteBufAllocator unpooledByteBufAllocator0 = new UnpooledByteBufAllocator(false, false);
      UnpooledUnsafeHeapByteBuf unpooledUnsafeHeapByteBuf0 = new UnpooledUnsafeHeapByteBuf(unpooledByteBufAllocator0, 5400, 5400);
      BodyChunk bodyChunk0 = new BodyChunk(unpooledUnsafeHeapByteBuf0, true);
      arrayDeque0.add(bodyChunk0);
      PushBody pushBody0 = new PushBody(arrayDeque0);
      Charset charset0 = Charset.defaultCharset();
      unpooledUnsafeHeapByteBuf0.readCharSequence(3568, charset0);
      // Undeclared exception!
      try { 
        pushBody0.transferTo(unpooledUnsafeHeapByteBuf0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // minWritableBytes: -3568 (expected: >= 0)
         //
         verifyException("io.netty.util.internal.ObjectUtil", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PriorityQueue<BodyChunk> priorityQueue0 = new PriorityQueue<BodyChunk>();
      PushBody pushBody0 = new PushBody(priorityQueue0);
      PooledByteBufAllocator pooledByteBufAllocator0 = new PooledByteBufAllocator();
      UnpooledUnsafeDirectByteBuf unpooledUnsafeDirectByteBuf0 = new UnpooledUnsafeDirectByteBuf(pooledByteBufAllocator0, 967, 967);
      unpooledUnsafeDirectByteBuf0.writeByte(967);
      ByteBuf byteBuf0 = pooledByteBufAllocator0.buffer(967);
      BodyChunk bodyChunk0 = new BodyChunk(unpooledUnsafeDirectByteBuf0, false);
      priorityQueue0.add(bodyChunk0);
      Body.BodyState body_BodyState0 = pushBody0.transferTo(byteBuf0);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PriorityQueue<BodyChunk> priorityQueue0 = new PriorityQueue<BodyChunk>();
      PushBody pushBody0 = new PushBody(priorityQueue0);
      PooledByteBufAllocator pooledByteBufAllocator0 = new PooledByteBufAllocator();
      UnpooledUnsafeDirectByteBuf unpooledUnsafeDirectByteBuf0 = new UnpooledUnsafeDirectByteBuf(pooledByteBufAllocator0, 967, 967);
      unpooledUnsafeDirectByteBuf0.writeByte(967);
      ByteBuf byteBuf0 = pooledByteBufAllocator0.buffer(967);
      BodyChunk bodyChunk0 = new BodyChunk(unpooledUnsafeDirectByteBuf0, false);
      priorityQueue0.add(bodyChunk0);
      Body.BodyState body_BodyState0 = pushBody0.transferTo(byteBuf0);
      assertNotNull(body_BodyState0);
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PriorityQueue<BodyChunk> priorityQueue0 = new PriorityQueue<BodyChunk>();
      PushBody pushBody0 = new PushBody(priorityQueue0);
      PooledByteBufAllocator pooledByteBufAllocator0 = new PooledByteBufAllocator();
      UnpooledUnsafeDirectByteBuf unpooledUnsafeDirectByteBuf0 = new UnpooledUnsafeDirectByteBuf(pooledByteBufAllocator0, 967, 967);
      ByteBuf byteBuf0 = pooledByteBufAllocator0.buffer(967);
      BodyChunk bodyChunk0 = new BodyChunk(unpooledUnsafeDirectByteBuf0, false);
      priorityQueue0.add(bodyChunk0);
      Body.BodyState body_BodyState0 = pushBody0.transferTo(byteBuf0);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PriorityQueue<BodyChunk> priorityQueue0 = new PriorityQueue<BodyChunk>();
      PushBody pushBody0 = new PushBody(priorityQueue0);
      PooledByteBufAllocator pooledByteBufAllocator0 = new PooledByteBufAllocator();
      UnpooledUnsafeDirectByteBuf unpooledUnsafeDirectByteBuf0 = new UnpooledUnsafeDirectByteBuf(pooledByteBufAllocator0, 967, 967);
      ByteBuf byteBuf0 = pooledByteBufAllocator0.buffer(967);
      BodyChunk bodyChunk0 = new BodyChunk(unpooledUnsafeDirectByteBuf0, false);
      priorityQueue0.add(bodyChunk0);
      Body.BodyState body_BodyState0 = pushBody0.transferTo(byteBuf0);
      assertNotNull(body_BodyState0);
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PriorityQueue<BodyChunk> priorityQueue0 = new PriorityQueue<BodyChunk>();
      PushBody pushBody0 = new PushBody(priorityQueue0);
      PooledByteBufAllocator pooledByteBufAllocator0 = new PooledByteBufAllocator();
      UnpooledUnsafeDirectByteBuf unpooledUnsafeDirectByteBuf0 = new UnpooledUnsafeDirectByteBuf(pooledByteBufAllocator0, 967, 967);
      ByteBuf byteBuf0 = unpooledUnsafeDirectByteBuf0.writeByte(967);
      BodyChunk bodyChunk0 = new BodyChunk(unpooledUnsafeDirectByteBuf0, false);
      priorityQueue0.add(bodyChunk0);
      Body.BodyState body_BodyState0 = pushBody0.transferTo(byteBuf0);
      assertNotNull(body_BodyState0);
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayDeque<BodyChunk> arrayDeque0 = new ArrayDeque<BodyChunk>();
      UnpooledByteBufAllocator unpooledByteBufAllocator0 = UnpooledByteBufAllocator.DEFAULT;
      UnpooledUnsafeHeapByteBuf unpooledUnsafeHeapByteBuf0 = new UnpooledUnsafeHeapByteBuf(unpooledByteBufAllocator0, 542, 542);
      BodyChunk bodyChunk0 = new BodyChunk(unpooledUnsafeHeapByteBuf0, true);
      arrayDeque0.add(bodyChunk0);
      PushBody pushBody0 = new PushBody(arrayDeque0);
      pushBody0.transferTo(bodyChunk0.buffer);
      Body.BodyState body_BodyState0 = pushBody0.transferTo(unpooledUnsafeHeapByteBuf0);
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayDeque<BodyChunk> arrayDeque0 = new ArrayDeque<BodyChunk>();
      UnpooledByteBufAllocator unpooledByteBufAllocator0 = UnpooledByteBufAllocator.DEFAULT;
      UnpooledUnsafeHeapByteBuf unpooledUnsafeHeapByteBuf0 = new UnpooledUnsafeHeapByteBuf(unpooledByteBufAllocator0, 542, 542);
      BodyChunk bodyChunk0 = new BodyChunk(unpooledUnsafeHeapByteBuf0, true);
      arrayDeque0.add(bodyChunk0);
      PushBody pushBody0 = new PushBody(arrayDeque0);
      pushBody0.transferTo(bodyChunk0.buffer);
      Body.BodyState body_BodyState0 = pushBody0.transferTo(unpooledUnsafeHeapByteBuf0);
      assertNotNull(body_BodyState0);
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArrayDeque<BodyChunk> arrayDeque0 = new ArrayDeque<BodyChunk>();
      PushBody pushBody0 = new PushBody(arrayDeque0);
      pushBody0.close();
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArrayDeque<BodyChunk> arrayDeque0 = new ArrayDeque<BodyChunk>();
      PushBody pushBody0 = new PushBody(arrayDeque0);
      long long0 = pushBody0.getContentLength();
      assertEquals(1, long0);
}
}
