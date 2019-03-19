package Solution.剑指offer;

/**
 * Author: HK
 * Date:2019/2/25 10:10@Description:
 **/
public class j1_find2dArray {

    public static boolean find(int target,int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0)
            return false;
        int row = array.length, col = array[0].length;
        int r = 0, c = col - 1;
        while (r < row && c >= 0) {
            if (target == array[r][c])
                return true;
            else if (target > array[r][c])
                r++;
            else c--;
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] a={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(find(9,a));
    }

}
