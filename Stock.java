// Java Program to solve stock buy and sell by  
// exploring all possible pairs

class Stock {

    static int maxProfit(int[] prices) {
        int n = prices.length;
        int res = 0;
        //result

        // Explore all possible ways to buy and sell stock
        //i<n-1 instead of i<n bcz no extra iteration
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                res = Math.max(res, prices[j] - prices[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
    }
}
