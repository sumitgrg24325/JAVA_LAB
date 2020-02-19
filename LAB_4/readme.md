# LAB 4: EXCEPTION HANDELING AND PACKAGE IN JAVA

# THEORY:

## EXCEPTION HANDELING

The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that normal flow of the application can be maintained.

Exception is an abnormal condition.In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.

## TYPES OF EXCEPTION IN JAVA

* Checked Exception :-
The classes which directly inherit Throwable class except RuntimeException and Error are known as checked exceptions e.g. IOException, SQLException etc. Checked exceptions are checked at compile-time.

* Unchecked Exception :-
The classes which inherit RuntimeException are known as unchecked exceptions e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.

* Error :-
Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.

## Java Exception Keywords
There are 5 keywords which are used in handling exceptions in Java.

Keyword | Description
------------ | ------------
try | The "try" keyword is used to specify a block where we should place exception code. The try block must be followed by either catch or finally. It means, we can't use try block alone. 
catch | The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.
finally | The "finally" block is used to execute the important code of the program. It is executed whether an exception is handled or not.
throw | The "throw" keyword is used to throw an exception.
throws | The "throws" keyword is used to declare exceptions. It doesn't throw an exception. It specifies that there may occur an exception in the method. It is always used with method signature.

## Example
```javascript
public class ExcepTest {

   public static void main(String args[]) {
      int a[] = new int[2];
      try {
         System.out.println("Access element three :" + a[3]);
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown  :" + e);
      }finally {
         a[0] = 6;
         System.out.println("First element value: " + a[0]);
      }
   }
}
```
### Output:
* Exception thrown  :java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
* First element value: 6

## PACKAGE

A java package is a group of similar types of classes, interfaces and sub-packages.

Package in java can be categorized in two form:

* Built-in Packages :-
These packages consist of a large number of classes which are a part of Java API.Some of the commonly used built-in packages are:
1) java.lang: Contains language support classes(e.g classed which defines primitive data types, math operations). This package is automatically imported.
2)  java.io: Contains classed for supporting input / output operations.
3)  java.util: Contains utility classes which implement data structures like Linked List, Dictionary and support ; for Date / Time operations.
4)  java.applet: Contains classes for creating Applets.
5)  java.awt: Contain classes for implementing the components for graphical user interfaces (like button , ;menus etc).
6)  java.net: Contain classes for supporting networking operations.

* User-defined packages :-
These are the packages that are defined by the user. First we create a directory myPackage (name should be same as the name of the package). Then create the MyClass inside the directory with the first statement being the package names.

## Advantages of Java Package
* Java package is used to categorize the classes and interfaces so that they can be easily maintained.

* Java package provides access protection.

* Java package removes naming collision.

## Example
Here the two packages named package_name and package_one are the packages used in our program.
* Package one
```javascript
   //package one
package package_name; 
  
public class ClassOne { 
    public void methodClassOne() { 
        System.out.println("Hello there its ClassOne"); 
    } 
} 
```
* Package two
```javascript
  //package two
package package_one; 
  
public class ClassTwo { 
    public void methodClassTwo(){ 
        System.out.println("Hello there i am ClassTwo"); 
    }     
} 
```
* Final program
```javascript
import package_one.ClassTwo; 
import package_name.ClassOne; 
  
public class Testing { 
    public static void main(String[] args){ 
        ClassTwo a = new ClassTwo(); 
        ClassOne b = new ClassOne(); 
        a.methodClassTwo(); 
        b.methodClassOne(); 
    } 
} 
```

### Output:
* Hello there i am ClassTwo
* Hello there its ClassOne