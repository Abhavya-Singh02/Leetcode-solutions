class Solution {
    public int buyChoco(int[] prices, int money) {
        int firstMinunit = Integer.MAX_VALUE;
        int secondMinunit = Integer.MAX_VALUE;

        for(int i : prices){
            if(i<firstMinunit){
                secondMinunit = firstMinunit;
                firstMinunit = i;
            } else {
                secondMinunit = Math.min(secondMinunit, i);
            }
        }
        int leftover  = money - (firstMinunit+secondMinunit);
        return leftover >=0 ? leftover : money;
    }
}