# 📊 Stack Analysis – String Problems (Recursion)

---

## 1️⃣ Remove Duplicates

### Problem
Remove duplicate characters from a string while preserving order.

Example: "appnnacollege"  
Output: "apncoleg"

---

## 🔁 Recursive Flow

removeDuplicates("appnnacollege", 0)

→ 'a' → not visited → add  
→ 'p' → not visited → add  
→ 'p' → already visited → skip  
→ 'n' → add  
→ 'n' → skip  
→ 'a' → skip  
→ 'c' → add  
→ 'o' → add  
→ 'l' → add  
→ 'l' → skip  
→ 'e' → add  
→ 'g' → add  
→ 'e' → skip  

---

## 📦 Stack Behavior

Each call processes **one character**:

removeDuplicates(index = 0)
→ removeDuplicates(index = 1)
→ removeDuplicates(index = 2)
→ ...
→ removeDuplicates(index = n) → base case

Then stack unwinds (no heavy computation during return)

---

## 🧠 Key Insight

- This is **forward recursion**
- Work is done while going down the stack
- No major computation during backtracking

---

## ⚠️ Important Concepts

### 1. String Immutability
- Strings cannot be modified
- Using `StringBuilder` avoids creating new objects repeatedly

---

### 2. Boolean Map
- Tracks visited characters
- `map[char - 'a']` → constant time lookup

---

## ❌ Common Mistakes

- Using String concatenation → inefficient
- Not tracking visited characters
- Forgetting base case

---

## 🚀 Final Thought

This problem is simple in logic but tests:
- recursion flow
- memory usage
- optimization thinking