### Algorithm:
1. **XOR Operation:**
   - Utilize the property of the XOR (Exclusive OR) operation where XORing a number with itself results in 0.
   - XOR all the elements of the array to find the single number that appears only once.

2. **Iterative XOR:**
   - Initialize a variable `xorr` to store the result of XOR operations.
   - Iterate through each element of the array and XOR it with the current value of `xorr`.
   - At the end of the loop, `xorr` will contain the XOR of all elements of the array.

3. **Return Result:**
   - Return the final value of `xorr`, which represents the single number in the array.

### Complexity Analysis:
- **Time Complexity:** O(n)
  - Where `n` is the length of the array `nums`.
  - The algorithm iterates through each element of the array once to perform XOR operations.
- **Space Complexity:** O(1)
  - Constant space is used as only a few variables (`xorr` and `i`) are maintained.
