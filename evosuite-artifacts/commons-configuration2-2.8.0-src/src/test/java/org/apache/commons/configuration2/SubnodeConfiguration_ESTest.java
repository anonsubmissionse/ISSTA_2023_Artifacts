/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 01:06:02 GMT 2022
 */

package org.apache.commons.configuration2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.configuration2.AbstractYAMLBasedConfiguration;
import org.apache.commons.configuration2.BaseHierarchicalConfiguration;
import org.apache.commons.configuration2.CombinedConfiguration;
import org.apache.commons.configuration2.DynamicCombinedConfiguration;
import org.apache.commons.configuration2.HierarchicalConfiguration;
import org.apache.commons.configuration2.INIConfiguration;
import org.apache.commons.configuration2.JSONConfiguration;
import org.apache.commons.configuration2.SubnodeConfiguration;
import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.YAMLConfiguration;
import org.apache.commons.configuration2.tree.ImmutableNode;
import org.apache.commons.configuration2.tree.InMemoryNodeModel;
import org.apache.commons.configuration2.tree.NodeModel;
import org.apache.commons.configuration2.tree.NodeSelector;
import org.apache.commons.configuration2.tree.OverrideCombiner;
import org.apache.commons.configuration2.tree.TrackedNodeModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SubnodeConfiguration_ESTest extends SubnodeConfiguration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      SubnodeConfiguration subnodeConfiguration0 = iNIConfiguration0.getSection("");
      iNIConfiguration0.setDetailEvents(true);
      BaseHierarchicalConfiguration baseHierarchicalConfiguration0 = subnodeConfiguration0.getParent();
      assertSame(baseHierarchicalConfiguration0, iNIConfiguration0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CombinedConfiguration combinedConfiguration0 = new CombinedConfiguration();
      NodeSelector nodeSelector0 = new NodeSelector("BuMKuR{j");
      TrackedNodeModel trackedNodeModel0 = new TrackedNodeModel(combinedConfiguration0, nodeSelector0, false);
      SubnodeConfiguration subnodeConfiguration0 = new SubnodeConfiguration(combinedConfiguration0, trackedNodeModel0);
      InMemoryNodeModel inMemoryNodeModel0 = subnodeConfiguration0.getRootNodeModel();
      BaseHierarchicalConfiguration baseHierarchicalConfiguration0 = new BaseHierarchicalConfiguration(inMemoryNodeModel0);
      SubnodeConfiguration subnodeConfiguration1 = baseHierarchicalConfiguration0.createSubConfigurationForTrackedNode(nodeSelector0, subnodeConfiguration0);
      // Undeclared exception!
      try { 
        subnodeConfiguration1.getSubConfigurationParentModel();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No tracked node found: org.apache.commons.configuration2.tree.NodeSelector@11[keys=[BuMKuR{j]]
         //
         verifyException("org.apache.commons.configuration2.tree.NodeTracker", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONConfiguration jSONConfiguration0 = new JSONConfiguration((HierarchicalConfiguration<ImmutableNode>) null);
      NodeSelector nodeSelector0 = new NodeSelector("$");
      TrackedNodeModel trackedNodeModel0 = new TrackedNodeModel(jSONConfiguration0, nodeSelector0, true);
      BaseHierarchicalConfiguration baseHierarchicalConfiguration0 = new BaseHierarchicalConfiguration(trackedNodeModel0);
      SubnodeConfiguration subnodeConfiguration0 = new SubnodeConfiguration(baseHierarchicalConfiguration0, trackedNodeModel0);
      SubnodeConfiguration subnodeConfiguration1 = subnodeConfiguration0.createSubConfigurationForTrackedNode(nodeSelector0, jSONConfiguration0);
      // Undeclared exception!
      try { 
        subnodeConfiguration1.getSubConfigurationParentModel();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.configuration2.tree.TrackedNodeModel cannot be cast to org.apache.commons.configuration2.tree.InMemoryNodeModel
         //
         verifyException("org.apache.commons.configuration2.BaseHierarchicalConfiguration", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      SubnodeConfiguration subnodeConfiguration0 = iNIConfiguration0.getSection("$-f/R");
      NodeModel<ImmutableNode> nodeModel0 = subnodeConfiguration0.cloneNodeModel();
      BaseHierarchicalConfiguration baseHierarchicalConfiguration0 = new BaseHierarchicalConfiguration(nodeModel0);
      InMemoryNodeModel inMemoryNodeModel0 = subnodeConfiguration0.getRootNodeModel();
      NodeSelector nodeSelector0 = inMemoryNodeModel0.trackChildNodeWithCreation("$-f/R", "$-f/R", subnodeConfiguration0);
      SubnodeConfiguration subnodeConfiguration1 = baseHierarchicalConfiguration0.createSubConfigurationForTrackedNode(nodeSelector0, iNIConfiguration0);
      // Undeclared exception!
      try { 
        subnodeConfiguration1.getRootNodeModel();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.configuration2.tree.TrackedNodeModel cannot be cast to org.apache.commons.configuration2.tree.InMemoryNodeModel
         //
         verifyException("org.apache.commons.configuration2.BaseHierarchicalConfiguration", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AbstractYAMLBasedConfiguration abstractYAMLBasedConfiguration0 = new AbstractYAMLBasedConfiguration();
      XMLConfiguration xMLConfiguration0 = new XMLConfiguration(abstractYAMLBasedConfiguration0);
      INIConfiguration iNIConfiguration0 = new INIConfiguration(xMLConfiguration0);
      SubnodeConfiguration subnodeConfiguration0 = iNIConfiguration0.getSection("zbe@o.>``");
      NodeSelector nodeSelector0 = new NodeSelector("zbe@o.>``");
      SubnodeConfiguration subnodeConfiguration1 = subnodeConfiguration0.createSubConfigurationForTrackedNode(nodeSelector0, iNIConfiguration0);
      // Undeclared exception!
      try { 
        subnodeConfiguration1.getNodeModel();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No tracked node found: org.apache.commons.configuration2.tree.NodeSelector@53[keys=[zbe@o.>``]]
         //
         verifyException("org.apache.commons.configuration2.tree.NodeTracker", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DynamicCombinedConfiguration dynamicCombinedConfiguration0 = new DynamicCombinedConfiguration();
      NodeSelector nodeSelector0 = new NodeSelector("O`=cq0[v|<[{V");
      TrackedNodeModel trackedNodeModel0 = new TrackedNodeModel(dynamicCombinedConfiguration0, nodeSelector0, true);
      BaseHierarchicalConfiguration baseHierarchicalConfiguration0 = new BaseHierarchicalConfiguration(trackedNodeModel0);
      SubnodeConfiguration subnodeConfiguration0 = new SubnodeConfiguration(baseHierarchicalConfiguration0, trackedNodeModel0);
      // Undeclared exception!
      try { 
        subnodeConfiguration0.getNodeModel();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.configuration2.tree.TrackedNodeModel cannot be cast to org.apache.commons.configuration2.tree.InMemoryNodeModel
         //
         verifyException("org.apache.commons.configuration2.BaseHierarchicalConfiguration", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OverrideCombiner overrideCombiner0 = new OverrideCombiner();
      DynamicCombinedConfiguration dynamicCombinedConfiguration0 = new DynamicCombinedConfiguration(overrideCombiner0);
      NodeSelector nodeSelector0 = new NodeSelector("xRmUt?");
      TrackedNodeModel trackedNodeModel0 = new TrackedNodeModel(dynamicCombinedConfiguration0, nodeSelector0, true);
      SubnodeConfiguration subnodeConfiguration0 = new SubnodeConfiguration(dynamicCombinedConfiguration0, trackedNodeModel0);
      // Undeclared exception!
      try { 
        subnodeConfiguration0.close();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No tracked node found: org.apache.commons.configuration2.tree.NodeSelector@15[keys=[xRmUt?]]
         //
         verifyException("org.apache.commons.configuration2.tree.NodeTracker", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      YAMLConfiguration yAMLConfiguration0 = new YAMLConfiguration();
      INIConfiguration iNIConfiguration0 = new INIConfiguration(yAMLConfiguration0);
      NodeSelector nodeSelector0 = new NodeSelector("org.apache.commons.configuration2.SubnodeConfiguration");
      TrackedNodeModel trackedNodeModel0 = new TrackedNodeModel(yAMLConfiguration0, nodeSelector0, true);
      SubnodeConfiguration subnodeConfiguration0 = new SubnodeConfiguration(iNIConfiguration0, trackedNodeModel0);
      // Undeclared exception!
      try { 
        subnodeConfiguration0.cloneNodeModel();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Selector does not select unique node: org.apache.commons.configuration2.tree.NodeSelector@20[keys=[org.apache.commons.configuration2.SubnodeConfiguration]]
         //
         verifyException("org.apache.commons.configuration2.tree.NodeTracker", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BaseHierarchicalConfiguration baseHierarchicalConfiguration0 = new BaseHierarchicalConfiguration((NodeModel<ImmutableNode>) null);
      NodeSelector nodeSelector0 = new NodeSelector("fj");
      TrackedNodeModel trackedNodeModel0 = new TrackedNodeModel(baseHierarchicalConfiguration0, nodeSelector0, false);
      SubnodeConfiguration subnodeConfiguration0 = new SubnodeConfiguration(baseHierarchicalConfiguration0, trackedNodeModel0);
      // Undeclared exception!
      try { 
        subnodeConfiguration0.cloneNodeModel();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.configuration2.SubnodeConfiguration", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      SubnodeConfiguration subnodeConfiguration0 = iNIConfiguration0.getSection("gUP}");
      NodeSelector nodeSelector0 = new NodeSelector("gUP}");
      SubnodeConfiguration subnodeConfiguration1 = subnodeConfiguration0.createSubConfigurationForTrackedNode(nodeSelector0, iNIConfiguration0);
      // Undeclared exception!
      try { 
        subnodeConfiguration1.cloneNodeModel();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.configuration2.tree.TrackedNodeModel cannot be cast to org.apache.commons.configuration2.tree.InMemoryNodeModel
         //
         verifyException("org.apache.commons.configuration2.SubnodeConfiguration", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AbstractYAMLBasedConfiguration abstractYAMLBasedConfiguration0 = new AbstractYAMLBasedConfiguration();
      NodeSelector nodeSelector0 = new NodeSelector("H-LxdIPq%Y=\"%?S^");
      SubnodeConfiguration subnodeConfiguration0 = abstractYAMLBasedConfiguration0.createSubConfigurationForTrackedNode(nodeSelector0, abstractYAMLBasedConfiguration0);
      NodeSelector nodeSelector1 = subnodeConfiguration0.getRootSelector();
      assertSame(nodeSelector1, nodeSelector0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      SubnodeConfiguration subnodeConfiguration0 = iNIConfiguration0.getSection("Parent configuration must not be null!");
      BaseHierarchicalConfiguration baseHierarchicalConfiguration0 = subnodeConfiguration0.getParent();
      assertSame(iNIConfiguration0, baseHierarchicalConfiguration0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      YAMLConfiguration yAMLConfiguration0 = new YAMLConfiguration();
      INIConfiguration iNIConfiguration0 = new INIConfiguration(yAMLConfiguration0);
      NodeSelector nodeSelector0 = new NodeSelector("org.apache.commons.configuration2.SubnodeConfiguration");
      TrackedNodeModel trackedNodeModel0 = new TrackedNodeModel(yAMLConfiguration0, nodeSelector0, true);
      SubnodeConfiguration subnodeConfiguration0 = new SubnodeConfiguration(iNIConfiguration0, trackedNodeModel0);
      SubnodeConfiguration subnodeConfiguration1 = subnodeConfiguration0.createSubConfigurationForTrackedNode(nodeSelector0, yAMLConfiguration0);
      InMemoryNodeModel inMemoryNodeModel0 = subnodeConfiguration1.getRootNodeModel();
      assertNotNull(inMemoryNodeModel0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DynamicCombinedConfiguration dynamicCombinedConfiguration0 = new DynamicCombinedConfiguration();
      SubnodeConfiguration subnodeConfiguration0 = null;
      try {
        subnodeConfiguration0 = new SubnodeConfiguration(dynamicCombinedConfiguration0, (TrackedNodeModel) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Node model must not be null!
         //
         verifyException("org.apache.commons.configuration2.SubnodeConfiguration", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SubnodeConfiguration subnodeConfiguration0 = null;
      try {
        subnodeConfiguration0 = new SubnodeConfiguration((BaseHierarchicalConfiguration) null, (TrackedNodeModel) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parent configuration must not be null!
         //
         verifyException("org.apache.commons.configuration2.SubnodeConfiguration", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      SubnodeConfiguration subnodeConfiguration0 = iNIConfiguration0.getSection("Parent configuration must not be null!");
      // Undeclared exception!
      try { 
        subnodeConfiguration0.createSubConfigurationForTrackedNode((NodeSelector) null, iNIConfiguration0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Selector must not be null!
         //
         verifyException("org.apache.commons.configuration2.tree.TrackedNodeModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      SubnodeConfiguration subnodeConfiguration0 = iNIConfiguration0.getSection("1");
      subnodeConfiguration0.close();
      assertFalse(subnodeConfiguration0.isDetailEvents());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      SubnodeConfiguration subnodeConfiguration0 = iNIConfiguration0.getSection("1");
      NodeModel<ImmutableNode> nodeModel0 = subnodeConfiguration0.cloneNodeModel();
      assertNotNull(nodeModel0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      SubnodeConfiguration subnodeConfiguration0 = iNIConfiguration0.getSection("1");
      InMemoryNodeModel inMemoryNodeModel0 = subnodeConfiguration0.getNodeModel();
      assertNotNull(inMemoryNodeModel0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      SubnodeConfiguration subnodeConfiguration0 = iNIConfiguration0.getSection("1");
      InMemoryNodeModel inMemoryNodeModel0 = subnodeConfiguration0.getSubConfigurationParentModel();
      assertNotNull(inMemoryNodeModel0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      SubnodeConfiguration subnodeConfiguration0 = iNIConfiguration0.getSection("1");
      NodeSelector nodeSelector0 = subnodeConfiguration0.getSubConfigurationNodeSelector("1");
      assertNotNull(nodeSelector0);
  }
}
