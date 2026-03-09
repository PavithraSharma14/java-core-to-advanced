# Encapsulation in Java

Encapsulation is the concept of **wrapping data (variables) and code (methods) together in a single unit**.

In Java, encapsulation is achieved using:
- **Classes**
- **Access modifiers**
- **Getter and Setter methods**

The main goal of encapsulation is **data hiding**.

Instead of accessing variables directly, we access them through **methods**.

## Why Encapsulation?

Encapsulation helps to:

- Protect data from unauthorized access
- Control how data is modified
- Improve code maintainability
- Increase security

## Example (Without Encapsulation)

```java
class Student {
    String name;
    int age;
}

```
Here variables are **publicly accessible,** which is not safe.

## Example (With Encapsulation)

```java 
class Student {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

```

Now the data is **controlled through methods.**

## Key Points

- Variables are usually private
- Methods are public
- Access happens through getters and setters