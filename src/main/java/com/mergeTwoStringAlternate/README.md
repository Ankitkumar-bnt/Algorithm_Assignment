# 🔀 Merge Two Strings Alternately (Java)

A simple Java console application to **merge two strings in an alternate character pattern**.

---

## 📘 What is the Problem?

Given **two strings** `s1` and `s2`, merge them **alternately**:

✅ Pick one character from `s1`, then one from `s2`, repeatedly.  
✅ If one string is longer, append its remaining part at the end.  
✅ Handles input where either string is empty.

---

## ✅ Examples

- Input:  
s1 = "abc"
s2 = "xyz"

makefile
Copy
Edit
Output:  
"axbycz"

css
Copy
Edit

- Input:  
s1 = "abcd"
s2 = "pq"

makefile
Copy
Edit
Output:  
"apbqcd"

css
Copy
Edit

- Input:  
s1 = ""
s2 = "abc"

makefile
Copy
Edit
Output:  
"Invalid input"

yaml
Copy
Edit

---

## 📂 Project Structure

src/main/java/com
└── mergeTwoStringAlternate/
└── MergeTwoStringAlternate.java

yaml
Copy
Edit

---

## ⚙️ How It Works

1️⃣ Prompts the user to **enter two strings**.  
2️⃣ Checks which string is **longer**.  
3️⃣ Alternates characters from both strings:
   - Appends one from each until the shorter runs out.
   - Appends the remainder of the longer string.  
4️⃣ Returns the **merged result**.  
5️⃣ Returns **"Invalid input"** if either string is empty.

---

## 🧪 Sample Input/Output

Enter strings:
abc
xyz
axbycz

Copy
Edit
Enter strings:
abcd
pq
apbqcd

Copy
Edit
Enter strings:
abc

Invalid input

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/mergeTwoStringAlternate/MergeTwoStringAlternate.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.mergeTwoStringAlternate.MergeTwoStringAlternate
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
