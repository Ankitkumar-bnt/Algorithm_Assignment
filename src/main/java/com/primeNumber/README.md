# 🔢 Prime Number Checker (Java)

A simple Java console application that determines whether a given integer is a **prime number**.

---

## 📘 What is a Prime Number?

A **prime number** is a number greater than 1 that is divisible only by **1 and itself**.

### ✅ Examples:
- Prime: `2`, `3`, `5`, `7`, `11`, `13`, `17`
- Not Prime: `1`, `4`, `6`, `8`, `9`, `10`

---

## 🎯 Program Goal

Given an integer `n`, the program checks and prints whether `n` is a **prime number** or **not**.

---

## 📂 Project Structure

src/main/java/com/primeNumber/
└── Q1PrimeNumber.java

yaml
Copy
Edit

---

## ⚙️ How It Works

1. Prompts the user to enter an integer `n`.
2. Validates if `n` is greater than 1.
3. Checks if any number between `2` and `√n` divides `n`:
   - If yes → Not a Prime
   - If no → Prime
4. Prints the result.

---

## 🧪 Sample Input/Output

Enter number:
7
7 is a prime number.

Enter number:
9
9 is not a prime number.

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

```bash
javac src/main/java/com/primeNumber/Q1PrimeNumber.java
📍 Step 2: Run
bash
Copy
Edit
java com.primeNumber.Q1PrimeNumber
💡 Make sure your working directory is the project root and package paths are correct.

📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
