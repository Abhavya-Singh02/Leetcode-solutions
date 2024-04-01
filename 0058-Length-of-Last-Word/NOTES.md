### Algorithm:
1. **Iterate from the End:**
   - Iterate through the string `s` starting from the end (`s.length() - 1` index).

2. **Find the Start of Last Word:**
   - While iterating, find the index `first` where the last word begins.
   - The last word starts where there is a non-space character followed by a space character.

3. **Extract Last Word and Compute Length:**
   - Extract the last word substring from index `first` to the end of the string using `substring`.
   - Trim any leading or trailing spaces from the extracted substring.
   - Return the length of the trimmed last word.

### Complexity Analysis:
- **Time Complexity:** O(n)
  - Where `n` is the length of the input string `s`.
  - The algorithm traverses the string once to find the start of the last word and once to extract and compute its length.
- **Space Complexity:** O(1)
  - Constant space is used as only a few variables (`first`, `temp`) are maintained.

