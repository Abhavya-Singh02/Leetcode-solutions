# 66. [Plus One](https://leetcode.com/problems/plus-one/description/)
<h3>Easy</h3><hr>

You are given a **large integer** represented as an integer array <code>digits</code>, where each `digits[i]` is the `ith` digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading `0`'s.

Increment the large integer by one and return the resulting array of digits.

 

**Example 1:**

<pre><strong>Input:</strong> digits = [1,2,3]
<strong>Output:</strong> [1,2,4]
<strong>Explanation:</strong> The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].</pre>
**Example 2:**

<pre><strong>Input:</strong> digits = [4,3,2,1]
<strong>Output:</strong> [4,3,2,2]
<strong>Explanation:</strong> The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].</pre>
**Example 3:**

<pre><strong>Input:</strong> digits = [9]
<strong>Output:</strong> [1,0]
<strong>Explanation:</strong> The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].</pre>
 

**Constraints:**

<ul>
<li><code>1 &lt;= digits.length &lt;= 100</code></li>
<li><code>0 &lt;= digits[i] &lt;= 9</code></li>
<li><code>digits</code> does not contain any leading <code>0</code>'s.
</ul>