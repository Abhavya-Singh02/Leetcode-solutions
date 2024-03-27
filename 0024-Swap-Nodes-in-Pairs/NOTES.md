### Algorithm:
1. **Handle Base Cases:**
   - Check if the given head is null or contains only one node. If so, return the head as no swaps are needed.

2. **Initialize Variables:**
   - Declare a new node `dummy` as the dummy node, and set its next pointer to the head of the list.
   - Initialize a pointer `prev` to keep track of the node before the current pair of nodes.

3. **Swap Pairs:**
   - Iterate through the list while there are at least two nodes left to swap.
   - Within each iteration:
     - Store the first and second nodes of the current pair as `first` and `second`.
     - Swap the nodes by adjusting the next pointers:
       - Set `prev.next` to `second`.
       - Set `first.next` to `second.next`.
       - Set `second.next` to `first`.
   - Update `prev` to the first node of the next pair.
   - Move `head` to the next pair of nodes.

4. **Return Modified List:**
   - Return the `next` pointer of the dummy node, which now points to the head of the modified list.

### Complexity Analysis:
- **Time Complexity:** O(n)
  - Where `n` is the number of nodes in the linked list.
  - The algorithm traverses each node of the list once.
- **Space Complexity:** O(1)
  - Constant space is used as only a few pointers (`dummy`, `prev`, `first`, `second`) are maintained.

