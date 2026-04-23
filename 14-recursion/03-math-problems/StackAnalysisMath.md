# 📊 Stack Analysis – Math Problems (Recursion)

This file explains how recursion works internally using the **call stack** for math-based problems.

---

## 1️⃣ Factorial

### Code Logic
factorial(n) = n * factorial(n-1)

### Example: n = 4

### Recursive Calls:
factorial(4)
→ 4 * factorial(3)
    → 3 * factorial(2)
        → 2 * factorial(1)
            → 1 * factorial(0)
                → return 1

### Stack Unwinding:
factorial(1) = 1  
factorial(2) = 2 * 1 = 2  
factorial(3) = 3 * 2 = 6  
factorial(4) = 4 * 6 = 24  

### Stack Flow:
Top → factorial(0)
       factorial(1)
       factorial(2)
       factorial(3)
Bottom → factorial(4)

### Insight:
- Multiplication happens during **backtracking**
- Classic example of recursion building results

---

## 2️⃣ Power of N (Basic)

### Code Logic
power(x, n) = x * power(x, n-1)

### Example: power(2, 3)

### Recursive Calls:
power(2,3)
→ 2 * power(2,2)
    → 2 * power(2,1)
        → 2 * power(2,0)
            → return 1

### Stack Unwinding:
power(2,1) = 2  
power(2,2) = 4  
power(2,3) = 8  

### Insight:
- Linear recursion
- Time Complexity = O(n)

---

## 3️⃣ Power Optimized (Divide & Conquer) ⭐

### Code Logic
Break problem into half:
power(x, n) = power(x, n/2)^2

### Example: power(2, 5)

### Recursive Calls:
power(2,5)
→ power(2,2)
    → power(2,1)
        → power(2,0) → return 1

### Stack Unwinding:
power(2,1) → 2  
power(2,2) → 4  
power(2,5) → 32  

### Insight:
- Height of recursion tree = log(n)
- Time Complexity = O(log n)
- Much faster than basic approach

---

## 4️⃣ Fibonacci Series (Printing)

### Code Logic
Each call generates next number

### Example: n = 5

### Calls:
printFibonacci(0,1)
→ prints 1
→ printFibonacci(1,1)
→ prints 2
→ printFibonacci(1,2)
→ prints 3 ...

### Insight:
- Tail-recursive style
- No heavy stack usage like nth Fibonacci

---

## 5️⃣ Nth Fibonacci (Naive) ⚠️

### Code Logic
fib(n) = fib(n-1) + fib(n-2)

### Example: fib(5)

### Recursive Tree:

            5
         /     \
       4         3
     /   \     /   \
    3     2   2     1
   / \   / \
  2   1 1   0

### Problem:
- Repeated calls (fib(3), fib(2))
- Exponential growth

### Complexity:
- Time: O(2^n)
- Space: O(n)

### Insight:
- Inefficient recursion
- Leads to need for **Dynamic Programming**

---

# 🧠 Key Takeaways

- Math recursion mostly computes results during **backtracking**
- Two approaches:
  - Linear recursion → O(n)
  - Divide & conquer → O(log n)
- Not all recursion is efficient (Fibonacci example)

---

# ⚠️ Common Mistakes

- Ignoring base case
- Not optimizing when possible
- Misunderstanding recursion tree growth

---

# 🚀 Final Thought

Understanding recursion is not about writing code—  
it's about visualizing the **stack and flow of execution**.