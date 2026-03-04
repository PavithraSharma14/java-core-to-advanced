# Memory Model in Java (Classes and Objects)

Understanding memory allocation is essential for mastering Object-Oriented Programming in Java.

Most confusion around objects comes from not understanding how memory works.

---

## 1. Overview of Java Memory Areas

Java primarily uses three important memory regions:

1. Stack Memory
2. Heap Memory
3. Method Area (Class Area)

---

## 2. Stack Memory

Stack memory stores:

- Local variables
- Method calls
- Reference variables

Characteristics:

- Memory is allocated when a method is called
- Automatically cleared when method execution ends
- Faster access compared to heap

Example:

    Student s1 = new Student();

Here:
- s1 is stored in Stack
- It holds the reference (address) of the object

---

## 3. Heap Memory

Heap memory stores:

- Objects
- Instance variables

Characteristics:

- Memory allocated using "new"
- Shared across threads
- Garbage Collector cleans unused objects

Example:

    Student s1 = new Student();

Here:
- new Student() creates object in Heap
- Actual data like name and age is stored in Heap

---

## 4. Method Area (Class Area)

Method Area stores:

- Class metadata
- Method definitions
- Static variables

This area is created when the class is loaded into memory.

---

## 5. Step-by-Step Memory Flow

Consider:

    Student s1 = new Student();

Step 1:
Class Student is loaded into Method Area (if not already loaded)

Step 2:
Memory for object is allocated in Heap

Step 3:
Constructor initializes instance variables

Step 4:
Reference variable s1 in Stack stores heap address

---

## 6. Visual Representation (Conceptual)

Stack Memory:
    s1  →  0xABC123

Heap Memory:
    0xABC123:
        name = null
        age = 0

Method Area:
    Class Student definition

---

## 7. Multiple References Case

    Student s1 = new Student();
    Student s2 = s1;

Now:

- Only ONE object exists in Heap
- Both s1 and s2 point to same object
- Changing data using s1 affects s2

Example:

    s1.age = 25;
    System.out.println(s2.age);  // 25

---

## 8. Object Without Reference

    new Student();

Object is created in Heap but no reference stores its address.

This object becomes eligible for Garbage Collection.

---

## 9. Null Reference

    Student s1 = null;

- s1 does not point to any object
- Accessing s1.name causes NullPointerException

---

## 10. Why Memory Understanding is Important

Helps in:

- Debugging NullPointerException
- Understanding object sharing
- Avoiding memory leaks
- Preparing for interviews
- Mastering advanced topics like JVM internals