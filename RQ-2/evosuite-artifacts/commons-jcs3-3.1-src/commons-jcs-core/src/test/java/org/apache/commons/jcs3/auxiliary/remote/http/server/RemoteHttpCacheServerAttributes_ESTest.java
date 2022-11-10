/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:07:51 GMT 2022
 */

package org.apache.commons.jcs3.auxiliary.remote.http.server;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jcs3.auxiliary.remote.http.server.RemoteHttpCacheServerAttributes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RemoteHttpCacheServerAttributes_ESTest extends RemoteHttpCacheServerAttributes_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RemoteHttpCacheServerAttributes remoteHttpCacheServerAttributes0 = new RemoteHttpCacheServerAttributes();
      assertFalse(remoteHttpCacheServerAttributes0.isLocalClusterConsistency());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RemoteHttpCacheServerAttributes remoteHttpCacheServerAttributes0 = new RemoteHttpCacheServerAttributes();
      remoteHttpCacheServerAttributes0.setLocalClusterConsistency(false);
      boolean boolean0 = remoteHttpCacheServerAttributes0.isLocalClusterConsistency();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RemoteHttpCacheServerAttributes remoteHttpCacheServerAttributes0 = new RemoteHttpCacheServerAttributes();
      assertFalse(remoteHttpCacheServerAttributes0.isAllowClusterGet());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RemoteHttpCacheServerAttributes remoteHttpCacheServerAttributes0 = new RemoteHttpCacheServerAttributes();
      remoteHttpCacheServerAttributes0.setAllowClusterGet(false);
      boolean boolean0 = remoteHttpCacheServerAttributes0.isAllowClusterGet();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RemoteHttpCacheServerAttributes remoteHttpCacheServerAttributes0 = new RemoteHttpCacheServerAttributes();
      boolean boolean0 = remoteHttpCacheServerAttributes0.isLocalClusterConsistency();
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RemoteHttpCacheServerAttributes remoteHttpCacheServerAttributes0 = new RemoteHttpCacheServerAttributes();
      boolean boolean0 = remoteHttpCacheServerAttributes0.isLocalClusterConsistency();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RemoteHttpCacheServerAttributes remoteHttpCacheServerAttributes0 = new RemoteHttpCacheServerAttributes();
      String string0 = remoteHttpCacheServerAttributes0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RemoteHttpCacheServerAttributes remoteHttpCacheServerAttributes0 = new RemoteHttpCacheServerAttributes();
      boolean boolean0 = remoteHttpCacheServerAttributes0.isAllowClusterGet();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      RemoteHttpCacheServerAttributes remoteHttpCacheServerAttributes0 = new RemoteHttpCacheServerAttributes();
      boolean boolean0 = remoteHttpCacheServerAttributes0.isAllowClusterGet();
      assertFalse(remoteHttpCacheServerAttributes0.isLocalClusterConsistency());
}
}
