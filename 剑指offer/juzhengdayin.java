package Solution.剑指offer;

/**
 * Author: HK
 * Date:2018/11/23 10:34@Description:
 **/
import java.util.ArrayList;
public class juzhengdayin {
    public ArrayList<Integer> printMatrix(int [][] array) {
        ArrayList<Integer> result = new ArrayList<Integer> ();
        if(array.length==0) return result;
        int row = array.length;
        int colu = array[0].length;
        if(colu==0) return result;
        int layers = (Math.min(row,colu)-1)/2+1;//这个是层数  (旋转圈数，4*4是2圈，5*4是2圈)
        for(int i=0;i<layers;i++){
            for(int k = i;k<colu-i;k++) {result.add(array[i][k]);}//左至右，列数增加
            for(int j=i+1;j<row-i;j++) { result.add(array[j][colu-1-i]);}//右上至右下，行数加
            for(int k=colu-i-2 ;(k>=i)&&(row-1-i!=i) ;k--) { result.add(array[row-1-i][k]);}
            //右至左,从[(n-1)-i]行的[(m-2)-i]开始,第一次是colu的倒数第二列，row-1-i!=i
            for(int j=row-2-i;(j>i)&&(colu-1-i!=i) ; j--){ result.add(array[j][i]);}
            //左下至左上
        }
        return result;
    }
}
