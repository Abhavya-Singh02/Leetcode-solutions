# 125. [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/description/)
<h3>Easy</h3><hr>

A phrase is a **palindrome** if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` <em>if it is a **palindrome**, or</em> `false` <em>otherwise</em>.

 

**Example 1:**

<pre><strong>Input:</strong> s = "A man, a plan, a canal: Panama"
<strong>Output:</strong> true
<strong>Explanation:</strong> "amanaplanacanalpanama" is a palindrome.</pre>
**Example 2:**

<pre><strong>Input:</strong> s = "race a car"
<strong>Output:</strong> false
<strong>Explanation:</strong> "raceacar" is not a palindrome.</pre>
**Example 3:**

<pre><strong>Input:</strong> s = " "
<strong>Output:</strong> true
<strong>Explanation:</strong> s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.</pre>
 

**Constraints:**

<ul>
<li><code>1 &lt;= s.length &lt;= 2 * 10<sup>5</sup></code</li>
<li><code>s</code> consists only of printable ASCII characters.</li>