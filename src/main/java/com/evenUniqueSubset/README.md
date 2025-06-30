# 🔁 Even Unique Subsets Finder (Java)

A Java console application to find **all subsets** of an integer array that meet **two conditions**:
✅ All elements are **even**.  
✅ All elements are **unique** (no duplicates in a subset).

---

## 📘 What is the Problem?

Given an array of integers, generate **all possible subsets** that:  
- Contain **only even numbers**.  
- Have **no repeated elements**.

Print:
- The **count** of such valid subsets.
- Each **subset** itself.

---

## ✅ Examples

- Input: `[2, 4, 6]`  
  Output:
7
[]
[2]
[4]
[6]
[2, 4]
[2, 6]
[4, 6]
[2, 4, 6]

css
Copy
Edit
✅ All subsets contain only even and unique elements.

- Input: `[2, 2, 4]`  
Output:
3
[]
[2]
[4]
[2, 4]

markdown
Copy
Edit
✅ No duplicate `2`s in any subset.

- Input: `[1, 3, 5]`  
Output:
1
[]

yaml
Copy
Edit
✅ No even numbers → only empty subset is valid.

---

## 📂 Project Structure

src/main/java/com
└── evenUniqueSubset/
└── EvenUniqueSubset.java

yaml
Copy
Edit

---

## ⚙️ How It Works

1️⃣ Prompts the user to **enter the array size**.  
2️⃣ Reads **array elements** from user input.  
3️⃣ Sorts the array to help avoid duplicates.  
4️⃣ Generates **all subsets**.  
5️⃣ Filters:
   - Only **even** numbers.  
   - No **repeated** elements in a subset.  
6️⃣ Prints:
   - Total **count** of valid subsets.  
   - Each **valid subset**.

---

## 🧪 Sample Input/Output

Enter size of array:
3
Enter element
2 4 6
7
[]
[2]
[4]
[6]
[2, 4]
[2, 6]
[4, 6]
[2, 4, 6]

Copy
Edit
Enter size of array:
3
Enter element
1 3 5
1
[]

Copy
Edit
Enter size of array:
3
Enter element
2 2 4
3
[]
[2]
[4]
[2, 4]

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/evenUniqueSubset/EvenUniqueSubset.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.evenUniqueSubset.EvenUniqueSubset
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
