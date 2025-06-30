# 🔁 Count Pairs with Given Sum (Java)

A simple Java console application to **count the number of pairs** in an array whose elements sum to a **given value**.

---

## 📘 What is the Problem?

You need to find **all pairs of elements** in the array such that:

arr[i] + arr[j] = K

yaml
Copy
Edit

✅ Count all such unique index pairs `(i, j)` where `i < j`.

---

## ✅ Examples

- Input: `arr = [1, 5, 7, 1]`, `K = 6`  
  Output: `2` ✅  
  Pairs: `(1,5)`, `(5,1)`

- Input: `arr = [1, 1, 1, 1]`, `K = 2`  
  Output: `6` ✅  
  Pairs: All combinations of 1+1

- Input: `arr = [1, 2, 3, 4]`, `K = 8`  
  Output: `-1` ✅  
  No pairs sum to 8.

---

## 📂 Project Structure

src/main/java/com
└── countPairsWithGivenSum/
└── CountPairsWithGivenSum.java

yaml
Copy
Edit

---

## ⚙️ How It Works

1️⃣ Prompts the user to **enter the size of the array**.  
2️⃣ Reads the array elements from user input.  
3️⃣ Asks for the **target sum** `K`.  
4️⃣ Checks **all unique pairs (i, j)** for `arr[i] + arr[j] == K`.  
5️⃣ Counts and prints:
   - The **number of such pairs** if any exist.
   - `-1` if **no such pairs** exist.

---

## 🧪 Sample Input/Output

Enter size:
4
1 5 7 1
Enter the sum:
6
2

Copy
Edit
Enter size:
4
1 1 1 1
Enter the sum:
2
6

Copy
Edit
Enter size:
4
1 2 3 4
Enter the sum:
8
-1

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/countPairsWithGivenSum/CountPairsWithGivenSum.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.countPairsWithGivenSum.CountPairsWithGivenSum
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
