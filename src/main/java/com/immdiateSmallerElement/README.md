# 🔁 Immediate Smaller Element Finder (Java)

A simple Java console application that processes an array to print, **for each element**, the **immediate smaller element** on its **right** (or `-1` if none).

---

## 📘 What is the Problem?

Given an array of integers, for **each element**, print:

✅ The **next** element **if** it is **smaller**.  
✅ `-1` **if no such smaller element** exists immediately after.

---

## ✅ Examples

- Input: `[4, 2, 1, 5]`  
  Output:  
2 -1 -1 -1

markdown
Copy
Edit
Explanation:
- 4 > 2 → print 2
- 2 > 1 → print 1
- 1 < 5 → print -1
- Last element → print -1

- Input: `[1, 3, 2, 4, 1]`  
Output:  
-1 2 -1 1 -1

yaml
Copy
Edit

---

## 📂 Project Structure

src/main/java/com
└── immdiateSmallerElement/
└── ImmdiateSmallerElement.java

yaml
Copy
Edit

---

## ⚙️ How It Works

1️⃣ Prompts the user to **enter the array size**.  
2️⃣ Reads **array elements** from user input.  
3️⃣ For **each element except the last**:
   - Compares with its **next** element.  
   - Prints:
     - **Next** element if it's **smaller**.  
     - `-1` otherwise.  
4️⃣ Always prints `-1` for the **last** element.

---

## 🧪 Sample Input/Output

Enter size of array:
4
Enter array:
4 2 1 5
2 -1 -1 -1

Copy
Edit
Enter size of array:
5
Enter array:
1 3 2 4 1
-1 2 -1 1 -1

Copy
Edit
Enter size of array:
3
Enter array:
5 6 7
-1 -1 -1

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/immdiateSmallerElement/ImmdiateSmallerElement.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.immdiateSmallerElement.ImmdiateSmallerElement
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
