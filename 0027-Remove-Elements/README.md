# 27. [Remove Element](https://leetcode.com/problems/remove-element/description/)
<h3>Easy</h3><hr>
Given an integer array <code>nums</code> and an integer <code>val,</code> remove all occurrences of <code>val</code> in <code>nums</code> <span style="color: blue"><strong>in-place</strong></span>. The order of the elements may be changed. Then return <em>the number of elements in</em> <code>nums</code> <em>which are not equal to</em> <code>val</code>.

Consider the number of elements in <code>nums</code> which are not equal to <code>val</code> be <code>k</code>, to get accepted, you need to do the following things:

<ul>
<li>Change the array <code>nums</code> such that the first <code>k</code> elements of nums contain the elements which are not equal to <code>val</code>. The remaining elements of <code>nums</code> are not important as well as the size of <code>nums</code>.</li>
<li>Return <code>k</code>.</li>
</ul>
<strong>Custom Judge:</strong>

The judge will test your solution with the following code:

~~~int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
~~~
If all assertions pass, then your solution will be accepted.

 

**Example 1:**

<pre><strong>Input:</strong> nums = [3,2,2,3], val = 3
<strong>Output:</strong> 2, nums = [2,2,_,_]
<strong>Explanation:</strong> Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).</pre>
**Example 2:**

<pre><strong>Input:</strong> nums = [0,1,2,2,3,0,4,2], val = 2
<strong>Output:</strong> 5, nums = [0,1,4,0,3,_,_,_]
<strong>Explanation:</strong> Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).</pre>
 

**Constraints:**

<ul>
<li>0 &lt;= nums.length &lt;= 100</li>
<li>0 &lt;= nums[i] &lt;= 50</li>
<li>0 &lt;= val &lt;= 100</li>
