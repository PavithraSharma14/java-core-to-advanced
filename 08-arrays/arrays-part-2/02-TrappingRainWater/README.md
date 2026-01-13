# Trapping Rain Water

This problem calculates how much water can be trapped between bars of different heights after raining.

It is a classic problem to test:
- Array traversal
- Preprocessing
- Space vs time optimization

---

## 📌 Problem Statement
Given an array `height[]` representing the height of bars, find the total amount of rain water that can be trapped.

---

## 🧠 Approach Used (Optimal)

### Left Max & Right Max Arrays
- Precompute the maximum height to the left of each bar
- Precompute the maximum height to the right of each bar
- Water trapped at index `i`:
  water[i] = min(leftMax[i], rightMax[i]) - height[i]

---

## ⏱️ Time & Space Complexity

| Approach | Time | Space |
|--------|------|-------|
| Left & Right Max | O(n) | O(n) |

---

## 📂 Files
02-TrappingRainWater/<br>
├── TrappingRainWater.java<br>
└── README.md<br>

---

## 🎯 Key Insight
Water trapped depends on the **shorter boundary** between left and right bars, not the current bar itself.