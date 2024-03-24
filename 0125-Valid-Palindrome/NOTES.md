### Algorithm:
1. **Clean the String:**
   - Remove non-alphanumeric characters from the input string `s` using regular expression `[^a-zA-Z0-9]`.
   - Convert the cleaned string to lowercase to ensure case-insensitive comparison.

2. **Check Palindrome:**
   - Compare the cleaned string with its reversed version to check for palindrome property.
   - Use the `equals()` method to compare the cleaned string with its reversed counterpart obtained using the `reverseString` method.

3. **Reverse String Method:**
   - Implement a separate method `reverseString` to reverse the input string.
   - Iterate through the input string from the end to the beginning and append each character to a `StringBuilder` in reverse order.
   - Return the reversed string obtained from the `StringBuilder`.

4. **Return Result:**
   - Return `true` if the cleaned string is equal to its reversed version, indicating that the original string is a palindrome.
   - Return `false` otherwise.

### Complexity Analysis:
- **Time Complexity:** O(n)
  - Where `n` is the length of the input string `s`.
  - The algorithm involves a single pass through the string to clean it and another pass to reverse it.
- **Space Complexity:** O(n)
  - Additional space is used to store the cleaned string and the reversed string.

