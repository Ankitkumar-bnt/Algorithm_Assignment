# 🔁 Convert Array to ZigZag Form (Java)

A simple Java console application to convert a given **array** into **zig-zag form** — an arrangement where elements alternate between being smaller and larger than their neighbors.

---

## 📘 What is the Problem?

You need to **rearrange the array** so it follows this zig-zag pattern:

arr[0] < arr[1] > arr[2] < arr[3] > arr[4] ...

yaml
Copy
Edit

✅ The order alternates between **less than** and **greater than**.

---

## ✅ Examples

- Input: `4 3 7 8 6 2 1`  
  Output: `3 7 4 8 2 6 1` ✅  

- Input: `1 4 3 2`  
  Output: `1 4 2 3` ✅  

- Input: `9 6 8 3 7`  
  Output: `6 9 3 8 7` ✅  

---

## 📂 Project Structure

src/main/java/com
└── convertArrayToZigZag/
└── ConvertArrayToZigZag.java

yaml
Copy
Edit

---

## ⚙️ How It Works

1️⃣ Prompts the user to **enter the size of the array**.  
2️⃣ Reads the array elements from user input.  
3️⃣ Iterates through the array and swaps elements to enforce the **zig-zag condition**:
   - Even indices: arr[i] < arr[i+1]
   - Odd indices: arr[i] > arr[i+1]
4️⃣ Prints the **zig-zag array**.

---

## 🧪 Sample Input/Output

Enter size of array:
7
Enter array:
4 3 7 8 6 2 1
3 7 4 8 2 6 1

Copy
Edit
Enter size of array:
4
Enter array:
1 4 3 2
1 4 2 3

Copy
Edit
Enter size of array:
5
Enter array:
9 6 8 3 7
6 9 3 8 7

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/convertArrayToZigZag/ConvertArrayToZigZag.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.convertArrayToZigZag.ConvertArrayToZigZag
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
