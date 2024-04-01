class Solution {
    public int lengthOfLastWord(String s) {
        int first =0;
        for(int i = s.length()-1; i>0; i--){
            if(s.charAt(i)!= ' ' && s.charAt(i-1)== ' '){
                first = i;
                break;
            }

        }
        String temp = s.substring(first).trim();
        return temp.length();
    }
}