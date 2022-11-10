/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 05:24:49 GMT 2022
 */

package org.apache.commons.vfs2.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.apache.commons.vfs2.impl.ProviderConfiguration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProviderConfiguration_ESTest extends ProviderConfiguration_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ProviderConfiguration providerConfiguration0 = new ProviderConfiguration();
      providerConfiguration0.setDependency("org.apache.commons.vfs2.impl.ProviderConfiguration");
      List<String> list0 = providerConfiguration0.getDependencies();
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ProviderConfiguration providerConfiguration0 = new ProviderConfiguration();
      providerConfiguration0.setClassName("");
      String string0 = providerConfiguration0.getClassName();
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ProviderConfiguration providerConfiguration0 = new ProviderConfiguration();
      List<String> list0 = providerConfiguration0.getDependencies();
      assertEquals(0, list0.size());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ProviderConfiguration providerConfiguration0 = new ProviderConfiguration();
      String string0 = providerConfiguration0.getClassName();
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ProviderConfiguration providerConfiguration0 = new ProviderConfiguration();
      boolean boolean0 = providerConfiguration0.isDefault();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ProviderConfiguration providerConfiguration0 = new ProviderConfiguration();
      providerConfiguration0.setScheme("wdv\"QmF+");
      List<String> list0 = providerConfiguration0.getSchemes();
      assertTrue(list0.isEmpty());
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ProviderConfiguration providerConfiguration0 = new ProviderConfiguration();
      List<String> list0 = providerConfiguration0.getSchemes();
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ProviderConfiguration providerConfiguration0 = new ProviderConfiguration();
      providerConfiguration0.setClassName("wdv\"QmF+");
      String string0 = providerConfiguration0.getClassName();
      ;
}
}
