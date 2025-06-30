# 🔢 Sieve of Eratosthenes for Prime Number (Java)

A Java console application to **generate all prime numbers up to a given limit** using the **Sieve of Eratosthenes** algorithm.

---

## 📘 What is the Sieve of Eratosthenes?

The **Sieve of Eratosthenes** is an ancient algorithm for finding **all prime numbers up to any given limit**. It systematically marks as composite (not prime) the multiples of each prime number starting from 2.

---

## ✅ How It Works

1️⃣ User enters a **limit** (integer N).  
2️⃣ The program initializes a boolean array marking all numbers ≤ N as potentially prime.  
3️⃣ For each prime starting from 2:
   - It marks all multiples as **not prime**.  
4️⃣ Prints all numbers ≤ N that remain marked as **prime**.

---

## ✅ Example

**Input:**  
Enter limit:
30

makefile
Copy
Edit

**Output:**  
Prime numbers up to 30:
2 3 5 7 11 13 17 19 23 29

yaml
Copy
Edit

---

## 📂 Project Structure

src/main/java/com
└── sieveOfEratosthenesPrime/
└── SieveOfEratosthenesPrime.java

yaml
Copy
Edit

---

## 🧪 Sample Input/Output

Enter limit:
10
Prime numbers up to 10:
2 3 5 7

Copy
Edit
Enter limit:
25
Prime numbers up to 25:
2 3 5 7 11 13 17 19 23

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/sieveOfEratosthenesPrime/SieveOfEratosthenesPrime.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.sieveOfEratosthenesPrime.SieveOfEratosthenesPrime
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
