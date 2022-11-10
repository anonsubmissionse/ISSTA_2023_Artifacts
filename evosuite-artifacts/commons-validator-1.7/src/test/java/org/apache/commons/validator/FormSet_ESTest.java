/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:43:36 GMT 2022
 */

package org.apache.commons.validator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.validator.Field;
import org.apache.commons.validator.Form;
import org.apache.commons.validator.FormSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FormSet_ESTest extends FormSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.addConstant("", "BwJXEH,7b2QX2{[");
      formSet0.addConstant("", "'B{-Qx");
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.setVariant("31>a[5a>]");
      formSet0.getVariant();
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.setVariant("");
      formSet0.getVariant();
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.setLanguage("yfzf?x*V]+h\"N:3s");
      formSet0.getLanguage();
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.setLanguage("");
      formSet0.getLanguage();
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Form form0 = new Form();
      formSet0.addForm(form0);
      assertFalse(formSet0.isProcessed());
      
      formSet0.process(hashMap0);
      formSet0.getForm((String) null);
      assertTrue(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      Form form0 = new Form();
      form0.setExtends("FormSet: language=null  country=lG09~Oi7VK   variant=lG09~Oi7VK \n");
      form0.setName("Sn;Wj<gV)V");
      formSet0.addForm(form0);
      Form form1 = formSet0.getForm("Sn;Wj<gV)V");
      assertNotNull(form1);
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.setCountry("!f2.6T#5:t");
      formSet0.getCountry();
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.setCountry("");
      formSet0.getCountry();
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      Form form0 = new Form();
      form0.lFields = null;
      formSet0.addForm(form0);
      // Undeclared exception!
      try { 
        formSet0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.Form", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      Form form0 = new Form();
      form0.setName("sUb");
      form0.inherit = "sUb";
      formSet0.addForm(form0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      try { 
        formSet0.process(hashMap0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      Form form0 = new Form();
      form0.lFields = null;
      formSet0.addForm(form0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      try { 
        formSet0.process(hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      Form form0 = new Form();
      formSet0.addForm(form0);
      Field field0 = new Field();
      form0.addField(field0);
      // Undeclared exception!
      try { 
        formSet0.merge(formSet0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      Form form0 = new Form();
      List<Field> list0 = form0.getFields();
      form0.lFields = list0;
      formSet0.addForm(form0);
      // Undeclared exception!
      try { 
        formSet0.merge(formSet0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      Form form0 = new Form();
      formSet0.addForm(form0);
      form0.lFields = null;
      // Undeclared exception!
      try { 
        formSet0.merge(formSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      // Undeclared exception!
      try { 
        formSet0.addForm((Form) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.FormSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.setLanguage("se{'|T`Ia_^G");
      formSet0.setCountry("se{'|T`Ia_^G");
      String string0 = formSet0.displayKey();
      assertEquals("language=se{'|T`Ia_^G, country=se{'|T`Ia_^G", string0);
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.setCountry("Arg: name=");
      String string0 = formSet0.displayKey();
      assertEquals("country=Arg: name=", string0);
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.getCountry();
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.getVariant();
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.getLanguage();
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      Form form0 = new Form();
      formSet0.addForm(form0);
      String string0 = formSet0.toString();
      assertFalse(formSet0.isProcessed());
      assertEquals("FormSet: language=null  country=null  variant=null\n   Form: null\n\n", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.setLanguage("Tg5TaeY0");
      formSet0.setVariant("Tg5TaeY0");
      String string0 = formSet0.displayKey();
      assertFalse(formSet0.isProcessed());
      assertEquals("language=Tg5TaeY0, variant=Tg5TaeY0", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.setVariant("Tg5TaeY0");
      String string0 = formSet0.displayKey();
      assertEquals("variant=Tg5TaeY0", string0);
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.setLanguage(" u: ");
      Form form0 = new Form();
      formSet0.addForm(form0);
      formSet0.setCountry(" u: ");
      formSet0.addForm(form0);
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.setCountry("");
      String string0 = formSet0.displayKey();
      assertEquals("default", string0);
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.setLanguage("");
      String string0 = formSet0.displayKey();
      assertFalse(formSet0.isProcessed());
      assertEquals("default", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      assertFalse(formSet0.isProcessed());
      
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      formSet0.process(hashMap0);
      boolean boolean0 = formSet0.isProcessed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      FormSet formSet1 = new FormSet();
      Form form0 = new Form();
      formSet0.addForm(form0);
      formSet1.merge(formSet0);
      assertFalse(formSet1.isProcessed());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.merge((FormSet) null);
      boolean boolean0 = formSet0.isMerged();
      assertTrue(boolean0);
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.setLanguage(" u: ");
      int int0 = formSet0.getType();
      assertFalse(formSet0.isProcessed());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.setLanguage(" u: ");
      formSet0.setCountry(" u: ");
      int int0 = formSet0.getType();
      assertEquals(3, int0);
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.setLanguage("Vc\"E[q(2OQCxwQU&'nxV");
      formSet0.setVariant("Vc\"E[q(2OQCxwQU&'nxV");
      formSet0.setCountry("");
      int int0 = formSet0.getType();
      assertEquals(4, int0);
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.setVariant(" u: ");
      // Undeclared exception!
      try { 
        formSet0.getType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // When variant is specified, country and language must be specified.
         //
         verifyException("org.apache.commons.validator.FormSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.setCountry(" u: ");
      // Undeclared exception!
      try { 
        formSet0.getType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // When country is specified, language must be specified.
         //
         verifyException("org.apache.commons.validator.FormSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      boolean boolean0 = formSet0.isProcessed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.setLanguage(" u: ");
      formSet0.setVariant(" u: ");
      // Undeclared exception!
      try { 
        formSet0.getType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // When variant is specified, country and language must be specified.
         //
         verifyException("org.apache.commons.validator.FormSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.isMerged();
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.getForm(" u: ");
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      int int0 = formSet0.getType();
      assertEquals(1, int0);
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.getForms();
      assertFalse(formSet0.isProcessed());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FormSet formSet0 = new FormSet();
      formSet0.setVariant("");
      String string0 = formSet0.displayKey();
      assertEquals("default", string0);
      assertFalse(formSet0.isProcessed());
  }
}
