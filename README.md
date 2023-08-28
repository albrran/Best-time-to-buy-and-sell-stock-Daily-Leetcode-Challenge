# Best-time-to-buy-and-sell-stock-Daily-Leetcode-Challenge
You are given an array prices where prices[i] is the price of a given stock on the ith day.  You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.  Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.


Solution 1: PriceGradientProfitMaximizer
    <ol>
        <li>Initialize left and right pointers to track the price range.</li>
        <li>Initialize maxProfit to store the maximum profit found so far.</li>
        <li>Iterate through the prices while the right pointer is within the bounds of the array:</li>
        <ol type="a">
            <li>Check if the price at left is less than the price at right, indicating a potential profit opportunity.</li>
            <li>If a profit opportunity exists, calculate the profit by subtracting the price at left from the price at right.</li>
            <li>Update maxProfit to be the greater of its current value and the calculated profit, ensuring that it always holds the maximum profit seen so far.</li>
            <li>Increment the right pointer to explore the next price.</li>
        </ol>
        <li>If the price at left is not less than the price at right, it means there's no profit opportunity in the current range. In this case, update left to be the same as right to find a new potential price range.</li>
        <li>Repeat the process until the right pointer reaches the end of the array.</li>
        <li>Return the maxProfit, which represents the maximum profit that can be obtained from the given array of stock prices.</li>
    </ol>

<h3>Credits to: neetcode</h3>


