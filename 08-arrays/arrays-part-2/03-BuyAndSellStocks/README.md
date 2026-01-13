# Buy and Sell Stocks (Single Transaction)

This problem focuses on finding the **maximum profit** that can be achieved by buying and selling a stock **only once**.

It tests:
- Greedy approach
- Single-pass optimization
- Real-world problem modeling

---

## 📌 Problem Statement
Given an array `prices[]` where `prices[i]` represents the stock price on day `i`, find the maximum profit possible by choosing **one day to buy** and **a later day to sell**.

Return `0` if no profit is possible.

---

## 🧠 Approach Used (Greedy)

- Track the minimum price seen so far
- At each day, calculate potential profit
- Update maximum profit accordingly

---

## ⏱️ Time & Space Complexity

| Approach | Time | Space |
|--------|------|-------|
| Greedy (Single Pass) | O(n) | O(1) |

---

## 📂 Files

03-BuyAndSellStocks/<br>
├── BuyAndSellStocks.java<br>
└── README.md<br>

---

## 🎯 Key Insight
Maximum profit is achieved by buying at the **lowest price before selling**, not by checking all pairs.

