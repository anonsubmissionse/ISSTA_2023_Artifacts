/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 01:46:07 GMT 2022
 */

package org.apache.commons.collections4.functors;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ChainedClosure_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.collections4.functors.ChainedClosure"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ChainedClosure_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.collections4.functors.NotPredicate",
      "org.apache.commons.collections4.functors.FunctorUtils",
      "org.apache.commons.collections4.functors.PredicateDecorator",
      "org.apache.commons.collections4.functors.PrototypeFactory",
      "org.apache.commons.collections4.Predicate",
      "org.apache.commons.collections4.functors.ChainedClosure",
      "org.apache.commons.collections4.functors.CloneTransformer",
      "org.apache.commons.collections4.Transformer",
      "org.apache.commons.collections4.functors.SwitchClosure",
      "org.apache.commons.collections4.Equator",
      "org.apache.commons.collections4.functors.IfClosure",
      "org.apache.commons.collections4.functors.NOPClosure",
      "org.apache.commons.collections4.Closure",
      "org.apache.commons.collections4.functors.TransformerClosure",
      "org.apache.commons.collections4.functors.OnePredicate",
      "org.apache.commons.collections4.functors.AbstractQuantifierPredicate",
      "org.apache.commons.collections4.functors.WhileClosure",
      "org.apache.commons.collections4.functors.ExceptionClosure",
      "org.apache.commons.collections4.functors.DefaultEquator",
      "org.apache.commons.collections4.functors.FalsePredicate",
      "org.apache.commons.collections4.functors.ForClosure",
      "org.apache.commons.collections4.FunctorException",
      "org.apache.commons.collections4.Factory"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ChainedClosure_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.collections4.functors.ChainedClosure",
      "org.apache.commons.collections4.functors.NOPClosure",
      "org.apache.commons.collections4.functors.ConstantFactory",
      "org.apache.commons.collections4.functors.FactoryTransformer",
      "org.apache.commons.collections4.functors.TransformerClosure",
      "org.apache.commons.collections4.functors.FunctorUtils",
      "org.apache.commons.collections4.functors.UniquePredicate",
      "org.apache.commons.collections4.functors.ConstantTransformer",
      "org.apache.commons.collections4.functors.InvokerTransformer",
      "org.apache.commons.collections4.functors.SwitchClosure",
      "org.apache.commons.collections4.functors.IfClosure",
      "org.apache.commons.collections4.functors.ExceptionClosure",
      "org.apache.commons.collections4.functors.ForClosure",
      "org.apache.commons.collections4.FunctorException",
      "org.apache.commons.collections4.functors.WhileClosure",
      "org.apache.commons.collections4.functors.TransformedPredicate",
      "org.apache.commons.collections4.functors.ComparatorPredicate",
      "org.apache.commons.collections4.functors.ExceptionTransformer",
      "org.apache.commons.collections4.functors.EqualPredicate",
      "org.apache.commons.collections4.functors.NotPredicate",
      "org.apache.commons.collections4.functors.InstantiateFactory",
      "org.apache.commons.collections4.functors.IfTransformer",
      "org.apache.commons.collections4.functors.SwitchTransformer",
      "org.apache.commons.collections4.functors.ExceptionPredicate",
      "org.apache.commons.collections4.functors.IdentityPredicate",
      "org.apache.commons.collections4.functors.AbstractQuantifierPredicate",
      "org.apache.commons.collections4.functors.AllPredicate",
      "org.apache.commons.collections4.functors.TruePredicate",
      "org.apache.commons.collections4.functors.NullIsTruePredicate",
      "org.apache.commons.collections4.functors.NonePredicate",
      "org.apache.commons.collections4.functors.OnePredicate",
      "org.apache.commons.collections4.functors.InstanceofPredicate",
      "org.apache.commons.collections4.functors.PredicateTransformer",
      "org.apache.commons.collections4.functors.AnyPredicate",
      "org.apache.commons.collections4.functors.FalsePredicate",
      "org.apache.commons.collections4.functors.NullIsFalsePredicate",
      "org.apache.commons.collections4.functors.OrPredicate",
      "org.apache.commons.collections4.functors.NullIsExceptionPredicate",
      "org.apache.commons.collections4.functors.NotNullPredicate",
      "org.apache.commons.collections4.functors.AndPredicate",
      "org.apache.commons.collections4.functors.NullPredicate",
      "org.apache.commons.collections4.functors.DefaultEquator",
      "org.apache.commons.collections4.functors.ComparatorPredicate$1",
      "org.apache.commons.collections4.functors.TransformerPredicate",
      "org.apache.commons.collections4.functors.MapTransformer",
      "org.apache.commons.collections4.functors.StringValueTransformer",
      "org.apache.commons.collections4.functors.ClosureTransformer",
      "org.apache.commons.collections4.functors.ChainedTransformer",
      "org.apache.commons.collections4.functors.CloneTransformer",
      "org.apache.commons.collections4.functors.NOPTransformer",
      "org.apache.commons.collections4.functors.ExceptionFactory",
      "org.apache.commons.collections4.functors.PrototypeFactory",
      "org.apache.commons.collections4.functors.PrototypeFactory$PrototypeSerializationFactory"
    );
  }
}
