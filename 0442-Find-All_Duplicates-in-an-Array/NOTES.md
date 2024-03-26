### Algorithm:
1. **Initialize List and Iterate Through Array:**
   - Initialize an empty list `ans` to store the duplicate elements.
   - Iterate through each element of the array `nums`.

2. **Check and Mark Elements:**
   - For each element `nums[i]`, obtain its absolute value `x` to handle negative numbers.
   - Check if the element at index `x - 1` (adjusted for 0-based indexing) is negative:
     - If it is negative, it means `x` has appeared before. Add `x` to the `ans` list.
     - If it is positive, mark the element at index `x - 1` as negative by multiplying it by -1.

3. **Return Duplicates:**
   - After iterating through all elements, the `ans` list contains all the duplicates found in the array.
   - Return the `ans` list containing duplicate elements.

### Complexity Analysis:
- **Time Complexity:** O(n)
  - Where `n` is the number of elements in the array `nums`.
  - The algorithm iterates through each element of the array once.
- **Space Complexity:** O(1)
  - Constant space is used for variables (`ans`, `n`, `i`, and `x`) and the returned list contains at most `n/2` duplicate elements.
