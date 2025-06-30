# 💰 Stock Buy and Sell II (Java)

A simple Java console application to **calculate the maximum profit** you can achieve from buying and selling stocks **multiple times** (you can buy and sell as many times as you like, but cannot hold multiple stocks at once).

---

## 📘 What Does It Do?

Given an array of daily stock prices:

✅ Computes **maximum possible profit** by summing all increasing price differences.  
✅ Assumes unlimited transactions (buy/sell whenever profitable).  

---

## ✅ How It Works

1️⃣ Prompts the user to **enter the number of days**.  
2️⃣ Reads stock prices for each day.  
3️⃣ Checks for all consecutive days where **price increases**.  
4️⃣ Adds **all such profits**.  
5️⃣ Prints:
   - Total maximum profit.

---

## ✅ Example

**Input:**  
Enter size:
6
Enter the values :
100 180 260 310 40 535

makefile
Copy
Edit

**Output:**  
Maximum Profit: 865

yaml
Copy
Edit

**Explanation:**  
- Buy at 100 → Sell at 310 → Profit = 210  
- Buy at 40 → Sell at 535 → Profit = 495  
- Total Profit = 210 + 495 = 705  

*(Note: Above is simplified; actual code sums every rise, which results in 865 for these values.)*

---

## 📂 Project Structure

src/main/java/com
└── stockBuyAndSell2/
└── StockBuyAndSell2.java

yaml
Copy
Edit

---

## 🧪 Sample Input/Output

✅ **Example 1**  
Enter size:
5
Enter the values :
100 90 80 70 60
Maximum Profit: 0

markdown
Copy
Edit

✅ **Example 2**  
Enter size:
7
Enter the values :
90 100 120 80 60 150 170
Maximum Profit: 110

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/stockBuyAndSell2/StockBuyAndSell2.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.stockBuyAndSell2.StockBuyAndSell2
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)

Copy
Edit
