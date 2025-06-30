# 📈 Stock Buy and Sell (Java)

A simple Java console program to **find days to buy and sell stocks** to maximize profit.  

---

## 📘 What Does It Do?

Given an array of daily stock prices, it identifies **buy and sell days** to maximize profit.  

✅ It prints all valid **(buy day, sell day)** pairs.  
✅ If no profit is possible, it reports **"No Profit"**.

---

## ✅ How It Works

1️⃣ Prompts the user to **enter the number of days**.  
2️⃣ Reads stock prices for each day.  
3️⃣ Finds intervals where prices increase.  
4️⃣ Prints:
   - Buy and sell day indices for each profitable transaction.
   - `"No Profit"` if no transaction can make money.

---

## ✅ Example

**Input:**  
Enter size:
6
100 180 260 310 40 535

makefile
Copy
Edit

**Output:**  
(0 3)
(4 5)

yaml
Copy
Edit

**Explanation:**  
- Buy at day 0 (price 100), sell at day 3 (price 310) → Profit.  
- Buy at day 4 (price 40), sell at day 5 (price 535) → Profit.

---

## 📂 Project Structure

src/main/java/com
└── stockBuyAndSell/
└── StockBuyAndSell.java

yaml
Copy
Edit

---

## 🧪 Sample Input/Output

✅ **Example 1**  
Enter size:
5
100 90 80 70 60
No Profit

markdown
Copy
Edit

✅ **Example 2**  
Enter size:
7
90 100 120 80 60 150 170
(0 2)
(4 6)

yaml
Copy
Edit

---

## 💻 How to Compile and Run

### 📍 Step 1: Compile

Open terminal and navigate to the project root:

```bash
javac src/main/java/com/stockBuyAndSell/StockBuyAndSell.java
📍 Step 2: Run
bash
Copy
Edit
java -cp src/main/java com.stockBuyAndSell.StockBuyAndSell
📎 Requirements
Java JDK 8 or higher

Terminal or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
