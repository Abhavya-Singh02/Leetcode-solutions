# 977. [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/description/)
<h3>Easy</h3><hr>

Given an integer array `nums` sorted in **non-decreasing order**, return <em>an array of <strong>the squares of each number</em> sorted in non-decreasing order.</em>

 

**Example 1:**

<pre><strong>Input:</strong> nums = [-4,-1,0,3,10]
<strong>Output:</strong> [0,1,9,16,100]
<strong>Explanation:</strong> After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].</pre>
**Example 2:**

<pre><strong>Input:</strong> nums = [-7,-3,2,3,11]
<strong>Output:</strong> [4,9,9,49,121]</pre>
 

**Constraints:**

<ul>
<li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
<li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
<li><code>nums</code> is sorted in <strong>non-decreasing</strong> order.</li>
</ul> 

**Follow up:** Squaring each element and sorting the new array is very trivial, could you find an `O(n)` solution using a different approach?