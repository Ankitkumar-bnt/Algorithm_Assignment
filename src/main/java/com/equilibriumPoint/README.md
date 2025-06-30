# ⚖️ Equilibrium Point Finder (Java)

A simple Java console application to **find the equilibrium point** in an array — the index where the sum of elements on the left is equal to the sum on the right.

---

## 📘 What is the Problem?

You need to find the **first position** in the array where:

sum of elements before it == sum of elements after it

yaml
Copy
Edit

✅ The position uses **1-based indexing**.

---

## ✅ Examples

- Input: `[1, 3, 5, 2, 2]`  
  Output: `3` ✅  
  Explanation: `1 + 3 = 4`, `2 + 2 = 4`  

- Input: `[1]`  
  Output: `1` ✅  
  Explanation: Only one element.

- Input: `[1, 2]`  
  Output: `-1` ✅  
  Explanation: No equilibrium point.

---

## 📂 Project Structure

src/main/java/com
└── equilibriumPoint/
└── EquilibriumPoint.java

yaml
Copy
Edit

---

## ⚙️ How It Works

1️⃣ Prompts the user to **enter the size of the array**.  
2️⃣ Reads the array elements from user input.  
3️⃣ For each index (except first and last), calculates:
   - Sum of elements **before** it.
   - Sum of elements **after** it.
4️⃣ Returns the **1-based index** if a match is found.  
5️⃣ Returns `-1` if **no such point** exists.

---

## 🧪 Sample Input/Output

Enter size:
5
1 3 5 2 2
3

Copy
Edit
Enter size:
1
5
1

Copy
Edit
Enter size:
2
1 2
-1

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/equilibriumPoint/EquilibriumPoint.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.equilibriumPoint.EquilibriumPoint
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
