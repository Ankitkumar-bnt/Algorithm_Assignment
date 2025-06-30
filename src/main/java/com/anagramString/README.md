# 🔁 Anagram String Character Removal (Java)

A simple Java console application to **find the minimum number of characters** to remove from two strings so they become **anagrams** of each other.

---

## 📘 What is the Problem?

You need to find the **minimum number of characters to delete** from both strings so that the remaining characters in both form **anagrams**.

✅ An **anagram** of a string is another string with the **same characters in any order**.

---

## ✅ Examples

- `"bcadeh"` and `"hea"` → Remove **3** characters ✅  
- `"hello"` and `"billion"` → Remove **6** characters ✅  
- `"listen"` and `"silent"` → Remove **0** characters ✅  

---

## 📂 Project Structure

src/main/java/com
└── anagramString/
└── AnagramString.java

yaml
Copy
Edit

---

## ⚙️ How It Works

1️⃣ Prompts the user to **enter two strings**.  
2️⃣ Converts both strings to lowercase and sorts their characters.  
3️⃣ Compares the characters to find **common** and **extra** ones.  
4️⃣ Calculates and prints the **minimum number of deletions** required to make them anagrams.

---

## 🧪 Sample Input/Output

Enter 2 string:
bcadeh
hea
3

Copy
Edit
Enter 2 string:
listen
silent
0

Copy
Edit
Enter 2 string:
hello
billion
6

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/anagramString/AnagramString.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.anagramString.AnagramString
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
