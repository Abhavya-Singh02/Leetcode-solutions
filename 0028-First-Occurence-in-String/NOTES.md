### Algorithm:
1. **Check for Empty Needle:**
   - If the `needle` string is empty, return 0 immediately as the substring is found at the beginning of `haystack`.

2. **Iterate Through Haystack:**
   - Using a for loop, iterate through the `haystack` string from index 0 to `haystack.length() - needle.length()`.

3. **Compare Substrings:**
   - Within each iteration, use another for loop to compare characters of `haystack` starting from the current index (`i`) with characters of `needle`.
   - If any character mismatches, break out of the inner loop.
   - If all characters match until the end of `needle`, return the current index (`i`) as the starting index of the first occurrence of `needle` in `haystack`.

4. **Handle Edge Cases:**
   - If the inner loop completes without finding a mismatch, return -1 to indicate that `needle` is not found in `haystack`. 

### Complexity Analysis:
- **Time Complexity:** O(n*m)
  - Where `n` is the length of `haystack` and `m` is the length of `needle`.
  - The algorithm involves nested loops where the outer loop iterates over each character in `haystack`, and the inner loop iterates over each character in `needle`.
- **Space Complexity:** O(1)
  - Constant space is used as only a few variables (`i` and `j`) are maintained.