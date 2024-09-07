# Java Access Modifiers: `private`, `protected`, and `public`

In Java, **access modifiers** are keywords that set the accessibility (visibility) of classes, methods, and variables. They control which parts of a program can access certain elements.

## Access Modifiers in Java

Here's a breakdown of each access modifier:

### 1. **`private`**

- **Visibility**: Only within the **same class**.
- **Use Case**: Typically used to **encapsulate** data, ensuring that it cannot be directly accessed from outside the class. You usually provide access to this data through **getters and setters**.

```java
class Person {
    private String name;  // Private attribute

    // Public getter to access the private attribute
    public String getName() {
        return name;
    }

    // Public setter to modify the private attribute
    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");  // Setting the private name via a public setter
        System.out.println(person.getName());  // Accessing the private name via a public getter
    }
}
```

In this example, the `name` attribute is **private**, meaning it cannot be accessed directly from outside the `Person` class. You must use the **public** getter and setter methods to access and modify it.

### 2. **`protected`**

- **Visibility**:
  - Within the **same class**.
  - Within the **same package**.
  - In **subclasses**, even if they are in **different packages**.
- **Use Case**: Used when you want to allow subclass access to methods or variables, but still restrict access from other classes in the package.

```java
class Animal {
    protected String sound;

    protected void makeSound() {
        System.out.println("The animal makes a sound: " + sound);
    }
}

class Dog extends Animal {
    public void bark() {
        sound = "Woof!";  // Can access the protected attribute from the parent class
        makeSound();      // Can call the protected method from the parent class
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.bark();  // Output: The animal makes a sound: Woof!
    }
}
```

In this example, the `sound` attribute and `makeSound()` method are **protected**, meaning they can be accessed from the `Dog` subclass, but they would not be accessible from outside the `Animal` class unless through inheritance.

### 3. **`public`**

- **Visibility**: Accessible **everywhere** — from any class, in any package.
- **Use Case**: Use it when you want to make methods or variables available to all other classes.

```java
class Car {
    public String model;

    public void drive() {
        System.out.println("Driving " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "Tesla Model 3";  // Accessing a public attribute
        car.drive();  // Calling a public method
    }
}
```

In this example, the `model` attribute and `drive()` method are **public**, meaning they can be accessed from any class, even from outside the `Car` class.

### 4. **Default (Package-Private)**

- **Visibility**: If no access modifier is specified, the method or variable is accessible from **within the same package** but **not accessible from outside the package**.
- **Use Case**: Useful for creating package-level access without exposing the class members to other packages.

```java
class Vehicle {
    String type;  // No access modifier, so it's package-private

    void drive() {  // No access modifier, so it's package-private
        System.out.println("Driving a " + type);
    }
}
```

In this case, both `type` and `drive()` are **package-private**, meaning they can only be accessed by other classes in the same package.

---

### Summary of Access Modifiers

| Modifier    | Class | Package | Subclass | World  |
|-------------|-------|---------|----------|--------|
| **private** | Yes   | No      | No       | No     |
| **protected**| Yes   | Yes     | Yes      | No     |
| **public**  | Yes   | Yes     | Yes      | Yes    |
| **default** (package-private) | Yes | Yes | No   | No     |

---

### Example Combining All Modifiers

```java
class Animal {
    private String name;  // Private: Only accessible within this class
    protected int age;    // Protected: Accessible within this class, its package, and subclasses
    public String type;   // Public: Accessible from anywhere

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    private void printName() {  // Private: Only accessible within this class
        System.out.println("Animal name is: " + name);
    }

    protected void printAge() {  // Protected: Accessible within subclass
        System.out.println("Animal age is: " + age);
    }

    public void printType() {  // Public: Accessible anywhere
        System.out.println("Animal type is: " + type);
    }
}

class Dog extends Animal {
    public Dog(String name, int age, String type) {
        super(name, age, type);
    }

    public void showDetails() {
        // printName(); // ERROR: Cannot access private method from parent class
        printAge();  // OK: Can access protected method from parent class
        printType(); // OK: Can access public method from parent class
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3, "Dog");
        // System.out.println(myDog.name); // ERROR: Cannot access private attribute
        System.out.println(myDog.age);    // OK: Can access protected attribute
        System.out.println(myDog.type);   // OK: Can access public attribute

        myDog.showDetails();  // Accesses protected and public methods
    }
}
```

### Key Points

- **`private`** is the most restrictive, and you need **getters/setters** to access private members from outside the class.
- **`protected`** allows access in subclasses and other classes in the same package.
- **`public`** is the least restrictive, allowing access from anywhere.
- **Default (package-private)** is package-level access, useful when you want access limited within a package but not to subclasses outside the package.
