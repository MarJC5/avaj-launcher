To add concepts of **attributes**, **getters**, **setters**, and **constructors** into your Java cheatsheet, I'll expand the relevant sections for classes and objects, and explain the importance of encapsulation through getters and setters.

Here's the updated cheatsheet with these concepts:

---

# Java Cheatsheet

Welcome to the Java cheatsheet! This guide will help you understand the basic syntax and concepts of Java as you learn the language.

## Table of Contents

- [Java Cheatsheet](#java-cheatsheet)
  - [Table of Contents](#table-of-contents)
  - [Getting Started](#getting-started)
  - [Basic Syntax](#basic-syntax)
    - [Hello World](#hello-world)
    - [Variables and Data Types](#variables-and-data-types)
      - [Common Data Types](#common-data-types)
    - [Operators](#operators)
  - [Control Structures](#control-structures)
    - [If-Else](#if-else)
    - [Switch](#switch)
    - [Loops](#loops)
      - [For Loop](#for-loop)
      - [While Loop](#while-loop)
      - [Do-While Loop](#do-while-loop)
  - [Methods](#methods)
    - [Defining and Calling a Method](#defining-and-calling-a-method)
    - [Method Parameters and Return Types](#method-parameters-and-return-types)
  - [Object-Oriented Programming (OOP)](#object-oriented-programming-oop)
    - [Classes and Objects](#classes-and-objects)
      - [Attributes, Getters, Setters](#attributes-getters-setters)
      - [Defining a Class and Creating an Object](#defining-a-class-and-creating-an-object)
    - [Constructors](#constructors)
    - [Inheritance](#inheritance)
    - [Polymorphism](#polymorphism)
  - [Additional Topics](#additional-topics)
  - [Helpful Resources](#helpful-resources)

---

## Getting Started

To write and run Java code, you'll need to install the Java Development Kit (JDK) and use a code editor like **Visual Studio Code**, **IntelliJ IDEA**, or **Eclipse**.

1. Download and install the [JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. Set up your editor or IDE.
3. Compile and run Java programs from the terminal with:

```bash
javac Main.java   # Compiles the program
java Main         # Runs the program
```

---

## Basic Syntax

### Hello World

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

This is the basic structure of a Java program. The `main` method is the entry point.

### Variables and Data Types

Java is statically typed, so you must declare a variable type before using it.

```java
int myNum = 5;            // Integer (whole number)
double myFloat = 5.99;    // Floating-point number
char myLetter = 'A';      // Character
boolean myBool = true;    // Boolean
String myText = "Hello";  // String
```

#### Common Data Types

- `int`: 4 bytes, stores whole numbers.
- `double`: 8 bytes, stores decimal numbers.
- `char`: 2 bytes, stores a single character (`'A'`, `'B'`, etc.).
- `boolean`: 1 bit, stores `true` or `false`.
- `String`: A class representing text (`"Hello"`).

### Operators

- **Arithmetic operators**: `+`, `-`, `*`, `/`, `%`
- **Comparison operators**: `==`, `!=`, `>`, `<`, `>=`, `<=`
- **Logical operators**: `&&` (and), `||` (or), `!` (not)

---

## Control Structures

### If-Else

```java
int x = 10;
if (x > 5) {
    System.out.println("x is greater than 5");
} else {
    System.out.println("x is less than or equal to 5");
}
```

### Switch

```java
int day = 2;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Unknown day");
}
```

### Loops

#### For Loop

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

#### While Loop

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

#### Do-While Loop

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

---

## Methods

Methods are functions that belong to a class.

### Defining and Calling a Method

```java
public class Main {
    public static void main(String[] args) {
        sayHello();  // Method call
    }

    public static void sayHello() {
        System.out.println("Hello from a method!");
    }
}
```

### Method Parameters and Return Types

```java
public class Main {
    public static void main(String[] args) {
        int result = addNumbers(5, 3); // Method call
        System.out.println(result);
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
```

---

## Object-Oriented Programming (OOP)

### Classes and Objects

A class is a blueprint for creating objects.

#### Attributes, Getters, Setters

Attributes (fields) store the state of an object. Getters and setters provide access to those attributes in an encapsulated way.

```java
class Person {
    private String name;   // Attribute
    private int age;       // Attribute

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}
```

- **Private**: The attributes `name` and `age` are private, meaning they can’t be accessed directly from outside the class.
- **Getters and Setters**: These public methods allow controlled access to the private attributes.

#### Defining a Class and Creating an Object

```java
class Dog {
    private String name;

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    public void bark() {
        System.out.println(name + " says woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();  // Create an object
        myDog.setName("Buddy"); // Set attribute using setter
        System.out.println(myDog.getName()); // Get attribute using getter
        myDog.bark();           // Call method
    }
}
```

### Constructors

A constructor initializes an object when it is created.

```java
class Dog {
    private String name;

    // Constructor
    public Dog(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void bark() {
        System.out.println(name + " says woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");  // Call constructor
        System.out.println(myDog.getName());
        myDog.bark();
    }
}
```

### Inheritance

One class can inherit attributes and methods from another class.

```java
class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();  // Output: Woof!
    }
}
```

### Polymorphism

Polymorphism allows you to treat objects of different classes that inherit from the same base class as if they were objects of the base class.

```java
class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();  // Polymorphism
        myAnimal.makeSound();  // Output: Woof!
    }
}
```

---

## Additional Topics

- **Arrays**:

```java
int[] myArray = {1, 2, 3, 4};
System.out.println(myArray[0]);  // Output: 1
```

- **Exception Handling**:

```java
try {
    int division = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Error: Division by zero.");
} finally {
    System.out.println("This will always execute.");
}
```

- **Comments**:
  - Single-line comment: `// This is a comment`
  - Multi-line comment: `/* This is a multi-line comment */`

---

## Helpful Resources

- [Official Java Documentation](https://docs.oracle.com/en/java/)
- [Java Tutorials](https://www.javatpoint.com/java-tutorial)
- [W3Schools Java](https://www.w3schools.com/java/)
