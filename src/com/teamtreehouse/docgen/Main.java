package com.teamtreehouse.docgen;

import com.teamtreehouse.math.MathUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
      
//TODO:  Process the MathUtils class annotations:
      
      
      DocProcessor.process(MathUtils.class);
      
      
/*/*

--------------COMMENTING OUT THE REFLECTION PRACTICE CODE ------
      //Get a class object
      
      Class<?> clazz = MathUtils.class;
        
        //"class" is a reserved keyword and can't be used as an identifier.  Hence the use of clazz reference.
        
        
        //Get all declared methods
        
        Method[] methods = clazz.getDeclaredMethods();/*versus calling clazz.getMethods() which returns all methods including inherited */
      //Loop over methods
      
//      for(Method m : methods) {
        
        //Display Method name
//        System.out.printf("name: %s%n", m.getName());
                          
        
        //Display parameter count
        
        
//        System.out.printf("\t# params: %s%n", m.getParameterCount());
        
        //Display return type as a line of formatted output
        
        
//        System.out.printf("\t return type: %s%n", m.getReturnType().getSimpleName());
        //Display modifiers
        
//        int mods = m.getModifiers();
//        String modStr = Modifier.toString(mods);
//        System.out.printf("\t modifiers: %s%n", modStr);
        
//use convenience class Modifier.toString(mods)
        
      }
        
        // TODO: Process the MathUtils class's annotations

 
// --------------COMMENTING OUT THE PRACTICE CODE ---


  
    }



/* How to compile & run in the console:

*************************************************

treehouse:~/workspace$ javac -d out -cp src src/com/
teamtreehouse/docgen/Main.java                      
                  
treehouse:~/workspace$ java -cp out com.teamtreehous
e.docgen.Main  

//returns not only declared but inherited methods
//call a method that returns only declared methods
//
*************************************************

*/


/* CHALLENGE:  

Code the getMethods method below, returning an array of only the declared methods of the clazz parameter. Don't forget to import the Method class.

Challenge Task 2 of 2

Code the getModifierString method below so that it returns a String representation of the given method's modifiers. For example, if a method has the signature public static void main(String[] args) then getModifierString would return "public static". Don't forget to add the import statement for the Modifier class.

---------------------------------

import java.lang.reflect.Method;


public class ReflectionUtils {
  // Task 1
  public static Method[] getMethods(Class<?> clazz) {
    
    return clazz.getDeclaredMethods();
  }

  // Task 2
  public static String getModifierString(Method method) {
    return Modifier.toString(method.getModifiers());  
  }
}


*/