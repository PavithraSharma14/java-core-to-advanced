# Bit Manipulation

Bit Manipulation is a technique of working directly with the binary
representation of numbers using bitwise operators.

It is widely used in:
- Data Structures & Algorithms
- Competitive Programming
- Low-level systems
- Performance optimizations
- Flags, permissions, and masks

This module focuses on **understanding**, not memorization.

---

## Binary Number System

- Computers store data in binary (base-2)
- Each digit is a **bit** (0 or 1)
- Positions represent powers of 2

Example:
Decimal 13  
Binary 1101  

= (1 × 2³) + (1 × 2²) + (0 × 2¹) + (1 × 2⁰)

---

## Bitwise Operators

| Operator | Name | Description |
|--------|------|-------------|
| `&` | AND | 1 if both bits are 1 |
| `|` | OR | 1 if at least one bit is 1 |
| `^` | XOR | 1 if bits are different |
| `~` | NOT | Inverts all bits |
| `<<` | Left Shift | Shifts bits left |
| `>>` | Right Shift | Arithmetic right shift |
| `>>>` | Unsigned Right Shift | Logical right shift |

---

## Common Bit Tricks

- Check odd/even: `n & 1`
- Power of 2: `n & (n - 1)`
- Remove lowest set bit: `n & (n - 1)`
- Multiply/divide by 2: `<<` and `>>`
- Fast exponentiation using bits

---

## Topics Covered

- Introduction to Bit Manipulation
- Binary Number System
- Bitwise Operators (AND, OR, XOR, NOT)
- Shift Operators (Left, Right)
- Basic Bit Operations
- Advanced Bit Masking
- Power of Two Check
- Count Set Bits
- Fast Exponentiation
- Practice Problems with Solutions

---

## Goal of This Module

The goal is not to solve problems blindly,
but to **understand why bit manipulation works**
and how it improves performance and clarity.

Every program in this module:
- Focuses on one concept
- Contains clear comments
- Avoids shortcut library methods
