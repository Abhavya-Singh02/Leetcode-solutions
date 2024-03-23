### Algorithm:
1. **Initialize Two Pointers:**
   - Initialize a pointer `j` to keep track of the index where non-`val` elements should be placed.

2. **Iterate Through the Array:**
   - Using a for loop, iterate through the array starting from index 0 (`i`).
   
3. **Check for Target Value:**
   - Check if the element at index `i` is not equal to the target value `val`.
   
4. **Remove Elements:**
   - If `nums[i]` is not equal to `val`, it means a non-`val` element is found.
   - Assign the value of `nums[i]` to `nums[j]` and increment `j` to move to the next position where a non-`val` element should be placed.

5. **Return Length of Modified Array:**
   - After the loop completes, the variable `j` represents the index of the last non-`val` element in the modified array.
   - Return `j` to indicate the length of the modified array (as indices are zero-based).

### Complexity Analysis:
- **Time Complexity:** O(n)
  - The algorithm iterates through the array once.
- **Space Complexity:** O(1)
  - Constant space is used as only a few variables (`i` and `j`) are maintained.

