# 287. [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/description/)
<h3>Medium</h3><hr>


Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive.

There is only **one repeated number** in `nums`, return this repeated number.

You must solve the problem **without** modifying the array `nums` and uses only constant extra space.

 

**Example 1:**

<pre><strong>Input:</strong> nums = [1,3,4,2,2]
<strong>Output:</strong> 2</pre>
**Example 2:**

<pre><strong>Input:</strong> nums = [3,1,3,4,2]
<strong>Output:</strong> 3</pre>
**Example 3:**

<pre><strong>Input:</strong> nums = [3,3,3,3,3]
<strong>Output:</strong> 3</pre>
 

**Constraints:**

<ul>
<li><code>1 &lt;= n &lt;= 10<sup>5</sup></code></li>
<li><code>nums.length == n + 1</code></li>
<li><code>1 &lt;= nums[i] &lt;= n</code></li>
<li>All the integers in <code>nums</code> appear only <strong>once</strong> except for <strong>precisely one integer which appears two or more</strong> times.</li>
</ul>

**Follow up:**

<ul>
<li>How can we prove that at least one duplicate number must exist in <code>nums?</code></li>
<li>Can you solve the problem in linear runtime complexity?</li>
</ul>