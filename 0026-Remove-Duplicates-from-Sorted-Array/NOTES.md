### Algorithm:
1. **Initialize Two Pointers:**
   - Initialize a pointer `i` to keep track of the index where non-duplicate elements should be placed.
   - Start another pointer `j` from index 1 to traverse the array.

2. **Iterate Through the Array:**
   - Using a for loop, iterate through the array starting from index 1 (`j`).
   
3. **Check for Duplicates:**
   - Compare the element at index `j` with the element at index `i`.
   - If `nums[i]` is not equal to `nums[j]`, it means a new non-duplicate element is found.
   
4. **Remove Duplicates:**
   - Increment `i` to move to the next position where the non-duplicate element should be placed.
   - Assign the value of `nums[j]` to `nums[i]`, effectively removing duplicates by overwriting them with non-duplicate elements.

5. **Return Length of Modified Array:**
   - After the loop completes, the variable `i` represents the index of the last non-duplicate element in the modified array.
   - Return `i + 1` to indicate the length of the modified array (as indices are zero-based).

### Complexity Analysis:
- **Time Complexity:** O(n)
  - The algorithm iterates through the array once.
- **Space Complexity:** O(1)
  - Constant space is used as only a few variables (`i` and `j`) are maintained.
