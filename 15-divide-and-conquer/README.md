# 📘 Divide and Conquer (Folder 15)

## 🧠 Overview
Divide and Conquer is a problem-solving paradigm where a problem is:
1. Divided into smaller subproblems  
2. Solved recursively  
3. Combined to get the final result  

This approach is efficient for sorting, searching, and optimization problems.

---

## 📌 Topics Covered

### 🔹 Sorting Algorithms
- Merge Sort (Basic Implementation)
- Merge Sort (Space Optimized)
- Quick Sort

### 🔹 Searching Technique
- Search in Sorted and Rotated Array

### 🔹 Analysis
- Worst Case Analysis of Quick Sort

### 🔹 Practice Problems
- Additional problems  

---

## ⚡ Time & Space Complexity

| Algorithm   | Best Case   | Average Case | Worst Case  | Space Complexity |
|------------|------------|-------------|-------------|------------------|
| Merge Sort | O(n log n) | O(n log n)  | O(n log n)  | O(n)             |
| Quick Sort | O(n log n) | O(n log n)  | O(n^2)      | O(log n)         |

---

## 🔍 Key Concepts

### ✅ Merge Sort
- Stable sorting algorithm  
- Uses extra space for merging  
- Guaranteed O(n log n) performance  

### ✅ Quick Sort
- In-place sorting algorithm  
- Faster in practice  
- Performance depends on pivot selection  

### ⚠️ Worst Case in Quick Sort
Occurs when:
- Array is already sorted  
- Pivot is always smallest or largest  

Result:
- Time Complexity becomes O(n^2)  

Optimization:
- Random pivot  
- Median-of-three  

---

## 🔁 Search in Rotated Sorted Array
- Uses modified binary search  
- One half of the array is always sorted  
- Time Complexity: O(log n)  

---

## 🧪 Practice Focus
- Strengthen recursion + divide and conquer thinking  
- Improve problem-solving skills  
- Understand optimization techniques  

---

## 🚨 Important Notes
- Merge Sort is stable, Quick Sort is not  
- Merge Sort uses extra memory, Quick Sort is in-place  
- Algorithm choice depends on constraints  

---

## 📂 File Structure

```
15_divide_and_conquer/
├── MergeSortBasic.java
├── MergeSortOptimized.java
├── QuickSort.java
├── SearchInRotatedSortedArray.java
├── PracticeProblems.java
└── README.md
```

---

## 🎯 Goal
- Build strong understanding of Divide and Conquer  
- Write clean and optimized code  
- Prepare for interview-level problems  

---

## 📌 Final Takeaway
Divide and Conquer is about breaking complex problems into smaller parts and solving them efficiently.