class Solution {
    public int maxProfit(int[] prices) {
        //we need to compare ele and ele - 1 because if there is a profit we can keep on adding on the maxProfit variable 
        //Suppose [7,1,5,3,5,8]
        //Compare 5 and 1 maxProfit - 4
        //Next is 5 and 3 maxProfit - 4 + (5-3) = 6
        //Next is 8 and 5 maxProfit - 6 + (8-5) = 9
        //Here if we think that we can buy when price is 3 and sell when its 8 what
        //we are actually doing is if there is a profit in a day we are adding it directly to maxProfit in the form of maxProfit += (ele - (ele -1));
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                maxProfit+= (prices[i]-prices[i-1]);
            }
        }
        return maxProfit;
    }
}