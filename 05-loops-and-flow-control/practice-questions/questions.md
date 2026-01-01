# Loops — Practice Questions

### Question 1
How many times will “Hello” be printed?

```java
public class Solution {
    public static void main(String args[]) {
        for(int i = 0; i < 5; i++) {
            System.out.println("Hello");
            i = i + 1;
        }
    }
}
```
### Question 2
Write a program that reads a set of integers and prints the sum of the even and odd integers separately.

### Question 3
Write a program to find the **factorial** of a number entered by the user.

**Hint:**
Factorial of n = n × (n−1) × (n−2) × … × 1
Example: 4! = 4 × 3 × 2 × 1 = 24

### Question 4
Write a program to print the multiplication table of a number N entered by the user.

### Question 5
What is wrong in the following program?

```java
public class Solution {
    public static void main(String args[]) {
        for(int i = 0; i < 5; i++ ) {
            System.out.println("i = " + i);
        }

        System.out.println("i after the loop = " + i);
    }
}
```