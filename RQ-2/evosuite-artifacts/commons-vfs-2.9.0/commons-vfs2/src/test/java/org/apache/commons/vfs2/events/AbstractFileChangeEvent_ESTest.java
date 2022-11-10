/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 05:13:57 GMT 2022
 */

package org.apache.commons.vfs2.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.vfs2.FileListener;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.events.CreateEvent;
import org.apache.commons.vfs2.events.DeleteEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractFileChangeEvent_ESTest extends AbstractFileChangeEvent_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileObject fileObject0 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      DeleteEvent deleteEvent0 = new DeleteEvent(fileObject0);
      FileListener fileListener0 = mock(FileListener.class, new ViolatedAssumptionAnswer());
      deleteEvent0.notify(fileListener0);
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileObject fileObject0 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      CreateEvent createEvent0 = new CreateEvent(fileObject0);
      try { 
        createEvent0.notify((FileListener) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.vfs2.events.CreateEvent", e);
      }
  }
}
