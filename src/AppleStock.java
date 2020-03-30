public class AppleStock {

    public AppleStock() {
    }

    public  int getMaxProfit(int[] stockPrices) {

        // calculate the max profit


        int buy = stockPrices[0];
        int maxProfit = stockPrices[1] - buy; // this ques expects to sell at least loss as well

        for (int i=1;i<stockPrices.length;i++){
            if(stockPrices[i]<buy){
                buy = stockPrices[i];
            }
            else if(stockPrices[i]-buy > maxProfit){
                maxProfit = stockPrices[i] - buy;
            }
        }

        return maxProfit;
    }
}
