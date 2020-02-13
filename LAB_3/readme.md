# LAB 3: TYPES OF VARIABLES, INHERITANCE AND ABSTRACT CLASS

# THEORY:

## VARIABLE

Variables are the name given to a memory location which hold the values while the program  is executed.

## TYPES OF VARIABLES

* Local Variable
A variable defined within a block or method or constructor is called local variable.

* Instance Variable
Instance variables are non-static variables and are declared in a class outside any method, constructor or block.These variables are created when an object of the class is created and destroyed when the object is destroyed.

* Static Variable
These variables are declared similarly as instance variables, the difference is that static variables are declared using the static keyword within a class outside any method constructor or block.
You can create a single copy of static variable and share among all the instances of the class.

### Implentation of types of Variables

```javascript
class variable{
	int data=43;//instance variable
	static int a=39;//static variable
	public void variables(){
	int b=42;//local variable
	System.out.println("local variable is : " + b);
    System.out.println("instance variable is : " + data);
    System.out.println("static variable is : " + a);
}
    public static void main(String[] args) {
    	variable obj = new variable();
    	obj.variables();
    }
}
```
### Output:
local variable is : 42
instance variable is : 43
static variable is: 39

## INHERITANCE IN JAVA

Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.

### SYNTAX

```javascript
class Subclass-name extends Superclass-name  
{  
   //methods and fields  
}  
```
## TYPES OF INHERITANCE

* Single Inheritance
* Multilevel Inheritance
* Hierarchical Inheritance
* Multiple Inheritance(It is not supported in java through class)
* Hybrid Inheritance

### Implentation of Single Inheritance
```javascript
class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class TestInheritance{  
public static void main(String args[]){  
Dog d=new Dog();  
d.bark();  
d.eat();  
}}  
```
### Output:
eating...
barking...

## ABSTRACT CLASS

A class which is declared with the abstract keyword is known as an abstract class in Java.
Abstract classes cannot be instantiated, but they can be subclassed.

An abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon).

### Example

```javascript
abstract class Bike{  
  abstract void run();  
}  
class Honda4 extends Bike{  
void run(){System.out.println("running safely");}  
public static void main(String args[]){  
 Bike obj = new Honda4();  
 obj.run();  
}  
}  
```
### Output:
running safely