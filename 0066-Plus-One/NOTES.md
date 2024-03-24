### Algorithm:
1. **Iterate Through Digits in Reverse:**
   - Start iterating through the digits array from the rightmost digit (least significant digit).
   - For each digit, check if it's equal to 9.

2. **Handle Carry Over:**
   - If the digit is 9, set it to 0 to handle the carry-over situation.
   - If the digit is not 9, increment it by one and return the modified array immediately.

3. **Handle Edge Cases:**
   - If the loop completes without returning, it means the entire number was 999...9 (all 9s).
   - In this case, create a new array `result` of length `digits.length + 1` and set the first element to 1 to represent the carry-over.

4. **Return Result:**
   - Return the modified digits array if any changes were made during the loop.
   - Otherwise, return the newly created `result` array.

### Complexity Analysis:
- **Time Complexity:** O(n)
  - Where `n` is the length of the digits array.
  - The algorithm involves a single pass through the array to handle the carry-over and potential modifications.
- **Space Complexity:** O(n)
  - In the worst-case scenario, when all digits are 9, the algorithm creates a new array `result` of length `n + 1`.
