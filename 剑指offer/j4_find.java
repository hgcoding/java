package Solution.剑指offer;

/**
 * Author: HK
 * Date:2018/12/6 16:36@Description:
 **/
public class j4_find {
    public static boolean Find1(int target, int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0)
            return false;
        int row=matrix.length;
        int col=matrix[0].length;
        int r=0;int c=col-1;
        while(r<row&&c>=0){
            if(target==matrix[r][c]) {
                return true;
            }
            else if(target>matrix[r][c]){
                r++;
            }
            else
                c--;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] []a={{1,2,3,4},{2,5,6,7},{3,8,9,10},{4,11,12,13}};
        boolean b=Find1(12,a);
        System.out.println(b);
    }
}
