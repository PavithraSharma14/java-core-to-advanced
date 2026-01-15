# Selection Sort

## 📌 Definition
Selection Sort is a comparison-based sorting algorithm that repeatedly selects the smallest element from the unsorted portion of the array and places it at the beginning.

---

## 💡 Algorithm Idea
- Divide the array into sorted and unsorted parts
- Find the minimum element in the unsorted part
- Swap it with the first element of the unsorted part
- Repeat until the array is sorted

---

## ⏱️ Time Complexity
| Case        | Complexity |
|------------|------------|
| Best Case  | O(n²)      |
| Average    | O(n²)      |
| Worst Case | O(n²)      |

> Time complexity remains the same in all cases because Selection Sort always scans the unsorted part completely.

---

## 🧮 Space Complexity
- **O(1)** (In-place sorting)

---

## 🔒 Stability
- **Not Stable**
  
Swapping the minimum element can change the relative order of equal elements.

---

## 📍 Characteristics
- Simple to understand
- Performs fewer swaps compared to Bubble Sort
- Inefficient for large datasets

---

## 🧪 Example
Input:
[64, 25, 12, 22, 11]

Output:
[11, 12, 22, 25, 64]