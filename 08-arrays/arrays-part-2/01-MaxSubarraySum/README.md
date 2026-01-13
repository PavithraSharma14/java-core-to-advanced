# Maximum Subarray Sum

The Maximum Subarray Sum problem focuses on finding the **contiguous subarray** with the largest sum from a given integer array.

This problem is important because it demonstrates **optimization thinking** — moving from brute force to optimal solutions.

---

## 📌 Problem Statement
Given an integer array `arr[]`, find the maximum possible sum of a contiguous subarray.

---

## 🧠 Approaches Covered

### 1️⃣ Brute Force Approach
- Generate all possible subarrays
- Calculate sum for each subarray
- Track the maximum sum

📌 Used to understand the problem, **not for interviews**

---

### 2️⃣ Prefix Sum Optimization
- Precompute prefix sums
- Use them to calculate subarray sums efficiently
- Reduces one loop compared to brute force

📌 Shows improvement using extra space

---

### 3️⃣ Kadane’s Algorithm (Optimal)
- Uses dynamic programming idea
- Maintains current sum and maximum sum
- Resets current sum when it becomes negative

⚠️ Note:
Kadane’s Algorithm is implemented to correctly handle arrays with all negative elements by initializing sums with the first element instead of zero.

📌 **Most important interview solution**

---

## ⏱️ Time & Space Complexity Comparison

| Approach | Time Complexity | Space Complexity |
|-------|----------------|-----------------|
| Brute Force | O(n³) | O(1) |
| Prefix Sum | O(n²) | O(n) |
| Kadane’s Algorithm | O(n) | O(1) |

---

## 📂 Files in This Folder

01-MaxSubarraySum/<br>
├── MaxSubarrayBruteForce.java<br>
├── MaxSubarrayPrefixSum.java<br>
├── MaxSubarrayKadane.java<br>
└── README.md

---

## 🎯 Key Takeaways
- Always start with brute force to understand the problem
- Optimize step by step
- Kadane’s Algorithm is the expected interview answer

Mastering this problem builds confidence for many other array-based optimizations.
