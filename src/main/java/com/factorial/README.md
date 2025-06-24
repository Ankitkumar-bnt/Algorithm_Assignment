# ✳️ Factorial Calculator (Java)

A simple Java console application that calculates the **factorial** of a given non-negative integer.

---

## 📘 What is a Factorial?

The **factorial** of a number `n` (written as `n!`) is the product of all positive integers from `1` to `n`.

### ✅ Examples:
- `0! = 1` (by definition)
- `1! = 1`
- `5! = 5 × 4 × 3 × 2 × 1 = 120`
- `7! = 5040`

---

## 🎯 Program Goal

Given an integer `n`, the program prints `n!` — the **factorial of that number**.

---

## 📂 Project Structure

src/main/java/com/factorial/
└── FindFactorial.java

yaml
Copy
Edit

---

## ⚙️ How It Works

1. Prompts the user to enter a **non-negative integer**.
2. Validates the input.
3. Computes the factorial using an iterative loop (or optionally recursion).
4. Prints the result.

---

## 🧪 Sample Input/Output

Enter number:
5
Factorial of 5 is: 120

Enter number:
0
Factorial of 0 is: 1

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

```bash
javac src/main/java/com/factorial/FindFactorial.java
📍 Step 2: Run
bash
Copy
Edit
java com.factorial.FindFactorial
💡 Ensure you're in the project root directory and the package name matches the folder structure.

📎 Requirements
Java JDK 8 or higher

Terminal or any Java IDE (e.g., Eclipse, IntelliJ IDEA)
