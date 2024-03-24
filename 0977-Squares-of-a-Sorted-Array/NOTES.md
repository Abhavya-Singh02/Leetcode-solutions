### Algorithm:
1. **Square Each Element:**
   - Iterate through each element of the input array `nums`.
   - Square each element by multiplying it with itself (`nums[i] * nums[i]`).
   - Update the corresponding element in `nums` with its square.

2. **Sort the Squares:**
   - After squaring all elements, use the `Arrays.sort()` method to sort the array `nums` in non-decreasing order.

3. **Return Result:**
   - Return the sorted array `nums` containing squares of the elements.

### Complexity Analysis:
- **Time Complexity:** O(n log n)
  - Where `n` is the length of the array `nums`.
  - The algorithm involves two main operations: iterating through each element to square it (O(n)), and sorting the array (O(n log n)).
- **Space Complexity:** O(1)
  - Constant space is used as only a few variables (`i`) are maintained, and the result is returned in the input array itself.
