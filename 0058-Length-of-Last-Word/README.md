# 58. [Length of the Last Word](https://leetcode.com/problems/length-of-last-word/description/?envType=daily-question&envId=2024-04-01)
<h3>Easy</h3><hr>

Given a string `s` consisting of words and spaces, return <em>the length of the <strong>last</strong> word in the string.</em>

A **word** is a maximal 
<span style='color:blue'>substring</span>
 consisting of non-space characters only.

 

**Example 1:**

<pre><strong>Input:</strong> s = "Hello World"
<strong>Output:</strong> 5
<strong>Explanation:</strong> The last word is "World" with length 5.</pre>

**Example 2:**

<pre><strong>Input:</strong> s = "   fly me   to   the moon  "
<strong>Output:</strong> 4
<strong>Explanation:</strong> The last word is "moon" with length 4.</pre>
**Example 3:**

<pre><strong>Input:</strong> s = "luffy is still joyboy"
<strong>Output:</strong> 6
<strong>Explanation:</strong> The last word is "joyboy" with length 6.</pre>
 

**Constraints:**

* <code>1 &lt;= s.length &lt;= 10<sup>4</sup</code>
* `s` consists of only English letters and spaces `' '`.
* There will be at least one word in `s`.