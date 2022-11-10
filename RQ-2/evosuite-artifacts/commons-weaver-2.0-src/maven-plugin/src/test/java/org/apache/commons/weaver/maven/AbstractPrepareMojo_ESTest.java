/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 16:53:19 GMT 2022
 */

package org.apache.commons.weaver.maven;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import org.apache.commons.weaver.maven.PrepareMojo;
import org.apache.commons.weaver.maven.TestPrepareMojo;
import org.apache.maven.model.Developer;
import org.apache.maven.model.Model;
import org.apache.maven.model.profile.DefaultProfileActivationContext;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.project.MavenProject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractPrepareMojo_ESTest extends AbstractPrepareMojo_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PrepareMojo prepareMojo0 = new PrepareMojo();
      MockFile mockFile0 = new MockFile("");
      Model model0 = new Model();
      MavenProject mavenProject0 = new MavenProject(model0);
      List<String> list0 = mavenProject0.getCompileSourceRoots();
      Developer developer0 = new Developer();
      Properties properties0 = developer0.getProperties();
      prepareMojo0.doExecute(mockFile0, list0, properties0);
      assertEquals(0, mockFile0.getUsableSpace());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PrepareMojo prepareMojo0 = new PrepareMojo();
      DefaultProfileActivationContext defaultProfileActivationContext0 = new DefaultProfileActivationContext();
      List<String> list0 = defaultProfileActivationContext0.getInactiveProfileIds();
      // Undeclared exception!
      try { 
        prepareMojo0.doExecute((File) null, list0, (Properties) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.weaver.maven.AbstractPrepareMojo", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TestPrepareMojo testPrepareMojo0 = new TestPrepareMojo();
      MockFile mockFile0 = new MockFile("u<+*:*k@Opwv4");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      testPrepareMojo0.doExecute(mockFile0, linkedList0, (Properties) null);
      assertFalse(mockFile0.canRead());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PrepareMojo prepareMojo0 = new PrepareMojo();
      MockFile mockFile0 = new MockFile("");
      Properties properties0 = new Properties();
      try { 
        prepareMojo0.doExecute(mockFile0, (List<String>) null, properties0);
        fail("Expecting exception: MojoExecutionException");
      } catch(MojoExecutionException e) {
         //
         // cleaning failed due to classpath
         //
         verifyException("org.apache.commons.weaver.maven.AbstractPrepareMojo", e);
      }
  }
}
