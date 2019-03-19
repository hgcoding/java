package Solution.剑指offer;

/**
 * Author: HK
 * Date:2018/11/30 10:55@Description:
 *
 **/
public class j64_sum {
    //条件与 && 具有短路原则，即在第一个条件语句为 false 的情况下不会去执行第二个条件语句
    public static void main(String[] args) {

    }
    public static int Sum_Solution(int n) {
        int sum = n;
        boolean b = (n > 0) && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;
    }
}
