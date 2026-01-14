# Bubble Sort (Optimized)

## 📌 Definition
Bubble Sort is a simple comparison-based sorting algorithm where adjacent elements are repeatedly compared and swapped if they are in the wrong order.

After each pass, the largest element moves (bubbles) to the end of the array.

---

## 💡 Algorithm Idea
- Compare adjacent elements
- Swap if they are out of order
- Repeat for multiple passes
- Use a flag to detect if the array is already sorted

---

## ⚙️ Optimization (Best Case Handling)
If no swaps occur in a full pass, the array is already sorted and the algorithm terminates early.

This improves:
- Best case time complexity from **O(n²)** to **O(n)**

---

## ⏱️ Time Complexity
| Case        | Complexity |
|------------|------------|
| Best Case  | O(n)       |
| Average    | O(n²)      |
| Worst Case | O(n²)      |

---

## 🧮 Space Complexity
- **O(1)** (In-place sorting)

---

## 🔒 Stability
- **Stable** (relative order of equal elements is preserved)

---

## 📍 Characteristics
- Simple to understand
- Inefficient for large datasets
- Useful for learning sorting fundamentals

---

## 🧪 Example
Input:
[5, 1, 4, 2, 8]

Output:
[1, 2, 4, 5, 8]