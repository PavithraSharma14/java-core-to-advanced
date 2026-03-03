# Introduction to Object-Oriented Programming (OOP)

## 1. What is Object-Oriented Programming?

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of objects.

An object represents a real-world entity that contains:

- State (data)
- Behavior (methods)

OOP focuses on modeling real-world systems rather than writing isolated functions.

---

## 2. Why OOP Exists

As programs grow larger, procedural programming becomes difficult to manage due to:

- Global state issues
- Tight coupling between functions
- Low scalability
- Poor reusability

OOP solves this by:

- Encapsulating data and behavior together
- Restricting direct access to data
- Encouraging modular design
- Supporting inheritance and polymorphism

---

## 3. Core Principles of OOP

1. Encapsulation
2. Abstraction
3. Inheritance
4. Polymorphism

These principles help in building scalable and maintainable systems.

---

## 4. Real-World Example

Consider a Banking System:

Instead of writing:

withdrawAmount(accountBalance);

We design:

Account.withdraw(amount);

Now the Account object manages its own behavior.

This improves clarity and control.

---

## 5. Key Terminology

- Class → Blueprint
- Object → Instance of a class
- Method → Behavior of object
- Field → State of object
- Constructor → Initializes object
- Reference → Variable that points to object in heap

---

## 6. Memory Perspective (High-Level)

In Java:

- Class metadata → Method Area
- Objects → Heap
- References → Stack

Understanding memory helps prevent confusion in advanced topics.

---

## 7. Advantages of OOP

- Code Reusability
- Maintainability
- Scalability
- Security via Encapsulation
- Better real-world modeling

---

## 8. Limitations of OOP

- Can introduce unnecessary complexity for small programs
- Improper design leads to tight coupling
- Learning curve is higher than procedural programming

---

## 9. When to Use OOP

OOP is ideal when:

- Building large applications
- Modeling real-world systems
- Working in teams
- Designing reusable libraries

---

## 10. What Comes Next

After this introduction, we will explore:

- Classes and Objects
- Encapsulation
- Constructors
- Inheritance
- Polymorphism
- Abstraction
- Interfaces
- Internals of Object class