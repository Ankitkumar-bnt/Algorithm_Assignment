# 🧮 Fibonacci Number at Nth Position (Java)

This Java console application prints the **Fibonacci number at a specific position/index** provided by the user.

---

## 📘 What is the Fibonacci Series?

The Fibonacci series is a sequence where each number is the sum of the two preceding ones. It starts like this:

Index: 0 1 2 3 4 5 6 7 8 ...
Series: 1, 1, 2, 3, 5, 8, 13, 21 ...

yaml
Copy
Edit

So:
- `fib(0) = 0`
- `fib(1) = 1`
- `fib(5) = 5`
- `fib(7) = 13`

---

## 🎯 Program Goal

Given an integer `n`, the program prints the **Fibonacci number at index `n`**.

---

## 📂 Project Structure

src/main/java/com/fibonacci/
└── FibonacciByPosition.java

yaml
Copy
Edit

---

## ⚙️ How It Works

1. Prompts the user to enter a **position** (non-negative integer).
2. Calculates the Fibonacci number at that exact index using iterative logic.
3. Prints the result.

---

## 🧪 Sample Input/Output

Enter position:
5
Fibonacci number at position 5: 5

Enter position:
7
Fibonacci number at position 7: 13

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

```bash
javac src/main/java/com/fibonacci/FibonacciByPosition.java
📍 Step 2: Run
bash
Copy
Edit
java com.fibonacci.FibonacciByPosition
💡 Ensure your terminal is at the project root and the package path matches.

📎 Requirements
Java JDK 8 or higher

Terminal or Java IDE like Eclipse or IntelliJ IDEA

