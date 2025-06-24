# 🔁 Palindrome String Checker (Java)

A simple Java console application that checks whether a given **string** is a **palindrome** — a string that reads the same backward as forward.

---

## 📘 What is a Palindrome String?

A **palindrome string** is a sequence of characters that remains the same when reversed.

### ✅ Examples:
- `"madam"` → Palindrome ✅  
- `"hello"` → Not a Palindrome ❌

---

## 📂 Project Structure

src/main/java/com
└── pallindromeString/
└── PallindromeString.java

yaml
Copy
Edit

---

## ⚙️ How It Works

1. Prompts the user to **enter a string**.
2. Convert into character array.
3. Compares the in for loof from starting and ending at same time.
4. Prints:
   - `"yes"` if it’s a palindrome
   - `"no"` otherwise

---

## 🧪 Sample Input/Output

Enter string:
madam
yes

Enter string:
hello
no

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Navigate to the project root directory and run:

```bash
javac src/main/java/com/pallindromeString/PallindromeString.java
📍 Step 2: Run
bash
Copy
Edit
java com.pallindromeString.PallindromeString
💡 Make sure the directory structure matches the declared package.

📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)

