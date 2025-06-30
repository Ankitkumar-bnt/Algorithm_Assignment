# ✅ Unique Subset Generator (Java)

A simple Java console application to **generate all unique subsets** of an integer array.

---

## 📘 What Does It Do?

This program reads an array of integers (with possible duplicates) and prints **all unique subsets** (power set with duplicates removed).

✅ Example:

- Input array: `[1, 2, 2]`
- Unique subsets:
[]
[1]
[2]
[1, 2]
[2, 2]
[1, 2, 2]

yaml
Copy
Edit

---

## ✅ How It Works

1️⃣ Prompts the user to **enter the size** of the array.

2️⃣ Reads **array elements**.

3️⃣ Sorts the array to help in managing duplicates.

4️⃣ Uses a list of lists to **build all subsets**:
 - Starts with the empty subset.
 - For each number:
   - Generates new subsets by adding the number to existing subsets.
   - Avoids adding duplicate subsets.

5️⃣ Prints all unique subsets.

---

## 📂 Project Structure

src/main/java/com
└── uniqueSubset/
└── UniqueSubset.java

yaml
Copy
Edit

---

## ✅ Example Inputs and Outputs

### 🧪 Example 1

Enter size of array:
3
Enter element
1 2 2
[]
[1]
[2]
[1, 2]
[2, 2]
[1, 2, 2]

yaml
Copy
Edit
✅ All unique subsets with duplicates removed.

---

### 🧪 Example 2

Enter size of array:
2
Enter element
5 5
[]
[5]
[5, 5]

yaml
Copy
Edit
✅ Handles duplicates properly.

---

### 🧪 Example 3

Enter size of array:
0
Enter element
[]

yaml
Copy
Edit
✅ Empty array ➜ only the empty subset.

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/uniqueSubset/UniqueSubset.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.uniqueSubset.UniqueSubset
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
