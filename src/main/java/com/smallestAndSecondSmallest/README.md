# 🔢 Smallest and Second Smallest Element Finder (Java)

A simple Java console application to **find the smallest and second smallest elements** in a given array of integers.

---

## 📘 What Does It Do?

Given an array of integers, the program finds:

✅ The **smallest element**  
✅ The **second smallest element**  

If the array has fewer than 2 elements, it reports `{-1, -1}`.

---

## ✅ How It Works

1️⃣ Prompts the user to **enter the size of the array**.  
2️⃣ Reads the array elements.  
3️⃣ Scans through the array to find:
   - The smallest element
   - The second smallest element
4️⃣ Prints both elements in the format:  
{smallest, secondSmallest}

arduino
Copy
Edit
If not possible (size < 2), prints:  
{-1, -1}

yaml
Copy
Edit

---

## ✅ Example

**Input:**  
Enter size of array:
5
Enter array:
3 1 4 2 5

makefile
Copy
Edit

**Output:**  
{1, 2}

yaml
Copy
Edit

---

## 📂 Project Structure

src/main/java/com
└── smallestAndSecondSmallest/
└── SmallestAndSecondSmallest.java

yaml
Copy
Edit

---

## 🧪 Sample Input/Output

✅ **Example 1**  
Enter size of array:
4
Enter array:
8 6 4 2
{2, 4}

markdown
Copy
Edit

✅ **Example 2**  
Enter size of array:
1
Enter array:
5
{-1, -1}

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/smallestAndSecondSmallest/SmallestAndSecondSmallest.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.smallestAndSecondSmallest.SmallestAndSecondSmallest
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
