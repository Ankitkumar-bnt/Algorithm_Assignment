# ✅ Third Largest Element Finder (Java)

A simple Java console application to **find the third largest unique element** in an array.

---

## 📘 What is the "Third Largest" Element?

It is the **third highest unique** number in a list of integers.

✅ Example:

- Array: `[5, 1, 4, 2, 3]`
- Sorted Unique Elements: `[1, 2, 3, 4, 5]`
- ➜ Third Largest: `3`

---

## ✅ How It Works

1️⃣ Prompts the user to **enter the size** of the array.

2️⃣ Reads **array elements** from the user.

3️⃣ Removes duplicates and sorts elements in **ascending order**.

4️⃣ Picks the **third largest** element from the sorted unique list.

5️⃣ Returns:
   - The third largest element if it exists.
   - `-1` if fewer than **3 unique elements** are available.
   - `0` for invalid size input.

---

## 📂 Project Structure

src/main/java/com
└── thirdLargestElement/
└── ThirdLargestElement.java

yaml
Copy
Edit

---

## ✅ Example Inputs and Outputs

### 🧪 Example 1

Enter size of array:
5
Enter array:
5 1 4 2 3
3

yaml
Copy
Edit
✅ Third largest unique element is `3`.

---

### 🧪 Example 2

Enter size of array:
3
Enter array:
4 4 4
-1

yaml
Copy
Edit
❌ Only one unique element; no third largest exists.

---

### 🧪 Example 3

Enter size of array:
0
Invalid input
0

yaml
Copy
Edit
❌ Invalid size entered.

---

### 🧪 Example 4

Enter size of array:
6
Enter array:
10 20 20 30 40 50
30

yaml
Copy
Edit
✅ Unique sorted elements: `[10, 20, 30, 40, 50]`, third largest is `30`.

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/thirdLargestElement/ThirdLargestElement.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.thirdLargestElement.ThirdLargestElement
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
