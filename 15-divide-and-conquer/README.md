# 📘 Divide and Conquer (Folder 15)

## 🧠 Overview

Divide and Conquer is an algorithmic paradigm that solves a problem by:

1. **Dividing** the problem into smaller subproblems.
2. **Solving** each subproblem recursively.
3. **Combining** the solutions to obtain the final result.

This approach significantly improves efficiency for many sorting, searching, and optimization problems.

---

## 📌 Topics Covered

### 🔹 Sorting Algorithms
- Merge Sort (Basic Implementation)
- Merge Sort (Space Optimized)
- Quick Sort

### 🔹 Searching Algorithm
- Search in Rotated Sorted Array

### 🔹 Algorithm Analysis
- Worst Case Analysis of Quick Sort
- Pivot Selection Strategies

### 🔹 Interview Practice Problems
- Merge Sort for Strings
- Majority Element (Divide and Conquer)
- Inversion Count

---

## ⚡ Time & Space Complexity

| Algorithm | Best Case | Average Case | Worst Case | Space Complexity |
|-----------|-----------|--------------|-------------|------------------|
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) |

---

## 🔍 Key Concepts

### ✅ Merge Sort
- Divide and Conquer based sorting algorithm.
- Stable sorting algorithm.
- Uses additional memory during merging.
- Guarantees O(n log n) performance in all cases.

### ✅ Space Optimized Merge Sort
- Reuses a single temporary array.
- Reduces repeated memory allocation.
- Improves practical performance while maintaining the same complexity.

### ✅ Quick Sort
- Divide and Conquer based sorting algorithm.
- In-place sorting algorithm.
- Faster than Merge Sort in most practical scenarios.
- Performance depends on pivot selection.
- Not a stable sorting algorithm.

### ⚠️ Worst Case in Quick Sort

Occurs when:
- The array is already sorted.
- The array is reverse sorted.
- The smallest or largest element is repeatedly chosen as the pivot.

Result:
- Time Complexity becomes **O(n²)**.

Common Optimizations:
- Random Pivot Selection
- Median of Three Pivot

---

## 🔁 Search in Rotated Sorted Array

Uses a modified Binary Search approach.

Key idea:
- At least one half of the array is always sorted.
- Determine the sorted half.
- Check whether the target lies within that range.
- Continue searching only in the relevant half.

Time Complexity: **O(log n)**

---

## 🧪 Practice Problems

| Problem | Difficulty | Approach |
|----------|------------|----------|
| Merge Sort for Strings | 🟢 Easy | Merge Sort |
| Majority Element | 🟡 Medium | Divide and Conquer |
| Inversion Count | 🔴 Hard | Merge Sort + Divide and Conquer |

---

## 🚨 Important Notes

- Merge Sort is **Stable**.
- Quick Sort is **Not Stable**.
- Merge Sort requires extra memory.
- Quick Sort sorts the array in-place.
- Choosing an appropriate algorithm depends on problem constraints, memory usage, and expected input.

---

## 📂 File Structure

```text
15_divide_and_conquer/
├── README.md
├── MergeSortBasic.java
├── MergeSortOptimized.java
├── QuickSort.java
├── SearchInRotatedSortedArray.java
├── MergeSortStrings.java
├── MajorityElement.java
└── InversionCount.java
```

---

## 📖 What You'll Learn

By completing this folder, you will learn how to:

- Apply the Divide and Conquer paradigm effectively.
- Implement Merge Sort from scratch.
- Optimize Merge Sort using a reusable temporary array.
- Understand Quick Sort and its partitioning strategy.
- Analyze the worst-case behavior of Quick Sort.
- Perform efficient searching in a rotated sorted array.
- Solve interview-level Divide and Conquer problems.
- Count inversions efficiently using Merge Sort.
- Compare algorithms based on time and space complexity.

---

## 🎯 Learning Outcome

After completing this section, you will be able to:

- Identify problems suitable for Divide and Conquer.
- Design recursive solutions for complex problems.
- Analyze algorithm efficiency using time and space complexity.
- Solve common coding interview questions based on Divide and Conquer.
- Build a strong foundation for advanced algorithms.

---

## 📌 Final Takeaway

Divide and Conquer is one of the most powerful algorithmic paradigms. By recursively breaking complex problems into smaller, manageable subproblems and combining their solutions efficiently, it enables elegant and high-performance solutions to many real-world and interview-level problems.