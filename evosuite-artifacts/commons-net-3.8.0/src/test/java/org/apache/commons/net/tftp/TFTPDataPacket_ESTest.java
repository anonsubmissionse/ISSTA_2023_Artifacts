/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 21:06:17 GMT 2022
 */

package org.apache.commons.net.tftp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.tftp.TFTPDataPacket;
import org.apache.commons.net.tftp.TFTPPacket;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TFTPDataPacket_ESTest extends TFTPDataPacket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      byte[] byteArray0 = new byte[3];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, 0, 1, byteArray0);
      String string0 = tFTPDataPacket0.toString();
      assertEquals(0, tFTPDataPacket0.getDataOffset());
      assertEquals("/192.168.1.42 0 3 DATA 1 3", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      byte[] byteArray0 = new byte[6];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, 255, 255, byteArray0);
      tFTPDataPacket0.setData(byteArray0, 392, 512);
      assertEquals(392, tFTPDataPacket0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      byte[] byteArray0 = new byte[6];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, 255, 255, byteArray0);
      assertEquals(255, tFTPDataPacket0.getBlockNumber());
      
      tFTPDataPacket0.setBlockNumber(0);
      assertEquals(0, tFTPDataPacket0.getBlockNumber());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName((String) null);
      byte[] byteArray0 = new byte[4];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, 0, 0, byteArray0);
      tFTPDataPacket0.type = (int) (byte) (-52);
      assertEquals(0, tFTPDataPacket0.getDataOffset());
      
      DatagramPacket datagramPacket0 = tFTPDataPacket0.newDatagram();
      assertEquals(8, datagramPacket0.getLength());
      assertEquals(0, tFTPDataPacket0.getBlockNumber());
      assertEquals(0, datagramPacket0.getPort());
      assertEquals(4, tFTPDataPacket0.getDataLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      byte[] byteArray0 = new byte[8];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, 0, 1029, byteArray0);
      DatagramPacket datagramPacket0 = tFTPDataPacket0.newDatagram();
      TFTPDataPacket tFTPDataPacket1 = (TFTPDataPacket)TFTPPacket.newTFTPPacket(datagramPacket0);
      // Undeclared exception!
      try { 
        tFTPDataPacket1.newDatagram(datagramPacket0, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName((String) null);
      byte[] byteArray0 = new byte[4];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, 0, 0, byteArray0);
      DatagramPacket datagramPacket0 = tFTPDataPacket0.newDatagram();
      tFTPDataPacket0.type = (int) (byte) (-52);
      // Undeclared exception!
      try { 
        tFTPDataPacket0.newDatagram(datagramPacket0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // illegal length
         //
         verifyException("java.net.DatagramPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      byte[] byteArray0 = new byte[8];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, 0, 1029, byteArray0);
      DatagramPacket datagramPacket0 = tFTPDataPacket0.newDatagram();
      tFTPDataPacket0.setData(byteArray0, 0, (byte)0);
      tFTPDataPacket0.setPort(1043);
      tFTPDataPacket0.newDatagram(datagramPacket0, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)3, (byte)4, (byte)5, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(4, datagramPacket0.getLength());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      byte[] byteArray0 = new byte[2];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, 1, 1, byteArray0);
      assertEquals(0, tFTPDataPacket0.getDataOffset());
      
      DatagramPacket datagramPacket0 = tFTPDataPacket0.newDatagram();
      assertEquals(1, datagramPacket0.getPort());
      assertEquals(2, tFTPDataPacket0.getDataLength());
      assertEquals(1, tFTPDataPacket0.getBlockNumber());
      assertEquals(6, datagramPacket0.getLength());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      byte[] byteArray0 = new byte[2];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, (-4843), 114, byteArray0);
      tFTPDataPacket0.setData(byteArray0, 114, (-622));
      int int0 = tFTPDataPacket0.getDataOffset();
      assertEquals(114, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      byte[] byteArray0 = new byte[7];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, (-410), (-410), byteArray0, (byte) (-1), (byte) (-99));
      int int0 = tFTPDataPacket0.getDataOffset();
      assertEquals((-410), tFTPDataPacket0.getBlockNumber());
      assertEquals((-1), int0);
      assertEquals((-99), tFTPDataPacket0.getDataLength());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      byte[] byteArray0 = new byte[9];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, (-3254), (-3254), byteArray0, (byte)0, (byte)0);
      int int0 = tFTPDataPacket0.getDataLength();
      assertEquals(0, tFTPDataPacket0.getDataOffset());
      assertEquals((-3254), tFTPDataPacket0.getBlockNumber());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      byte[] byteArray0 = new byte[2];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, (-4843), 114, byteArray0);
      tFTPDataPacket0.setData(byteArray0, 114, (-622));
      int int0 = tFTPDataPacket0.getDataLength();
      assertEquals((-622), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, (-4), 0, (byte[]) null, 1420, (-4));
      tFTPDataPacket0.getData();
      assertEquals((-4), tFTPDataPacket0.getDataLength());
      assertEquals(0, tFTPDataPacket0.getBlockNumber());
      assertEquals(1420, tFTPDataPacket0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      byte[] byteArray0 = new byte[0];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, (-1123), 0, byteArray0, 0, 99);
      tFTPDataPacket0.getData();
      assertEquals(0, tFTPDataPacket0.getBlockNumber());
      assertEquals(99, tFTPDataPacket0.getDataLength());
      assertEquals(0, tFTPDataPacket0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      byte[] byteArray0 = new byte[469];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, 0, 0, byteArray0);
      int int0 = tFTPDataPacket0.getBlockNumber();
      assertEquals(469, tFTPDataPacket0.getDataLength());
      assertEquals(0, tFTPDataPacket0.getDataOffset());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      byte[] byteArray0 = new byte[3];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, (-2792), (-2792), byteArray0);
      int int0 = tFTPDataPacket0.getBlockNumber();
      assertEquals((-2792), int0);
      assertEquals(0, tFTPDataPacket0.getDataOffset());
      assertEquals(3, tFTPDataPacket0.getDataLength());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket((InetAddress) null, 777, 1910, byteArray0, 777, (byte)115);
      // Undeclared exception!
      try { 
        tFTPDataPacket0.newDatagram((DatagramPacket) null, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPDataPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket((InetAddress) null, 2564, 3552, (byte[]) null, 3552, 3552);
      // Undeclared exception!
      try { 
        tFTPDataPacket0.newDatagram();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      byte[] byteArray0 = new byte[0];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, 0, 0, byteArray0);
      tFTPDataPacket0.setData(byteArray0, 0, (-420));
      // Undeclared exception!
      try { 
        tFTPDataPacket0.newDatagram();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPDataPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      byte[] byteArray0 = new byte[8];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, (-372), 1, byteArray0);
      // Undeclared exception!
      try { 
        tFTPDataPacket0.newDatagram();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port out of range:-372
         //
         verifyException("java.net.DatagramPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      byte[] byteArray0 = new byte[0];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, (-1123), 0, byteArray0, 0, 99);
      // Undeclared exception!
      try { 
        tFTPDataPacket0.newDatagram();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      TFTPDataPacket tFTPDataPacket0 = null;
      try {
        tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, (-1666), (-1666), (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPDataPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TFTPDataPacket tFTPDataPacket0 = null;
      try {
        tFTPDataPacket0 = new TFTPDataPacket((DatagramPacket) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPDataPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatagramPacket datagramPacket0 = new DatagramPacket(byteArray0, 0, 0);
      TFTPDataPacket tFTPDataPacket0 = null;
      try {
        tFTPDataPacket0 = new TFTPDataPacket(datagramPacket0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.net.tftp.TFTPDataPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket((InetAddress) null, 1685, 1685, byteArray0, 1685, 1685);
      tFTPDataPacket0.setData(byteArray0, 1685, 1685);
      assertEquals(1685, tFTPDataPacket0.getBlockNumber());
      assertEquals(1685, tFTPDataPacket0.getDataOffset());
      assertEquals(512, tFTPDataPacket0.getDataLength());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      byte[] byteArray0 = new byte[519];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, 0, 0, byteArray0);
      DatagramPacket datagramPacket0 = tFTPDataPacket0.newDatagram();
      TFTPDataPacket tFTPDataPacket1 = new TFTPDataPacket(datagramPacket0);
      byte[] byteArray1 = tFTPDataPacket1.getData();
      tFTPDataPacket0.newDatagram(datagramPacket0, byteArray1);
      assertEquals(4, tFTPDataPacket1.getDataOffset());
      assertEquals(516, datagramPacket0.getLength());
      assertEquals(0, tFTPDataPacket1.getBlockNumber());
      assertEquals(0, tFTPDataPacket0.getDataOffset());
      assertEquals(516, byteArray1.length);
      assertEquals(0, datagramPacket0.getPort());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatagramPacket datagramPacket0 = new DatagramPacket(byteArray0, (byte)0);
      TFTPDataPacket tFTPDataPacket0 = null;
      try {
        tFTPDataPacket0 = new TFTPDataPacket(datagramPacket0);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // TFTP operator code does not match type.
         //
         verifyException("org.apache.commons.net.tftp.TFTPDataPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName((String) null);
      byte[] byteArray0 = new byte[4];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, 0, 0, byteArray0);
      int int0 = tFTPDataPacket0.getDataLength();
      assertEquals(4, int0);
      assertEquals(0, tFTPDataPacket0.getDataOffset());
      assertEquals(0, tFTPDataPacket0.getBlockNumber());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      byte[] byteArray0 = new byte[519];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, 0, 0, byteArray0);
      assertEquals(0, tFTPDataPacket0.getBlockNumber());
      
      tFTPDataPacket0.setBlockNumber(5);
      assertEquals(5, tFTPDataPacket0.getBlockNumber());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      byte[] byteArray0 = new byte[0];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, (-1123), 0, byteArray0, 0, 99);
      int int0 = tFTPDataPacket0.getDataOffset();
      assertEquals(99, tFTPDataPacket0.getDataLength());
      assertEquals(0, int0);
      assertEquals(0, tFTPDataPacket0.getBlockNumber());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      byte[] byteArray0 = new byte[0];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, (-1123), 0, byteArray0, 0, 99);
      String string0 = tFTPDataPacket0.toString();
      assertEquals(0, tFTPDataPacket0.getDataOffset());
      assertEquals("/192.168.1.42 -1123 3 DATA 0 99", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      byte[] byteArray0 = new byte[3];
      TFTPDataPacket tFTPDataPacket0 = new TFTPDataPacket(inetAddress0, 0, 3, byteArray0, (byte)2, 1);
      int int0 = tFTPDataPacket0.getBlockNumber();
      assertEquals(2, tFTPDataPacket0.getDataOffset());
      assertEquals(1, tFTPDataPacket0.getDataLength());
      assertEquals(3, int0);
  }
}
