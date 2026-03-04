# Procedural Programming vs Object-Oriented Programming

Understanding the difference between procedural and object-oriented programming is essential before learning deeper OOP concepts.

---

## 1. Procedural Programming

Procedural programming focuses on writing step-by-step instructions (procedures or functions).

### Characteristics

- Program divided into functions  
- Data and functions are separate  
- Often uses global variables  
- Follows a top-down design approach  

### Example

    double calculateArea(double length, double breadth) {
        return length * breadth;
    }

### Limitations

- Difficult to scale for large applications  
- High dependency between functions  
- Data security is weak  
- Maintenance becomes complex as code grows  

---

## 2. Object-Oriented Programming

Object-Oriented Programming (OOP) focuses on modeling real-world entities as objects.

Each object contains:

- State (fields)  
- Behavior (methods)  

### Characteristics

- Data and behavior are bundled together  
- Uses access modifiers for security  
- Encourages modular design  
- Follows bottom-up approach  

### Example

    class Rectangle {
        double length;
        double breadth;

        double calculateArea() {
            return length * breadth;
        }
    }

---

## 3. Key Differences

| Feature | Procedural Programming | Object-Oriented Programming |
|----------|-----------------------|----------------------------|
| Focus | Functions | Objects |
| Data Handling | Separate from functions | Encapsulated with methods |
| Security | Low | High |
| Scalability | Hard | Easier |
| Reusability | Limited | High |
| Design Approach | Top-down | Bottom-up |

---

## 4. Thinking Shift

Procedural Thinking:  
What steps should the program execute?

OOP Thinking:  
What objects exist in the system and what responsibilities do they have?

This shift in mindset is the foundation of mastering OOP.

---

## 5. When to Use Each

Procedural programming is suitable for:

- Small programs  
- Script-based tasks  
- Simple utilities  

OOP is suitable for:

- Large applications  
- Real-world modeling  
- Enterprise systems  
- Scalable software design  