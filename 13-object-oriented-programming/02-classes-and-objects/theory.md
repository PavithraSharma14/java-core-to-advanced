# Classes and Objects

Classes and Objects form the foundation of Object-Oriented Programming.

Understanding this topic clearly is essential before moving to constructors, encapsulation, inheritance, or polymorphism.

---

## 1. What is a Class?

A class is a blueprint or template used to create objects.

It defines:

- State (fields / variables)
- Behavior (methods)

A class does not occupy memory for data until objects are created.

Example:

    class Student {
        String name;
        int age;

        void study() {
            System.out.println("Studying...");
        }
    }

Here, Student is a blueprint.

---

## 2. What is an Object?

An object is an instance of a class.

It represents a real-world entity and contains actual data.

When we create an object, memory is allocated in the heap.

Example:

    Student s1 = new Student();

In this line:

- Student → Class
- s1 → Reference variable
- new → Allocates memory in heap
- Student() → Constructor call

---

## 3. How Object Creation Works (Step-by-Step)

Consider:

    Student s1 = new Student();

Step 1: Memory is allocated in the heap  
Step 2: Constructor initializes the object  
Step 3: Reference variable (s1) stores the memory address  
Step 4: Object can now access fields and methods  

---

## 4. Accessing Fields and Methods

We use the dot operator (.) to access members.

Example:

    s1.name = "Pavithra";
    s1.age = 21;
    s1.study();

---

## 5. Multiple Objects

Each object has its own copy of instance variables.

Example:

    Student s1 = new Student();
    Student s2 = new Student();

Here:

- s1 and s2 are different objects
- They store data independently
- Changing s1 does not affect s2

---

## 6. Real-World Analogy

Class → Blueprint of a House  
Object → Actual House Built from Blueprint  

Class → Template  
Object → Real Implementation  

---

## 7. Key Terminology

Class → Blueprint  
Object → Instance  
Reference → Variable storing object address  
Instance Variables → Variables inside class  
Instance Methods → Methods inside class  

---

## 8. Memory Overview (High-Level)

In Java:

- Objects are stored in Heap Memory
- Reference variables are stored in Stack Memory
- Class metadata is stored in Method Area

Understanding this helps in debugging and advanced OOP topics.

---

## 9. Common Beginner Mistakes

- Thinking class occupies memory for data
- Confusing reference with object
- Believing multiple references mean multiple objects
- Forgetting that objects are created using "new"

---

## 10. Why This Topic is Important

Classes and Objects are the base for:

- Constructors
- Encapsulation
- Inheritance
- Polymorphism
- Design Patterns
- System Design

Without mastering this, advanced OOP concepts become confusing.