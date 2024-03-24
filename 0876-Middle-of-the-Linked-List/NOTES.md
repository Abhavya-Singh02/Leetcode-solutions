### Algorithm:
1. **Initialize Two Pointers:**
   - Initialize two pointers, `fast` and `slow`, both initially pointing to the head of the linked list.

2. **Move Pointers:**
   - Traverse the linked list using the `fast` pointer which moves two steps at a time, and the `slow` pointer which moves one step at a time.
   - While traversing, `fast` moves twice as fast as `slow`.

3. **Find Middle Node:**
   - When the `fast` pointer reaches the end of the list (`null`), the `slow` pointer will be at the middle node of the list.
   - If the number of nodes in the list is even, the `slow` pointer will be pointing to the second middle node.

4. **Return Middle Node:**
   - Return the node pointed to by the `slow` pointer as the middle node.

### Complexity Analysis:
- **Time Complexity:** O(n)
  - Where `n` is the number of nodes in the linked list.
  - Both pointers traverse the list once, but the `fast` pointer moves twice as fast as the `slow` pointer.
- **Space Complexity:** O(1)
  - Constant space is used as only a few variables (`fast` and `slow`) are maintained.
