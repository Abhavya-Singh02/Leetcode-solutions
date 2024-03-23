# 28. Find the Index of the First Occurence in a String
<h3>Easy</h3><hr>

Given two strings <code>needle</code> and `haystack`, return the index of the first occurrence of `needle` in `haystack`, or `-1` if <code>needle</code> is not part of <code>haystack</code>.

 

**Example 1:**

<pre><strong>Input:</strong> haystack = "sadbutsad", needle = "sad"
<strong>Output:</strong> 0
<strong>Explanation:</strong> "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.</pre>

**Example 2:**

<pre><strong>Input:</strong> haystack = "leetcode", needle = "leeto"
<strong>Output:</strong> -1
<strong>Explanation:</strong> "leeto" did not occur in "leetcode", so we return -1.</pre>
 

<strong>Constraints:</strong>

<ul>
<li><code>1 &lt;= haystack.length, needle.length &lt;= 10<sup>4</sup></code></li>
<li><code>haystack</code> and <code>needle</code> consist of only lowercase English characters.</li>
</ul>