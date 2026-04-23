# 📊 Stack Analysis – Printing Problems (Recursion)

This file explains how recursion works internally using the **call stack** for printing-based problems.

---

## 1️⃣ Print Decreasing

### Code Logic
Print numbers from n → 1

### Example: n = 3

### Recursive Calls:
printDecreasing(3)
→ print 3
→ printDecreasing(2)
    → print 2
    → printDecreasing(1)
        → print 1
        → printDecreasing(0) → return

### Stack Flow:
Top → printDecreasing(0)
       printDecreasing(1)
       printDecreasing(2)
Bottom → printDecreasing(3)

### Output:
3 2 1

### Insight:
- Work is done **before** recursive call
- This is **pre-order execution**

---

## 2️⃣ Print Increasing

### Code Logic
Print numbers from 1 → n

### Example: n = 3

### Recursive Calls:
printIncreasing(3)
→ printIncreasing(2)
    → printIncreasing(1)
        → printIncreasing(0) → return
        → print 1
    → print 2
→ print 3

### Stack Flow:
Top → printIncreasing(0)
       printIncreasing(1)
       printIncreasing(2)
Bottom → printIncreasing(3)

### Output:
1 2 3

### Insight:
- Work is done **after** recursive call
- This is **post-order execution**

---

## 3️⃣ Print Increasing-Decreasing

### Code Logic
Print n → 1 → n

### Example: n = 3

### Recursive Calls:
printIncDec(3)
→ print 3
→ printIncDec(2)
    → print 2
    → printIncDec(1)
        → print 1
        → printIncDec(0) → return
        → print 1
    → print 2
→ print 3

### Output:
3 2 1 1 2 3

### Insight:
- Before call → going down the stack
- After call → coming back up
- Combines **pre-order + post-order**

---

## 4️⃣ Sum of N Natural Numbers

### Code Logic
sum(n) = n + sum(n-1)

### Example: n = 3

### Recursive Calls:
sum(3)
→ 3 + sum(2)
    → 2 + sum(1)
        → return 1

### Stack Unwinding:
sum(1) = 1  
sum(2) = 2 + 1 = 3  
sum(3) = 3 + 3 = 6  

### Stack Flow:
Top → sum(1)
       sum(2)
Bottom → sum(3)

### Output:
6

### Insight:
- Values are calculated during **backtracking**
- Recursive calls build up, results return step-by-step

---

# 🧠 Key Takeaways

- Recursion uses **call stack (LIFO)**
- Two phases:
  - Going down → function calls
  - Coming up → result computation
- Placement of logic defines behavior:
  - Before call → Pre-order
  - After call → Post-order

---

# ⚠️ Common Mistakes

- Missing base case → infinite recursion
- Wrong placement of print statements
- Not understanding stack flow → leads to bugs

---

# 🚀 Final Thought

If you can trace the stack manually,  
you truly understand recursion.