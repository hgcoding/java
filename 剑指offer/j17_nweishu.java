package Solution.剑指offer;

/**
 * Author: HK
 * Date:2018/12/20 12:07@Description:
 **/
public class j17_nweishu {
    public void print1ToMaxOfNDigits(int n) {
        if (n <= 0)
            return;
        char[] number = new char[n];
        print1ToMaxOfNDigits(number, 0);
    }

//实现全排列，多重循环，终止于digit == number.length，number[0]表示最高位的数字；001、002到999
    private void print1ToMaxOfNDigits(char[] number, int digit) {
        if (digit == number.length) {
            printNumber(number);
            return;
        }
        for (int i = 0; i < 10; i++) {
            number[digit] = (char) (i + '0');
            print1ToMaxOfNDigits(number, digit + 1);
        }
    }

    private void printNumber(char[] number) {
        int index = 0;
        while (index < number.length && number[index] == '0')
            index++;//当高位为0时可以不输出，否则输出001,002到999；
        while (index < number.length){
            System.out.print(number[index++]);
        }
        System.out.println();
}

    public static void main(String[] args) {
        j17_nweishu a=new j17_nweishu();
        a.print1ToMaxOfNDigits(2);

    }
}
