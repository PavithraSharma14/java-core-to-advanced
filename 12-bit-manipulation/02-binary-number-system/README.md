# Binary Number System

Computers store numbers in binary (base-2),
using only two digits: 0 and 1.

Each position in a binary number represents a power of 2.

Example:
Decimal 13 → Binary 1101

= (1 × 2³) + (1 × 2²) + (0 × 2¹) + (1 × 2⁰)

---

## How Decimal to Binary Conversion Works

To convert a decimal number to binary:
1. Divide the number by 2
2. Store the remainder (0 or 1)
3. Repeat with the quotient
4. Read remainders from bottom to top

This process forms the binary representation.

---

## Least Significant Bit (LSB)

- The rightmost bit is called the LSB
- It represents 2⁰
- LSB determines whether a number is odd or even

Example:
- LSB = 1 → odd
- LSB = 0 → even

---

## Relation to Bitwise Operations

- Left shift (<<) moves bits left → multiplies by 2
- Right shift (>>) moves bits right → divides by 2
- Bitwise operators work directly on binary digits

Understanding binary is essential to reason about bit manipulation problems.
