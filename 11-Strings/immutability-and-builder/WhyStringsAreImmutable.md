# Why Strings Are Immutable in Java

In Java, a String object cannot be changed once it is created.
Any operation that seems to modify a string actually creates
a new String object.

---

## 1. What is Immutability?

Immutability means the object's value cannot be changed after creation.

```java
String s = "Java";
s = s + " Programming";
```
Here, a new String object is created.
The original "Java" string remains unchanged.

## 2. Reasons for String Immutability

🔹 Security
Strings are widely used for sensitive data such as:
  - usernames
  - passwords
  - database URLs

If strings were mutable, they could be changed accidentally or maliciously.

🔹 String Pool Optimization

Java stores string literals in a String Pool.
Immutability allows safe sharing of these objects,
which saves memory.

🔹 Thread Safety

Immutable objects are inherently thread-safe.
Multiple threads can access strings without synchronization.

🔹 Hashcode Caching

Strings are frequently used as keys in HashMap.
Immutability ensures hashcodes remain consistent.

## 3. Proof of Immutability

```java
String a = "hello";
String b = a;

a = a + " world";

System.out.println(a); // hello world
System.out.println(b); // hello
```
b is not affected when a changes.

## 4. Conclusion

String immutability improves:

  - security
  - performance
  - reliability

This is why Java designers chose immutability for Strings.
