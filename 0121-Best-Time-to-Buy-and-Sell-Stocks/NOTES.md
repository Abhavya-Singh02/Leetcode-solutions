### Algorithm:
1. **Initialize Variables:**
   - Initialize a variable `buy` to store the price at which the stock is bought. Set it to the first element of the prices array.
   - Initialize a variable `profit` to store the maximum profit. Set it to 0 initially.

2. **Iterate Through Prices:**
   - Iterate through the prices array starting from the second element (index 1).

3. **Calculate Profit:**
   - For each price, check if it is greater than the `buy` price.
   - If it is, calculate the potential profit by subtracting the `buy` price from the current price (`prices[i]`). Use `Math.max()` to update the `profit` with the maximum of the calculated profit and the current `profit`.
   - If the current price is not greater than the `buy` price, update the `buy` price to the current price. This represents a new potential buying opportunity.

4. **Return Maximum Profit:**
   - After iterating through all prices, the `profit` variable holds the maximum profit obtained from buying and selling the stock.
   - Return the `profit`.

### Complexity Analysis:
- **Time Complexity:** O(n)
  - Where `n` is the length of the prices array.
  - The algorithm involves a single pass through the prices array to find the maximum profit.
- **Space Complexity:** O(1)
  - Constant space is used as only a few variables (`buy` and `profit`) are maintained.

