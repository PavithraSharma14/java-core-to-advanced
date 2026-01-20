# 2D Arrays (Two-Dimensional Arrays)

## 📌 Introduction
A **2D Array** is a data structure that stores elements in a tabular form consisting of
rows and columns. Each element is accessed using two indices:
- Row index
- Column index

2D arrays are commonly used to represent matrices, grids, and board-based data structures.

---

## 🌍 Real-Life Examples
- Mathematical matrices
- Chessboard and board games
- Image representation (pixels as rows × columns)
- Seating arrangements
- Spreadsheet data

---

## 🧠 Representation of 2D Arrays
A 2D array with `m` rows and `n` columns is represented as:

```java
int[][] matrix = new int[m][n];
```

Accessing an element:

```java
matrix[row][column];
```

Example:

```java
matrix[1][2]; // element at 2nd row and 3rd column
```
---

## 🛠️ Creation of 2D Arrays

## Declaration

```java
int[][] arr;
```

## Initialization

```java
int[][] arr = new int[3][4];
```

## Declaration + Initialization

```java
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

---

## ⌨️ Input and Output

Input and output operations on a 2D array are performed using nested loops.
  - Outer loop → rows
  - Inner loop → columns
This ensures traversal of all elements in the matrix.

---

## 🔍 Searching in a 2D Array

Searching techniques include:
  - Linear search (checking every element)
  - Optimized search for sorted matrices
Time Complexity:
  - Linear search: O(rows × columns)
---

## 💾 2D Arrays in Memory

- Java stores 2D arrays in row-major order
- A 2D array is actually an array of arrays
- Each row is stored separately in memory

Example of a jagged array:

```java 
int[][] arr = new int[3][];
arr[0] = new int[2];
arr[1] = new int[3];
arr[2] = new int[4];
```

---

## 📐 Important 2D Array Problems
🔁 Spiral Matrix

- Traverses the matrix in spiral order
- Uses boundary variables to control traversal
- Time Complexity: O(rows × columns)
- Space Complexity: O(1) (excluding output)

➕ Diagonal Sum

- Calculates sum of primary and secondary diagonals
- Avoids double counting the middle element
- Time Complexity: O(n)

🔎 Search in Sorted Matrix

- Matrix sorted row-wise and column-wise
- Efficient search starting from top-right or bottom-left
- Time Complexity: O(rows + columns)

---

## 🧪 Practice Questions

Practice problems are included to reinforce learning.

Location:
practice-questions/
├── questions.md
└── solutions/

Covered problems:
- Spiral Matrix
- Diagonal Sum
- Search in Sorted Matrix

---

## 🎯 Goal of This Module

To develop a strong foundation in matrix-based problem solving, which is essential
for interviews and advanced topics like dynamic programming and graph algorithms.

