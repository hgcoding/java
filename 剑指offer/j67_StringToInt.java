package Solution.剑指offer;

/**
 * Author: HK
 * Date:2018/11/30 9:50@Description:
 *字符转整型，字符串不是一个合法的数值则返回 0，要求不能使用字符串转换整数的库函数；
 * 考虑越界
 **/
public class j67_StringToInt {
    public static void main(String[] args) {
        System.out.println(StrToInt("111111111111131"));
    }
    public static int StrToInt(String str) {
        if (str == null || str.length() == 0)
            return 0;
        boolean isNegative = str.charAt(0) == '-';//charAt()返回指定索引位置的char值
        long ret = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == 0 && (c == '+' || c == '-'))  /* 符号判定 */
                continue;
            if (c < '0' || c > '9')                /* 非法输入 */
                return 0;
            ret = ret * 10 + (c - '0');
        }
        long result = isNegative ? -ret : ret;
        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return (int)result;
    }
}

