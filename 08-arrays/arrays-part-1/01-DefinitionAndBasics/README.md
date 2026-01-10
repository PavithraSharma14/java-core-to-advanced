# 01 – Array Definition & Basics in Java

## What is an Array?
An **array** in Java is a data structure that stores multiple values of the **same data type**
in a **contiguous memory location** and is accessed using an **index**.

- Array size is **fixed** once created
- Indexing starts from **0**
- Arrays store **homogeneous data only**

---

## Why Do We Need Arrays?
Without arrays, you would need separate variables for each value, which is:
- Hard to manage
- Not scalable
- Error-prone

Arrays solve this by grouping related data under a single variable name.

---

## Basic Syntax
```java
dataType[] arrayName = new dataType[size];
```
Example:

```java
int[] numbers = new int[5];
```
---

## Key Characteristics

- Arrays are objects in Java
- Stored in heap memory
- Default values are assigned automatically
  - int → 0
  - double → 0.0
  - boolean → false
  - String / objects → null
- Length is accessed using the length attribute, not a method

```java
System.out.println(numbers.length);
```
---

## Types of Array Declaration

```java
int[] a;      // Recommended
int a[];      // Valid but not preferred
```
---

## Accessing Array Elements

```java
numbers[0] = 10;
System.out.println(numbers[0]);
```
⚠️ Accessing an invalid index results in:

ArrayIndexOutOfBoundsException

---

## Important Notes

- Arrays in Java are call by value, but the value passed is the reference
- Size cannot be changed after creation
- Arrays are faster than collections but less flexible

---

## Files in This Folder

-  ArrayDefinition.java – Basic definition and length example

