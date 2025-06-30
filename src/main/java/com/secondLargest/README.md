# 🥈 Second Largest Element in Array (Java)

A simple Java console application to **find the second largest** distinct element in an array.

---

## 📘 What is the Problem?

Given an array of integers, **find the second largest** distinct element.

✅ Handles arrays with at least 2 elements.  
✅ Returns `-1` if no valid second largest exists.

---

## ✅ Examples

- Input:  
Size: 5
Array: 1 2 3 4 5

makefile
Copy
Edit
Output:  
4

css
Copy
Edit

- Input:  
Size: 4
Array: 5 5 5 5

makefile
Copy
Edit
Output:  
0

css
Copy
Edit

- Input:  
Size: 1
Array: 9

makefile
Copy
Edit
Output:  
-1

yaml
Copy
Edit

---

## 📂 Project Structure

src/main/java/com
└── secondLargest/
└── SecondLargest.java

yaml
Copy
Edit

---

## ⚙️ How It Works

1️⃣ Prompts the user to **enter array size**.  
2️⃣ Reads the array elements.  
3️⃣ Traverses the array to maintain:
   - `max`: the largest element found so far.
   - `secMax`: the second largest element found so far.  
4️⃣ Skips duplicates of `max`.  
5️⃣ Returns:
   - `secMax` if valid.
   - `-1` if the array has fewer than 2 elements.

---

## 🧪 Sample Input/Output

Enter size:
5
1 2 3 4 5
4

Copy
Edit
Enter size:
4
5 5 5 5
0

Copy
Edit
Enter size:
1
9
-1

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/secondLargest/SecondLargest.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.secondLargest.SecondLargest
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)










