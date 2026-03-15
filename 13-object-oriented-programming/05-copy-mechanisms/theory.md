# Copy Mechanisms in Java

## 1. Copy Constructor
A copy constructor creates a new object by copying the values of another object.

Example:
Student s2 = new Student(s1);

## 2. Shallow Copy
Only copies object references.
Both objects share the same internal objects.

Problem:
Changes in one object may affect the other.

## 3. Deep Copy
Creates completely independent objects.
All internal objects are copied as well.

Benefit:
Changes in one object will not affect the other.