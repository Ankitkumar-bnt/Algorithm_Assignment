# 🧮 Confussed Pappu – Reverse & Replace Logic (Java)

This Java console application simulates the logic of a confused character named "Pappu" who reverses digits and mistakenly replaces `6` with `9` during the reversal process. The program computes the difference between the final manipulated number and the original input.

---

## 📘 What Does the Program Do?

Given an integer amount:
1. Pappu **reverses the digits**, but every `6` is mistakenly read as `9`.
2. He then **reverses the result again** (without altering digits this time).
3. Finally, the program prints the **difference between this final value and the original number**.

---

## 🧠 Logic Summary

- If input = `106`
- First reverse (with `6 → 9`): `901`
- Second reverse (normal): `109`
- Difference: `109 - 106 = 3`

---

## 📂 Project Structure

src/main/java/com/confussedPappu/
└── ConfussedPappu.java

yaml
Copy
Edit

---

## ⚙️ How It Works

1. Prompts the user to **enter an integer amount**.
2. Validates if the input is a non-negative integer.
3. Applies two reversals:
   - First reversal: replaces `6` with `9`
   - Second reversal: standard reverse
4. Prints the **difference** between the final result and the original amount.

---

## 🧪 Sample Input/Output

Enter amount:
106
3

Enter amount:
69
30

Enter amount:
-10
Invalid input

Enter amount:
abc
Invalid input

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

```bash
javac src/main/java/com/confussedPappu/ConfussedPappu.java
📍 Step 2: Run
bash
Copy
Edit
java com.confussedPappu.ConfussedPappu
📎 Requirements
Java JDK 8 or higher

Terminal or Java IDE (e.g., Eclipse, IntelliJ IDEA)
