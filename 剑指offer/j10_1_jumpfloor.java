package Solution.剑指offer;

/**
 * Author: HK
 * Date:2018/12/17 16:44@Description:
 **/
public class j10_1_jumpfloor {
    public int jumpfloor(int n) {
        if (n <= 2) return n;
        int jump1 = 1, jump2 = 2, result = 0;
        for (int i = 2; i <= n; i++) {
            result = jump1 + jump2;
            jump1 = jump2;
            jump2 = result;

        }
        return result;
    }

    public void greet() {

    }


}
