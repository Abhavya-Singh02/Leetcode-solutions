### Algorithm:
1. **Initialize a HashSet:**
   - Create a HashSet named `set` to store unique elements encountered while iterating through the array `nums`.

2. **Iterate Through the Array:**
   - Use a for loop to iterate through each element of the array `nums`.

3. **Check for Duplicates:**
   - Within each iteration, check if the current element `nums[i]` is already present in the `set`.
   - If it is, return `nums[i]` as it indicates the duplicate element found.
   - If not, add the current element to the `set` to track unique elements encountered so far.

4. **Handle Edge Cases:**
   - If no duplicate is found after iterating through the entire array, return -1 to indicate that there is no duplicate in the array.

### Complexity Analysis:
- **Time Complexity:** O(n)
  - Where `n` is the length of the array `nums`.
  - The algorithm involves iterating through each element of the array once and performing constant-time operations for HashSet lookup and insertion.
- **Space Complexity:** O(n)
  - In the worst-case scenario, when there are no duplicates, the HashSet `set` will store all unique elements of the array.

