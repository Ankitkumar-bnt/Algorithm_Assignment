# ✅ Good or Bad String Checker (Java)

A simple Java console application to determine whether a given **string** is "good" or "bad" based on specific rules for **vowels** and **consonants**.

---

## 📘 What is the Problem?

Given a string, classify it as:

✅ **Good** → Returns `1`  
❌ **Bad** → Returns `0`

### Rules:

- A string is **bad** if it contains:
  - **>5 consecutive vowels (or '?')**  
  - **>3 consecutive consonants (or '?')**  
- Otherwise, it's **good**.

✅ `'?'` can act as **either vowel or consonant**.

---

## ✅ Examples

- Input: `aeiouu`  
  Output: `0`  
  Explanation: 6 consecutive vowels.

- Input: `bcdfg`  
  Output: `0`  
  Explanation: 5 consecutive consonants.

- Input: `abcde`  
  Output: `1`  
  Explanation: No violations.

- Input: `a?e?i`  
  Output: `1`  
  Explanation: '?' can break sequences.

---

## 📂 Project Structure

src/main/java/com
└── goodOrBadString/
└── GoodOrBadString.java

yaml
Copy
Edit

---

## ⚙️ How It Works

1️⃣ Prompts the user to **enter a string**.  
2️⃣ Converts it to **lowercase**.  
3️⃣ Iterates through the string:  
   - Counts **consecutive vowels (including '?')**.  
   - Counts **consecutive consonants (including '?')**.  
4️⃣ Returns:
   - `0` if any **bad** condition met.  
   - `1` otherwise.

---

## 🧪 Sample Input/Output

Enter string:
aeiouu
0

Copy
Edit
Enter string:
bcdfg
0

Copy
Edit
Enter string:
abcde
1

Copy
Edit
Enter string:
a?e?i
1

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/goodOrBadString/GoodOrBadString.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.goodOrBadString.GoodOrBadString
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
