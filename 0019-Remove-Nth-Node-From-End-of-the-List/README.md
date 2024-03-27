# 19. [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/)
<h3>Medium</h3><hr>

Given the `head` of a linked list, remove the `nth` node from the end of the list and return its head.

 

**Example 1:**

<img src=https://assets.leetcode.com/uploads/2020/10/03/remove_ex1.jpg>

<pre><strong>Input:</strong> head = [1,2,3,4,5], n = 2
<strong>Output:</strong> [1,2,3,5]</pre>
**Example 2:**

<pre><strong>Input:</strong> head = [1], n = 1
<strong>Output:</strong> []</pre>
**Example 3:**

<pre><strong>Input:</strong> head = [1,2], n = 1
<strong>Output:</strong> [1]</pre>
 

**Constraints:**

* The number of nodes in the list is `sz`.
* <code>1 &lt;= sz &lt;= 30</code>
* <code>0 &lt;= Node.val &lt;= 100</code>
* <code>1 &lt;= n &lt;= sz</code>
 

**Follow up:** Could you do this in one pass?