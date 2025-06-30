# 🔁 Add Minimum Characters to Make Palindrome (Java)

A simple Java console application to determine the **minimum number of characters** to add **at the front** of a given string to make it a **palindrome**.

---

## 📘 What is the Problem?

You need to find the **minimum characters** to **add at the start** of the string so that the entire string becomes a palindrome.

✅ A **palindrome** reads the same forwards and backwards.

---

## ✅ Examples

- `"abac"` → Add **1** character → `"cabac"` ✅  
- `"aacecaaa"` → Add **2** characters → `"aaacecaaa"` ✅  
- `"racecar"` → Add **0** characters → Already a palindrome ✅

---

## 📂 Project Structure

src/main/java/com
└── addMinimumCharacters/
└── AddMinimumCharacters.java

yaml
Copy
Edit

---

## ⚙️ How It Works

1️⃣ Prompts the user to **enter a string**.  
2️⃣ Iterates over the string to find its **longest palindromic prefix**.  
3️⃣ Calculates **characters to add** at the front to make the entire string a palindrome.  
4️⃣ Prints **the minimum number of characters** to add.

---

## 🧪 Sample Input/Output

Enter string:
abac
1

Copy
Edit
Enter string:
racecar
0

Copy
Edit
Enter string:
aacecaaa
2

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/addMinimumCharacters/AddMinimumCharacters.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.addMinimumCharacters.AddMinimumCharacters
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
