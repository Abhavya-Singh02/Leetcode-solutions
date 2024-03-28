# 143. [Reorder List](https://leetcode.com/problems/reorder-list/description/)
<h3>Medium</h3><hr>

You are given the head of a singly linked-list. The list can be represented as:

<pre>L0 → L1 → … → Ln - 1 → Ln</pre>

Reorder the list to be on the following form:

<pre>L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …</pre>

You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 

**Example 1:**

<img src=https://assets.leetcode.com/uploads/2021/03/04/reorder1linked-list.jpg>

<br><pre><strong>Input:</strong> head = [1,2,3,4]
<strong>Output:</strong> [1,4,2,3]</pre>

**Example 2:**

<img src=https://assets.leetcode.com/uploads/2021/03/09/reorder2-linked-list.jpg>

<br><pre><strong>Input:</strong> head = [1,2,3,4,5]
<strong>Output:</strong> [1,5,2,4,3]</pre>

**Constraints:**

* The number of nodes in the list is in the range <code>[1, 5 * 10<sup>4</sup>]</code>.
* <code>1 &lt;= Node.val &lt;= 1000</code>
 