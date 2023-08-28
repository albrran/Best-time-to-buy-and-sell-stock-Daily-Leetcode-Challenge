class Solution {
    public int maxProfit(int[] prices) {
        int left = 0; // Initialize the left pointer to the beginning of the price array.
        int right = 1; // Initialize the right pointer to the next element in the price array.
        int maxProfit = 0; // Initialize the maximum profit to 0.

        // Start a loop that continues until the right pointer reaches the end of the price array.
        while (right < prices.length) {
            // Check if the price at the left pointer is less than the price at the right pointer.
            if (prices[left] < prices[right]) {
                // If a profit opportunity exists:
                // Calculate the profit by subtracting the left price from the right price.
                // Update maxProfit to store the greater of its current value and the calculated profit.
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
                right++; // Move the right pointer to explore the next price.
            } else {
                // If no profit opportunity exists in the current range:
                // Update the left pointer to be the same as the right pointer to find a new potential price range.
                left = right;
                right++; // Move the right pointer to explore the next price.
            }
        }

        // Return the maxProfit, which represents the maximum profit that can be obtained.
        return maxProfit;
    }
}
