# 🔁 First and Last Occurrences Finder (Java)

A simple Java console application to find the **first** and **last** indices of a given number in an **array**.

---

## 📘 What is the Problem?

Given an array and a **target number**, you need to **find**:
✅ The **first occurrence index**.  
✅ The **last occurrence index**.

If the number **does not exist** in the array, return `-1`.

---

## ✅ Examples

- Input: `arr = [1, 2, 3, 2, 5]`, value = `2`  
  Output:  
First index: 1
Last index: 3

markdown
Copy
Edit

- Input: `arr = [5, 5, 5, 5]`, value = `5`  
Output:  
First index: 0
Last index: 3

markdown
Copy
Edit

- Input: `arr = [1, 2, 3, 4]`, value = `6`  
Output:  
-1

yaml
Copy
Edit

---

## 📂 Project Structure

src/main/java/com
└── firstAndLastOccurrences/
└── FirstAndLastOccurrences.java

yaml
Copy
Edit

---

## ⚙️ How It Works

1️⃣ Prompts the user to **enter the size of the array**.  
2️⃣ Reads **array elements** from user input.  
3️⃣ Asks for the **target number**.  
4️⃣ Iterates over the array:
   - Tracks **first** and **last** indices where the value is found.  
5️⃣ Prints:
   - Both indices if found.  
   - `-1` if **not found**.

---

## 🧪 Sample Input/Output

Enter the size of array:
5
Enter array:
1 2 3 2 5
Enter number to find:
2
First index: 1
Last index: 3

Copy
Edit
Enter the size of array:
4
Enter array:
5 5 5 5
Enter number to find:
5
First index: 0
Last index: 3

Copy
Edit
Enter the size of array:
4
Enter array:
1 2 3 4
Enter number to find:
6
-1

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/firstAndLastOccurrences/FirstAndLastOccurrences.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.firstAndLastOccurrences.FirstAndLastOccurrences
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
