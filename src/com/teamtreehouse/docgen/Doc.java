package com.teamtreehouse.docgen;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(/*we can leave out "value = ..." only if it's exactly "value". this is the shorthand*/ RetentionPolicy.RUNTIME /*if the annotation has elements we could pass the following: something = "stuff", somethingElse = "things", etc. */)
@Target({ElementType.TYPE, ElementType.METHOD})

//Declare elements


  

public @interface Doc {
//this is different from an "interface" using an "implements keyword.  its a declared annotation
//specify the retention of the annotation: source, class, runtime
 

    /** Description of class or method */
  
  String desc() default "";

    /** Description of parameters, if annotated element is a method & has parameters */

  String[] params() default {};
  
    /** Description of return value, if annotated element is a method & isn't void */
  
  String returnVal() default "";
}





/* PRACTICE:---------------------------------------------

(1) In LiveTweet.java below, declare an annotation named LiveTweet. This could hypothetically be used to send a Tweet every time a method executes.

(2) Add a retention policy so that this annotation will be available to the JVM during run-time. In doing this, you'll need to import Retention and RetentionPolicy.

(3) Continuing our LiveTweet annotation, let's now allow it to be used only on classes and methods. Add the @Target annotation with the appropriate ElementTypes. And, don't forget to import Target and ElementType.

(4) Add two elements to the LiveTweet annotation:
username, declared as a String. Set its default to an empty String.
hashtags, declared as a String array. Set its default to an empty array.

**********************************************

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})

public @interface LiveTweet {
  String username() default "";
  String[] hashtags() default {};
  
}

**********************************************

*/

/* MORE PRACTICE:

-------------------------------------------------
(1) In the Test.java file, declare an annotation named Test with a run-time retention policy, and that can only be applied to methods. Don't add any elements to the annotation yet - we'll do that in the next task.

(2) In the Test annotation, add two elements, named whatever you like, and having any valid return type that you like. Be sure to specify defaults for both elements.

(3) Apply the @Test annotation to exactly three methods of the SocialNetworkTest class, specifying values for both elements in each of the three annotations (that is, don't rely on the element defaults).

(4) In the TestAnalyzer class, implement (complete) the getNumAnnotatedMethods method. The details of how it should function are given in the comment above the method.


---> Test.java:

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface Test {

 
  
  String desc() default "";



  String[] params() default {};
  

  
  String returnVal() default "";
  
}

---> SocialNetwork.java:

public class SocialNetworkTest {
  
   @Test (
    desc = "Displays the test Tweet",
    params = {"String of text, string of text"},
    returnVal = "post uploaded")
  
  public void testTweet() {
    
  }
  
  public void testInsta() { 
    
  }
 @Test (
    desc = "Displays the test Facebook post",
    params = {"String of text, string of text"},
    returnVal = "post visible")
  
  public void testFacebook() { 
    
  }

   @Test (
    desc = "Displays the test Pinterest post",
    params = {"String of text, string of text"},
     returnVal = "post successful")
  
  public void testPinterest() { 
    
  }

  public void testSnapchat() { 
    
  }
}

---> TestAnalyzer.java:

import java.lang.reflect.Method;

public class TestAnalyzer {
  /* Counts the number of methods in the class given by `clazz` that have been annotated
   *  with the @Test annotation.
   
  public static int getNumAnnotatedMethods(Class<?> clazz) {
    int count = 0;  
    //we imported the method below at the top of this file:
    //Below, we get all declared methods of the class:
    Method[] methods = clazz.getDeclaredMethods();
    
    //Here we use a for-each loop to count the methods that have @Test annotation:
    for (Method method : methods) {
      if (method.isAnnotationPresent(Test.class)) {
        count++;
  }
}
    return count;
    
  }
}

*/

//----------------------------------------------------------
  
/* Answer to remember:

-When applying an annotation, which of the following best describes which elements must be listed?

-Elements without default values.

-Separate element name/value pairs with a comma

-Private methods don't need annotating

*/


/* Method of Reflection/Introspection:

Write code to examine/modify structure and behavior of objects' annotations & classes.

Reflection can be used to examine AND modify the structure of objects at run-time. (TRUE)

Instance of Method class include:
  -getParameterCount()
  -getReturnType()
  -getName()
  
  does NOT include: isPrivate();

*/

