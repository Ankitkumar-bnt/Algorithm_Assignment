# 🔢 Missing Number in Array (Java)

A simple Java console application to **find the missing number** in an array containing numbers from 1 to _n_.

---

## 📘 What is the Problem?

Given an array of **size n-1** containing **distinct integers** from 1 to n (inclusive), find the **missing number**.

✅ Exactly **one number** is missing.  
✅ Uses the **sum formula** for 1..n.

---

## ✅ Examples

- Input:  
n = 5
Array: 1 2 3 5

makefile
Copy
Edit
Output:  
4

css
Copy
Edit

- Input:  
n = 4
Array: 1 4 3

makefile
Copy
Edit
Output:  
2

yaml
Copy
Edit

---

## 📂 Project Structure

src/main/java/com
└── missingNumberInArray/
└── MissingNumberInArray.java

yaml
Copy
Edit

---

## ⚙️ How It Works

1️⃣ Prompts the user to **enter the value of n** (size of the full sequence).  
2️⃣ Reads **n-1 elements** of the array from the user.  
3️⃣ Calculates the **expected sum** of numbers from 1 to n using:  
n * (n + 1) / 2

yaml
Copy
Edit
4️⃣ Sums the **given elements**.  
5️⃣ Returns the **difference** as the missing number.

---

## 🧪 Sample Input/Output

Enter size:
5
1 2 3 5
4

Copy
Edit
Enter size:
4
1 4 3
2

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/missingNumberInArray/MissingNumberInArray.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.missingNumberInArray.MissingNumberInArray
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)

Copy
Edit
