package Solution.剑指offer;

/**
 * Author: HK
 * Date:2018/12/20 14:54@Description:
 **/
public class j17_1nweishu {
    public static void printn(int n){
        if(n<1)
            return;
        char [] number=new char[n];
        printn1(number,0);
    }

    private static void printn1(char[] number, int digtal) {
        if (digtal == number.length - 1) {
            printn2(number);
            return;
        }
        for (int i = 0; i < 10; i++) {
            number[digtal] = (char) (i + '0');
            printn1(number, digtal + 1);
        }
    }
    private static void printn2 ( char[] number){
            int index = 0;
            if (index < number.length && number[index] == 0) {
                index++;
            }
            while (index < number.length) {
                System.out.print(number[index++]);
            }
            System.out.println();
    }

    public static void main(String[] args) {
        j17_1nweishu.printn(3);

    }
}
