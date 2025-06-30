# ✅ Unique Number of Occurrences (Java)

A simple Java console application to check if **frequencies of elements** in an array are **all unique**.

---

## 📘 What Does It Do?

This program verifies if **no two distinct numbers** in the input array have the **same frequency of occurrence**.

✅ Example:

- Array: `[1, 2, 2, 1, 1, 3]`
  - Frequencies: `1 ➜ 3`, `2 ➜ 2`, `3 ➜ 1`
  - All frequencies unique ➜ ✅ returns `true`

- Array: `[1, 2, 2, 1, 3, 3]`
  - Frequencies: `1 ➜ 2`, `2 ➜ 2`, `3 ➜ 2`
  - Not unique ➜ ❌ returns `false`

---

## ✅ How It Works

1️⃣ Prompts the user to **enter the size** of the array.

2️⃣ Reads **array elements**.

3️⃣ Counts **frequency of each element** using a `Map`.

4️⃣ Checks if **all frequencies are unique**:
   - If *yes* ➜ returns `true`.
   - If *no* ➜ returns `false`.

5️⃣ Handles invalid size inputs (size ≤ 0).

---

## 📂 Project Structure

src/main/java/com
└── uniqueNumberOfOccurrences/
└── UniqueNumberOfOccurrences.java

yaml
Copy
Edit

---

## ✅ Example Inputs and Outputs

### 🧪 Example 1

Enter size:
6
1 2 2 1 1 3
true

yaml
Copy
Edit
✅ Frequencies: `{1=3, 2=2, 3=1}` ➜ All unique.

---

### 🧪 Example 2

Enter size:
6
1 2 2 1 3 3
false

yaml
Copy
Edit
❌ Frequencies: `{1=2, 2=2, 3=2}` ➜ Not unique.

---

### 🧪 Example 3

Enter size:
0
Invalid input

yaml
Copy
Edit
❌ Size ≤ 0 is invalid.

---

### 🧪 Example 4

Enter size:
5
5 5 5 5 5
true

yaml
Copy
Edit
✅ Frequencies: `{5=5}` ➜ Unique.

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/uniqueNumberOfOccurrences/UniqueNumberOfOccurrences.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.uniqueNumberOfOccurrences.UniqueNumberOfOccurrences
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
