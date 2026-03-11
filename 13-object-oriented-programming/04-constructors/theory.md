# Constructors in Java

A constructor is a **special method used to initialize objects**.

It is automatically called when an object is created.

## Key Characteristics

- The constructor name must be the **same as the class name**
- It **does not have a return type**
- It is called automatically when using `new`

Example:

```java
class Student {

    String name;

    Student() {
        name = "Unknown";
    }
}
```
When an object is created:

```java
Student s = new Student();
```
The constructor runs automatically.

## Types of Constructors

1. Default Constructor
2. Parameterized Constructor
3. Constructor Overloading
4. Constructor Chaining

## Why Constructors?

Constructors help to:
- Initialize object data
- Ensure objects start with valid values
- Reduce repetitive code