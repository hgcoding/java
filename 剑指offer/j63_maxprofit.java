package Solution.剑指offer;

/**
 * Author: HK
 * Date:2018/11/30 11:08@Description:
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可获得的最大利润
 * 例如，一只股票在某些时间节点的价格为{9,11,8,5,7,12,16,14},
 * 如果我们能在价格为5的时候买入并在价格为16时卖出，则能获得最大的利润为11
 **/
public class j63_maxprofit {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{0,2,3,5,4,3,6}));
    }
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        int soFarMin = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            soFarMin = Math.min(soFarMin, prices[i]);//找出最小值
            maxProfit = Math.max(maxProfit, prices[i] - soFarMin);
        }
        return maxProfit;
    }
}
