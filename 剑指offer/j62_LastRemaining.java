package Solution.剑指offer;

import java.util.ArrayList;

/**
 * Author: HK
 * Date:2018/11/30 16:25@Description:
 * 有个游戏是这样的:首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。
 * 每次喊到m-1的那个小朋友要出列并且不再回到圈中,从他的下一个小朋友开始,继续0…m-1报数….
 * 这样下去….直到剩下最后一个小朋友,求最后一个小朋友的编号
 * (注：小朋友的编号是从0到n-1)
 *
 * 约瑟夫环的公式是：
 * f(n, m) = 0           (n = 1)
 * f(n, m) = [f(n-1, m) +m] % n  (n > 1)
 **/
public class j62_LastRemaining {
    public int LastRemaining_Solution(int n, int m) {
        if (n == 0)     /* 特殊输入的处理 */
            return -1;
        if (n == 1)     /* 递归返回条件 */
            return 0;
        return (LastRemaining_Solution(n - 1, m) + m) % n;
    }


    public  int LastRemaining_Solution1(int n, int m) {
        if(n==0)
            return -1;
        ArrayList <Integer>  array=new ArrayList<>();
        for(int i=0;i<n;i++){
            array.add(i);
        }
        int tempIndex=(m-1)%array.size();//用于记录最初需清除的数字索引
        while(array.size()!=1){
            //System.out.println(array.get(tempIndex));
            array.remove(tempIndex);
            tempIndex=(tempIndex+(m-1))%array.size();//记录当前索引
        }
        return (int) array.get(0);
        //合并n=0的情况可以写成：return array.size()==1?array.get(0):-1    ;
    }
}
