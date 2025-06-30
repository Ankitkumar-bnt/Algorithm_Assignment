# ✅ Subsequence Checker (Java)

A simple Java console application to **check whether one string is a subsequence of another**.

---

## 📘 What is a Subsequence?

A **subsequence** of a string is a new string generated from the original string by deleting some (or no) characters without changing the relative order of the remaining characters.

✅ Examples:

- `a = "akt"`
- `b = "ankit"`

👉 `"akt"` **is a subsequence** of `"ankit"`.

---

## ✅ How It Works

1️⃣ Prompts the user to **enter two strings**:
   - The string to **check** (`a`).
   - The string to **compare with** (`b`).

2️⃣ Iterates through characters of `a` to see if they appear **in order** in `b`.

3️⃣ Returns:
   - `1` if `a` is a subsequence of `b`.
   - `0` otherwise.

---

## 📂 Project Structure

src/main/java/com
└── subsquenceChecker/
└── SubsquenceChecker.java

yaml
Copy
Edit

---

## ✅ Example Inputs and Outputs

### 🧪 Example 1

Enter string have to check:
akt
Enter String have to compare with:
ankit
1

yaml
Copy
Edit
✅ `akt` **is a subsequence** of `ankit`.

---

### 🧪 Example 2

Enter string have to check:
cat
Enter String have to compare with:
ankit
0

yaml
Copy
Edit
❌ `cat` **is not a subsequence** of `ankit`.

---

### 🧪 Example 3

Enter string have to check:
abc
Enter String have to compare with:
aabbbcc
1

yaml
Copy
Edit
✅ `abc` **is a subsequence** of `aabbbcc`.

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/subsquenceChecker/SubsquenceChecker.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.subsquenceChecker.SubsquenceChecker
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)

Copy
Edit
