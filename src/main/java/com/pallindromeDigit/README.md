# 🔁 Palindrome Number Checker (Java)

A simple Java console application to check whether a given integer number is a **palindrome** — a number that reads the same backward as forward.

---

## 📘 What is a Palindrome Number?

A **palindrome number** is a number that remains unchanged when its digits are reversed.

### ✅ Examples:
- `4567654` → Palindrome ✅  
- `1234578` → Not a Palindrome ❌

---

## 📂 Project Structure

src/main/java/com
└── pallindromeDigit/
└── PallindromeDigit.java

yaml
Copy
Edit

---

## ⚙️ How It Works

1. Prompts the user to **enter an integer**.
2. Reverses the entered number using logic.
3. Compares the original and reversed number.
4. Prints:
   - `"yes"` if it's a palindrome
   - `"no"` otherwise

---

## 🧪 Sample Input/Output

Enter number:
123321
yes

Enter number:
123456
no

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root, then run:

```bash
javac evaluationassignment/checkPalindromeNumber/CheckPalindromeNumber.java
📍 Step 2: Run
bash
Copy
Edit
java evaluationassignment.checkPalindromeNumber.CheckPalindromeNumber
💡 Ensure that the directory structure matches the package declaration.

📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
