# 📊 Stack Analysis – Array Problems (Recursion)

---

## 1️⃣ Check Sorted Array

Example: [1,2,3]

isSorted(0)
→ check 1 < 2
→ isSorted(1)
    → check 2 < 3
    → isSorted(2) → true

### Insight:
- Stops early if condition fails
- Simple forward recursion

---

## 2️⃣ First Occurrence

Example: [2,4,3,4], key=4

firstOcc(0)
→ not match
→ firstOcc(1)
    → match → return 1

### Insight:
- Returns immediately when found
- No need to traverse full array

---

## 3️⃣ Last Occurrence ⭐

Example: [2,4,3,4], key=4

lastOcc(0)
→ lastOcc(1)
    → lastOcc(2)
        → lastOcc(3)
            → lastOcc(4) → -1

Backtracking:
index 3 → match → return 3  
index 1 → ignored (already found later)

### Insight:
- Decision happens during **backtracking**
- This is key recursion pattern

---

## 4️⃣ All Occurrences

Example: [2,4,3,4,5], key=4

printAll(0)
→ skip
→ printAll(1)
    → print 1
→ printAll(3)
    → print 3

### Insight:
- Continues full traversal
- No early return

---

# 🧠 Key Takeaways

- Recursion with arrays requires index tracking
- Two major patterns:
  - Forward decision (first occurrence)
  - Backtracking decision (last occurrence)
- Understanding return values is critical

---

# 🚀 Final Thought

If you understand **last occurrence**,  
you understand **real recursion thinking**