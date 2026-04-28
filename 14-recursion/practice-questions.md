# 🧠 Recursion Practice Questions

---

## 🔹 Question 1: All Occurrences in Array

**Problem:**
Given an integer array of size N, find all the occurrences (indices) of a given element (key) and print them using recursion.

**Sample Input:**
arr = [3, 2, 4, 5, 6, 2, 7, 2, 2], key = 2  

**Sample Output:**
1 5 7 8  

---

## 🔹 Question 2: Number to English Words

**Problem:**
Given a number (e.g., 2019), convert it into its English representation using recursion.

**Sample Input:**
1947  

**Sample Output:**
"one nine four seven"

**Note:**
- Digits are in range 0–9  
- Last digit will not be 0  

---

## 🔹 Question 3: Length of String

**Problem:**
Write a program to find the length of a string using recursion.

---

## 🔹 Question 4: Count Substrings

**Problem:**
Given a string S, count all contiguous substrings that start and end with the same character.

**Sample Input 1:**
S = "abcab"  

**Sample Output 1:**
7  

**Explanation:**
Valid substrings: a, abca, b, bcab, c, a, b  

---

**Sample Input 2:**
S = "aba"  

**Sample Output 2:**
4  

---

## 🔹 Question 5: Tower of Hanoi (Important)

**Problem:**
You are given 3 towers and N disks of different sizes. The disks are initially placed on the first tower in ascending order (smallest on top).

Your task is to move all disks from source to destination following rules:

### Rules:
1. Only one disk can be moved at a time  
2. Only the top disk can be moved  
3. A larger disk cannot be placed on a smaller disk  

Let:
- Source = A  
- Helper = B  
- Destination = C  

---

### Example (N = 2):

Step 1: A → B  
Step 2: A → C  
Step 3: B → C  

---

### Example (N = 3):

Step 1: A → C  
Step 2: A → B  
Step 3: C → B  
Step 4: A → C  
Step 5: B → A  
Step 6: B → C  
Step 7: A → C  

---