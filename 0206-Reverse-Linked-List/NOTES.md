### Algorithm:
1. **Initialize Pointers:**
   - Initialize two pointers, `prev` and `currNode`, both initially set to null and the head of the linked list respectively.

2. **Reverse Iteration:**
   - Use a while loop to traverse the linked list:
     - Within each iteration:
       - Store the reference to the next node of `currNode` in a temporary variable `nextNode`.
       - Update the `next` pointer of `currNode` to point to the `prev` node, effectively reversing the link.
       - Move `prev` to `currNode` and `currNode` to `nextNode` for the next iteration.

3. **Return Result:**
   - After the loop completes, `prev` will be pointing to the new head of the reversed list.
   - Return `prev`, which is now the head of the reversed list.

### Complexity Analysis:
- **Time Complexity:** O(n)
  - Where `n` is the number of nodes in the linked list.
  - The algorithm traverses the entire list once, reversing the links.
- **Space Complexity:** O(1)
  - Constant space is used as only a few variables (`prev`, `currNode`, and `nextNode`) are maintained.

