
# 📌 Java Console Programs Assignment

A collection of simple Java console applications solving various algorithmic and array/string problems.

---

## ⚙️ Requirements

* **Java 21** (Maven project)
* **Terminal** or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)

---

## 📂 Project Structure

```
src/
└── main/
    └── java/
        └── com/
 ├── addMinimumCharacters/
            ├── anagramString/
            ├── confusedPappu/
            ├── convertArrayToZigZag/
            ├── countPairsWithGivenSum/
            ├── equilibriumPoint/
            ├── evenUniqueSubset/
            ├── factorial/
            ├── fibonacci/
            ├── fibonacciNthSerise/
            ├── firstAndLastOccurrences/
            ├── goodOrBadString/
            ├── immdiateSmallerElement/
            ├── kthSmallestElement/
            ├── maxAreaRectangle/
            ├── maximumProductSubarray/
            ├── mergeTwoStringAlternate/
            ├── missingNumberInArray/
            ├── palindromeDigit/
            ├── palindromeString/
            ├── primeNumber/
            ├── secondLargest/
            ├── sieveOfEratosthenesPrime/
            ├── smallestAndSecondSmallest/
            ├── stockBuyAndSell/
            ├── stockBuyAndSell2/
            ├── subsquenceChecker/
            ├── thirdLargestElement/
            ├── uniqueNumberOfOccurrences/
            └── uniqueSubset/
```

---

## ✅ Program List and Descriptions

| Program                       | Description                                                    |
| ----------------------------- | -------------------------------------------------------------- |
| **AddMinimumCharacters**      | Find minimum characters to add to make a string palindrome     |
| **AnagramString**             | Count characters to remove to make two strings anagrams        |
| **ConfusedPappu**             | Simulate a currency change or simple greedy problem            |
| **ConvertArrayToZigZag**      | Rearrange array in zig-zag fashion                             |
| **CountPairsWithGivenSum**    | Count all pairs with a given sum                               |
| **EquilibriumPoint**          | Find the index where left and right sums are equal             |
| **EvenUniqueSubset**          | Print all unique even-element subsets                          |
| **Factorial**                 | Compute factorial of a number                                  |
| **Fibonacci**                 | Print Fibonacci series up to n terms                           |
| **FibonacciNthSerise**        | Compute the nth term in Fibonacci series                       |
| **FirstAndLastOccurrences**   | Find first and last occurrence of an element in array          |
| **GoodOrBadString**           | Classify string as good/bad based on vowel/consonant sequences |
| **ImmdiateSmallerElement**    | Print immediate smaller element to the right                   |
| **KthSmallestElement**        | Find the k-th smallest element in array                        |
| **MaxAreaRectangle**          | Compute maximum product of subarray excluding negatives        |
| **MaximumProductSubarray**    | Compute maximum product subarray excluding specific negatives  |
| **MergeTwoStringAlternate**   | Merge two strings in alternate characters                      |
| **MissingNumberInArray**      | Find missing number in array of size N-1 containing 1..N       |
| **PalindromeDigit**           | Check if a number is a palindrome                              |
| **PalindromeString**          | Check if a string is a palindrome                              |
| **PrimeNumber**               | Check if a number is prime                                     |
| **SecondLargest**             | Find second largest number in array                            |
| **SecondLargest**             | Find second largest number in array                            |
| **SieveOfEratosthenesPrime**  | List all primes up to a given number using the Sieve algorithm |
| **SmallestAndSecondSmallest** | Find smallest and second smallest elements in array            |
| **StockBuyAndSell**           | Print buy/sell days to maximize profit (multiple transactions) |
| **StockBuyAndSell2**          | Calculate max profit (sum of multiple transactions)            |
| **SubsquenceChecker**         | Check if one string is a subsequence of another                |
| **ThirdLargestElement**       | Find the third largest element in array                        |
| **UniqueNumberOfOccurrences** | Check if element frequencies in array are unique               |
| **UniqueSubset**              | Generate all unique subsets (handling duplicates)              |

---

## ⚙️ How to Compile and Run

### 📍 Compile

From the project root (where `src` folder exists), run:

```bash
javac -d bin src/main/java/com/**/*.java
```

✅ All compiled `.class` files will be in the `bin` directory.

---

### 📍 Run

Example for running **AnagramString**:

```bash
java -cp bin com.anagramString.AnagramString
```

🔄 Replace `com.anagramString.AnagramString` with the full package and class name of the program you wish to run.

---

## 🧪 Additional Information

* **Java JDK 8 or higher** recommended
* All programs are standalone—you can compile and run each independently
* Input is console-based
* Basic validation included (e.g., negative sizes, invalid input)

---

✅ **Tip:** For best experience, open the project in IntelliJ IDEA or Eclipse and run classes directly from the IDE.

