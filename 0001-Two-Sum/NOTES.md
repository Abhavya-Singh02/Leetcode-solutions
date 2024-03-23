## Algorithm:

1. *Initialize Array:*
   - Initialize an array ans of size 2 to store the indices of the two numbers.
   
2. *Set Default Indices:*
   - Set both elements of ans to -1 initially, indicating no valid indices found yet.
   
3. *Nested Loop:*
   - Iterate through each element of the array nums using the outer loop.
   - For each element at index i, iterate through the remaining elements starting from index i + 1 using the inner loop.
   
4. *Check Sum:*
   - Check if the sum of the current element nums[i] and the element at index j equals the target.
   - If yes, update the indices in the ans array with i and j and return ans.
   
5. *Return Default Indices:*
   - If no such pair is found, return ans containing default values (-1, -1).

## Complexity Analysis:

- *Time Complexity:* O(n^2)
  - The nested loop iterates through each element, resulting in quadratic time complexity.
  
- *Space Complexity:* O(1)
  - Constant space is used except for the array ans, which has fixed size.