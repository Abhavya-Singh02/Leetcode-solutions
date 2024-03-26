# 442. [Find All Duplicates in an Array](https://leetcode.com/problems/find-all-duplicates-in-an-array/description/?envType=daily-question&envId=2024-03-25)
<h3>Medium</h3><hr>

Given an integer array `nums` of length `n` where all the integers of `nums` are in the range `[1, n]` and each integer appears **once** or **twice**, return <em>an array of all the integers that appears **twice**.</em>

You must write an algorithm that runs in `O(n)` time and uses only constant extra space.

 

**Example 1:**

<pre><strong>Input:</strong> nums = [4,3,2,7,8,2,3,1]
<strong>Output:</strong> [2,3]</pre>
**Example 2:**

<pre><strong>Input:</strong> nums = [1,1,2]
<strong>Output:</strong> [1]</pre>
**Example 3:**

<pre><strong>Input:</strong> nums = [1]
<strong>Output:</strong> []</pre>
 

**Constraints:**

* <code>n == nums.length</code>
* <code>1 &lt.= n &lt;= 105</code>
* 1 <code>&lt;= nums[i] &lt;= n</code>
* Each element in `nums` appears **once** or **twice.**