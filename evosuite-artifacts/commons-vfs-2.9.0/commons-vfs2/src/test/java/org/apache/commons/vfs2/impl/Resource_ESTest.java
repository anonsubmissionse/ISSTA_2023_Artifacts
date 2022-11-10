/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 05:12:49 GMT 2022
 */

package org.apache.commons.vfs2.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URL;
import java.util.jar.Attributes;
import org.apache.commons.vfs2.FileContent;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.impl.Resource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Resource_ESTest extends Resource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileObject fileObject0 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn((FileObject) null).when(fileObject0).getParent();
      Resource resource0 = new Resource("vfs.provider/check-is-hidden.error", fileObject0, fileObject0);
      String string0 = resource0.getPackageName();
      assertNotNull(string0);
      assertEquals("vfs.provider", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileObject fileObject0 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn((FileObject) null).when(fileObject0).getParent();
      Resource resource0 = new Resource("/", fileObject0, fileObject0);
      String string0 = resource0.getPackageName();
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileContent fileContent0 = mock(FileContent.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(fileContent0).getAttribute(anyString());
      FileObject fileObject0 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn(fileContent0).when(fileObject0).getContent();
      FileObject fileObject1 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn(fileObject0).when(fileObject1).getParent();
      Resource resource0 = new Resource("w", fileObject1, fileObject1);
      Attributes.Name attributes_Name0 = mock(Attributes.Name.class, new ViolatedAssumptionAnswer());
      doReturn("").when(attributes_Name0).toString();
      String string0 = resource0.getPackageAttribute(attributes_Name0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileContent fileContent0 = mock(FileContent.class, new ViolatedAssumptionAnswer());
      doReturn("w").when(fileContent0).getAttribute(anyString());
      FileObject fileObject0 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn(fileContent0).when(fileObject0).getContent();
      FileObject fileObject1 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn(fileObject0).when(fileObject1).getParent();
      Resource resource0 = new Resource("w", fileObject1, fileObject1);
      Attributes.Name attributes_Name0 = mock(Attributes.Name.class, new ViolatedAssumptionAnswer());
      doReturn("").when(attributes_Name0).toString();
      String string0 = resource0.getPackageAttribute(attributes_Name0);
      assertEquals("w", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileContent fileContent0 = mock(FileContent.class, new ViolatedAssumptionAnswer());
      doReturn("").when(fileContent0).getAttribute(anyString());
      FileObject fileObject0 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn(fileContent0).when(fileObject0).getContent();
      FileObject fileObject1 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn(fileObject0).when(fileObject1).getParent();
      Resource resource0 = new Resource("", fileObject1, fileObject1);
      Attributes.Name attributes_Name0 = mock(Attributes.Name.class, new ViolatedAssumptionAnswer());
      doReturn("").when(attributes_Name0).toString();
      String string0 = resource0.getPackageAttribute(attributes_Name0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileContent fileContent0 = mock(FileContent.class, new ViolatedAssumptionAnswer());
      doReturn((byte[]) null).when(fileContent0).getByteArray();
      FileObject fileObject0 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      FileObject fileObject1 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn(fileContent0).when(fileObject1).getContent();
      doReturn(fileObject0).when(fileObject1).getParent();
      Resource resource0 = new Resource("w", fileObject1, fileObject1);
      byte[] byteArray0 = resource0.getBytes();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FileContent fileContent0 = mock(FileContent.class, new ViolatedAssumptionAnswer());
      doReturn(byteArray0).when(fileContent0).getByteArray();
      FileObject fileObject0 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      FileObject fileObject1 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn(fileContent0).when(fileObject1).getContent();
      doReturn(fileObject0).when(fileObject1).getParent();
      Resource resource0 = new Resource("", fileObject1, fileObject1);
      byte[] byteArray1 = resource0.getBytes();
      assertSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FileContent fileContent0 = mock(FileContent.class, new ViolatedAssumptionAnswer());
      doReturn(byteArray0).when(fileContent0).getByteArray();
      FileObject fileObject0 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      FileObject fileObject1 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn(fileContent0).when(fileObject1).getContent();
      doReturn(fileObject0).when(fileObject1).getParent();
      Resource resource0 = new Resource("w", fileObject1, fileObject1);
      byte[] byteArray1 = resource0.getBytes();
      assertSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileObject fileObject0 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      FileObject fileObject1 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn(fileObject0).when(fileObject1).getParent();
      Resource resource0 = new Resource(";i", (FileObject) null, fileObject1);
      // Undeclared exception!
      try { 
        resource0.getCodeSourceURL();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.vfs2.impl.Resource", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Resource resource0 = null;
      try {
        resource0 = new Resource("J\"lL9o$Qou/U4uL):=", (FileObject) null, (FileObject) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.vfs2.impl.Resource", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileObject fileObject0 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn((FileObject) null).when(fileObject0).getParent();
      doReturn((URL) null).when(fileObject0).getURL();
      Resource resource0 = new Resource("", fileObject0, fileObject0);
      URL uRL0 = resource0.getURL();
      assertNull(uRL0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileObject fileObject0 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn((FileObject) null).when(fileObject0).getParent();
      Resource resource0 = new Resource("", fileObject0, fileObject0);
      Attributes.Name attributes_Name0 = mock(Attributes.Name.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        resource0.getPackageAttribute(attributes_Name0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.vfs2.impl.Resource", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileObject fileObject0 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      FileObject fileObject1 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn((FileContent) null).when(fileObject1).getContent();
      doReturn((FileObject) null).when(fileObject1).getParent();
      Resource resource0 = new Resource("Y3(&~J.", fileObject0, fileObject1);
      // Undeclared exception!
      try { 
        resource0.getBytes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.vfs2.util.FileObjectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileObject fileObject0 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn((FileObject) null).when(fileObject0).getParent();
      doReturn((URL) null).when(fileObject0).getURL();
      Resource resource0 = new Resource("", fileObject0, fileObject0);
      URL uRL0 = resource0.getCodeSourceURL();
      assertNull(uRL0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileObject fileObject0 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn((FileObject) null).when(fileObject0).getParent();
      Resource resource0 = new Resource("", fileObject0, fileObject0);
      String string0 = resource0.getPackageName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileObject fileObject0 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      FileObject fileObject1 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn((FileObject) null).when(fileObject1).getParent();
      Resource resource0 = new Resource("Y3(&~J.", fileObject0, fileObject1);
      FileObject fileObject2 = resource0.getPackageFolder();
      assertNull(fileObject2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileObject fileObject0 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(fileObject0).toString();
      doReturn((FileObject) null).when(fileObject0).getParent();
      Resource resource0 = new Resource("", fileObject0, fileObject0);
      FileObject fileObject1 = resource0.getFileObject();
      assertSame(fileObject1, fileObject0);
  }
}
