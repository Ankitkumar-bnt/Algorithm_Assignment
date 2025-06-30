# 🔢 Kth Smallest Element Finder (Java)

A simple Java console application to find the **kth smallest distinct element** in an **array**.

---

## 📘 What is the Problem?

Given an array of integers and a value **k**, return the **kth smallest** **distinct** element in **sorted order**.  
✅ If **k** is larger than the number of **distinct** elements, return `-1`.

---

## ✅ Examples

- Input:  
Array: [7, 10, 4, 3, 20, 15]
k = 3

vbnet
Copy
Edit
Output: `10`  
Explanation: Sorted distinct elements → [3, 4, 7, 10, 15, 20] → 3rd = 10

- Input:  
Array: [1, 1, 2, 2, 3]
k = 2

vbnet
Copy
Edit
Output: `2`  
Explanation: Distinct sorted → [1, 2, 3]

- Input:  
Array: [5, 5, 5]
k = 2

yaml
Copy
Edit
Output: `-1`  
Explanation: Only 1 distinct element.

---

## 📂 Project Structure

src/main/java/com
└── kthSmallestElement/
└── KthSmallestElement.java

yaml
Copy
Edit

---

## ⚙️ How It Works

1️⃣ Prompts the user to **enter the array size**.  
2️⃣ Reads **array elements** from user input.  
3️⃣ Asks for **k** (the index to find).  
4️⃣ Converts the array to a **TreeSet** to:
   - Remove duplicates.
   - Sort elements.  
5️⃣ Returns:
   - The **(k-1)th** element if **valid**.  
   - `-1` if **k** is too large.

---

## 🧪 Sample Input/Output

Enter size:
6
7 10 4 3 20 15
Enter index:
3
10

Copy
Edit
Enter size:
5
1 1 2 2 3
Enter index:
2
2

Copy
Edit
Enter size:
3
5 5 5
Enter index:
2
-1

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/kthSmallestElement/KthSmallestElement.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.kthSmallestElement.KthSmallestElement
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
