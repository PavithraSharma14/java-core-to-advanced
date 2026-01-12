# 04 – Passing Arrays to Methods

This section explains how arrays are passed to methods in Java
and clears the common confusion around call by value and reference.

---

## Topics Covered
- Passing arrays as method arguments
- Returning arrays from methods
- Call by value vs reference (Java reality)

---

## Key Truth (Very Important)
Java is strictly **call by value**.

When an array is passed to a method, a **copy of the reference**
(address) is passed. This is why changes inside the method
affect the original array.

Java does NOT support call by reference.

---

## Files in This Folder
- `PassArrayAsArgument.java`
- `ReturnArrayFromMethod.java`
- `CallByValueVsReference.java`

---

## Interview Warning
Saying “Java is call by reference” is WRONG and is a common
interview elimination mistake.
