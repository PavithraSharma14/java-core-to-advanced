# Insertion Sort

## 📌 Definition
Insertion Sort is a comparison-based sorting algorithm that builds the sorted array one element at a time by inserting each element into its correct position.

---

## 💡 Algorithm Idea
- Assume the first element is already sorted
- Pick the next element
- Shift larger elements to the right
- Insert the element at the correct position
- Repeat until the array is sorted

---

## ⏱️ Time Complexity
| Case        | Complexity |
|------------|------------|
| Best Case  | O(n)       |
| Average    | O(n²)      |
| Worst Case | O(n²)      |

> Best case occurs when the array is already sorted.

---

## 🧮 Space Complexity
- **O(1)** (In-place sorting)

---

## 🔒 Stability
- **Stable**
  
Insertion Sort preserves the relative order of equal elements.

---

## 📍 Characteristics
- Efficient for **nearly sorted arrays**
- Used in practice for small datasets
- Often used as part of advanced algorithms (e.g., TimSort)

---

## 🧪 Example
Input:
[8, 3, 5, 2, 4]

Output:
[2, 3, 4, 5, 8]

