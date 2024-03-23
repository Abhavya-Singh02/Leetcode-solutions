# 9. [Palindrome Number](https://leetcode.com/problems/palindrome-number/description/)
<h3>Easy</h3> <hr>
Given an integer <code>x</code>, return <code>true</code> if <code>x</code> is a 
<span style="color: blue;"><em><strong>Palindrome</strong></em></span>
, and <code>false</code> otherwise.


**Example 1:**

<pre><strong>Input:</strong> x = 121
<strong>Output:</strong> true
<strong>Explanation:</strong> 121 reads as 121 from left to right and from right to left.</pre>

**Example 2:**

<pre><strong>Input:</strong> x = -121
<strong>Output:</strong> false
<strong>Explanation:</strong> From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.</pre>

**Example 3:**

<pre><strong>Input:</strong> x = 10
<strong>Output:</strong> false
<strong>Explanation:</strong> Reads 01 from right to left. Therefore it is not a palindrome.</pre>
 

**Constraints:**

<ul>
<li><code>-2<sup>31</sup> &lt;= x &lt;= 2<sup>31</sup> - 1</code></li>

</ul> 

**Follow up:** Could you solve it without converting the integer to a string?