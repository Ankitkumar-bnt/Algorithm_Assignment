# ✨ Maximum Product Subarray (Java)

A simple Java console application to **find the maximum product** of a **subsequence** of an array (by removing minimum necessary negative numbers for maximum product).

---

## 📘 What is the Problem?

Given an array of integers (can be positive, negative, or zero), find the **maximum product** you can get by multiplying a **subsequence** of the array elements.

✅ If there are **an odd number of negative numbers**, you remove the *smallest in magnitude* negative number to make the count even.

✅ All **zeros and ones** are typically ignored (unless they are the only options).

---

## ✅ Examples

- Input:  
Array: [1, -2, -3, 4]

makefile
Copy
Edit
Output: `24`  
Explanation:  
Product = 4 * (-2) * (-3) = 24

- Input:  
Array: [-1, -2, -3, 0]

yaml
Copy
Edit
Output: `6`  
Explanation:  
Remove -1 (least magnitude negative), product = (-2) * (-3) = 6

- Input:  
Array: [0, 0, 0]

yaml
Copy
Edit
Output: `1`  
Explanation:  
Nothing to multiply, default 1 (as per code logic ignoring 0/1s)

---

## 📂 Project Structure

src/main/java/com
└── maximumProductSubarray/
└── MaximumProductSubarray.java

yaml
Copy
Edit

---

## ⚙️ How It Works

1️⃣ Prompts the user to **enter the array size**.  
2️⃣ Reads **array elements** from user input.  
3️⃣ Separates **negative** numbers to check for *odd count*.  
   - If odd → remove the least negative (largest among negatives).  
4️⃣ Removes **0** and **1** from the subsequence for product.  
5️⃣ Multiplies all remaining elements to get the **maximum product**.

---

## 🧪 Sample Input/Output

Enter size:
4
1 -2 -3 4
24

Copy
Edit
Enter size:
4
-1 -2 -3 0
6

Copy
Edit
Enter size:
3
0 0 0
1

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/maximumProductSubarray/MaximumProductSubarray.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.maximumProductSubarray.MaximumProductSubarray
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
