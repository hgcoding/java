package Solution.剑指offer;

/**
 * Author: HK
 * Date:2018/11/30 10:34@Description:
 * 不使用加减乘除求和
 **/
public class j65_add {
    public static void main(String[] args) {
        System.out.println(Add(3,2));
    }
    public static int Add(int a, int b) {
        return b == 0 ? a : Add(a ^ b, (a & b) << 1);
        //^相当于异或，11^10=01, 11&10=10, 10<<1=100;
        //01^100=101,  01&100=0000;101
    }
}
