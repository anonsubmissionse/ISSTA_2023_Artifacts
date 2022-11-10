/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:43:20 GMT 2022
 */

package org.apache.commons.geometry.io.core;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.charset.Charset;
import org.apache.commons.geometry.io.core.AbstractGeometryIOMetadata;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractGeometryIOMetadata_ESTest extends AbstractGeometryIOMetadata_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      AbstractGeometryIOMetadata abstractGeometryIOMetadata0 = new AbstractGeometryIOMetadata("A", charset0);
      String string0 = abstractGeometryIOMetadata0.getFileName();
      assertEquals("A", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      AbstractGeometryIOMetadata abstractGeometryIOMetadata0 = new AbstractGeometryIOMetadata("", charset0);
      String string0 = abstractGeometryIOMetadata0.getFileName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AbstractGeometryIOMetadata abstractGeometryIOMetadata0 = new AbstractGeometryIOMetadata((String) null, (Charset) null);
      Charset charset0 = abstractGeometryIOMetadata0.getCharset();
      assertNull(charset0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Charset charset0 = Charset.forName("L4");
      AbstractGeometryIOMetadata abstractGeometryIOMetadata0 = new AbstractGeometryIOMetadata("", charset0);
      Charset charset1 = abstractGeometryIOMetadata0.getCharset();
      assertSame(charset0, charset1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AbstractGeometryIOMetadata abstractGeometryIOMetadata0 = new AbstractGeometryIOMetadata((String) null, (Charset) null);
      String string0 = abstractGeometryIOMetadata0.getFileName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      AbstractGeometryIOMetadata abstractGeometryIOMetadata0 = new AbstractGeometryIOMetadata("org.pache.commns.geometry.core.partitining.test.TesPoinD", charset0);
      String string0 = abstractGeometryIOMetadata0.toString();
      assertEquals("AbstractGeometryIOMetadata[fileName= org.pache.commns.geometry.core.partitining.test.TesPoinD]", string0);
  }
}
