/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 16:49:48 GMT 2022
 */

package org.apache.commons.weaver;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import org.apache.commons.weaver.Finder;
import org.apache.commons.weaver.model.ScanRequest;
import org.apache.commons.weaver.model.ScanResult;
import org.apache.commons.weaver.model.WeaveInterest;
import org.apache.xbean.asm6.AnnotationVisitor;
import org.apache.xbean.asm6.FieldVisitor;
import org.apache.xbean.asm6.MethodVisitor;
import org.apache.xbean.asm6.Type;
import org.apache.xbean.finder.Annotated;
import org.apache.xbean.finder.AnnotationFinder;
import org.apache.xbean.finder.MetaAnnotatedClass;
import org.apache.xbean.finder.MetaAnnotatedConstructor;
import org.apache.xbean.finder.MetaAnnotatedField;
import org.apache.xbean.finder.Parameter;
import org.apache.xbean.finder.archive.Archive;
import org.apache.xbean.finder.archive.ClassesArchive;
import org.apache.xbean.finder.archive.ClasspathArchive;
import org.apache.xbean.finder.archive.CompositeArchive;
import org.apache.xbean.finder.archive.FileArchive;
import org.apache.xbean.finder.archive.FilteredArchive;
import org.apache.xbean.finder.filter.ClassFilter;
import org.apache.xbean.finder.filter.ContainsFilter;
import org.apache.xbean.finder.filter.ExcludeIncludeFilter;
import org.apache.xbean.finder.filter.IncludeExcludeFilter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Finder_ESTest extends Finder_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<WeaveInterest>[] classArray0 = (Class<WeaveInterest>[]) Array.newInstance(Class.class, 1);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      Class<Annotation> class0 = Annotation.class;
      ElementType elementType0 = ElementType.METHOD;
      WeaveInterest weaveInterest0 = WeaveInterest.of(class0, elementType0);
      AnnotationFinder.ClassInfo annotationFinder_ClassInfo0 = finder0.new ClassInfo(weaveInterest0.annotationType);
      AnnotationFinder.InfoBuildingVisitor annotationFinder_InfoBuildingVisitor0 = finder0.new InfoBuildingVisitor(annotationFinder_ClassInfo0);
      Finder.Visitor finder_Visitor0 = finder0.new Visitor(annotationFinder_InfoBuildingVisitor0);
      FieldVisitor fieldVisitor0 = finder_Visitor0.visitField(21, "Zjxj;Kwb5S*-_", "Zjxj;Kwb5S*-_", "Zjxj;Kwb5S*-_", (Object) null);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      URL[] uRLArray0 = new URL[2];
      ClasspathArchive classpathArchive0 = new ClasspathArchive(classLoader0, uRLArray0);
      Finder finder0 = new Finder(classpathArchive0);
      InputStream inputStream0 = classpathArchive0.getBytecode("org.apache.commons.weaver.Finder$AnnotationCapturer$2");
      finder0.readClassDef(inputStream0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Archive> class0 = Archive.class;
      Stream<String> stream0 = Stream.empty();
      Supplier<Stream<String>> supplier0 = (Supplier<Stream<String>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(stream0).when(supplier0).get();
      Stream<Archive> stream1 = Finder.typed(class0, supplier0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<ClassesArchive> class0 = ClassesArchive.class;
      MetaAnnotatedClass<ClassesArchive> metaAnnotatedClass0 = new MetaAnnotatedClass<ClassesArchive>(class0);
      ClassLoader classLoader0 = metaAnnotatedClass0.getClassLoader();
      MockFile mockFile0 = new MockFile("%s(arg%s)");
      FileArchive fileArchive0 = new FileArchive(classLoader0, mockFile0, "org.apache.commons.weaver.Finder$IncludesClassfile");
      Finder finder0 = new Finder(fileArchive0);
      Class<Archive> class1 = Archive.class;
      Type type0 = Type.getType(class1);
      Class<?> class2 = finder0.toClass(type0);
      assertFalse(class2.isArray());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UnaryOperator<AnnotationFinder.MethodInfo> unaryOperator0 = UnaryOperator.identity();
      Predicate<AnnotationFinder.MethodInfo> predicate0 = Finder.isCtor((Function<? super AnnotationFinder.MethodInfo, AnnotationFinder.MethodInfo>) unaryOperator0);
      assertNotNull(predicate0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      Predicate<Annotated<?>> predicate0 = Finder.hasAnnotation(class0);
      assertNotNull(predicate0);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      Supplier<Stream<Method>> supplier0 = (Supplier<Stream<Method>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      // Undeclared exception!
      try { 
        Finder.typed(class0, supplier0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.weaver.Finder", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      MetaAnnotatedConstructor<Archive>[] metaAnnotatedConstructorArray0 = (MetaAnnotatedConstructor<Archive>[]) Array.newInstance(MetaAnnotatedConstructor.class, 0);
      Stream<MetaAnnotatedConstructor<Archive>> stream0 = Stream.of(metaAnnotatedConstructorArray0);
      Predicate<Object> predicate0 = Predicate.isEqual((Object) class0);
      stream0.noneMatch(predicate0);
      Supplier<Stream<MetaAnnotatedConstructor<Archive>>> supplier0 = (Supplier<Stream<MetaAnnotatedConstructor<Archive>>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(stream0).when(supplier0).get();
      // Undeclared exception!
      try { 
        Finder.typed(class0, supplier0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
         //
         // stream has already been operated upon or closed
         //
         verifyException("java.util.stream.AbstractPipeline", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MockThread mockThread0 = new MockThread();
      ClassLoader classLoader0 = mockThread0.getContextClassLoader();
      ArrayList<URL> arrayList0 = new ArrayList<URL>(151);
      ClasspathArchive classpathArchive0 = new ClasspathArchive(classLoader0, arrayList0);
      Finder finder0 = new Finder(classpathArchive0);
      Type type0 = Type.VOID_TYPE;
      // Undeclared exception!
      try { 
        finder0.toClass(type0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: Class 'void.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.weaver.Finder", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Class<WeaveInterest>[] classArray0 = (Class<WeaveInterest>[]) Array.newInstance(Class.class, 9);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      ClassFilter classFilter0 = new ClassFilter(">`");
      IncludeExcludeFilter includeExcludeFilter0 = new IncludeExcludeFilter(classFilter0, classFilter0);
      FilteredArchive filteredArchive0 = new FilteredArchive(classesArchive0, includeExcludeFilter0);
      Finder finder0 = new Finder(filteredArchive0);
      // Undeclared exception!
      try { 
        finder0.toClass((Type) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.weaver.Finder", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<WeaveInterest>[] classArray0 = (Class<WeaveInterest>[]) Array.newInstance(Class.class, 8);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      Type type0 = Type.getObjectType("org.apache.xbean.finder.archive.BundleArchive");
      // Undeclared exception!
      try { 
        finder0.toClass(type0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<AnnotationFinder.MethodInfo>[] classArray0 = (Class<AnnotationFinder.MethodInfo>[]) Array.newInstance(Class.class, 8);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      Type type0 = Type.getMethodType("AI|n(\"B8;BbejJq\"<y");
      // Undeclared exception!
      try { 
        finder0.toClass(type0);
        fail("Expecting exception: AssertionError");
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Package>[] classArray0 = (Class<Package>[]) Array.newInstance(Class.class, 2);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      // Undeclared exception!
      try { 
        finder0.scan((ScanRequest) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.weaver.Finder", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      URL uRL0 = MockURL.getFileExample();
      FileArchive fileArchive0 = new FileArchive(classLoader0, uRL0, "");
      Finder finder0 = new Finder(fileArchive0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        finder0.readClassDef(dataInputStream0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockThread mockThread0 = new MockThread("b34@+*Q>+JI:5y@i{U");
      ClassLoader classLoader0 = mockThread0.getContextClassLoader();
      TreeSet<URL> treeSet0 = new TreeSet<URL>();
      PriorityQueue<URL> priorityQueue0 = new PriorityQueue<URL>((SortedSet<? extends URL>) treeSet0);
      ClasspathArchive classpathArchive0 = new ClasspathArchive(classLoader0, priorityQueue0);
      Finder finder0 = new Finder(classpathArchive0);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        finder0.readClassDef(sequenceInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      LinkedHashSet<URL> linkedHashSet0 = new LinkedHashSet<URL>(82, 82);
      List<Archive> list0 = ClasspathArchive.archives(classLoader0, (Iterable<URL>) linkedHashSet0);
      CompositeArchive compositeArchive0 = new CompositeArchive(list0);
      Finder finder0 = new Finder(compositeArchive0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        finder0.readClassDef(pipedInputStream0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      URL[] uRLArray0 = new URL[4];
      Class<MetaAnnotatedField> class0 = MetaAnnotatedField.class;
      MetaAnnotatedClass<MetaAnnotatedField> metaAnnotatedClass0 = new MetaAnnotatedClass<MetaAnnotatedField>(class0);
      URL uRL0 = metaAnnotatedClass0.getResource("");
      uRLArray0[0] = uRL0;
      ClasspathArchive classpathArchive0 = new ClasspathArchive((ClassLoader) null, uRLArray0);
      Finder finder0 = new Finder(classpathArchive0);
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Finder finder0 = null;
      try {
        finder0 = new Finder((Archive) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xbean.finder.AnnotationFinder", e);
      }
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<ClassesArchive>[] classArray0 = (Class<ClassesArchive>[]) Array.newInstance(Class.class, 1);
      Class<ClassesArchive> class0 = ClassesArchive.class;
      classArray0[0] = class0;
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      assertFalse(finder0.hasMetaAnnotations());
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      File file0 = MockFile.createTempFile("XV/GffJ6", "AX/ 1FZ^+%");
      FileArchive fileArchive0 = new FileArchive(classLoader0, file0);
      Finder finder0 = new Finder(fileArchive0);
      Finder.WithAnnotations finder_WithAnnotations0 = finder0.withAnnotations();
      Class<Annotation> class0 = Annotation.class;
      List<Annotated<Constructor<?>>> list0 = finder_WithAnnotations0.findAnnotatedConstructors(class0);
      assertTrue(list0.isEmpty());
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      File file0 = MockFile.createTempFile("file", (String) null);
      FileArchive fileArchive0 = new FileArchive(classLoader0, file0, "file");
      ContainsFilter containsFilter0 = new ContainsFilter("file");
      ExcludeIncludeFilter excludeIncludeFilter0 = new ExcludeIncludeFilter(containsFilter0, containsFilter0);
      FilteredArchive filteredArchive0 = new FilteredArchive(fileArchive0, excludeIncludeFilter0);
      Finder finder0 = new Finder(filteredArchive0);
      Finder.WithAnnotations finder_WithAnnotations0 = finder0.withAnnotations();
      Class<Annotation> class0 = Annotation.class;
      List<Annotated<Parameter<Constructor<?>>>> list0 = finder_WithAnnotations0.findAnnotatedConstructorParameters(class0);
      assertTrue(list0.isEmpty());
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      File file0 = MockFile.createTempFile("XV/GffJ6", "AX/ 1FZ^+%");
      FileArchive fileArchive0 = new FileArchive(classLoader0, file0);
      Finder finder0 = new Finder(fileArchive0);
      Finder.WithAnnotations finder_WithAnnotations0 = finder0.withAnnotations();
      Class<Annotation> class0 = Annotation.class;
      List<Annotated<Package>> list0 = finder_WithAnnotations0.findAnnotatedPackages(class0);
      assertEquals(1, list0.size());
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      File file0 = MockFile.createTempFile("file", (String) null);
      FileArchive fileArchive0 = new FileArchive(classLoader0, file0, "file");
      ContainsFilter containsFilter0 = new ContainsFilter("file");
      ExcludeIncludeFilter excludeIncludeFilter0 = new ExcludeIncludeFilter(containsFilter0, containsFilter0);
      FilteredArchive filteredArchive0 = new FilteredArchive(fileArchive0, excludeIncludeFilter0);
      Finder finder0 = new Finder(filteredArchive0);
      Finder.WithAnnotations finder_WithAnnotations0 = finder0.withAnnotations();
      List<Annotated<Class<?>>> list0 = finder_WithAnnotations0.getAllClasses();
      assertTrue(list0.isEmpty());
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Stack<URL> stack0 = new Stack<URL>();
      ClasspathArchive classpathArchive0 = new ClasspathArchive(classLoader0, stack0);
      Finder finder0 = new Finder(classpathArchive0);
      Finder.WithAnnotations finder_WithAnnotations0 = finder0.withAnnotations();
      Class<Annotation> class0 = Annotation.class;
      List<Annotated<Parameter<Method>>> list0 = finder_WithAnnotations0.findAnnotatedMethodParameters(class0);
      assertEquals(1, list0.size());
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Annotation>[] classArray0 = (Class<Annotation>[]) Array.newInstance(Class.class, 1);
      Class<Annotation> class0 = Annotation.class;
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      Finder.WithAnnotations finder_WithAnnotations0 = finder0.withAnnotations();
      List<Annotated<Class<?>>> list0 = finder_WithAnnotations0.findAnnotatedClasses(class0);
      assertTrue(list0.isEmpty());
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<WeaveInterest>[] classArray0 = (Class<WeaveInterest>[]) Array.newInstance(Class.class, 5);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      Finder.WithAnnotations finder_WithAnnotations0 = finder0.withAnnotations();
      Class<Annotation> class0 = Annotation.class;
      List<Annotated<Method>> list0 = finder_WithAnnotations0.findAnnotatedMethods(class0);
      assertEquals(1, list0.size());
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      File file0 = MockFile.createTempFile("file", (String) null);
      FileArchive fileArchive0 = new FileArchive(classLoader0, file0, "file");
      ContainsFilter containsFilter0 = new ContainsFilter("file");
      ExcludeIncludeFilter excludeIncludeFilter0 = new ExcludeIncludeFilter(containsFilter0, containsFilter0);
      FilteredArchive filteredArchive0 = new FilteredArchive(fileArchive0, excludeIncludeFilter0);
      Finder finder0 = new Finder(filteredArchive0);
      Type type0 = Type.getObjectType("[`/mx~");
      // Undeclared exception!
      try { 
        finder0.toClass(type0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xbean.asm6.Type", e);
      }
  }
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<AnnotationFinder.MethodInfo>[] classArray0 = (Class<AnnotationFinder.MethodInfo>[]) Array.newInstance(Class.class, 8);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      Type type0 = Type.getObjectType("org.apache.commons.weaver.Finder$Visitor$1");
      Class<?> class0 = finder0.toClass(type0);
      ;
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      ScanRequest scanRequest0 = new ScanRequest();
      Class<Annotation> class0 = Annotation.class;
      ElementType elementType0 = ElementType.TYPE_PARAMETER;
      WeaveInterest weaveInterest0 = WeaveInterest.of(class0, elementType0);
      ScanRequest scanRequest1 = scanRequest0.add(weaveInterest0);
      ScanResult scanResult0 = finder0.scan(scanRequest1);
      ;
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      ScanRequest scanRequest0 = new ScanRequest();
      Class<Annotation> class0 = Annotation.class;
      ElementType elementType0 = ElementType.FIELD;
      WeaveInterest weaveInterest0 = WeaveInterest.of(class0, elementType0);
      scanRequest0.add(weaveInterest0);
      ScanResult scanResult0 = finder0.scan(scanRequest0);
      ;
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      File file0 = MockFile.createTempFile("file", "file");
      FileArchive fileArchive0 = new FileArchive(classLoader0, file0, "file");
      ContainsFilter containsFilter0 = new ContainsFilter("file");
      ExcludeIncludeFilter excludeIncludeFilter0 = new ExcludeIncludeFilter(containsFilter0, containsFilter0);
      FilteredArchive filteredArchive0 = new FilteredArchive(fileArchive0, excludeIncludeFilter0);
      Finder finder0 = new Finder(filteredArchive0);
      ScanRequest scanRequest0 = new ScanRequest();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      ScanRequest scanRequest1 = scanRequest0.addSupertypes(classArray0);
      ScanResult scanResult0 = finder0.scan(scanRequest1);
      ;
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      URL[] uRLArray0 = new URL[2];
      ClasspathArchive classpathArchive0 = new ClasspathArchive(classLoader0, uRLArray0);
      Finder finder0 = new Finder(classpathArchive0);
      Finder.WithAnnotations finder_WithAnnotations0 = finder0.withAnnotations();
      Class<Annotation> class0 = Annotation.class;
      List<Annotated<Class<?>>> list0 = finder_WithAnnotations0.findAssignableTypes(class0);
      assertTrue(list0.isEmpty());
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      URL[] uRLArray0 = new URL[2];
      ClasspathArchive classpathArchive0 = new ClasspathArchive(classLoader0, uRLArray0);
      Finder finder0 = new Finder(classpathArchive0);
      Finder.WithAnnotations finder_WithAnnotations0 = finder0.withAnnotations();
      Class<AnnotationFinder.MethodInfo> class0 = AnnotationFinder.MethodInfo.class;
      List<Annotated<Class<?>>> list0 = finder_WithAnnotations0.findAssignableTypes(class0);
      assertEquals(1, list0.size());
}
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<WeaveInterest>[] classArray0 = (Class<WeaveInterest>[]) Array.newInstance(Class.class, 1);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      Class<Annotation> class0 = Annotation.class;
      ElementType elementType0 = ElementType.METHOD;
      WeaveInterest weaveInterest0 = WeaveInterest.of(class0, elementType0);
      String[] stringArray0 = new String[1];
      AnnotationFinder.ClassInfo annotationFinder_ClassInfo0 = finder0.new ClassInfo(weaveInterest0.annotationType);
      AnnotationFinder.InfoBuildingVisitor annotationFinder_InfoBuildingVisitor0 = finder0.new InfoBuildingVisitor(annotationFinder_ClassInfo0);
      Finder.Visitor finder_Visitor0 = finder0.new Visitor(annotationFinder_InfoBuildingVisitor0);
      MethodVisitor methodVisitor0 = finder_Visitor0.visitMethod((-3483), "", "", "", stringArray0);
      assertEquals(finder0, methodVisitor0);
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      File file0 = MockFile.createTempFile("file", "file");
      FileArchive fileArchive0 = new FileArchive(classLoader0, file0, "file");
      ContainsFilter containsFilter0 = new ContainsFilter("file");
      ExcludeIncludeFilter excludeIncludeFilter0 = new ExcludeIncludeFilter(containsFilter0, containsFilter0);
      FilteredArchive filteredArchive0 = new FilteredArchive(fileArchive0, excludeIncludeFilter0);
      Finder finder0 = new Finder(filteredArchive0);
      Finder.Visitor finder_Visitor0 = finder0.new Visitor((AnnotationFinder.InfoBuildingVisitor) null);
      AnnotationVisitor annotationVisitor0 = finder_Visitor0.visitAnnotation((String) null, true);
      assertEquals(finder0, annotationVisitor0);
}
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 3);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      Finder.Visitor finder_Visitor0 = finder0.new Visitor((AnnotationFinder.InfoBuildingVisitor) null);
      // Undeclared exception!
      try { 
        finder_Visitor0.visitAnnotation("Array element ", false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.weaver.Finder$Visitor", e);
      }
  }
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<AnnotationFinder.MethodInfo>[] classArray0 = (Class<AnnotationFinder.MethodInfo>[]) Array.newInstance(Class.class, 8);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      Class<Package> class0 = Package.class;
      AnnotationFinder.ClassInfo annotationFinder_ClassInfo0 = finder0.new ClassInfo(class0);
      AnnotationFinder.InfoBuildingVisitor annotationFinder_InfoBuildingVisitor0 = finder0.new InfoBuildingVisitor(annotationFinder_ClassInfo0);
      Finder.Visitor finder_Visitor0 = finder0.new Visitor(annotationFinder_InfoBuildingVisitor0);
      String[] stringArray0 = new String[5];
      MethodVisitor methodVisitor0 = finder_Visitor0.visitMethod(23, "org.apache.commons.weaver.Finder$Visitor$1", "org.apache.commons.weaver.Finder$Visitor$1", "org.apache.commons.weaver.Finder$Visitor$1", stringArray0);
      assertEquals(finder0, methodVisitor0);
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 3);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      ScanRequest scanRequest0 = new ScanRequest();
      Class<Annotation> class0 = Annotation.class;
      ElementType elementType0 = ElementType.TYPE;
      WeaveInterest weaveInterest0 = WeaveInterest.of(class0, elementType0);
      scanRequest0.add(weaveInterest0);
      ScanResult scanResult0 = finder0.scan(scanRequest0);
      ;
}
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<WeaveInterest>[] classArray0 = (Class<WeaveInterest>[]) Array.newInstance(Class.class, 8);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      ScanRequest scanRequest0 = new ScanRequest();
      Class<Annotation> class0 = Annotation.class;
      ElementType elementType0 = ElementType.PACKAGE;
      WeaveInterest weaveInterest0 = WeaveInterest.of(class0, elementType0);
      ScanRequest scanRequest1 = scanRequest0.add(weaveInterest0);
      ScanResult scanResult0 = finder0.scan(scanRequest1);
      ;
}
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<WeaveInterest>[] classArray0 = (Class<WeaveInterest>[]) Array.newInstance(Class.class, 8);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      ScanRequest scanRequest0 = new ScanRequest();
      Class<Annotation> class0 = Annotation.class;
      ElementType elementType0 = ElementType.CONSTRUCTOR;
      WeaveInterest weaveInterest0 = WeaveInterest.of(class0, elementType0);
      ScanRequest scanRequest1 = scanRequest0.add(weaveInterest0);
      ScanResult scanResult0 = finder0.scan(scanRequest1);
      ;
}
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 3);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      ScanRequest scanRequest0 = new ScanRequest();
      Class<Annotation> class0 = Annotation.class;
      ElementType elementType0 = ElementType.METHOD;
      WeaveInterest weaveInterest0 = WeaveInterest.of(class0, elementType0);
      ScanRequest scanRequest1 = scanRequest0.add(weaveInterest0);
      ScanResult scanResult0 = finder0.scan(scanRequest1);
      ;
}
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 3);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      ScanRequest scanRequest0 = new ScanRequest();
      Class<Annotation> class0 = Annotation.class;
      ElementType elementType0 = ElementType.PARAMETER;
      WeaveInterest weaveInterest0 = WeaveInterest.of(class0, elementType0);
      ScanRequest scanRequest1 = scanRequest0.add(weaveInterest0);
      ScanResult scanResult0 = finder0.scan(scanRequest1);
      ;
}
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Class<AnnotationFinder.MethodInfo>[] classArray0 = (Class<AnnotationFinder.MethodInfo>[]) Array.newInstance(Class.class, 8);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        finder0.select((Iterable<String>) linkedList0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.weaver.Finder", e);
      }
  }
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Class<WeaveInterest>[] classArray0 = (Class<WeaveInterest>[]) Array.newInstance(Class.class, 8);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      String[] stringArray0 = new String[18];
      // Undeclared exception!
      try { 
        finder0.select(stringArray0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.weaver.Finder", e);
      }
  }
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Class<WeaveInterest>[] classArray0 = (Class<WeaveInterest>[]) Array.newInstance(Class.class, 0);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      // Undeclared exception!
      try { 
        finder0.select(classArray0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.weaver.Finder", e);
      }
  }
 @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 3);
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      Class<Annotation> class0 = Annotation.class;
      Finder.WithAnnotations finder_WithAnnotations0 = finder0.withAnnotations();
      List<Annotated<Field>> list0 = finder_WithAnnotations0.findAnnotatedFields(class0);
      assertTrue(list0.isEmpty());
}
 @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Class<AnnotationFinder.MethodInfo>[] classArray0 = (Class<AnnotationFinder.MethodInfo>[]) Array.newInstance(Class.class, 8);
      Class<AnnotationFinder.MethodInfo> class0 = AnnotationFinder.MethodInfo.class;
      classArray0[1] = class0;
      ClassesArchive classesArchive0 = new ClassesArchive(classArray0);
      Finder finder0 = new Finder(classesArchive0);
      ScanRequest scanRequest0 = new ScanRequest();
      ScanResult scanResult0 = finder0.scan(scanRequest0);
      ;
}
}
