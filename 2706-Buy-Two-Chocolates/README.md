# 2706. [Buy Two Chocolates](https://leetcode.com/problems/buy-two-chocolates/description/)
<h3>Easy</h3>

You are given an integer array <code>prices</code> representing the <code>prices</code> of various chocolates in a store. You are also given a single integer money, which represents your initial amount of money.

You must buy <strong>exactly</strong> two chocolates in such a way that you still have some <strong>non-negative</strong> leftover money. You would like to minimize the sum of the prices of the two chocolates you buy.

Return <em>the amount of money you will have leftover after buying the two chocolates.</em> If there is no way for you to buy two chocolates without ending up in debt, return <code>money.</code> Note that the leftover must be non-negative.

 

**Example 1:**

<pre><strong>Input:</strong> prices = [1,2,2], money = 3
<strong>Output:</strong> 0
<strong>Explanation:</strong> Purchase the chocolates priced at 1 and 2 units respectively. You will have 3 - 3 = 0 units of money afterwards. Thus, we return 0.</pre>
**Example 2:**

<pre><strong>Input:</strong> prices = [3,2,3], money = 3
<strong>Output:</strong> 3
<strong>Explanation:</strong> You cannot buy 2 chocolates without going in debt, so we return 3.</pre>
 

Constraints:
<ul>
<li><code>2 &lt;= prices.length <= 50</code></li>
<li><code>1 &lt;= prices[i] <= 100</code></li>
<li><code>1 &lt;= money <= 100</code></li>