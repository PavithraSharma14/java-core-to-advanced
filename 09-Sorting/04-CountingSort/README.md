# Counting Sort

## 📌 Definition
Counting Sort is a non-comparison based sorting algorithm that sorts elements by counting the number of occurrences of each value.

---

## 💡 Algorithm Idea
- Find the maximum element in the array
- Create a count array of size (max + 1)
- Count the occurrences of each element
- Reconstruct the original array using the count array

---

## ⏱️ Time Complexity
| Case        | Complexity |
|------------|------------|
| Best Case  | O(n + k)   |
| Average    | O(n + k)   |
| Worst Case | O(n + k)   |

Where:
- `n` = number of elements
- `k` = range of input values (max element)

---

## 🧮 Space Complexity
- **O(n + k)** (Not in-place)

---

## 🔒 Stability
- **Not Stable** (in this basic implementation)

---

## ⚠️ Constraints & Limitations
- Works only for **non-negative integers**
- Requires a **known and reasonable range**
- Inefficient when the range (`k`) is very large compared to `n`

---

## 📍 Characteristics
- Faster than comparison-based sorts when range is small
- Commonly used as a building block for Radix Sort

---

## 🧪 Example
Input:
# Counting Sort

## 📌 Definition
Counting Sort is a non-comparison based sorting algorithm that sorts elements by counting the number of occurrences of each value.

---

## 💡 Algorithm Idea
- Find the maximum element in the array
- Create a count array of size (max + 1)
- Count the occurrences of each element
- Reconstruct the original array using the count array

---

## ⏱️ Time Complexity
| Case        | Complexity |
|------------|------------|
| Best Case  | O(n + k)   |
| Average    | O(n + k)   |
| Worst Case | O(n + k)   |

Where:
- `n` = number of elements
- `k` = range of input values (max element)

---

## 🧮 Space Complexity
- **O(n + k)** (Not in-place)

---

## 🔒 Stability
- **Not Stable** (in this basic implementation)

---

## ⚠️ Constraints & Limitations
- Works only for **non-negative integers**
- Requires a **known and reasonable range**
- Inefficient when the range (`k`) is very large compared to `n`

---

## 📍 Characteristics
- Faster than comparison-based sorts when range is small
- Commonly used as a building block for Radix Sort

---

## 🧪 Example
Input:
[4, 2, 2, 8, 3, 3, 1]

Output:
[1, 2, 2, 3, 3, 4, 8]