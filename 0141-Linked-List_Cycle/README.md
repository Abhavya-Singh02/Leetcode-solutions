# 141. [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/description/)
<h3>Easy</h3><hr>

Given `head`, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the `next` pointer. Internally, `pos` is used to denote the index of the node that tail's `next` pointer is connected to. **Note that `pos` is not passed as a parameter**.

Return `true` <em>if there is a cycle in the linked list</em>. Otherwise, return `false`.

 

**Example 1:** <br>
<img src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist.png">

<pre><strong>Input:</strong> head = [3,2,0,-4], pos = 1
<strong>Output:</strong> true
<strong>Explanation:</strong> There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).</pre>

**Example 2:**

<img src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test2.png"><br>


<pre><strong>Input:</strong> head = [1,2], pos = 0
<strong>Output:</strong> true
<strong>Explanation:</strong> There is a cycle in the linked list, where the tail connects to the 0th node.</pre>

**Example 3:**

<img src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test3.png"> <br>

<pre><strong>Input:</strong> head = [1], pos = -1
<strong>Output:</strong> false
<strong>Explanation:</strong> There is no cycle in the linked list.</pre>

**Constraints:**

<ul>
<li>The number of the nodes in the list is in the range <code>[0, 10<sup>4</sup>].</code></li>
<li><code>-10<sup>5</sup> &lt;= Node.val &lt;= 10<sup>5</sup></code></li>    
<li><code>pos</code> is <code>-1</code> or a <strong>valid index</strong> in the linked-list.</li>
</ul>
 



